package keqing.gtqtcore.api.unification.matreials;
import gregtech.api.GTValues;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import gregtech.api.unification.material.Material;
import keqing.gtqtcore.api.unification.GTQTMaterials;

public class HigherDegreeMaterials {

    private static int startId = 20600;
    private static final int END_ID = startId + 100;

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void register() {
        GTQTMaterials.Nitinol = new Material.Builder(getMaterialsId(), gregtechId("nitinol"))
                .ingot(3)
                .fluid()
                .color(0x8C6464).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_FOIL, GENERATE_GEAR)
                .components(Nickel, 2, Titanium, 3)
                .rotorStats(15.0f, 7.0f, 3000)
                .toolStats(ToolProperty.Builder.of(7.0F, 6.0F, 5120, 3)
                        .attackSpeed(0.1F).enchantability(21).build())
                .blast(1300, BlastProperty.GasTier.LOW)
                .build();


        //贫硫化金矿石
        GTQTMaterials.LeanGoldSulphide= new Material.Builder(getMaterialsId(), gregtechId("lean_gold_sulphide"))
                .ore()
                .dust().fluid()
                .color(0x8B8B00)
                .components(Gold, 1, Copper, 1,Sulfur,2,Oxygen,3)
                .build();
        //含金多金属矿石
        GTQTMaterials.RichGoldSulphide= new Material.Builder(getMaterialsId(), gregtechId("rich_gold_sulphide"))
                .ore()
                .dust().fluid()
                .color(0xCDCD00)
                .components(Gold, 1, Copper, 1,Iron,1,Sulfur,4,Oxygen,1)
                .build();

        // 褐煤
        GTQTMaterials.Lignite = new Material.Builder(getMaterialsId(), gregtechId("lignite"))
                .gem(1, 1600).ore(2, 1) // default coal burn time in vanilla
                .color(0x8B5A00).iconSet(LIGNITE)
                .flags(FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .components(Carbon, 1)
                .build();


        // 深红银矿
        GTQTMaterials.Pyrargyrite= new Material.Builder(getMaterialsId(), gregtechId("pyrargyrite"))
                .ore()
                .dust().fluid()
                .color(0x8B4726)
                .components(Silver, 3,Antimony,1,Sulfur,3)
                .build();
        // 锌锑方辉银矿
        GTQTMaterials.Zincantimonygalvanite= new Material.Builder(getMaterialsId(), gregtechId("zincantimonygalvanite"))
                .ore()
                .dust().fluid()
                .color(0x8B2252)
                .components(Silver, 2,Zinc,1,Sulfur,2,Oxygen,1)
                .build();
        //铬铅矿
        GTQTMaterials.Crocoite= new Material.Builder(getMaterialsId(), gregtechId("crocoite"))
                .ore()
                .dust().fluid()
                .color(0x321452)
                .components(Lead,1,Chromite,1,Oxygen,4)
                .build();
        // 冰晶石
        GTQTMaterials.Cryolite= new Material.Builder(getMaterialsId(), gregtechId("cryolite"))
                .ore()
                .dust().fluid()
                .color(0x98F5FF)
                .components(Sodium,3,Aluminium,1,Fluorine,6)
                .build();

        // 神秘六要素
        GTQTMaterials.infused_air= new Material.Builder(getMaterialsId(), gregtechId("infused_air"))
                .color(0xFEFE7D)
                .ore().gem()
                .build();
        GTQTMaterials.infused_fire= new Material.Builder(getMaterialsId(), gregtechId("infused_fire"))
                .color(0xFE3C01)
                .ore().gem()
                .build();
        GTQTMaterials.infused_water= new Material.Builder(getMaterialsId(), gregtechId("infused_water"))
                .color(0x0090FF)
                .ore().gem()
                .build();
        GTQTMaterials.infused_earth= new Material.Builder(getMaterialsId(), gregtechId("infused_earth"))
                .color(0x00A000)
                .ore().gem()
                .build();
        GTQTMaterials.infused_entropy= new Material.Builder(getMaterialsId(), gregtechId("infused_entropy"))
                .color(0x43435E)
                .ore().gem()
                .build();
        GTQTMaterials.infused_order= new Material.Builder(getMaterialsId(), gregtechId("infused_order"))
                .color(0xEECCFF)
                .ore().gem()
                .build();
        // 磷铝锂石
        GTQTMaterials.Amblygonite= new Material.Builder(getMaterialsId(), gregtechId("amblygonite"))
                .ore()
                .dust().fluid()
                .color(0xA4D3EE)
                .components(Lithium,1,Sodium,1,Aluminium,1,Phosphate,1,Oxygen,4,Fluorine,1,Hydrogen,1)
                .build();

        // 琥珀
        GTQTMaterials.Amber= new Material.Builder(getMaterialsId(), gregtechId("amber"))
                .ore()
                .dust().fluid()
                .color(0x8B4C39)
                .components(Carbon,10,Hydrogen,16,Oxygen,1)
                .build();

    }
}
