package mods.storemore.items;

import mods.storemore.StoreMore;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PackedStone1 extends Item
{
    public PackedStone1(int par1)
    {
        super(par1);
        this.maxStackSize = 64;
        this.setCreativeTab(StoreMore.StoreMoreTab);
    }

   
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("storemore" + ":" + this.getUnlocalizedName());
    } 
}
