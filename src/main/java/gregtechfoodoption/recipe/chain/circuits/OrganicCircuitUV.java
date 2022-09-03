package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitUV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UV]).duration(300)
                        .input(circuit, Tier.UV, 1)
                        .input(REDUCED_FAT_CHIPS, 16)
                        .fluidInputs(GTFOMaterialHandler.GlyoxylicAcid.getFluid(2250))
                        .output(ORGANIC_CIRCUIT_8, 1)
                        .buildAndRegister();
        }
}