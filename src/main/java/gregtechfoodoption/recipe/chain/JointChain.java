package gregtechfoodoption.recipe.chain;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Asbestos;
import static gregtechfoodoption.GTFOMaterialHandler.SodiumHypochlorite;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class JointChain {
    public static void init() {

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

        ModHandler.addShapelessRecipe("asbestos_joint", ASBESTOS_JOINT.getStackForm(2), ROLLING_PAPER.getStackForm(), ROLLING_PAPER.getStackForm(), OreDictUnifier.get(OrePrefix.dust, Asbestos));

    }
}
