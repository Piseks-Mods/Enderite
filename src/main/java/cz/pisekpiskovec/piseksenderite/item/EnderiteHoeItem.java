
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.LivingEntity;

import cz.pisekpiskovec.piseksenderite.procedures.AcrophobiaProcedureProcedure;
import cz.pisekpiskovec.piseksenderite.init.PiseksEnderiteModTabs;
import cz.pisekpiskovec.piseksenderite.init.PiseksEnderiteModItems;

public class EnderiteHoeItem extends HoeItem {
	public EnderiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2643;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PiseksEnderiteModItems.ENDERITE_CRYSTALS.get()));
			}
		}, 0, 0f, new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		AcrophobiaProcedureProcedure.execute(entity);
		return retval;
	}
}
