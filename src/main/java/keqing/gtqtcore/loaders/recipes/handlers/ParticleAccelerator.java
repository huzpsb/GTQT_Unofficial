package keqing.gtqtcore.loaders.recipes.handlers;

import keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static keqing.gtqtcore.api.recipes.GTQTcoreRecipeMaps.NUCLEOSYNTHESIS;
import static keqing.gtqtcore.api.unification.GCYSMaterials.*;
import static keqing.gtqtcore.api.unification.GTQTMaterials.*;
import static keqing.gtqtcore.common.items.GTQTMetaItems.*;


public class ParticleAccelerator {

    public static void init() {
        TARGET_CHAMBER();
        PARTICLE_ACCELERATOR_RECIPES();
        NUCLEOSYNTHESIS();

    }
    public static void NUCLEOSYNTHESIS()
    {
        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Deuterium.getFluid(1000))
                .fluidOutputs()
                .EUToStart(1000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidOutputs(Helium3.getFluid(1000))
                .fluidOutputs()
                .EUToStart(1000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium3.getFluid(1000))
                .fluidInputs(Helium3.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .fluidOutputs()
                .EUToStart(1000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidInputs(Tritium.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs()
                .EUToStart(2000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Tritium.getFluid(1000))
                .fluidInputs(Tritium.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs()
                .EUToStart(3000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidInputs(Helium3.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .EUToStart(4000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Lithium7.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .EUToStart(5000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidInputs(Lithium7.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .EUToStart(6000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidInputs(Deuterium.getFluid(1000))
                .fluidOutputs(Tritium.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .EUToStart(7000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium3.getFluid(1000))
                .fluidInputs(Lithium6.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .EUToStart(8000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Lithium6.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .fluidOutputs(Helium3.getFluid(1000))
                .EUToStart(9000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Boron.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .EUToStart(10000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Carbon.getFluid(1000))
                .fluidOutputs(Nitrogen.getFluid(1000))
                .EUToStart(11000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(Nitrogen.getFluid(1000))
                .fluidOutputs(Carbon.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .EUToStart(12000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Helium.getFluid(1000))
                .fluidOutputs(Carbon.getFluid(1000))
                .EUToStart(13000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Carbon.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .EUToStart(14000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Neon.getFluid(1000))
                .EUToStart(15000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Neon.getFluid(1000))
                .fluidOutputs(Magnesium.getFluid(1000))
                .EUToStart(16000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Magnesium.getFluid(1000))
                .fluidOutputs(Silicon.getFluid(1000))
                .EUToStart(17000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Silicon.getFluid(1000))
                .fluidOutputs(Sulfur.getFluid(1000))
                .EUToStart(18000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Sulfur.getFluid(1000))
                .fluidOutputs(Argon.getFluid(1000))
                .EUToStart(19000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Argon.getFluid(1000))
                .fluidOutputs(Calcium.getFluid(1000))
                .EUToStart(20000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Calcium.getFluid(1000))
                .fluidOutputs(Titanium.getFluid(1000))
                .EUToStart(21000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Titanium.getFluid(1000))
                .fluidOutputs(Chrome.getFluid(1000))
                .EUToStart(22000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Chrome.getFluid(1000))
                .fluidOutputs(Iron.getFluid(1000))
                .EUToStart(23000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
            .input(MUON)
            .fluidInputs(Helium.getFluid(1000))
            .fluidInputs(Iron.getFluid(1000))
            .fluidOutputs(Nickel.getFluid(1000))
            .EUToStart(24000)
            .Scattering(8)
            .duration(100)
            .EUt(7680)
            .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Silicon.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .EUToStart(25000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(MUON)
                .fluidInputs(Carbon.getFluid(1000))
                .fluidInputs(Carbon.getFluid(1000))
                .fluidOutputs(Sodium.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .EUToStart(26000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        //////////////////////////
        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Iron.getFluid(1000))
                .fluidOutputs(Cobalt.getFluid(1000))
                .EUToStart(30000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Cobalt.getFluid(1000))
                .fluidOutputs(Copper.getFluid(1000))
                .EUToStart(31000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Nickel.getFluid(1000))
                .fluidOutputs(Copper.getFluid(1000))
                .EUToStart(32000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Copper.getFluid(1000))
                .fluidOutputs(Zinc.getFluid(1000))
                .EUToStart(33000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Zinc.getFluid(1000))
                .fluidOutputs(Arsenic.getFluid(1000))
                .EUToStart(34000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Arsenic.getFluid(1000))
                .fluidOutputs(Strontium.getFluid(1000))
                .EUToStart(35000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Zircon.getFluid(1000))
                .fluidOutputs(Molybdenum.getFluid(1000))
                .EUToStart(36000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Molybdenum.getFluid(1000))
                .fluidOutputs(Ruthenium.getFluid(1000))
                .EUToStart(37000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Ruthenium.getFluid(1000))
                .fluidOutputs(Silver.getFluid(1000))
                .EUToStart(38000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Silver.getFluid(1000))
                .fluidOutputs(Tin.getFluid(1000))
                .EUToStart(39000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Tin.getFluid(1000))
                .fluidOutputs(Iodine.getFluid(1000))
                .EUToStart(40000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Iodine.getFluid(1000))
                .fluidOutputs(Caesium.getFluid(1000))
                .EUToStart(41000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Caesium.getFluid(1000))
                .fluidOutputs(Magnesium.getFluid(1000))
                .EUToStart(42000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Magnesium.getFluid(1000))
                .fluidOutputs(Samarium.getFluid(1000))
                .EUToStart(43000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Magnesium.getFluid(1000))
                .fluidOutputs(Terbium.getFluid(1000))
                .EUToStart(44000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Europium.getFluid(1000))
                .fluidOutputs(Terbium.getFluid(1000))
                .EUToStart(45000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Terbium.getFluid(1000))
                .fluidOutputs(Erbium.getFluid(1000))
                .EUToStart(46000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Erbium.getFluid(1000))
                .fluidOutputs(Ytterbium.getFluid(1000))
                .EUToStart(47000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Ytterbium.getFluid(1000))
                .fluidOutputs(Hafnium.getFluid(1000))
                .EUToStart(48000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Hafnium.getFluid(1000))
                .fluidOutputs(Tungsten.getFluid(1000))
                .EUToStart(49000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Tungsten.getFluid(1000))
                .fluidOutputs(Osmium.getFluid(1000))
                .EUToStart(50000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Osmium.getFluid(1000))
                .fluidOutputs(Iridium.getFluid(1000))
                .EUToStart(51000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Iridium.getFluid(1000))
                .fluidOutputs(Platinum.getFluid(1000))
                .EUToStart(52000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Platinum.getFluid(1000))
                .fluidOutputs(Gold.getFluid(1000))
                .EUToStart(53000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Gold.getFluid(1000))
                .fluidOutputs(Mercury.getFluid(1000))
                .EUToStart(54000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Mercury.getFluid(1000))
                .fluidOutputs(Lead.getFluid(1000))
                .EUToStart(55000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Lead.getFluid(1000))
                .fluidOutputs(Bismuth.getFluid(1000))
                .EUToStart(56000)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Bismuth.getFluid(1000))
                .fluidOutputs(Polonium.getFluid(1000))
                .EUToStart(57000)
                .Scattering(7)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Polonium.getFluid(1000))
                .fluidOutputs(Radium.getFluid(1000))
                .EUToStart(58000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Radium.getFluid(1000))
                .fluidOutputs(Thorium.getFluid(1000))
                .EUToStart(59000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Thorium.getFluid(1000))
                .fluidOutputs(Uranium238.getFluid(1000))
                .EUToStart(60000)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Uranium238.getFluid(1000))
                .fluidOutputs(Plutonium242.getFluid(1000))
                .EUToStart(61000)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Plutonium242.getFluid(1000))
                .fluidOutputs(Curium247.getFluid(1000))
                .EUToStart(62000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.NUCLEOSYNTHESIS.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Curium247.getFluid(1000))
                .fluidOutputs(Californium252.getFluid(1000))
                .EUToStart(63000)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();


    }
    public static void PARTICLE_ACCELERATOR_RECIPES()
    {
        //0-100000
        GTQTcoreRecipeMaps.PARTICLE_ACCELERATOR_RECIPES.recipeBuilder()
                .chancedOutput(ARROW_UP_MKI,100,100)
                .chancedOutput(ARROW_UP_MKII,10,10)
                .chancedOutput(ARROW_UP_MKIII,1,1)
                .circuitMeta(1)
                .CWUt(1000)
                .duration(1200)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.PARTICLE_ACCELERATOR_RECIPES.recipeBuilder()
                .chancedOutput(ARROW_DOWN_MKI,100,100)
                .chancedOutput(ARROW_DOWN_MKII,10,10)
                .chancedOutput(ARROW_DOWN_MKIII,1,1)
                .circuitMeta(2)
                .CWUt(1000)
                .duration(1200)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.PARTICLE_ACCELERATOR_RECIPES.recipeBuilder()
                .chancedOutput(ARROW_LEFT_MKI,100,100)
                .chancedOutput(ARROW_LEFT_MKII,10,10)
                .chancedOutput(ARROW_LEFT_MKIII,1,1)
                .circuitMeta(3)
                .CWUt(1000)
                .duration(1200)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.PARTICLE_ACCELERATOR_RECIPES.recipeBuilder()
                .chancedOutput(ARROW_RIGHT_MKI,100,100)
                .chancedOutput(ARROW_RIGHT_MKII,10,10)
                .chancedOutput(ARROW_RIGHT_MKIII,1,1)
                .circuitMeta(4)
                .CWUt(1000)
                .duration(1200)
                .EUt(7680)
                .buildAndRegister();
    }
    public static void TARGET_CHAMBER()
    {
        //0-100000
        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Boron)
                .output(ALPHA)
                .EUToStart(400)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Beryllium)
                .output(dust,Lithium7)
                .output(ALPHA)
                .EUToStart(1000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Aluminium)
                .output(dust,Silicon)
                .output(PHOTON)
                .EUToStart(1500)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Tritium.getFluid(1000))
                .output(HELION)
                .output(NEUTRON)
                .EUToStart(2400)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Fluorine.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .output(ALPHA)
                .EUToStart(4000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Copper)
                .output(dust,Zinc)
                .output(PHOTON)
                .circuitMeta(1)
                .EUToStart(4500)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Cobalt)
                .output(dust,Nickel)
                .output(PHOTON)
                .EUToStart(4500)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Deuterium.getFluid(1000))
                .circuitMeta(1)
                .output(HELION)
                .output(PHOTON)
                .EUToStart(6000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Osmium)
                .output(dust,Iridium)
                .output(NEUTRON)
                .EUToStart(1500)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Manganese)
                .output(dust,Iron)
                .output(PHOTON)
                .EUToStart(9700)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Deuterium.getFluid(1000))
                .output(PROTON)
                .output(NEUTRON)
                .circuitMeta(2)
                .EUToStart(6000)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Thorium)
                .output(dust,Protactinium)
                .output(NEUTRON)
                .EUToStart(10000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Uranium238)
                .output(dust,Neptunium)
                .output(NEUTRON)
                .EUToStart(10000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Gold)
                .fluidOutputs(Mercury.getFluid(1000))
                .output(NEUTRON)
                .EUToStart(10000)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Plutonium242)
                .output(dust,Americium241)
                .output(NEUTRON)
                .EUToStart(10000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Bismuth)
                .output(dust,Polonium)
                .output(PHOTON)
                .EUToStart(4700)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Boron)
                .output(dust,Carbon)
                .output(PHOTON)
                .EUToStart(150)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Calcium)
                .output(dust,Potassium)
                .output(PROTON)
                .EUToStart(7850)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(dust,Beryllium)
                .output(ALPHA)
                .circuitMeta(1)
                .EUToStart(8930)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();


        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(dust,Carbon)
                .output(ALPHA)
                .output(PROTON)
                .circuitMeta(1)
                .EUToStart(6140)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .output(dust,Aluminium)
                .input(dust,Silicon)
                .output(PROTON)
                .EUToStart(1500)
                .Scattering(8)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();


        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Uranium238)
                .output(dust,Neptunium236)
                .output(NEUTRON)
                .EUToStart(10000)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Bismuth)
                .output(dust,Lead)
                .output(NEUTRON)
                .EUToStart(10900)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Gold)
                .output(dust,Platinum)
                .output(ALPHA)
                .EUToStart(9900)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Calcium)
                .fluidOutputs(Argon.getFluid(1000))
                .output(PROTON)
                .EUToStart(18900)
                .Scattering(5)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(dust,Carbon)
                .output(PROTON)
                .output(ALPHA)
                .circuitMeta(2)
                .EUToStart(9700)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Nitrogen.getFluid(1000))
                .output(ALPHA)
                .output(PROTON)
                .circuitMeta(2)
                .EUToStart(20240)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Copper)
                .output(dust,Nickel)
                .output(ALPHA)
                .output(PROTON)
                .EUToStart(4240)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PROTON)
                .input(dust,Aluminium)
                .output(dust,Sodium)
                .output(PROTON)
                .output(NEUTRON)
                .circuitMeta(2)
                .EUToStart(37440)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        //////
        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Helium3.getFluid(1000))
                .output(PROTON)
                .output(TRITON)
                .EUToStart(7640)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Beryllium)
                .output(dust,Lithium7)
                .output(PROTON)
                .EUToStart(2150)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Sulfur)
                .output(dust,Silicon)
                .output(ALPHA)
                .EUToStart(2250)
                .Scattering(6)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Zinc)
                .output(dust,Nickel)
                .output(ALPHA)
                .EUToStart(4880)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(dust,Copper)
                .output(ALPHA)
                .EUToStart(4880)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Iron)
                .output(dust,Chrome)
                .output(ALPHA)
                .EUToStart(1350)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Chrome)
                .output(dust,Titanium)
                .output(ALPHA)
                .EUToStart(1350)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Copper)
                .output(dust,Nickel)
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(1350)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Potassium)
                .fluidOutputs(Chlorine.getFluid(1000))
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(1350)
                .Scattering(3)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Zircon)
                .output(dust,Strontium)
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(13050)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Platinum)
                .output(dust,Osmium)
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(5760)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Terbium)
                .output(dust,Europium)
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(57600)
                .Scattering(4)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Zircon)
                .output(dust,Yttrium)
                .output(DEUTERON)
                .EUToStart(5620)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(dust,Beryllium)
                .output(ALPHA)
                .EUToStart(10800)
                .Scattering(1)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Niobium)
                .output(dust,Yttrium)
                .output(NEUTRON)
                .output(ALPHA)
                .EUToStart(64804)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Manganese)
                .output(dust,Chrome)
                .output(TRITON)
                .EUToStart(12604)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Cobalt)
                .output(dust,Iron)
                .output(TRITON)
                .EUToStart(24560)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Yttrium)
                .output(dust,Strontium)
                .output(DEUTERON)
                .EUToStart(13840)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Sodium)
                .fluidOutputs(Neon.getFluid(1000))
                .output(DEUTERON)
                .EUToStart(4860)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Gold)
                .output(dust,Iridium)
                .output(ALPHA)
                .output(NEUTRON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .fluidOutputs(Helium3.getFluid(1000))
                .output(HELION)
                .output(NEUTRON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(NEUTRON)
                .input(dust,Bismuth)
                .output(dust,Lead)
                .output(TRITON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        //////////
        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Tungsten)
                .output(dust,Hafnium)
                .output(ALPHA)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Zircon)
                .output(dust,Yttrium)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Iron)
                .output(dust,Manganese)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Yttrium)
                .output(dust,Strontium)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Aluminium)
                .output(dust,Magnesium)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Silicon)
                .output(dust,Aluminium)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Calcium)
                .output(dust,Potassium)
                .output(PROTON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .input(dust,Copper)
                .output(dust,Nickel)
                .output(PROTON)
                .output(NEUTRON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(dust,Carbon)
                .output(PROTON)
                .output(NEUTRON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        GTQTcoreRecipeMaps.TARGET_CHAMBER.recipeBuilder()
                .input(PHOTON)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(PROTON)
                .output(NEUTRON)
                .EUToStart(19900)
                .Scattering(2)
                .duration(100)
                .EUt(7680)
                .buildAndRegister();

        ////////////
    }


}
