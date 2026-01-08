package com.highskyguy1.highoreblocks.item;

import com.highskyguy1.highoreblocks.util.ModRegistras;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;


public class PillComponents {



                        /* DONT FORGET TO PUT .build() AT THE END */
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FoodComponent HASTE_PILL = ModRegistras.pillBuilder(3, StatusEffects.HASTE, 12000,1f).build();
    public static final FoodComponent ADVANCED_HASTE_PILL = ModRegistras.pillBuilder(3, StatusEffects.HASTE, 24000,99f).build();
    public static final FoodComponent INSTANT_HEALTH_PILL = ModRegistras.pillBuilder(10, StatusEffects.INSTANT_HEALTH, 100, 2f).build();
    public static final FoodComponent NIGHT_VISION_PILL = ModRegistras.pillBuilder(6, StatusEffects.NIGHT_VISION, 12000, 3f).build();
    public static final FoodComponent EMPTY_PILL = ModRegistras.pillBuilder(6, StatusEffects.POISON, 100, 1).build();
    public static final FoodComponent FIRE_RESISTANT_PILL = ModRegistras.pillBuilder(6, StatusEffects.FIRE_RESISTANCE, 12000, 1).build();


}
