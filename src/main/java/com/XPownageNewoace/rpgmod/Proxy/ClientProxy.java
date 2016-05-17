package com.XPownageNewoace.rpgmod.Proxy;

import com.XPownageNewoace.rpgmod.CustomRegistry.CustomItem;
import com.XPownageNewoace.rpgmod.Main;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.XPownageNewoace.rpgmod.CustomRegistry.CustomBlock;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        CustomBlock.init();
        CustomItem.init();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

      //  NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new RPGGuiHandler());
        //Register Blocks


        CustomBlock.registerRenders();
        CustomItem.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }



}