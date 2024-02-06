package keqing.gtqtcore.common.items;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import keqing.gtqtcore.common.block.blocks.GTQTADVGlass;
import net.minecraft.item.ItemStack;

import java.util.List;

public class GTQTMetaItems {
    /*
    在此处提供物品的实例
    例如：
    public static MetaItem<?>.MetaValueItem 你物品的名字，记得全大写;
     */
    public static final List<MetaItem<?>> ITEMS = GTQTMetaItem1.getMetaItems();
    public static MetaItem<?>.MetaValueItem IMPREGNATED_SUBSTRATE;
    public static MetaItem<?>.MetaValueItem IMPREGNATED_EPOXY;
    public static MetaItem<?>.MetaValueItem MEMORY_CARD;
    public static MetaItem<?>.MetaValueItem IMPREGNATED_PLASTIC_SUBSTRATE;
    public static MetaItem<?>.MetaValueItem IMPREGNATED_GRAPHITE_RODS;
    public static MetaItem<?>.MetaValueItem IMPREGNATED_GRAPHITE_RODSA;
    public static MetaItem<?>.MetaValueItem COMMON_ALGAE;
    public static MetaItem<?>.MetaValueItem GREEN_ALGAE;
    public static MetaItem<?>.MetaValueItem RED_ALGAE;
    public static MetaItem<?>.MetaValueItem BROWN_ALGAE;
    public static MetaItem<?>.MetaValueItem GOLD_ALGAE;
    public static MetaItem<?>.MetaValueItem T_ALGAE;
    public static MetaItem<?>.MetaValueItem BIOLOGY_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem POTASSIUM_ETHYLATE;
    public static MetaItem<?>.MetaValueItem SODIUM_ETHYLATE;
    public static MetaItem<?>.MetaValueItem PINE_CONE;
    public static MetaItem<?>.MetaValueItem PINE_FRAGMENT;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ULV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_HV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_EV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_IV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LuV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ZPM;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UHV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UEV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UIV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UXV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_OpV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MAX;
    public static MetaItem<?>.MetaValueItem GRINDBALL_SOAPSTONE;
    public static MetaItem<?>.MetaValueItem GRINDBALL_ALUMINIUM;
    public static MetaItem<?>.MetaValueItem SODIUM_ETHYLXANTHATE;
    public static MetaItem<?>.MetaValueItem POTASSIUM_ETHYLXANTHATE;

    public static MetaItem<?>.MetaValueItem ROUGH_BIOLOGY_RESIN;
    public static MetaItem<?>.MetaValueItem PURIFIED_ALUMINIUM_MIXTURE;
    public static MetaItem<?>.MetaValueItem CELLULOSE_PULP;
    public static MetaItem<?>.MetaValueItem CELLULOSE_FIBER;
    public static MetaItem<?>.MetaValueItem CELLULOSE_FIBER_RED;
    public static MetaItem<?>.MetaValueItem CELLULOSE_FIBER_YELLOW;
    public static MetaItem<?>.MetaValueItem COMPOST;
    public static MetaItem<?>.MetaValueItem ALGAE_ACID;
    public static MetaItem<?>.MetaValueItem WOOD_PELLETS;
    public static MetaItem<?>.MetaValueItem PELLETS_MOULD;
    public static MetaItem<?>.MetaValueItem ALUMINIUM_PELLETS;
    public static MetaItem<?>.MetaValueItem IRON_CROP;
    public static MetaItem<?>.MetaValueItem TIN_CROP;
    public static MetaItem<?>.MetaValueItem COPPER_CROP;
    public static MetaItem<?>.MetaValueItem BRONZE_CROP;
    public static MetaItem<?>.MetaValueItem CARBON_CROP;
    public static MetaItem<?>.MetaValueItem GOLD_CROP;
    public static MetaItem<?>.MetaValueItem PROSPECTOR_UV;
    public static MetaItem<?>.MetaValueItem COSMIC_CAPACITOR;

    public static MetaItem<?>.MetaValueItem COSMIC_DIODE;
    public static MetaItem<?>.MetaValueItem COSMIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem COSMIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem COSMIC_INDUCTOR;

    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_DIODE;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_INDUCTOR;
    public static MetaItem<?>.MetaValueItem COSMIC_INFORMATION_MODULE;
    public static MetaItem<?>.MetaValueItem HOLOGRAPHIC_INFORMATION_IMC;
    public static MetaItem<?>.MetaValueItem SPACETIME_CONDENSER;
    public static MetaItem<?>.MetaValueItem LIGHT_CONE_MODULE;
    public static MetaItem<?>.MetaValueItem PHASE_CHANGE_MEMORY;
    public static MetaItem<?>.MetaValueItem OPTICAL_NOR_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem SPIN_TRANSFER_TORQUE_MEMORY;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_NAND_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem ATTO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem ATTO_PIC_CHIP;
    public static MetaItem<?>.MetaValueItem ZEPTO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem ZEPTO_PIC_CHIP;
    public static MetaItem<?>.MetaValueItem DUBNIUM_BOULE;
    public static MetaItem<?>.MetaValueItem DUBNIUM_WAFER;
    public static MetaItem<?>.MetaValueItem CUBIC_ZIRCONIA_EUROPIUM_BOULE;
    public static MetaItem<?>.MetaValueItem CUBIC_ZIRCONIA_EUROPIUM_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_CHIP;
    public static MetaItem<?>.MetaValueItem UHASOC_WAFER;
    public static MetaItem<?>.MetaValueItem UHASOC_CHIP;
    public static MetaItem<?>.MetaValueItem INTRAVITAL_SOC;
    public static MetaItem<?>.MetaValueItem STRONTIUM_CARBONATE_BOHRIUM_BOULE;
    public static MetaItem<?>.MetaValueItem STRONTIUM_CARBONATE_BOHRIUM_WAFER;
    public static MetaItem<?>.MetaValueItem STRONTIUM_CARBONATE_OPTICAL_WAFER;
    public static MetaItem<?>.MetaValueItem OPTICAL_IMC_BOARD;
    public static MetaItem<?>.MetaValueItem PHOTOELECTRON_SOC;
    public static MetaItem<?>.MetaValueItem HELIUM_LASER;
    public static MetaItem<?>.MetaValueItem NEON_LASER;
    public static MetaItem<?>.MetaValueItem ARGON_LASER;
    public static MetaItem<?>.MetaValueItem KRYPTON_LASER;
    public static MetaItem<?>.MetaValueItem XENON_LASER;
    public static MetaItem<?>.MetaValueItem RETICLE_ADVANCED_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem RETICLE_INTEGRATED_LOGIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_LOW_POWER_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_NAND_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_NANO_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem RETICLE_NOR_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_POWER_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_QBIT_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem RETICLE_RANDOM_ACCESS_MEMORY;
    public static MetaItem<?>.MetaValueItem RETICLE_SIMPLE_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_ULTRA_LOW_POWER_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_HIGH_POWER_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem RETICLE_HIGHLY_ADVANCED_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem RETICLE_SILICON;
    public static MetaItem<?>.MetaValueItem DEBUG_STRUCTURE_WRITER;
    public static MetaItem<?>.MetaValueItem DEBUG_STRUCTURE_BUILDER;
    public static MetaItem<?>.MetaValueItem COMPUTERMINER;
    public static MetaItem<?>.MetaValueItem COMPUTERCARGO;
    public static MetaItem<?>.MetaValueItem COMPUTERBUGGY;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER6;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER5;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER4;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER3;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER2;
    public static MetaItem<?>.MetaValueItem COMPUTERTIER1;
    public static MetaItem<?>.MetaValueItem LANDER_MODULE3;
    public static MetaItem<?>.MetaValueItem LANDER_MODULE2;
    public static MetaItem<?>.MetaValueItem LANDER_MODULE1;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATE;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATEA;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATEB;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATEC;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATED;
    public static MetaItem<?>.MetaValueItem HEAVY_ALLOY_PLATEE;
    public static MetaItem<?>.MetaValueItem AE_SILICON;
    public static MetaItem<?>.MetaValueItem AE_WAFER;
    public static MetaItem<?>.MetaValueItem AE_RETICLEA;
    public static MetaItem<?>.MetaValueItem AE_RETICLEB;
    public static MetaItem<?>.MetaValueItem AE_RETICLEC;
    public static MetaItem<?>.MetaValueItem AE_WAFERA;
    public static MetaItem<?>.MetaValueItem AE_WAFERB;
    public static MetaItem<?>.MetaValueItem AE_WAFERC;
    public static MetaItem<?>.MetaValueItem AE_A;
    public static MetaItem<?>.MetaValueItem AE_B;
    public static MetaItem<?>.MetaValueItem AE_C;
    // Crafting Components
    public static MetaItem<?>.MetaValueItem COMPONENT_GRINDER_BORON_NITRIDE;
    // Voltage Coils
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UHV;
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UEV;
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UIV;
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UXV;
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_OpV;
    public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_MAX;

    // Circuits
    // Gooware
    public static MetaItem<?>.MetaValueItem GOOWARE_PROCESSOR;
    public static MetaItem<?>.MetaValueItem GOOWARE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem GOOWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem GOOWARE_MAINFRAME;

    // Optical
    public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;

    // Spintronic
    public static MetaItem<?>.MetaValueItem SPINTRONIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_MAINFRAME;

    // Cosmic, name TBD
    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem COSMIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem COSMIC_MAINFRAME;

    // Supra-causal
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;

    // Supra-chronal
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_ULV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_LV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_MV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_HV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_EV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_IV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_LuV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_ZPM;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UHV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UEV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UIV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UXV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_OpV;
    public static MetaItem<?>.MetaValueItem SUPRACHRONAL_MAX;

    // Primitive Circuit Components
    public static MetaItem<?>.MetaValueItem VACUUM_TUBE_COMPONENTS;

    // Crystal Circuit Components
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_BOULE;
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_WAFER;
    public static MetaItem<?>.MetaValueItem ENGRAVED_RUBY_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_SAPPHIRE_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_DIAMOND_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_RUBY;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_DIAMOND;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_SAPPHIRE;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SYSTEM_ON_CHIP_SOCKET;

    // Gooware Circuit Components
    public static MetaItem<?>.MetaValueItem BZ_REACTION_CHAMBER;
    public static MetaItem<?>.MetaValueItem NONLINEAR_CHEMICAL_OSCILLATOR;

    // Optical Circuit Components

    public static MetaItem<?>.MetaValueItem OPTICAL_FIBER;
    public static MetaItem<?>.MetaValueItem DIELECTRIC_MIRROR;
    public static MetaItem<?>.MetaValueItem EMPTY_LASER_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HELIUM_NEON_LASER;
    public static MetaItem<?>.MetaValueItem ND_YAG_LASER;
    public static MetaItem<?>.MetaValueItem OPTICAL_LASER_CONTROL_UNIT;

    // Spintronic Circuit Components
    public static MetaItem<?>.MetaValueItem TOPOLOGICAL_INSULATOR_TUBE;
    public static MetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT;
    public static MetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE;
    public static MetaItem<?>.MetaValueItem ESR_COMPUTATION_UNIT;
    //  Covers
    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_ULV;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_ULV;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_ULV;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_ULV;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_ULV;
    public static MetaItem<?>.MetaValueItem EMITTER_ULV;
    public static MetaItem<?>.MetaValueItem SENSOR_ULV;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_ULV;
    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_MAX;
    public static MetaItem<?>.MetaValueItem EMITTER_MAX;
    public static MetaItem<?>.MetaValueItem SENSOR_MAX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_MAX;



    // Power Components
    public static MetaItem<?>.MetaValueItem NANO_POWER_IC_WAFER;
    public static MetaItem<?>.MetaValueItem PICO_POWER_IC_WAFER;
    public static MetaItem<?>.MetaValueItem FEMTO_POWER_IC_WAFER;
    public static MetaItem<?>.MetaValueItem NANO_POWER_IC;
    public static MetaItem<?>.MetaValueItem PICO_POWER_IC;
    public static MetaItem<?>.MetaValueItem FEMTO_POWER_IC;
    //  High Energy Physics items
    public static MetaItem<?>.MetaValueItem PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem RHENIUM_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem HYPOGEN_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem ACTINIUM_SUPERHYDRIDE_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem QUANTUM_ANOMALY;

    //  Biological
    public static MetaItem<?>.MetaValueItem ELECTROCHEMICAL_GRADIENT_RECORDER;
    public static MetaItem<?>.MetaValueItem ULTRA_MICRO_PHASE_SEPARATOR;
    public static MetaItem<?>.MetaValueItem QUANTUM_TUNNELING_MICROTUBULE;
    public static MetaItem<?>.MetaValueItem HYPERRIBOSOME;
    public static MetaItem<?>.MetaValueItem NEUTRON_ABSORBING_PROTEIN;
    public static MetaItem<?>.MetaValueItem SUPEREXCITED_CONDUCTIVE_POLYMER;
    public static MetaItem<?>.MetaValueItem DNA_ENCODER;
    public static MetaItem<?>.MetaValueItem DNA_DECODER;
    public static MetaItem<?>.MetaValueItem DNA_DECODE_ENCODER;

    public static MetaItem<?>.MetaValueItem NAQUADAH_ROD;
    public static MetaItem<?>.MetaValueItem NAQUADAH_ROD_DUAL;
    public static MetaItem<?>.MetaValueItem NAQUADAH_ROD_QUAD;
    public static MetaItem<?>.MetaValueItem POOR_NAQUADAH_ROD;
    public static MetaItem<?>.MetaValueItem POOR_NAQUADAH_ROD_DUAL;
    public static MetaItem<?>.MetaValueItem POOR_NAQUADAH_ROD_QUAD;
    public static MetaItem<?>.MetaValueItem THORIUM_ROD;
    public static MetaItem<?>.MetaValueItem THORIUM_ROD_DUAL;
    public static MetaItem<?>.MetaValueItem THORIUM_ROD_QUAD;
    public static MetaItem<?>.MetaValueItem POOR_THORIUM_ROD;
    public static MetaItem<?>.MetaValueItem POOR_THORIUM_ROD_DUAL;
    public static MetaItem<?>.MetaValueItem POOR_THORIUM_ROD_QUAD;

    public static MetaItem<?>.MetaValueItem MINING_DRONE_LV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_MV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_HV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_EV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_IV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_LuV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_ZPM;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_UV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_UHV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_UEV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_UIV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_UXV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_OpV;
    public static MetaItem<?>.MetaValueItem MINING_DRONE_MAX;

    // Circuit Boards
    public static MetaItem<?>.MetaValueItem GOOWARE_BOARD;
    public static MetaItem<?>.MetaValueItem OPTICAL_BOARD;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_BOARD;
    public static MetaItem<?>.MetaValueItem GOOWARE_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem OPTICAL_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_CIRCUIT_BOARD;

    // SMDs
    public static MetaItem<?>.MetaValueItem OPTICAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_DIODE;
    public static MetaItem<?>.MetaValueItem OPTICAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_INDUCTOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_DIODE;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_INDUCTOR;

    // Process-Specific Components
    public static MetaItem<?>.MetaValueItem MAGNETRON;

    // Process Intermediary Items
    // Nanotubes
    public static MetaItem<?>.MetaValueItem CARBON_ALLOTROPE_MIXTURE;
    public static MetaItem<?>.MetaValueItem GRAPHENE_ALIGNED_CNT;
    public static void initialization()
    {
        GTQTMetaItem1 item1 = new GTQTMetaItem1();
    }
    public static void initSubItems()
    {
        GTQTMetaItem1.registerItems();
    }



}
