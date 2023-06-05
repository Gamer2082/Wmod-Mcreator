
package fr.gamer_m.tungstenefirewolkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import fr.gamer_m.tungstenefirewolkmod.entity.FRIENDEntity;

public class FRIENDRenderer extends HumanoidMobRenderer<FRIENDEntity, HumanoidModel<FRIENDEntity>> {
	public FRIENDRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(FRIENDEntity entity) {
		return new ResourceLocation("tungstenefirewolkmod:textures/entities/enderfox885_1.png");
	}
}
