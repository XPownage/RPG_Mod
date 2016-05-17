package com.XPownageNewoace.rpgmod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RuneEssenceOre extends Block {

    public RuneEssenceOre () {
        super(Material.rock) ;
        setRegistryName("Rune Essence Ore") ;
        GameRegistry.register(this) ;
        GameRegistry.register(new ItemBlock(this), getRegistryName()) ;
    }
}
