
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModItems;

public class Vanadium_ToolsHoeItem extends HoeItem {
	public Vanadium_ToolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TungstenefirewolkmodModItems.VANADIUM.get()));
			}
		}, 0, -3f, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
	}
}
