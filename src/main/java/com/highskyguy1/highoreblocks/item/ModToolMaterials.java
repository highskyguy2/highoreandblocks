package com.highskyguy1.highoreblocks.item;


import com.google.common.base.Suppliers;
import com.highskyguy1.highoreblocks.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    RUBY(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            1300,7.5F,3.5F,25, () -> Ingredient.ofItems(ModItems.RUBY)),
    STEEL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            500, 7.0F, 5F, 16, () -> Ingredient.ofItems(ModItems.STAINLESS_STEEL)),
    BANANA(ModTags.Blocks.INCORRECT_FOR_BANANA_TOOL,
            10000, 7.0F, 5F, 38, () -> Ingredient.ofItems(ModItems.BANANA))

    ;






    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey<Block> tagKey, final int j, final float f, final float g, final int k, final Supplier<Ingredient> supplier) {
        this.inverseTag = tagKey;
        this.itemDurability = j;
        this.miningSpeed = f;
        this.attackDamage = g;
        this.enchantability = k;
        this.repairIngredient = Suppliers.memoize(supplier::get);
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
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
