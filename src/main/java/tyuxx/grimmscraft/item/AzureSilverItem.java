
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AzureSilverItem extends Item {
	public AzureSilverItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
