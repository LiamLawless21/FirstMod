package com.terriblety.mod;

import com.terriblety.mod.init.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FirstMod {
@EventHandler
public void preInit(FMLPreInitializationEvent event)
{
ModItems.init();	
}
@EventHandler
public void init(FMLInitializationEvent event)
{
	
}
@EventHandler
public void init(FMLPostInitializationEvent event)
{
	
}
}

