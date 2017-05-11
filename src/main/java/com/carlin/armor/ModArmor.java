package com.carlin.armor;

import com.carlin.Main;
import com.carlin.client.render.items.ItemRenderRegister;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {

//	A unique name for the material. This should be the same as the variable's name, but you can choose another one.
//	
//	A texture name for the armor. This name is used to get the right armor model texture. You need to 
//	write your modid, a colon and a chosen name. I'll come back to this value in a minute.
//	
//	The durability of the armor item. This value is multiplied with the following list to generate the 
//	different durabilities for each armor item:
//	durability * 11 for the helmet
//	durability * 16 for the chestplate
//	durability * 15 for the leggings
//	durability * 13 for the boots
//	Common values for the durability are:
//	5 for leather armor
//	15 for chain and iron armor
//	7 for gold armor
//	33 for diamond armor
//
//	The damageReductionArray of the armor. This is a list of integer values that define the number of 
//	armor points for helmet, chestplate, leggings and boots that are added to the player's hotbar when 
//	the armor is worn. These values should be adjusted carefully because if you use higher values than 
//	the diamond armor has, the armor bar is overfilled. The additional armor points are not rendered 
//	but show their effect: If a player has got 25 armor points, he becomes invulnerable. A feature like 
//	this sould not be added by any mod!
//	Common values for the damage reduction array are:
//	new int[]{1, 3, 2, 1} for leather armor (7 at all)
//	new int[]{2, 5, 4, 1} for chain armor (12 at all)
//	new int[]{2, 6, 5, 2} for iron armor (15 at all)
//	new int[]{2, 5, 3, 1} for gold armor (11 at all)
//	new int[]{3, 8, 6, 3} for diamond armor (20 at all - do not use more!)
//
//	The enchantability of the armor. This value determines the enchantments you get on average per level. 
//	The higher this value, the better the enchantments you get.
//	Common values for the enchantability are:
//	15 for leather armor
//	12 for chain armor
//	9 for iron armor
//	25 for gold armor
//	10 for diamond armor
	
	// EnumHelper.addToolMaterial("Super ingot ", 3, 2000, 3.0F, 1500.0F, 10);

    public static ItemArmor lukeHelmet;
    public static ItemArmor lukeLeggings;
    public static ItemArmor lukeBoots;
    public static ItemArmor lukeChestplate;

    public static ItemArmor edHelmet;
    public static ItemArmor edLeggings;
    public static ItemArmor edBoots;
    public static ItemArmor edChestplate;
    
    // armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
    // render index: 1 for helmet, chestplate and boots and 2 for leggings.
    
    /**
     * render index???: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
     */ 
    
    public static void create() {
    	
    	lukeHelmet = new LukeHelmet();
    	GameRegistry.registerItem(lukeHelmet, "luke_helmet");    	

    	lukeChestplate = new LukeChestplate();
    	GameRegistry.registerItem(lukeChestplate, "luke_chestplate");    
    	
    	lukeLeggings = new LukeLeggings();
    	GameRegistry.registerItem(lukeLeggings, "luke_leggings");    
    	
    	lukeBoots = new LukeBoots();
    	GameRegistry.registerItem(lukeBoots, "luke_boots"); 
    	
    	edHelmet = new EdHelmet();
    	GameRegistry.registerItem(edHelmet, "ed_helmet");    	

    	edChestplate = new EdChestplate();
    	GameRegistry.registerItem(edChestplate, "ed_chestplate");    
    	
    	edLeggings = new EdLeggings();
    	GameRegistry.registerItem(edLeggings, "ed_leggings");    
    	
    	edBoots = new EdBoots();
    	GameRegistry.registerItem(edBoots, "ed_boots");      	
    }

    public static void registerRender() {
    	ItemRenderRegister.reg(lukeHelmet);
    	ItemRenderRegister.reg(lukeChestplate);
    	ItemRenderRegister.reg(lukeLeggings);
    	ItemRenderRegister.reg(lukeBoots);
    	
    	ItemRenderRegister.reg(edHelmet);
    	ItemRenderRegister.reg(edChestplate);
    	ItemRenderRegister.reg(edLeggings);
    	ItemRenderRegister.reg(edBoots);    	
    }   
}