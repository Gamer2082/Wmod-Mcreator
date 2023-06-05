
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModItems;

public class Tungstene_toolsAxeItem extends AxeItem {
	public Tungstene_toolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3072;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 84;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TungstenefirewolkmodModItems.TUNGSTENE.get()));
			}
		}, 1, -3f, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
	}
}
