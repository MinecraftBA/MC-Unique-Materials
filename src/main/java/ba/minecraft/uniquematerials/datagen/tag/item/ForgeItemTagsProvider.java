package ba.minecraft.uniquematerials.datagen.tag.item;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ForgeItemTagsProvider extends ItemTagsProvider {

	public ForgeItemTagsProvider(PackOutput packOutput, CompletableFuture<Provider> provider, CompletableFuture<TagLookup<Block>> blockTagLookup, ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, blockTagLookup, UniqueMaterialsMod.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {
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
        
	}

}

