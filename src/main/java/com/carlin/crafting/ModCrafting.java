package com.carlin.crafting;

import com.carlin.armor.ModArmor;
import com.carlin.blocks.ModBlocks;
import com.carlin.combat.ModCombat;
import com.carlin.items.ModItems;
import com.carlin.material.ModMaterials;
import com.carlin.tools.ModTools;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void initCrafting() {
    	
//    	// shaped recipe = shaped recipe requires the items to be in a special shape
//    	// item stack = one item + stack size + other (damage value from tools)
//    	GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
//    	
//    	// shapeless recipe = defined by the count of all items in the crafting grid.
//    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
//    	
//    	// furnace recipe = we only need an in- and an output stack (last arg is XP)
//    	GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0F);
//    	
//    	// with array
//    	GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
    	
//    	// without array
//    	GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##", "##", '#', ModItems.tutorialItem);

    	//		// iron pickaxe
//    	GameRegistry.addRecipe(new ItemStack(Items.iron_pickaxe), new Object[] {"###", " I ", " I ", '#', Items.iron_ingot, 'I', Items.stick});

//    	diamond chestplate
//    	GameRegistry.addRecipe(new ItemStack(Items.diamond_chestplate), new Object[] {"# #", "###", "###", '#', Items.diamond});
    	
//      GameRegistry.addSmelting(MyBlock_1field_71990_ca, new ItemStack(LukeItem, 1), 10.0F);

		GameRegistry.addSmelting(ModBlocks.lukeBlock, new ItemStack(ModItems.lukeIngot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.edBlock, new ItemStack(ModItems.edIngot), 1.0F);
		    	
		GameRegistry.addRecipe(new ItemStack(ModCombat.lukeSword), new Object[] { "#", "#", "I", '#', ModItems.lukeIngot, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.lukePickaxe, 1), new Object[] {"###", " I ", " I ", '#', ModItems.lukeIngot, 'I', Items.stick});
//		GameRegistry.addRecipe(new ItemStack(ModTools.lukeSpade, 1), new Object[] {"#", "I", "I", '#', ModItems.lukeIngot, 'I', Items.stick});
//		GameRegistry.addRecipe(new ItemStack(ModTools.lukeHoe, 1), new Object[] {"##", " I", " I", '#', ModItems.lukeIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModArmor.lukeHelmet, 1), new Object[] { "###", "# #", '#', ModItems.lukeIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.lukeChestplate, 1), new Object[] { "# #", "###", "###", '#', ModItems.lukeIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.lukeLeggings, 1), new Object[] { "###", "# #", "# #", '#', ModItems.lukeIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.lukeBoots, 1), new Object[] { "# #", "# #", '#', ModItems.lukeIngot });

		GameRegistry.addRecipe(new ItemStack(ModCombat.edSword), new Object[] { "#", "#", "I", '#', ModItems.edIngot, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.edPickaxe, 1), new Object[] {"###", " I ", " I ", '#', ModItems.edIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.edSpade, 1), new Object[] {"#", "I", "I", '#', ModItems.edIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.edHoe, 1), new Object[] {"##", " I", " I", '#', ModItems.edIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.edAxe, 1), new Object[] {"##", "#I", " I", '#', ModItems.edIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModArmor.edHelmet, 1), new Object[] { "###", "# #", '#', ModItems.edIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.edChestplate, 1), new Object[] { "# #", "###", "###", '#', ModItems.edIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.edLeggings, 1), new Object[] { "###", "# #", "# #", '#', ModItems.edIngot });
		GameRegistry.addRecipe(new ItemStack(ModArmor.edBoots, 1), new Object[] { "# #", "# #", '#', ModItems.edIngot });
    
    }
}
