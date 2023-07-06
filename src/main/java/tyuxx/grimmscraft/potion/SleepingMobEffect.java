
package tyuxx.grimmscraft.potion;

import tyuxx.grimmscraft.procedures.SleepingOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SleepingMobEffect extends MobEffect {
	public SleepingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.grimmscraft.sleeping";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SleepingOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
