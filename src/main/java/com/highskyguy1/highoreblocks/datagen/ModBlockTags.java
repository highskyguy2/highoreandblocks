package com.highskyguy1.highoreblocks.datagen;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final TagKey<Block> NEEDS_NETHERITE_TOOL = of("needs_netherite_tool");

    private static TagKey<Block> of(String string) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(string));
    }
}
