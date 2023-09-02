package net.caballerosupreme.empyrean_ores.util;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {

    //Represents the block tags of the mod
    public static class Blocks {
        //Put here your custom block tags
        //Ore debug utility tag
        public static final TagKey<Block> ORE_GENERATION_DEBUG = tag("ore_generation_debug");

        //Sapphire Tier Tag
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        //Opal Tier Tag (just a dummy, every tool tag is a dummy except sapphire)
        public static final TagKey<Block> NEEDS_OPAL_TOOL = tag("needs_opal_tool");

        //Steel Tier Tag
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");

        //Ruby Tier Tag
        public static final TagKey<Block> NEEDS_RUBY_TOOL = tag("needs_ruby_tool");

        //Amethyst key method
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = tag("needs_amethyst_tool");

        //Aluminum key method
        public static final TagKey<Block> NEEDS_ALUMINUM_TOOL = tag("needs_aluminum_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EmpyreanOres.MOD_ID, name));
        }
    }

    //Represents the item tags of the mod
    public static class Items {
        //pUT Here your item tags

        //Tag key method
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EmpyreanOres.MOD_ID, name));
        }

    }

    //Biome tags
    public static class Biomes {

        //Put here your biome tags
        //Sapphire
        public static final TagKey<Biome> SAPPHIRE_GENERATION = tag("sapphire_generation");
        //Opal
        public static final TagKey<Biome> OPAL_GENERATION = tag("opal_generation");

        //Tag key method
        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(EmpyreanOres.MOD_ID, name));
        }

    }

}
