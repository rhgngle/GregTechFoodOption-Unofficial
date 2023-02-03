package gregtechfoodoption.recipe.chain;

import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtechfoodoption.GTFOMaterialHandler.*;
import static gregtechfoodoption.GTFOMaterialHandler.GelatinSolutionNoBubbles;
import static gregtechfoodoption.item.GTFOMetaItem.*;

import gregtech.common.items.MetaItems;
import gregtech.common.items.MetaItems.*;

public class IngestionMediumChain {
    public static void init() {

        //IV Bag
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(100)
                .input(OrePrefix.foil, PolyvinylChloride, 2)
                .input(OrePrefix.pipeSmallItem, PolyvinylChloride)
                .input(OrePrefix.bolt, StainlessSteel)
                .outputs(IV_BAG.getStackForm(1))
                .buildAndRegister();
        CHEMICAL_BATH_RECIPES.recipeBuilder().EUt(30).duration(100)
                .fluidInputs(Ethanol.getFluid(100))
                .inputs(DIRTY_IV_BAG.getStackForm(1))
                .outputs(IV_BAG.getStackForm(1))
                .buildAndRegister();

        //Syringe
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(100)
                .input(MetaItems.GLASS_TUBE)
                .input(OrePrefix.bolt, StainlessSteel)
                .input(OrePrefix.plate, StainlessSteel)
                .input(OrePrefix.springSmall, StainlessSteel)
                .fluidInputs(SiliconeRubber.getFluid(144))
                .outputs(SYRINGE.getStackForm(1))
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder().EUt(30).duration(100)
                .fluidInputs(Ethanol.getFluid(100))
                .inputs(DIRTY_SYRINGE.getStackForm(1))
                .outputs(SYRINGE.getStackForm(1))
                .buildAndRegister();

        //Rolling Papers
        BENDER_RECIPES.recipeBuilder().EUt(120).duration(15)
                .input(OrePrefix.dust, Wood)
                .circuitMeta(1)
                .outputs(FLATTENED_WOOD_PULP.getStackForm(4))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().EUt(480).duration(300)
                .input(OrePrefix.dust, SodiumHydroxide, 2)
                .fluidInputs(HypochlorousAcid.getFluid(2000))
                .fluidOutputs(SodiumHypochlorite.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().EUt(120).duration(200)
                .inputs(FLATTENED_WOOD_PULP.getStackForm())
                .fluidInputs(SodiumHypochlorite.getFluid(100))
                .chancedOutput(BLEACHED_FLATTENED_PULP.getStackForm(), 6000, 250)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().EUt(3000).duration(1000)
                .inputs(BLEACHED_FLATTENED_PULP.getStackForm(8))
                .chancedOutput(ROLLING_PAPER.getStackForm(2), 5000, 200)
                .chancedOutput(ROLLING_PAPER.getStackForm(2), 7000, 250)
                .chancedOutput(ROLLING_PAPER.getStackForm(3), 10000, 0)
                .blastFurnaceTemp(477)
                .buildAndRegister();

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

    }
}
