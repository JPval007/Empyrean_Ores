package net.caballerosupreme.empyrean_ores.item;


import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Objects;

//This is the mod tool tiers (just add sapphire tier)
public class ModTiers {

    /*
    1. Opal         2600
    2. Sapphire     2200 ------------
    3. Netherite    2031 ------------
    4. Diamond      1561
    5. Steel        1200
    6. Ruby         700 -------------
    7. Amethyst     300
    8. Iron         250
    9. Aluminum     200 -------------
    10. Stone       131
    11. Wood        59
     */
    //Put the weakest first and the strongest last


    //Aluminum Tier

    //Amethyst Tier
    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(2, 300, 6f,5f,14,
                    ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD)),
            new ResourceLocation(EmpyreanOres.MOD_ID, "amethyst"), List.of(Tiers.STONE), List.of());

    //Ruby Tier
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(2, 700, 6f,5f,14,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "ruby"), List.of(ModTiers.AMETHYST), List.of());

    //Steel Tier
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1200, 8f,5f,15,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.HIGH_CARBON_STEEL_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "steel"), List.of(Tiers.DIAMOND), List.of());

    //Sapphire Mining Tier (Above Netherite)
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2200, 10f,5f,22,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL,() -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

    //Add Opal Tier
    public static final Tier OPAL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2600, 12f,5f,25,
                    ModTags.Blocks.NEEDS_OPAL_TOOL,() -> Ingredient.of(ModItems.OPAL.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "opal"), List.of(ModTiers.SAPPHIRE), List.of());





}
