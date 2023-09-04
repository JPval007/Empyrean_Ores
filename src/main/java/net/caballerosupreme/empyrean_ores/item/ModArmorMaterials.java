package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    ALUMINUM("aluminum", 13, new int[]{1, 4, 5, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.ALUMINUM_INGOT.get());
    }),
    STEEL("steel", 30, new int[]{3, 5, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.8F, 0.0F, () -> {
        return Ingredient.of(ModItems.HIGH_CARBON_STEEL_INGOT.get());
    }),
    RUBY("ruby", 28, new int[]{3, 4, 6, 3}, 8, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    }),
    AMETHYST("amethyst", 25, new int[]{3, 4, 5, 3}, 8, SoundEvents.AMETHYST_BLOCK_PLACE, 1.0F, 0.0F, () -> {
        return Ingredient.of(Items.AMETHYST_SHARD);
    }),
    SAPPHIRE("sapphire", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.SAPPHIRE.get());
    }),
    OPAL("opal", 42, new int[]{4, 7, 9, 4}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.OPAL.get());
    });

//37 is the durability multiplier
    //The other two vaules (3.0 and 0.1F) are the toughness and knockback resistance
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return EmpyreanOres.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
