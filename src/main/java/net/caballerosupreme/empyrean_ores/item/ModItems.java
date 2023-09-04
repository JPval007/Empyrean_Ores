package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.custom.AluminumArmorItem;
import net.caballerosupreme.empyrean_ores.item.custom.CustomHelmetItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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
    //-------------------------------------------------------------------------------------------------------------------------
    //Pickaxes

    //Sapphire Pickaxe
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE, 4,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Opal Pickaxe
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            () -> new PickaxeItem(ModTiers.OPAL, 4,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Steel Pickaxe
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 3,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Ruby Pickaxe
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 3,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Amethyst Pickaxe
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModTiers.AMETHYST, 2,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //Aluminum Pickaxe
    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(ModTiers.ALUMINUM, 1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB).stacksTo(1)));

    //-------------------------------------------------------------------------------------------------------------------------
    //Swords

    //Opal
    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword",
            () -> new SwordItem(ModTiers.OPAL, 9,3f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModTiers.SAPPHIRE, 8,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Steel
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 7,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Ruby
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 6,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Amethyst
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModTiers.AMETHYST, 5,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",
            () -> new SwordItem(ModTiers.ALUMINUM, 4,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));


    //-------------------------------------------------------------------------------------------------------------------------
    //Axes

    //Opal
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe",
            () -> new AxeItem(ModTiers.OPAL, 10,3f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModTiers.SAPPHIRE, 9,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Steel
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 8,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Ruby
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 5,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Amethyst
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModTiers.AMETHYST, 3,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe",
            () -> new AxeItem(ModTiers.ALUMINUM, 2,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //-------------------------------------------------------------------------------------------------------------------------
    //Shovels

    //Opal
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel",
            () -> new ShovelItem(ModTiers.OPAL, 3.5f,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModTiers.SAPPHIRE, 3,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Steel
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 2,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Ruby
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 2,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Amethyst
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModTiers.AMETHYST, 1.5f,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",
            () -> new ShovelItem(ModTiers.ALUMINUM, 1.5f,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //-------------------------------------------------------------------------------------------------------------------------
    //Hoes

    //Opal
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe",
            () -> new HoeItem(ModTiers.OPAL, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModTiers.SAPPHIRE, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Steel
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Ruby
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Amethyst
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModTiers.AMETHYST, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",
            () -> new HoeItem(ModTiers.ALUMINUM, 1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    //-------------------------------------------------------------------------------------------------------------------------
    //Armor

    //Opal

    //Sapphire

    //Steel

    //Ruby

    //Amethyst

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
            () -> new AluminumArmorItem(ModArmorMaterials.ALUMINUM, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",
            () -> new AluminumArmorItem(ModArmorMaterials.ALUMINUM, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    public static final RegistryObject<Item> ALUMINUM_LEGGINS = ITEMS.register("aluminum_leggins",
            () -> new AluminumArmorItem(ModArmorMaterials.ALUMINUM, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));

    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
            () -> new AluminumArmorItem(ModArmorMaterials.ALUMINUM, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.EMPYREAN_ORES_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
