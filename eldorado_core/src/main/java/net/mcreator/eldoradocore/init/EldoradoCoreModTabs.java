
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eldoradocore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.eldoradocore.EldoradoCoreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EldoradoCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EldoradoCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> ELDORADO_CORE = REGISTRY.register("eldorado_core",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.eldorado_core.eldorado_core")).icon(() -> new ItemStack(EldoradoCoreModBlocks.ELDORADIUM_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_CHUNK.get());
				tabData.accept(EldoradoCoreModItems.RAW_ELDORADIUM.get());
				tabData.accept(EldoradoCoreModItems.ELDORADIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.OBSCURITE_ORE.get().asItem());
				tabData.accept(EldoradoCoreModBlocks.OBSCURITE_BLOCK.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_OBSCURITE.get());
				tabData.accept(EldoradoCoreModItems.OBSCURITE_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.VERDORIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_VERDORIUM.get());
				tabData.accept(EldoradoCoreModItems.VERDORIUM_ORE_CHUNK.get());
				tabData.accept(EldoradoCoreModBlocks.UNOCTANIUM_ORE.get().asItem());
				tabData.accept(EldoradoCoreModItems.RAW_UNOCTANIUM.get());
				tabData.accept(EldoradoCoreModItems.UNOCTANIUM_ORE_CHUNK.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_GEM_BLOCK.get().asItem());
			tabData.accept(EldoradoCoreModBlocks.ELDORADIUM_GEM_ORE.get().asItem());
			tabData.accept(EldoradoCoreModBlocks.VERDORIUM_BLOCK.get().asItem());
			tabData.accept(EldoradoCoreModBlocks.UNOCTANIUM_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EldoradoCoreModItems.ELDORADIUM_GEM.get());
			tabData.accept(EldoradoCoreModItems.OBSCURITE_INGOT.get());
			tabData.accept(EldoradoCoreModItems.VERDORIUM_INGOT.get());
			tabData.accept(EldoradoCoreModItems.UNOCTANIUM_INGOT.get());
		}
	}
}
