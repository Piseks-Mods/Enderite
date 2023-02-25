package cz.pisekpiskovec.piseksenderite.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

import cz.pisekpiskovec.piseksenderite.PiseksEnderiteMod;

public class KenophobiaProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PiseksEnderiteMod.LOGGER.warn("Failed to load dependency entity for procedure KenophobiaProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.LEVITATION)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (entity.getPosY() <= 0) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) (entity.getPosY() * (-15)),
							(int) (entity.getPosY() * (-1) - 1), (true), (false)));
			}
		}
	}
}
