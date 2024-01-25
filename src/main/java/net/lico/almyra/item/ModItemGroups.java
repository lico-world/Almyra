package net.lico.almyra.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lico.almyra.Almyra;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
	public static final ItemGroup PROJECT_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(Almyra.MOD_ID, "project"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.project"))
					.icon(() -> new ItemStack(ModItems.NORMAL_SOUL)).entries((displayContext, entries) -> {
						entries.add(ModItems.NORMAL_SOUL);
					}).build());
	public static void registerItemGroups()
	{
		Almyra.LOGGER.info("Registering Item Groups for " + Almyra.MOD_ID);
	}
}
