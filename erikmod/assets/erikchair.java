// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class erikchair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "erikchair"), "main");
	private final ModelPart erikchair;

	public erikchair(ModelPart root) {
		this.erikchair = root.getChild("erikchair");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition erikchair = partdefinition.addOrReplaceChild("erikchair", CubeListBuilder.create().texOffs(30, 16).addBox(-8.0F, -8.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 26).addBox(-7.0F, -8.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 36).addBox(5.0F, -8.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 16).addBox(5.0F, -8.0F, 5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -11.0F, -6.0F, 15.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-8.0F, -22.0F, -6.0F, 2.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		erikchair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}