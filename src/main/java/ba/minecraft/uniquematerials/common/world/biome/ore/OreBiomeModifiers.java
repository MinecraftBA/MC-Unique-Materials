package ba.minecraft.uniquematerials.common.world.biome.ore;

import ba.minecraft.uniquematerials.common.helpers.biome.ModBiomeModifierHelper;
import ba.minecraft.uniquematerials.common.world.feature.ore.OrePlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;

public final class OreBiomeModifiers {
	
	private OreBiomeModifiers() {}
	
    public static final ResourceKey<BiomeModifier> ADD_RUTILE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_rutile_ore");

    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_RUTILE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_deepslate_rutile_ore");

    public static final ResourceKey<BiomeModifier> ADD_BAUXITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_bauxite_ore");

    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_BAUXITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_deepslate_bauxite_ore");

    public static final ResourceKey<BiomeModifier> ADD_SANDSTONE_HALITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_sandstone_halite_ore");

    public static final ResourceKey<BiomeModifier> ADD_RED_SANDSTONE_HALITE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_red_sandstone_halite_ore");

    public static final ResourceKey<BiomeModifier> ADD_OLIVINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_olivine_ore");

    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_OLIVINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_deepslate_olivine_ore");

    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_silver_ore");

    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_SILVER_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_deepslate_silver_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHERRACK_CITRINE_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_netherrack_citrine_ore");

    public static final ResourceKey<BiomeModifier> ADD_GALENA_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_galena_ore");
    
    public static final ResourceKey<BiomeModifier> ADD_SANDSTONE_BLACK_DIAMOND_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_sandstone_black_diamond_ore");

    public static final ResourceKey<BiomeModifier> ADD_RED_SANDSTONE_BLACK_DIAMOND_ORE = 
    		ModBiomeModifierHelper.createResourceKey("add_red_sandstone_black_diamond_ore");

    
    public static void bootstrap(BootstrapContext<BiomeModifier> context) { 
    	
        HolderGetter<PlacedFeature> placedFeaturesGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomesGetter = context.lookup(Registries.BIOME);

        context.register(ADD_RUTILE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        		biomesGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeaturesGetter.getOrThrow(OrePlacedFeatures.RUTILE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    	
    }
}
