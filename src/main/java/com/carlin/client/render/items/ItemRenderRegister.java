package com.carlin.client.render.items;

import com.carlin.Main;
import com.carlin.armor.ModArmor;
import com.carlin.blocks.ModBlocks;
import com.carlin.combat.ModCombat;
import com.carlin.crafting.ModCrafting;
import com.carlin.items.ModItems;
import com.carlin.tools.ModTools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modid = Main.MODID;

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}	

    public static void registerRenderers() {
    	ModItems.registerRender();
    	ModTools.registerRender();
    	ModCombat.registerRender();
    	ModArmor.registerRender();
    }
}