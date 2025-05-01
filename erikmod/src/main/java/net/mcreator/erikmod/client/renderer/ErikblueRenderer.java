
package net.mcreator.erikmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.erikmod.entity.ErikblueEntity;
import net.mcreator.erikmod.client.model.Modelerikchair;

public class ErikblueRenderer extends MobRenderer<ErikblueEntity, Modelerikchair<ErikblueEntity>> {
	public ErikblueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelerikchair(context.bakeLayer(Modelerikchair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ErikblueEntity entity) {
		return ResourceLocation.parse("erikmod:textures/entities/erikchair.png");
	}
}
