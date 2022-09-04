package gregtechfoodoption.utils;

import gregtech.api.unification.material.MarkerMaterials;
import gregtech.loaders.recipe.CraftingComponent;
import gregtechfoodoption.item.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GTFOCraftingComponent {
    public static CraftingComponent.Component ORGANIC_CIRCUIT;

    public static void init() {
        ORGANIC_CIRCUIT = new CraftingComponent.Component(Stream.of(new Object[][]{

                {0, GTFOMetaItem.ORGANIC_CIRCUIT_15.getStackForm()},
                {1, GTFOMetaItem.ORGANIC_CIRCUIT_1.getStackForm()},
                {2, GTFOMetaItem.ORGANIC_CIRCUIT_2.getStackForm()},
                {3, GTFOMetaItem.ORGANIC_CIRCUIT_3.getStackForm()},
                {4, GTFOMetaItem.ORGANIC_CIRCUIT_4.getStackForm()},
                {5, GTFOMetaItem.ORGANIC_CIRCUIT_5.getStackForm()},
                {6, GTFOMetaItem.ORGANIC_CIRCUIT_6.getStackForm()},
                {7, GTFOMetaItem.ORGANIC_CIRCUIT_7.getStackForm()},
                {8, GTFOMetaItem.ORGANIC_CIRCUIT_8.getStackForm()},
                {9, GTFOMetaItem.ORGANIC_CIRCUIT_9.getStackForm()},
                {10, GTFOMetaItem.ORGANIC_CIRCUIT_10.getStackForm()},
                {11, GTFOMetaItem.ORGANIC_CIRCUIT_11.getStackForm()},
                {12, GTFOMetaItem.ORGANIC_CIRCUIT_12.getStackForm()},
                {13, GTFOMetaItem.ORGANIC_CIRCUIT_13.getStackForm()},
                {14, GTFOMetaItem.ORGANIC_CIRCUIT_14.getStackForm()},

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));
    }
}

