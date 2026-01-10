package com.highskyguy1.highmod.datagen;


import com.highskyguy1.highmod.block.ModBlocks;
import com.highskyguy1.highmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvProvider extends FabricAdvancementProvider {
    public ModAdvProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        Advancement.Builder.create()
                .display(
                        ModItems.RUBY,
                        Text.translatable("adv.highmod.get_ruby.title"),
                        Text.translatable("adv.highmod.get_ruby.des"),
                        new Identifier("minecraft", "textures/block.stone.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("has_ruby", InventoryChangedCriterion.Conditions.items(ModItems.RUBY))
                .build(consumer, "highmod:get_ruby")
        ;
        Advancement.Builder.create()
                .display(
                        ModItems.TITANIUM_CHESTPLATE,
                        Text.translatable("adv.highmod.get_t_armor.title"),
                        Text.translatable("adv.highmod.get_t_armor.des"),
                        new Identifier("minecraft", "textures/block.stone.png"),
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("get_t_armor", InventoryChangedCriterion.Conditions.items(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS))
                .build(consumer, "highmod:get_t_armor")
        ;
        Advancement.Builder.create()
                .display(
                        ModBlocks.TITANIUM_BLOCK,
                        Text.translatable("adv.highmod.get_t_block.title"),
                        Text.translatable("adv.highmod.get_t_block.des"),
                        new Identifier("minecraft", "textures/block.stone.png"),
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("has_t_block", InventoryChangedCriterion.Conditions.items(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS))
                .build(consumer, "highmod:has_t_block")
        ;
    }

}
