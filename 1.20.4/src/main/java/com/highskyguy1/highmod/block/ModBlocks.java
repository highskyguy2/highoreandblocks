package com.highskyguy1.highmod.block;

import com.highskyguy1.highmod.HighsOresAndBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.create().requiresTool().strength(3f)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.create().requiresTool().strength(5f)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.create().requiresTool().strength(4f)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.create().requiresTool().strength(5f)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.create()));


    public static Block registerBlock(String string, Block block){
        registerBlockItem(string, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HighsOresAndBlocks.MOD_ID, string), block);
    }

    public static Item registerBlockItem(String string, Block block){

      return  Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, string),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks(){
        HighsOresAndBlocks.LOGGER.info("register block for highmod");
    }
}
