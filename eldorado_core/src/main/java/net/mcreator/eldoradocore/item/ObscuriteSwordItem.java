
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.eldoradocore.init.EldoradoCoreModItems;

public class ObscuriteSwordItem extends SwordItem {
	public ObscuriteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EldoradoCoreModItems.ABYSSALIUM_PICKAXE.get()));
			}
		}, 3, -1f, new Item.Properties());
	}
}
