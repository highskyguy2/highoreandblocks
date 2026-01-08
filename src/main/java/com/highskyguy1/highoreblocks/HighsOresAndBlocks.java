package com.highskyguy1.highoreblocks;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;

import com.highskyguy1.highoreblocks.item.ItemGroups;
import com.highskyguy1.highoreblocks.item.ModItems;
import com.highskyguy1.highoreblocks.util.ModVanillaLootTableModifier;
import com.highskyguy1.highoreblocks.worldgen.core.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighsOresAndBlocks implements ModInitializer {
	public static final String MOD_ID = "highmod";



	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ItemGroups.registerIG();
        ModWorldGen.generateModWorldGen();
        ModVanillaLootTableModifier.modifyLootTables();
        FuelRegistry.INSTANCE.add(ModItems.MAGIC_POWDER, 10000);




        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
               new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModItems.STAINLESS_STEEL, 10), 10, 2, 0.04f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.STAINLESS_STEEL, 64),
                    new ItemStack(Items.EMERALD, 64), 10, 2, 0.04f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 35),
                    new ItemStack(ModItems.RAW_RUBY, 20), 10, 2, 0.04f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.RAW_RUBY, 50),
                    new ItemStack(Items.EMERALD, 64), 10, 2, 0.04f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 64),
                    new ItemStack(ModItems.RUBY, 20), 10, 2, 0.04f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.RUBY, 10),
                    new ItemStack(Items.EMERALD, 64), 10, 2, 0.04f
            ));

        });
        TradeOfferHelper.registerWanderingTraderOffers(3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModBlocks.RUBY_ORE, 24),
                    new ItemStack(ModItems.RUBY, 10), 10, 2, 0.04f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.STAINLESS_STEEL, 64),
                    new ItemStack(Items.NETHERITE_BLOCK, 1), 10, 2, 0.04f
            ));

        });
	}
}