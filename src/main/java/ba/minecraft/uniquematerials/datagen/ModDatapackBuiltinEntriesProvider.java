package ba.minecraft.uniquematerials.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.ModRegistries;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

public final class ModDatapackBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {

	public ModDatapackBuiltinEntriesProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries, ModRegistries.BUILDER, Set.of(UniqueMaterialsMod.MODID));
	}

}
