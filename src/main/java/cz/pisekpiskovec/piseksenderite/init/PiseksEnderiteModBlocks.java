
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.pisekpiskovec.piseksenderite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import cz.pisekpiskovec.piseksenderite.block.EnderiteBlockBlock;
import cz.pisekpiskovec.piseksenderite.block.AlienStoneBlock;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteMod;

public class PiseksEnderiteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PiseksEnderiteMod.MODID);
	public static final RegistryObject<Block> ALIEN_STONE = REGISTRY.register("alien_stone", () -> new AlienStoneBlock());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
}
