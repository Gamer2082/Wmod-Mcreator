
package fr.gamer_m.tungstenefirewolkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import fr.gamer_m.tungstenefirewolkmod.entity.FireskeletonbossfleauEntity;

public class FireskeletonbossfleauRenderer extends MobRenderer<FireskeletonbossfleauEntity, PiglinModel<FireskeletonbossfleauEntity>> {
	public FireskeletonbossfleauRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireskeletonbossfleauEntity entity) {
		return new ResourceLocation("tungstenefirewolkmod:textures/entities/wither-skeleton-original-texture-on-planetminecraft-com.png");
	}
}
