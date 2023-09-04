package net.caballerosupreme.empyrean_ores.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class AmethystArmorItem extends ArmorItem {

    /*
    @Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "extraminerals:textures/models/armor/aluminum_armor_model_layer_1.png";
		}
     */


    public AmethystArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties) {
        super(armorMaterial, equipmentSlot, properties);
    }
}
