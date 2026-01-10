package com.highskyguy1.highmod.armor;

import com.highskyguy1.highmod.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SteelArmorMaterial implements ArmorMaterial {
    @Override
    public int getDurability(ArmorItem.Type type) {
        return 10000;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvent.of(SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE.getId());
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.STAINLESS_STEEL);
    }

    @Override
    public String getName() {
        return "stainless_steel";
    }

    @Override
    public float getToughness() {
        return 8;
    }

    @Override
    public float getKnockbackResistance() {
        return 4.2f;
    }
}
