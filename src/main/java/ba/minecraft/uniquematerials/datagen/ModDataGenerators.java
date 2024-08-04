package ba.minecraft.uniquematerials.datagen;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.ModRegistries;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.datagen.blockstate.OreBlockStateProvider;
import ba.minecraft.uniquematerials.datagen.blockstate.TreeBlockStateProvider;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = UniqueMaterialsMod.MODID, bus = Bus.MOD)
public final class ModDataGenerators {

	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {

		// Get reference to existing file helper.
		ExistingFileHelper exFileHelper = event.getExistingFileHelper();

		// Get reference to running instance of data generator.
		DataGenerator dataGen = event.getGenerator();
		
		// Get reference to pack output.
		PackOutput packOutput = dataGen.getPackOutput();

		// Get reference to Mod lookup provider.
        CompletableFuture<Provider> modLookupProvider = CompletableFuture.supplyAsync(ModRegistries::createLookup, Util.backgroundExecutor());

		// Registration of mod features.
		dataGen.addProvider(event.includeServer(), new ModDatapackBuiltinEntriesProvider(packOutput, modLookupProvider));

		dataGen.addProvider(event.includeClient(), new OreBlockStateProvider(packOutput, exFileHelper));
		dataGen.addProvider(event.includeClient(), new TreeBlockStateProvider(packOutput, exFileHelper));

	}
	
}
