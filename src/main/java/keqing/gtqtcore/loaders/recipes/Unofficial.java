package keqing.gtqtcore.loaders.recipes;

import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.IMPLOSION_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static keqing.gtqtcore.api.unification.GCYSMaterials.CubicBoronNitride;
import static keqing.gtqtcore.api.unification.GCYSMaterials.Heterodiamond;

public class Unofficial {
    public static void init() {
        IMPLOSION_RECIPES.recipeBuilder()
                .input(dust, CubicBoronNitride)
                .output(gem, Heterodiamond, 2)
                .explosivesAmount(32)
                .duration(20)
                .EUt(VA[HV])
                .buildAndRegister();
    }
}
