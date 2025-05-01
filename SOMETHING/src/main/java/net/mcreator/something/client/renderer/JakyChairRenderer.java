
package net.mcreator.something.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.something.entity.JakyChairEntity;
import net.mcreator.something.client.model.ModelJakyChair;

public class JakyChairRenderer extends MobRenderer<JakyChairEntity, ModelJakyChair<JakyChairEntity>> {
	public JakyChairRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJakyChair(context.bakeLayer(ModelJakyChair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JakyChairEntity entity) {
		return ResourceLocation.parse("something:textures/entities/jakychair.png");
	}
}
