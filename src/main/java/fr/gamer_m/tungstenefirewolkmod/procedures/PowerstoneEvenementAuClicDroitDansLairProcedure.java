package fr.gamer_m.tungstenefirewolkmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PowerstoneEvenementAuClicDroitDansLairProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.WITHER, 10);
	}
}
