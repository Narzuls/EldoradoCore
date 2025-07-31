
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VerdoriumIngotItem extends Item {
	public VerdoriumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
