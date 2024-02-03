
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fishawayforge.init;

import net.mcreator.fishawayforge.FishAwayForgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FishAwayForgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FishAwayForgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> FISH_AWAY = REGISTRY.register("fish_away",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fish_away_forge.fish_away")).icon(() -> new ItemStack(FishAwayForgeModItems.PEAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FishAwayForgeModItems.COPPER_AXE.get());
				tabData.accept(FishAwayForgeModItems.DRIFTWOOD_SCRAPS.get());
				tabData.accept(FishAwayForgeModItems.COPPER_FISHING_ROD.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(FishAwayForgeModItems.PEAR.get());
		}
	}
}
