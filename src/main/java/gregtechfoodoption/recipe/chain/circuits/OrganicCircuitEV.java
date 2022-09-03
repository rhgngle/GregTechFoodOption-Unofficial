package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitEV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[EV]).duration(300)
                        .input(circuit, Tier.EV, 1)
                        .inputs(GTFOMaterialHandler.KubideMeat.getItemStack(16))
                        .inputs(GTFOMaterialHandler.BargMeat.getItemStack(16))
                        .output(ORGANIC_CIRCUIT_4, 1)
                        .buildAndRegister();
        }
}