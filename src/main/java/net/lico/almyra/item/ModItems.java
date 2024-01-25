package net.lico.almyra.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lico.almyra.Almyra;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
	public static final Item NORMAL_SOUL = registerItem("normal_soul", new Item(new FabricItemSettings()));

	private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries)
	{
		entries.add(NORMAL_SOUL);
	}

	private static Item registerItem(String name, Item item)
	{
		return Registry.register(Registries.ITEM, new Identifier(Almyra.MOD_ID, name), item);
	}

	public static void registerModItems()
	{
		Almyra.LOGGER.info("Registering Mod Items for " + Almyra.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
	}
}
