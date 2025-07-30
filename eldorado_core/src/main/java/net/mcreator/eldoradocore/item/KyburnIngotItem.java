
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KyburnIngotItem extends Item {
	public KyburnIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
