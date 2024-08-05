package ba.minecraft.uniquematerials.datagen.recipe;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.google.common.collect.ImmutableList;

import ba.minecraft.uniquematerials.common.items.OreItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreItemRecipeProvider extends RecipeProvider {

	public OreItemRecipeProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	private static void addIngotSmelting(RecipeOutput recipeOutput, List<ItemLike> smeltables, Item ingot, float experience, int cookingTime) {
		oreSmelting(recipeOutput, smeltables, RecipeCategory.MISC, ingot, experience, cookingTime, ForgeRegistries.ITEMS.getKey(ingot).getPath());
	}

	private static void addIngotBlasting(RecipeOutput recipeOutput, List<ItemLike> smeltables, Item ingot, float experience, int cookingTime) {
		oreBlasting(recipeOutput, smeltables, RecipeCategory.MISC, ingot, experience, cookingTime, ForgeRegistries.ITEMS.getKey(ingot).getPath());
	}
	
	private static void addIngotsFromBlockCrafting(RecipeOutput recipeOutput, Item ingot, Item block) {
		String ingotName = ForgeRegistries.ITEMS.getKey(ingot).getPath();
		String blockName = ForgeRegistries.ITEMS.getKey(block).getPath();
	    nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, ingot, RecipeCategory.BUILDING_BLOCKS,  block, ingotName + "_from_" + blockName, ingotName);
	}

	private static void addNugetsFromIngotCrafting(RecipeOutput recipeOutput, Item nugget, Item ingot) {
		String nuggetName = ForgeRegistries.ITEMS.getKey(nugget).getPath();
		String ingotName = ForgeRegistries.ITEMS.getKey(ingot).getPath();
	    nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, nugget, RecipeCategory.MISC, ingot, nuggetName + "_from_" + ingotName, nuggetName);
	}

	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		// Rutile -> Titanium
		
		ImmutableList<ItemLike> titaniumSmeltables = ImmutableList.of(
			OreItems.RUTILE_ORE.get(),
			OreItems.DEEPSLATE_RUTILE_ORE.get(),
			OreItems.RAW_RUTILE.get()
		);
		addIngotSmelting(recipeOutput, titaniumSmeltables, OreItems.TITANIUM_INGOT.get(), 0.7F, 200);
	    addIngotBlasting(recipeOutput, titaniumSmeltables, OreItems.TITANIUM_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_RUTILE.get(), OreItems.RAW_RUTILE_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.TITANIUM_INGOT.get(), OreItems.TITANIUM_BLOCK.get());
		
	    // Olivine -> Silicon
	    
		ImmutableList<ItemLike> siliconSmeltables = ImmutableList.of(
			OreItems.OLIVINE_ORE.get(),
			OreItems.DEEPSLATE_OLIVINE_ORE.get(),
			OreItems.RAW_OLIVINE.get()
		);
		addIngotSmelting(recipeOutput, siliconSmeltables, OreItems.SILICON_INGOT.get(), 0.7F, 200);
	    addIngotBlasting(recipeOutput, siliconSmeltables, OreItems.SILICON_INGOT.get(), 0.7F, 100);
		
	    addNugetsFromIngotCrafting(recipeOutput,OreItems.SILICON_NUGGET.get(), OreItems.SILICON_INGOT.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_OLIVINE.get(), OreItems.RAW_OLIVINE_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.SILICON_INGOT.get(), OreItems.SILICON_BLOCK.get());
	    
	    // Bauxite -> Aluminum
	    
	    ImmutableList<ItemLike> aluminiumSmeltables = ImmutableList.of(
	    	OreItems.BAUXITE_ORE.get(),
	    	OreItems.DEEPSLATE_BAUXITE_ORE.get(),
	    	OreItems.RAW_BAUXITE.get()
	    );
	    addNugetsFromIngotCrafting(recipeOutput,OreItems.ALUMINIUM_NUGGET.get(), OreItems.ALUMINIUM_INGOT.get());
	    
	    addIngotSmelting(recipeOutput, aluminiumSmeltables, OreItems.ALUMINIUM_INGOT.get(), 0.7F, 150);
	    addIngotBlasting(recipeOutput, aluminiumSmeltables, OreItems.ALUMINIUM_INGOT.get(), 1.0F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_BAUXITE.get(), OreItems.RAW_BAUXITE_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.ALUMINIUM_INGOT.get(), OreItems.ALUMINIUM_BLOCK.get());
	    
	    // Silver Ore -> Silver
	    
	    ImmutableList<ItemLike> silverSmeltables = ImmutableList.of( 
			OreItems.SILVER_ORE.get(), 
			OreItems.DEEPSLATE_SILVER_ORE.get(), 
			OreItems.RAW_SILVER.get() 
		);
	    
	    addIngotSmelting(recipeOutput, silverSmeltables, OreItems.SILVER_INGOT.get(), 0.7F, 150); 
	    addIngotBlasting(recipeOutput, silverSmeltables, OreItems.SILVER_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_SILVER.get(), OreItems.RAW_SILVER_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.SILVER_INGOT.get(), OreItems.SILVER_BLOCK.get());
	    
	    // Galena -> Lead
	    ImmutableList<ItemLike> leadSmeltables = ImmutableList.of(
			OreItems.GALENA_ORE.get(),
			OreItems.RAW_GALENA.get()
		);
	    addIngotSmelting(recipeOutput, leadSmeltables, OreItems.LEAD_INGOT.get(), 0.7F, 150); 
	    addIngotBlasting(recipeOutput, leadSmeltables, OreItems.LEAD_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_GALENA.get(), OreItems.RAW_GALENA_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.LEAD_INGOT.get(), OreItems.LEAD_BLOCK.get());
	    addNugetsFromIngotCrafting(recipeOutput, OreItems.LEAD_NUGGET.get(), OreItems.LEAD_INGOT.get());	}

}