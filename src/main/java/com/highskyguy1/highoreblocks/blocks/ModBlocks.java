package com.highskyguy1.highoreblocks.blocks;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HighsOresAndBlocks.MOD_ID, name), block);
    }

    public static void registerBlocks(){
        HighsOresAndBlocks.LOGGER.info("registering blocks for highob");
    }
}
