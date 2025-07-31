
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VeldordiumIngotItem extends Item {
	public VeldordiumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
