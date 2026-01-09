package com.highskyguy1.highmod.datagen;

import com.highskyguy1.highmod.block.ModBlocks;
import com.highskyguy1.highmod.item.ModItems;
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
            itemModelGenerator.register(ModItems.STAINLESS_STEEL, Models.GENERATED);
            itemModelGenerator.register(ModItems.BANANA, Models.HANDHELD);
            itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
            itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
            itemModelGenerator.register(ModItems.ENCHANTED_PEAR, Models.GENERATED);

            itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
            itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
            itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);
            itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
            itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);

            itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);

            itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_BOOTS);
    }
}
