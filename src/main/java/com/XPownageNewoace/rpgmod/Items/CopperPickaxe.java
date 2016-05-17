package com.XPownageNewoace.rpgmod.Items;

import net.minecraft.item.ItemPickaxe;


public class CopperPickaxe extends ItemPickaxe {

    public CopperPickaxe(String unlocalizedNme, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedNme) ;
        this.setRegistryName("copper_pickaxe");
    }

}
