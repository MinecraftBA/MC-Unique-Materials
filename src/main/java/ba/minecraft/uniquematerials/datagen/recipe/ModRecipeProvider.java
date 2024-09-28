package ba.minecraft.uniquematerials.datagen.recipe;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.google.common.collect.ImmutableList;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.ToolItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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
		
		buildBlastingRecipes(recipeOutput);
		buildCraftingRecipes(recipeOutput);
		buildSmeltingRecipes(recipeOutput);
		buildStonecutterRecipes(recipeOutput);
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
	
	private void buildStonecutterRecipes(RecipeOutput recipeOutput) {
		
		// Aventurine
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_STAIRS.get(), OreBlocks.AVENTURINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_PILLAR.get(), OreBlocks.AVENTURINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CHISELED_AVENTURINE_BLOCK.get(), OreBlocks.AVENTURINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_BRICKS.get(), OreBlocks.AVENTURINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_AVENTURINE_SLAB.get(), OreBlocks.SMOOTH_AVENTURINE.get(), 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_AVENTURINE_STAIRS.get(), OreBlocks.SMOOTH_AVENTURINE.get());
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(OreBlocks.AVENTURINE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_SLAB.get(), 2)
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .save(recipeOutput, "aventurine_slab_from_stonecutting");
        
     // Citrine
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_STAIRS.get(), OreBlocks.CITRINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_PILLAR.get(), OreBlocks.CITRINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CHISELED_CITRINE_BLOCK.get(), OreBlocks.CITRINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_BRICKS.get(), OreBlocks.CITRINE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_CITRINE_SLAB.get(), OreBlocks.SMOOTH_CITRINE.get(), 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_CITRINE_STAIRS.get(), OreBlocks.SMOOTH_CITRINE.get());
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(OreBlocks.CITRINE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_SLAB.get(), 2)
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .save(recipeOutput, "citrine_slab_from_stonecutting");
	}
	
	private void buildBlastingRecipes(RecipeOutput recipeOutput) {
		
		// Aventurine
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()), RecipeCategory.MISC, OreItems.AVENTURINE.get(), 0.2F, 100)
	        .unlockedBy("has_netherrack_aventurine_ore", has(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()))
	        .save(recipeOutput, getBlastingRecipeName(OreItems.AVENTURINE.get()));
        
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(OreBlocks.NETHERRACK_CITRINE_ORE.get()), RecipeCategory.MISC, OreItems.CITRINE.get(), 0.2F, 100)
        .unlockedBy("has_netherrack_citrine_ore", has(OreBlocks.NETHERRACK_CITRINE_ORE.get()))
        .save(recipeOutput, getBlastingRecipeName(OreItems.CITRINE.get()));
	}
	
	private void buildCraftingRecipes(RecipeOutput recipeOutput) {

		// Tools
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ToolItems.TILE_CARVER.get(), 1)
	    	.define('I', Items.IRON_NUGGET)
	    	.define('S', Items.STICK)
	    	.pattern(" I ")
	    	.pattern(" S ")
	    	.pattern("   ")
	    	.unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
	    	.save(recipeOutput);
		
		// Aventurine
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, OreBlocks.CHISELED_AVENTURINE_BLOCK.get(), Ingredient.of(OreBlocks.AVENTURINE_SLAB.get()))
	        .unlockedBy("has_chiseled_aventurine_block", has(OreBlocks.CHISELED_AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_pillar", has(OreBlocks.AVENTURINE_PILLAR.get()))
	        .save(recipeOutput);
	    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_PILLAR.get(), 2)
	        .define('#', OreBlocks.AVENTURINE_BLOCK.get())
	        .pattern("#")
	        .pattern("#")
	        .unlockedBy("has_chiseled_aventurine_block", has(OreBlocks.CHISELED_AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_pillar", has(OreBlocks.AVENTURINE_PILLAR.get()))
	        .save(recipeOutput);
	    twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_BLOCK.get(), OreItems.AVENTURINE.get());
	    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_BRICKS.get(), 4)
	        .define('#', OreBlocks.AVENTURINE_BLOCK.get())
	        .pattern("##")
	        .pattern("##")
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .save(recipeOutput);
	    slabBuilder(RecipeCategory.BUILDING_BLOCKS, OreBlocks.AVENTURINE_SLAB.get(), Ingredient.of(OreBlocks.CHISELED_AVENTURINE_BLOCK.get(), OreBlocks.AVENTURINE_BLOCK.get(), OreBlocks.AVENTURINE_PILLAR.get()))
	        .unlockedBy("has_chiseled_aventurine_block", has(OreBlocks.CHISELED_AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_pillar", has(OreBlocks.AVENTURINE_PILLAR.get()))
	        .save(recipeOutput);
	    stairBuilder(OreBlocks.AVENTURINE_STAIRS.get(), Ingredient.of(OreBlocks.CHISELED_AVENTURINE_BLOCK.get(), OreBlocks.AVENTURINE_BLOCK.get(), OreBlocks.AVENTURINE_PILLAR.get()))
	        .unlockedBy("has_chiseled_aventurine_block", has(OreBlocks.CHISELED_AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .unlockedBy("has_aventurine_pillar", has(OreBlocks.AVENTURINE_PILLAR.get()))
	        .save(recipeOutput);

	    //Citrine
	    chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, OreBlocks.CHISELED_CITRINE_BLOCK.get(), Ingredient.of(OreBlocks.CITRINE_SLAB.get()))
	        .unlockedBy("has_chiseled_citrine_block", has(OreBlocks.CHISELED_CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_pillar", has(OreBlocks.CITRINE_PILLAR.get()))
	        .save(recipeOutput);
	    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_PILLAR.get(), 2)
	        .define('#', OreBlocks.CITRINE_BLOCK.get())
	        .pattern("#")
	        .pattern("#")
	        .unlockedBy("has_chiseled_citrine_block", has(OreBlocks.CHISELED_CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_pillar", has(OreBlocks.CITRINE_PILLAR.get()))
	        .save(recipeOutput);
    	twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_BLOCK.get(), OreItems.CITRINE.get());
    	ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_BRICKS.get(), 4)
	        .define('#', OreBlocks.CITRINE_BLOCK.get())
	        .pattern("##")
	        .pattern("##")
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .save(recipeOutput);
    	slabBuilder(RecipeCategory.BUILDING_BLOCKS, OreBlocks.CITRINE_SLAB.get(), Ingredient.of(OreBlocks.CHISELED_CITRINE_BLOCK.get(), OreBlocks.CITRINE_BLOCK.get(), OreBlocks.CITRINE_PILLAR.get()))
	        .unlockedBy("has_chiseled_citrine_block", has(OreBlocks.CHISELED_CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_pillar", has(OreBlocks.CITRINE_PILLAR.get()))
	        .save(recipeOutput);
	    stairBuilder(OreBlocks.CITRINE_STAIRS.get(), Ingredient.of(OreBlocks.CHISELED_CITRINE_BLOCK.get(), OreBlocks.CITRINE_BLOCK.get(), OreBlocks.CITRINE_PILLAR.get()))
	        .unlockedBy("has_chiseled_citrine_block", has(OreBlocks.CHISELED_CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	        .unlockedBy("has_citrine_pillar", has(OreBlocks.CITRINE_PILLAR.get()))
	        .save(recipeOutput);
	}

	private void buildSmeltingRecipes(RecipeOutput recipeOutput) { 

		// Aventurine
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()), RecipeCategory.MISC, OreItems.AVENTURINE.get(), 0.2F, 200)
        	.unlockedBy("has_nether_aventurine_ore", has(OreBlocks.NETHERRACK_AVENTURINE_ORE.get()))
        	.save(recipeOutput);
	    SimpleCookingRecipeBuilder.smelting(Ingredient.of(OreBlocks.AVENTURINE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_AVENTURINE.get().asItem(), 0.1F, 200)
	        .unlockedBy("has_aventurine_block", has(OreBlocks.AVENTURINE_BLOCK.get()))
	        .save(recipeOutput);
	    
	 // citrine
	 		SimpleCookingRecipeBuilder.smelting(Ingredient.of(OreBlocks.NETHERRACK_CITRINE_ORE.get()), RecipeCategory.MISC, OreItems.CITRINE.get(), 0.2F, 200)
	         	.unlockedBy("has_nether_citrine_ore", has(OreBlocks.NETHERRACK_CITRINE_ORE.get()))
	         	.save(recipeOutput);
	 	    SimpleCookingRecipeBuilder.smelting(Ingredient.of(OreBlocks.CITRINE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, OreBlocks.SMOOTH_CITRINE.get().asItem(), 0.1F, 200)
	 	        .unlockedBy("has_citrine_block", has(OreBlocks.CITRINE_BLOCK.get()))
	 	        .save(recipeOutput);
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