
package tyuxx.grimmscraft.potion;

import tyuxx.grimmscraft.procedures.InvulnerableEffectStartedappliedProcedure;
import tyuxx.grimmscraft.procedures.InvulnerableEffectExpiresProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InvulnerableMobEffect extends MobEffect {
	public InvulnerableMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.grimmscraft.invulnerable";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		InvulnerableEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InvulnerableEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
