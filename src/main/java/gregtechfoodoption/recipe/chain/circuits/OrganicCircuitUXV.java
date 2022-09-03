package gregtechfoodoption.recipe.chain.circuits;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.common.items.MetaItems.BOTTLE_PURPLE_DRINK;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuitUXV {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UXV]).duration(300)
                        .input(circuit, Tier.UXV, 1)
                        .input(BOTTLE_PURPLE_DRINK, 32)
                        .fluidInputs(GTFOMaterialHandler.GlyoxylicAcid.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_12, 1)
                        .buildAndRegister();
        }
}