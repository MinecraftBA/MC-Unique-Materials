package ba.minecraft.uniquematerials.common.helpers.resource;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.resources.ResourceLocation;

public final class ModResourceHelper {

	public static ResourceLocation create(String path) {
		return ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path);
	}
	
}
