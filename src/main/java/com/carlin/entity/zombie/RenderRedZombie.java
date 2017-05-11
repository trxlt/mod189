package com.carlin.entity.zombie;

import com.carlin.Main;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRedZombie extends RenderZombie
{
    private static final ResourceLocation redZombieTextures = new ResourceLocation(Main.MODID + ":textures/entity/zombie/red_zombie.png");
    private static final ResourceLocation redZombieVillagerTextures = new ResourceLocation(Main.MODID + ":textures/entity/zombie/red_zombie_villager.png");

    public RenderRedZombie(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(EntityZombie entity)
    {
        return entity.isVillager() ? redZombieVillagerTextures : redZombieTextures;
    }
}