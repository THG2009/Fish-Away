
package net.mcreator.fishawayforge.item;

import java.util.List;

public class CopperFishingRodItem extends FishingRodItem {
	public CopperFishingRodItem() {
		super(new Item.Properties().durability(90));
	}

	@Override
	public int getEnchantmentValue() {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
