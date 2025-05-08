
package net.mcreator.thehousetrap.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thehousetrap.entity.CiraeChairEntity;
import net.mcreator.thehousetrap.client.model.Modeldexchair;

public class CiraeChairRenderer extends MobRenderer<CiraeChairEntity, Modeldexchair<CiraeChairEntity>> {
	public CiraeChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldexchair(context.bakeLayer(Modeldexchair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CiraeChairEntity entity) {
		return ResourceLocation.parse("thehousetrap:textures/entities/ciraechair.png");
	}
}
