package com.highskyguy1.highmod.food;


import com.highskyguy1.highmod.util.ModRegistras;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModFoodComponents  {
    public static FoodComponent STAINLESS_STEEL = new FoodComponent.Builder()
            .saturationModifier(1.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 1), 1f)
            .build();
    public static final FoodComponent PEAR = new FoodComponent.Builder()

            .saturationModifier(1.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent GOLDEN_PEAR = new FoodComponent.Builder()

            .saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1500), 2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1500), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent ENCHANTED_PEAR = new FoodComponent.Builder()

            .saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1500), 2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1500), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent BANANA = new FoodComponent.Builder()

            .saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1500), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent BANANA_STEW = ModRegistras.createStewWithSaturation(2.3f, 1000, 1f);
    public static final FoodComponent PEAR_STEW = ModRegistras.createStew(2.5f);

}
