package ba.minecraft.uniquematerials.datagen.recipe;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

public final class TreeItemRecipeProvider extends RecipeProvider {
	
	public TreeItemRecipeProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}
	
	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {

		// Beech recipes
		
		planksFromLog(recipeOutput, TreeItems.BEECH_PLANKS.get(), ModItemTags.BEECH_LOGS, 4);
		woodFromLogs(recipeOutput, TreeItems.BEECH_WOOD.get(), TreeItems.BEECH_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_BEECH_WOOD.get(), TreeItems.STRIPPED_BEECH_LOG.get());
		
		// Mahogany recipes
		
		planksFromLog(recipeOutput, TreeItems.MAHOGANY_PLANKS.get(), ModItemTags.MAHOGANY_LOGS, 4);
		woodFromLogs(recipeOutput, TreeItems.MAHOGANY_WOOD.get(), TreeItems.BEECH_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_MAHOGANY_WOOD.get(), TreeItems.STRIPPED_MAHOGANY_LOG.get());
		
		// Sequoia recipes
		
		planksFromLog(recipeOutput, TreeItems.SEQUOIA_PLANKS.get(), ModItemTags.SEQUOIA_LOGS, 4);
		woodFromLogs(recipeOutput, TreeItems.SEQUOIA_WOOD.get(), TreeItems.SEQUOIA_LOG.get());
		woodFromLogs(recipeOutput, TreeItems.STRIPPED_SEQUOIA_WOOD.get(), TreeItems.STRIPPED_SEQUOIA_LOG.get());

	}
	
}