package com.XPownageNewoace.rpgmod.Proxy;

import com.XPownageNewoace.rpgmod.Main;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e)
    {



    }

    public void init(FMLInitializationEvent e)
    {

      //  NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new RPGGuiHandler());

    }

    public void postInit(FMLPostInitializationEvent e)
    {



    }
    public void registerItemSided(Item item)
    {

    }
}
