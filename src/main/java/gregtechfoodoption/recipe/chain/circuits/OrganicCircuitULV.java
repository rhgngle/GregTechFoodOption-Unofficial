package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;

import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitULV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LV]).duration(75)
                        .input(circuit, Tier.ULV, 1)
                        .input(LEMON, 4)
                        .input(LIME, 4)
                        .output(ORGANIC_CIRCUIT_15, 1)
                        .buildAndRegister();
        }
}