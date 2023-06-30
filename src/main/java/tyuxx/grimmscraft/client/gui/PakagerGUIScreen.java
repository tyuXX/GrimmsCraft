package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.PakagerGUIMenu;
import tyuxx.grimmscraft.network.PakagerGUIButtonMessage;
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

public class PakagerGUIScreen extends AbstractContainerScreen<PakagerGUIMenu> {
	private final static HashMap<String, Object> guistate = PakagerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_toggle_auto_compress;

	public PakagerGUIScreen(PakagerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("grimmscraft:textures/screens/pakager_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.grimmscraft.pakager_gui.label_empty"), 69, 34, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.grimmscraft.pakager_gui.label_empty1"), 69, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.grimmscraft.pakager_gui.label_compress"), 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_toggle_auto_compress = Button.builder(Component.translatable("gui.grimmscraft.pakager_gui.button_toggle_auto_compress"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new PakagerGUIButtonMessage(0, x, y, z));
				PakagerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 61, 129, 20).build();
		guistate.put("button:button_toggle_auto_compress", button_toggle_auto_compress);
		this.addRenderableWidget(button_toggle_auto_compress);
	}
}
