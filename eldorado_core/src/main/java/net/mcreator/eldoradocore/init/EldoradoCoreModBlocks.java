
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eldoradocore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.eldoradocore.block.ZultiumOreBlock;
import net.mcreator.eldoradocore.block.ZultiumBlockBlock;
import net.mcreator.eldoradocore.block.VerdoriumOreBlock;
import net.mcreator.eldoradocore.block.VerdoriumBlockBlock;
import net.mcreator.eldoradocore.block.UnoctaniumOreBlock;
import net.mcreator.eldoradocore.block.UnoctaniumBlockBlock;
import net.mcreator.eldoradocore.block.ObscuriteOreBlock;
import net.mcreator.eldoradocore.block.ObscuriteBlockBlock;
import net.mcreator.eldoradocore.block.EldoradiumOreBlock;
import net.mcreator.eldoradocore.block.EldoradiumGemOreBlock;
import net.mcreator.eldoradocore.block.EldoradiumGemBlockBlock;
import net.mcreator.eldoradocore.block.EldoradiumBlockBlock;
import net.mcreator.eldoradocore.EldoradoCoreMod;

public class EldoradoCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EldoradoCoreMod.MODID);
	public static final RegistryObject<Block> ELDORADIUM_GEM_ORE = REGISTRY.register("eldoradium_gem_ore", () -> new EldoradiumGemOreBlock());
	public static final RegistryObject<Block> ELDORADIUM_GEM_BLOCK = REGISTRY.register("eldoradium_gem_block", () -> new EldoradiumGemBlockBlock());
	public static final RegistryObject<Block> ELDORADIUM_ORE = REGISTRY.register("eldoradium_ore", () -> new EldoradiumOreBlock());
	public static final RegistryObject<Block> ELDORADIUM_BLOCK = REGISTRY.register("eldoradium_block", () -> new EldoradiumBlockBlock());
	public static final RegistryObject<Block> OBSCURITE_ORE = REGISTRY.register("obscurite_ore", () -> new ObscuriteOreBlock());
	public static final RegistryObject<Block> OBSCURITE_BLOCK = REGISTRY.register("obscurite_block", () -> new ObscuriteBlockBlock());
	public static final RegistryObject<Block> UNOCTANIUM_ORE = REGISTRY.register("unoctanium_ore", () -> new UnoctaniumOreBlock());
	public static final RegistryObject<Block> UNOCTANIUM_BLOCK = REGISTRY.register("unoctanium_block", () -> new UnoctaniumBlockBlock());
	public static final RegistryObject<Block> VERDORIUM_ORE = REGISTRY.register("verdorium_ore", () -> new VerdoriumOreBlock());
	public static final RegistryObject<Block> VERDORIUM_BLOCK = REGISTRY.register("verdorium_block", () -> new VerdoriumBlockBlock());
	public static final RegistryObject<Block> ZULTIUM_ORE = REGISTRY.register("zultium_ore", () -> new ZultiumOreBlock());
	public static final RegistryObject<Block> ZULTIUM_BLOCK = REGISTRY.register("zultium_block", () -> new ZultiumBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
