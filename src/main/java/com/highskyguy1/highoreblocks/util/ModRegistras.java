package com.highskyguy1.highoreblocks.util;

import com.highskyguy1.highoreblocks.item.ModItems;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Rarity;

public class ModRegistras {
    public static Item registerPills(String name, FoodComponent p){
        return ModItems.registerItem(name,
                new Item(new Item.Settings()
                        .food(p)
                        .rarity(Rarity.UNCOMMON)));
    }
    public static FoodComponent.Builder pillBuilder(int n, RegistryEntry<StatusEffect> statusEffects, int t, float amp){
        return new FoodComponent.Builder()
                .nutrition(n)
                .saturationModifier(1.5f)
                .statusEffect(new StatusEffectInstance(statusEffects, t), amp)
                .alwaysEdible();
    }
    public static FoodComponent.Builder createPoison(int n, float sm, int t, float amp){
        return new FoodComponent.Builder().nutrition(n).saturationModifier(sm)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, t), amp);
    }
    public static FoodComponent.Builder createStewWithSaturation(int n, float sm, int t, float amp){
        return new FoodComponent.Builder().nutrition(n).saturationModifier(sm)
                .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, t), amp)
                .usingConvertsTo(Items.BOWL);
    }
    public static FoodComponent.Builder createStew(int n, float sm){
        return new FoodComponent.Builder().nutrition(n).saturationModifier(sm)
                .usingConvertsTo(Items.BOWL);
    }
    public static CraftingRecipeJsonBuilder createPillRecipeWithTags(Item output, int c, TagKey<Item> asterisk, ItemConvertible g){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, c)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .input('#', asterisk)
                .input('G', g);
    }
    public static CraftingRecipeJsonBuilder createPillRecipe(Item output, int c, ItemConvertible asterisk, ItemConvertible g){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, c)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .input('#', asterisk)
                .input('G', g);
    }
    public static CraftingRecipeJsonBuilder createHelmetRecipe(ItemConvertible output, ItemConvertible material){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1).pattern("###").pattern("# #").input('#', material);
    }
    public static CraftingRecipeJsonBuilder createChestPRecipe(ItemConvertible output, ItemConvertible material){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1).pattern("# #").pattern("###").pattern("###").input('#', material);

    }
    public static CraftingRecipeJsonBuilder createLeggingsRecipe(ItemConvertible output, ItemConvertible material){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1).pattern("###").pattern("# #").pattern("# #").input('#', material);

    }
    public static CraftingRecipeJsonBuilder createBootsRecipe(ItemConvertible output, ItemConvertible material){
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1).pattern("# #").pattern("# #").input('#', material);

    }
}
