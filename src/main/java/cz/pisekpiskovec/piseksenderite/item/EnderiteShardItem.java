
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import cz.pisekpiskovec.piseksenderite.init.PiseksEnderiteModTabs;

public class EnderiteShardItem extends Item {
	public EnderiteShardItem() {
		super(new Item.Properties().tab(PiseksEnderiteModTabs.TAB_CREATIVE_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
