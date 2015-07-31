package com.leSamo.leLib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.leSamo.TotalAutomation.reg.ItemReg;

public class LeCreativeTab {
	
	public static final CreativeTabs TATab = new CreativeTabs("TotalAutomation") {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(ItemReg.Cerium);
		}

		@Override
		public Item getTabIconItem() {
			return getIconItemStack().getItem();
		}
		
		public boolean hasSearchBar()
	    {
	        return false;
	    }
	};
}
