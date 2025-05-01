// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class famous<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "famous"), "main");
	private final ModelPart CHAIR;

	public famous(ModelPart root) {
		this.CHAIR = root.getChild("CHAIR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition CHAIR = partdefinition.addOrReplaceChild("CHAIR", CubeListBuilder.create().texOffs(0, 13).addBox(-6.0F, -17.0F, -6.0F, 2.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -9.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(8, 33).addBox(4.0F, -8.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(4.0F, -8.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 23).addBox(-6.0F, -8.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(-6.0F, -8.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		CHAIR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}