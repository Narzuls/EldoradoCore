
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EldoradoRubyItem extends Item {
	public EldoradoRubyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
