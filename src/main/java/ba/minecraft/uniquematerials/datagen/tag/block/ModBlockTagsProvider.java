package ba.minecraft.uniquematerials.datagen.tag.block;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.blocks.TreeBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.tags.ModBlockTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModBlockTagsProvider extends BlockTagsProvider {

	public ModBlockTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {

	tag(ModBlockTags.BEECH_LOGS)
		.add(TreeBlocks.BEECH_LOG.get())
		.add(TreeBlocks.STRIPPED_BEECH_LOG.get())
		.add(TreeBlocks.BEECH_WOOD.get())
		.add(TreeBlocks.STRIPPED_BEECH_WOOD.get());
	
	tag(ModBlockTags.MAHOGANY_LOGS)
		.add(TreeBlocks.MAHOGANY_LOG.get())
		.add(TreeBlocks.STRIPPED_MAHOGANY_LOG.get())
		.add(TreeBlocks.MAHOGANY_WOOD.get())
		.add(TreeBlocks.STRIPPED_MAHOGANY_WOOD.get());
	
	tag(ModBlockTags.SEQUOIA_LOGS)
		.add(TreeBlocks.SEQUOIA_LOG.get())
		.add(TreeBlocks.STRIPPED_SEQUOIA_LOG.get())
		.add(TreeBlocks.SEQUOIA_WOOD.get())
		.add(TreeBlocks.STRIPPED_SEQUOIA_WOOD.get());
		
	tag(ModBlockTags.NEEDS_NETHERITE_TOOL)
		.add(OreBlocks.NETHERRACK_CITRINE_ORE.get());

	tag(ModBlockTags.SANDSTONE_ORE_REPLACEABLES)
		.add(Blocks.SAND)
		.add(Blocks.SANDSTONE);

	tag(ModBlockTags.RED_SANDSTONE_ORE_REPLACEABLES)
		.add(Blocks.RED_SAND)
		.add(Blocks.RED_SANDSTONE);

	tag(ModBlockTags.NETHERRACK_ORE_REPLACEABLES)
		.add(Blocks.NETHERRACK);

	}
}

