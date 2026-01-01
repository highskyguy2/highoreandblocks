package com.highskyguy1.highoreblocks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent STAINLESS_STEEL = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 1f)
            .build();
}
