package ba.minecraft.uniquematerials.datagen.tag;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, CompletableFuture<TagLookup<Block>> blockTagLookup, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, blockTagLookup, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {
        
		addOreTags();
		addTreeTags();
		
	}
	
	private void addOreTags() {
        tag(Tags.Items.ORES)
	    	.add(OreItems.RUTILE_ORE.get())
	    	.add(OreItems.DEEPSLATE_RUTILE_ORE.get())
	    	.add(OreItems.BAUXITE_ORE.get())
	    	.add(OreItems.DEEPSLATE_BAUXITE_ORE.get())
	    	.add(OreItems.OLIVINE_ORE.get())
	    	.add(OreItems.DEEPSLATE_OLIVINE_ORE.get())
        	.add(OreItems.SILVER_ORE.get())
        	.add(OreItems.DEEPSLATE_SILVER_ORE.get())
        	.add(OreItems.NETHERRACK_CITRINE_ORE.get())
        	.add(OreItems.GALENA_ORE.get())
        	.add(OreItems.BLACK_DIAMOND.get());
        
		tag(ItemTags.BEACON_PAYMENT_ITEMS)
			.add(OreItems.TITANIUM_INGOT.get())
			.add(OreItems.ALUMINIUM_INGOT.get())
			.add(OreItems.SILVER_INGOT.get());

	}
	
	private void addTreeTags() {

		tag(ModItemTags.BEECH_LOGS)
			.add(TreeItems.BEECH_LOG.get())
			.add(TreeItems.STRIPPED_BEECH_LOG.get())
			.add(TreeItems.BEECH_WOOD.get())
			.add(TreeItems.STRIPPED_BEECH_WOOD.get());
	
		tag(ModItemTags.MAHOGANY_LOGS)
			.add(TreeItems.MAHOGANY_LOG.get())
			.add(TreeItems.STRIPPED_MAHOGANY_LOG.get())
			.add(TreeItems.MAHOGANY_WOOD.get())
			.add(TreeItems.STRIPPED_MAHOGANY_WOOD.get());
	
		tag(ModItemTags.SEQUOIA_LOGS)
			.add(TreeItems.SEQUOIA_LOG.get())
			.add(TreeItems.STRIPPED_SEQUOIA_LOG.get())
			.add(TreeItems.SEQUOIA_WOOD.get())
			.add(TreeItems.STRIPPED_SEQUOIA_WOOD.get());

		// Beech tags
		addLogTags(TreeItems.BEECH_LOG.get());
		addLogTags(TreeItems.STRIPPED_BEECH_LOG.get());
		addLogTags(TreeItems.BEECH_WOOD.get());
		addLogTags(TreeItems.STRIPPED_BEECH_WOOD.get());
		addPlankTags(TreeItems.BEECH_PLANKS.get());
		addSaplingTags(TreeItems.BEECH_SAPLING.get());
		addLeavesTags(TreeItems.BEECH_LEAVES.get());

		// Mahogany tags
		
		addLogTags(TreeItems.MAHOGANY_LOG.get());
		addLogTags(TreeItems.STRIPPED_MAHOGANY_LOG.get());
		addLogTags(TreeItems.MAHOGANY_WOOD.get());
		addLogTags(TreeItems.STRIPPED_MAHOGANY_WOOD.get());
		addPlankTags(TreeItems.MAHOGANY_PLANKS.get());
		addSaplingTags(TreeItems.MAHOGANY_SAPLING.get());
		addLeavesTags(TreeItems.MAHOGANY_LEAVES.get());
		
		// Sequoia
		
		addLogTags(TreeItems.SEQUOIA_LOG.get());
		addLogTags(TreeItems.STRIPPED_SEQUOIA_LOG.get());
		addLogTags(TreeItems.SEQUOIA_WOOD.get());
		addLogTags(TreeItems.STRIPPED_SEQUOIA_WOOD.get());
		addPlankTags(TreeItems.SEQUOIA_PLANKS.get());
		addSaplingTags(TreeItems.SEQUOIA_SAPLING.get());
		addLeavesTags(TreeItems.SEQUOIA_LEAVES.get());

	}
	
	private void addLogTags(Item item) {
		tag(ItemTags.LOGS).add(item);
		tag(ItemTags.LOGS_THAT_BURN).add(item);
	}
	
	private void addPlankTags(Item item) {
		tag(ItemTags.PLANKS).add(item);
	}

	private void addSaplingTags(Item item) {
		tag(ItemTags.SAPLINGS).add(item);
	}

	private void addLeavesTags(Item item) {
		tag(ItemTags.LEAVES).add(item);
	}

}
