
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import fr.gamer_m.tungstenefirewolkmod.procedures.PowerstoneEvenementAuClicDroitDansLairProcedure;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;

public class PowerstoneItem extends Item {
	public PowerstoneItem() {
		super(new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PowerstoneEvenementAuClicDroitDansLairProcedure.execute(entity);
		return retval;
	}
}
