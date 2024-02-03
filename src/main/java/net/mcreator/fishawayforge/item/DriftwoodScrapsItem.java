
package net.mcreator.fishawayforge.item;

import java.util.List;

public class DriftwoodScrapsItem extends Item {
	public DriftwoodScrapsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
