
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import cz.pisekpiskovec.piseksenderite.procedures.AcrophobiaProcedureProcedure;
import cz.pisekpiskovec.piseksenderite.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteModElements;

@PiseksEnderiteModElements.ModElement.Tag
public class EnderiteSwordItem extends PiseksEnderiteModElements.ModElement {
	@ObjectHolder("piseks_enderite:enderite_sword")
	public static final Item block = null;

	public EnderiteSwordItem(PiseksEnderiteModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2643;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 23;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteCrystalsItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(CreativeTabItemGroup.tab).isImmuneToFire()) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				AcrophobiaProcedureProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("enderite_sword"));
	}
}
