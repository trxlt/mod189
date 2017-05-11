package com.carlin.blocks;

import com.carlin.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

    public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        // name of the block
        this.setUnlocalizedName(unlocalizedName);
        // creative tab
        this.setCreativeTab(CreativeTabs.tabBlock);
        // hardness = time to mine
        this.setHardness(hardness);
        // resistance against explosions
        this.setResistance(resistance);
        // 
        //this.setStepSound(sound);
        // how much light is subtracted going through this block (only if isOpaqueCube = false)
        //  (default = 16, max = 0 (100% translucent)
        //this.setLightOpacity(opacity);
        // how much light is emitted from the block (default = 0.0F (nothing), max = 1.0F (full sunlight))
        //this.setLightLevel(value);
        // sets the tool and tool level to break the block
        // toolclass = pickaxe, axe, shovel
        // level = 0 (wood), 1 (stone), 2 (iron), 3 (diamond)
        //this.setHarvestLevel(toolClass, level);
        // makes block unbreakable
        //this.setBlockUnbreakable();
        // sets if block receives random ticks (i.e., for decaying leaves)
        //this.setTickRandomly(shouldTick);
    }

    public BasicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}
