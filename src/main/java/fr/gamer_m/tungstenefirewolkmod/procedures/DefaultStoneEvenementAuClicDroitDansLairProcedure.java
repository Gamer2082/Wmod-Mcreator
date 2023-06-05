package fr.gamer_m.tungstenefirewolkmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class DefaultStoneEvenementAuClicDroitDansLairProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		if (entity instanceof Player _player)
			_player.getInventory().clearContent();
	}
}
