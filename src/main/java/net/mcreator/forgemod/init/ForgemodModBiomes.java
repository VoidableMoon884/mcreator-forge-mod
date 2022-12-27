
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.forgemod.world.biome.FarmworldbiomeBiome;
import net.mcreator.forgemod.ForgemodMod;

public class ForgemodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ForgemodMod.MODID);
	public static final RegistryObject<Biome> FARMWORLDBIOME = REGISTRY.register("farmworldbiome", FarmworldbiomeBiome::createBiome);
}
