package com.carlin.entity.cow;

import com.carlin.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LukeRenderBlazeCow extends RenderLiving<LukeEntityBlazeCow> 
{
    private static final ResourceLocation cowTextures = new ResourceLocation(Main.MODID + ":textures/entity/cow/LukeCow.png");

    public LukeRenderBlazeCow(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
    {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
        this.bindTexture(cowTextures);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(LukeEntityBlazeCow entity)
    {
        return cowTextures;
    }
}
