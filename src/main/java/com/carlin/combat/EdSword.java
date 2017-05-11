package com.carlin.combat;

import com.carlin.material.ModMaterials;

import net.minecraft.item.Item.ToolMaterial;

public class EdSword extends BasicSword {
	
	public EdSword()
	{
		super("ed_sword", ModMaterials.edToolMaterial);
		this.setMaxDamage(100);
	}	
}
