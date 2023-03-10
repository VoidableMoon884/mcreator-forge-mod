
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.forgemod.item.FarmworldItem;
import net.mcreator.forgemod.ForgemodMod;

public class ForgemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgemodMod.MODID);
	public static final RegistryObject<Item> RED_LAMP = block(ForgemodModBlocks.RED_LAMP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> YELLOW_LAMP = block(ForgemodModBlocks.YELLOW_LAMP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GREEN_LAMP = block(ForgemodModBlocks.GREEN_LAMP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_LAMP = block(ForgemodModBlocks.BLUE_LAMP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FARMWORLD = REGISTRY.register("farmworld", () -> new FarmworldItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
