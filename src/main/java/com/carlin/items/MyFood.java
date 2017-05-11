package com.carlin.items;
//package com.bedrockminer.tutorial.client.render.items;
//
//public class MyFood {
//
//}
//package mymod.items;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.item.ItemFood;
//
//
//
//
//public class MyFood
//  extends ItemFood
//{
//  private String texturePath = "mymod:";
//  
//  public MyFood(int itemID, int healAmount, Float saturationModifier, boolean isWolfsFavoriteMeat, String textureName)
//  {
//    super(itemID, healAmount, saturationModifier.floatValue(), isWolfsFavoriteMeat);
//    func_77655_b(textureName);
//    texturePath += textureName;
//  }
//  
//
//  @SideOnly(Side.CLIENT)
//  public void func_94581_a(IconRegister iconRegister)
//  {
//    field_77791_bV = iconRegister.func_94245_a(texturePath);
//  }
//}