package net.caballerosupreme.empyrean_ores.block;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.block.custom.GlowOre;
import net.caballerosupreme.empyrean_ores.item.ModCreativeModeTab;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmpyreanOres.MOD_ID);

    //Put your blocks here
    /*
    .strength(destroyTime, explosionResistance) both are float datatypes, maybe that's why they have the f
    .strength(destroyTime and explosionResistance) copies the same value for both properties
    .istabreak() returns .strength(0.0F) meaning, minimal block strength
     */
    //Low Carbon Steel Block
    public static final RegistryObject<Block> LOW_CARBON_STEEL_BLOCK = registerBlock("low_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f,8f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Mid Carbon Steel Block
    public static final RegistryObject<Block> MID_CARBON_STEEL_BLOCK = registerBlock("mid_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f,8f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //High Carbon Steel Block
    public static final RegistryObject<Block> HIGH_CARBON_STEEL_BLOCK = registerBlock("high_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(8f,10f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Aluminum Block
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,2f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Aluminum Ore
    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Opal Block
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(8f,15f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Opal Ore
    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore",
            () -> new GlowOre(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f,5f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(GlowOre.LIT) ? 9 : 0)
                    .randomTicks()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Ruby Block
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(4f,2f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Ruby Ore
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,2f).requiresCorrectToolForDrops(),
                    UniformInt.of(0,20)), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Sapphire Block
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(10f,13f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);
    //Sapphire Ore
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f,7f).requiresCorrectToolForDrops(),
                    UniformInt.of(15,20)), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Amethyst Block (Cut texture)
    public static final RegistryObject<Block> CUT_AMETHYST = registerBlock("cut_amethyst",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2f,2.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //Amethyst Ore
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,2.5f).requiresCorrectToolForDrops(),
                    UniformInt.of(9,15)), ModCreativeModeTab.EMPYREAN_ORES_TAB);

    //

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
