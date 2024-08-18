package keqing.gtqtcore.loaders.recipes;

import keqing.gtqtspace.loaders.recipes.categories.SpaceMiningRecipes;
import net.minecraft.item.ItemStack;

import java.lang.reflect.Method;

import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.IMPLOSION_RECIPES;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.ore.OrePrefix.*;
import static keqing.gtqtcore.api.unification.GCYSMaterials.DeepIron;
import static keqing.gtqtcore.api.unification.GTQTMaterials.MeteoricIron;

public class Unofficial {
    public static void init() {
        IMPLOSION_RECIPES.recipeBuilder()
                .input(screw, MeteoricIron, 8)
                .output(dust, DeepIron, 1)
                .explosivesAmount(32)
                .duration(20)
                .EUt(VA[HV])
                .buildAndRegister();
        try {
            Method mth = SpaceMiningRecipes.class.getDeclaredMethod("getDroneByTier", int.class);
            mth.setAccessible(true);
            for (int i = 1; i <= 7; i++) {
                ItemStack drone = (ItemStack) mth.invoke(null, i);
                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(plate, Platinum, 64)
                        .outputs(drone)
                        .circuitMeta(1)
                        .duration(36000 * i * i).EUt(VA[i + 1]).buildAndRegister();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Jvav8谢谢！");
        }
    }
}
