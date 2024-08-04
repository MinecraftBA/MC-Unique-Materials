package ba.minecraft.uniquematerials.datagen.model.item;

import ba.minecraft.uniquematerials.common.items.TreeItems;
import ba.minecraft.uniquematerials.datagen.model.item.base.BaseItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class TreeItemModelProvider extends BaseItemModelProvider {

	public TreeItemModelProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, exFileHelper);
	}

	@Override
	protected void registerModels() {

		// Beech
		
		blockItem(TreeItems.BEECH_LOG.get());
		blockItem(TreeItems.STRIPPED_BEECH_LOG.get());
		blockItem(TreeItems.BEECH_WOOD.get());
		blockItem(TreeItems.STRIPPED_BEECH_WOOD.get());
		blockItem(TreeItems.BEECH_PLANKS.get());
		blockGenerated(TreeItems.BEECH_SAPLING.get());
		blockItem(TreeItems.BEECH_LEAVES.get());

		// Mahogany
		
		blockItem(TreeItems.MAHOGANY_LOG.get());
		blockItem(TreeItems.STRIPPED_MAHOGANY_LOG.get());
		blockItem(TreeItems.MAHOGANY_WOOD.get());
		blockItem(TreeItems.STRIPPED_MAHOGANY_WOOD.get());
		blockItem(TreeItems.MAHOGANY_PLANKS.get());
		blockGenerated(TreeItems.MAHOGANY_SAPLING.get());
		blockItem(TreeItems.MAHOGANY_LEAVES.get());
		
		// Sequoia
		
		blockItem(TreeItems.SEQUOIA_LOG.get());
		blockItem(TreeItems.STRIPPED_SEQUOIA_LOG.get());
		blockItem(TreeItems.SEQUOIA_WOOD.get());
		blockItem(TreeItems.STRIPPED_SEQUOIA_WOOD.get());
		blockItem(TreeItems.SEQUOIA_PLANKS.get());
		blockGenerated(TreeItems.SEQUOIA_SAPLING.get());
		blockItem(TreeItems.SEQUOIA_LEAVES.get());
		
	}

}