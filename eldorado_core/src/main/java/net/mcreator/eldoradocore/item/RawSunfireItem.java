
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawSunfireItem extends Item {
	public RawSunfireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
