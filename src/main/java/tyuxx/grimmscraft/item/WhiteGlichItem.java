
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WhiteGlichItem extends Item {
	public WhiteGlichItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
