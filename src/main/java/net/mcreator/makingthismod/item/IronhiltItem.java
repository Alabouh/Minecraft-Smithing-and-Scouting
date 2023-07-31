
package net.mcreator.makingthismod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronhiltItem extends Item {
	public IronhiltItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
