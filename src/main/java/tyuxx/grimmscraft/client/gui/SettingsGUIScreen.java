package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.SettingsGUIMenu;
import tyuxx.grimmscraft.procedures.GetShowPlayerTextProcedure;
import tyuxx.grimmscraft.procedures.GetShowCoordsTextProcedure;
import tyuxx.grimmscraft.network.SettingsGUIButtonMessage;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SettingsGUIScreen extends AbstractContainerScreen<SettingsGUIMenu> {
	private final static HashMap<String, Object> guistate = SettingsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_toggle_player;
	Button button_toggle_coords;

	public SettingsGUIScreen(SettingsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 500;
		this.imageHeight = 500;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

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
		this.font.draw(poseStack, Component.translatable("gui.grimmscraft.settings_gui.label_hud"), 42, 129, -16751053);
		this.font.draw(poseStack,

				GetShowPlayerTextProcedure.execute(entity), 42, 174, -12829636);
		this.font.draw(poseStack,

				GetShowCoordsTextProcedure.execute(entity), 42, 219, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_toggle_player = Button.builder(Component.translatable("gui.grimmscraft.settings_gui.button_toggle_player"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new SettingsGUIButtonMessage(0, x, y, z));
				SettingsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 42, this.topPos + 147, 93, 20).build();
		guistate.put("button:button_toggle_player", button_toggle_player);
		this.addRenderableWidget(button_toggle_player);
		button_toggle_coords = Button.builder(Component.translatable("gui.grimmscraft.settings_gui.button_toggle_coords"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new SettingsGUIButtonMessage(1, x, y, z));
				SettingsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 42, this.topPos + 192, 93, 20).build();
		guistate.put("button:button_toggle_coords", button_toggle_coords);
		this.addRenderableWidget(button_toggle_coords);
	}
}
