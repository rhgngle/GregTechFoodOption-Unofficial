package gregtechfoodoption.recipe.chain;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtechfoodoption.GTFOMaterialHandler.*;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class CapletChain {
    public static void init() {

        // Gel Caplets
        FLUID_HEATER_RECIPES.recipeBuilder().EUt(2048).duration(280)
                .fluidInputs(Materials.Water.getFluid(1000))
                .circuitMeta(2)
                .fluidOutputs(HeatedWater.getFluid(1000))
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder().EUt(480).duration(200)
                .fluidInputs(HeatedWater.getFluid(1000))
                .inputs(GELATIN.getStackForm(8))
                .fluidOutputs(GelatinSolution.getFluid(1500))
                .buildAndRegister();
        EXTRACTOR_RECIPES.recipeBuilder().EUt(120).duration(100)
                .fluidInputs(GelatinSolution.getFluid(1000))
                .fluidOutputs(GelatinSolutionNoBubbles.getFluid(900))
                .buildAndRegister();
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder().EUt(120).duration(100)
                .fluidInputs(GelatinSolutionNoBubbles.getFluid(1000))
                .notConsumable(SKEWER.getStackForm(16))
                .notConsumable(IntCircuitIngredient.getIntegratedCircuit(1))
                .outputs(CAPLET_BODY.getStackForm(16))
                .buildAndRegister();
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder().EUt(120).duration(100)
                .fluidInputs(GelatinSolutionNoBubbles.getFluid(1000))
                .notConsumable(SKEWER.getStackForm(24))
                .notConsumable(IntCircuitIngredient.getIntegratedCircuit(2))
                .outputs(CAPLET_CAP.getStackForm(24))
                .buildAndRegister();

        // Cyanide
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(120).duration(100)
                .inputs(CAPLET_BODY.getStackForm(1))
                .inputs(SodiumCyanideSmall.get(1))
                .inputs(CAPLET_CAP.getStackForm(1))
                .outputs(CYANIDE_CAPLET.getStackForm(1))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(HydrogenCyanide.getFluid(1000))
                .outputs(SodiumCyanide.get(3))
                .fluidOutputs(Water.getFluid(1000))
                .duration(120).EUt(VA[LV]).buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .notConsumable(dust, Platinum)
                .fluidOutputs(HydrogenCyanide.getFluid(1000))
                .fluidOutputs(Water.getFluid(3000))
                .duration(120).EUt(VA[MV]).buildAndRegister();
        ModHandler.addShapelessRecipe("sodium_cyanide_small", SodiumCyanideSmall.get(4), SodiumCyanide.get());

        // Paracetamol
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(500)
                .fluidInputs(NitricAcid.getFluid(1000))
                .fluidInputs(Phenol.getFluid(5000))
                .fluidOutputs(Nitrophenols.getFluid(6000))
                .buildAndRegister();
        DISTILLATION_RECIPES.recipeBuilder().EUt(480).duration(10)
                .fluidInputs(Nitrophenols.getFluid(100))
                .outputs(IVNitrophenol.getItemStack(1))
                .outputs(IINitrophenol.getItemStack(1))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(80)
                .inputs(IVNitrophenol.getItemStack(10))
                .input(OrePrefix.springSmall, Materials.Iron)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .outputs(Aminophenol.getItemStack(9))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(500)
                .notConsumable(new IntCircuitIngredient(16))
                .fluidInputs(MethylAcetate.getFluid(1000))
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidOutputs(AceticAnhydride.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder().EUt(1800).duration(400)
                .notConsumable(new IntCircuitIngredient(16))
                .fluidInputs(AceticAnhydride.getFluid(1000))
                .inputs(Aminophenol.getItemStack(3))
                .outputs(Paracetamol.getItemStack(9))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(30).duration(20)
                .inputs(CAPLET_BODY.getStackForm())
                .inputs(ParacetamolSmall.getItemStack())
                .inputs(CAPLET_CAP.getStackForm())
                .outputs(PARACETAMOL_CAPLET.getStackForm())
                .buildAndRegister();
        ModHandler.addShapelessRecipe("paracetamol_small", ParacetamolSmall.getItemStack(4), Paracetamol.getItemStack());
        ModHandler.addShapelessRecipe("handful_paracetamol", HANDFUL_PARACETAMOL.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm(), PARACETAMOL_CAPLET.getStackForm());

    }
}