
package net.mcreator.wingsoffire.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wingsoffire.entity.AnikaChairEntity;
import net.mcreator.wingsoffire.client.model.Modelanikamodel;

public class AnikaChairRenderer extends MobRenderer<AnikaChairEntity, Modelanikamodel<AnikaChairEntity>> {
	public AnikaChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanikamodel(context.bakeLayer(Modelanikamodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnikaChairEntity entity) {
		return ResourceLocation.parse("wingsoffire:textures/entities/chairtex.png");
	}
}
