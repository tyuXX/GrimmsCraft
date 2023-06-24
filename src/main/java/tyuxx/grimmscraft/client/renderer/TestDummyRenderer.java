
package tyuxx.grimmscraft.client.renderer;

import tyuxx.grimmscraft.entity.TestDummyEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class TestDummyRenderer extends HumanoidMobRenderer<TestDummyEntity, HumanoidModel<TestDummyEntity>> {
	public TestDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<TestDummyEntity, HumanoidModel<TestDummyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("grimmscraft:textures/entities/sovietflag.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TestDummyEntity entity) {
		return new ResourceLocation("grimmscraft:textures/entities/sovietflag.png");
	}
}
