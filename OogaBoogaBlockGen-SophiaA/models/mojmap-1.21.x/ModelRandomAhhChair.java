// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRandomAhhChair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "randomahhchair"), "main");
	private final ModelPart Legs;
	private final ModelPart Pillow;
	private final ModelPart Main;

	public ModelRandomAhhChair(ModelPart root) {
		this.Legs = root.getChild("Legs");
		this.Pillow = root.getChild("Pillow");
		this.Main = root.getChild("Main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(8, 30)
						.addBox(-4.5F, -7.0F, -4.0F, 1.5F, 7.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(1.5F, -7.0F, -4.0F, 1.5F, 7.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.5F, -7.0F, 3.0F, 1.5F, 7.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(18, 28)
						.addBox(1.5F, -7.0F, 3.0F, 1.5F, 7.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Pillow = partdefinition.addOrReplaceChild("Pillow",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.5F, -7.5F, -4.0F, 8.0F, 0.5F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-4.5F, -7.6F, -3.5F, 7.5F, 0.3F, 8.0F, new CubeDeformation(0.0F)).texOffs(6, 16)
						.addBox(-0.5F, -7.7F, -0.5F, 1.5F, 0.4F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Main = partdefinition.addOrReplaceChild("Main",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-4.5F, -14.5F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(5, 23)
						.addBox(-4.5F, -15.0F, -4.0F, 1.0F, 2.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 23)
						.addBox(-4.5F, -15.0F, 1.0F, 1.0F, 2.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 4)
						.addBox(-4.5F, -15.5F, -3.0F, 1.0F, 1.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(32, 8)
						.addBox(-4.5F, -15.5F, 2.5F, 1.0F, 1.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-4.5F, -16.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 18)
						.addBox(-4.5F, -16.5F, -0.1F, 1.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-4.5F, -16.5F, 0.9F, 1.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(15, 10)
						.addBox(-4.5F, -9.5F, -4.0F, 1.0F, 2.5F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-4.5F, -13.5F, -4.0F, 1.0F, 6.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -13.5F, 3.0F, 1.0F, 6.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-4.5F, -13.5F, 0.0F, 1.0F, 1.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-4.5F, -13.4F, -4.0F, 1.0F, 1.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(-4.5F, -17.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 22)
						.addBox(-4.5F, -12.5F, 2.0F, 1.0F, 1.5F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-4.5F, -12.5F, -4.0F, 1.0F, 1.5F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-9.9F, -3.5F, -4.0F, 2.8F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-9.9F, -3.5F, 4.0F, 2.8F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = Main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(11, 22)
						.addBox(-8.1F, -10.5F, 4.0F, 8.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 24)
						.addBox(-8.1F, -10.5F, -4.0F, 8.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pillow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}