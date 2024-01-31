package net.lico.almyra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
	public ModLootTableProvider(FabricDataOutput dataOutput)
	{
		super(dataOutput);
	}

	@Override
	public void generate()
	{
		addDrop(ModBlocks.SOUL_DUST_BLOCK, drops(ModItems.NORMAL_SOUL));
	}
}
