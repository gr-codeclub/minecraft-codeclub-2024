
package net.mcreator.wingsoffire.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wingsoffire.entity.SCOTTTHESCOOTEREntity;
import net.mcreator.wingsoffire.client.model.Modelscott;

public class SCOTTTHESCOOTERRenderer extends MobRenderer<SCOTTTHESCOOTEREntity, Modelscott<SCOTTTHESCOOTEREntity>> {
	public SCOTTTHESCOOTERRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscott(context.bakeLayer(Modelscott.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SCOTTTHESCOOTEREntity entity) {
		return ResourceLocation.parse("wingsoffire:textures/entities/scott_texture.png");
	}
}
