
package net.mcreator.fishawayforge.item;

import java.util.List;

public class NetheriteFishingRodItem extends FishingRodItem {
	public NetheriteFishingRodItem() {
		super(new Item.Properties().durability(100));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)).test(repairitem);
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
