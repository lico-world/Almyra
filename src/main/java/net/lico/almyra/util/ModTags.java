package net.lico.almyra.util;

import net.lico.almyra.Almyra;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
	public static class Blocks
	{
		public static final TagKey<Block> SOUL_TRANSFORMABLE =
				createTag("soul_transformable");

		public static final TagKey<Block> SOUL_SCYTHE_MINEABLE =
				createTag("soul_scythe_mineable");

		private static TagKey<Block> createTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, new Identifier(Almyra.MOD_ID, name));
		}
	}

	public static class Items
	{
		private static TagKey<Item> createTag(String name) {
			return TagKey.of(RegistryKeys.ITEM, new Identifier(Almyra.MOD_ID, name));
		}
	}
}