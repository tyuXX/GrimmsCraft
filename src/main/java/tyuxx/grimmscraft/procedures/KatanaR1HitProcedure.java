package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class KatanaR1HitProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") + 5));
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					String _translatekey = "death.attack." + "katana";
					if (this.getEntity() == null && this.getDirectEntity() == null) {
						return _msgEntity.getKillCredit() != null
								? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
								: Component.translatable(_translatekey, _msgEntity.getDisplayName());
					} else {
						Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
						ItemStack _itemstack = ItemStack.EMPTY;
						if (this.getEntity() instanceof LivingEntity _livingentity)
							_itemstack = _livingentity.getMainHandItem();
						return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
								? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
								: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
					}
				}
			}, (float) (itemstack.getOrCreateTag().getDouble("level") * GrimmscraftModVariables.MapVariables.get(world).katanapow * 4));
		if (itemstack.getOrCreateTag().getDouble("xp") >= itemstack.getOrCreateTag().getDouble("xpn")) {
			itemstack.getOrCreateTag().putDouble("level", (itemstack.getOrCreateTag().getDouble("level") + 1));
			itemstack.getOrCreateTag().putDouble("xpn", Math.ceil(itemstack.getOrCreateTag().getDouble("xpn") * (GrimmscraftModVariables.MapVariables.get(world).katanalevelupdif - 0.1)));
			itemstack.getOrCreateTag().putDouble("xp", 0);
			itemstack.setHoverName(Component.literal(("Katana LvL - " + new java.text.DecimalFormat("####").format(itemstack.getOrCreateTag().getDouble("level")))));
			itemstack.setDamageValue(0);
		}
		itemstack.getOrCreateTag().putDouble("atp", (itemstack.getOrCreateTag().getDouble("level") * GrimmscraftModVariables.MapVariables.get(world).katanapow * 4));
	}
}
