//package com.carlin.blocks;
//
//import java.util.ArrayList;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.BlockPos;
//import net.minecraft.world.IBlockAccess;
//
//import com.carlin.items.ModItems;
//
//public class TutorialMultiOreBlock extends Block {
//
//    protected TutorialMultiOreBlock(String unlocalizedName, Material material) {
//        super(material);
//        this.setUnlocalizedName(unlocalizedName);
//        this.setCreativeTab(CreativeTabs.tabBlock);
//        this.setStepSound(soundTypeStone);
//        this.setHardness(10.0f);
//        this.setResistance(20.0f);
//        this.setHarvestLevel("pickaxe", 2);
//    }
//
//    @Override
//    public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
//        ArrayList drops = new ArrayList();
//        drops.add(new ItemStack(Items.coal, RANDOM.nextInt(3) + 1));
//        drops.add(new ItemStack(Items.iron_ingot, RANDOM.nextInt(2) + 1));
//        drops.add(new ItemStack(Items.gold_ingot, RANDOM.nextInt(2) + 1));
//        drops.add(new ItemStack(Items.dye, RANDOM.nextInt(3) + 2, 4));
//        drops.add(new ItemStack(Items.redstone, RANDOM.nextInt(2) + 2));
//        drops.add(new ItemStack(ModItems.tutorialItem, RANDOM.nextInt(2) + 1));
//        if (RANDOM.nextFloat() < 0.5F)
//            drops.add(new ItemStack(Items.diamond));
//        return drops;
//    } 
//}
