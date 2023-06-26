
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DigitalClockItem extends Item {
	public DigitalClockItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
