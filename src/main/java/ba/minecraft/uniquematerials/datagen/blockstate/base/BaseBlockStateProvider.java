package ba.minecraft.uniquematerials.datagen.blockstate.base;

import ba.minecraft.uniquematerials.common.core.UniqueMaterialsMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BaseBlockStateProvider extends BlockStateProvider {

    protected final ExistingFileHelper exFileHelper;

	public BaseBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
		super(packOutput, UniqueMaterialsMod.MODID, exFileHelper);
		this.exFileHelper = exFileHelper;
	}

	protected String getRenderTypeName(RenderType renderType) {
		String renderTypeName = renderType.toString().replace("RenderType[", "");
		int colonPosition = renderTypeName.indexOf(':');
		renderTypeName = renderTypeName.substring(0, colonPosition);
		return renderTypeName;
	}
	
	protected String cutout() {
		return getRenderTypeName(RenderType.cutout());
	}

	protected void simpleLeveledBlock(Block block, IntegerProperty property) {

        // Get builder for block state with variants.
        VariantBlockStateBuilder variantBuilder = getVariantBuilder(block);
        
        // Get resource location for block.
        ResourceLocation blockResLoc = ForgeRegistries.BLOCKS.getKey(block);
        
        // Get resource location path for block.
        String blockResPath = blockResLoc.getPath();
        
        // Get maximum value for property.
        int maxValue = property.getAllValues()
        		.mapToInt(v -> v.value())
        		.max()
        		.getAsInt();
        
        // Iterate through all possible values.
        for(int j = 0; j <= maxValue; j ++) {

    		// Create default model path.
    		String resPath = "block/" + blockResPath + "_" + j;
    		
    		// Create resource location to JSON model file.
            ResourceLocation resLoc = ResourceLocation.fromNamespaceAndPath(UniqueMaterialsMod.MODID, resPath);
            
            // Create cube blocks.
            BlockModelBuilder model = models().cubeAll(resPath, resLoc);
            
            // Generate block state.
            variantBuilder.partialState() // Create partial state
                          .with(property, j) // That matches age step
                          .modelForState() // Start building model for that variant
                          .modelFile(model) // Use existing model
                          .addModel(); // Complete model
        	
        }
    }
}