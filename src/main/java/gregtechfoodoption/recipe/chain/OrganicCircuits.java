package gregtechfoodoption.recipe.chain;

import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.GTValues.*;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FORMING_PRESS_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.common.items.MetaItems.BOTTLE_PURPLE_DRINK;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class OrganicCircuits {
    public static void init() {
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.ULV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_15.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.LV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_1.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.MV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_2.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.HV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_3.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.EV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_4.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.IV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_5.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.LuV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_6.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.ZPM, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_7.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.UV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_8.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.UHV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_9.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.UEV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_10.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.UIV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_11.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.UXV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_12.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.OpV, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_13.getStackForm())
                .buildAndRegister();
        FORMING_PRESS_RECIPES.recipeBuilder().EUt(32).duration(1)
                .input(circuit, Tier.MAX, 1)
                .inputs(LEMON.getStackForm())
                .outputs(ORGANIC_CIRCUIT_14.getStackForm())
                .buildAndRegister();
    }
}