package com.carlin.entity.creeper;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBlueCreeper extends EntityCreeper
{
    public EntityBlueCreeper(World worldIn)
    {
        super(worldIn);
    }
    
    protected Item getDropItem()
    {
        return Items.cooked_porkchop;
    }    
}