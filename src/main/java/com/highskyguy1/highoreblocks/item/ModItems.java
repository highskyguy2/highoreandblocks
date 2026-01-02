package com.highskyguy1.highoreblocks.item;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings().maxCount(64)));
    public static final Item MAGIC_POWDER = registerItem("magic_powder", new Item(new Item.Settings().maxCount(64).rarity(Rarity.EPIC)));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings().maxCount(64)));
    public static final Item STAINLESS_STEEL = registerItem("stainless_steel", new Item(new Item.Settings().food(ModFoodComponents.STAINLESS_STEEL)){


        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.highmod.stainless_steel"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(
                            SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 4, -1.2f
                            ))));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(
                            AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 6, -1f
                            ))));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 2.4f, -2.5f
                            ))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(
                            ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5f, -3.2f
                            ))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(
                          HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, 0, -3.2f
                            ))));
    private static Item registerItem(String name, Item item){
        return (Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, name), item));
    }

    public static void registerItems(){
        HighsOresAndBlocks.LOGGER.info("registering mod items for highbo");
    }
}
