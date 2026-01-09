package com.highskyguy1.highmod.datagen;


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
    }
}
