package com.highskyguy1.highoreblocks.blocks;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

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
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
            AbstractBlock.Settings.create()
                    .strength(4.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create()
                            .strength(25f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(30f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)));
    public static final Block STAINLESS_STEEL_BLOCK = registerBlock("steel_block",

             new Block(   AbstractBlock.Settings.create()
                    .strength(6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new StairsBlock(ModBlocks.STAINLESS_STEEL_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().requiresTool().strength(3.25f)));
    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().requiresTool().strength(3.25f)));
    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(3f).requiresTool().noCollision()));
    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create().requiresTool().strength(3.25f)));

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
