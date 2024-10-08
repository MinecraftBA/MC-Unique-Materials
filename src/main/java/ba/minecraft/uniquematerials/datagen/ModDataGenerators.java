package ba.minecraft.uniquematerials.datagen;

import java.util.concurrent.CompletableFuture;

import ba.minecraft.uniquematerials.common.core.ModRegistries;
import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import ba.minecraft.uniquematerials.datagen.tag.ModBlockTagsProvider;
import ba.minecraft.uniquematerials.datagen.tag.ModItemTagsProvider;
import ba.minecraft.uniquematerials.datagen.recipe.ModRecipeProvider;
import ba.minecraft.uniquematerials.datagen.blockstate.ModBlockStateProvider;
import ba.minecraft.uniquematerials.datagen.lang.EnUsLanguageProvider;
import ba.minecraft.uniquematerials.datagen.loot.ModLootTableProvider;
import ba.minecraft.uniquematerials.datagen.model.ModItemModelProvider;
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
		ExistingFileHelper fileHelper = event.getExistingFileHelper();

		// Get reference to running instance of data generator.
		DataGenerator generator = event.getGenerator();
		
		// Get reference to pack output.
		PackOutput packOutput = generator.getPackOutput();

		// Get reference to Mod lookup provider.
        CompletableFuture<Provider> provider = CompletableFuture.supplyAsync(ModRegistries::createLookup, Util.backgroundExecutor());

        // Registration of recipe providers.
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, provider));
        
        // Registration of loot table.
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput, provider));

		// Registration of mod features.
		generator.addProvider(event.includeServer(), new ModDatapackBuiltinEntriesProvider(packOutput, provider));
		
        ModBlockTagsProvider modBlockTagsProvider = new ModBlockTagsProvider(packOutput, provider, fileHelper);
        generator.addProvider(event.includeServer(), modBlockTagsProvider);

        // Registration of item tags providers.
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, provider, modBlockTagsProvider.contentsGetter(), fileHelper));

        // Blockstate providers
		generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, fileHelper));

		// Item model providers
		generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, fileHelper));
		
		// Language provider
		generator.addProvider(event.includeClient(), new EnUsLanguageProvider(packOutput));


	}
	
}
