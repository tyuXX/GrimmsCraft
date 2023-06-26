package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;
import tyuxx.grimmscraft.init.GrimmscraftModEnchantments;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class KatanaT3LivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") + 1 * (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_1.get()) + 1)
				* (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_2.get()) + 1) * 2 * (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_2.get()) + 1) * 3));
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "katana");
				}
			}, (float) (itemstack.getOrCreateTag().getDouble("level") * GrimmscraftModVariables.MapVariables.get(world).katanapow * 3));
		if (itemstack.getOrCreateTag().getDouble("xp") >= itemstack.getOrCreateTag().getDouble("xpn")) {
			itemstack.getOrCreateTag().putDouble("level", (itemstack.getOrCreateTag().getDouble("level") + 1));
			itemstack.getOrCreateTag().putDouble("xpn", Math.ceil(itemstack.getOrCreateTag().getDouble("xpn") * GrimmscraftModVariables.MapVariables.get(world).katanalevelupdif));
			itemstack.getOrCreateTag().putDouble("xp", 0);
			itemstack.setHoverName(Component.literal(("Katana LvL - " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("level")))));
			itemstack.setDamageValue(0);
		}
	}
}
