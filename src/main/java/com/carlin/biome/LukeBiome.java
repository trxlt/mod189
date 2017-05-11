package com.carlin.biome;

import java.util.Random;

import com.carlin.blocks.ModBlocks;
import com.carlin.entity.cow.LukeEntityBlazeCow;
import com.carlin.entity.creeper.EntityBlueCreeper;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLakes;

public class LukeBiome extends BiomeGenBase
{
    public LukeBiome(int p_i45384_1_)
    {
        super(p_i45384_1_);

		this.setBiomeName("Luke's PokeBiome");
        
		this.setTemperatureRainfall(1.3F, 0.0F);
		this.setColor(2900485);
		
        this.topBlock = Blocks.grass.getDefaultState();
        this.fillerBlock = ModBlocks.lukeBlock.getDefaultState();
		
		this.spawnableCreatureList.clear();
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(LukeEntityBlazeCow.class, 5, 2, 6));
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityBlueCreeper.class, 5, 2, 6));
        //this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityWither.class, 100, 4, 4));
        
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 0;
        this.theBiomeDecorator.reedsPerChunk = 0;
        this.theBiomeDecorator.cactiPerChunk = 0;
    }
}