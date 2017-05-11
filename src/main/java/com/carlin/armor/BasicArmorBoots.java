package com.carlin.armor;

import net.minecraft.item.ItemArmor;

public class BasicArmorBoots extends ItemArmor {
	
	public BasicArmorBoots(String unlocalizedName, ItemArmor.ArmorMaterial material) {
		super(material, 1, 3);
		this.setUnlocalizedName(unlocalizedName);		
	}
}
