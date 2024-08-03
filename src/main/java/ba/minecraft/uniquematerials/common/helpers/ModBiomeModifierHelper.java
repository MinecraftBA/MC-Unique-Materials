package ba.minecraft.uniquematerials.common.helpers;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBiomeModifierHelper {

	private ModBiomeModifierHelper() {}
	
	public static ResourceKey<BiomeModifier> createResourceKey(String path) {
    	return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, path));
    }
}
