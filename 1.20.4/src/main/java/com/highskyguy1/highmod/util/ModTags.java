package com.highskyguy1.highmod.util;

import com.highskyguy1.highmod.HighsOresAndBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(HighsOresAndBlocks.MOD_ID, name));
        }

    }
    public static class Items{

        public static final TagKey<Item> STAINLESS_STEEL_ACCEPTABLE_SWORD = createItemTag("steel_acceptable_sword");

        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(HighsOresAndBlocks.MOD_ID, name));
        }

    }
}
