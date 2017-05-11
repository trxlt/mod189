package com.carlin.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class BasicSpade extends ItemSpade {

    protected BasicSpade(String unlocalizedName, Item.ToolMaterial material)
    {
        super(material);
	    this.setUnlocalizedName(unlocalizedName);        
    }	
}