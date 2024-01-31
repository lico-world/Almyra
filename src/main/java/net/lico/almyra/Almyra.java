package net.lico.almyra;

import net.fabricmc.api.ModInitializer;

import net.lico.almyra.block.ModBlocks;
import net.lico.almyra.block.entity.ModBlockEntities;
import net.lico.almyra.item.ModItemGroups;
import net.lico.almyra.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Almyra implements ModInitializer
{
	public static final String MOD_ID = "almyra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Almyra Project Initialisation...");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}