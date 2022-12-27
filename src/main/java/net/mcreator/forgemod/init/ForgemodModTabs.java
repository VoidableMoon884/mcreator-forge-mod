
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgemod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ForgemodModTabs {
	public static CreativeModeTab TAB_FORGEMOD;

	public static void load() {
		TAB_FORGEMOD = new CreativeModeTab("tabforgemod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AIR);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
