
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DustyIronItem extends Item {
	public DustyIronItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
