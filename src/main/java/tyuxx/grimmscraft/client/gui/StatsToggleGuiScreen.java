package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.StatsToggleGuiMenu;
import tyuxx.grimmscraft.procedures.TogglePermHealtGUIValueProcedure;
import tyuxx.grimmscraft.procedures.PermStrenghtToggleGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PermResistToggleGuiValueProcedure;
import tyuxx.grimmscraft.procedures.PermRegenToggleGuiValueProcedure;
import tyuxx.grimmscraft.network.StatsToggleGuiButtonMessage;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StatsToggleGuiScreen extends AbstractContainerScreen<StatsToggleGuiMenu> {
	private final static HashMap<String, Object> guistate = StatsToggleGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_toggle_regen;
	Button button_toggle_resistance;
	Button button_toggle_strength;
	Button button_toggle_healt;

	public StatsToggleGuiScreen(StatsToggleGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 252;
		this.imageHeight = 209;
	}

	private static final ResourceLocation texture = new ResourceLocation("grimmscraft:textures/screens/stats_toggle_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
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

				PermRegenToggleGuiValueProcedure.execute(entity), 44, 28, -12829636);
		this.font.draw(poseStack,

				PermResistToggleGuiValueProcedure.execute(entity), 44, 73, -12829636);
		this.font.draw(poseStack,

				PermStrenghtToggleGuiValueProcedure.execute(entity), 44, 118, -12829636);
		this.font.draw(poseStack,

				TogglePermHealtGUIValueProcedure.execute(entity), 44, 163, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_toggle_regen = Button.builder(Component.translatable("gui.grimmscraft.stats_toggle_gui.button_toggle_regen"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsToggleGuiButtonMessage(0, x, y, z));
				StatsToggleGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 46, 87, 20).build();
		guistate.put("button:button_toggle_regen", button_toggle_regen);
		this.addRenderableWidget(button_toggle_regen);
		button_toggle_resistance = Button.builder(Component.translatable("gui.grimmscraft.stats_toggle_gui.button_toggle_resistance"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsToggleGuiButtonMessage(1, x, y, z));
				StatsToggleGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 91, 114, 20).build();
		guistate.put("button:button_toggle_resistance", button_toggle_resistance);
		this.addRenderableWidget(button_toggle_resistance);
		button_toggle_strength = Button.builder(Component.translatable("gui.grimmscraft.stats_toggle_gui.button_toggle_strength"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsToggleGuiButtonMessage(2, x, y, z));
				StatsToggleGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 136, 103, 20).build();
		guistate.put("button:button_toggle_strength", button_toggle_strength);
		this.addRenderableWidget(button_toggle_strength);
		button_toggle_healt = Button.builder(Component.translatable("gui.grimmscraft.stats_toggle_gui.button_toggle_healt"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new StatsToggleGuiButtonMessage(3, x, y, z));
				StatsToggleGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 181, 87, 20).build();
		guistate.put("button:button_toggle_healt", button_toggle_healt);
		this.addRenderableWidget(button_toggle_healt);
	}
}
