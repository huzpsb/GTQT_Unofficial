package keqing.gtqtcore.common.metatileentities.multi.multiblock.standard;

import codechicken.lib.raytracer.CuboidRayTraceResult;
import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.IOpticalComputationHatch;
import gregtech.api.capability.IOpticalComputationProvider;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.Widget;
import gregtech.api.gui.resources.TextureArea;
import gregtech.api.gui.widgets.ClickButtonWidget;
import gregtech.api.gui.widgets.WidgetGroup;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.IProgressBarMultiblock;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import keqing.gtqtcore.api.GTQTValue;
import keqing.gtqtcore.api.blocks.impl.WrappedIntTired;
import keqing.gtqtcore.api.capability.chemical_plant.ChemicalPlantProperties;
import keqing.gtqtcore.api.metaileentity.GTQTRecipeMapMultiblockController;
import keqing.gtqtcore.api.predicate.TiredTraceabilityPredicate;
import keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps;
import keqing.gtqtcore.api.recipes.properties.BRProperty;
import keqing.gtqtcore.api.utils.GTQTUtil;
import keqing.gtqtcore.client.textures.GTQTTextures;
import keqing.gtqtcore.common.block.GTQTMetaBlocks;
import keqing.gtqtcore.common.block.blocks.GTQTIsaCasing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

import java.util.List;
import java.util.Random;

import static gregtech.api.unification.material.Materials.*;
import static keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps.BIOLOGICAL_REACTION_RECIPES;

public class MetaTileEntityBiologicalReaction extends GTQTRecipeMapMultiblockController implements IProgressBarMultiblock {
    public MetaTileEntityBiologicalReaction(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, new RecipeMap[] {
                BIOLOGICAL_REACTION_RECIPES,
                RecipeMaps.FERMENTING_RECIPES,
                RecipeMaps.BREWING_RECIPES
        });
        this.recipeMapWorkable = new BiologicalReactionLogic(this);
    }
    private int glass_tier;
    private int clean_tier;
    private int tubeTier;
    int liquid=0;
    int bio=0;
    double rate=0;
    int updatetime=1;
    public boolean onScrewdriverClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, CuboidRayTraceResult hitResult) {
        if(updatetime<=19) updatetime++;
        else updatetime=1;
        playerIn.sendMessage(new TextComponentTranslation("输入频率：%s 次/tick",updatetime));
        return true;
    }
    @Override
    public int getNumProgressBars() {
        return 2;
    }
    @Override
    public double getFillPercentage(int index) {
        if(rate>2)
        return index == 0 ?  2 : bio / 2000.0;
        else
            return index == 0 ?  rate : bio / 2000.0;
    }
    @Override
    public TextureArea getProgressBarTexture(int index) {
        return GuiTextures.PROGRESS_BAR_LCE_FUEL;
    }
    @Override
    public void addBarHoverText(List<ITextComponent> hoverList, int index) {
        ITextComponent cwutInfo;
        if (index == 0) {
            cwutInfo = TextComponentUtil.stringWithColor(
                    TextFormatting.AQUA,
                    rate*100 + " / " + 100 + "R");
        } else {
            cwutInfo = TextComponentUtil.stringWithColor(
                    TextFormatting.AQUA,
                    bio + " / " + 3200 + " P");
        }
        hoverList.add(TextComponentUtil.translationWithColor(
                TextFormatting.GRAY,
                "gregtech.multiblock.pb.computation",
                cwutInfo));
    }
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        data.setInteger("liquid", liquid);
        data.setInteger("updatetime", updatetime);
        data.setInteger("bio", bio);
        data.setDouble("rate", rate);
        return super.writeToNBT(data);
    }
    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        liquid = data.getInteger("liquid");
        updatetime = data.getInteger("updatetime");
        bio = data.getInteger("bio");
        rate = data.getDouble("rate");
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityBiologicalReaction(metaTileEntityId);
    }

    @Override
    @Nonnull
    protected Widget getFlexButton(int x, int y, int width, int height) {
        WidgetGroup group = new WidgetGroup(x, y, width, height);
        group.addWidget(new ClickButtonWidget(0, 0, 18, 18, "", this::clear)
                .setButtonTexture(GuiTextures.BUTTON_THROTTLE_MINUS)
                .setTooltipText("我不要了！"));

        return group;
    }

    private void clear(Widget.ClickData clickData) {
        liquid=0;
        bio=0;
        rate=0;
    }
    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        Object glass_tier = context.get("LGLTiredStats");
        Object clean_tier = context.get("ZJTiredStats");
        Object tubeTier = context.get("ChemicalPlantTubeTiredStats");
        this.tubeTier = GTQTUtil.getOrDefault(() -> tubeTier instanceof WrappedIntTired,
                () -> ((WrappedIntTired)tubeTier).getIntTier(),
                0);
        this.glass_tier = GTQTUtil.getOrDefault(() -> glass_tier instanceof WrappedIntTired,
                () -> ((WrappedIntTired)glass_tier).getIntTier(),
                0);
        this.clean_tier = GTQTUtil.getOrDefault(() -> clean_tier instanceof WrappedIntTired,
                () -> ((WrappedIntTired)clean_tier).getIntTier(),
                0);
    }
    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("JCCCJ","JCCCJ", "GGGGG", "GGGGG", "CCCCC")
                .aisle("JCCCJ","JPPPJ", "G   G", "G   G", "CCCCC")
                .aisle("JCCCJ","JPPPJ", "G   G", "G   G", "CCCCC")
                .aisle("JCCCJ","JPPPJ", "G   G", "G   G", "CCCCC")
                .aisle("JCCCJ","JCSCJ", "GGGGG", "GGGGG", "CCCCC")
                .where('S', selfPredicate())
                .where('J', TiredTraceabilityPredicate.CP_ZJ_CASING)
                .where('G', TiredTraceabilityPredicate.CP_LGLASS)
                .where('C', states(getCasingState()).setMinGlobalLimited(38).or(autoAbilities()))
                .where('P', TiredTraceabilityPredicate.CP_TUBE)
                .where(' ', any())
                .build();
    }

    private static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.CLEAN_STAINLESS_STEEL_CASING;
    }
    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return GTQTTextures.ALGAE_FARM_OVERLAY;
    }
    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        super.addDisplayText(textList);

        if (getInputFluidInventory() != null) {
            FluidStack STACK = getInputFluidInventory().drain(Water.getFluid(Integer.MAX_VALUE), false);
            int liquidOxygenAmount = STACK == null ? 0 : STACK.amount;
            textList.add(new TextComponentTranslation("gtqtcore.multiblock.br.amount", TextFormattingUtil.formatNumbers((liquidOxygenAmount))));
        }
        textList.add(new TextComponentTranslation("gtqtcore.multiblock.br.1",liquid,bio,rate));
        textList.add(new TextComponentTranslation("gtqtcore.multiblock.br.3",glass_tier,tubeTier,updatetime));
        if(rate>100)
            textList.add(new TextComponentTranslation("gtqtcore.multiblock.br.2"));
    }


    @Override
    public boolean checkRecipe(@Nonnull Recipe recipe, boolean consumeIfSuccess) {
        if(this.getRecipeMap() != BIOLOGICAL_REACTION_RECIPES)return true;
        int number=recipe.getProperty(BRProperty.getInstance(), 0);
        if(rate*100>=number)
            return super.checkRecipe(recipe, consumeIfSuccess);
        else return false;
    }
    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("gregtech.machine.biorea.gtqtupdate.1"));
        tooltip.add(I18n.format("gregtech.machine.biorea.gtqtupdate.2"));
        tooltip.add(I18n.format("gregtech.machine.biorea.gtqtupdate.3"));
        tooltip.add(I18n.format("gregtech.machine.biorea.gtqtupdate.4"));
    }
    protected class BiologicalReactionLogic extends MultiblockRecipeLogic {

        public BiologicalReactionLogic(RecipeMapMultiblockController tileEntity) {
            super(tileEntity,true);
        }
        FluidStack WATER = Water.getFluid(100);
        FluidStack BIO1 = RawGrowthMedium.getFluid(10);
        FluidStack BIO2 = EnrichedBacterialSludge .getFluid(40);
        FluidStack BIO3 = FermentedBiomass.getFluid(80);
        FluidStack BIO4 = Biomass.getFluid(100);



        @Override
        public void update() {
            IMultipleTankHandler inputTank = getInputFluidInventory();

            for(int time=0;time<updatetime;time++) if(bio<2000)
                {
                if (BIO1.isFluidStackIdentical(inputTank.drain(BIO1, false))) {
                    inputTank.drain(BIO1, true);
                    bio = bio + 100;
                }
                if (BIO2.isFluidStackIdentical(inputTank.drain(BIO2, false))) {
                    inputTank.drain(BIO2, true);
                    bio = bio + 100;
                }
                if (BIO3.isFluidStackIdentical(inputTank.drain(BIO3, false))) {
                    inputTank.drain(BIO3, true);
                    bio = bio + 100;
                }
                if (BIO4.isFluidStackIdentical(inputTank.drain(BIO4, false))) {
                    inputTank.drain(BIO4, true);
                    bio = bio + 100;
                }
            }
            if (WATER.isFluidStackIdentical(inputTank.drain(WATER, false))) {
                if(liquid<20000) {
                    inputTank.drain(WATER, true);
                    liquid = liquid + 100*tubeTier;
                }

            }
            if(liquid==0) rate=0;
            else rate=(double) bio*10/liquid;
        }
        protected int getp()
        {
            if(rate>1.2)return 2;
            if(rate>1.1)return 4;
            if(rate>0.9)return 8;
            if(rate>0.8)return 4;
            if(rate>0.6)return 2;
            if(rate>0.4)return 1;
            return 1;
        }
        @Override
        public int getParallelLimit() {
            return getp()*clean_tier;
        }
        public void setMaxProgress(int maxProgress) {
                this.maxProgressTime = (maxProgress*(100-glass_tier*getp())/100);
        }
        protected void updateRecipeProgress() {
            if (this.canRecipeProgress && this.drawEnergy(this.recipeEUt, false)) {
                    if(liquid>5000) {
                        liquid = liquid - 1000;
                        if (++progressTime > maxProgressTime) {
                            completeRecipe();
                            liquid=liquid*tubeTier/16;
                            bio=bio*tubeTier/12;
                            //checjwater();
                        }
                    }
            }
        }
    }
}
