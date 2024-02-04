
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fishawayforge.init;

import net.mcreator.fishawayforge.item.PearItem;
import net.mcreator.fishawayforge.item.NetheriteFishingRodItem;
import net.mcreator.fishawayforge.item.IronFishingRodItem;
import net.mcreator.fishawayforge.item.GoldenFishingRodItem;
import net.mcreator.fishawayforge.item.DriftwoodScrapsItem;
import net.mcreator.fishawayforge.item.DiamondFishingRodItem;
import net.mcreator.fishawayforge.item.CopperFishingRodItem;
import net.mcreator.fishawayforge.item.CopperAxeItem;
import net.mcreator.fishawayforge.FishAwayForgeMod;

public class FishAwayForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FishAwayForgeMod.MODID);
	public static final RegistryObject<Item> PEAR = REGISTRY.register("pear", () -> new PearItem());
	public static final RegistryObject<Item> DRIFTWOOD_SCRAPS = REGISTRY.register("driftwood_scraps", () -> new DriftwoodScrapsItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_FISHING_ROD = REGISTRY.register("copper_fishing_rod", () -> new CopperFishingRodItem());
	public static final RegistryObject<Item> IRON_FISHING_ROD = REGISTRY.register("iron_fishing_rod", () -> new IronFishingRodItem());
	public static final RegistryObject<Item> GOLDEN_FISHING_ROD = REGISTRY.register("golden_fishing_rod", () -> new GoldenFishingRodItem());
	public static final RegistryObject<Item> DIAMOND_FISHING_ROD = REGISTRY.register("diamond_fishing_rod", () -> new DiamondFishingRodItem());
	public static final RegistryObject<Item> NETHERITE_FISHING_ROD = REGISTRY.register("netherite_fishing_rod", () -> new NetheriteFishingRodItem());
}
