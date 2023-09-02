package net.caballerosupreme.empyrean_ores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab EMPYREAN_ORES_TAB = new CreativeModeTab("empyrean_ores_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LOW_CARBON_STEEL_INGOT.get());
        }
    };

}
