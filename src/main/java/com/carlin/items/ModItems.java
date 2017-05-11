package com.carlin.items;

import com.carlin.client.render.items.ItemRenderRegister;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

//    public static Item tutorialItem;
    public static Item lukeFoodItem;
    public static Item lukeIngot;
    public static Item edIngot;

    public static void create() {
    	
//    	String itemName = "tutorial_item";
//    	tutorialItem = new BasicItem(itemName);
//    	GameRegistry.registerItem(tutorialItem, itemName);

    	lukeIngot = new LukeIngot();
    	GameRegistry.registerItem(lukeIngot, "luke_ingot");

    	edIngot = new EdIngot();
    	GameRegistry.registerItem(edIngot, "ed_ingot");

    	String foodName = "luke_food";
    	lukeFoodItem = new BasicFoodItem(foodName, 1, false, Potion.wither.id, 20, 1, 0.9F);
    	GameRegistry.registerItem(lukeFoodItem, foodName);
    	
    	//ItemFishFood
    }
    
    public static void registerRender() {
//    	ItemRenderRegister.reg(tutorialItem);
    	ItemRenderRegister.reg(lukeFoodItem);
    	ItemRenderRegister.reg(lukeIngot);
    	ItemRenderRegister.reg(edIngot);
    }
}