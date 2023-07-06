package tyuxx.grimmscraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class SleepingOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Vec3 motion = entity.getDeltaMovement().scale(0);
		entity.setDeltaMovement(motion);
	}
}
