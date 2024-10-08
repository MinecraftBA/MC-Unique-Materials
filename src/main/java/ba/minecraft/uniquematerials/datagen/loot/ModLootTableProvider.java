package ba.minecraft.uniquematerials.datagen.loot;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.google.common.collect.ImmutableList;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public final class ModLootTableProvider extends LootTableProvider {

	private static final List<SubProviderEntry> LOOT_TABLES = 
		ImmutableList.of(
			new SubProviderEntry(OreBlockLootSubProvider::new, LootContextParamSets.BLOCK),
			new SubProviderEntry(TreeBlockLootSubProvider::new, LootContextParamSets.BLOCK)
		);
	
	public ModLootTableProvider(PackOutput packOutput, CompletableFuture<Provider> provider) {
		super(packOutput, Set.of(), LOOT_TABLES, provider);
	}

}
