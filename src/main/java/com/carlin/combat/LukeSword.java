package com.carlin.combat;

import com.carlin.material.ModMaterials;

import net.minecraft.item.Item.ToolMaterial;

public class LukeSword extends BasicSword {
	
	public LukeSword()
	{
		super("luke_sword", ModMaterials.lukeToolMaterial);
		this.setMaxDamage(100);
	}	
}
