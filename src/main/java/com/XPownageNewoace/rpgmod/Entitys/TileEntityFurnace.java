package com.XPownageNewoace.rpgmod.Entitys;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;

/**
 * Created by davin on 5/15/16.
 */
public class TileEntityFurnace extends TileEntity implements IInventory {

    private ItemStack[] inv ;

    public TileEntityFurnace() {
        inv = new ItemStack[9] ;
    }

//
    @Override
    public int getSizeInventory() {
        return inv.length;
    }
//
    @Override
    public ItemStack getStackInSlot(int index) {
        return inv[index];
    }
//
    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack stack = getStackInSlot(index) ;
        if (stack != null) {
            if (stack.stackSize <= count) {
                setInventorySlotContents(index, null) ;
            } else {
                stack = stack.splitStack(count) ;
                if (stack.stackSize == 0) {

                    setInventorySlotContents(index, null);
                }
            }
        }
        return stack ;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }
//
    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        inv[index] = stack ;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit() ;
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return null;
    }
}
