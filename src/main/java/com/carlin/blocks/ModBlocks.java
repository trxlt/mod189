package com.carlin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.carlin.client.render.blocks.BlockRenderRegister;
import com.carlin.items.ModItems;

public final class ModBlocks {

    public static Block lukeBlock;
    public static Block edBlock;
//    public static Block tutorialBlock;
//    public static Block propertyBlock;
//    public static Block oreBlock;
//    public static Block multiOreBlock;    
	
    public static void create() {
    	
//    	tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f);
//    	GameRegistry.registerBlock(tutorialBlock, "tutorial_block");
//    	
//    	propertyBlock = new BlockProperties("block_properties");
//    	GameRegistry.registerBlock(propertyBlock, ItemBlockMeta.class, "block_properties");
//    	
//    	oreBlock = new TutorialOreBlock("tutorial_ore", Material.rock, ModItems.tutorialItem, 2, 4);
//    	GameRegistry.registerBlock(oreBlock, "tutorial_ore");
//    	
//    	multiOreBlock = new TutorialMultiOreBlock("tutorial_multi_ore", Material.rock);
//    	GameRegistry.registerBlock(multiOreBlock, "tutorial_multi_ore");
    	
    	lukeBlock = new BasicBlock("luke_block");
    	lukeBlock.setHarvestLevel("pickaxe", 3);
    	GameRegistry.registerBlock(lukeBlock, "luke_block");

    	edBlock = new BasicBlock("ed_block");
    	edBlock.setHarvestLevel("pickaxe", 3);
    	GameRegistry.registerBlock(edBlock, "ed_block");
    }
    
    public static void registerRender() {
    	
//    	BlockRenderRegister.reg(ModBlocks.tutorialBlock);
    	BlockRenderRegister.reg(ModBlocks.lukeBlock);
    	BlockRenderRegister.reg(ModBlocks.edBlock);
//    	BlockRenderRegister.reg(ModBlocks.oreBlock);
//    	BlockRenderRegister.reg(ModBlocks.multiOreBlock);
//    	
//    	BlockRenderRegister.regMeta(ModBlocks.propertyBlock, 0, "block_properties_white");
//    	BlockRenderRegister.regMeta(ModBlocks.propertyBlock, 1, "block_properties_black");
    }    
}
