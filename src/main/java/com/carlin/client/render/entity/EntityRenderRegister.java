package com.carlin.client.render.entity;

import com.carlin.Main;
import com.carlin.armor.ModArmor;
import com.carlin.blocks.ModBlocks;
import com.carlin.combat.ModCombat;
import com.carlin.crafting.ModCrafting;
import com.carlin.entity.cow.ModCow;
import com.carlin.entity.creeper.ModCreeper;
import com.carlin.entity.zombie.ModZombie;
import com.carlin.items.ModItems;
import com.carlin.tools.ModTools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class EntityRenderRegister {
	
	public static String modid = Main.MODID;

    public static void registerRenderers() {
    	ModCow.registerRender();
    	ModCreeper.registerRender();
    	ModZombie.registerRender();
    }
}