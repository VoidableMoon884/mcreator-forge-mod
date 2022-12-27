
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgemod.block.YellowLampBlock;
import net.mcreator.forgemod.block.RedLampBlock;
import net.mcreator.forgemod.block.GreenLampBlock;
import net.mcreator.forgemod.block.BlueLampBlock;
import net.mcreator.forgemod.ForgemodMod;

public class ForgemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgemodMod.MODID);
	public static final RegistryObject<Block> RED_LAMP = REGISTRY.register("red_lamp", () -> new RedLampBlock());
	public static final RegistryObject<Block> YELLOW_LAMP = REGISTRY.register("yellow_lamp", () -> new YellowLampBlock());
	public static final RegistryObject<Block> GREEN_LAMP = REGISTRY.register("green_lamp", () -> new GreenLampBlock());
	public static final RegistryObject<Block> BLUE_LAMP = REGISTRY.register("blue_lamp", () -> new BlueLampBlock());
}
