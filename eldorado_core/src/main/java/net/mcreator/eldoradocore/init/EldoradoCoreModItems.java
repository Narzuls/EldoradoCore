
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eldoradocore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eldoradocore.item.VerdoriumOreChunkItem;
import net.mcreator.eldoradocore.item.VerdoriumIngotItem;
import net.mcreator.eldoradocore.item.UnoctaniumOreChunkItem;
import net.mcreator.eldoradocore.item.UnoctaniumIngotItem;
import net.mcreator.eldoradocore.item.RawVerdoriumItem;
import net.mcreator.eldoradocore.item.RawUnoctaniumItem;
import net.mcreator.eldoradocore.item.RawObscuriteItem;
import net.mcreator.eldoradocore.item.RawEldoradiumItem;
import net.mcreator.eldoradocore.item.ObscuriteOreChunkItem;
import net.mcreator.eldoradocore.item.ObscuriteIngotItem;
import net.mcreator.eldoradocore.item.EldoradiumOreChunkItem;
import net.mcreator.eldoradocore.item.EldoradiumIngotItem;
import net.mcreator.eldoradocore.item.EldoradiumGemItem;
import net.mcreator.eldoradocore.EldoradoCoreMod;

public class EldoradoCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EldoradoCoreMod.MODID);
	public static final RegistryObject<Item> ELDORADIUM_GEM_BLOCK = block(EldoradoCoreModBlocks.ELDORADIUM_GEM_BLOCK);
	public static final RegistryObject<Item> ELDORADIUM_GEM_ORE = block(EldoradoCoreModBlocks.ELDORADIUM_GEM_ORE);
	public static final RegistryObject<Item> ELDORADIUM_GEM = REGISTRY.register("eldoradium_gem", () -> new EldoradiumGemItem());
	public static final RegistryObject<Item> ELDORADIUM_ORE = block(EldoradoCoreModBlocks.ELDORADIUM_ORE);
	public static final RegistryObject<Item> ELDORADIUM_BLOCK = block(EldoradoCoreModBlocks.ELDORADIUM_BLOCK);
	public static final RegistryObject<Item> ELDORADIUM_CHUNK = REGISTRY.register("eldoradium_chunk", () -> new EldoradiumIngotItem());
	public static final RegistryObject<Item> RAW_ELDORADIUM = REGISTRY.register("raw_eldoradium", () -> new RawEldoradiumItem());
	public static final RegistryObject<Item> ELDORADIUM_ORE_CHUNK = REGISTRY.register("eldoradium_ore_chunk", () -> new EldoradiumOreChunkItem());
	public static final RegistryObject<Item> OBSCURITE_ORE = block(EldoradoCoreModBlocks.OBSCURITE_ORE);
	public static final RegistryObject<Item> OBSCURITE_BLOCK = block(EldoradoCoreModBlocks.OBSCURITE_BLOCK);
	public static final RegistryObject<Item> OBSCURITE_INGOT = REGISTRY.register("obscurite_ingot", () -> new ObscuriteIngotItem());
	public static final RegistryObject<Item> RAW_OBSCURITE = REGISTRY.register("raw_obscurite", () -> new RawObscuriteItem());
	public static final RegistryObject<Item> OBSCURITE_ORE_CHUNK = REGISTRY.register("obscurite_ore_chunk", () -> new ObscuriteOreChunkItem());
	public static final RegistryObject<Item> VERDORIUM_ORE = block(EldoradoCoreModBlocks.VERDORIUM_ORE);
	public static final RegistryObject<Item> VERDORIUM_BLOCK = block(EldoradoCoreModBlocks.VERDORIUM_BLOCK);
	public static final RegistryObject<Item> VERDORIUM_INGOT = REGISTRY.register("verdorium_ingot", () -> new VerdoriumIngotItem());
	public static final RegistryObject<Item> RAW_VERDORIUM = REGISTRY.register("raw_verdorium", () -> new RawVerdoriumItem());
	public static final RegistryObject<Item> VERDORIUM_ORE_CHUNK = REGISTRY.register("verdorium_ore_chunk", () -> new VerdoriumOreChunkItem());
	public static final RegistryObject<Item> UNOCTANIUM_ORE = block(EldoradoCoreModBlocks.UNOCTANIUM_ORE);
	public static final RegistryObject<Item> UNOCTANIUM_BLOCK = block(EldoradoCoreModBlocks.UNOCTANIUM_BLOCK);
	public static final RegistryObject<Item> UNOCTANIUM_INGOT = REGISTRY.register("unoctanium_ingot", () -> new UnoctaniumIngotItem());
	public static final RegistryObject<Item> RAW_UNOCTANIUM = REGISTRY.register("raw_unoctanium", () -> new RawUnoctaniumItem());
	public static final RegistryObject<Item> UNOCTANIUM_ORE_CHUNK = REGISTRY.register("unoctanium_ore_chunk", () -> new UnoctaniumOreChunkItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
