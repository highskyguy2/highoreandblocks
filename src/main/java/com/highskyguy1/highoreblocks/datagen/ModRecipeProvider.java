package com.highskyguy1.highoreblocks.datagen;


import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.item.ModItems;
import com.highskyguy1.highoreblocks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import com.highskyguy1.highoreblocks.util.ModRegistras;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
            List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE);
            List <ItemConvertible> TITANIUM_SMELTABLES = List.of(ModBlocks.TITANIUM_ORE);

            offerSmelting(recipeExporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM, 0.25f, 200, "titanium");
        offerBlasting(recipeExporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM, 0.25f, 60, "titanium");

            offerSmelting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");


        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModItems.STAINLESS_STEEL, Items.IRON_INGOT, 5);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, Items.IRON_INGOT, ModItems.STAINLESS_STEEL, 5);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STAINLESS_STEEL, RecipeCategory.DECORATIONS, ModBlocks.STAINLESS_STEEL_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUBY_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);


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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_AXE, 1)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_AXE, 1)
                .pattern("###")
                .pattern(" S#")
                .pattern(" S ")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter, Identifier.of(HighsOresAndBlocks.MOD_ID, "ruby_axe_2"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_SHOVEL, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HOE, 1)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('#', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter, Identifier.of(HighsOresAndBlocks.MOD_ID, "ruby_hoe_69"));
        // steel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_AXE, 1)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('#', ModItems.STAINLESS_STEEL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.STAINLESS_STEEL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', ModItems.STAINLESS_STEEL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_SHOVEL, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', ModItems.STAINLESS_STEEL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HOE, 1)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('#', ModItems.STAINLESS_STEEL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIC_POWDER, 15)
                .pattern("$$$")
                .pattern("$G$")
                .pattern("###")
                .input('#', Items.COAL_BLOCK)
                .input('G', Items.GUNPOWDER)
                .input('$', Items.TNT)
                .criterion(hasItem(ModItems.STAINLESS_STEEL), conditionsFromItem(ModItems.STAINLESS_STEEL))
                .offerTo(recipeExporter);
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_PEAR, 5)
                .pattern("###")
                .pattern("#P#")
                .pattern("###")
                .input('#', Items.GOLD_BLOCK)
                .input('P', ModItems.PEAR)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ENCHANTED_PEAR, 2)
                .pattern("###")
                .pattern("#P#")
                .pattern("###")
                .input('#', ModItems.GOLDEN_PEAR)
                .input('P', ModItems.PEAR)
                .criterion(hasItem(ModItems.GOLDEN_PEAR), conditionsFromItem(ModItems.GOLDEN_PEAR))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PEAR_STEW, 1)
                        .input(Items.BOWL)
                                .input(ModItems.PEAR)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(recipeExporter);
        ModRegistras.createPillRecipeWithTags(ModItems.HASTE_PILL, 60, ModTags.Items.HASTE_PILL_ACCEPTABLE_PICKAXES, ModItems.EMPTY_PILL)
                .criterion(hasItem(ModItems.EMPTY_PILL), conditionsFromItem(ModItems.EMPTY_PILL))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BEDROCK, 5)
                .input(ItemTags.BEDS)
                .input(ItemTags.STONE_CRAFTING_MATERIALS)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(recipeExporter);
        ModRegistras.createPillRecipeWithTags(ModItems.ADVANCED_HASTE_PILL, 30, ModTags.Items.HASTE_PILL_ACCEPTABLE_PICKAXES, ModItems.HASTE_PILL)
                .criterion(hasItem(ModItems.EMPTY_PILL), conditionsFromItem(ModItems.EMPTY_PILL))
                .offerTo(recipeExporter);

        ModRegistras.createPillRecipeWithTags(ModItems.INSTANT_HEALTH_PILL, 60, ModTags.Items.INSTANT_HEALTH_ACCEPTABLE_ITEMS, ModItems.EMPTY_PILL)
                .criterion(hasItem(ModItems.EMPTY_PILL), conditionsFromItem(ModItems.EMPTY_PILL))
                .offerTo(recipeExporter);
        ModRegistras.createPillRecipeWithTags(ModItems.FIRE_RESISTANT_PILL, 60, ModTags.Items.FIRE_RESISTANT_PILL_ACCEPTABLE_ITEMS, ModItems.EMPTY_PILL)
                .criterion(hasItem(ModItems.EMPTY_PILL), conditionsFromItem(ModItems.EMPTY_PILL))
                .offerTo(recipeExporter);
        ModRegistras.createPillRecipe(ModItems.NIGHT_VISION_PILL, 60, Items.CARROT, ModItems.EMPTY_PILL)
                .criterion(hasItem(ModItems.EMPTY_PILL), conditionsFromItem(ModItems.EMPTY_PILL))
                .offerTo(recipeExporter);
        ModRegistras.createHelmetRecipe(ModItems.TITANIUM_HELMET, ModItems.TITANIUM);
        ModRegistras.createChestPRecipe(ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM);
        ModRegistras.createLeggingsRecipe(ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM);
        ModRegistras.createBootsRecipe(ModItems.TITANIUM_BOOTS, ModItems.TITANIUM);

        ModRegistras.createHelmetRecipe(ModItems.STEEL_HELMET, ModItems.STAINLESS_STEEL);
        ModRegistras.createChestPRecipe(ModItems.STEEL_CHESTPLATE, ModItems.STAINLESS_STEEL);
        ModRegistras.createLeggingsRecipe(ModItems.STEEL_LEGGINGS, ModItems.STAINLESS_STEEL);
        ModRegistras.createBootsRecipe(ModItems.STEEL_BOOTS, ModItems.STAINLESS_STEEL);

    }



}
