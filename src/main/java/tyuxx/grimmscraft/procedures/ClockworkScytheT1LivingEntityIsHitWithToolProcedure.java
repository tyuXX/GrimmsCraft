package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ClockworkScytheT1LivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") + itemstack.getOrCreateTag().getDouble("xpph")));
		if (itemstack.getOrCreateTag().getDouble("xp") >= itemstack.getOrCreateTag().getDouble("xpn")) {
			itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") - itemstack.getOrCreateTag().getDouble("xpn")));
			itemstack.getOrCreateTag().putDouble("xpn", (itemstack.getOrCreateTag().getDouble("xpn") * itemstack.getOrCreateTag().getDouble("xpnd")));
			itemstack.getOrCreateTag().putDouble("lvl", (itemstack.getOrCreateTag().getDouble("lvl") + 1));
		}
		if (itemstack.getOrCreateTag().getDouble("lvl") >= itemstack.getOrCreateTag().getDouble("rlvln")) {
			itemstack.getOrCreateTag().putDouble("lvl", (itemstack.getOrCreateTag().getDouble("lvl") - itemstack.getOrCreateTag().getDouble("rlvln")));
			itemstack.getOrCreateTag().putDouble("rlvln", (itemstack.getOrCreateTag().getDouble("rlvln") * itemstack.getOrCreateTag().getDouble("rlvlnd")));
			itemstack.getOrCreateTag().putDouble("rank", (itemstack.getOrCreateTag().getDouble("rank") + 1));
			itemstack.getOrCreateTag().putDouble("revives", (itemstack.getOrCreateTag().getDouble("revives") + 1));
			itemstack.getOrCreateTag().putDouble("xpn", 25);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "clockwork");
				}
			}, (float) (itemstack.getOrCreateTag().getDouble("lvl") * itemstack.getOrCreateTag().getDouble("rank") * itemstack.getOrCreateTag().getDouble("lvld")));
		itemstack.setHoverName(Component.literal((Component.translatable("item.grimmscraft.clockwork_scythe_t_1").getString() + "/LvL" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("lvl")) + "/Rank"
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("rank")))));
	}
}
