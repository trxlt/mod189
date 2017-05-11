package com.carlin.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BasicPickaxe extends ItemPickaxe {

    protected BasicPickaxe(String unlocalizedName, Item.ToolMaterial material)
    {
        super(material);
	    this.setUnlocalizedName(unlocalizedName);        
    }	
}
