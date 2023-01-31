package gregtechfoodoption.recipe.chain;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Asbestos;
import static gregtechfoodoption.GTFOMaterialHandler.SodiumHypochlorite;
import static gregtechfoodoption.item.GTFOMetaItem.*;

public class JointChain {
    public static void init() {
        ModHandler.addShapelessRecipe("asbestos_joint", ASBESTOS_JOINT.getStackForm(2), ROLLING_PAPER.getStackForm(), ROLLING_PAPER.getStackForm(), OreDictUnifier.get(OrePrefix.dust, Asbestos));
    }
}
