
package cz.pisekpiskovec.piseksenderite.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import cz.pisekpiskovec.piseksenderite.block.AlienStoneBlock;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteModElements;

@PiseksEnderiteModElements.ModElement.Tag
public class CreativeTabItemGroup extends PiseksEnderiteModElements.ModElement {
	public CreativeTabItemGroup(PiseksEnderiteModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AlienStoneBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
