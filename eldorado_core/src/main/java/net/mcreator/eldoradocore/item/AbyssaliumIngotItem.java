
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AbyssaliumIngotItem extends Item {
	public AbyssaliumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
