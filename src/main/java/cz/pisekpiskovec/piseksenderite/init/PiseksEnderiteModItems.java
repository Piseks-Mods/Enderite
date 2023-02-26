
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.pisekpiskovec.piseksenderite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import cz.pisekpiskovec.piseksenderite.item.EnderiteSwordItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteShovelItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteShardItem;
import cz.pisekpiskovec.piseksenderite.item.EnderitePickaxeItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteHoeItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteCrystalsItem;
import cz.pisekpiskovec.piseksenderite.item.EnderiteAxeItem;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteMod;

public class PiseksEnderiteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PiseksEnderiteMod.MODID);
	public static final RegistryObject<Item> ALIEN_STONE = block(PiseksEnderiteModBlocks.ALIEN_STONE, PiseksEnderiteModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> ENDERITE_SHARD = REGISTRY.register("enderite_shard", () -> new EnderiteShardItem());
	public static final RegistryObject<Item> ENDERITE_CRYSTALS = REGISTRY.register("enderite_crystals", () -> new EnderiteCrystalsItem());
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(PiseksEnderiteModBlocks.ENDERITE_BLOCK, PiseksEnderiteModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> ENDERITE_HELMET = REGISTRY.register("enderite_helmet", () -> new EnderiteItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_CHESTPLATE = REGISTRY.register("enderite_chestplate", () -> new EnderiteItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_LEGGINGS = REGISTRY.register("enderite_leggings", () -> new EnderiteItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_BOOTS = REGISTRY.register("enderite_boots", () -> new EnderiteItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
