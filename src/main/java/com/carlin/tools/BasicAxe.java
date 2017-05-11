package com.carlin.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class BasicAxe extends ItemAxe {

    protected BasicAxe(String unlocalizedName, Item.ToolMaterial material)
    {
        super(material);
	    this.setUnlocalizedName(unlocalizedName);        
    }	
}