package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModMobEffects;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ZZZGloveRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(GrimmscraftModMobEffects.SLEEPING.get(), 90, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(GrimmscraftModMobEffects.INVULNERABLE.get(), 90, 1, true, false));
	}
}
