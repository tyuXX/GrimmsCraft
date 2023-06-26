package tyuxx.grimmscraft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class FireT1EntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _entToDamage = entity;
			_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), 2);
		}
	}
}