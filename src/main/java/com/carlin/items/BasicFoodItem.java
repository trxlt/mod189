package com.carlin.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class BasicFoodItem extends ItemFood {

	public BasicFoodItem(String unlocalizedName, int healAmount, boolean isWolfFood) {
		super(healAmount, isWolfFood);
	    this.setUnlocalizedName(unlocalizedName);
	}

	public BasicFoodItem(String unlocalizedName, int healAmount, boolean isWolfFood, int potionId, int duration, int amplifier, float probability) {
		super(healAmount, isWolfFood);
		
	    /**
	     * sets a potion effect on the item. Args: 
	     * 		int potionId, 
	     * 		int duration (will be multiplied by 20), 
	     * 		int amplifier,
	     * 		float probability of effect happening
	     */
		this.setPotionEffect(potionId, duration, amplifier, probability);
	    this.setUnlocalizedName(unlocalizedName);
	}
}