
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneWireItem extends Item {
	public RedstoneWireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
