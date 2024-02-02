package net.lico.almyra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg)
	{
		getOrCreateTagBuilder(ModTags.Blocks.SOUL_SCYTHE_MINEABLE)
				.add(ModBlocks.SOUL_DUST_BLOCK);

		getOrCreateTagBuilder(ModTags.Blocks.SOUL_TRANSFORMABLE)
				.add(Blocks.OAK_LOG);
	}
}
