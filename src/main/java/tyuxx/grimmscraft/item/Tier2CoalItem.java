
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier2CoalItem extends Item {
	public Tier2CoalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
