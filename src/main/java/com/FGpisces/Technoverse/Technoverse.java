package com.FGpisces.Technoverse;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="Technoverse", name="Technoverse", version="0.01")
public class Technoverse
{	
    @Mod.Instance("Technoverse")
    public static Technoverse instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	BlockReg.init();
    }
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
	
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
    }
}
