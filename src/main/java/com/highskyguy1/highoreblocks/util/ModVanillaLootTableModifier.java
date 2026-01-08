package com.highskyguy1.highoreblocks.util;

import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;



public class ModVanillaLootTableModifier {
    public static final Identifier ZOMBIE_ID = Identifier.of("minecraft", "entities/zombie");
    public static final Identifier IRON_ORE_ID = Identifier.of("minecraft", "block/iron_ore");
    public static final Identifier CREEPER_ID = Identifier.of("minecraft", "entities/creeper");

    public static void modifyLootTables(){

            LootTableEvents.MODIFY.register(((registryKey, builder, lootTableSource, registry) -> {
                if (ZOMBIE_ID.equals(registryKey.getValue())){
                    builder.pool(
                    LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.65f))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build())

                    );
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1f))
                                    .conditionally(RandomChanceLootCondition.builder(0.75f))
                                    .with(ItemEntry.builder(ModItems.RAW_RUBY))
                                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 15f)).build())
                    );

                }
                if (CREEPER_ID.equals(registryKey.getValue())){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.55f))
                            .with(ItemEntry.builder(ModItems.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (IRON_ORE_ID.equals(registryKey.getValue())){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.75f))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.SHIPWRECK_MAP_CHEST.equals(registryKey)){
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1))
                                    .conditionally(RandomChanceLootCondition.builder(1.0f))
                                    .with(ItemEntry.builder(ModItems.PEAR_STEW))
                                    .apply(SetCountLootFunction.builder(
                                            UniformLootNumberProvider.create(1, 2)))
                                    .build()
                    );
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1))
                                    .conditionally(RandomChanceLootCondition.builder(0.95f))
                                    .with(ItemEntry.builder(ModItems.BANANA_STEW))
                                    .apply(SetCountLootFunction.builder(
                                            UniformLootNumberProvider.create(1, 3)))
                                    .build()
                    );
                }
                if (LootTables.DESERT_PYRAMID_CHEST.equals(registryKey)) {
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1))
                                    .conditionally(RandomChanceLootCondition.builder(1.0f))
                                    .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                                    .apply(SetCountLootFunction.builder(
                                            UniformLootNumberProvider.create(1, 4)))
                                    .build()
                    );
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1))
                                    .conditionally(RandomChanceLootCondition.builder(0.54f))
                                    .with(ItemEntry.builder(ModItems.EMPTY_PILL))
                                    .apply(SetCountLootFunction.builder(
                                            UniformLootNumberProvider.create(1, 4)))
                                    .build()
                    );
                    builder.pool(
                            LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1))
                                    .conditionally(RandomChanceLootCondition.builder(0.55f))
                                    .with(ItemEntry.builder(ModItems.GOLDEN_PEAR))
                                    .apply(SetCountLootFunction.builder(
                                            UniformLootNumberProvider.create(1, 5)))
                                    .build()
                    );
                }
                if (LootTables.VILLAGE_PLAINS_CHEST.equals(registryKey)){

                    builder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder( 1))
                            .with(ItemEntry.builder(ModItems.PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f))
                            .build()));
                }
                if (LootTables.VILLAGE_PLAINS_CHEST.equals(registryKey)){

                    builder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder( 0.65f))
                            .with(ItemEntry.builder(ModItems.EMPTY_PILL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f))
                                    .build()));
                }
                if (LootTables.JUNGLE_TEMPLE_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.55f))
                            .with(ItemEntry.builder(ModItems.ENCHANTED_PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.VILLAGE_BUTCHER_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(1))
                            .with(ItemEntry.builder(ModItems.MAGIC_POWDER))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 64)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.SPAWN_BONUS_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.00001325f))
                            .with(ItemEntry.builder(ModItems.ENCHANTED_PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(6f, 64f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.SPAWN_BONUS_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(1))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.RUINED_PORTAL_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.65f))
                            .with(ItemEntry.builder(ModItems.GOLDEN_PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 7f)).build());
                    builder.pool(poolBuilder.build());
                }
                //
                if (LootTables.RUINED_PORTAL_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.35f))
                            .with(ItemEntry.builder(ModItems.ENCHANTED_PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 7f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.RUINED_PORTAL_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.85f))
                            .with(ItemEntry.builder(ModItems.PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.RUINED_PORTAL_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.35f))
                            .with(ItemEntry.builder(ModItems.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)).build());
                    builder.pool(poolBuilder.build());
                }
                if (LootTables.VILLAGE_TEMPLE_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.78f))
                            .with(ItemEntry.builder(ModItems.PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());
                    builder.pool(poolBuilder.build());
                }

                if (LootTables.DESERT_PYRAMID_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.65f))
                            .with(ItemEntry.builder(ModItems.RUBY))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 30f)).build());
                    builder.pool(poolBuilder.build());
                }

                if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.22f))
                            .with(ItemEntry.builder(ModItems.ENCHANTED_PEAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    builder.pool(poolBuilder.build());

                }
                if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.32f))
                            .with(ItemEntry.builder(ModItems.MAGIC_POWDER))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 25f)).build());
                    builder.pool(poolBuilder.build());

                }
                if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1f))
                            .conditionally(RandomChanceLootCondition.builder(0.32f))
                            .with(ItemEntry.builder(ModItems.STAINLESS_STEEL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 25f)).build());
                    builder.pool(poolBuilder.build());

                }

            }));




    }
}
