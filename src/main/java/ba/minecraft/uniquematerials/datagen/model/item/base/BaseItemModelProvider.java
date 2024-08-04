package ba.minecraft.uniquematerials.datagen.model.item.base;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BaseItemModelProvider extends ItemModelProvider {

	public BaseItemModelProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, UniqueMaterialsMod.MODID, exFileHelper);
	}
	
	protected ItemModelBuilder blockItem(BlockItem item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		return withExistingParent(path, modLoc("block/" + path));
	}

	protected ItemModelBuilder blockGenerated(BlockItem item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		ResourceLocation textureLocation = modLoc("block/" + path);
		return withExistingParent(path, mcLoc("item/generated")).texture("layer0", textureLocation);
	}

	protected ItemModelBuilder generated(Item item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		ResourceLocation textureLocation = modLoc("item/" + path);
		return withExistingParent(path, mcLoc("item/generated")).texture("layer0", textureLocation);
	}

	protected ItemModelBuilder spawnEgg(Item item) {
		ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
		String path = registryName.getPath();
		return withExistingParent(path, mcLoc("item/template_spawn_egg"));
	}

}

