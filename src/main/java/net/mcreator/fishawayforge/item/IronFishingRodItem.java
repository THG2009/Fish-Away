
package net.mcreator.fishawayforge.item;

import java.util.List;

public class IronFishingRodItem extends FishingRodItem {
	public IronFishingRodItem() {
		super(new Item.Properties().durability(128));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.IRON_INGOT)).test(repairitem);
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
