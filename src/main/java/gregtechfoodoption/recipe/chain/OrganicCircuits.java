package gregtechfoodoption.recipe.chain;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.*;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.common.items.MetaItems.BOTTLE_PURPLE_DRINK;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuits {
        public static void init() {
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LV]).duration(75)
                        .input(circuit, Tier.ULV, 1)
                        .input(LEMON, 4)
                        .input(LIME, 4)
                        .output(ORGANIC_CIRCUIT_15, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LV]).duration(300)
                        .input(circuit, Tier.LV, 1)
                        .input(LEMON, 16)
                        .input(LIME, 16)
                        .output(ORGANIC_CIRCUIT_1, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[MV]).duration(300)
                        .input(circuit, Tier.MV, 1)
                        .inputs(GTFOMaterialHandler.Zest.getItemStack(16))
                        .output(ORGANIC_CIRCUIT_2, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[HV]).duration(300)
                        .input(circuit, Tier.HV, 1)
                        .input(PEELED_BANANA, 16)
                        .output(ORGANIC_CIRCUIT_3, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[EV]).duration(300)
                        .input(circuit, Tier.EV, 1)
                        .inputs(GTFOMaterialHandler.KubideMeat.getItemStack(16))
                        .inputs(GTFOMaterialHandler.BargMeat.getItemStack(16))
                        .output(ORGANIC_CIRCUIT_4, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[IV]).duration(300)
                        .input(circuit, Tier.IV, 1)
                        .input(VODKA, 16)
                        .output(ORGANIC_CIRCUIT_5, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LuV]).duration(300)
                        .input(circuit, Tier.IV, 1)
                        .input(LENINADE, 16)
                        .output(ORGANIC_CIRCUIT_6, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[ZPM]).duration(300)
                        .input(circuit, Tier.ZPM, 1)
                        .input(OILY_POTATO_SLICE, 16)
                        .fluidInputs(GTFOMaterialHandler.Leninade.getFluid(750))
                        .output(ORGANIC_CIRCUIT_7, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UV]).duration(300)
                        .input(circuit, Tier.UV, 1)
                        .input(REDUCED_FAT_CHIPS, 16)
                        .fluidInputs(GTFOMaterialHandler.GlyoxylicAcid.getFluid(2250))
                        .output(ORGANIC_CIRCUIT_8, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UHV]).duration(300)
                        .input(circuit, Tier.UHV, 1)
                        .input(SYALS, 48)
                        .input(KEBAB_CHUM_BUCKET, 16)
                        .output(ORGANIC_CIRCUIT_9, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UEV]).duration(300)
                        .input(circuit, Tier.UEV, 1)
                        .input(CHEDDAR_SLICE, 64)
                        .output(ORGANIC_CIRCUIT_10, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UIV]).duration(300)
                        .input(circuit, Tier.UIV, 1)
                        .input(PIZZA_VEGGIE, 48)
                        .output(ORGANIC_CIRCUIT_11, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[UXV]).duration(300)
                        .input(circuit, Tier.UXV, 1)
                        .input(BOTTLE_PURPLE_DRINK, 32)
                        .fluidInputs(GTFOMaterialHandler.GlyoxylicAcid.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_12, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[OpV]).duration(300)
                        .input(circuit, Tier.OpV, 1)
                        .input(TUNGSTENSTEEL_APPLE, 64)
                        .fluidInputs(GTFOMaterialHandler.PurpleDrink.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_13, 1)
                        .buildAndRegister();
                CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[MAX]).duration(300)
                        .input(circuit, Tier.MAX, 1)
                        .input(MINERAL_WATER, 64)
                        .input(MINERAL_WATER, 64)
                        .fluidInputs(GTFOMaterialHandler.PurpleDrink.getFluid(16000))
                        .output(ORGANIC_CIRCUIT_14, 1)
                        .buildAndRegister();
        }
}