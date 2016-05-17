package com.XPownageNewoace.rpgmod.CustomRegistry;

import com.XPownageNewoace.rpgmod.Items.CopperPickaxe;
import com.XPownageNewoace.rpgmod.Main;
import com.sun.org.apache.xml.internal.security.encryption.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.XPownageNewoace.rpgmod.Proxy.ClientProxy;

public class CustomItem {

// Items
    public static Item copper_ingot;
    public static Item tin_ingot;
    public static Item bronze_ingot;
    public static Item mithril_ingot;
    public static Item steel_ingot;
    public static Item runite_ingot;
    public static Item silver_ingot;
    public static Item adamantite_ingot;
// Tools
    public static Item copper_pickaxe ;
    public static Item.ToolMaterial CopperPickaxe = EnumHelper.addToolMaterial("Copper Pickaxe", 2, 5000, 8.0F, 3.0F, 10) ;



    public static void init()
    {
        copper_ingot = registerItem(new Item(), "copper_ingot").setUnlocalizedName("copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        tin_ingot = registerItem(new Item(), "tin_ingot").setUnlocalizedName("tin_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        bronze_ingot = registerItem(new Item(), "bronze_ingot").setUnlocalizedName("bronze_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        mithril_ingot = registerItem(new Item(), "mithril_ingot").setUnlocalizedName("mithril_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        steel_ingot = registerItem(new Item(), "steel_ingot").setUnlocalizedName("steel_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        runite_ingot = registerItem(new Item(), "runite_ingot").setUnlocalizedName("runite_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        silver_ingot = registerItem(new Item(), "silver_ingot").setUnlocalizedName("silver_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        adamantite_ingot = registerItem(new Item(), "adamantite_ingot").setUnlocalizedName("adamantite_ingot").setCreativeTab(CreativeTabs.tabMaterials);


        //Game Registry
        GameRegistry.register(copper_pickaxe = new CopperPickaxe("copper_pickaxe", CopperPickaxe)) ;
    }

    public static void registerRenders()
    {
        registerRender(copper_ingot);
        registerRender(tin_ingot);
        registerRender(mithril_ingot);
        registerRender(bronze_ingot);
        registerRender(steel_ingot);
        registerRender(runite_ingot);
        registerRender(silver_ingot);
        registerRender(adamantite_ingot);
        registerRender(copper_pickaxe);

    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }


















    public static Item registerItem(Item item, String name)
    {
        return registerItem(item, name, null);
    }

    public static Item registerItem(Item item, String name, CreativeTabs tab)
    {
        GameRegistry.register(item, new ResourceLocation(Main.MODID, name));
        return item;
    }


}