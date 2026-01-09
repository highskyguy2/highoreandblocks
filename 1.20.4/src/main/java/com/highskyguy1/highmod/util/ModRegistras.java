package com.highskyguy1.highmod.util;

import com.highskyguy1.highmod.item.ModItems;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import javax.naming.directory.ModificationItem;

public final class ModRegistras {
    public static ShapedRecipeJsonBuilder createShaped(RecipeCategory rcc, ItemConvertible output, int c){
            return ShapedRecipeJsonBuilder.create(rcc, output ,c);
    }
    public static FoodComponent createStew(float sm){
        return new FoodComponent.Builder()
                .saturationModifier(sm)
                .alwaysEdible()
                .build();
    }
    public static FoodComponent createStewWithSaturation(float sm, int t, float amp){
        return new FoodComponent.Builder()
                .saturationModifier(sm)
                .alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, t), amp)
                .build();
    }
    public static ShapedRecipeJsonBuilder createPickaxeRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('#', item);


    }
    public static FoodComponent createPillComponents(StatusEffect statusEffect, int t, float a){
        return new FoodComponent.Builder()
                .saturationModifier(1.2f)
                .alwaysEdible()
                .statusEffect(new StatusEffectInstance(statusEffect, t), a)
                .build();
    }

    public static Item createPillItem(String name, FoodComponent fc){
        return ModItems.registerItem(name,
                new Item(new Item.Settings().food(fc)));
    }

    public static ShapedRecipeJsonBuilder createAxeRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('#', item);


    }
    public static ShapedRecipeJsonBuilder createSwordRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('S', Items.STICK)
                .input('#', item);


    }
    public static ShapedRecipeJsonBuilder createShovelRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('#', item);


    }
    public static ShapedRecipeJsonBuilder createHoeRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('#', item);


    }
    public static ShapedRecipeJsonBuilder createHelmetRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("###")
                .pattern("# #")


                .input('#', item);
    }
    public static ShapedRecipeJsonBuilder createCPRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")


                .input('#', item);
    }
    public static ShapedRecipeJsonBuilder createLeggingsRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")


                .input('#', item);
    }
    public static ShapedRecipeJsonBuilder createBootsRecipe(ItemConvertible output, ItemConvertible item){
        return  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output , 1)
                .pattern("# #")
                .pattern("# #")


                .input('#', item);
    }
}
