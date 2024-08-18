package ba.minecraft.uniquematerials.datagen.recipe;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.google.common.collect.ImmutableList;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModRecipeProvider extends RecipeProvider {

	public ModRecipeProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		
		buildOreRecipes(recipeOutput);
		buildTreeRecipes(recipeOutput);
    }
	
	protected void buildOreRecipes(RecipeOutput recipeOutput) {
		
		// Rutile -> Titanium
		
		ImmutableList<ItemLike> titaniumSmeltables = ImmutableList.of(
			OreItems.RUTILE_ORE.get(),
			OreItems.DEEPSLATE_RUTILE_ORE.get(),
			OreItems.RAW_RUTILE.get()
		);
		addOreSmelting(recipeOutput, titaniumSmeltables, OreItems.TITANIUM_INGOT.get(), 0.7F, 200);
	    addOreBlasting(recipeOutput, titaniumSmeltables, OreItems.TITANIUM_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_RUTILE.get(), OreItems.RAW_RUTILE_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.TITANIUM_INGOT.get(), OreItems.TITANIUM_BLOCK.get());
		
	    // Olivine -> Silicon
	    
		ImmutableList<ItemLike> siliconSmeltables = ImmutableList.of(
			OreItems.OLIVINE_ORE.get(),
			OreItems.DEEPSLATE_OLIVINE_ORE.get(),
			OreItems.RAW_OLIVINE.get()
		);
		addOreSmelting(recipeOutput, siliconSmeltables, OreItems.SILICON_INGOT.get(), 0.7F, 200);
	    addOreBlasting(recipeOutput, siliconSmeltables, OreItems.SILICON_INGOT.get(), 0.7F, 100);
		
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
	    
	    addOreSmelting(recipeOutput, aluminiumSmeltables, OreItems.ALUMINIUM_INGOT.get(), 0.7F, 150);
	    addOreBlasting(recipeOutput, aluminiumSmeltables, OreItems.ALUMINIUM_INGOT.get(), 1.0F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_BAUXITE.get(), OreItems.RAW_BAUXITE_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.ALUMINIUM_INGOT.get(), OreItems.ALUMINIUM_BLOCK.get());
	    
	    // Silver Ore -> Silver
	    
	    ImmutableList<ItemLike> silverSmeltables = ImmutableList.of( 
			OreItems.SILVER_ORE.get(), 
			OreItems.DEEPSLATE_SILVER_ORE.get(), 
			OreItems.RAW_SILVER.get() 
		);
	    
	    addOreSmelting(recipeOutput, silverSmeltables, OreItems.SILVER_INGOT.get(), 0.7F, 150); 
	    addOreBlasting(recipeOutput, silverSmeltables, OreItems.SILVER_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_SILVER.get(), OreItems.RAW_SILVER_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.SILVER_INGOT.get(), OreItems.SILVER_BLOCK.get());
	    
	    // Galena -> Lead
	    ImmutableList<ItemLike> leadSmeltables = ImmutableList.of(
			OreItems.GALENA_ORE.get(),
			OreItems.RAW_GALENA.get()
		);
	    addOreSmelting(recipeOutput, leadSmeltables, OreItems.LEAD_INGOT.get(), 0.7F, 150); 
	    addOreBlasting(recipeOutput, leadSmeltables, OreItems.LEAD_INGOT.get(), 0.7F, 100);
	    
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.RAW_GALENA.get(), OreItems.RAW_GALENA_BLOCK.get());
	    addIngotsFromBlockCrafting(recipeOutput, OreItems.LEAD_INGOT.get(), OreItems.LEAD_BLOCK.get());
	    addNugetsFromIngotCrafting(recipeOutput, OreItems.LEAD_NUGGET.get(), OreItems.LEAD_INGOT.get());	

	    // Aventurine
	    
	    ImmutableList<ItemLike> aventurineSmeltables = ImmutableList.of(
			OreItems.NETHERRACK_AVENTURINE_ORE.get()
		);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_BLOCK.get(), OreItems.AVENTURINE.get());

        // Improved alternative for recipes below. 
	    //addOreSmelting(recipeOutput, aventurineSmeltables, OreItems.AVENTURINE.get(), 0.2F, 200); 
	    //addOreBlasting(recipeOutput, aventurineSmeltables, OreItems.AVENTURINE.get(), 0.2F, 100);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()), RecipeCategory.MISC, OreItems.AVENTURINE.get(), 0.2F, 200)
	        .unlockedBy("has_netherrack_aventurine_ore", has(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()))
	        .save(recipeOutput, getSmeltingRecipeName(OreItems.AVENTURINE.get()));
        
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()), RecipeCategory.MISC, OreItems.AVENTURINE.get(), 0.2F, 100)
	        .unlockedBy("has_nether_quartz_ore", has(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()))
	        .save(recipeOutput, getBlastingRecipeName(OreItems.AVENTURINE.get()));

	}
	
	protected void buildTreeRecipes(RecipeOutput recipeOutput)  {

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

	private void addOreSmelting(RecipeOutput recipeOutput, List<ItemLike> smeltables, Item ingot, float experience, int cookingTime) {
		oreSmelting(recipeOutput, smeltables, RecipeCategory.MISC, ingot, experience, cookingTime, registryName(ingot));
	}

	private void addOreBlasting(RecipeOutput recipeOutput, List<ItemLike> smeltables, Item ingot, float experience, int cookingTime) {
		oreBlasting(recipeOutput, smeltables, RecipeCategory.MISC, ingot, experience, cookingTime, registryName(ingot));
	}
	
	private void addIngotsFromBlockCrafting(RecipeOutput recipeOutput, Item ingot, Item block) {
		String ingotName = registryName(ingot);
		String blockName = registryName(block);
	    nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, ingot, RecipeCategory.BUILDING_BLOCKS,  block, ingotName + "_from_" + blockName, ingotName);
	}

	private void addNugetsFromIngotCrafting(RecipeOutput recipeOutput, Item nugget, Item ingot) {
		String nuggetName = registryName(nugget);
		String ingotName = registryName(ingot);
	    nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, nugget, RecipeCategory.MISC, ingot, nuggetName + "_from_" + ingotName, nuggetName);
	}
	
	private String registryName(Item item) {
		return ForgeRegistries.ITEMS.getKey(item).getPath();
	}
	

}