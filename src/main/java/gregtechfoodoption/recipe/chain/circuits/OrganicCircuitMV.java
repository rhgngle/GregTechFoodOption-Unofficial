package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.*;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitMV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[MV]).duration(300)
                        .input(circuit, Tier.MV, 1)
                        .inputs(GTFOMaterialHandler.Zest.getItemStack(16))
                        .output(ORGANIC_CIRCUIT_2, 1)
                        .buildAndRegister();
        }
}