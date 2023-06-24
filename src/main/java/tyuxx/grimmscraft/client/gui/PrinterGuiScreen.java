package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.PrinterGuiMenu;
import tyuxx.grimmscraft.network.PrinterGuiButtonMessage;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PrinterGuiScreen extends AbstractContainerScreen<PrinterGuiMenu> {
	private final static HashMap<String, Object> guistate = PrinterGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox print;
	Button button_print;

	public PrinterGuiScreen(PrinterGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("grimmscraft:textures/screens/printer_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		print.render(ms, mouseX, mouseY, partialTicks);
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
		if (print.isFocused())
			return print.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		print.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		print = new EditBox(this.font, this.leftPos + 51, this.topPos + 61, 120, 20, Component.translatable("gui.grimmscraft.printer_gui.print")) {
			{
				setSuggestion(Component.translatable("gui.grimmscraft.printer_gui.print").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.grimmscraft.printer_gui.print").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.grimmscraft.printer_gui.print").getString());
				else
					setSuggestion(null);
			}
		};
		print.setMaxLength(32767);
		guistate.put("text:print", print);
		this.addWidget(this.print);
		button_print = Button.builder(Component.translatable("gui.grimmscraft.printer_gui.button_print"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new PrinterGuiButtonMessage(0, x, y, z));
				PrinterGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 114, this.topPos + 7, 51, 20).build();
		guistate.put("button:button_print", button_print);
		this.addRenderableWidget(button_print);
	}
}
