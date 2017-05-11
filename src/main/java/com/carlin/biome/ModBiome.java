package com.carlin.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBiome {
	
	static BiomeGenBase lukeBiome = null;

	static public void create() 
	{
		lukeBiome = new LukeBiome(30);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(lukeBiome, 100));
	}
}
