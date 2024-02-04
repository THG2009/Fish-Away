
package net.mcreator.fishawayforge.init;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class FishAwayForgeModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("fish_away_forge:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}
