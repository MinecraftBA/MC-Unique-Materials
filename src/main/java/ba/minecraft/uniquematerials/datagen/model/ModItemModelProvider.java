package ba.minecraft.uniquematerials.datagen.model;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.common.items.OreItems;
import ba.minecraft.uniquematerials.common.items.TreeItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, UniqueMaterialsMod.MODID, exFileHelper);
	}

	@Override
	protected void registerModels() {

		registerOreModels();
		registerTreeModels();
		
	}
	
	private void registerOreModels() {

		// Rutile => Titanium

		blockItem(OreItems.RUTILE_ORE.get());
		blockItem(OreItems.DEEPSLATE_RUTILE_ORE.get());
		generated(OreItems.RAW_RUTILE.get());
		generated(OreItems.TITANIUM_INGOT.get());
		blockItem(OreItems.RAW_RUTILE_BLOCK.get());
		blockItem(OreItems.TITANIUM_BLOCK.get());

		// Bauxite => Aluminium
		blockItem(OreItems.BAUXITE_ORE.get());
		blockItem(OreItems.DEEPSLATE_BAUXITE_ORE.get());
		generated(OreItems.RAW_BAUXITE.get());
		generated(OreItems.ALUMINIUM_INGOT.get());
		generated(OreItems.ALUMINIUM_NUGGET.get());
		blockItem(OreItems.RAW_BAUXITE_BLOCK.get());
		blockItem(OreItems.ALUMINIUM_BLOCK.get());
		
		blockItem(OreItems.SANDSTONE_HALITE_ORE.get());
		blockItem(OreItems.RED_SANDSTONE_HALITE_ORE.get());
		blockItem(OreItems.RAW_HALITE_BLOCK.get());
		generated(OreItems.RAW_HALITE.get());

		generated(OreItems.RAW_OLIVINE.get());
		generated(OreItems.SILICON_INGOT.get());
		generated(OreItems.SILICON_NUGGET.get());
		blockItem(OreItems.OLIVINE_ORE.get());
		blockItem(OreItems.RAW_OLIVINE_BLOCK.get());
		blockItem(OreItems.DEEPSLATE_OLIVINE_ORE.get());
		blockItem(OreItems.SILICON_BLOCK.get());
		
		// Silver Ore -> Silver
		blockItem(OreItems.SILVER_ORE.get());
		blockItem(OreItems.DEEPSLATE_SILVER_ORE.get());
		generated(OreItems.RAW_SILVER.get());
		generated(OreItems.SILVER_INGOT.get());
		blockItem(OreItems.RAW_SILVER_BLOCK.get());
		blockItem(OreItems.SILVER_BLOCK.get());
		
		// Citrine
		
		generated(OreItems.CITRINE.get());
		blockItem(OreItems.NETHERRACK_CITRINE_ORE.get());

		// Aventurine
		
		generated(OreItems.AVENTURINE.get());
		blockItem(OreItems.NETHERRACK_AVENTURINE_ORE.get());
		blockItem(OreItems.AVENTURINE_BLOCK.get());
		blockItem(OreItems.AVENTURINE_BRICKS.get());
		blockItem(OreItems.AVENTURINE_PILLAR.get());
		blockItem(OreItems.AVENTURINE_SLAB.get());
		blockItem(OreItems.AVENTURINE_STAIRS.get());
		blockItem(OreItems.CHISELED_AVENTURINE_BLOCK.get());
		blockItem(OreItems.SMOOTH_AVENTURINE.get());
		blockItem(OreItems.SMOOTH_AVENTURINE_SLAB.get());
		blockItem(OreItems.SMOOTH_AVENTURINE_STAIRS.get());

		// Galena == lead
		
		blockItem(OreItems.GALENA_ORE.get());
		generated(OreItems.LEAD_NUGGET.get());
		generated(OreItems.RAW_GALENA.get());
		generated(OreItems.LEAD_INGOT.get());
		blockItem(OreItems.RAW_GALENA_BLOCK.get());
		blockItem(OreItems.LEAD_BLOCK.get());

		// Black diamond
		
		blockItem(OreItems.RED_SANDSTONE_BLACK_DIAMOND_ORE.get());
		blockItem(OreItems.SANDSTONE_BLACK_DIAMOND_ORE.get());
	}
	
	private void registerTreeModels() {
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
	
	private ItemModelBuilder blockItem(BlockItem item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		return withExistingParent(path, modLoc("block/" + path));
	}

	private ItemModelBuilder blockGenerated(BlockItem item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		ResourceLocation textureLocation = modLoc("block/" + path);
		return withExistingParent(path, mcLoc("item/generated")).texture("layer0", textureLocation);
	}

	private ItemModelBuilder generated(Item item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		ResourceLocation textureLocation = modLoc("item/" + path);
		return withExistingParent(path, mcLoc("item/generated")).texture("layer0", textureLocation);
	}

}
