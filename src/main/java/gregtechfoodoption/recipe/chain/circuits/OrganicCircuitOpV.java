package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.OpV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitOpV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[OpV]).duration(300)
                        .input(circuit, Tier.OpV, 1)
                        .input(TUNGSTENSTEEL_APPLE, 64)
                        .fluidInputs(GTFOMaterialHandler.PurpleDrink.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_13, 1)
                        .buildAndRegister();
        }
}