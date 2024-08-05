package ba.minecraft.uniquematerials.datagen.tag.block;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.blocks.OreBlocks;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ForgeBlockTagsProvider extends BlockTagsProvider {

	public ForgeBlockTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {

		tag(Blocks.ORES)
			.add(OreBlocks.BAUXITE_ORE.get())
			.add(OreBlocks.DEEPSLATE_BAUXITE_ORE.get())
			.add(OreBlocks.RED_SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.SANDSTONE_HALITE_ORE.get())
			.add(OreBlocks.OLIVINE_ORE.get())
			.add(OreBlocks.DEEPSLATE_OLIVINE_ORE.get())
			.add(OreBlocks.RUTILE_ORE.get())
			.add(OreBlocks.DEEPSLATE_RUTILE_ORE.get())
			.add(OreBlocks.SILVER_ORE.get())
			.add(OreBlocks.DEEPSLATE_SILVER_ORE.get())
			.add(OreBlocks.NETHERRACK_CITRINE_ORE.get())
			.add(OreBlocks.GALENA_ORE.get())
			.add(OreBlocks.RED_SANDSTONE_BLACK_DIAMOND_ORE.get())
			.add(OreBlocks.SANDSTONE_BLACK_DIAMOND_ORE.get());
	}
	
}

