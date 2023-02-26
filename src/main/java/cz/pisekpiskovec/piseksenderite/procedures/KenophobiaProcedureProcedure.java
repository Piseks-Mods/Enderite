package cz.pisekpiskovec.piseksenderite.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class KenophobiaProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LEVITATION) : false)) {
			if ((entity.level.dimension()) == (Level.OVERWORLD) && entity.getY() <= -64) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int) ((entity.getY() * (-15)) / 10),
							(int) (entity.getY() * (-1) - 65), (true), (false)));
			} else {
				if (!((entity.level.dimension()) == (Level.OVERWORLD)) && entity.getY() <= 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int) (entity.getY() * (-15)),
								(int) (entity.getY() * (-1) - 1), (true), (false)));
				}
			}
		}
	}
}
