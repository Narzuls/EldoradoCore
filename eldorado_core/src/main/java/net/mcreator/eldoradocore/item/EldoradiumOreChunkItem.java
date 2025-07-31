
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EldoradiumOreChunkItem extends Item {
	public EldoradiumOreChunkItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
