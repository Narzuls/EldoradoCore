
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

import net.mcreator.eldoradocore.item.ZultiumOreChunkItem;
import net.mcreator.eldoradocore.item.ZultiumIngotItem;
import net.mcreator.eldoradocore.item.VibraniumIngotItem;
import net.mcreator.eldoradocore.item.VerdoriumOreChunkItem;
import net.mcreator.eldoradocore.item.VerdoriumIngotItem;
import net.mcreator.eldoradocore.item.UnoctaniumOreChunkItem;
import net.mcreator.eldoradocore.item.UnoctaniumIngotItem;
import net.mcreator.eldoradocore.item.UnoctaniumDustItem;
import net.mcreator.eldoradocore.item.UltomathiumBarItem;
import net.mcreator.eldoradocore.item.RawZultiumItem;
import net.mcreator.eldoradocore.item.RawVerdoriumItem;
import net.mcreator.eldoradocore.item.RawUnoctaniumItem;
import net.mcreator.eldoradocore.item.RawObscuriteItem;
import net.mcreator.eldoradocore.item.RawEldoradiumItem;
import net.mcreator.eldoradocore.item.ObscutaniumSwordItem;
import net.mcreator.eldoradocore.item.ObscutaniumShovelItem;
import net.mcreator.eldoradocore.item.ObscutaniumPickaxeItem;
import net.mcreator.eldoradocore.item.ObscutaniumHoeItem;
import net.mcreator.eldoradocore.item.ObscutaniumHavocIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumFluxIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumEmberIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumDreadIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumCrimsonIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumBasiliskIngotItem;
import net.mcreator.eldoradocore.item.ObscutaniumAxeItem;
import net.mcreator.eldoradocore.item.ObscutaniumAlphaIngotItem;
import net.mcreator.eldoradocore.item.ObscuriteOreChunkItem;
import net.mcreator.eldoradocore.item.ObscuriteIngotItem;
import net.mcreator.eldoradocore.item.ObscuriteDustItem;
import net.mcreator.eldoradocore.item.EldoradiumOreChunkItem;
import net.mcreator.eldoradocore.item.EldoradiumIngotItem;
import net.mcreator.eldoradocore.item.EldoradiumGemItem;
import net.mcreator.eldoradocore.item.EldoradiumDustItem;
import net.mcreator.eldoradocore.item.EldoniumIngotItem;
import net.mcreator.eldoradocore.EldoradoCoreMod;

public class EldoradoCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EldoradoCoreMod.MODID);
	public static final RegistryObject<Item> ELDORADIUM_GEM_BLOCK = block(EldoradoCoreModBlocks.ELDORADIUM_GEM_BLOCK);
	public static final RegistryObject<Item> ELDORADIUM_GEM_ORE = block(EldoradoCoreModBlocks.ELDORADIUM_GEM_ORE);
	public static final RegistryObject<Item> ELDORADIUM_GEM = REGISTRY.register("eldoradium_gem", () -> new EldoradiumGemItem());
	public static final RegistryObject<Item> ELDORADIUM_ORE = block(EldoradoCoreModBlocks.ELDORADIUM_ORE);
	public static final RegistryObject<Item> ELDORADIUM_BLOCK = block(EldoradoCoreModBlocks.ELDORADIUM_BLOCK);
	public static final RegistryObject<Item> ELDORADIUM_INGOT = REGISTRY.register("eldoradium_ingot", () -> new EldoradiumIngotItem());
	public static final RegistryObject<Item> RAW_ELDORADIUM = REGISTRY.register("raw_eldoradium", () -> new RawEldoradiumItem());
	public static final RegistryObject<Item> ELDORADIUM_ORE_CHUNK = REGISTRY.register("eldoradium_ore_chunk", () -> new EldoradiumOreChunkItem());
	public static final RegistryObject<Item> OBSCURITE_ORE = block(EldoradoCoreModBlocks.OBSCURITE_ORE);
	public static final RegistryObject<Item> OBSCURITE_BLOCK = block(EldoradoCoreModBlocks.OBSCURITE_BLOCK);
	public static final RegistryObject<Item> OBSCURITE_INGOT = REGISTRY.register("obscurite_ingot", () -> new ObscuriteIngotItem());
	public static final RegistryObject<Item> OBSCURITE_ORE_CHUNK = REGISTRY.register("obscurite_ore_chunk", () -> new ObscuriteOreChunkItem());
	public static final RegistryObject<Item> RAW_OBSCURITE = REGISTRY.register("raw_obscurite", () -> new RawObscuriteItem());
	public static final RegistryObject<Item> UNOCTANIUM_ORE = block(EldoradoCoreModBlocks.UNOCTANIUM_ORE);
	public static final RegistryObject<Item> UNOCTANIUM_BLOCK = block(EldoradoCoreModBlocks.UNOCTANIUM_BLOCK);
	public static final RegistryObject<Item> UNOCTANIUM_INGOT = REGISTRY.register("unoctanium_ingot", () -> new UnoctaniumIngotItem());
	public static final RegistryObject<Item> RAW_UNOCTANIUM = REGISTRY.register("raw_unoctanium", () -> new RawUnoctaniumItem());
	public static final RegistryObject<Item> UNOCTANIUM_ORE_CHUNK = REGISTRY.register("unoctanium_ore_chunk", () -> new UnoctaniumOreChunkItem());
	public static final RegistryObject<Item> UNOCTANIUM_DUST = REGISTRY.register("unoctanium_dust", () -> new UnoctaniumDustItem());
	public static final RegistryObject<Item> OBSCURITE_DUST = REGISTRY.register("obscurite_dust", () -> new ObscuriteDustItem());
	public static final RegistryObject<Item> ELDORADIUM_DUST = REGISTRY.register("eldoradium_dust", () -> new EldoradiumDustItem());
	public static final RegistryObject<Item> RAW_VERDORIUM = REGISTRY.register("raw_verdorium", () -> new RawVerdoriumItem());
	public static final RegistryObject<Item> VERDORIUM_ORE_CHUNK = REGISTRY.register("verdorium_ore_chunk", () -> new VerdoriumOreChunkItem());
	public static final RegistryObject<Item> VERDORIUM_ORE = block(EldoradoCoreModBlocks.VERDORIUM_ORE);
	public static final RegistryObject<Item> VERDORIUM_BLOCK = block(EldoradoCoreModBlocks.VERDORIUM_BLOCK);
	public static final RegistryObject<Item> VERDORIUM_INGOT = REGISTRY.register("verdorium_ingot", () -> new VerdoriumIngotItem());
	public static final RegistryObject<Item> ZULTIUM_ORE = block(EldoradoCoreModBlocks.ZULTIUM_ORE);
	public static final RegistryObject<Item> ZULTIUM_BLOCK = block(EldoradoCoreModBlocks.ZULTIUM_BLOCK);
	public static final RegistryObject<Item> ZULTIUM_INGOT = REGISTRY.register("zultium_ingot", () -> new ZultiumIngotItem());
	public static final RegistryObject<Item> ZULTIUM_ORE_CHUNK = REGISTRY.register("zultium_ore_chunk", () -> new ZultiumOreChunkItem());
	public static final RegistryObject<Item> RAW_ZULTIUM = REGISTRY.register("raw_zultium", () -> new RawZultiumItem());
	public static final RegistryObject<Item> OBSCUTANIUM_BASILISK_INGOT = REGISTRY.register("obscutanium_basilisk_ingot", () -> new ObscutaniumBasiliskIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_ALPHA_INGOT = REGISTRY.register("obscutanium_alpha_ingot", () -> new ObscutaniumAlphaIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_CRIMSON_INGOT = REGISTRY.register("obscutanium_crimson_ingot", () -> new ObscutaniumCrimsonIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_DREAD_INGOT = REGISTRY.register("obscutanium_dread_ingot", () -> new ObscutaniumDreadIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_EMBER_INGOT = REGISTRY.register("obscutanium_ember_ingot", () -> new ObscutaniumEmberIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_FLUX_INGOT = REGISTRY.register("obscutanium_flux_ingot", () -> new ObscutaniumFluxIngotItem());
	public static final RegistryObject<Item> OBSCUTANIUM_HAVOC_INGOT = REGISTRY.register("obscutanium_havoc_ingot", () -> new ObscutaniumHavocIngotItem());
	public static final RegistryObject<Item> VIBRANIUM_INGOT = REGISTRY.register("vibranium_ingot", () -> new VibraniumIngotItem());
	public static final RegistryObject<Item> ELDONIUM_INGOT = REGISTRY.register("eldonium_ingot", () -> new EldoniumIngotItem());
	public static final RegistryObject<Item> ULTOMATHIUM_BAR = REGISTRY.register("ultomathium_bar", () -> new UltomathiumBarItem());
	public static final RegistryObject<Item> OBSCUTANIUM_AXE = REGISTRY.register("obscutanium_axe", () -> new ObscutaniumAxeItem());
	public static final RegistryObject<Item> OBSCUTANIUM_PICKAXE = REGISTRY.register("obscutanium_pickaxe", () -> new ObscutaniumPickaxeItem());
	public static final RegistryObject<Item> OBSCUTANIUM_SWORD = REGISTRY.register("obscutanium_sword", () -> new ObscutaniumSwordItem());
	public static final RegistryObject<Item> OBSCUTANIUM_SHOVEL = REGISTRY.register("obscutanium_shovel", () -> new ObscutaniumShovelItem());
	public static final RegistryObject<Item> OBSCUTANIUM_HOE = REGISTRY.register("obscutanium_hoe", () -> new ObscutaniumHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
