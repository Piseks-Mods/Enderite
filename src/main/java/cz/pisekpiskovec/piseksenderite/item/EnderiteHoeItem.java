
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import cz.pisekpiskovec.piseksenderite.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteModElements;

@PiseksEnderiteModElements.ModElement.Tag
public class EnderiteHoeItem extends PiseksEnderiteModElements.ModElement {
	@ObjectHolder("piseks_enderite:enderite_hoe")
	public static final Item block = null;

	public EnderiteHoeItem(PiseksEnderiteModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2643;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return -1f;
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
		}, 0, 0f, new Item.Properties().group(CreativeTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("enderite_hoe"));
	}
}
