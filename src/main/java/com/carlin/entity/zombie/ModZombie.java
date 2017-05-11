package com.carlin.entity.zombie;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.carlin.Main;

public class ModZombie {
	
    public static int create(int nextId) {
    	
//        * @param entityClass The entity class
//        * @param entityName A unique name for the entity
//        * @param id A mod specific ID for the entity
//        * @param mod The mod
//        * @param trackingRange The range at which MC will send tracking updates
//        * @param updateFrequency The frequency of tracking updates
//        * @param sendsVelocityUpdates Whether to send velocity information packets as well
//        * @param eggPrimary Primary egg color
//        * @param eggSecondary Secondary egg color
//        */
    	System.out.printf("RED ZOMBIE " + nextId);
    	EntityRegistry.registerModEntity(EntityRedZombie.class, "red_zombie", nextId++, Main.instance, 64, 20, true, 
    			new Color(255, 255, 255).getRGB(), new Color(255, 0, 255).getRGB());
    	
    	return nextId;
    }
    
    public static void registerRender() {
    	RenderManager mgr = Minecraft.getMinecraft().getRenderManager();
    	RenderingRegistry.registerEntityRenderingHandler(EntityRedZombie.class, new RenderRedZombie(mgr));
    }    
}
