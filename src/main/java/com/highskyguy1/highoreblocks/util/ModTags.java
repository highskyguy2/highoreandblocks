package com.highskyguy1.highoreblocks.util;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

    }

    public static  TagKey<Block> createTag(String name){
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HighsOresAndBlocks.MOD_ID, name));
    }

    public static class Items{
        public static final TagKey<Item> TRANSFERABLE_ITEMS =  createTag("transferable_items");


                public static final TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, name));
                }
    }
}




