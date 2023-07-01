package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.StatsGuiMenu;
import tyuxx.grimmscraft.procedures.StatpGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PlayerModelTransformerProcedure;
import tyuxx.grimmscraft.procedures.PermStrenghtGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PermResistGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PermRegenGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PermHealtGUIVAlueProcedure;
import tyuxx.grimmscraft.procedures.LevelGuiValueProcedure;
import tyuxx.grimmscraft.procedures.LXpGuiValueProcedure;
import tyuxx.grimmscraft.network.StatsGuiButtonMessage;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StatsGuiScreen extends AbstractContainerScreen<StatsGuiMenu> {
	private final static HashMap<String, Object> guistate = StatsGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_upgrade_regen;
	Button button_upgrade_resistance;
	Button button_upgrade_strength;
	Button button_upgradehealt;

	public StatsGuiScreen(StatsGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 303;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("grimmscraft:textures/screens/stats_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (PlayerModelTransformerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 90, this.topPos + 161, 20, 0f + (float) Math.atan((this.leftPos + 90 - mouseX) / 40.0), (float) Math.atan((this.topPos + 111 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				PermRegenGuiValueProcedure.execute(entity), 70, 14, -12829636);
		this.font.draw(poseStack,

				LevelGuiValueProcedure.execute(entity), 160, 149, -12829636);
		this.font.draw(poseStack,

				StatpGuiValueProcedure.execute(entity), 160, 140, -12829636);
		this.font.draw(poseStack,

				PermResistGuiValueProcedure.execute(entity), 70, 50, -12829636);
		this.font.draw(poseStack,

				PermStrenghtGuiValueProcedure.execute(entity), 70, 86, -12829636);
		this.font.draw(poseStack,

				LXpGuiValueProcedure.execute(entity), 160, 158, -12829636);
		this.font.draw(poseStack,

				PermHealtGUIVAlueProcedure.execute(entity), 169, 14, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_upgrade_regen = Button.builder(Component.translatable("gui.grimmscraft.stats_gui.button_upgrade_regen"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(0, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 23, 93, 20).build();
		guistate.put("button:button_upgrade_regen", button_upgrade_regen);
		this.addRenderableWidget(button_upgrade_regen);
		button_upgrade_resistance = Button.builder(Component.translatable("gui.grimmscraft.stats_gui.button_upgrade_resistance"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(1, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 59, 119, 20).build();
		guistate.put("button:button_upgrade_resistance", button_upgrade_resistance);
		this.addRenderableWidget(button_upgrade_resistance);
		button_upgrade_strength = Button.builder(Component.translatable("gui.grimmscraft.stats_gui.button_upgrade_strength"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(2, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 95, 108, 20).build();
		guistate.put("button:button_upgrade_strength", button_upgrade_strength);
		this.addRenderableWidget(button_upgrade_strength);
		button_upgradehealt = Button.builder(Component.translatable("gui.grimmscraft.stats_gui.button_upgradehealt"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(3, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 169, this.topPos + 23, 88, 20).build();
		guistate.put("button:button_upgradehealt", button_upgradehealt);
		this.addRenderableWidget(button_upgradehealt);
	}
}
