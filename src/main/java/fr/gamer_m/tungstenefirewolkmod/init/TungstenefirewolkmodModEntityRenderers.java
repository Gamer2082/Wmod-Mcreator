
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import fr.gamer_m.tungstenefirewolkmod.client.renderer.FireskeletonbossfleauRenderer;
import fr.gamer_m.tungstenefirewolkmod.client.renderer.FRIENDRenderer;
import fr.gamer_m.tungstenefirewolkmod.client.renderer.AutherRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TungstenefirewolkmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TungstenefirewolkmodModEntities.FIRESKELETONBOSSFLEAU.get(), FireskeletonbossfleauRenderer::new);
		event.registerEntityRenderer(TungstenefirewolkmodModEntities.AUTHER.get(), AutherRenderer::new);
		event.registerEntityRenderer(TungstenefirewolkmodModEntities.FRIEND.get(), FRIENDRenderer::new);
	}
}
