package com.carlin.armor;

import net.minecraft.item.ItemArmor;

public class BasicArmorLeggings extends ItemArmor {
	
	public BasicArmorLeggings(String unlocalizedName, ItemArmor.ArmorMaterial material) {
		super(material, 2, 2);
		this.setUnlocalizedName(unlocalizedName);		
	}
}
