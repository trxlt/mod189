package com.carlin.tools;

import com.carlin.Main;
import com.carlin.client.render.items.ItemRenderRegister;
import com.carlin.combat.BasicSword;
import com.carlin.material.ModMaterials;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTools {

    public static Item lukePickaxe;
//    public static Item lukeSpade;
//    public static Item lukeHoe;
//    public static Item lukeAxe;
    public static Item edPickaxe;
    public static Item edSpade;
    public static Item edHoe;
    public static Item edAxe;
    
    public static void create() {
    	
    	lukePickaxe = new BasicPickaxe("luke_pickaxe", ModMaterials.lukeToolMaterial);
    	GameRegistry.registerItem(lukePickaxe, "luke_pickaxe");    	

//    	lukeSpade = new BasicSpade("luke_shovel", ModMaterials.lukeToolMaterial);
//    	GameRegistry.registerItem(lukeSpade, "luke_shovel");    	
//
//    	lukeHoe = new BasicHoe("luke_hoe", ModMaterials.lukeToolMaterial);
//    	GameRegistry.registerItem(lukeHoe, "luke_hoe");
//
//    	lukeAxe = new BasicAxe("luke_axe", ModMaterials.lukeToolMaterial);
//    	GameRegistry.registerItem(lukeAxe, "luke_axe");     	

    	edPickaxe = new BasicPickaxe("ed_pickaxe", ModMaterials.edToolMaterial);
    	GameRegistry.registerItem(edPickaxe, "ed_pickaxe");
    	
    	edSpade = new BasicSpade("ed_shovel", ModMaterials.edToolMaterial);
    	GameRegistry.registerItem(edSpade, "ed_shovel");    	

    	edHoe = new BasicHoe("ed_hoe", ModMaterials.edToolMaterial);
    	GameRegistry.registerItem(edHoe, "ed_hoe");    	

    	edAxe = new BasicAxe("ed_axe", ModMaterials.edToolMaterial);
    	GameRegistry.registerItem(edAxe, "ed_axe");     	
    }
    
    public static void registerRender() {
    	ItemRenderRegister.reg(lukePickaxe);
//    	ItemRenderRegister.reg(lukeSpade);
//    	ItemRenderRegister.reg(lukeHoe);
//    	ItemRenderRegister.reg(lukeAxe);
    	ItemRenderRegister.reg(edPickaxe);
    	ItemRenderRegister.reg(edSpade);
    	ItemRenderRegister.reg(edHoe);
    	ItemRenderRegister.reg(edAxe);
    }    
}