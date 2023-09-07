package tyuxx.grimmscraft.client.gui;

import tyuxx.grimmscraft.world.inventory.ItemSpawnGUIMenu;
import tyuxx.grimmscraft.network.ItemSpawnGUIButtonMessage;
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

public class ItemSpawnGUIScreen extends AbstractContainerScreen<ItemSpawnGUIMenu> {
	private final static HashMap<String, Object> guistate = ItemSpawnGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox item;
	Button button_spawn;

	public ItemSpawnGUIScreen(ItemSpawnGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 150;
		this.imageHeight = 57;
	}

	private static final ResourceLocation texture = new ResourceLocation("grimmscraft:textures/screens/item_spawn_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		item.render(ms, mouseX, mouseY, partialTicks);
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
		if (item.isFocused())
			return item.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		item.tick();
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
		item = new EditBox(this.font, this.leftPos + 2, this.topPos + 8, 120, 20, Component.translatable("gui.grimmscraft.item_spawn_gui.item")) {
			{
				setSuggestion(Component.translatable("gui.grimmscraft.item_spawn_gui.item").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.grimmscraft.item_spawn_gui.item").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.grimmscraft.item_spawn_gui.item").getString());
				else
					setSuggestion(null);
			}
		};
		item.setMaxLength(32767);
		guistate.put("text:item", item);
		this.addWidget(this.item);
		button_spawn = Button.builder(Component.translatable("gui.grimmscraft.item_spawn_gui.button_spawn"), e -> {
			if (true) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new ItemSpawnGUIButtonMessage(0, x, y, z));
				ItemSpawnGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 32, 51, 20).build();
		guistate.put("button:button_spawn", button_spawn);
		this.addRenderableWidget(button_spawn);
	}
}
