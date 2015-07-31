package com.FGpisces.Technoverse;

import com.leSamo.leLib.LeBlock;
import com.leSamo.leLib.LeCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class Ironstone extends LeBlock {

	protected Ironstone() {
		super();
		this.setBlockName("ironstone");
		this.setBlockTextureName("Ironstone");
		this.setHardness(3);
		this.setCreativeTab(LeCreativeTab.TATab);
		this.setHarvestLevel("pickaxe", 3);
	}
}