
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModItems;

public class AluminiumHoeItem extends HoeItem {
	public AluminiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TungstenefirewolkmodModItems.ALUMINIUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
	}
}
