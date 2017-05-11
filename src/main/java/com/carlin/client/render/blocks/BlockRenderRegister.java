package com.carlin.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.carlin.Main;
import com.carlin.armor.ModArmor;
import com.carlin.blocks.ModBlocks;
import com.carlin.items.ModItems;
import com.carlin.tools.ModTools;

public final class BlockRenderRegister {

	public static void registerRenderers() {
    	ModBlocks.registerRender();
	}

	public static String modid = Main.MODID;

	public static void preInit() {
//		ModelBakery.addVariantName(
//				Item.getItemFromBlock(ModBlocks.propertyBlock),
//				"tutorial:block_properties_black",
//				"tutorial:block_properties_white");
	}

	public static void reg(Block block) {
		String name = modid + ":" + block.getUnlocalizedName().substring(5);
		System.out.print("NAME " + name);
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(Item.getItemFromBlock(block), 0,
						new ModelResourceLocation(name, "inventory"));
	}

	public static void regMeta(Block block, int meta, String file) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						meta,
						new ModelResourceLocation(modid + ":" + file,
								"inventory"));
	}
}