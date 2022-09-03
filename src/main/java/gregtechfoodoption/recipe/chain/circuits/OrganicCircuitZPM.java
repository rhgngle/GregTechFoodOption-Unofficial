package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.ZPM;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitZPM {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[ZPM]).duration(300)
                        .input(circuit, Tier.ZPM, 1)
                        .input(OILY_POTATO_SLICE, 16)
                        .fluidInputs(GTFOMaterialHandler.Leninade.getFluid(750))
                        .output(ORGANIC_CIRCUIT_7, 1)
                        .buildAndRegister();
        }
}