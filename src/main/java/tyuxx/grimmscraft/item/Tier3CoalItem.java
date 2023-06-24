
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier3CoalItem extends Item {
	public Tier3CoalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
