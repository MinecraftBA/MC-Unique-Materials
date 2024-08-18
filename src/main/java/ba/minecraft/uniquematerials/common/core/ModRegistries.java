package ba.minecraft.uniquematerials.common.core;

import ba.minecraft.uniquematerials.common.world.biome.ModBiomeModifiers;
import ba.minecraft.uniquematerials.common.world.feature.ModConfiguredFeatures;
import ba.minecraft.uniquematerials.common.world.feature.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.data.worldgen.biome.BiomeData;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModRegistries {

	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(Registries.BIOME, BiomeData::bootstrap) // Mod Placed/Configured features requirement
	        .add(Registries.CONFIGURED_CARVER, Carvers::bootstrap) // Biome requirement
	        .add(Registries.PROCESSOR_LIST, ProcessorLists::bootstrap) // Biome requirement
			.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
			.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    
    public static HolderLookup.Provider createLookup() {
        RegistryAccess.Frozen frozenRegistryAccess = RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY);
        HolderLookup.Provider lookupProvider = BUILDER.build(frozenRegistryAccess);
        return lookupProvider;
    }
    
}
