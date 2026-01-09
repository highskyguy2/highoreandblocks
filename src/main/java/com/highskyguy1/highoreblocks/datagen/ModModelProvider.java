package com.highskyguy1.highoreblocks.datagen;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        BlockStateModelGenerator.BlockTexturePool steelPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STAINLESS_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
      steelPool.stairs(ModBlocks.STEEL_STAIRS);
      steelPool.pressurePlate(ModBlocks.STEEL_PRESSURE_PLATE);
      steelPool.slab(ModBlocks.STEEL_SLAB);
      steelPool.button(ModBlocks.STEEL_BUTTON);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAINLESS_STEEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MAGIC_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BANANA_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_LEGGINGS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_LEGGINGS);

        itemModelGenerator.register(ModItems.HASTE_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.INSTANT_HEALTH_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGHT_VISION_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_RESISTANT_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADVANCED_HASTE_PILL, Models.GENERATED);
    }
}
