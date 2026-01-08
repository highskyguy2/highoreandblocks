package com.highskyguy1.highoreblocks.datagen;

import com.highskyguy1.highoreblocks.item.ModItems;
import com.highskyguy1.highoreblocks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS);
        getOrCreateTagBuilder(ModTags.Items.HASTE_PILL_ACCEPTABLE_PICKAXES)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(Items.STONE_PICKAXE)
                .add(Items.IRON_PICKAXE)
                .add(Items.DIAMOND_PICKAXE)
                .add(Items.NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ModTags.Items.INSTANT_HEALTH_ACCEPTABLE_ITEMS)
                .add(Items.ENCHANTED_GOLDEN_APPLE)
                .add(Items.GOLDEN_APPLE)
                .add(ModItems.GOLDEN_PEAR)
                .add(ModItems.ENCHANTED_PEAR)
                .add(Items.GOLDEN_CARROT);
        getOrCreateTagBuilder(ModTags.Items.FIRE_RESISTANT_PILL_ACCEPTABLE_ITEMS)
                .add(Items.LAVA_BUCKET)
                .add(Items.MAGMA_BLOCK)
                .add(Items.MAGMA_CREAM)
                .add(Items.BLAZE_POWDER)
                .add(Items.BLAZE_ROD)
                .add(Items.FIRE_CHARGE);
    }
}
