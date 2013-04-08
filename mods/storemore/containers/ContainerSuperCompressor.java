package mods.storemore.containers;

import mods.storemore.machine.SlotSuperCompressor;
import mods.storemore.machine.recipes.superCompressorRecipes;
import mods.storemore.machine.tileentities.TileSuperCompressor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerSuperCompressor extends Container
	{
	    private TileSuperCompressor furnace;
	    private int lastCookTime = 0;
	    private int lastBurnTime = 0;
	    private int lastItemBurnTime = 0;

	    public ContainerSuperCompressor(InventoryPlayer par1InventoryPlayer, TileSuperCompressor par2TileSuperCompressor)
	    {
	        this.furnace = par2TileSuperCompressor;
	        this.addSlotToContainer(new Slot(par2TileSuperCompressor, 0, 56, 17));
	        this.addSlotToContainer(new Slot(par2TileSuperCompressor, 1, 56, 53));
	        this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, par2TileSuperCompressor, 2, 116, 35));
	        int i;

	        for (i = 0; i < 3; ++i)
	        {
	            for (int j = 0; j < 9; ++j)
	            {
	                this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
	            }
	        }

	        for (i = 0; i < 9; ++i)
	        {
	            this.addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
	        }
	    }

	    public void addCraftingToCrafters(ICrafting par1ICrafting)
	    {
	        super.addCraftingToCrafters(par1ICrafting);
	        par1ICrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
	        par1ICrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
	        par1ICrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
	    }

	    /**
	     * Looks for changes made in the container, sends them to every listener.
	     */
	    public void detectAndSendChanges()
	    {
	        super.detectAndSendChanges();

	        for (int i = 0; i < this.crafters.size(); ++i)
	        {
	            ICrafting icrafting = (ICrafting)this.crafters.get(i);

	            if (this.lastCookTime != this.furnace.furnaceCookTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
	            }

	            if (this.lastBurnTime != this.furnace.furnaceBurnTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
	            }

	            if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
	            }
	        }

	        this.lastCookTime = this.furnace.furnaceCookTime;
	        this.lastBurnTime = this.furnace.furnaceBurnTime;
	        this.lastItemBurnTime = this.furnace.currentItemBurnTime;
	    }

	    @SideOnly(Side.CLIENT)
	    public void updateProgressBar(int par1, int par2)
	    {
	        if (par1 == 0)
	        {
	            this.furnace.furnaceCookTime = par2;
	        }

	        if (par1 == 1)
	        {
	            this.furnace.furnaceBurnTime = par2;
	        }

	        if (par1 == 2)
	        {
	            this.furnace.currentItemBurnTime = par2;
	        }
	    }

	    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	    {
	        return this.furnace.isUseableByPlayer(par1EntityPlayer);
	    }

	/**
	 * Called when a player shift-clicks on a slot. You must override this or
	 * you will crash when someone does that.
	 */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
            ItemStack stack = null;
            Slot slotObject = (Slot) inventorySlots.get(slot);

            //null checks and checks if the item can be stacked (maxStackSize > 1)
            if (slotObject != null && slotObject.getHasStack()) {
                    ItemStack stackInSlot = slotObject.getStack();
                    stack = stackInSlot.copy();

                    //merges the item into player inventory since its in the tileEntity
                    if (slot < 9) {
                            if (!this.mergeItemStack(stackInSlot, 3, 39, true)) {
                                    return null;
                            }
                    }
                    //places it into the tileEntity is possible since its in the player inventory
                    else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
                            return null;
                    }

                    if (stackInSlot.stackSize == 0) {
                            slotObject.putStack(null);
                    } else {
                            slotObject.onSlotChanged();
                    }

                    if (stackInSlot.stackSize == stack.stackSize) {
                            return null;
                    }
                    slotObject.onPickupFromSlot(player, stackInSlot);
            }
            return stack;
    }
}
