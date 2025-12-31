package com.highskyguy1.highoreblocks;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;
import com.highskyguy1.highoreblocks.item.ItemGroups;
import com.highskyguy1.highoreblocks.item.ModItems;
import net.fabricmc.api.ModInitializer;

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
	}
}