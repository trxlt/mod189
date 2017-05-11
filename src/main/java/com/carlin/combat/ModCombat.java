package com.carlin.combat;

import com.carlin.Main;
import com.carlin.client.render.items.ItemRenderRegister;
import com.carlin.combat.BasicSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCombat {

    public static Item lukeSword;
    public static Item edSword;
    
    public static void create() {
    	
    	lukeSword = new LukeSword();
    	GameRegistry.registerItem(lukeSword, "luke_sword");    	

    	edSword = new EdSword();
    	GameRegistry.registerItem(edSword, "ed_sword");    	
    }
    
    public static void registerRender() {
    	ItemRenderRegister.reg(lukeSword);
    	ItemRenderRegister.reg(edSword);
   }    
}