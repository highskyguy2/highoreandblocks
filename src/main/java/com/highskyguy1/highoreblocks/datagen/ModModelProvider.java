package com.highskyguy1.highoreblocks.datagen;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
        itemModelGenerator.register(ModItems.MAGIC_POWDER, Models.GENERATED);
    }
}
