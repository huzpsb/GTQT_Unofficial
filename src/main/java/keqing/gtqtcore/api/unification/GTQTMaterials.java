package keqing.gtqtcore.api.unification;

import gregtech.api.unification.material.Material;
import keqing.gtqtcore.api.unification.matreials.FirstDegreeMaterials;
import keqing.gtqtcore.api.unification.matreials.HigherDegreeMaterials;

public class GTQTMaterials {
    public static Material HighPressureSteam;
    public static Material SteamExhaustGas;
    public static Material Nitinol;
    public static Material Pyrotheum;

    //https://github.com/Darknight123MC/Gregica-Sharp/blob/master/src/main/java/me/oganesson/gregicas/api/unification/GSMaterials.java

    public GTQTMaterials() {}

    public static void register() {
        FirstDegreeMaterials.register();
        HigherDegreeMaterials.register();
    }


}
