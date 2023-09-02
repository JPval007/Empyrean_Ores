package net.caballerosupreme.empyrean_ores.world.feature;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, EmpyreanOres.MOD_ID);

    //Thing that makes the ore distribution charts
    //Aluminum Ore
    public static final RegistryObject<PlacedFeature> ALUMINUM_ORE_PLACED = PLACED_FEATURES.register("aluminum_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALUMINUM_ORE.getHolder().get(),
                    commonOrePlacement(40, //veins per chunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(40),VerticalAnchor.absolute(120)))));

    //Ruby
    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(),
                    commonOrePlacement(15, //veins per chunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(60)))));

    //Amethyst
    public static final RegistryObject<PlacedFeature> AMETHYST_ORE_PLACED = PLACED_FEATURES.register("amethyst_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.AMETHYST_ORE.getHolder().get(),
                    commonOrePlacement(20, //veins per chunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(120)))));

    //Sapphire
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("sapphire_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE.getHolder().get(),
                    commonOrePlacement(30, //veins per chunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(100),VerticalAnchor.absolute(250)))));

    //Opal
    public static final RegistryObject<PlacedFeature> OPAL_ORE_PLACED = PLACED_FEATURES.register("opal_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.OPAL_ORE.getHolder().get(),
                    commonOrePlacement(35, //veins per chunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(80),VerticalAnchor.absolute(255)))));


/*
Delta = Max height - min height
For a common ore it is good to put about 40% of Delta veins per chunk but if Delta is too big then increase it to 70%
 */


    //Ore placement methods
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }


    //Method to call in the main program
    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }


}
