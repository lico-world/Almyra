package net.lico.almyra.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lico.almyra.Almyra;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
	public static final Block SOUL_DUST_BLOCK = registerBlock("soul_dust_block",
			new Block(FabricBlockSettings.copyOf(Blocks.SAND).requiresTool()));

	private static Block registerBlock(String name, Block block)
	{
		registerBlockItems(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(Almyra.MOD_ID, name), block);
	}

	private static Item registerBlockItems(String name, Block block)
	{
		return Registry.register(Registries.ITEM, new Identifier(Almyra.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void registerModBlocks()
	{
		Almyra.LOGGER.info("Registering ModBlocks for " + Almyra.MOD_ID);
	}
}

