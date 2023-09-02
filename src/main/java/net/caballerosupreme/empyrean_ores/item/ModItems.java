package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.custom.CustomHelmetItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmpyreanOres.MOD_ID);

    //Add your custom items here (the string must be lowercase and no spaces)

    //Low Carbon Steel Ingot
    public static final RegistryObject<Item> LOW_CARBON_STEEL_INGOT = ITEMS.register("low_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Mid Carbon Steel Ingot
    public static final RegistryObject<Item> MID_CARBON_STEEL_INGOT = ITEMS.register("mid_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //High Carbon Steel Ingot
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register("high_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Aluminum Ingot
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Opal
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Mandalorian Helmet (debug only)
    public static final RegistryObject<Item> MANDALORIAN_HELMET = ITEMS.register("mandalorian_helmet",
            () -> new CustomHelmetItem(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Sapphire Pickaxe
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE, 10,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Opal Pickaxe
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            () -> new PickaxeItem(ModTiers.OPAL, 12,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Steel Pickaxe
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 8,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Ruby Pickaxe
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 8,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Amethyst Pickaxe
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModTiers.AMETHYST, 8,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Aluminum Pickaxe
    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(ModTiers.ALUMINUM, 1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
