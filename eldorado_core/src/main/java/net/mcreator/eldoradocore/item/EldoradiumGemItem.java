
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EldoradiumGemItem extends Item {
	public EldoradiumGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
