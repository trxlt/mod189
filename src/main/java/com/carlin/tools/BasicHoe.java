package com.carlin.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class BasicHoe extends ItemHoe {

    protected BasicHoe(String unlocalizedName, Item.ToolMaterial material)
    {
        super(material);
	    this.setUnlocalizedName(unlocalizedName);        
    }	
}