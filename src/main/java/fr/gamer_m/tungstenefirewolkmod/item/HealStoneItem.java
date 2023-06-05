
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;

public class HealStoneItem extends Item {
	public HealStoneItem() {
		super(new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD).stacksTo(1).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(20).saturationMod(30f).alwaysEat().meat().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
