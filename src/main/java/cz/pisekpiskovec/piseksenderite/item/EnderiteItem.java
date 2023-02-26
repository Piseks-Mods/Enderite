
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import cz.pisekpiskovec.piseksenderite.procedures.KenophobiaProcedureProcedure;
import cz.pisekpiskovec.piseksenderite.init.PiseksEnderiteModTabs;

public abstract class EnderiteItem extends ArmorItem {
	public EnderiteItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 42;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 23;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "enderite";
			}

			@Override
			public float getToughness() {
				return 4.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EnderiteItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "piseks_enderite:textures/models/armor/enderite___layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			KenophobiaProcedureProcedure.execute(entity);
		}
	}

	public static class Chestplate extends EnderiteItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "piseks_enderite:textures/models/armor/enderite___layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			KenophobiaProcedureProcedure.execute(entity);
		}
	}

	public static class Leggings extends EnderiteItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "piseks_enderite:textures/models/armor/enderite___layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			KenophobiaProcedureProcedure.execute(entity);
		}
	}

	public static class Boots extends EnderiteItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "piseks_enderite:textures/models/armor/enderite___layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			KenophobiaProcedureProcedure.execute(entity);
		}
	}
}
