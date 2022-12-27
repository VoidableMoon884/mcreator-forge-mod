
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgemod.block.RedLampBlock;
import net.mcreator.forgemod.ForgemodMod;

public class ForgemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgemodMod.MODID);
	public static final RegistryObject<Block> RED_LAMP = REGISTRY.register("red_lamp", () -> new RedLampBlock());
}
