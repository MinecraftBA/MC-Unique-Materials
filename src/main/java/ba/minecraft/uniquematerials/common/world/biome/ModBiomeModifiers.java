package ba.minecraft.uniquematerials.common.world.biome;

import ba.minecraft.uniquematerials.common.world.biome.ore.OreBiomeModifiers;
import ba.minecraft.uniquematerials.common.world.biome.tree.TreeBiomeModifiers;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraftforge.common.world.BiomeModifier;

public final class ModBiomeModifiers {

	private ModBiomeModifiers() {}
	
	public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		
		OreBiomeModifiers.bootstrap(context);
		TreeBiomeModifiers.bootstrap(context);
		
    }
}
