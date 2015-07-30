package com.leSamo.lib;

import com.FGpisces.Technoverse.BlockReg;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TACreativeTab {
	
	public static final CreativeTabs TATab = new CreativeTabs(Reference.MID) {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(BlockReg.Ironstone);
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
