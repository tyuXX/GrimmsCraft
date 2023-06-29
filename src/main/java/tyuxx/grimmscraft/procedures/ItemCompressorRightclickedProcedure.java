package tyuxx.grimmscraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ItemCompressorRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		OpenPackagerGUIProcedure.execute(world, x, y, z, entity);
	}
}
