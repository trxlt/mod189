package com.carlin.entity.zombie;

import com.carlin.Main;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityRedZombie extends EntityZombie implements IRangedAttackMob
{

	public EntityRedZombie(World worldIn) {
		super(worldIn);
        this.setSize(0.6F, 1.95F);
        this.tasks.taskEntries.clear();
        this.tasks.addTask(1, new EntityAISwimming(this));

        int witchMaxAttackTime = 60;
        float witchMaxAttackDistanceIn = 10.0F;
//        this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, witchMaxAttackTime, witchMaxAttackDistanceIn));
        
        int skeletonMaxAttackTime1 = 20;
        int skeletonMaxAttackTime2 = 60;
        float skeletonMaxAttackDistanceIn = 15.0F;
        //EntityAIArrowAttack(this, 1.0D, skeletonMaxAttackTime1, skeletonMaxAttackTime2, skeletonMaxAttackDistanceIn);

    	int witherMaxAttack = 40;
        float witherMaxAttackDistanceIn = 20.0F;
//        this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, witherMaxAttack, witherMaxAttackDistanceIn));

        int redZombieMaxAttackTime = 20;
        float redZombieMaxAttackDistanceIn = 20.0F;
        this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, redZombieMaxAttackTime, redZombieMaxAttackDistanceIn));

        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));		
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(26.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }	
	
    /**
     * Attack the specified entity using a ranged attack.
     */
    public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_)
    {
        EntityDeadlySnowball snowball = new EntityDeadlySnowball(this.worldObj, this);
        double d0 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D;
        snowball.rotationPitch -= -20.0F;
        double d1 = p_82196_1_.posX + p_82196_1_.motionX - this.posX;
        double d2 = d0 - this.posY;
        double d3 = p_82196_1_.posZ + p_82196_1_.motionZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3);

        snowball.setThrowableHeading(d1, d2 + (double)(f * 0.2F), d3, 0.75F, 8.0F);
        this.worldObj.spawnEntityInWorld(snowball);
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return Main.MODID + ":entity.red_zombie.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return Main.MODID + ":entity.red_zombie.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return Main.MODID + ":entity.red_zombie.death";
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(Main.MODID + ":entity.red_zombie.step", 0.15F, 1.0F);
    }
    
    protected Item getDropItem()
    {
        return Items.golden_apple;
    }     
}