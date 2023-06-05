
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TungstenefirewolkmodModTabs {
	public static CreativeModeTab TAB_TUNGSTENEMOD;
	public static CreativeModeTab TAB_TUNGSTENEDECO;

	public static void load() {
		TAB_TUNGSTENEMOD = new CreativeModeTab("tabtungstenemod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TungstenefirewolkmodModBlocks.TUNGSTENEBLOXC.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TUNGSTENEDECO = new CreativeModeTab("tabtungstenedeco") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CHISELED_QUARTZ_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
