package com.XPownageNewoace.rpgmod.CustomRegistry;

import com.XPownageNewoace.rpgmod.Blocks.*;
import com.XPownageNewoace.rpgmod.Main;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CustomBlock {

    public static Block copper_ore ;
    public static RuniteOre runite_ore ;
    public static AdamantiteOre adamantite_ore ;
    public static RuneEssenceOre rune_essence_ore ;




    public static void init() {


        runite_ore = new RuniteOre(); runite_ore.setUnlocalizedName("runite_ore") ; runite_ore.setCreativeTab(CreativeTabs.tabBlock) ;
        adamantite_ore = new AdamantiteOre() ; adamantite_ore.setUnlocalizedName("adamantite_ore") ; adamantite_ore.setCreativeTab(CreativeTabs.tabBlock) ;
        rune_essence_ore = new RuneEssenceOre() ; rune_essence_ore.setUnlocalizedName("rune_essence_ore") ; rune_essence_ore.setCreativeTab(CreativeTabs.tabBlock) ;
        copper_ore = new CopperOre(); copper_ore.setUnlocalizedName("copper_ore") ; copper_ore.setCreativeTab(CreativeTabs.tabBlock) ;
    }


    public static void registerRenders() {

        registerRender(copper_ore);
    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block) ;
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
