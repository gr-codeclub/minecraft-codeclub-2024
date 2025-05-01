
package net.mcreator.oogaboogablockgen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.oogaboogablockgen.entity.ChairEntity;
import net.mcreator.oogaboogablockgen.client.model.ModelRandomAhhChair;

public class ChairRenderer extends MobRenderer<ChairEntity, ModelRandomAhhChair<ChairEntity>> {
	public ChairRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRandomAhhChair(context.bakeLayer(ModelRandomAhhChair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChairEntity entity) {
		return ResourceLocation.parse("oogaboogablockgen:textures/entities/asset-chair-2.png");
	}
}
