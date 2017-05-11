package com.carlin.proxies;

import com.carlin.armor.ModArmor;
import com.carlin.biome.ModBiome;
import com.carlin.blocks.ModBlocks;
import com.carlin.combat.ModCombat;
import com.carlin.crafting.ModCrafting;
import com.carlin.entity.cow.ModCow;
import com.carlin.entity.creeper.ModCreeper;
import com.carlin.entity.zombie.ModZombie;
import com.carlin.items.ModItems;
import com.carlin.material.ModMaterials;
import com.carlin.tools.ModTools;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	
    	// always first
    	ModMaterials.create();
        
    	ModItems.create();
        ModBlocks.create();
        ModTools.create();
        ModArmor.create();
        ModCombat.create();

        int entityId = 100;
        entityId = ModCow.create(entityId);
        entityId = ModCreeper.create(entityId);
        entityId = ModZombie.create(entityId);
        
        ModBiome.create();

    	// always last
        ModCrafting.initCrafting();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
