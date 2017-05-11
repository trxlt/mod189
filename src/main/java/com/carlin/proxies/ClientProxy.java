package com.carlin.proxies;

import com.carlin.client.render.blocks.BlockRenderRegister;
import com.carlin.client.render.entity.EntityRenderRegister;
import com.carlin.client.render.items.ItemRenderRegister;
import com.carlin.entity.cow.ModCow;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        BlockRenderRegister.preInit();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        ItemRenderRegister.registerRenderers();
        BlockRenderRegister.registerRenderers();
        EntityRenderRegister.registerRenderers();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}