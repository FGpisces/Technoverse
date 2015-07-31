package com.leSamo.leLib;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LeTransparentBlock extends BlockBreakable {
	
	private static boolean field_149996_a;
    private static String field_149995_b;
    
	public LeTransparentBlock(Material material) {
		super(field_149995_b, material, field_149996_a);
	}

	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", "totalautomation" + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}