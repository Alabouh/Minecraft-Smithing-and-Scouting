
package net.mcreator.makingthismod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StonehiltItem extends Item {
	public StonehiltItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
