
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import fr.gamer_m.tungstenefirewolkmod.procedures.DefaultStoneEvenementAuClicDroitDansLairProcedure;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;

public class DefaultStoneItem extends Item {
	public DefaultStoneItem() {
		super(new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DefaultStoneEvenementAuClicDroitDansLairProcedure.execute(entity);
		return ar;
	}
}
