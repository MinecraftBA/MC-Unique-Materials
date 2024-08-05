package ba.minecraft.uniquematerials.datagen.tag.item;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class MinecraftItemTagsProvider extends ItemTagsProvider {

	public MinecraftItemTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, CompletableFuture<TagLookup<Block>> blockTagLookup, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, blockTagLookup, UniqueMaterialsMod.MODID, existingFileHelper);
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

	@Override
	protected void addTags(Provider pProvider) {
		
		tag(ItemTags.BEACON_PAYMENT_ITEMS)
			.add(OreItems.TITANIUM_INGOT.get())
			.add(OreItems.ALUMINIUM_INGOT.get())
			.add(OreItems.SILVER_INGOT.get());
		
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
}
