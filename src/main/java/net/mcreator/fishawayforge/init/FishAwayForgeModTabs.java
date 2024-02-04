
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fishawayforge.init;

import net.mcreator.fishawayforge.FishAwayForgeMod;

public class FishAwayForgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FishAwayForgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> FISH_AWAY = REGISTRY.register("fish_away",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fish_away_forge.fish_away")).icon(() -> new ItemStack(FishAwayForgeModItems.PEAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FishAwayForgeModItems.PEAR.get());
				tabData.accept(FishAwayForgeModItems.DRIFTWOOD_SCRAPS.get());
				tabData.accept(FishAwayForgeModItems.COPPER_AXE.get());
				tabData.accept(FishAwayForgeModItems.COPPER_FISHING_ROD.get());
				tabData.accept(FishAwayForgeModItems.IRON_FISHING_ROD.get());
				tabData.accept(FishAwayForgeModItems.GOLDEN_FISHING_ROD.get());
				tabData.accept(FishAwayForgeModItems.DIAMOND_FISHING_ROD.get());
				tabData.accept(FishAwayForgeModItems.NETHERITE_FISHING_ROD.get());
				tabData.accept(FishAwayForgeModItems.COPPER_PICKAXE.get());
				tabData.accept(FishAwayForgeModItems.COPPER_SHOVEL.get());
				tabData.accept(FishAwayForgeModItems.COPPER_HOE.get());
				tabData.accept(FishAwayForgeModItems.COPPER_SWORD.get());
			})

					.build());
}
