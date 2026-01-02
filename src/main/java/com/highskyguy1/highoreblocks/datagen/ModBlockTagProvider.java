package com.highskyguy1.highoreblocks.datagen;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;



public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    public static final TagKey<Block> NEEDS_DIAMOND =
            TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft", "needs_diamond"));
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                        .add(ModBlocks.STAINLESS_STEEL_BLOCK)
                .add(ModBlocks.STEEL_BUTTON)
                .add(ModBlocks.STEEL_SLAB)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_STAIRS)

                ;
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.STAINLESS_STEEL_BLOCK)
                .add(ModBlocks.STEEL_SLAB)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_STAIRS)
                ;
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(Blocks.BEDROCK)
                .addOptionalTag(
                  TagKey.of(
                             RegistryKeys.BLOCK,
                            Identifier.of("minecraft","needs_diamond")
                     )

               );

    }
}
