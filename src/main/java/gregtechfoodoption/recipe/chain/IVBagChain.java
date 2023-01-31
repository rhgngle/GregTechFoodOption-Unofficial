package gregtechfoodoption.recipe.chain;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtechfoodoption.GTFOMaterialHandler.*;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class IVBagChain {
    public static void init() {

        //N-phenyl-N-[1-(2-phenylethyl)piperidin-4-yl]propanamide
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(BenzylCyanide.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(4000))
                .notConsumable(dust, Platinum)
                .fluidOutputs(Phenylethylamine.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Chlorotrimethylsilane.getFluid(1000))
                .fluidOutputs(Allyltrimethylsilane.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(Phenylethylamine.getFluid(1000))
                .fluidInputs(Allyltrimethylsilane.getFluid(1000))
                .fluidInputs(Formaldehyde.getFluid(1000))
                .outputs(IVHydroxyIIIPhenylethylPiperidine.getItemStack(34))
                .fluidOutputs(Dimethylsilane.getFluid(1000))
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(IVHydroxyIIIPhenylethylPiperidine.getItemStack(34))
                .fluidInputs(OxalylChloride.getFluid(1000))
                .fluidInputs(DimethylSulfoxide.getFluid(1000))
                .outputs(IIIPhenylethylIVPiperidone.getItemStack(32))
                .fluidOutputs(HydrogenChloride.getFluid(2000))
                .fluidOutputs(DimethylSulfide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(CarbonMonoxide.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(IIIPhenylethylIVPiperidone.getItemStack(32))
                .fluidInputs(Aniline.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Platinum)
                .outputs(IVAnilinoIIIPhenylethylPiperidine.getItemStack(45))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        DISTILLATION_RECIPES.recipeBuilder().EUt(480).duration(5)
                .fluidInputs(PropionicAcid.getFluid(20))
                .fluidOutputs(PropionicAnhydride.getFluid(10))
                .fluidOutputs(Water.getFluid(10))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(IVAnilinoIIIPhenylethylPiperidine.getItemStack(45))
                .fluidInputs(PropionicAnhydride.getFluid(1000))
                .outputs(Greganyl.getItemStack(53))
                .fluidOutputs(PropionicAcid.getFluid(1000))
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Greganyl.getItemStack(53))
                .fluidInputs(CitricAcid.getFluid(1000))
                .fluidOutputs(GreganylCitrateSolution.getFluid(1000))
                .buildAndRegister();
        CANNER_RECIPES.recipeBuilder().EUt(30).duration(20)
                .inputs(IV_BAG.getStackForm())
                .fluidInputs(GreganylCitrateSolution.getFluid(250))
                .outputs(GREGANYL_CITRATE_IV_INJECTION.getStackForm())
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(Ethylene.getFluid(1000))
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(PropionicAcid.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().duration(110).EUt(1920)
                .fluidInputs(Dimethyldichlorosilane.getFluid(1000))
                .fluidInputs(Methane.getFluid(1000))
                .fluidOutputs(Chlorotrimethylsilane.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(2000))
                .buildAndRegister();
        CRACKING_RECIPES.recipeBuilder().duration(40).EUt(120)
                .fluidInputs(Hydrogen.getFluid(250))
                .fluidInputs(Dimethylformamide.getFluid(750))
                .fluidOutputs(Formaldehyde.getFluid(120))
                .fluidOutputs(Dimethylamine.getFluid(160))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().duration(100).EUt(120)
                .fluidInputs(Dimethylamine.getFluid(1000))
                .fluidInputs(MethylFormate.getFluid(1000))
                .fluidOutputs(Dimethylformamide.getFluid(1000))
                .fluidOutputs(Methanol.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(30).duration(60)
                .fluidInputs(SodiumFormate.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(FormicAcid.getFluid(1000))
                .output(dust, SodiumBisulfate, 7)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(30).duration(60)
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .notConsumable(new IntCircuitIngredient(0))
                .fluidOutputs(SodiumFormate.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(DimethylSulfide.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(DimethylSulfoxide.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().duration(120).EUt(480)
                .notConsumable(VanadiumOxide.getItemStack())
                .fluidInputs(Oxygen.getFluid(9000))
                .inputs(Glucose.getItemStack(24))
                .fluidOutputs(Water.getFluid(3000))
                .fluidOutputs(OxalicAcid.getFluid(3000))
                .buildAndRegister();
        CHEMICAL_BATH_RECIPES.recipeBuilder().duration(300).EUt(480)
                .input(dust, Sugar, 2)
                .fluidInputs(Water.getFluid(1000))
                .outputs(Glucose.getItemStack(24))
                .outputs(Fructose.getItemStack(24))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder().duration(240).EUt(120)
                .inputs(AmmoniumVanadate.getItemStack(18))
                .outputs(VanadiumOxide.getItemStack(7))
                .fluidOutputs(Ammonia.getFluid(2000))
                .blastFurnaceTemp(1200)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().duration(120).EUt(120)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .inputs(SodiumVanadate.getItemStack(8))
                .input(dust, AmmoniumChloride, 3)
                .outputs(AmmoniumVanadate.getItemStack(9))
                .fluidOutputs(VanadiumWasteSolution.getFluid(1000))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder().duration(150).EUt(120).blastFurnaceTemp(700)
                .inputs(VanadiumSlagDust.getItemStack(4))
                .input(dust, SodaAsh, 18)
                .outputs(SodiumVanadate.getItemStack(16))
                .fluidOutputs(CarbonMonoxide.getFluid(3000))
                .buildAndRegister();
        MACERATOR_RECIPES.recipeBuilder().duration(80).EUt(24)
                .inputs(VanadiumSlag.getItemStack(5))
                .output(dust, DarkAsh)
                .output(dustSmall, Rutile)
                .outputs(VanadiumSlagDust.getItemStack(2))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder().duration(220).EUt(120).blastFurnaceTemp(1500)
                .input(dust, VanadiumMagnetite, 4)
                .input(dust, Carbon)
                .output(ingot, Iron, 3)
                .outputs(VanadiumSlag.getItemStack(5))
                .fluidOutputs(CarbonMonoxide.getFluid(1000))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder().duration(120).EUt(30)
                .fluidInputs(VanadiumWasteSolution.getFluid(4000))
                .output(dust, Salt, 2)
                .output(dust, SodiumSulfate, 7)
                .chancedOutput(OreDictUnifier.get(dust, SiliconDioxide, 3), 5000, 1200)
                .blastFurnaceTemp(1200)
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(OxalicAcid.getFluid(1000))
                .inputs(PhosphorousPentachloride.getItemStack(7))
                .fluidOutputs(OxalylChloride.getFluid(1000))
                .fluidOutputs(PhosphorylChloride.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .input(dust, Phosphorus, 2)
                .fluidInputs(Chlorine.getFluid(5000))
                .outputs(PhosphorousPentachloride.getItemStack(7))
                .buildAndRegister();


    }
}
