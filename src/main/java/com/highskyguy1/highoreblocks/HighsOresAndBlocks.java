package com.highskyguy1.highoreblocks;

import com.highskyguy1.highoreblocks.blocks.ModBlocks;

import com.highskyguy1.highoreblocks.item.ItemGroups;
import com.highskyguy1.highoreblocks.item.ModItems;
import com.highskyguy1.highoreblocks.util.FrickingSheepDeathTool;
import com.highskyguy1.highoreblocks.util.ModVanillaLootTableModifier;
import com.highskyguy1.highoreblocks.worldgen.core.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
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


        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!world.isClient) {
                BlockState state = world.getBlockState(hitResult.getBlockPos());
                ItemStack stack = player.getStackInHand(hand);

                // Check if block is Crying Obsidian and player is holding Shears
                if (state.isOf(Blocks.CRYING_OBSIDIAN) && stack.isOf(Items.SHEARS)) {
                    // Change the block to regular Obsidian
                    world.setBlockState(hitResult.getBlockPos(), Blocks.OBSIDIAN.getDefaultState());

                    // Play a sound and damage the shears
                    world.playSound(null, hitResult.getBlockPos(), SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1f, 1f);
                    // Alternative simpler version
                    stack.damage(1, player, EquipmentSlot.MAINHAND);
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });
        AttackEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
            if (!world.isClient && entity instanceof  SheepEntity sheep){
                if (playerEntity.getStackInHand(hand).isOf(Items.END_ROD)){



                    DamageSource frickedSource = new DamageSource(
                            world.getRegistryManager()
                                    .getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE)
                                    .getOrThrow(FrickingSheepDeathTool.FRICKING_SHEEP),
                            playerEntity
                    );

                    sheep.setColor(DyeColor.RED);
                    sheep.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 600));
                    playerEntity.sendMessage(Text.translatable("misc.highmod.sheep_end_rod_fricker").formatted(Formatting.RED, Formatting.BOLD), false);
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 2500));

                    playerEntity.damage(frickedSource, 10f);

                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });

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