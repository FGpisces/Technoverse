package com.leSamo.lib;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;

public class TAItem extends Item {
	
	private String lore;

	public TAItem() {
		super();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return String.format("item.%s%s", Reference.MID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName () {
		return String.format("item.%s%s", Reference.MID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
		super.addInformation(itemStack, entityPlayer, list, par4);
		list.add(getLoreDisplayName(itemStack));
	}

    public String getLoreDisplayName(ItemStack itemStack)
    {
        return ("" + StatCollector.translateToLocal(this.getUnlocalizedLoreInefficiently(itemStack) + ".desc.name")).trim();
    }

    public String getUnlocalizedLoreInefficiently(ItemStack itemStack)
    {
        String s = this.getUnlocalizedLore(itemStack);
        return s == null ? "" : StatCollector.translateToLocal(s);
    }
    
    public String getUnlocalizedLore(ItemStack itemstack) {
		return String.format("item.%s%s", Reference.MID + ":", getUnwrappedUnlocalizedLore(super.getUnlocalizedName()));
	}
    
    protected String getUnwrappedUnlocalizedLore(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}