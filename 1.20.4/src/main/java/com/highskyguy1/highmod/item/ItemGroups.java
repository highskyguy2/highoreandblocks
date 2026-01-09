package com.highskyguy1.highmod.item;


import com.highskyguy1.highmod.HighsOresAndBlocks;
import com.highskyguy1.highmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
//    public static final RegistryKey<ItemGroup> HOBM_CORE = RegistryKey.of(
//            Registries.ITEM_GROUP.getKey(),
//            new Identifier(HighsOresAndBlocks.MOD_ID, "hobm_core")
//    );
    public static final ItemGroup HOBM_CORE = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(HighsOresAndBlocks.MOD_ID, "hobm_core"),
        FabricItemGroup.builder()
                .displayName(Text.translatable("ig.highmod.hobm_core"))
                .icon(() -> new ItemStack(ModItems.RAW_RUBY) )
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);
                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    entries.add(ModBlocks.RUBY_ORE);
                    entries.add(ModItems.STAINLESS_STEEL);
                    entries.add(ModItems.PEAR);
                    entries.add(ModItems.GOLDEN_PEAR);
                    entries.add(ModItems.ENCHANTED_PEAR);

                    entries.add(ModItems.BANANA);
                    entries.add(ModItems.TITANIUM);
                    entries.add(ModItems.TITANIUM_AXE);
                    entries.add(ModItems.TITANIUM_HOE);
                    entries.add(ModItems.TITANIUM_SWORD);
                    entries.add(ModItems.TITANIUM_PICKAXE);
                    entries.add(ModItems.TITANIUM_SHOVEL);

                })
                .build());
    public static void registerItemGroups(){
        HighsOresAndBlocks.LOGGER.info("registering item groups for highmod");
    }
}