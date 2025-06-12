
package net.mcreator.thehousetrap.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thehousetrap.entity.DexEntity;
import net.mcreator.thehousetrap.client.model.Modeldexter;

public class DexRenderer extends MobRenderer<DexEntity, Modeldexter<DexEntity>> {
	public DexRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldexter(context.bakeLayer(Modeldexter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DexEntity entity) {
		return ResourceLocation.parse("thehousetrap:textures/entities/dexter_texture.png");
	}
}
