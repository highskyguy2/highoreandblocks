package com.highskyguy1.highmod.tools;


import com.highskyguy1.highmod.item.ModItems;
import com.highskyguy1.highmod.util.ModMiningLevels;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;
import java.util.stream.Stream;

public enum ModToolMaterials implements ToolMaterial {
    BANANA(ModMiningLevels.BANANA_MINING_LEVEL, 10000, 7.0F, 5F, 38, () -> Ingredient.ofItems(ModItems.BANANA)),
    STEEL(ModMiningLevels.STEEL_MINING_LEVEL, 500, 7.0F, 5F, 16, () -> Ingredient.ofItems(ModItems.STAINLESS_STEEL)),
    RUBY(ModMiningLevels.RUBY_MINING_LEVEL, 1300,7.5F,3.5F,25, () -> Ingredient.ofItems(ModItems.RUBY)),
    TITANIUM(ModMiningLevels.TITANIUM_MINING_LEVEL, 13000, 7.5F, 3.6F, 25, () -> Ingredient.ofItems(ModItems.TITANIUM))
    ;
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
