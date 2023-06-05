
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;

public class CoinItem extends Item {
	public CoinItem() {
		super(new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD).stacksTo(64).rarity(Rarity.RARE));
	}
}
