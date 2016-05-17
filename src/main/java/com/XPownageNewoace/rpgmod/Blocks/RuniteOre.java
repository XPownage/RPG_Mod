package com.XPownageNewoace.rpgmod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RuniteOre extends Block {

    public RuniteOre () {
        super(Material.rock) ;
        setRegistryName("Runite Ore") ;
        GameRegistry.register(this) ;
        GameRegistry.register(new ItemBlock(this), getRegistryName()) ;
    }
}
