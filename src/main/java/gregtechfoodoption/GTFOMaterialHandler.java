package gregtechfoodoption;


import gregtech.api.GregTechAPI;
import gregtech.api.fluids.MetaFluids;
import gregtech.api.fluids.fluidType.FluidType;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.items.metaitem.MetaOreDictItem;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.util.FluidTooltipUtil;
import gregtech.api.util.LocalizationUtils;
import gregtech.api.unification.ore.OrePrefix;
import gregtechfoodoption.item.GTFOOredictItem;
import gregtechfoodoption.item.GTFOProxyItem;
import gregtechfoodoption.materials.FertilizerProperty;
import gregtechfoodoption.materials.LacingProperty;


import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtechfoodoption.GTFOValues.Organic;
import static gregtechfoodoption.item.GTFOMetaItems.SHAPED_ITEM;
import static gregtechfoodoption.utils.GTFOUtils.averageRGB;

public class GTFOMaterialHandler {
    public static final PropertyKey<FertilizerProperty> FERTILIZER = new PropertyKey<>("gtfo_fertilizer", FertilizerProperty.class);
    public static final PropertyKey<LacingProperty> LACING = new PropertyKey<>("gtfo_lacing", LacingProperty.class);

    // 21500 - 21969

    public static final Material IsopropylChloride = fluidBuilder(21500, "isopropyl_chloride")
            .components(Carbon, 3, Hydrogen, 7, Chlorine, 1)
            .build()
            .setFormula("(CH3)2CHCl", true);
    public static final Material LemonExtract = fluidBuilder(21501, "lemon_extract")
            .color(0xfce80a)
            .build();
    public static final Material LimeExtract = fluidBuilder(21502, "lime_extract")
            .color(0x85f218)
            .build();
    public static final Material OrangeExtract = fluidBuilder(21503, "orange_extract")
            .color(0xff6100)
            .build();
    public static final Material AppleExtract = fluidBuilder(21504, "apple_extract")
            .color(0xe9ba58)
            .build();

    public static final Material AppleCider = fluidBuilder(21505, "apple_cider")
            .color(averageRGB(2, 0xE9BA58, FermentedBiomass.getMaterialRGB()))
            .build();
    public static final Material UnheatedCaneSyrup = fluidBuilder(21506, "unheated_cane_syrup")
            .color(0xf0efe4)
            .build();
    public static final Material CaneSyrup = fluidBuilder(21507, "cane_syrup")
            .color(0xf2f1dc)
            .build();
    public static final Material PurpleDrink = fluidBuilder(21508, "purple_drink")
            .color(0xb405ff)
            .build();

    public static final Material FryingOil = fluidBuilder(21509, "frying_oil")
            .color(0xffe3a1)
            .build();
    public static final Material HotFryingOil = fluidBuilder(21510, "hot_frying_oil")
            .color(0xffd166)
            .build();
    public static final Material StarchFilledWater = fluidBuilder(21511, "starch_filled_water")
            .color(0xd1cbbe)
            .build();

    public static final Material MushroomSoup = fluidBuilder(21512, "mushroom_soup")
            .color(0xedcaaf)
            .build();
    public static final Material BeetrootSoup = fluidBuilder(21513, "beetroot_soup")
            .color(0xc25132)
            .build();

    public static final Material ItalianBuffaloMilk = fluidBuilder(21514, "italian_buffalo_milk")
            .color(0xfcfbf5)
            .build();
    public static final Material CrudeRennetSolution = fluidBuilder(21515, "crude_rennet_solution")
            .color(0xb0631a)
            .build();
    public static final Material Whey = fluidBuilder(21516, "whey")
            .color(0xf5ef9a)
            .build();
    public static final Material ActivatedBuffaloMilk = fluidBuilder(21517, "activated_buffalo_milk")
            .color(0xfff8cc)
            .build();
    public static final Material WheySaltWaterMix = fluidBuilder(21518, "whey_salt_water_mix")
            .color(0xecfc7e)
            .build();
    public static final Material HeatedRicottaStarter = fluidBuilder(21519, "heated_ricotta_starter")
            .color(0xdef72f)
            .build();
    public static final Material AcidicMilkSolution = fluidBuilder(21520, "acidic_milk_solution")
            .color(0xb2c71c)
            .build();
    public static final Material CoagulatingRicottaSolution = fluidBuilder(21521, "coagulating_ricotta_solution")
            .color(0xeff5c9)
            .build();

    public static final Material TomatoSauce = fluidBuilder(21522, "tomato_sauce")
            .color(0xfc2217)
            .build();
    public static final Material OliveOil = fluidBuilder(21523, "olive_oil")
            .color(0xd1db5a)
            .build();

    public static final Material Sludge = fluidBuilder(21524, "sludge")
            .color(0x24140b)
            .build();

    public static final Material AlkalineExtract = fluidBuilder(21525, "alkaline_extract")
            .color(0x121110)
            .build();

    public static final Material PotatoJuice = fluidBuilder(21526, "potato_juice")
            .color(0x786b48)
            .build();
    public static final Material Vodka = fluidBuilder(21527, "vodka")
            .color(0x7d6933)
            .build();
    public static final Material Leninade = fluidBuilder(21528, "leninade")
            .color(0x82661d)
            .build();

    public static final Material PerchloricAcid = fluidBuilder(21529, "perchloric_acid", FluidTypes.ACID)
            .components(Hydrogen, 1, Chlorine, 1, Oxygen, 4)
            .build();
    public static final Material ChloroauricAcid = GregTechAPI.MaterialRegistry.get("chloroauric_acid") != null ? GregTechAPI.MaterialRegistry.get("chloroauric_acid") :
            fluidBuilder(21530, "chloroauric_acid", FluidTypes.ACID)
            .components(Hydrogen, 1, Gold, 1, Chlorine, 4)
            .build();

    public static final Material MoistAir = fluidBuilder(21531, "moist_air")
            .color(0x82c8ff)
            .build();
    public static final Material ColdMoistAir = fluidBuilder(21532, "cold_moist_air")
            .color(0x72a2ff)
            .build();

    public static final Material Albumen = fluidBuilder(21533, "albumen")
            .color(0xfffef7)
            .build();
    public static final Material Yolk = fluidBuilder(21534, "yolk")
            .color(0xffdf00)
            .build();
    public static final Material Butter = fluidBuilder(21535, "butter")
            .color(0xffef82)
            .build();

    public static final Material RabbitStew = fluidBuilder(21536, "rabbit_stew")
            .color(0xe0c0a0)
            .build();

    public static final Material Stearin = fluidBuilder(21537, "stearin")
            .color(0xffcc66)
            .components(Carbon, 57, Hydrogen, 110, Oxygen, 6)
            .flags(DISABLE_DECOMPOSITION)
            .build();
    public static final Material StearicAcid = fluidBuilder(21538, "stearic_acid", FluidTypes.ACID).color(0xfff7e6)
            .components(Carbon, 18, Hydrogen, 36, Oxygen, 2)
            .flags(DISABLE_DECOMPOSITION)
            .build()
            .setFormula("C17H35CO2H", true); // used as a food additive synthesized from Fat (Basically turning it into 3 parts)
    public static final Material SodiumStearate = fluidBuilder(21539, "sodium_stearate")
            .components(Carbon, 18, Hydrogen, 35, Oxygen, 2, Sodium, 1)
            .build()
            .setFormula("C17H35COONa", true);
    public static final Material CitricAcid = fluidBuilder(21540, "citric_acid", FluidTypes.ACID)
            .color(0xccbd61)
            .components(Carbon, 5, Hydrogen, 7, Oxygen, 5)
            .build()
            .setFormula("HOC(CH2CO2H)2", true); //good for processing food
    public static final Material HydrogenCyanide = GregTechAPI.MaterialRegistry.get("hydrogen_cyanide") != null ? GregTechAPI.MaterialRegistry.get("hydrogen_cyanide") : fluidBuilder(21541, "hydrogen_cyanide")
            .color(0x6e6a5e)
            .components(Hydrogen, 1, Carbon, 1, Nitrogen, 1)
            .build();

    public static final Material Cream = fluidBuilder(21542, "cream")
            .color(0xced2d9)
            .build();
    public static final Material SkimmedMilk = fluidBuilder(21543, "skimmed_milk")
            .color(0xf7ffe3)
            .build();
    public static final Material SoyLecithin = fluidBuilder(21544, "soy_lecithin")
            .color(0xa6963a)
            .build();
    public static final Material RawSoybeanOil = fluidBuilder(21545, "raw_soybean_oil")
            .color(0xad5418)
            .build();
    public static final Material HydratedSoybeanOil = fluidBuilder(21546, "hydrated_soybean_oil")
            .color(0xc99c7d)
            .build();
    public static final Material SoybeanOil = fluidBuilder(21547, "soybean_oil")
            .color(0xe8e4a9)
            .build();
    public static final Material PasteurizedMilk = fluidBuilder(21548, "pasteurized_milk")
            .color(0xfefdf3)
            .build();
    public static final Material MilkColloid = fluidBuilder(21549, "milk_colloid")
            .color(0xe0d7bf)
            .build();
    public static final Material IceCreamMixture = fluidBuilder(21550, "ice_cream_mixture")
            .color(0xdebd80)
            .build();

    public static final Material Guaiacol = fluidBuilder(21551, "guaiacol")
            .color(0xa63a00)
            .components(Carbon, 7, Hydrogen, 8, Oxygen, 2)
            .build();
    public static final Material Acetaldehyde = fluidBuilder(21552, "acetaldehyde")
            .color(0xf3f2f1)
            .components(Carbon, 2, Hydrogen, 4, Oxygen, 1)
            .build();
    public static final Material Glyoxal = fluidBuilder(21553, "glyoxal")
            .color(0xc9c7ab)
            .components(Carbon, 2, Hydrogen, 2, Oxygen, 2)
            .build();
    public static final Material GlyoxylicAcid = fluidBuilder(21554, "glyoxylic_acid")
            .color(0xd9d5a0)
            .components(Carbon, 2, Hydrogen, 2, Oxygen, 3)
            .build();

    public static final Material MelonExtract = fluidBuilder(21555, "melon_extract")
            .color(0xfc7996)
            .build();

    public static final Material MoltenUnsweetenedChocolate = fluidBuilder(21556, "molten_unsweetened_chocolate")
            .color(0x7b3f00)
            .fluidTemp(370)
            .build();
    public static final Material CocoaButter = fluidBuilder(21557, "cocoa_butter")
            .color(0xe5dbce)
            .build();
    public static final Material MoltenDarkChocolate = fluidBuilder(21558, "molten_dark_chocolate")
            .color(0x490206)
            .fluidTemp(360)
            .build();
    public static final Material MoltenMilkChocolate = fluidBuilder(21559, "molten_milk_chocolate")
            .color(0x84563c)
            .fluidTemp(350)
            .build();

    public static final Material SodiumArseniteSolution = fluidBuilder(21560, "sodium_arsenite_solution")
            .color(averageRGB(2, SodaAsh.getMaterialRGB(), Arsenic.getMaterialRGB()))
            .components(Sodium, 1, Arsenic, 1, Oxygen, 2)
            .flags(DISABLE_DECOMPOSITION)
            .build();
    public static final Material RubberSap = fluidBuilder(21561, "rubber_sap")
            .color(0xf7f6dc)
            .build();
    public static final Material RainbowSap = fluidBuilder(21562, "rainbow_sap")
            .color(0xffffff)
            .build();
    public static final Material BlueVitriol = GregTechAPI.MaterialRegistry.get("blue_vitriol") != null ? GregTechAPI.MaterialRegistry.get("blue_vitriol") :
            fluidBuilder(21563, "blue_vitriol")
                    .color(0x4242DE)
                    .components(Copper, 1, Sulfur, 1, Oxygen, 4)
                    .build();
    public static final Material BakingSodaSolution = fluidBuilder(21564, "baking_soda_solution")
            .color(SodiumBicarbonate.getMaterialRGB())
            .components(SodiumBicarbonate, 1, Water, 1)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .build();
    public static final Material BeerBatter = fluidBuilder(21565, "beer_batter")
            .color(0xe4cfc0)
            .build();
    public static final Material WheatyJuice = fluidBuilder(21566, "wheaty_juice")
            .color(0xa87b58)
            .build();
    public static final Material PoorQualityBeer = fluidBuilder(21567, "poor_quality_beer")
            .color(0xa87b58)
            .build();
    public static final Material SodiumSulfate = new Material.Builder(21568, "sodium_sulfate")
            .dust()
            .components(Sodium, 2, Sulfur, 1, Oxygen, 4)
            .build();
    public static final Material Blood = fluidBuilder(21569, "blood")
            .color(0x691a15)
            .fluidTemp(310)
            .build();

    public static final Material FertilizerSolution = fluidBuilder(21570, "fertilizer_solution")
            .color(0x947760)
            .build();
    public static final Material Nilk = fluidBuilder(21571, "nilk")
            .color(0x252626)
            .build();

    public static final Material SweetenedDilutedCaneSyrupMixture = fluidBuilder(21970, "sweetened_diluted_cane_syrup_mixture")
            .color(0xdedcc8)
            .build();
    public static final Material MarshmallowSyrupMixture = fluidBuilder(21971, "marshmallow_syrup_mixture")
            .color(0xe6e0dc)
            .build();
    public static final Material MarshmallowFoam = fluidBuilder(21972, "marshmallow_foam")
            .color(0xe6e0dc)
            .build();
    public static final Material SodiumCarbonateSolution = fluidBuilder(21973, "sodium_carbonate_solution")
            .color(averageRGB(2, 0xaaaaaa, SodaAsh.getMaterialRGB()))
            .components(Water, 1, SodaAsh, 1)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .build();

    public static final Material HighFructoseCornSyrupSolution = fluidBuilder(21992, "hfcs_solution")
            .color(0xe3bc20)
            .build();
    public static final Material XPhenothiazineIiPropylChloride = fluidBuilder(21993, "x_phenothiazine_ii_propyl_chloride")
            .components(Carbon, 15, Hydrogen, 16, Nitrogen, 1, Sulfur, 1, Chlorine, 1)
            .flags(DISABLE_DECOMPOSITION)
            .build();
    public static final Material AppleSyrup = fluidBuilder(21994, "apple_syrup")
            .color(0xf2e1ac)
            .build();
    public static final Material AppleCandySyrup = fluidBuilder(21995, "apple_candy_syrup")
            .color(0xe7f5ae)
            .build();
    public static final Material Etirps = fluidBuilder(21996, "etirps")
            .color(0xb0ff73)
            .build();
    public static final Material LemonLimeSodaSyrup = fluidBuilder(21997, "lemon_lime_soda_syrup")
            .color(0x76ff0d)
            .build();
    public static final Material CarbonatedWater = fluidBuilder(21998, "carbonated_water")
            .color(0xf5ffff)
            .build();
    public static final Material CoughSyrup = fluidBuilder(21999, "cough_syrup")
            .color(0x5c1b5e)
            .build();
    public static final Material LemonLimeSolution = fluidBuilder(22000, "lemon_lime_solution")
            .color(0xbddb5a)
            .build();
    public static final Material LemonLimeSludge = fluidBuilder(22001, "lemon_lime_sludge")
            .color(0x779906)
            .build();
    public static final Material Aniline = fluidBuilder(22002, "aniline")
            .color(0x4c911d)
            .components(Carbon, 6, Hydrogen, 7, Nitrogen, 2)
            .flags(DISABLE_DECOMPOSITION)
            .build();
    public static final Material Coffee = fluidBuilder(21990, "coffee")
            .color(0x36312e)
            .build();
    public static final Material EnergizedCoffee = fluidBuilder(21991, "energized_coffee")
            .color(0x695934)
            .build();

    // cursed edition
    public static final Material HeatedWater = fluidBuilder(25000, "heated_water").fluidTemp(343)
            .color(0x024B86)
            .build()
            .setFormula("H2O", true);
    public static final Material GelatinSolution = fluidBuilder(25001, "gelatin_solution").fluidTemp(343)
            .color(0xD3D3D3)
            .build();
    public static final Material GelatinSolutionNoBubbles = fluidBuilder(25002, "gelatin_solution_no_bubbles").fluidTemp(343)
            .color(0xD3D3D3)
            .build();
    public static final Material SodiumHypochlorite = fluidBuilder(25003, "sodium_hypochlorite").fluidTemp(343)
            .color(0xFFFFFF)
            .build()
            .setFormula("NaClO", true);
    public static final Material AceticAnhydride = fluidBuilder(25004, "acetic_anhydride").fluidTemp(343)
            .color(0xFFFFFF)
            .build()
            .setFormula("C4H6O3", true);
    public static final Material Nitrophenols = fluidBuilder(25005, "nitrophenols").fluidTemp(343)
            .color(0xFFFFFF)
            .build()
            .setFormula("C6H5NO2", true);
    public static final Material BenzylChloride = fluidBuilder(25006, "benzyl_chloride").fluidTemp(343)
            .color(0xD84954)
            .build()
            .setFormula("C7H7Cl", true);
    public static final Material BenzylCyanide = fluidBuilder(25007, "benzyl_cyanide").fluidTemp(343)
            .color(0x765984)
            .build()
            .setFormula("C8H7N", true);
    public static final Material MethylFormate = fluidBuilder(25008, "methyl_formate").fluidTemp(343)
            .color(0x435698)
            .build()
            .setFormula("C2H4O2", true);
    public static final Material Methylamine = fluidBuilder(25009, "methylamine").fluidTemp(343)
            .color(0x546128)
            .build()
            .setFormula("CH5N", true);
    public static final Material Methylformamide = fluidBuilder(25010, "methylformamide").fluidTemp(343)
            .color(0x748525)
            .build()
            .setFormula("C2H5NO", true);
    public static final Material FormicAcid = fluidBuilder(25011, "formic_acid").fluidTemp(343)
            .color(0x676525)
            .build()
            .setFormula("CH2O2", true);
    public static final Material Phenylethylamine = fluidBuilder(25012, "phenylethylamine").fluidTemp(343)
            .color(0x71FA0E)
            .build()
            .setFormula("C8H11N", true);
    public static final Material Chlorotrimethylsilane = fluidBuilder(25013, "chlorotrimethylsilane").fluidTemp(343)
            .color(0xE738FF)
            .build()
            .setFormula("C3H9SiCl", true);
    public static final Material Allyltrimethylsilane = fluidBuilder(25014, "allyltrimethylsilane").fluidTemp(343)
            .color(0xDDAA68)
            .build()
            .setFormula("C6H14Si", true);
    public static final Material Formaldehyde = fluidBuilder(25015, "formaldehyde").fluidTemp(343)
            .color(0x18773D)
            .build()
            .setFormula("CH2O", true);
    public static final Material Dimethylsilane = fluidBuilder(25016, "dimethylsilane").fluidTemp(343)
            .color(0x13EF5B)
            .build()
            .setFormula("C2H8Si", true);
    public static final Material OxalylChloride = fluidBuilder(25017, "oxalyl_chloride").fluidTemp(343)
            .color(0x4BEA00)
            .build()
            .setFormula("C2O2Cl2", true);
    public static final Material DimethylSulfoxide = fluidBuilder(25018, "dimethyl_sulfoxide").fluidTemp(343)
            .color(0x676525)
            .build()
            .setFormula("C2H6OS", true);
    public static final Material DimethylSulfide = fluidBuilder(25020, "dimethyl_sulfide").fluidTemp(343)
            .color(0xFB01AB)
            .build()
            .setFormula("C2H6S", true);
    public static final Material PropionicAcid = fluidBuilder(25021, "propionic_acid").fluidTemp(343)
            .color(0xED49EA)
            .build()
            .setFormula("C3H6O2", true);
    public static final Material PropionicAnhydride = fluidBuilder(25022, "propionic_anhydride").fluidTemp(343)
            .color(0xC8F8A7)
            .build()
            .setFormula("C6H10O3", true);
    public static final Material GreganylCitrateSolution = fluidBuilder(25023, "greganyl_citrate_solution").fluidTemp(343)
            .color(0xB50DEB)
            .build()
            .setFormula("(H2O)(C28H36N2O8)", true);
    public static final Material Dimethylformamide = fluidBuilder(25024, "dimethylformamide").fluidTemp(343)
            .color(0x42BDFF)
            .build()
            .setFormula("C3H7NO", true);
    public static final Material PhosphorylChloride = fluidBuilder(25028, "phosphoryl_chloride").fluidTemp(343)
            .color(0x7CA6CD)
            .build()
            .setFormula("POCl3", true);
    public static final Material SodiumNitrateSolution = fluidBuilder(25030, "sodium_nitrate_solution").fluidTemp(343)
            .color(0x09ed05)
            .build()
            .setFormula("(H2O)(NaNO3)", true);
    public static final Material RawCobalaminSelectiveGrowthMedium = fluidBuilder(25032, "raw_cobalamin_selective_growth_medium").fluidTemp(343)
            .color(0x5b9216)
            .build();
    public static final Material SterileCobalaminSelectiveGrowthMedium = fluidBuilder(25033, "sterile_cobalamin_selective_growth_medium").fluidTemp(343)
            .color(0xbaa952)
            .build();



    public static final GTFOOredictItem.OreDictValueItem COFFEE_GROUNDS = SHAPED_ITEM.addOreDictItem(1017, "coffee_grounds", 0x1a1612, MaterialIconSet.DULL, OrePrefix.dust);
    public static final GTFOOredictItem.OreDictValueItem SMALL_ROASTED_COFFEE = SHAPED_ITEM.addOreDictItem(1018, "roasted_coffee_small", 0x1a1612, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_ROASTED_COFFEE = SHAPED_ITEM.addOreDictItem(1019, "roasted_coffee_large", 0x1a1612, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem SMALL_GRADED_COFFEE = SHAPED_ITEM.addOreDictItem(1020, "graded_coffee_small", 0x635c55, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_GRADED_COFFEE = SHAPED_ITEM.addOreDictItem(1021, "graded_coffee_large", 0x635c55, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem SMALL_HULLED_COFFEE = SHAPED_ITEM.addOreDictItem(1022, "hulled_coffee_small", 0x7d4b16, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_HULLED_COFFEE = SHAPED_ITEM.addOreDictItem(1023, "hulled_coffee_large", 0x7d4b16, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem SMALL_DRIED_COFFEE = SHAPED_ITEM.addOreDictItem(1024, "dried_coffee_small", 0x8c6842, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_DRIED_COFFEE = SHAPED_ITEM.addOreDictItem(1025, "dried_coffee_large", 0x8c6842, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem SMALL_WET_COFFEE = SHAPED_ITEM.addOreDictItem(1026, "wet_coffee_small", 0x756452, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_WET_COFFEE = SHAPED_ITEM.addOreDictItem(1027, "wet_coffee_large", 0x756452, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem SMALL_BASIC_COFFEE = SHAPED_ITEM.addOreDictItem(1028, "basic_coffee_small", 0x3b220d, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem LARGE_BASIC_COFFEE = SHAPED_ITEM.addOreDictItem(1029, "basic_coffee_large", 0x3b220d, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem UNSORTED_BASIC_COFFEE = SHAPED_ITEM.addOreDictItem(1030, "basic_coffee_unsorted", 0x422003, MaterialIconSet.GEM_VERTICAL, OrePrefix.gemChipped);
    public static final MetaOreDictItem.OreDictValueItem HotAppleHardCandy = SHAPED_ITEM.addOreDictItem(1084, "hot_apple_hard_candy", 0x78e32b, MaterialIconSet.DULL, OrePrefix.plate);
    /*
        public static final GTFOOredictItem.OreDictItem BacillusSubtilis = new GTFOOredictItem.OreDictItem(1085, "bacillus_subtilis", 0xe0386b, MaterialIconSet.ROUGH, OrePrefix.dust, "Bacteria");
        public static final GTFOOredictItem.OreDictItem LactobacillusPentosis = new GTFOOredictItem.OreDictItem(1086, "lactobacillus_pentosis", 0x87316f, MaterialIconSet.ROUGH, OrePrefix.dust, "Bacteria");
        public static final GTFOOredictItem.OreDictItem FructoseConversionPlate = new GTFOOredictItem.OreDictItem(1087, "fructose_conversion_plate", 0xe0e0dc, MaterialIconSet.SHINY, OrePrefix.plate);
        public static final GTFOOredictItem.OreDictItem XyloseIsomerase = new GTFOOredictItem.OreDictItem(1088, "xylose_isomerase", 0x9718ea, MaterialIconSet.SAND, OrePrefix.dust);
        public static final GTFOOredictItem.OreDictItem AlphaAmylase = new GTFOOredictItem.OreDictItem(1089, "alpha_amylase", 0x69D992, MaterialIconSet.SAND, OrePrefix.dust);
        public static final GTFOOredictItem.OreDictItem GammaAmylase = new GTFOOredictItem.OreDictItem(1090, "gamma_amylase", 0x4FCE67, MaterialIconSet.SAND, OrePrefix.dust);
        public static final GTFOOredictItem.OreDictItem CornStarch = new GTFOOredictItem.OreDictItem(1091, "corn_starch", 0xfff5f5, MaterialIconSet.ROUGH, OrePrefix.dust);
    */
    public static final GTFOOredictItem.OreDictValueItem CrushedHardCandy = SHAPED_ITEM.addOreDictItem(1093, "crushed_hard_candy", 0x52a302, MaterialIconSet.DULL, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem Promethazine = SHAPED_ITEM.addOreDictItem(1094, "promethazine", 0xf8fade, MaterialIconSet.SAND, OrePrefix.dust, "C17H20N2S");
    public static final GTFOOredictItem.OreDictValueItem Codeine = SHAPED_ITEM.addOreDictItem(1095, "codeine", 0xfadef2, MaterialIconSet.SAND, OrePrefix.dust, "C18H21NO3");
    public static final GTFOOredictItem.OreDictValueItem Phenothiazine = SHAPED_ITEM.addOreDictItem(1096, "phenothiazine", 0x67735c, MaterialIconSet.SAND, OrePrefix.dust, "C12H9NS");
    public static final GTFOOredictItem.OreDictValueItem Diphenylamine = SHAPED_ITEM.addOreDictItem(1097, "diphenylamine", 0xe3932b, MaterialIconSet.SAND, OrePrefix.dust, "C12H11N");
    public static final GTFOOredictItem.OreDictValueItem CrushedPoppy = SHAPED_ITEM.addOreDictItem(1098, "crushed_poppy", 0x940801, MaterialIconSet.ROUGH, OrePrefix.dust, "You monster.");
    public static final GTFOOredictItem.OreDictValueItem HardCandyPlate = SHAPED_ITEM.addOreDictItem(1099, "hard_candy", 0x78e32b, MaterialIconSet.ROUGH, OrePrefix.plate);
    public static final GTFOOredictItem.OreDictValueItem HardCandyResin = SHAPED_ITEM.addOreDictItem(1100, "hard_candy", 0x78e32b, MaterialIconSet.ROUGH, OrePrefix.plateDense);




    public static final GTFOOredictItem.OreDictValueItem Zest = SHAPED_ITEM.addOreDictItem(1092, "zest", 0xd8ff4a, MaterialIconSet.SAND, dust);
    public static final GTFOOredictItem.OreDictValueItem PotatoStarch = SHAPED_ITEM.addOreDictItem(1101, "potato_starch", 0xdedcb1, MaterialIconSet.ROUGH, dust);

    public static final GTFOOredictItem.OreDictValueItem LargeMozzarellaCurd = SHAPED_ITEM.addOreDictItem(1102, "large_mozzarella_curd", 0xf5f5f5, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem SmallMozzarellaCurd = SHAPED_ITEM.addOreDictItem(1103, "small_mozzarella_curd", 0xf5f5f5, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem DriedMozzarellaCurd = SHAPED_ITEM.addOreDictItem(1104, "dried_mozzarella_curd", 0xf5f4e4, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem SolidifiedMozzarellaCurd = SHAPED_ITEM.addOreDictItem(1105, "solidified_mozzarella_curd", 0xedebca, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem CoagulatedMilkCurd = SHAPED_ITEM.addOreDictItem(1106, "coagulated_milk_curd", 0xede3cc, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem CutCurd = SHAPED_ITEM.addOreDictItem(1107, "cut_curd", 0xede3cc, MaterialIconSet.SHINY, OrePrefix.round);
    public static final GTFOOredictItem.OreDictValueItem CookedCurd = SHAPED_ITEM.addOreDictItem(1108, "cooked_curd", 0xffe8b3, MaterialIconSet.SHINY, OrePrefix.round);
    public static final GTFOOredictItem.OreDictValueItem SaltedCurd = SHAPED_ITEM.addOreDictItem(1109, "salted_curd", 0xf7d68b, MaterialIconSet.SHINY, OrePrefix.round);
    public static final GTFOOredictItem.OreDictValueItem GorgonzolaCurd = SHAPED_ITEM.addOreDictItem(1110, "gorgonzola_curd", 0xe5e5f5, MaterialIconSet.SHINY, OrePrefix.nugget);
    public static final GTFOOredictItem.OreDictValueItem PenicilliumRoqueforti = SHAPED_ITEM.addOreDictItem(1111, "penicillium_roqueforti", 0x2a7b5a, MaterialIconSet.ROUGH, dust, "Bacteria");

    public static final GTFOOredictItem.OreDictValueItem BurntBananaPeel = SHAPED_ITEM.addOreDictItem(1112, "burnt_banana_peel", 0x121110, MaterialIconSet.ROUGH, dust);
    public static final GTFOOredictItem.OreDictValueItem AmmoniumPerchlorate = SHAPED_ITEM.addOreDictItem(1113, "ammonium_perchlorate", averageRGB(4, Ammonia.getMaterialRGB(), Chlorine.getMaterialRGB(), Oxygen.getMaterialRGB(), Hydrogen.getMaterialRGB()), MaterialIconSet.DULL, dust, "NH4ClO4");
    public static final GTFOOredictItem.OreDictValueItem PotassiumPerchlorate = SHAPED_ITEM.addOreDictItem(1114, "potassium_perchlorate", averageRGB(2, AmmoniumPerchlorate.getMaterialRGB(), Potassium.getMaterialRGB()), MaterialIconSet.ROUGH, dust, "KClO4");

    public static final GTFOOredictItem.OreDictValueItem MashedPotato = SHAPED_ITEM.addOreDictItem(1115, "mashed_potato", 0xf5d89f, MaterialIconSet.FINE, dust);

    public static final GTFOOredictItem.OreDictValueItem ToughMeat = SHAPED_ITEM.addOreDictItem(1116, "tough_meat", 0xa63028, MaterialIconSet.ROUGH, dust);

    public static final GTFOOredictItem.OreDictValueItem KubideMeat = SHAPED_ITEM.addOreDictItem(1117, "kubide_meat", 0x9B0600, Organic, dust);
    public static final GTFOOredictItem.OreDictValueItem BargMeat = SHAPED_ITEM.addOreDictItem(1118, "barg_meat", 0x7F0000, Organic, dust);
    public static final GTFOOredictItem.OreDictValueItem Fat = SHAPED_ITEM.addOreDictItem(1119, "fat", 0xFFF200, Organic, OrePrefix.ingot, "C57H110O6"); // yea Fat is much more complicated but i just stick to this formula...

    public static final GTFOOredictItem.OreDictValueItem MeatIngot = SHAPED_ITEM.addOreDictItem(1120, "cooked_meat", 0xa63028, MaterialIconSet.ROUGH, OrePrefix.ingot);
    //public static final GTFOOredictItem.OreDictValueItem SlimeIngot = SHAPED_ITEM.addOreDictItem(1120, "slime_ingot", 0x84C873, Organic, OrePrefix.ingot);

    public static final GTFOOredictItem.OreDictValueItem SodiumPerchlorate = SHAPED_ITEM.addOreDictItem(1121, "sodium_perchlorate", averageRGB(3, Sodium.getMaterialRGB(), Oxygen.getMaterialRGB(), 0xFFFFFF), MaterialIconSet.ROUGH, dust, "NaClO4");
    public static final GTFOProxyItem SodiumChlorate = new GTFOProxyItem(() -> SHAPED_ITEM.addOreDictItem(1122, "sodium_chlorate", averageRGB(2, Sodium.getMaterialRGB(), Oxygen.getMaterialRGB()), MaterialIconSet.ROUGH, dust, "NaClO3"), 1122, "sodium_chlorate", () -> OreDictUnifier.get(dust, GregTechAPI.MaterialRegistry.get("sodium_chlorate")));

    public static final GTFOOredictItem.OreDictValueItem VanillylmandelicAcid = SHAPED_ITEM.addOreDictItem(1123, "vanillylmandelic_acid", 0xf2efbd, MaterialIconSet.ROUGH, dust, "C9H10O5");
    public static final GTFOOredictItem.OreDictValueItem VanilglycolicAcid = SHAPED_ITEM.addOreDictItem(1124, "vanilglycolic_acid", 0xebe7a4, MaterialIconSet.DULL, dust, "C9H8O5");
    public static final GTFOOredictItem.OreDictValueItem Vanillin = SHAPED_ITEM.addOreDictItem(1125, "vanillin", 0xfbfbfb, MaterialIconSet.SHINY, OrePrefix.dust, "C8H8O3");
    public static final GTFOProxyItem ArsenicTrioxide = new GTFOProxyItem(() -> SHAPED_ITEM.addOreDictItem(1126, "arsenic_trioxide", averageRGB(2, Arsenic.getMaterialRGB(), Oxygen.getMaterialRGB()), MaterialIconSet.ROUGH, dust, "As2O3"), 1126, "arsenic_trioxide", () -> OreDictUnifier.get(dust, GregTechAPI.MaterialRegistry.get("arsenic_trioxide")));
    public static final GTFOOredictItem.OreDictValueItem CupricHydrogenArsenite = SHAPED_ITEM.addOreDictItem(1127, "cupric_hydrogen_arsenite", 0x0fff00, MaterialIconSet.SHINY, OrePrefix.dust, "CuHAsO3");
    public static final GTFOOredictItem.OreDictValueItem LaminatedDough = SHAPED_ITEM.addOreDictItem(1128, "laminated_dough", 0xc6b4bb, MaterialIconSet.DULL, plate);
    public static final MetaOreDictItem.OreDictValueItem CookedMinceMeat = SHAPED_ITEM.addOreDictItem(1129, "cooked_mince_meat", 0x462b25, MaterialIconSet.ROUGH, dust);

    public static final GTFOOredictItem.OreDictValueItem COCOA_HULL = SHAPED_ITEM.addOreDictItem(1035, "cocoa_hull", 0x362c25, MaterialIconSet.GEM_HORIZONTAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem COCOA_NIB = SHAPED_ITEM.addOreDictItem(1036, "cocoa_nib", 0x635943, MaterialIconSet.GEM_HORIZONTAL, OrePrefix.gemChipped);
    public static final GTFOOredictItem.OreDictValueItem CHOCOLATE_LIQUOR = SHAPED_ITEM.addOreDictItem(1037, "chocolate_liquor", 0x635943, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem CHOCOLATE_LIQUOR_REFINED = SHAPED_ITEM.addOreDictItem(1038, "chocolate_liquor_refined", 0x605528, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem CHOCOLATE_LIQUOR_DUTCHED = SHAPED_ITEM.addOreDictItem(1039, "chocolate_liquor_dutched", 0x695143, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem PRESS_CAKE_DUTCHED = SHAPED_ITEM.addOreDictItem(1040, "press_cake_dutched", 0x997e6e, MaterialIconSet.DULL, OrePrefix.plateDense);
    public static final GTFOOredictItem.OreDictValueItem PRESS_CAKE = SHAPED_ITEM.addOreDictItem(1041, "press_cake", 0x948881, MaterialIconSet.DULL, OrePrefix.plateDense);
    public static final GTFOOredictItem.OreDictValueItem PRESS_CAKE_GRADED = SHAPED_ITEM.addOreDictItem(1042, "press_cake_graded", 0xa67f68, MaterialIconSet.DULL, OrePrefix.plateDense);
    public static final GTFOOredictItem.OreDictValueItem HOT_MILK_CHOCOLATE = SHAPED_ITEM.addOreDictItem(1043, "milk_chocolate", 0x636c61, MaterialIconSet.DULL, OrePrefix.ingotHot);
    public static final GTFOOredictItem.OreDictValueItem MATTER_MARSHMALLOW = SHAPED_ITEM.addOreDictItem(1044, "matter_marshmallow", 0xe6e0dc, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem MATTER_GRAHAM = SHAPED_ITEM.addOreDictItem(1045, "matter_graham", 0xf0c25d, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem MATTER_GRAHAM_HOT = SHAPED_ITEM.addOreDictItem(1046, "matter_graham_hot", 0xffe1a1, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem CHUNK_GRAHAM_HOT = SHAPED_ITEM.addOreDictItem(1047, "matter_graham_hot", 0xffe1a1, MaterialIconSet.DULL, OrePrefix.plateDense);
    public static final GTFOOredictItem.OreDictValueItem WAFER_GRAHAM_HOT = SHAPED_ITEM.addOreDictItem(1048, "matter_graham_hot", 0xffe1a1, MaterialIconSet.DULL, OrePrefix.plate);
    public static final GTFOOredictItem.OreDictValueItem CRACKER_GRAHAM_UNGRADED = SHAPED_ITEM.addOreDictItem(1049, "cracker_graham_ungraded", 0xf0c25d, MaterialIconSet.DULL, OrePrefix.plate);
    public static final GTFOOredictItem.OreDictValueItem CHOCOLATE_LIQUOR_PRESSED = SHAPED_ITEM.addOreDictItem(1050, "chocolate_liquor_pressed", 0xa6795a, GTFOValues.Organic, OrePrefix.crushed);
    public static final GTFOOredictItem.OreDictValueItem CHOCOLATE_LIQUOR_DUTCHED_PRESSED = SHAPED_ITEM.addOreDictItem(1051, "chocolate_liquor_dutched_pressed", 0xab7550, GTFOValues.Organic, OrePrefix.crushed);

    //cursed edition
    public static final GTFOProxyItem SodiumCyanide = new GTFOProxyItem(() -> SHAPED_ITEM.addOreDictItem(3000, "sodium_cyanide", averageRGB(1, Sodium.getMaterialRGB(), Carbon.getMaterialRGB(), Nitrogen.getMaterialRGB()), MaterialIconSet.SAND, dust, "NaCN"), 3000, "sodium_cyanide", () -> OreDictUnifier.get(dust, GregTechAPI.MaterialRegistry.get("sodium_cyanide")));
    public static final GTFOProxyItem SodiumCyanideSmall = new GTFOProxyItem(() -> SHAPED_ITEM.addOreDictItem(3001, "sodium_cyanide", averageRGB(1, Sodium.getMaterialRGB(), Carbon.getMaterialRGB(), Nitrogen.getMaterialRGB()), MaterialIconSet.SAND, dustSmall, "NaCN"), 3001, "sodium_cyanide_small", () -> OreDictUnifier.get(dustSmall, GregTechAPI.MaterialRegistry.get("sodium_cyanide")));
    public static final MetaOreDictItem.OreDictValueItem Paracetamol = SHAPED_ITEM.addOreDictItem(3002, "paracetamol", 0xFFFFFF, MaterialIconSet.SAND, dust, "C8H9NO2");
    public static final MetaOreDictItem.OreDictValueItem ParacetamolSmall = SHAPED_ITEM.addOreDictItem(3003, "paracetamol", 0xFFFFFF, MaterialIconSet.SAND, dustSmall, "C8H9NO2");
    public static final MetaOreDictItem.OreDictValueItem Aminophenol = SHAPED_ITEM.addOreDictItem(3004, "aminophenol", 0xFFFFFF, MaterialIconSet.SHINY, dust, "C6H7NO");
    public static final MetaOreDictItem.OreDictValueItem IVNitrophenol = SHAPED_ITEM.addOreDictItem(3005, "ivnitrophenol", 0xFFFFE0, MaterialIconSet.SHINY, dust, "C6H5NO2");
    public static final MetaOreDictItem.OreDictValueItem IINitrophenol = SHAPED_ITEM.addOreDictItem(3006, "iinitrophenol", 0xFFFF00, MaterialIconSet.SHINY, dust, "C6H5NO2");
    public static final MetaOreDictItem.OreDictValueItem PhenylaceticAcid = SHAPED_ITEM.addOreDictItem(3007, "phenylacetic_acid", 0x645256, MaterialIconSet.SAND, dust, "C8H8O2");
    public static final MetaOreDictItem.OreDictValueItem ThoriumDioxide = SHAPED_ITEM.addOreDictItem(3008, "thorium_dioxide", 0x417F87, MaterialIconSet.METALLIC, dust, "ThO2");
    public static final MetaOreDictItem.OreDictValueItem Phenylacetone = SHAPED_ITEM.addOreDictItem(3009, "phenylacetone", 0xB5C79A, MaterialIconSet.SAND, dust, "C9H10O");
    public static final MetaOreDictItem.OreDictValueItem SodiumMethoxide = SHAPED_ITEM.addOreDictItem(3010, "sodium_methoxide", 0x448FCA, MaterialIconSet.SAND, dust, "CH3ONa");
    public static final MetaOreDictItem.OreDictValueItem FormylImpostramine = SHAPED_ITEM.addOreDictItem(3011, "formyl_impostramine", 0x2E616A, MaterialIconSet.SAND, dust, "C11H15NO");
    public static final MetaOreDictItem.OreDictValueItem ImpostramineHydrochloride = SHAPED_ITEM.addOreDictItem(3012, "impostramine_hydrochloride", 0x6BCBEB, MaterialIconSet.SHINY, dust, "C10H16ClN");
    public static final MetaOreDictItem.OreDictValueItem ImpostramineHydrochlorideSmall = SHAPED_ITEM.addOreDictItem(3013, "impostramine_hydrochloride", 0x6BCBEB, MaterialIconSet.SHINY, dustSmall, "C10H16ClN");
    public static final MetaOreDictItem.OreDictValueItem Hydroxyphenylethylpiperidine = SHAPED_ITEM.addOreDictItem(3014, "hydroxyphenylethylpiperidine", 0xD673F0, MaterialIconSet.SAND, dust, "C13H19NO");
    public static final MetaOreDictItem.OreDictValueItem Phenylethylpiperidone = SHAPED_ITEM.addOreDictItem(3015, "phenylethylpiperidone", 0xA46B8C, MaterialIconSet.SAND, dust, "C13H17NO");
    public static final MetaOreDictItem.OreDictValueItem Anilinophenylethylpiperidine = SHAPED_ITEM.addOreDictItem(3016, "anilinophenylethylpiperidine", 0xE8D6FC, MaterialIconSet.SAND, dust, "C19H24N2");
    public static final MetaOreDictItem.OreDictValueItem Greganyl = SHAPED_ITEM.addOreDictItem(3017, "greganyl", 0xB50DEB, MaterialIconSet.SHINY, dust, "C22H28N2O");
    public static final MetaOreDictItem.OreDictValueItem Glucose = SHAPED_ITEM.addOreDictItem(3018, "glucose", 0xFFFFE0, MaterialIconSet.ROUGH, dust, "C6H12O6");
    public static final MetaOreDictItem.OreDictValueItem Fructose = SHAPED_ITEM.addOreDictItem(3019, "fructose", 0x90EE90, MaterialIconSet.ROUGH, dust, "C6H12O6");
    public static final MetaOreDictItem.OreDictValueItem PhosphorousPentachloride = SHAPED_ITEM.addOreDictItem(3020, "phosphorous_pentachloride", 0x093457, MaterialIconSet.ROUGH, dust, "PCl5");
    public static final MetaOreDictItem.OreDictValueItem CobalaminMixture = SHAPED_ITEM.addOreDictItem(3021, "cobalamin_mixture", 0x6c404e, MaterialIconSet.SAND, dust);
    public static final MetaOreDictItem.OreDictValueItem SodiumNitrite = SHAPED_ITEM.addOreDictItem(3022, "sodium_nitrite", 0x878a68, MaterialIconSet.SAND, dust, "NaNO2");
    public static final MetaOreDictItem.OreDictValueItem Cyanocobalamin = SHAPED_ITEM.addOreDictItem(3023, "cyanocobalamin", 0x64ff61, MaterialIconSet.SAND, dust, "C63H88CoN14O14P");
    public static final MetaOreDictItem.OreDictValueItem Cobalamin = SHAPED_ITEM.addOreDictItem(3024, "cobalamin", 0x9c5276, MaterialIconSet.SAND, dust, "C62H89CoN13O14P");
    public static final MetaOreDictItem.OreDictValueItem ZincSulfate = SHAPED_ITEM.addOreDictItem(3025, "zinc_sulfate", 0x9b37d7, MaterialIconSet.SAND, dust, "ZnSO4");
    public static final MetaOreDictItem.OreDictValueItem Hydroxycobalamin = SHAPED_ITEM.addOreDictItem(3026, "hydroxycobalamin", 0x2f0909, MaterialIconSet.SHINY, dust, "C62H89CoN13O15P");
    public static final MetaOreDictItem.OreDictValueItem SodiumNitrate = SHAPED_ITEM.addOreDictItem(3027, "sodium_nitrate", 0xff3db2, MaterialIconSet.ROUGH, dust, "NaNO3");
    public static final MetaOreDictItem.OreDictValueItem LevulinicAcid = SHAPED_ITEM.addOreDictItem(3028, "levulinic_acid", 0x9db5d6, MaterialIconSet.ROUGH, dust, "C5H8O3");
    public static final MetaOreDictItem.OreDictValueItem MethylLevulinate = SHAPED_ITEM.addOreDictItem(3029, "methyl_levulinate", 0xb96dec, MaterialIconSet.ROUGH, dust, "C6H10O3");
    public static final MetaOreDictItem.OreDictValueItem CupricChloride = SHAPED_ITEM.addOreDictItem(3030, "cupric_chloride", 0x0b924a, MaterialIconSet.ROUGH, dust, "CuCl2");
    public static final MetaOreDictItem.OreDictValueItem MethylChlorolevulinate = SHAPED_ITEM.addOreDictItem(3031, "methyl_chlorolevulinate", 0x7250b7, MaterialIconSet.ROUGH, dust, "C6H9ClO3");
    public static final MetaOreDictItem.OreDictValueItem PhthalicAnhydride = SHAPED_ITEM.addOreDictItem(3032, "phthalic_anhydride", 0x507ef7, MaterialIconSet.ROUGH, dust, "C6H4O3");
    public static final MetaOreDictItem.OreDictValueItem Phthalimide = SHAPED_ITEM.addOreDictItem(3033, "phthalimide", 0xad1f89, MaterialIconSet.ROUGH, dust, "C6H5NO2");
    public static final MetaOreDictItem.OreDictValueItem PotassiumPhthalimide = SHAPED_ITEM.addOreDictItem(3034, "potassium_phthalimide", 0x699a63, MaterialIconSet.ROUGH, dust, "C6H4KNO2");
    public static final MetaOreDictItem.OreDictValueItem AminolevulinicAcid = SHAPED_ITEM.addOreDictItem(3035, "aminolevulinic_acid", 0xcd4c6a, MaterialIconSet.ROUGH, dust, "C5H9NO3");
    public static final MetaOreDictItem.OreDictValueItem Dinitrodimethylbenzene = SHAPED_ITEM.addOreDictItem(3036, "dinitrodimethylbenzene", 0x4115f2, MaterialIconSet.ROUGH, dust, "C8H8N2O4");
    public static final MetaOreDictItem.OreDictValueItem Dimethylphenylenediamine = SHAPED_ITEM.addOreDictItem(3037, "dimethylphenylenediamine", 0x75ca5b, MaterialIconSet.ROUGH, dust, "C8H12N2");
    public static final MetaOreDictItem.OreDictValueItem Dimethylbenzimidazole = SHAPED_ITEM.addOreDictItem(3038, "dimethylbenzimidazole", 0x7c58c2, MaterialIconSet.ROUGH, dust, "C9H10N2");
    public static final MetaOreDictItem.OreDictValueItem BacillusMegabacterium = SHAPED_ITEM.addOreDictItem(3039, "bacillus_megabacterium", 0xce1b94, MaterialIconSet.ROUGH, dust);
    public static final MetaOreDictItem.OreDictValueItem CobaltChloride = SHAPED_ITEM.addOreDictItem(3040, "cobalt_chloride", 0x97cc78, MaterialIconSet.ROUGH, dust, "CoCl2");
    public static final MetaOreDictItem.OreDictValueItem SodiumFormate = SHAPED_ITEM.addOreDictItem(3041, "sodium_formate", 0xffaaa, MaterialIconSet.ROUGH, dust, "CHO2Na");
    public static final MetaOreDictItem.OreDictValueItem OxalicAcid = SHAPED_ITEM.addOreDictItem(3042, "oxalic_acid", 0x4aaae2, MaterialIconSet.ROUGH, dust, "C2H2O4");

    public static void onMaterialsInit() {
        Materials.Iron.addFlags(GENERATE_FRAME);
        Materials.BismuthBronze.addFlags(GENERATE_FRAME);
        Materials.Aluminium.addFlags(GENERATE_DENSE);
        Materials.StainlessSteel.addFlags(GENERATE_DENSE, GENERATE_SPRING_SMALL);
        Materials.Titanium.addFlags(GENERATE_DENSE);
        Materials.Aluminium.addFlags(GENERATE_DENSE);

        Water.setProperty(FERTILIZER, new FertilizerProperty(5));
        Blood.setProperty(FERTILIZER, new FertilizerProperty(30));
        FertilizerSolution.setProperty(FERTILIZER, new FertilizerProperty(15));
        HydrogenCyanide.setProperty(LACING, new LacingProperty());
    }

    public static Material.Builder fluidBuilder(int id, String name) {
        return new Material.Builder(id, "gtfo_" + name).fluid();
    }
    public static void customFluidTextures() {
        MetaFluids.setMaterialFluidTexture(GTFOMaterialHandler.RainbowSap, FluidTypes.LIQUID);
    }
    public static void registerFertilizerTooltips() {
        for (Material material : GregTechAPI.MATERIAL_REGISTRY) {
            FertilizerProperty fertilizerProperty = material.getProperty(FERTILIZER);

            if (fertilizerProperty != null)
                FluidTooltipUtil.registerTooltip(material.getFluid(), LocalizationUtils.format("gregtechfoodoption.fluid.fertilizer", fertilizerProperty.getBoostPercentage()));
            LacingProperty lacingProperty = material.getProperty(LACING);
            if (lacingProperty != null)
                FluidTooltipUtil.registerTooltip(material.getFluid(), LocalizationUtils.format("gregtechfoodoption.fluid.lacing"));
        }
    }
    public static Material.Builder fluidBuilder(int id, String name, FluidType type) {
        return new Material.Builder(id, "gtfo_" + name).fluid(type);
    }
}
