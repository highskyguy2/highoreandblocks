package com.highskyguy1.highmod.datagen;

import com.highskyguy1.highmod.block.ModBlocks;
import com.highskyguy1.highmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.data.DataWriter;
import net.minecraft.loot.LootTable;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.TITANIUM_ORE);
    }
}
