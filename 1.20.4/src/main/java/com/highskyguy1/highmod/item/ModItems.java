package com.highskyguy1.highmod.item;

import com.highskyguy1.highmod.HighsOresAndBlocks;
import com.highskyguy1.highmod.armor.SteelArmorMaterial;
import com.highskyguy1.highmod.armor.TitaniumArmorMaterial;
import com.highskyguy1.highmod.food.ModFoodComponents;
import com.highskyguy1.highmod.tools.ModToolMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModItems {
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new Item.Settings()));

    public static final Item STAINLESS_STEEL = registerItem("stainless_steel",
            new Item(new Item.Settings().food(ModFoodComponents.STAINLESS_STEEL)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    super.appendTooltip(stack, world, tooltip, context);
                    tooltip.add(Text.translatable("tooltip.highmod.stainless_steel"));
                }
            });
    public static final Item PEAR = registerItem("pear",
            new Item(new Item.Settings().food(ModFoodComponents.PEAR).rarity(Rarity.UNCOMMON)));
    public static final Item GOLDEN_PEAR =registerItem("golden_pear",
            new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_PEAR).rarity(Rarity.RARE)));
    public static final Item ENCHANTED_PEAR = registerItem("enchanted_pear",
            new Item(new Item.Settings().food(ModFoodComponents.ENCHANTED_PEAR).rarity(Rarity.EPIC)));

    public  static final Item BANANA = registerItem("banana",
            new PickaxeItem(ModToolMaterials.BANANA, 35, 0.8f, new Item.Settings().rarity(Rarity.EPIC).food(ModFoodComponents.BANANA)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    super.appendTooltip(stack, world, tooltip, context);
                    tooltip.add(Text.translatable("tooltip.highmod.banana"));
                }
            });

    public static final Item TITANIUM = registerItem("titanium",
            new Item(new Item.Settings()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, 1, 0.3f, new Item.Settings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM, 0, 0.5f, new Item.Settings()));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 1, 0.6f, new Item.Settings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM, 20, 1, new Item.Settings()));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, 15, 2, new Item.Settings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(new SteelArmorMaterial(), ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(new SteelArmorMaterial(), ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(new SteelArmorMaterial(), ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(new SteelArmorMaterial(), ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, 1, 0.3f, new Item.Settings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, 0, 0.5f, new Item.Settings()));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, 1, 0.6f, new Item.Settings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, 15, 1, new Item.Settings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, 15, 2, new Item.Settings()));


    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.BOOTS, new Item.Settings()));

    public static Item registerItem(String string, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HighsOresAndBlocks.MOD_ID, string), item);
    }

    public static void registerItems(){
        HighsOresAndBlocks.LOGGER.info("registering mod items");
    }
}
