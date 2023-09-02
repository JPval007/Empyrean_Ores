package net.caballerosupreme.empyrean_ores.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, EmpyreanOres.MOD_ID);

    //Creating the ore block list (Aluminum)
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALUMINUM_ORES = Suppliers.memoize(()->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINUM_ORE.get().defaultBlockState())
    )); //Add another OreConfiguration.target() inside with a "," for deepslate ores


    //Ruby
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(()->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState())
    )); //Add another OreConfiguration.target() inside with a "," for deepslate ores

    //Amethyst
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AMETHYST_ORES = Suppliers.memoize(()->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState())
    )); //Add another OreConfiguration.target() inside with a "," for deepslate ores

    //Sapphire
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SAPPHIRE_ORES = Suppliers.memoize(()->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState())
    )); //Add another OreConfiguration.target() inside with a "," for deepslate ores

    //Opal
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_OPAL_ORES = Suppliers.memoize(()->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.OPAL_ORE.get().defaultBlockState())
    )); //Add another OreConfiguration.target() inside with a "," for deepslate ores



    //Register the new modded ore
    //Aluminum
    public static final RegistryObject<ConfiguredFeature<?,?>> ALUMINUM_ORE = CONFIGURED_FEATURES.register("aluminum_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINUM_ORES.get(), 8)));
    //The 8 is the vein size


    //Ruby
    public static final RegistryObject<ConfiguredFeature<?,?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 6)));
    //The 6 is the vein size

    //Amethyst
    public static final RegistryObject<ConfiguredFeature<?,?>> AMETHYST_ORE = CONFIGURED_FEATURES.register("amethyst_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_AMETHYST_ORES.get(), 5)));
    //The 5 is the vein size

    //Sapphire
    public static final RegistryObject<ConfiguredFeature<?,?>> SAPPHIRE_ORE = CONFIGURED_FEATURES.register("sapphire_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(), 6)));
    //The 6 is the vein size

    //Opal
    public static final RegistryObject<ConfiguredFeature<?,?>> OPAL_ORE = CONFIGURED_FEATURES.register("opal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_OPAL_ORES.get(), 6)));
    //The 6 is the vein size



    //Something to call this class in the main program file
    public static void register(IEventBus eventBus) {

        CONFIGURED_FEATURES.register(eventBus);

    }

}
