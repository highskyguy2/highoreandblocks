package com.highskyguy1.highoreblocks.datagen;


import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
            List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE);

            offerSmelting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");


        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModItems.STAINLESS_STEEL, Items.IRON_INGOT, 5);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, Items.IRON_INGOT, ModItems.STAINLESS_STEEL, 5);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STAINLESS_STEEL, RecipeCategory.DECORATIONS, ModBlocks.STAINLESS_STEEL_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STAINLESS_STEEL,5)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', Items.IRON_SWORD)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter, Identifier.of(HighsOresAndBlocks.MOD_ID, "stainless_steel_from_crafting_21"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.IRON_INGOT, 5)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', Items.IRON_SWORD)
                .input('I', ModItems.STAINLESS_STEEL)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter, Identifier.of(HighsOresAndBlocks.MOD_ID, "iron_ingot_32423"));
        //
        offerSlabRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.STEEL_SLAB, ModItems.STAINLESS_STEEL);
        createPressurePlateRecipe(RecipeCategory.MISC, ModBlocks.STEEL_PRESSURE_PLATE,  Ingredient.ofItems(ModItems.STAINLESS_STEEL))
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
        createStairsRecipe(ModBlocks.STEEL_STAIRS, Ingredient.ofItems(ModItems.STAINLESS_STEEL))
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STEEL_BUTTON, 10)
                .pattern("#")

                .input('#', ModItems.STAINLESS_STEEL)

                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
    }



}
