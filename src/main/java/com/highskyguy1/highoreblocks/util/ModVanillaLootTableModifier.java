package com.highskyguy1.highoreblocks.util;

import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Set;

public class ModVanillaLootTableModifier {
    public static final Identifier ZOMBIE_ID = Identifier.of("minecraft", "entities/zombie");

    public static void modifyLootTables(){

            LootTableEvents.MODIFY.register(((registryKey, builder, lootTableSource, wrapperLookup) -> {
                if (ZOMBIE_ID.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.65f))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());
                    builder.pool(LootPool.builder().build());
                }
                if (ZOMBIE_ID.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.75f))
                            .with(ItemEntry.builder(ModItems.RAW_RUBY))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 15f)).build());
                    builder.pool(LootPool.builder().build());
                }
                if (LootTables.DESERT_PYRAMID_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.95f))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 10f)).build());
                    builder.pool(LootPool.builder().build());
                }
                if (LootTables.DESERT_PYRAMID_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.65f))
                            .with(ItemEntry.builder(ModItems.RUBY))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 10f)).build());
                    builder.pool(LootPool.builder().build());
                }
                if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.32f))
                            .with(ItemEntry.builder(Items.MACE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    builder.pool(LootPool.builder().build());
                }
                if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.32f))
                            .with(ItemEntry.builder(Items.MACE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    builder.pool(LootPool.builder().build());
                }
            }));



    }
}
