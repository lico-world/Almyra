package net.lico.almyra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider
{
	public ModModelProvider(FabricDataOutput output)
	{
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
	{
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_DUST_BLOCK);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator)
	{
		itemModelGenerator.register(ModItems.NORMAL_SOUL, Models.GENERATED);
		itemModelGenerator.register(ModItems.SOUL_SCYTHE, Models.GENERATED);
	}
}
