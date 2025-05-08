
package net.mcreator.cinnamoroll.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cinnamoroll.entity.JamchairEntity;
import net.mcreator.cinnamoroll.client.model.Modelfamous;

public class JamchairRenderer extends MobRenderer<JamchairEntity, Modelfamous<JamchairEntity>> {
	public JamchairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfamous(context.bakeLayer(Modelfamous.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JamchairEntity entity) {
		return ResourceLocation.parse("cinnamoroll:textures/entities/jamchair.png");
	}
}
