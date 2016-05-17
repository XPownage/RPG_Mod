package com.XPownageNewoace.rpgmod.Blocks;

import com.XPownageNewoace.rpgmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperOre extends Block {

    public CopperOre () {
        super(Material.rock) ;
        setRegistryName("copper_ore");
        this.setHardness(1.0f);
        this.setStepSound(SoundType.STONE);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
