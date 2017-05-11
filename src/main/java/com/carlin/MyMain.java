package com.carlin;
//package com.bedrockminer;
//
//public class MyMain {
//
//}
//package mymod;
//
//import cpw.mods.fml.client.registry.RenderingRegistry;
//import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.EventHandler;
//import cpw.mods.fml.common.SidedProxy;
//import cpw.mods.fml.common.event.FMLInitializationEvent;
//import cpw.mods.fml.common.event.FMLPostInitializationEvent;
//import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod;
//import cpw.mods.fml.common.registry.EntityRegistry;
//import cpw.mods.fml.common.registry.GameRegistry;
//import cpw.mods.fml.common.registry.LanguageRegistry;
//import java.awt.Color;
//import java.util.HashMap;
//import java.util.Map;
//import mymod.armor.MyArmor;
//import mymod.biome.MyBiome;
//import mymod.blocks.MyBlock;
//import mymod.blocks.MyBlockGen;
//import mymod.entity.cow.MyEntityCow;
//import mymod.entity.cow.MyModelCow;
//import mymod.entity.cow.MyRenderCow;
//import mymod.items.MyFood;
//import mymod.items.MyItem;
//import mymod.items.MyPickaxe;
//import mymod.items.MySword;
//import mymod.proxies.CommonProxy;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.EntityEggInfo;
//import net.minecraft.entity.EntityList;
//import net.minecraft.entity.EnumCreatureType;
//import net.minecraft.item.EnumArmorMaterial;
//import net.minecraft.item.EnumToolMaterial;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemFood;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.biome.BiomeGenBase;
//import net.minecraftforge.common.EnumHelper;
//import net.minecraftforge.common.MinecraftForge;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//@Mod(modid="mymod", name="Luke's Super Mod", version="1.0")
//@NetworkMod(clientSideRequired=true, serverSideRequired=false)
//public class Main
//{
//  @SidedProxy(clientSide="mymod.proxies.ClientProxy", serverSide="mymod.proxies.CommonProxy")
//  public static CommonProxy proxy;
//  public static Block MyBlock_1;
//  public static BiomeGenBase MyBiome_1;
//  static int MyEntityID = 300;
//  
//  public Main() {}
//  
//  public static int getUniqueEntityId() {
//    do { MyEntityID += 1;
//    }
//    while (EntityList.func_75617_a(MyEntityID) != null);
//    return MyEntityID++;
//  }
//  
//  public static void registerEntityEgg(Class<MyEntityCow> entity, int primaryColor, int secondaryColor)
//  {
//    int id = getUniqueEntityId();
//    EntityList.field_75623_d.put(Integer.valueOf(id), entity);
//    EntityList.field_75627_a.put(Integer.valueOf(id), new EntityEggInfo(id, primaryColor, secondaryColor));
//  }
//  
//
//
//
//
//  public static EnumToolMaterial MyToolMaterial = EnumHelper.addToolMaterial("Super ingot ", 3, 2000, 3.0F, 1500.0F, 10);
//  
//
//
//  public static EnumArmorMaterial MyArmorMaterial_1 = EnumHelper.addArmorMaterial("Mewtwo's finger ", 33, new int[] { 3, 8, 6, 3 }, 100);
//  
//
//
//
//  public static Item MySword_1;
//  
//
//
//
//  public static Item MyItem_1;
//  
//
//
//
//  public static Item MyHelmet_1;
//  
//
//
//
//  public static Item MyChest_1;
//  
//
//
//  public static Item MyLeggings_1;
//  
//
//
//  public static Item MyBoots_1;
//  
//
//
//  public static Item MyPickaxe_1;
//  
//
//
//  public static Item MyFood_1;
//  
//
//
//
//  @Mod.EventHandler
//  public void preInit(FMLPreInitializationEvent event)
//  {
//    MyBlock_1 = new MyBlock(250, Material.field_76246_e, "MyBlock_1").func_71884_a(Block.field_71976_h).func_71848_c(10.0F).func_71894_b(5999999.0F).func_71900_a(0.5F);
//    GameRegistry.registerBlock(MyBlock_1, "MyBlock_1");
//    LanguageRegistry.addName(MyBlock_1, "Super Diamond Ore");
//    MinecraftForge.setBlockHarvestLevel(MyBlock_1, "pickaxe", 3);
//    
//
//
//    MyBiome_1 = new MyBiome(30);
//    GameRegistry.addBiome(MyBiome_1);
//    
//
//    GameRegistry.removeBiome(BiomeGenBase.field_76787_r);
//    GameRegistry.removeBiome(BiomeGenBase.field_76769_d);
//    GameRegistry.removeBiome(BiomeGenBase.field_76786_s);
//    GameRegistry.removeBiome(BiomeGenBase.field_76786_s);
//    GameRegistry.removeBiome(BiomeGenBase.field_76770_e);
//    GameRegistry.removeBiome(BiomeGenBase.field_76783_v);
//    GameRegistry.removeBiome(BiomeGenBase.field_76767_f);
//    GameRegistry.removeBiome(BiomeGenBase.field_76785_t);
//    GameRegistry.removeBiome(BiomeGenBase.field_76776_l);
//    GameRegistry.removeBiome(BiomeGenBase.field_76784_u);
//    
//
//
//
//
//    EntityRegistry.registerGlobalEntityID(MyEntityCow.class, "My Awesome Mob", EntityRegistry.findGlobalUniqueEntityId());
//    EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
//    EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, EnumCreatureType.monster, new BiomeGenBase[] { MyBiome_1 });
//    registerEntityEgg(MyEntityCow.class, new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
//    RenderingRegistry.registerEntityRenderingHandler(MyEntityCow.class, new MyRenderCow(new MyModelCow(), 0.3F));
//    
//
//
//
//
//
//
//
//    MyItem_1 = new MyItem(2030, "MyItem_1").func_77637_a(CreativeTabs.field_78026_f);
//    GameRegistry.registerItem(MyItem_1, "MyItem_1");
//    LanguageRegistry.addName(MyItem_1, "luke's Really Awesome Item");
//    
//
//
//
//    MySword_1 = new MySword(2021, MyToolMaterial, "MySword_1");
//    GameRegistry.registerItem(MySword_1, "MySword_1");
//    LanguageRegistry.addName(MySword_1, "Luke's Super Slasher");
//    
//
//
//
//    MyHelmet_1 = new MyArmor(2060, MyArmorMaterial_1, 0, 0, "myarmor");
//    GameRegistry.registerItem(MyHelmet_1, "MyHelmet_1");
//    LanguageRegistry.addName(MyHelmet_1, "Luke's super Hat");
//    
//
//    MyChest_1 = new MyArmor(2061, MyArmorMaterial_1, 0, 1, "myarmor");
//    GameRegistry.registerItem(MyChest_1, "MyChest_1");
//    LanguageRegistry.addName(MyChest_1, "Luke's Super shirt");
//    
//
//    MyLeggings_1 = new MyArmor(2062, MyArmorMaterial_1, 0, 2, "myarmor");
//    GameRegistry.registerItem(MyLeggings_1, "MyLeggings_1");
//    LanguageRegistry.addName(MyLeggings_1, "Luke's Super pants");
//    
//
//    MyBoots_1 = new MyArmor(2063, MyArmorMaterial_1, 0, 3, "myarmor");
//    GameRegistry.registerItem(MyBoots_1, "MyBoots_1");
//    LanguageRegistry.addName(MyBoots_1, "Luke's Super shoes");
//    
//
//
//
//    MyPickaxe_1 = new MyPickaxe(2022, MyToolMaterial, "MyPickaxe_1");
//    GameRegistry.registerItem(MyPickaxe_1, "MyPickaxe_1");
//    LanguageRegistry.addName(MyPickaxe_1, "Luke's Super Pick");
//    
//
//
//
//    MyFood_1 = new MyFood(2040, 20, Float.valueOf(1.0E9F), true, "MyFood_1").func_77848_i().func_77625_d(64);
//    GameRegistry.registerItem(MyFood_1, "MyFood_1");
//    LanguageRegistry.addName(MyFood_1, "Luke's Super FrenchFries");
//  }
//  
//
//
//
//
//
//
//
//
//  private void setMaxStackSize(int i) {}
//  
//
//
//
//
//
//
//
//
//  @Mod.EventHandler
//  public static void init(FMLInitializationEvent event)
//  {
//    GameRegistry.addSmelting(MyBlock_1field_71990_ca, new ItemStack(MyItem_1, 1), 10.0F);
//    
//
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MySword_1, 1), new Object[] { " s ", " s ", " x ", Character.valueOf('S'), MyItem_1, Character.valueOf('X'), Item.field_77731_bo });
//    
//
//
//
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MyPickaxe_1, 1), new Object[] { "XXX", " S ", " S ", Character.valueOf('S'), MyItem_1, Character.valueOf('X'), Item.field_77731_bo });
//    
//
//
//
//
//
//
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MyHelmet_1, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), MyItem_1 });
//    
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MyChest_1, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), MyItem_1 });
//    
//
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MyLeggings_1, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), MyItem_1 });
//    
//
//
//
//
//
//
//
//    GameRegistry.addRecipe(new ItemStack(MyBoots_1, 1), new Object[] { "X X", "X X", Character.valueOf('X'), MyItem_1 });
//    
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    GameRegistry.registerWorldGenerator(new MyBlockGen());
//  }
//  
//  @Mod.EventHandler
//  public static void postInit(FMLPostInitializationEvent event) {}
//}