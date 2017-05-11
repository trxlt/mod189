package com.carlin.items;
//package com.bedrockminer.tutorial.client.render.items;
//
//public class MyPickaxe {
//
//}
//package mymod.items;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.item.EnumToolMaterial;
//import net.minecraft.item.ItemPickaxe;
//
//
//
//public class MyPickaxe
//  extends ItemPickaxe
//{
//  private String texturePath = "mymod:";
//  
//  public MyPickaxe(int ItemID, EnumToolMaterial material, String textureName)
//  {
//    super(ItemID, material);
//    func_77655_b(textureName);
//    texturePath += textureName;
//  }
//  
//
//
//  @SideOnly(Side.CLIENT)
//  public void func_94581_a(IconRegister iconRegister)
//  {
//    field_77791_bV = iconRegister.func_94245_a(texturePath);
//  }
//}