package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitUHV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UHV]).duration(300)
                        .input(circuit, Tier.UHV, 1)
                        .input(SYALS, 48)
                        .input(KEBAB_CHUM_BUCKET, 16)
                        .output(ORGANIC_CIRCUIT_9, 1)
                        .buildAndRegister();
        }
}