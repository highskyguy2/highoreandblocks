package com.highskyguy1.highoreblocks.item;

import com.highskyguy1.highoreblocks.HighsOresAndBlocks;
import com.highskyguy1.highoreblocks.util.ModRegistras;
import net.minecraft.component.type.FoodComponent;
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
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(
                            SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 5, -1.2F)
                    )));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(
                            ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 0, -3.2F)
                    )));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 1, -3F)
                    )));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(
                            AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 5, -1.2F)
                    )));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(
                            HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, 0, -5F)
                    )));
    public static final Item BANANA = registerItem("banana",
            new PickaxeItem(ModToolMaterials.BANANA, new Item.Settings()
                    .food(ModFoodComponents.BANANA)
                    .fireproof()
                    .rarity(Rarity.EPIC)
                    .maxCount(64)
                    .attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterials.BANANA, 35, 0.8F)
                    )){
                @Override
                public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> list, TooltipType tooltipType) {
                    super.appendTooltip(itemStack, tooltipContext, list, tooltipType);
                    list.add(Text.translatable("tooltip.highmod.banana"));
                }
            });
    public static final Item PEAR = registerItem("pear",
            new Item(new Item.Settings().food(ModFoodComponents.PEAR).rarity(Rarity.UNCOMMON)));
    public static final Item GOLDEN_PEAR = registerItem("golden_pear",
            new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_PEAR).rarity(Rarity.RARE)));
    public static final Item ENCHANTED_PEAR = registerItem("enchanted_pear",
            new Item(new Item.Settings().food(ModFoodComponents.ENCHANTED_PEAR).rarity(Rarity.EPIC)));
    public static final Item PEAR_STEW = registerItem("pear_stew",
            new Item(new Item.Settings().food(ModFoodComponents.PEAR_STEW).maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item BANANA_STEW = registerItem("banana_stew",
            new Item(new Item.Settings().food(ModFoodComponents.BANANA_STEW).maxCount(1).rarity(Rarity.RARE)));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new Item.Settings()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmourMaterials.TITANIUM_ARMOR_MATERIAL , ArmorItem.Type.HELMET ,new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(370))));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmourMaterials.TITANIUM_ARMOR_MATERIAL , ArmorItem.Type.CHESTPLATE ,new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(370))));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmourMaterials.TITANIUM_ARMOR_MATERIAL , ArmorItem.Type.LEGGINGS ,new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(370))));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmourMaterials.TITANIUM_ARMOR_MATERIAL , ArmorItem.Type.BOOTS ,new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(370))));

                                        // PILLS //
    public static final Item HASTE_PILL = ModRegistras.registerPills("haste_pill",
                                                PillComponents.HASTE_PILL);
    public static final Item ADVANCED_HASTE_PILL = ModRegistras.registerPills("advanced_haste_pill",
            PillComponents.ADVANCED_HASTE_PILL);

    public static final Item NIGHT_VISION_PILL = ModRegistras.registerPills("night_vision_pill",
            PillComponents.NIGHT_VISION_PILL);

    public static final Item INSTANT_HEALTH_PILL = ModRegistras.registerPills("instant_health_pill",
            PillComponents.INSTANT_HEALTH_PILL);

    public static final Item EMPTY_PILL = ModRegistras.registerPills("empty_pill",
            PillComponents.EMPTY_PILL);

    public static final Item FIRE_RESISTANT_PILL = ModRegistras.registerPills("fire_resistant_pill",
            PillComponents.FIRE_RESISTANT_PILL);




    // DO NOT WRITE ANYTHING BELOW THIS COMMENT //



    public static Item registerItem(String name, Item item){

        return (Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, name), item));

    }


    public static void registerItems(){
        HighsOresAndBlocks.LOGGER.info("registering mod items for highbo");
    }
}
