
package net.mcreator.fishawayforge.item;

import java.util.List;

public class GoldenFishingRodItem extends FishingRodItem {
	public GoldenFishingRodItem() {
		super(new Item.Properties().durability(50));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.GOLD_INGOT)).test(repairitem);
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
