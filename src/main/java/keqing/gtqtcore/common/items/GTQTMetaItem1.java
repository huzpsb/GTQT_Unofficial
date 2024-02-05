package keqing.gtqtcore.common.items;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.common.items.behaviors.MultiblockBuilderBehavior;
import gregtech.common.items.behaviors.ProspectorScannerBehavior;
import keqing.gtqtcore.api.unification.GCYSMaterials;
import keqing.gtqtcore.common.CommonProxy;
import keqing.gtqtcore.common.block.blocks.GTQTCrops;
import keqing.gtqtcore.common.items.behaviors.IntBcircuitBehavior;
import keqing.gtqtcore.common.items.behaviors.MemoryCardBehavior;
import keqing.gtqtcore.common.items.behaviors.MillBallBehavior;
import keqing.gtqtcore.common.items.behaviors.StructureWriteBehavior;

import static gregtech.api.GTValues.M;
import static keqing.gtqtcore.common.items.GTQTMetaItems.*;


public class GTQTMetaItem1 extends StandardMetaItem {

    public GTQTMetaItem1() {
        this.setRegistryName("gtqt_meta_item_1");
        setCreativeTab(GregTechAPI.TAB_GREGTECH);
    }



    public void registerSubItems() {



        //基础材料
        IMPREGNATED_GRAPHITE_RODSA = this.addItem(1,"item.impregnated_graphite_rodsa").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        IMPREGNATED_GRAPHITE_RODS = this.addItem(2,"item.impregnated_graphite_rods").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        IMPREGNATED_SUBSTRATE = this.addItem(3,"item.impregnated_substrate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        IMPREGNATED_PLASTIC_SUBSTRATE = this.addItem(4,"item.impregnated_plastic_substrate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        IMPREGNATED_EPOXY = this.addItem(5,"item.impregnated_epoxy").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //快乐海藻
        COMMON_ALGAE = this.addItem(10,"algae.common").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        GREEN_ALGAE = this.addItem(11,"algae.green").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RED_ALGAE = this.addItem(12,"algae.red").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        BROWN_ALGAE = this.addItem(13,"algae.brown").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        GOLD_ALGAE = this.addItem(14,"algae.gold").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        T_ALGAE = this.addItem(15,"algae.t").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        BIOLOGY_INTEGRATED_CIRCUIT = this.addItem(39, "item.biology_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB).addComponents(new IntBcircuitBehavior());
        ROUGH_BIOLOGY_RESIN=this.addItem(41, "item.biology_resin").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        PURIFIED_ALUMINIUM_MIXTURE=this.addItem(42, "item.aluminium_mixture").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        CELLULOSE_PULP=this.addItem(43, "item.cellulose_pulp").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        CELLULOSE_FIBER=this.addItem(44, "item.cellulose_fiber_green").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        CELLULOSE_FIBER_RED=this.addItem(45, "item.cellulose_fiber_red").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        CELLULOSE_FIBER_YELLOW=this.addItem(46, "item.cellulose_fiber_yellow").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        PINE_CONE=this.addItem(47, "item.pine_cone").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        PINE_FRAGMENT=this.addItem(48, "item.pine_fragment").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPOST=this.addItem(49, "item.compost").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        ALGAE_ACID=this.addItem(50, "item.algae_acid").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        WOOD_PELLETS=this.addItem(51, "item.wood_pellets").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        PELLETS_MOULD=this.addItem(52, "item.pellets_mould").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        ALUMINIUM_PELLETS=this.addItem(53, "item.aluminium_pellets").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        POTASSIUM_ETHYLATE=this.addItem(54, "item.potassium.ethylate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        POTASSIUM_ETHYLXANTHATE=this.addItem(55, "item.potassium.ethylxanthate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        SODIUM_ETHYLXANTHATE=this.addItem(56, "item.sodium.ethylxanthate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        SODIUM_ETHYLATE=this.addItem(57, "item.sodium.ethylate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_ADVANCED_SYSTEM_ON_CHIP=this.addItem(58, "reticle.advanced_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_CENTRAL_PROCESSING_UNIT=this.addItem(59, "reticle.central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_HIGH_POWER_INTEGRATED_CIRCUIT=this.addItem(60, "reticle.high_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_HIGHLY_ADVANCED_SYSTEM_ON_CHIP=this.addItem(61, "reticle.highly_advanced_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_INTEGRATED_LOGIC_CIRCUIT=this.addItem(62, "reticle.integrated_logic_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_LOW_POWER_INTEGRATED_CIRCUIT=this.addItem(63, "reticle.low_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_NAND_MEMORY_CHIP=this.addItem(64, "reticle.nand_memory_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_NANO_CENTRAL_PROCESSING_UNIT=this.addItem(65, "reticle.nano_central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_NOR_MEMORY_CHIP=this.addItem(66, "reticle.nor_memory_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_POWER_INTEGRATED_CIRCUIT=this.addItem(67, "reticle.power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_QBIT_CENTRAL_PROCESSING_UNIT=this.addItem(68, "reticle.qbit_central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_RANDOM_ACCESS_MEMORY=this.addItem(69, "reticle.random_access_memory").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_SIMPLE_SYSTEM_ON_CHIP=this.addItem(70, "reticle.simple_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_SYSTEM_ON_CHIP=this.addItem(71, "reticle.system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT=this.addItem(72, "reticle.ultra_high_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_ULTRA_LOW_POWER_INTEGRATED_CIRCUIT=this.addItem(73, "reticle.ultra_low_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        RETICLE_SILICON=this.addItem(74, "reticle.silicon").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);

        //AE
        //神秘硅束
        AE_SILICON = this.addItem(75, "ae.silicon").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //神秘硅晶
        AE_WAFER=this.addItem(76, "ae.wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //光掩模*3
        AE_RETICLEA=this.addItem(77, "ae.reticlea").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_RETICLEB=this.addItem(78, "ae.reticleb").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_RETICLEC=this.addItem(79, "ae.reticlec").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //掺杂晶圆*3
        AE_WAFERA=this.addItem(80, "ae.wafera").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_WAFERB=this.addItem(81, "ae.waferb").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_WAFERC=this.addItem(82, "ae.waferc").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //蚀刻后*3
        AE_A=this.addItem(83, "ae.a").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_B=this.addItem(84, "ae.b").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        AE_C=this.addItem(85, "ae.c").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);


        //神秘农业
        COPPER_CROP = addItem(200, "copper_crop");
        COPPER_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.COPPER_CROP, COPPER_CROP.getStackForm(), COPPER_CROP.getStackForm()));

        IRON_CROP = addItem(201, "iron_crop");
        IRON_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.IRON_CROP, IRON_CROP.getStackForm(), IRON_CROP.getStackForm()));

        TIN_CROP = addItem(202, "tin_crop");
        TIN_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.TIN_CROP, TIN_CROP.getStackForm(), TIN_CROP.getStackForm()));

        BRONZE_CROP = addItem(203, "bronze_crop");
        BRONZE_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.BRONZE_CROP, BRONZE_CROP.getStackForm(), BRONZE_CROP.getStackForm()));

        CARBON_CROP = addItem(204, "carbon_crop");
        CARBON_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.CARBON_CROP, CARBON_CROP.getStackForm(), CARBON_CROP.getStackForm()));

        GOLD_CROP = addItem(205, "gold_crop");
        GOLD_CROP.addComponents(new GTQTCropSeedBehaviour(GTQTCrops.GOLD_CROP, GOLD_CROP.getStackForm(), GOLD_CROP.getStackForm()));

        //火箭大军集结完毕
        //登陆器三个
        LANDER_MODULE1=this.addItem(350, "lander_module_t1").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        LANDER_MODULE2=this.addItem(351, "lander_module_t2").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        LANDER_MODULE3=this.addItem(352, "lander_module_t3").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //导航电脑6个
        COMPUTERTIER1=this.addItem(353, "computerTier1").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERTIER2=this.addItem(354, "computerTier2").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERTIER3=this.addItem(355, "computerTier3").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERTIER4=this.addItem(356, "computerTier4").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERTIER5=this.addItem(357, "computerTier5").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERTIER6=this.addItem(358, "computerTier6").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //备用
        COMPUTERMINER=this.addItem(359, "computerMiner").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERCARGO=this.addItem(340, "computerCargo").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        COMPUTERBUGGY=this.addItem(341, "computerBuggy").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //材料
        HEAVY_ALLOY_PLATE=this.addItem(342, "heavy_alloy_plate").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        HEAVY_ALLOY_PLATEA=this.addItem(343, "heavy_alloy_platea").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        HEAVY_ALLOY_PLATEB=this.addItem(344, "heavy_alloy_plateb").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        HEAVY_ALLOY_PLATEC=this.addItem(345, "heavy_alloy_platec").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        HEAVY_ALLOY_PLATED=this.addItem(346, "heavy_alloy_plated").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        HEAVY_ALLOY_PLATEE=this.addItem(347, "heavy_alloy_platee").setMaxStackSize(64).setCreativeTabs(CommonProxy.GTQTCore_TAB);
        //磨球
        GRINDBALL_SOAPSTONE = this.addItem(370, "mill.grindball_soapstone").setMaxStackSize(1).addComponents(new MillBallBehavior());
        GRINDBALL_ALUMINIUM = this.addItem(371, "mill.grindball_aluminium").setMaxStackSize(1).addComponents(new MillBallBehavior());
        // Simple Machine Crafting Components: ID 480-499
        COMPONENT_GRINDER_BORON_NITRIDE = this.addItem(374, "component.grinder.boron_nitride").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.CubicBoronNitride, M * 4), new MaterialStack(GCYSMaterials.Vibranium, M * 8), new MaterialStack(GCYSMaterials.CubicHeterodiamond, M)));
        // Voltage Coils: ID 350-355
        VOLTAGE_COIL_UHV = this.addItem(375, "voltage_coil.uhv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UEV = this.addItem(376, "voltage_coil.uev").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UIV = this.addItem(377, "voltage_coil.uiv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UXV = this.addItem(378, "voltage_coil.uxv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_OpV = this.addItem(379, "voltage_coil.opv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_MAX = this.addItem(380, "voltage_coil.max").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(GCYSMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(GCYSMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        //封装电路板
        WRAP_CIRCUIT_ULV = this.addItem(400, "wrap.circuit.ulv");
        WRAP_CIRCUIT_LV = this.addItem(401, "wrap.circuit.lv");
        WRAP_CIRCUIT_MV = this.addItem(402, "wrap.circuit.mv");
        WRAP_CIRCUIT_HV = this.addItem(403, "wrap.circuit.hv");
        WRAP_CIRCUIT_EV = this.addItem(404, "wrap.circuit.ev");
        WRAP_CIRCUIT_IV = this.addItem(405, "wrap.circuit.iv");
        WRAP_CIRCUIT_LuV = this.addItem(406, "wrap.circuit.luv");
        WRAP_CIRCUIT_ZPM = this.addItem(407, "wrap.circuit.zpm");
        WRAP_CIRCUIT_UV = this.addItem(408, "wrap.circuit.uv");
        WRAP_CIRCUIT_UHV = this.addItem(409, "wrap.circuit.uhv");
        WRAP_CIRCUIT_UEV = this.addItem(410, "wrap.circuit.uev");
        WRAP_CIRCUIT_UIV = this.addItem(411, "wrap.circuit.uiv");
        WRAP_CIRCUIT_UXV = this.addItem(412, "wrap.circuit.uxv");
        WRAP_CIRCUIT_OpV = this.addItem(413, "wrap.circuit.opv");
        WRAP_CIRCUIT_MAX = this.addItem(414, "wrap.circuit.max");

        PROSPECTOR_UV = addItem(415, "prospector.uv")
                .addComponents(ElectricStats.createElectricItem(16_000_000_000L, GTValues.UV),
                        new ProspectorScannerBehavior(7, GTValues.UV))
                .setMaxStackSize(1)
                .setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);

        PROSPECTOR_UV = addItem(416, "prospector.uiv")
                .addComponents(ElectricStats.createElectricItem(256_000_000_000L, GTValues.UIV),
                        new ProspectorScannerBehavior(9, GTValues.UIV))
                .setMaxStackSize(1)
                .setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);

        MEMORY_CARD = addItem(417,"item.memory_card").setMaxStackSize(1).setCreativeTabs(CommonProxy.GTQTCore_TAB).addComponents(new MemoryCardBehavior());
        DEBUG_STRUCTURE_WRITER = this.addItem(418, "debug.structure_writer").addComponents(StructureWriteBehavior.INSTANCE);
        DEBUG_STRUCTURE_BUILDER = this.addItem(419, "debug.structure_builder").addComponents(new MultiblockBuilderBehavior());


        
        // Circuits: ID 0-49
        GOOWARE_PROCESSOR = this.addItem(500, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GOOWARE_ASSEMBLY = this.addItem(501, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GOOWARE_COMPUTER = this.addItem(502, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GOOWARE_MAINFRAME = this.addItem(503, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        OPTICAL_PROCESSOR = this.addItem(504,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        OPTICAL_ASSEMBLY = this.addItem(505,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        OPTICAL_COMPUTER = this.addItem(506,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        OPTICAL_MAINFRAME = this.addItem(507,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        SPINTRONIC_PROCESSOR = this.addItem(508, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SPINTRONIC_ASSEMBLY = this.addItem(509, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SPINTRONIC_COMPUTER = this.addItem(510, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SPINTRONIC_MAINFRAME = this.addItem(511, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        COSMIC_PROCESSOR = this.addItem(512, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        COSMIC_ASSEMBLY = this.addItem(513, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        COSMIC_COMPUTER = this.addItem(514, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        COSMIC_MAINFRAME = this.addItem(515, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        SUPRACAUSAL_PROCESSOR = this.addItem(516, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SUPRACAUSAL_ASSEMBLY = this.addItem(517, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        SUPRACAUSAL_COMPUTER = this.addItem(518, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        SUPRACAUSAL_MAINFRAME = this.addItem(519, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        SUPRACHRONAL_ULV = this.addItem(520, "circuit.suprachronal.ulv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV);
        SUPRACHRONAL_LV = this.addItem(521, "circuit.suprachronal.lv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LV);
        SUPRACHRONAL_MV = this.addItem(522, "circuit.suprachronal.mv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MV);
        SUPRACHRONAL_HV = this.addItem(523, "circuit.suprachronal.hv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.HV);
        SUPRACHRONAL_EV = this.addItem(524, "circuit.suprachronal.ev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.EV);
        SUPRACHRONAL_IV = this.addItem(525, "circuit.suprachronal.iv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.IV);
        SUPRACHRONAL_LuV = this.addItem(526, "circuit.suprachronal.luv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LuV);
        SUPRACHRONAL_ZPM = this.addItem(527, "circuit.suprachronal.zpm").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        SUPRACHRONAL_UV = this.addItem(528, "circuit.suprachronal.uv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        SUPRACHRONAL_UHV = this.addItem(529, "circuit.suprachronal.uhv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SUPRACHRONAL_UEV = this.addItem(530, "circuit.suprachronal.uev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SUPRACHRONAL_UIV = this.addItem(531, "circuit.suprachronal.uiv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SUPRACHRONAL_UXV = this.addItem(532, "circuit.suprachronal.uxv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        SUPRACHRONAL_OpV = this.addItem(5533, "circuit.suprachronal.opv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        SUPRACHRONAL_MAX = this.addItem(34, "circuit.suprachronal.max").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        // Primitive Circuit Components: ID 50-59
        VACUUM_TUBE_COMPONENTS = this.addItem(551, "vacuum_tube.components");

        // Electronic Circuit Components: ID 60-69


        // Micro Circuit Components: ID 70-89


        // Nano Circuit Components: ID 90-109


        // Quantum Circuit Components: ID 110-129


        // Crystal Circuit Components: ID 130-159
        EU_DOPED_CUBIC_ZIRCONIA_BOULE = this.addItem(630, "boule.cubic_zirconia.europium");
        EU_DOPED_CUBIC_ZIRCONIA_WAFER = this.addItem(631, "wafer.cubic_zirconia.europium");
        CRYSTAL_INTERFACE_WAFER = this.addItem(632, "wafer.crystal.interface");
        CRYSTAL_INTERFACE_CHIP = this.addItem(633, "plate.crystal.interface");
        ENGRAVED_RUBY_CRYSTAL_CHIP = this.addItem(634, "engraved.crystal_chip.ruby");
        ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = this.addItem(635, "engraved.crystal_chip.sapphire");
        ENGRAVED_DIAMOND_CRYSTAL_CHIP = this.addItem(636, "engraved.crystal_chip.diamond");
        CRYSTAL_MODULATOR_RUBY = this.addItem(637, "crystal.modulator.ruby");
        CRYSTAL_MODULATOR_SAPPHIRE = this.addItem(638, "crystal.modulator.sapphire");
        CRYSTAL_MODULATOR_DIAMOND = this.addItem(639, "crystal.modulator.diamond");
        CRYSTAL_SYSTEM_ON_CHIP_SOCKET = this.addItem(640, "crystal.system_on_chip.socket");

        // Wetware Circuit Components: ID 160-179


        // Gooware Circuit Components: ID 180-199
        BZ_REACTION_CHAMBER = this.addItem(680, "reaction_chamber.bz");
        NONLINEAR_CHEMICAL_OSCILLATOR = this.addItem(681, "nonlinear_chemical_oscillator");

        // Optical Circuit Components: ID 200-219
        PHASE_CHANGE_MEMORY = this.addItem(700, "plate.phase_change_memory");
        OPTICAL_FIBER = this.addItem(701, "optical_fiber");
        DIELECTRIC_MIRROR = this.addItem(702, "dielectric_mirror");
        EMPTY_LASER_ASSEMBLY = this.addItem(703, "laser.assembly.empty");
        HELIUM_NEON_LASER = this.addItem(704, "laser.helium_neon");
        ND_YAG_LASER = this.addItem(705, "laser.nd_yag");
        OPTICAL_LASER_CONTROL_UNIT = this.addItem(706, "optical_laser_control_unit");

        // Spintronic Circuit Components: ID 220-239
        SPIN_TRANSFER_TORQUE_MEMORY = this.addItem(720, "plate.spin_transfer_torque_memory");
        TOPOLOGICAL_INSULATOR_TUBE = this.addItem(721, "tube.topological_insulator");
        BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = this.addItem(722, "containment_unit.bose_einstein_condensate");
        BOSE_EINSTEIN_CONDENSATE = this.addItem(723, "bose_einstein_condensate");
        ESR_COMPUTATION_UNIT = this.addItem(724, "esr_computation_unit");

        // Cosmic Circuit Components: ID 240-259


        // Supra-Causal Circuit Components: ID 260-299


        // Supra-Chronal Circuit Components: ID 300-349

        // Power Components: ID 356-379
        NANO_POWER_IC_WAFER = this.addItem(856, "wafer.nano_power_integrated_circuit");
        PICO_POWER_IC_WAFER = this.addItem(857, "wafer.pico_power_integrated_circuit");
        FEMTO_POWER_IC_WAFER = this.addItem(858, "wafer.femto_power_integrated_circuit");
        NANO_POWER_IC = this.addItem(868, "plate.nano_power_integrated_circuit");
        PICO_POWER_IC = this.addItem(869, "plate.pico_power_integrated_circuit");
        FEMTO_POWER_IC = this.addItem(870, "plate.femto_power_integrated_circuit");

        // Circuit Boards: ID 380-419
        GOOWARE_BOARD = this.addItem(880, "board.gooware");
        OPTICAL_BOARD = this.addItem(881, "board.optical");
        SPINTRONIC_BOARD = this.addItem(882, "board.spintronic");
        GOOWARE_CIRCUIT_BOARD = this.addItem(883, "circuit_board.gooware");
        OPTICAL_CIRCUIT_BOARD = this.addItem(884, "circuit_board.optical");
        SPINTRONIC_CIRCUIT_BOARD = this.addItem(885, "circuit_board.spintronic");

        // SMDs: ID 420-479
        OPTICAL_CAPACITOR = this.addItem(900, "component.optical_smd.capacitor");
        OPTICAL_DIODE = this.addItem(901, "component.optical_smd.diode");
        OPTICAL_RESISTOR = this.addItem(902, "component.optical_smd.resistor");
        OPTICAL_TRANSISTOR = this.addItem(903, "component.optical_smd.transistor");
        OPTICAL_INDUCTOR = this.addItem(904, "component.optical_smd.inductor");

        SPINTRONIC_CAPACITOR = this.addItem(905, "component.spintronic_smd.capacitor");
        SPINTRONIC_DIODE = this.addItem(906, "component.spintronic_smd.diode");
        SPINTRONIC_RESISTOR = this.addItem(907, "component.spintronic_smd.resistor");
        SPINTRONIC_TRANSISTOR = this.addItem(908, "component.spintronic_smd.transistor");
        SPINTRONIC_INDUCTOR = this.addItem(909, "component.spintronic_smd.inductor");

        // Process-Specific Components: ID 500-999
        MAGNETRON = this.addItem(950, "magnetron");

        // Process Intermediary Items: ID 1000-1999
        CARBON_ALLOTROPE_MIXTURE = this.addItem(951, "mixture.carbon_allotrope");
        GRAPHENE_ALIGNED_CNT = this.addItem(952, "cnt.graphene_aligned");

    }
}
