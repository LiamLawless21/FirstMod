package com.terriblety.mod.init;

import com.terriblety.mod.help.RegisterHelper;
import com.terriblety.mod.items.FirstModItem;

import net.minecraft.item.Item;

public class ModItems {
public static Item magnesiumIngot = new FirstModItem().setUnlocalizedName("magnesiumIngot");
	public static void init()
    {
	RegisterHelper.registerItem(magnesiumIngot);
    }
}
