package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SleepingHUDDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GrimmscraftModMobEffects.SLEEPING.get());
	}
}
