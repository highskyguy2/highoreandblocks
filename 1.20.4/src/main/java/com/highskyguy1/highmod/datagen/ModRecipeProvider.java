package com.highskyguy1.highmod.datagen;

import com.highskyguy1.highmod.block.ModBlocks;
import com.highskyguy1.highmod.item.ModItems;
import com.highskyguy1.highmod.util.ModRegistras;
import com.highskyguy1.highmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        final List<ItemConvertible> RUBY_ORE_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModItems.RUBY);

        offerSmelting(exporter, RUBY_ORE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, 0.3f, 200, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY , RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RUBY_BLOCK);

        ModRegistras.createShaped(RecipeCategory.MISC, ModItems.STAINLESS_STEEL, 10)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', ModTags.Items.STAINLESS_STEEL_ACCEPTABLE_SWORD)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ModRegistras.createShaped(RecipeCategory.MISC, Items.IRON_INGOT, 10)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', ModTags.Items.STAINLESS_STEEL_ACCEPTABLE_SWORD)
                .input('I', ModItems.STAINLESS_STEEL)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.STAINLESS_STEEL, Items.IRON_INGOT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, Items.IRON_INGOT, ModItems.STAINLESS_STEEL);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BEDROCK, 5)
                .input(ItemTags.BEDS)
                .input(ItemTags.STONE_CRAFTING_MATERIALS)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);


    }
}
