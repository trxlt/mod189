package com.carlin.material;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.carlin.Main;

public class ModMaterials {

    public static void create()
    {
    	createToolMaterial();
    	createArmorMaterial();
    }    
    
//    Harvest Level:
//    	
//    A harvest level for pickaxes. This is a value between 0 and 3 and defines which blocks can be 
//    mined with this tool. Its also possible to create blocks which need a higher harvest level 
//    than 3, but then you are not able to mine them with vanilla tools.
//    0: Wood/Gold Tool
//    1: Stone Tool
//    2: Iron Tool
//    3: Diamond Tool
//    
//    Max Uses:
//    The durability of the tool or sword. This value defines how often you can use a tool until it breaks. 
//    The tools always last one use longer than the entered value.
//    59: Wood Tool
//    131: Stone Tool
//    250: Iron Tool
//    1561: Diamond Tool
//    32: Gold Tool
//
//    Efficiency
//    The mining speed of the tool. This value defines how much faster you are with this tool than with 
//    your hand.
//    2.0F:  Wood Tool
//    4.0F:  Stone Tool
//    6.0F:  Iron Tool
//    8.0F:  Diamond Tool
//    12.0F: Gold Tool
//
//    Damage vs Entity
//    The damage versus Entites. This value is used to calculate the damage an entity takes if you hit it 
//    with this tool/sword. This value defines the basic damage to which different values are added, 
//    depending on the type of tool. A sword always causes 4 more damage than written in the ToolMaterial. 
//    So, if you want to create a sword which adds 10 damage to your normal damage, the value in the 
//    ToolMaterial needs to be 6.0F. Of course the values can be below zero.
//    0.0F: Wood Tool (Sword adds 4.0 damage)
//    1.0F: Stone Tool (Sword adds 5.0 damage)
//    2.0F  Iron Tool (Sword adds 6.0 damage)
//    3.0F  Diamond Tool (Sword adds 7.0 damage)
//    0.0F: Gold Tool (Sword adds 4.0 damage)
//    
//    Enchantability
//    The enchantability of this tool. This value is quite complex to understand and I have to admit that 
//    I don't quite know how it is calculated. Basically you can say that a higher enchantability leads 
//    to better enchantements with the same amount of XP.
//    15: Wood Tool
//    5:  Stone Tool
//    14: Iron Tool
//    15: Diamond Tool
//    22: Gold Tool
    
//    private ToolMaterial(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)

	public static ToolMaterial lukeToolMaterial;
    public static ToolMaterial edToolMaterial;
    
    private static void createToolMaterial() 
    {
    	int lukeHarvestLevel = 3;
    	int lukeMaxUses = 1000;
    	float lukeEfficiency = 15.0F;
    	float lukeDamageVsEntity = 20.0F;
    	int lukeEnchantability = 30;
    	lukeToolMaterial = EnumHelper.addToolMaterial("Luke Super Ingot", lukeHarvestLevel, lukeMaxUses, lukeEfficiency, lukeDamageVsEntity, lukeEnchantability);

    	int edHarvestLevel = 3;
    	int edMaxUses = 1000;
    	float edEfficiency = 15.0F;
    	float edDamageVsEntity = 18.0F;
    	int edEnchantability = 30;    	
    	edToolMaterial = EnumHelper.addToolMaterial("Carlinium", edHarvestLevel, edMaxUses, edEfficiency, edDamageVsEntity, edEnchantability);    
    }
    
//  public static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability)
//
//    Durability
//    The durability of the armor item. This value is multiplicated with the following list to generate the different 
//	    durabilities for each armor item:
//	    durability * 11 for the helmet
//	    durability * 16 for the chestplate
//	    durability * 15 for the leggings
//	    durability * 13 for the boots
//	    
//    Common values for the durability are:
//	    5 for leather armor
//	    15 for chain and iron armor
//	    7 for gold armor
//	    33 for diamond armor
//
//    Reduction Amounts
//    The damageReductionArray of the armor. This is a list of integer values that define the number of armor points 
//    for helmet, chestplate, leggings and boots that are added to the player's hotbar when the armor is worn. These 
//    values should be adjusted carefully because if you use higher values than the diamond armor has, the armor bar 
//    is overfilled. The additional armor points are not rendered but show their effect: If a player has got 25 armor 
//    points, he becomes invulnerable. A feature like this should not be added by any mod!
//    Common values for the damage reduction array are:
//	    new int[]{1, 3, 2, 1} for leather armor (7 at all)
//	    new int[]{2, 5, 4, 1} for chain armor (12 at all)
//	    new int[]{2, 6, 5, 2} for iron armor (15 at all)
//	    new int[]{2, 5, 3, 1} for gold armor (11 at all)
//	    new int[]{3, 8, 6, 3} for diamond armor (20 at all - do not use more!)
//
//    Enchantability
//    The enchantability of the armor. This value determines the enchantments you get on average per level. The higher 
//    this value, the better the enchantments you get.
//    Common values for the enchantability are:
//	    15 for leather armor
//	    12 for chain armor
//	    9 for iron armor
//	    25 for gold armor
//	    10 for diamond armor

	public static ArmorMaterial lukeArmorMaterial;
	public static ArmorMaterial edArmorMaterial;
    
    public static void createArmorMaterial()
    {
    	int lukeDurability = 16;
    	int[] lukeReductionAmounts = { 3, 8, 6, 3 };
    	int lukeEnchantability = 30;
    	lukeArmorMaterial = EnumHelper.addArmorMaterial("Mewtwo's finger", Main.MODID + ":luke", lukeDurability, lukeReductionAmounts, lukeEnchantability);

    	int edDurability = 16;
    	int[] edReductionAmounts = { 3, 8, 6, 3 };
    	int edEnchantability = 33;
    	edArmorMaterial = EnumHelper.addArmorMaterial("Carlinium", Main.MODID + ":ed", edDurability, edReductionAmounts, edEnchantability);
    }
}
