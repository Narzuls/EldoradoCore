
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eldoradocore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.eldoradocore.EldoradoCoreMod;

public class EldoradoCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EldoradoCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> ELDORADO_CORE = REGISTRY.register("eldorado_core",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.eldorado_core.eldorado_core")).icon(() -> new ItemStack(EldoradoCoreModBlocks.ELDORADIUM_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_GEM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_GEM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_GEM.get());
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.RAW_ELDORADIUM.get());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.OBSCURITE_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.OBSCURITE_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModItems.RAW_OBSCURITE.get());
				tabData.accept(EldoradoCoreModBlocks.UNOCTANIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.UNOCTANIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.UNOCTANIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.RAW_UNOCTANIUM.get());
				tabData.accept(EldoradoCoreModItems.UNOCTANIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModItems.UNOCTANIUM_DUST.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_DUST.get());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_DUST.get());
				tabData.accept(EldoradoCoreModItems.RAW_VERDORIUM.get());
				tabData.accept(EldoradoCoreModItems.VERDORIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.VERDORIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.VERDORIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.VERDORIUM_INGOT.get());
				tabData.accept(EldoradoCoreModBlocks.ZULTIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ZULTIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.ZULTIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.ZULTIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModItems.RAW_ZULTIUM.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_BASILISK_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_ALPHA_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_CRIMSON_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_DREAD_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_EMBER_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_FLUX_INGOT.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_INGOT.get());
				tabData.accept(EldoradoCoreModItems.VIBRANIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.ELDONIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.ULTOMATHIUM_BAR.get());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_SAND_STONE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_SAND.get().asItem());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_INGOT.get());
				tabData.accept(EldoradoCoreModBlocks.ABYSSALIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ABYSSALIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_ABYSSALIUM.get());
				tabData.accept(EldoradoCoreModItems.PURE_UNOCTANIUM_INGOT.get());
				tabData.accept(EldoradoCoreModBlocks.PURE_UNOCTANIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.PURE_UNOCTANIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_PURE_UNOCTANIUM.get());
				tabData.accept(EldoradoCoreModItems.PURE_UNOCTANIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModItems.PURE_UNOCTANIUM_DUST.get());
				tabData.accept(EldoradoCoreModItems.KYBURN_INGOT.get());
				tabData.accept(EldoradoCoreModBlocks.KYBURN_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.KYBURN_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_KYBURN.get());
				tabData.accept(EldoradoCoreModItems.KYBURN_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_STONE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_DEEPSLATE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_SANDSTONE_REFINED.get().asItem());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_AZURE_INGOT.get());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_COBBLESTONE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_DEEPSLATE_COBBLESTONE.get().asItem());
				tabData.accept(EldoradoCoreModItems.VIBRANT_UNOCTANIUM_SWORD.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_SWORD.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_AXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HAVOC_HOE.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_SWORD.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_AXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.OBSCUTANIUM_HOE.get());
				tabData.accept(EldoradoCoreModItems.ELDORADO_SWORD.get());
				tabData.accept(EldoradoCoreModItems.ELDORADO_AXE.get());
				tabData.accept(EldoradoCoreModItems.ELDORADO_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.ELDORADO_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.ELDORADO_HOE.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_SWORD.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_AXE.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_HOE.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_SWORD.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_AXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_HOE.get());
				tabData.accept(EldoradoCoreModItems.VIBRANT_UNOCTANIUM_AXE.get());
				tabData.accept(EldoradoCoreModItems.VIBRANT_UNOCTANIUM_PICKAXE.get());
				tabData.accept(EldoradoCoreModItems.VIBRANT_UNOCTANIUM_SHOVEL.get());
				tabData.accept(EldoradoCoreModItems.VIBRANT_UNOCTANIUM_HOE.get());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_DUST.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADO_GRAVEL.get().asItem());
				tabData.accept(EldoradoCoreModItems.VELDORDIUM_INGOT.get());
				tabData.accept(EldoradoCoreModItems.ABYSSALIUM_ORE_CHUNK.get());
			}).withSearchBar().build());
}
