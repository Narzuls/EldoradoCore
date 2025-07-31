
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
import net.mcreator.eldoradocore.block.PureUnoctaniumOreBlock;
import net.mcreator.eldoradocore.block.PureUnoctaniumBlockBlock;
import net.mcreator.eldoradocore.block.ObscuriteOreBlock;
import net.mcreator.eldoradocore.block.ObscuriteBlockBlock;
import net.mcreator.eldoradocore.block.KyburnOreBlock;
import net.mcreator.eldoradocore.block.KyburnBlockBlock;
import net.mcreator.eldoradocore.block.EldoradoStoneBlock;
import net.mcreator.eldoradocore.block.EldoradoSandstoneRefinedBlock;
import net.mcreator.eldoradocore.block.EldoradoSandStoneBlock;
import net.mcreator.eldoradocore.block.EldoradoSandBlock;
import net.mcreator.eldoradocore.block.EldoradoGravelBlock;
import net.mcreator.eldoradocore.block.EldoradoDustBlock;
import net.mcreator.eldoradocore.block.EldoradoDeepslateCobblestoneBlock;
import net.mcreator.eldoradocore.block.EldoradoDeepslateBlock;
import net.mcreator.eldoradocore.block.EldoradoCobblestoneBlock;
import net.mcreator.eldoradocore.block.EldoradiumOreBlock;
import net.mcreator.eldoradocore.block.EldoradiumGemOreBlock;
import net.mcreator.eldoradocore.block.EldoradiumGemBlockBlock;
import net.mcreator.eldoradocore.block.EldoradiumBlockBlock;
import net.mcreator.eldoradocore.block.AbyssaliumOreBlock;
import net.mcreator.eldoradocore.block.AbyssaliumBlockBlock;
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
	public static final RegistryObject<Block> ELDORADO_SAND_STONE = REGISTRY.register("eldorado_sand_stone", () -> new EldoradoSandStoneBlock());
	public static final RegistryObject<Block> ELDORADO_SAND = REGISTRY.register("eldorado_sand", () -> new EldoradoSandBlock());
	public static final RegistryObject<Block> ABYSSALIUM_ORE = REGISTRY.register("abyssalium_ore", () -> new AbyssaliumOreBlock());
	public static final RegistryObject<Block> ABYSSALIUM_BLOCK = REGISTRY.register("abyssalium_block", () -> new AbyssaliumBlockBlock());
	public static final RegistryObject<Block> PURE_UNOCTANIUM_ORE = REGISTRY.register("pure_unoctanium_ore", () -> new PureUnoctaniumOreBlock());
	public static final RegistryObject<Block> PURE_UNOCTANIUM_BLOCK = REGISTRY.register("pure_unoctanium_block", () -> new PureUnoctaniumBlockBlock());
	public static final RegistryObject<Block> KYBURN_ORE = REGISTRY.register("kyburn_ore", () -> new KyburnOreBlock());
	public static final RegistryObject<Block> KYBURN_BLOCK = REGISTRY.register("kyburn_block", () -> new KyburnBlockBlock());
	public static final RegistryObject<Block> ELDORADO_STONE = REGISTRY.register("eldorado_stone", () -> new EldoradoStoneBlock());
	public static final RegistryObject<Block> ELDORADO_DEEPSLATE = REGISTRY.register("eldorado_deepslate", () -> new EldoradoDeepslateBlock());
	public static final RegistryObject<Block> ELDORADO_SANDSTONE_REFINED = REGISTRY.register("eldorado_sandstone_refined", () -> new EldoradoSandstoneRefinedBlock());
	public static final RegistryObject<Block> ELDORADO_COBBLESTONE = REGISTRY.register("eldorado_cobblestone", () -> new EldoradoCobblestoneBlock());
	public static final RegistryObject<Block> ELDORADO_DEEPSLATE_COBBLESTONE = REGISTRY.register("eldorado_deepslate_cobblestone", () -> new EldoradoDeepslateCobblestoneBlock());
	public static final RegistryObject<Block> ELDORADO_DUST = REGISTRY.register("eldorado_dust", () -> new EldoradoDustBlock());
	public static final RegistryObject<Block> ELDORADO_GRAVEL = REGISTRY.register("eldorado_gravel", () -> new EldoradoGravelBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
