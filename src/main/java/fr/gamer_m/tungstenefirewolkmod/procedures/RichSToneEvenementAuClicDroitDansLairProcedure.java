package fr.gamer_m.tungstenefirewolkmod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModItems;

public class RichSToneEvenementAuClicDroitDansLairProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _isc = itemstack;
			final ItemStack _setstack = new ItemStack(TungstenefirewolkmodModItems.COIN.get());
			final int _sltid = 9;
			_setstack.setCount(15);
			_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable) {
					((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
