
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawVerdoriumItem extends Item {
	public RawVerdoriumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
