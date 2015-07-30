package com.FGpisces.Technoverse;

import com.leSamo.lib.TABlock;
import com.leSamo.lib.TACreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class Ironstone extends TABlock {

	protected Ironstone() {
		super();
		this.setBlockName("ironstone");
		this.setBlockTextureName("Ironstone");
		this.setHardness(3);
		this.setCreativeTab(TACreativeTab.TATab);
		this.setHarvestLevel("pickaxe", 3);
	}
}