package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;

import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitLuV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LuV]).duration(300)
                        .input(circuit, Tier.IV, 1)
                        .input(LENINADE, 16)
                        .output(ORGANIC_CIRCUIT_6, 1)
                        .buildAndRegister();
        }
}