package com.FGpisces.Technoverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockReg {
	
	public static Block Ironstone;
	
	public static void init() {
		
		Ironstone = new Ironstone();
		
		GameRegistry.registerBlock(Ironstone, "Ironstone");
	}
}