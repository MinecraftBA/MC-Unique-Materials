package ba.minecraft.uniquematerials.datagen.tag.item;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, CompletableFuture<TagLookup<Block>> blockTagLookup, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, blockTagLookup, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {
        
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
		
	}

}
