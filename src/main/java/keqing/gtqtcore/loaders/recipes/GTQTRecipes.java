package keqing.gtqtcore.loaders.recipes;

import com.typesafe.config.ConfigException;
import gregtech.api.GTValues;
import gregtech.api.capability.GregtechCapabilities;
import gregtech.api.capability.IElectricItem;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.toolitem.IGTTool;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.*;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.api.util.GTUtility;
import gregtech.common.crafting.ToolHeadReplaceRecipe;
import gregtech.common.items.MetaItems;
import gregtech.common.items.ToolItems;
import gregtechfoodoption.recipe.GTFORecipeMaps;
import keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps;
import keqing.gtqtcore.api.unification.ore.GTQTOrePrefix;
import keqing.gtqtcore.common.items.GTQTMetaItems;
import keqing.gtqtcore.common.items.metaitems.GTQTMetaToolItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.EnumFacing;

import javax.annotation.Nonnull;

import java.util.HashMap;
import java.util.Map;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.properties.PropertyKey.GEM;
import static gregtech.api.unification.material.properties.PropertyKey.TOOL;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.crafting.ToolHeadReplaceRecipe.setToolHeadForTool;
import static gregtech.common.items.MetaItems.*;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.addElectricToolRecipe;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.powerUnitItems;
import static keqing.gtqtcore.api.items.toolitem.GTQTToolClasses.SOLDERING_IRON;
import static keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps.*;
import static keqing.gtqtcore.api.unification.GTQTMaterials.Asphalt;
import static keqing.gtqtcore.api.unification.material.info.EPMaterialFlags.GENERATE_CURVED_PLATE;
import static keqing.gtqtcore.api.unification.material.info.EPMaterialFlags.GENERATE_ELECTRODE;
import static keqing.gtqtcore.api.unification.ore.GTQTOrePrefix.*;
import static keqing.gtqtcore.common.items.metaitems.GTQTMetaToolItems.*;

public class GTQTRecipes {

    public static void register(){
    }

    public static void registerTool(){
        plate.addProcessingHandler(PropertyKey.TOOL, GTQTRecipes::gcmTool);
        milled.addProcessingHandler(PropertyKey.ORE,GTQTRecipes::processMilled);
        fcrop.addProcessingHandler(PropertyKey.INGOT,GTQTRecipes::processCrops);
        leaf.addProcessingHandler(PropertyKey.INGOT,GTQTRecipes::processLeaf);
        plate_curved.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processPlateCurved);
        plate_big.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processPlateBig);
        round_cover.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processRoundCover);
        shell.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processShell);
        soldering_iron_head.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processSolderingIron);
        OrePrefix.ring.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processRing);
        OrePrefix.stick.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processStick);
        OrePrefix.gear.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processGear);
        OrePrefix.gearSmall.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processGear);
        OrePrefix.plate.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processPlate);
        OrePrefix.rotor.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processRotor);

        OrePrefix.block.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processBlock);
        OrePrefix.ingot.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processIngot);
        OrePrefix.nugget.addProcessingHandler(PropertyKey.DUST, GTQTRecipes::processNugget);

        OrePrefix.plate.addProcessingHandler(TOOL, GTQTRecipes::processTool);

        OrePrefix.spring.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processSpring);
        OrePrefix.springSmall.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processSpringSmall);
        OrePrefix.foil.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processFoil);
        OrePrefix.rotor.addProcessingHandler(PropertyKey.INGOT, GTQTRecipes::processRotorA);
    }

    private static void processShell(OrePrefix orePrefix, Material material, IngotProperty ingotProperty) {
        CW_LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(plate_big, material, 1)
                .fluidInputs(Water.getFluid(1000))
                .outputs(OreDictUnifier.get(orePrefix, material, 4))
                .output(dust,material,1)
                .duration(100)
                .circuitMeta(1)
                .EUt(GTValues.VA[HV])
                .buildAndRegister();
    }

    private static void processRoundCover(OrePrefix orePrefix, Material material, IngotProperty ingotProperty) {
        CW_LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(plate_big, material, 1)
                .fluidInputs(Water.getFluid(1000))
                .outputs(OreDictUnifier.get(orePrefix, material, 1))
                .output(dust,material,1)
                .duration(100)
                .circuitMeta(2)
                .EUt(GTValues.VA[HV])
                .buildAndRegister();
    }

    private static void processPlateBig(OrePrefix orePrefix, Material material, IngotProperty ingotProperty) {
        if (material.hasFlag(GENERATE_PLATE)) {
            if (material.hasFluid()) {
                RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                        .notConsumable(GTQTMetaItems.MOLD_GAS)
                        .fluidInputs(material.getFluid(L * 16))
                        .output(cylinder,material)
                        .duration(400)
                        .EUt(GTValues.VA[MV])
                        .buildAndRegister();

                RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                        .notConsumable(GTQTMetaItems.MOLD_MOTOR)
                        .fluidInputs(material.getFluid(L * 16))
                        .output(motor_stick,material)
                        .duration(400)
                        .EUt(GTValues.VA[MV])
                        .buildAndRegister();
            }

            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("aplate_big_%s", material),
                        OreDictUnifier.get(plate_big, material),
                        "SSh", "SSB",
                        'S', new UnificationEntry(plate, material),
                        'B', SOLDERING_IRON_LV);

                ModHandler.addShapedRecipe(String.format("bplate_big_%s", material),
                        OreDictUnifier.get(plate_big, material),
                        "SSh", "SSB",
                        'S', new UnificationEntry(plate, material),
                        'B', SOLDERING_IRON_HV);

                ModHandler.addShapedRecipe(String.format("cplate_big_%s", material),
                        OreDictUnifier.get(plate_big, material),
                        "SSh", "SSB",
                        'S', new UnificationEntry(plate, material),
                        'B', SOLDERING_IRON_IV);

                RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                        .EUt(30).duration(1200)
                        .input(plate, material, 4)
                        .output(plate_big, material)
                        .fluidInputs(Tin.getFluid(36))
                        .buildAndRegister();

                RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                        .EUt(30).duration(1200)
                        .input(plate, material)
                        .output(shell, material)
                        .fluidInputs(Water.getFluid(1000))
                        .buildAndRegister();

                RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .input(plate_big, material)
                        .output(round_cover, material)
                        .fluidInputs(Water.getFluid(1000))
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(576))
                        .input(plate_big, material)
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(72))
                        .input(shell, material)
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(144))
                        .input(plate_curved, material)
                        .buildAndRegister();

                ModHandler.addShapedRecipe(String.format("acylinder_%s", material),
                        OreDictUnifier.get(cylinder, material),
                        "hCT", "SAS","LCB",
                        'T', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'S', new UnificationEntry(plate_curved, material),
                        'A', new UnificationEntry(spring, material),
                        'C', new UnificationEntry(round_cover, material),
                        'B', SOLDERING_IRON_LV);
                ModHandler.addShapedRecipe(String.format("bcylinder_%s", material),
                        OreDictUnifier.get(cylinder, material),
                        "hCT", "SAS","LCB",
                        'T', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'S', new UnificationEntry(plate_curved, material),
                        'A', new UnificationEntry(spring, material),
                        'C', new UnificationEntry(round_cover, material),
                        'B', SOLDERING_IRON_HV);
                ModHandler.addShapedRecipe(String.format("ccylinder_%s", material),
                        OreDictUnifier.get(cylinder, material),
                        "hCT", "SAS","LCB",
                        'T', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'S', new UnificationEntry(plate_curved, material),
                        'A', new UnificationEntry(spring, material),
                        'C', new UnificationEntry(round_cover, material),
                        'B', SOLDERING_IRON_IV);

                RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .input(gearSmall, material, 1)
                        .input(stick, material, 1)
                        .input(plate_curved, material, 2)
                        .input(spring, material, 1)
                        .input(round_cover, material, 1)
                        .output(cylinder, material)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(1)
                        .fluidInputs(material.getFluid(2000))
                        .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                        .output(cylinder, material)
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(1)
                        .fluidInputs(material.getFluid(2000))
                        .fluidInputs(Polybenzimidazole.getFluid(36))
                        .output(cylinder, material)
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(1000))
                        .input(cylinder, material)
                        .buildAndRegister();

                ModHandler.addShapedRecipe(String.format("amotor_stick_%s", material),
                        OreDictUnifier.get(motor_stick, material),
                        "ACh", "SSS","AfB",
                        'S', new UnificationEntry(stickLong, material),
                        'A', new UnificationEntry(gear, material),
                        'C', new UnificationEntry(springSmall, material),
                        'B', SOLDERING_IRON_LV);
                ModHandler.addShapedRecipe(String.format("bmotor_stick_%s", material),
                        OreDictUnifier.get(motor_stick, material),
                        "ACh", "SSS","AfB",
                        'S', new UnificationEntry(stickLong, material),
                        'A', new UnificationEntry(gear, material),
                        'C', new UnificationEntry(springSmall, material),
                        'B', SOLDERING_IRON_HV);
                ModHandler.addShapedRecipe(String.format("cmotor_stick_%s", material),
                        OreDictUnifier.get(motor_stick, material),
                        "ACh", "SSS","AfB",
                        'S', new UnificationEntry(stickLong, material),
                        'A', new UnificationEntry(gear, material),
                        'C', new UnificationEntry(springSmall, material),
                        'B', SOLDERING_IRON_IV);

                RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .input(stickLong, material, 3)
                        .input(gear, material, 2)
                        .input(springSmall, material, 1)
                        .output(motor_stick, material)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(2)
                        .fluidInputs(material.getFluid(2000))
                        .output(motor_stick, material)
                        .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(2)
                        .fluidInputs(material.getFluid(2000))
                        .output(motor_stick, material)
                        .fluidInputs(Polybenzimidazole.getFluid(36))
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(1000))
                        .input(motor_stick, material)
                        .buildAndRegister();

                ModHandler.addShapedRecipe(String.format("avalve_%s", material),
                        OreDictUnifier.get(valve, material),
                        "SAL", "fCh","STB",
                        'S', new UnificationEntry(shell, material),
                        'T', new UnificationEntry(cylinder, material),
                        'A', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'C', new UnificationEntry(ring, material),
                        'B', SOLDERING_IRON_LV);
                ModHandler.addShapedRecipe(String.format("bvalve_%s", material),
                        OreDictUnifier.get(valve, material),
                        "SAL", "fCh","STB",
                        'S', new UnificationEntry(shell, material),
                        'T', new UnificationEntry(cylinder, material),
                        'A', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'C', new UnificationEntry(ring, material),
                        'B', SOLDERING_IRON_HV);
                ModHandler.addShapedRecipe(String.format("cvalve_%s", material),
                        OreDictUnifier.get(valve, material),
                        "SAL", "fCh","STB",
                        'S', new UnificationEntry(shell, material),
                        'T', new UnificationEntry(cylinder, material),
                        'A', new UnificationEntry(gearSmall, material),
                        'L', new UnificationEntry(stick, material),
                        'C', new UnificationEntry(ring, material),
                        'B', SOLDERING_IRON_IV);

                RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .input(shell, material, 2)
                        .input(cylinder, material, 1)
                        .input(gearSmall, material, 1)
                        .input(stick, material, 1)
                        .input(ring, material, 1)
                        .output(valve, material)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(3)
                        .fluidInputs(material.getFluid(4000))
                        .output(valve, material)
                        .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                TD_PRINT_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .circuitMeta(3)
                        .fluidInputs(material.getFluid(4000))
                        .output(valve, material)
                        .fluidInputs(Polybenzimidazole.getFluid(36))
                        .CWUt(24)
                        .totalCWU(960000)
                        .buildAndRegister();

                FLUID_EXTRACTOR_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .fluidOutputs(material.getFluid(2000))
                        .input(valve, material)
                        .buildAndRegister();

                ModHandler.addShapedRecipe(String.format("round_cover_%s", material),
                        OreDictUnifier.get(round_cover, material),
                        "cSh",
                        'S', new UnificationEntry(plate_big, material));

                ModHandler.addShapedRecipe(String.format("shell_%s", material),
                        OreDictUnifier.get(shell, material),
                        "cSh",
                        'S', new UnificationEntry(plate, material));
            }
        }
    }

    public static void processSolderingIron(OrePrefix SolderingPrefix, Material material, IngotProperty property) {
                RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                        .EUt(32).duration(40)
                        .input(OrePrefix.plate, material, 2)
                        .input(OrePrefix.stick, material, 2)
                        .output(SolderingPrefix, material)
                        .circuitMeta(20)
                        .buildAndRegister();

        ToolHeadReplaceRecipe.setToolHeadForTool(soldering_iron_head, SOLDERING_IRON_LV);
        ToolHeadReplaceRecipe.setToolHeadForTool(soldering_iron_head, SOLDERING_IRON_HV);
        ToolHeadReplaceRecipe.setToolHeadForTool(soldering_iron_head, SOLDERING_IRON_IV);
    }

    public static void processPlateCurved(OrePrefix curvedPrefix, Material material, IngotProperty property) {
        if (material.hasFlag(GENERATE_PLATE)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("plate_curved_%s", material),
                        OreDictUnifier.get(GTQTOrePrefix.plate_curved, material),
                        "h", "P", "B",
                        'P', new UnificationEntry(OrePrefix.plate,material),
                        'B', BENDING_CYLINDER);
                RecipeMaps.BENDER_RECIPES.recipeBuilder().EUt(32).duration(40)
                        .input(OrePrefix.plate, material, 1)
                        .output(curvedPrefix, material)
                        .circuitMeta(5)
                        .buildAndRegister();
                RecipeMaps.BENDER_RECIPES.recipeBuilder().EUt(32).duration(40)
                        .input(curvedPrefix, material)
                        .output(OrePrefix.plate, material, 1)
                        .circuitMeta(5)
                        .buildAndRegister();
            }
        }
    }

    public static void processSpring(OrePrefix springPrefix, Material material, IngotProperty property) {
        if (material.hasFlag(MaterialFlags.GENERATE_LONG_ROD)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("bending_spring_%s", material),
                        OreDictUnifier.get(OrePrefix.spring, material),
                        "hSB",
                        'S', new UnificationEntry(OrePrefix.stickLong, material),
                        'B', BENDING_CYLINDER);
            }
        }
    }
    public static void processSpringSmall(OrePrefix springSmallPrefix, Material material, IngotProperty property) {
        if (material.hasFlag(MaterialFlags.GENERATE_ROD)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("bending_small_spring_%s", material),
                        OreDictUnifier.get(OrePrefix.springSmall, material),
                        "hSB",
                        'S', new UnificationEntry(OrePrefix.stick, material),
                        'B', SMALL_BENDING_CYLINDER);
            }
        }
    }
    public static void processFoil(OrePrefix foilPrefix, Material material, IngotProperty property) {
        if (material.hasFlag(GENERATE_PLATE)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("bending_foil_%s", material),
                        OreDictUnifier.get(OrePrefix.foil, material, 2),
                        "hPB",
                        'P', new UnificationEntry(OrePrefix.plate,material),
                        'B', SMALL_BENDING_CYLINDER);
            }
        }
    }
    public static void processRotorA(OrePrefix rotorPrefix, Material material, IngotProperty property) {
        if (material.hasFlag(GENERATE_PLATE)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("curved_plate_rotor_%s", material),
                        OreDictUnifier.get(OrePrefix.rotor, material),
                        "PhP", "SRf", "PdP",
                        'P', new UnificationEntry(GTQTOrePrefix.plate_curved, material),
                        'S', new UnificationEntry(OrePrefix.screw, material),
                        'R', new UnificationEntry(OrePrefix.ring, material));
            }
        }
    }

    private static void processTool(OrePrefix prefix, Material material, ToolProperty property) {
        UnificationEntry stick = new UnificationEntry(OrePrefix.stick, Materials.Wood);
        UnificationEntry rod = new UnificationEntry(OrePrefix.stick, material);
        UnificationEntry plate = new UnificationEntry(OrePrefix.plate, material);
        UnificationEntry ingot = new UnificationEntry(material.hasProperty(GEM) ? OrePrefix.gem : OrePrefix.ingot, material);

        addToolRecipe(material, BENDING_CYLINDER, true,
                "shf", "III", "III",
                'I', ingot);
        addToolRecipe(material, SMALL_BENDING_CYLINDER, true,
                "shf", "III",
                'I', ingot);
        if (material.hasFlag(GENERATE_PLATE) && !material.hasFlag(MaterialFlags.NO_SMASHING)) {
            if (material.hasFlag(MaterialFlags.GENERATE_ROD)) {
                addToolRecipe(material, UNIVERSAL_SPADE, true,
                        "hPP", "DRP", "RDf",
                        'P', plate,
                        'D', new UnificationEntry(OrePrefix.dye, MarkerMaterials.Color.Blue),
                        'R', rod);
            }
        }
    }

    public static void addToolRecipe(@Nonnull Material material, @Nonnull IGTTool tool, boolean mirrored, Object... recipe) {
        if (mirrored) {
            ModHandler.addMirroredShapedRecipe(String.format("%s_%s",tool.getToolId(), material),
                    tool.get(material), recipe);
        } else {
            ModHandler.addShapedRecipe(String.format("%s_%s", tool.getToolId(), material),
                    tool.get(material), recipe);
        }
    }

    private static void processRing(OrePrefix orePrefix, Material material, DustProperty dustProperty) {
        if (material.hasFlag(GENERATE_CURVED_PLATE)) {
            CW_LASER_ENGRAVER_RECIPES.recipeBuilder()
                    .input(plate_big, material, 1)
                    .fluidInputs(Water.getFluid(1000))
                    .outputs(OreDictUnifier.get(orePrefix, material, 16))
                    .duration(100)
                    .circuitMeta(3)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }
        if (material.hasFlag(MaterialFlags.GENERATE_ROD)) {
            if (!material.hasFlag(MaterialFlags.NO_SMASHING)) {
                ModHandler.addShapedRecipe(String.format("bending_ring_%s", material),
                        OreDictUnifier.get(OrePrefix.ring, material),
                        "h", "S", "B",
                        'S', new UnificationEntry(OrePrefix.stick, material),
                        'B', GTQTMetaToolItems.SMALL_BENDING_CYLINDER);
            }
        }
    }

    private static void processStick(OrePrefix orePrefix, Material material, DustProperty dustProperty) {
        if (material.hasFlag(GENERATE_CURVED_PLATE)) {
            CW_LASER_ENGRAVER_RECIPES.recipeBuilder()
                    .input(plate_big, material, 1)
                    .fluidInputs(Water.getFluid(1000))
                    .outputs(OreDictUnifier.get(orePrefix, material, 8))
                    .duration(100)
                    .circuitMeta(4)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }
    }

    public static void processIngot(OrePrefix ingotPrefix, Material material, IngotProperty property) {
        if (material.hasFluid()) {
            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(MetaItems.SHAPE_MOLD_INGOT)
                    .fluidInputs(material.getFluid(L))
                    .outputs(OreDictUnifier.get(ingotPrefix, material))
                    .duration(20).EUt(VA[MV]*4)
                    .buildAndRegister();
        }
    }
    public static void processNugget(OrePrefix orePrefix, Material material, DustProperty property) {
        if (material.hasFluid()) {
            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(MetaItems.SHAPE_MOLD_NUGGET)
                    .fluidInputs(material.getFluid(L))
                    .outputs(OreDictUnifier.get(orePrefix, material, 9))
                    .duration((int) material.getMass()*4)
                    .EUt(VA[MV])
                    .buildAndRegister();
        }

    }
    public static void processBlock(OrePrefix blockPrefix, Material material, DustProperty property) {
        ItemStack blockStack = OreDictUnifier.get(blockPrefix, material);
        long materialAmount = blockPrefix.getMaterialAmount(material);
        if (material.hasFluid()) {
            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(MetaItems.SHAPE_MOLD_BLOCK)
                    .fluidInputs(material.getFluid((int) (materialAmount * L / M)))
                    .outputs(blockStack)
                    .duration((int) material.getMass()*4).EUt(VA[MV])
                    .buildAndRegister();
        }

    }
        public static void processGear(OrePrefix gearPrefix, Material material, DustProperty property) {
        ItemStack stack = OreDictUnifier.get(gearPrefix, material);
        boolean isSmall = gearPrefix == OrePrefix.gearSmall;
        if (material.hasFluid()) {

            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(isSmall ? MetaItems.SHAPE_MOLD_GEAR_SMALL : MetaItems.SHAPE_MOLD_GEAR)
                    .fluidInputs(material.getFluid(L * (isSmall ? 1 : 4)))
                    .outputs(stack)
                    .duration(isSmall ? 80 : 400)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }

    }
    public static void processPlate(OrePrefix platePrefix, Material material, DustProperty property) {
        if (material.hasFlag(GENERATE_CURVED_PLATE)) {
            CW_LASER_ENGRAVER_RECIPES.recipeBuilder()
                    .input(plate_big, material, 1)
                    .fluidInputs(Water.getFluid(1000))
                    .outputs(OreDictUnifier.get(platePrefix, material, 4))
                    .duration(100)
                    .circuitMeta(5)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }
        if (material.hasFluid()) {
            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(MetaItems.SHAPE_MOLD_PLATE)
                    .fluidInputs(material.getFluid(L))
                    .outputs(OreDictUnifier.get(platePrefix, material))
                    .duration(160)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }
    }

    public static void processRotor(OrePrefix rotorPrefix, Material material, IngotProperty property) {
        ItemStack stack = OreDictUnifier.get(rotorPrefix, material);
        if (material.hasFluid()) {
            RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                    .notConsumable(MetaItems.SHAPE_MOLD_ROTOR)
                    .fluidInputs(material.getFluid(L * 4))
                    .outputs(GTUtility.copy(stack))
                    .duration(480)
                    .EUt(GTValues.VA[HV])
                    .buildAndRegister();
        }

    }
    public static void processCrops(OrePrefix fcropPrefix, Material material, IngotProperty property)
    {
        GTFORecipeMaps.GREENHOUSE_RECIPES.recipeBuilder()
                .EUt(GTValues.VA[ZPM])
                .duration(4500)
                .input(MetaItems.FERTILIZER,12)
                .fluidInputs(RawGrowthMedium.getFluid(12000))
                .notConsumable(fcropPrefix, material, 1)
                .chancedOutput(fcropPrefix, material, 100,100)
                .circuitMeta(1)
                .buildAndRegister();

        GTFORecipeMaps.GREENHOUSE_RECIPES.recipeBuilder()
                .EUt(GTValues.VA[ZPM])
                .duration(1500)
                .fluidInputs(RawGrowthMedium.getFluid(4000))
                .input(MetaItems.FERTILIZER,4)
                .notConsumable(fcropPrefix, material, 1)
                .chancedOutput(GTQTOrePrefix.leaf, material, 2000,1000)
                .chancedOutput(GTQTOrePrefix.leaf, material, 2000,1000)
                .chancedOutput(GTQTOrePrefix.leaf, material, 2000,1000)
                .chancedOutput(GTQTOrePrefix.leaf, material, 2000,1000)
                .circuitMeta(2)
                .buildAndRegister();

    }
    public static void processLeaf(OrePrefix leafPrefix, Material material, IngotProperty property)
    {
        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .EUt(GTValues.VA[ZPM])
                .duration(1500)
                .input(leafPrefix, material, 1)
                .chancedOutput(OrePrefix.dust, material, 500,125)
                .chancedOutput(OrePrefix.dust, material, 500,125)
                .chancedOutput(OrePrefix.dust, material, 500,125)
                .chancedOutput(OrePrefix.dust, material, 500,125)
                .buildAndRegister();
    }
    public static void processMilled(OrePrefix milledPrefix, Material material, OreProperty property) {
        GTQTcoreRecipeMaps.ISA_MILL_GRINDER.recipeBuilder()
                .EUt(GTValues.VA[ZPM])
                .duration(1500)
                .input(OrePrefix.crushed, material, 16)
                .output(milledPrefix, material, 16)
                .circuitMeta(11)
                .grindBallTier(1)
                .buildAndRegister();

        GTQTcoreRecipeMaps.ISA_MILL_GRINDER.recipeBuilder()
                .EUt(GTValues.VA[ZPM])
                .duration(1200)
                .input(OrePrefix.crushed, material, 16)
                .output(milledPrefix, material, 32)
                .circuitMeta(10)
                .grindBallTier(2)
                .buildAndRegister();
    }

    private static void gcmTool(OrePrefix prefix, Material material, ToolProperty property) {
        UnificationEntry plate = new UnificationEntry(OrePrefix.plate, material);
        UnificationEntry stick = new UnificationEntry(OrePrefix.stick, material);
        UnificationEntry soldering_iron_head = new UnificationEntry(GTQTOrePrefix.soldering_iron_head, material);
        UnificationEntry ingot = new UnificationEntry(material.hasProperty(PropertyKey.GEM) ? OrePrefix.gem : OrePrefix.ingot, material);
        //tools
        if (material.hasFlag(MaterialFlags.GENERATE_LONG_ROD)) {
            UnificationEntry rod = new UnificationEntry(stickLong, material);
            if (material.hasFlag(GENERATE_PLATE)) {
                if (material.hasFlag(MaterialFlags.GENERATE_BOLT_SCREW))
                {
                    addToolRecipe(material, GTQTMetaToolItems.Choocher, false, "IdP", "IPP", "ST ", 'I', ingot, 'P', plate, 'T', new UnificationEntry(OrePrefix.screw, material), 'S', rod);
                    addToolRecipe(material, GTQTMetaToolItems.Jinitaimei, false, "SdS", "IPI", " T ", 'I', ingot, 'P', plate, 'T', new UnificationEntry(OrePrefix.screw, material), 'S', rod);
                }
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_IV.getMaxChargeOverrideStack(40960000L), POWER_UNIT_IV.getMaxChargeOverrideStack(250000000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = VAJRA.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "vajra", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "KIK", "POP", "TST",
                        'O', MetaItems.EMITTER_UV,
                        'K', stick,
                        'I', MetaItems.FIELD_GENERATOR_UV,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_IV,
                        'S', powerUnits[i]);
            }
        }

        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_HV.getMaxChargeOverrideStack(1800000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1600000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1200000L), POWER_UNIT_HV.getMaxChargeOverrideStack(6400000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = Choocher_HV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "choocher_hv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "IdP", "IPP", "ST ",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_PISTON_HV,
                        'S', powerUnits[i]);
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_HV.getMaxChargeOverrideStack(1800000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1600000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1200000L), POWER_UNIT_HV.getMaxChargeOverrideStack(6400000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = Jinitaimei_HV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "jinitaimei_hv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PdP", "ITP", " S ",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_HV,
                        'S', powerUnits[i]);
            }
        }

        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_LV.getMaxChargeOverrideStack(80000L), POWER_UNIT_LV.getMaxChargeOverrideStack(100000L), POWER_UNIT_LV.getMaxChargeOverrideStack(120000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = HARD_HAMMER_LV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "hammer_lv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PIP", "PTP", "dSd",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_LV,
                        'S', powerUnits[i]);
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_MV.getMaxChargeOverrideStack(360000L), POWER_UNIT_MV.getMaxChargeOverrideStack(400000L), POWER_UNIT_MV.getMaxChargeOverrideStack(420000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = HARD_HAMMER_MV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "hammer_mv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PIP", "PTP", "dSd",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_MV,
                        'S', powerUnits[i]);
            }
        }

        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_HV.getMaxChargeOverrideStack(1800000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1600000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1200000L), POWER_UNIT_HV.getMaxChargeOverrideStack(6400000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = HARD_HAMMER_HV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "hammer_hv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PIP", "PTP", "dSd",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_HV,
                        'S', powerUnits[i]);
            }
        }

        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_EV.getMaxChargeOverrideStack(10240000L), POWER_UNIT_EV.getMaxChargeOverrideStack(25000000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = HARD_HAMMER_EV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "hammer_ev", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PIP", "PTP", "dSd",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_EV,
                        'S', powerUnits[i]);
            }
        }

        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_IV.getMaxChargeOverrideStack(40960000L), POWER_UNIT_IV.getMaxChargeOverrideStack(250000000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = HARD_HAMMER_IV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "hammer_iv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "PIP", "PTP", "dSd",
                        'I', ingot,
                        'P', plate,
                        'T', MetaItems.ELECTRIC_MOTOR_IV,
                        'S', powerUnits[i]);
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_LV.getMaxChargeOverrideStack(80000L), POWER_UNIT_LV.getMaxChargeOverrideStack(100000L), POWER_UNIT_LV.getMaxChargeOverrideStack(120000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = SOLDERING_IRON_LV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "soldering_iron_lv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "wHd", " U ",
                        'H', soldering_iron_head,
                        'U', powerUnits[i]);
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_HV.getMaxChargeOverrideStack(1800000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1600000L), POWER_UNIT_HV.getMaxChargeOverrideStack(1200000L), POWER_UNIT_HV.getMaxChargeOverrideStack(6400000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = SOLDERING_IRON_HV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "soldering_iron_hv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "wHd", " U ",
                        'H', soldering_iron_head,
                        'U', powerUnits[i]);
            }
        }
        if (property.getToolDurability() > 0) {
            ItemStack[] powerUnits = {POWER_UNIT_IV.getMaxChargeOverrideStack(40960000L), POWER_UNIT_IV.getMaxChargeOverrideStack(250000000L)};
            for (int i = 0; i < powerUnits.length; i++) {
                IElectricItem powerUnit = powerUnits[i].getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
                ItemStack toolItem = SOLDERING_IRON_IV.get(material, 0, powerUnit.getMaxCharge());
                ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s_%s", "soldering_iron_iv", material, i),
                        toolItem,
                        Ingredient.fromStacks(powerUnits[i]), true, true,
                        "wHd", " U ",
                        'H', soldering_iron_head,
                        'U', powerUnits[i]);
            }
        }
    }



}
