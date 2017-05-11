package com.carlin.entity.creeper;

import com.carlin.Main;

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBlueCreeper extends RenderLiving<EntityBlueCreeper>
{
    private static final ResourceLocation creeperTextures = new ResourceLocation(Main.MODID + ":textures/entity/creeper/blue_creeper.png");

    public RenderBlueCreeper(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelCreeper(), 0.5F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityBlueCreeper entity)
    {
        return creeperTextures;
    }
}