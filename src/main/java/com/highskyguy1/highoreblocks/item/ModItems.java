package com.highskyguy1.highoreblocks.item;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings().maxCount(64)));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings().maxCount(64)));

    private static Item registerItem(String name, Item item){
        return (Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, name), item));
    }

    public static void registerItems(){
        HighsOresAndBlocks.LOGGER.info("registering mod items for highbo");
    }
}
