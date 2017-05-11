package com.carlin.armor;

import net.minecraft.item.ItemArmor;

public class BasicArmorChestplate extends ItemArmor {
	
	public BasicArmorChestplate(String unlocalizedName, ItemArmor.ArmorMaterial material) {
		super(material, 1, 1);
		this.setUnlocalizedName(unlocalizedName);		
	}
}
