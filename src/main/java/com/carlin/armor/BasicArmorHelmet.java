package com.carlin.armor;

import net.minecraft.item.ItemArmor;

public class BasicArmorHelmet extends ItemArmor {
	
	public BasicArmorHelmet(String unlocalizedName, ItemArmor.ArmorMaterial material) {
		super(material, 1, 0);
		this.setUnlocalizedName(unlocalizedName);		
	}
}
