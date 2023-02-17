
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import cz.pisekpiskovec.piseksenderite.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteModElements;

@PiseksEnderiteModElements.ModElement.Tag
public class EnderitePickaxeItem extends PiseksEnderiteModElements.ModElement {
	@ObjectHolder("piseks_enderite:enderite_pickaxe")
	public static final Item block = null;

	public EnderitePickaxeItem(PiseksEnderiteModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -2.7999999999999998f, new Item.Properties().group(CreativeTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("enderite_pickaxe"));
	}
}
