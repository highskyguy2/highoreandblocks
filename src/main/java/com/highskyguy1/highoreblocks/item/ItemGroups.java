package com.highskyguy1.highoreblocks.item;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup HOB_CORE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HighsOresAndBlocks.MOD_ID, "hob_core"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_RUBY))
                    .displayName(Text.translatable("ig.highmod.hob_core"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModItems.STAINLESS_STEEL);
                        entries.add(ModBlocks.STAINLESS_STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_BUTTON);
                        entries.add(ModBlocks.STEEL_SLAB);
                        entries.add(ModBlocks.STEEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.STEEL_STAIRS);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);

                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_SWORD);

                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.GOLDEN_PEAR);
                        entries.add(ModItems.ENCHANTED_PEAR);
                        entries.add(ModItems.BANANA);
                        entries.add(ModItems.BANANA_STEW);
                        entries.add(ModItems.PEAR_STEW);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_BOOTS);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                    })
                    .build());
    public static final ItemGroup HOB_PILLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HighsOresAndBlocks.MOD_ID, "hob_pills"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HASTE_PILL))
                    .displayName(Text.translatable("ig.highmod.hob_pills"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HASTE_PILL);
                        entries.add(ModItems.INSTANT_HEALTH_PILL);
                        entries.add(ModItems.NIGHT_VISION_PILL);
                        entries.add(ModItems.EMPTY_PILL);
                        entries.add(ModItems.FIRE_RESISTANT_PILL);
                        entries.add(ModItems.ADVANCED_HASTE_PILL);
                    })
                    .build());

    public static void registerIG(){
        HighsOresAndBlocks.LOGGER.info("registering ig for highob");
    }
}
