package com.terriblety.mod.init;

public class ModItems {
public static Item magnesiumIngot = new FirstModItem().setUnlocalizedName("magnesiumIngot");
	public static void init()
    {
	RegisterHelper.registerItem(magnesiumIngot);
    }
}
