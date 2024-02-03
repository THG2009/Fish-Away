
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fishawayforge.init;

@Mod.EventBusSubscriber
public class FishAwayForgeModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == FishAwayForgeModItems.DRIFTWOOD_SCRAPS.get())
			event.setBurnTime(100);
	}
}
