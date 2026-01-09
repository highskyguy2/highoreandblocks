package com.highskyguy1.highmod.misc;

import com.highskyguy1.highmod.HighsOresAndBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class FrickingSheepDeathTool {
    public static final RegistryKey<DamageType> FRICKING_SHEEP =
            RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(HighsOresAndBlocks.MOD_ID, "fricking_sheep"));

    public static DamageSource of(World world, RegistryKey<DamageType> key, Entity attacker) {
        return new DamageSource(
                world.getRegistryManager()
                        .get(RegistryKeys.DAMAGE_TYPE)
                        .entryOf(key),
                attacker
        );
    }
}