
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EldoradiumIngotItem extends Item {
	public EldoradiumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
