package com.carlin.entity.cow;

import java.awt.Color;

import com.carlin.Main;
import com.carlin.entity.creeper.EntityBlueCreeper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModCow {

//  public static int getUniqueEntityId() {
//  do { MyEntityID += 1;
//  }
//  while (EntityList.func_75617_a(MyEntityID) != null);
//  return MyEntityID++;
//}
//
//public static void registerEntityEgg(Class<MyEntityCow> entity, int primaryColor, int secondaryColor)
//{
//  int id = getUniqueEntityId();
//  EntityList.field_75623_d.put(Integer.valueOf(id), entity);
//  EntityList.field_75627_a.put(Integer.valueOf(id), new EntityEggInfo(id, primaryColor, secondaryColor));
//}
//	
//  EntityRegistry.registerGlobalEntityID(MyEntityCow.class, "My Awesome Mob", EntityRegistry.findGlobalUniqueEntityId());
//  EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
//  EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, EnumCreatureType.monster, new BiomeGenBase[] { MyBiome_1 });
//  registerEntityEgg(MyEntityCow.class, new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
//  RenderingRegistry.registerEntityRenderingHandler(MyEntityCow.class, new MyRenderCow(new MyModelCow(), 0.3F));
//  

	
	
    public static int create(int nextId) {
    	EntityRegistry.registerModEntity(LukeEntityBlazeCow.class, "luke_blaze_cow", nextId++, Main.instance, 64, 20, true, 
    			new Color(255, 255, 255).getRGB(), new Color(255, 0, 0).getRGB());
//    	EntityList.addMapping(LukeEntityBlazeCow.class, "luke_blaze_cow", 1001, new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
    	return nextId;
    }
    
    public static void registerRender() {
    	RenderManager mgr = Minecraft.getMinecraft().getRenderManager();
    	RenderingRegistry.registerEntityRenderingHandler(LukeEntityBlazeCow.class, new LukeRenderBlazeCow(mgr, new LukeModelBlazeCow(), 0.5F));
//    	RenderingRegistry.registerEntityRenderingHandler(MyEntityCow.class, IRenderFactory<? super T> renderFactory);
//    	RenderingRegistry.registerEntityRenderingHandler(MyEntityCow.class, new MyRenderCow(new MyModelCow(), 0.3F));
    }    
}
