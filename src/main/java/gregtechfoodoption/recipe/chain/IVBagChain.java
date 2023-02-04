package gregtechfoodoption.recipe.chain;

import gregtech.api.metatileentity.multiblock.CleanroomType;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtechfoodoption.GTFOMaterialHandler.*;
import static gregtechfoodoption.item.GTFOMetaItem.*;
import static gregtechfoodoption.recipe.GTFORecipeMaps.INCUBATOR_RECIPES;

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
                .outputs(Hydroxyphenylethylpiperidine.getItemStack(34))
                .fluidOutputs(Dimethylsilane.getFluid(1000))
                .buildAndRegister();
        ELECTROLYZER_RECIPES.recipeBuilder().EUt(30).duration(200)
                .fluidInputs(Dimethylsilane.getFluid(1000))
                .output(dust, Silicon)
                .output(dust, Carbon, 2)
                .fluidOutputs(Hydrogen.getFluid(8000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(Methanol.getFluid(2000))
                .fluidInputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(DimethylSulfide.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Hydroxyphenylethylpiperidine.getItemStack(34))
                .fluidInputs(OxalylChloride.getFluid(1000))
                .fluidInputs(DimethylSulfoxide.getFluid(1000))
                .outputs(Phenylethylpiperidone.getItemStack(32))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .fluidOutputs(DimethylSulfide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(CarbonMonoxide.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Phenylethylpiperidone.getItemStack(32))
                .fluidInputs(Aniline.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Platinum)
                .outputs(Anilinophenylethylpiperidine.getItemStack(45))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        DISTILLATION_RECIPES.recipeBuilder().EUt(480).duration(5)
                .fluidInputs(PropionicAcid.getFluid(20))
                .fluidOutputs(PropionicAnhydride.getFluid(10))
                .fluidOutputs(Water.getFluid(10))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Anilinophenylethylpiperidine.getItemStack(45))
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
                .inputs(SodiumFormate.getItemStack(5))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(FormicAcid.getFluid(1000))
                .output(dust, SodiumBisulfate, 7)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(30).duration(60)
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .notConsumable(new IntCircuitIngredient(0))
                .outputs(SodiumFormate.getItemStack(5))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(DimethylSulfide.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(DimethylSulfoxide.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().duration(400).EUt(480)
                .inputs(SodiumFormate.getItemStack(10))
                .fluidInputs(Water.getFluid(2000))
                .outputs(OxalicAcid.getItemStack(8))
                .output(dust, SodiumHydroxide, 6)
                .fluidOutputs(Hydrogen.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_BATH_RECIPES.recipeBuilder().duration(300).EUt(480)
                .input(dust, Sugar, 2)
                .fluidInputs(Water.getFluid(1000))
                .outputs(Glucose.getItemStack(24))
                .outputs(Fructose.getItemStack(24))
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(OxalicAcid.getItemStack(8))
                .inputs(PhosphorusPentachloride.getItemStack(7))
                .fluidOutputs(OxalylChloride.getFluid(1000))
                .fluidOutputs(PhosphorylChloride.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .input(dust, Phosphorus, 2)
                .fluidInputs(Chlorine.getFluid(5000))
                .outputs(PhosphorusPentachloride.getItemStack(7))
                .buildAndRegister();

        //Hydroxycobalamin
        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumNitrateSolution.getFluid(1000))
                .outputs(SodiumNitrite.getItemStack(4))
                .fluidOutputs(Oxygen.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(30)
                .duration(300)
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .inputs(SodiumNitrate.getItemStack(5))
                .fluidOutputs(SodiumNitrateSolution.getFluid(1000))
                .EUt(120)
                .duration(80)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(NitricAcid.getFluid(1000))
                .outputs(SodiumNitrate.getItemStack(5))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(60)
                .duration(8)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Fructose.getItemStack(24))
                .notConsumable(HydrochloricAcid.getFluid(10))
                .outputs(LevulinicAcid.getItemStack(16))
                .fluidOutputs(FormicAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(LevulinicAcid.getItemStack(16))
                .fluidInputs(Methanol.getFluid(1000))
                .notConsumable(SulfuricAcid.getFluid(10))
                .outputs(MethylLevulinate.getItemStack(19))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .input(dust, Copper)
                .fluidInputs(Chlorine.getFluid(2000))
                .outputs(CupricChloride.getItemStack(3))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(MethylLevulinate.getItemStack(19))
                .inputs(CupricChloride.getItemStack(3))
                .outputs(MethylChlorolevulinate.getItemStack(19))
                .output(dust, Copper)
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .buildAndRegister();
        DISTILLATION_RECIPES.recipeBuilder().EUt(480).duration(50)
                .fluidInputs(PhthalicAcid.getFluid(200))
                .outputs(PhthalicAnhydride.getItemStack(3))
                .fluidOutputs(Water.getFluid(200))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(PhthalicAnhydride.getItemStack(15))
                .fluidInputs(Ammonia.getFluid(1000))
                .outputs(Phthalimide.getItemStack(16))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Phthalimide.getItemStack(16))
                .input(dust, Potassium)
                .outputs(PotassiumPhthalimide.getItemStack(16))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(MethylChlorolevulinate.getItemStack(19))
                .inputs(PotassiumPhthalimide.getItemStack(16))
                .fluidInputs(Water.getFluid(3000))
                .notConsumable(HydrochloricAcid.getFluid(10))
                .outputs(AminolevulinicAcid.getItemStack(1))
                .fluidOutputs(PhthalicAcid.getFluid(1000))
                .fluidOutputs(Methanol.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(Dimethylbenzene.getFluid(1000))
                .fluidInputs(NitrationMixture.getFluid(4000))
                .outputs(Dinitrodimethylbenzene.getItemStack(22))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Dinitrodimethylbenzene.getItemStack(22))
                .fluidInputs(Hydrogen.getFluid(12000))
                .notConsumable(dust, Nickel)
                .outputs(Dimethylphenylenediamine.getItemStack(22))
                .fluidOutputs(Water.getFluid(4000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(MethylFormate.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .notConsumable(dust, SodiumHydroxide)
                .fluidOutputs(FormicAcid.getFluid(1000))
                .fluidOutputs(Methanol.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Dimethylphenylenediamine.getItemStack(22))
                .fluidInputs(FormicAcid.getFluid(1000))
                .outputs(Dimethylbenzimidazole.getItemStack(1))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .input(dust, CobaltOxide, 2)
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .outputs(CobaltChloride.getItemStack(1))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(CobaltChloride.getItemStack(1))
                .inputs(Dimethylbenzimidazole.getItemStack(1))
                .inputs(AminolevulinicAcid.getItemStack(1))
                .fluidInputs(RawGrowthMedium.getFluid(4000))
                .fluidOutputs(RawCobalaminSelectiveGrowthMedium.getFluid(4000))
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();
        FLUID_HEATER_RECIPES.recipeBuilder().EUt(480).duration(400)
                .fluidInputs(RawCobalaminSelectiveGrowthMedium.getFluid(100))
                .circuitMeta(1)
                .fluidOutputs(SterileCobalaminSelectiveGrowthMedium.getFluid(100))
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();
        INCUBATOR_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(new ItemStack(Blocks.DIRT, 1))
                .fluidInputs(Bacteria.getFluid(1000))
                .chancedOutput(BacillusMegabacterium.getItemStack(1), 100, 50)
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();
        INCUBATOR_RECIPES.recipeBuilder().EUt(480).duration(400)
                .notConsumable(BacillusMegabacterium.getItemStack(1))
                .fluidInputs(SterileGrowthMedium.getFluid(100))
                .outputs(BacillusMegabacterium.getItemStack(1))
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();
        FERMENTING_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(BacillusMegabacterium.getItemStack(1))
                .fluidInputs(SterileCobalaminSelectiveGrowthMedium.getFluid(100))
                .outputs(CobalaminMixture.getItemStack(16))
                .fluidOutputs(Water.getFluid(100))
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(CobalaminMixture.getItemStack(16))
                .inputs(SodiumCyanide.getItemStack(3))
                .fluidInputs(DistilledWater.getFluid(100))
                .notConsumable(SodiumNitrite.getItemStack(1))
                .outputs(Cyanocobalamin.getItemStack(16))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Cyanocobalamin.getItemStack(16))
                .input(dust, Zinc)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .outputs(Cobalamin.getItemStack(16))
                .outputs(ZincSulfate.getItemStack(6))
                .fluidOutputs(HydrogenCyanide.getFluid(1000))
                .buildAndRegister();
        ELECTROLYZER_RECIPES.recipeBuilder().EUt(30).duration(60)
                .inputs(ZincSulfate.getItemStack(6))
                .output(dust, Zinc)
                .output(dust, Sulfur)
                .fluidOutputs(Oxygen.getFluid(4000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Cobalamin.getItemStack(16))
                .fluidInputs(Oxygen.getFluid(1000))
                .outputs(Hydroxycobalamin.getItemStack(2))
                .buildAndRegister();
        CANNER_RECIPES.recipeBuilder().EUt(480).duration(400)
                .inputs(Hydroxycobalamin.getItemStack(1))
                .inputs(IV_BAG.getStackForm(1))
                .fluidInputs(DistilledWater.getFluid(250))
                .outputs(HYDROXYCOBALAMIN_IV_INJECTION.getStackForm(1))
                .buildAndRegister();


    }
}
