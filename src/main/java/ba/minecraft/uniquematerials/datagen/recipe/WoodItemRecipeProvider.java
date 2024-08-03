package ba.minecraft.uniquematerials.datagen.recipe;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;

public final class WoodItemRecipeProvider extends RecipeProvider {
	
	public WoodItemRecipeProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}
	
	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {

		// Beech recipes
		
		planksFromLog(recipeOutput, TreeItems.BEECH_PLANKS.get(), ModItemTags.BEECH_LOGS);
		woodFromLogs(recipeOutput, TreeItems.BEECH_WOOD.get(), TreeItems.BEECH_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_BEECH_WOOD.get(), TreeItems.STRIPPED_BEECH_LOG.get());
		
		// Mahogany recipes
		
		planksFromLog(recipeOutput, TreeItems.MAHOGANY_PLANKS.get(), ModItemTags.MAHOGANY_LOGS);
		woodFromLogs(recipeOutput, TreeItems.MAHOGANY_WOOD.get(), TreeItems.BEECH_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_MAHOGANY_WOOD.get(), TreeItems.STRIPPED_MAHOGANY_LOG.get());
		
		// Sequoia recipes
		
		planksFromLog(recipeOutput, TreeItems.SEQUOIA_PLANKS.get(), ModItemTags.SEQUOIA_LOGS);
		woodFromLogs(recipeOutput, TreeItems.SEQUOIA_WOOD.get(), TreeItems.SEQUOIA_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_SEQUOIA_WOOD.get(), TreeItems.STRIPPED_SEQUOIA_LOG.get());
		
		// Rubber recipes
		planksFromLog(recipeOutput, TreeItems.RUBBER_PLANKS.get(), ModItemTags.RUBBER_LOGS); 
		woodFromLogs(recipeOutput, TreeItems.RUBBER_WOOD.get(), TreeItems.RUBBER_LOG.get()); 
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_RUBBER_WOOD.get(), TreeItems.STRIPPED_RUBBER_LOG.get());

	}
	
}