
package net.mcreator.fishawayforge.item;

import java.util.List;

public class DiamondFishingRodItem extends FishingRodItem {
	public DiamondFishingRodItem() {
		super(new Item.Properties().durability(384));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.DIAMOND)).test(repairitem);
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
