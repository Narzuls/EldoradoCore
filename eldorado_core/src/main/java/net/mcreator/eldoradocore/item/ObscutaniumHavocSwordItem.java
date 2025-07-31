
package net.mcreator.eldoradocore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class ObscutaniumHavocSwordItem extends SwordItem {
	public ObscutaniumHavocSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 26f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 0f, new Item.Properties());
	}
}
