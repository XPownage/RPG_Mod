package com.XPownageNewoace.rpgmod;

import com.XPownageNewoace.rpgmod.Proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.XPownageNewoace.rpgmod.CustomRegistry.CustomItem;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = "required-after:FML")
public class Main {
    public static final String MODID = "RPGMod";
    public static final String MODNAME = "RPG MMO Mod";
    public static final String VERSION = "1.0";

    @Instance(value = MODID)
    public static Main instance;

    @SidedProxy(modId = MODID, clientSide = "com.XPownageNewoace.rpgmod.Proxy.ClientProxy", serverSide = "com.XPownageNewoace.rpgmod.Proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);


    }



    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}