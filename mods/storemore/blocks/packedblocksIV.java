package mods.storemore.blocks;

import java.util.List;
import java.util.Random;

import mods.storemore.storemoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;




public class packedblocksIV extends Block {
	
	protected Icon[] icon = new Icon [12];
	
	public packedblocksIV(int id){
		super(id, Material.rock);
		setHardness(3.0F);
		setResistance(120.0F);
		setCreativeTab(storemoreMain.StoreMoreTab);
	    
	}
	
	
	

@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_obsidianI");
icon[1] = iconRegister.registerIcon("storemore:p_obsidianII");
icon[2] = iconRegister.registerIcon("storemore:p_obsidianIII");
icon[3] = iconRegister.registerIcon("storemore:p_obsidianIV");
icon[4] = iconRegister.registerIcon("storemore:p_glowstoneI");
icon[5] = iconRegister.registerIcon("storemore:p_glowstoneII");
icon[6] = iconRegister.registerIcon("storemore:p_glowstoneIII");
icon[7] = iconRegister.registerIcon("storemore:p_glowstoneIV");
icon[8] = iconRegister.registerIcon("storemore:p_netherrackI");
icon[9] = iconRegister.registerIcon("storemore:p_netherrackII");
icon[10] = iconRegister.registerIcon("storemore:p_netherrackIII");
icon[11] = iconRegister.registerIcon("storemore:p_netherrackIV");
}

@Override
public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
{
    return icon[meta];
} 

	
public int idDropped(int par1, Random par2Random, int par3)
{
    switch(par1){
    case 1:return storemoreMain.packedblocksIV.blockID;
    case 2:return storemoreMain.packedblocksIV.blockID;
    case 3:return storemoreMain.packedblocksIV.blockID;
    case 4:return storemoreMain.packedblocksIV.blockID;
    case 5:return storemoreMain.packedblocksIV.blockID;
    case 6:return storemoreMain.packedblocksIV.blockID;
    case 7:return storemoreMain.packedblocksIV.blockID;
    case 8:return storemoreMain.packedblocksIV.blockID;
    case 9:return storemoreMain.packedblocksIV.blockID;
    case 10:return storemoreMain.packedblocksIV.blockID;
    case 11:return storemoreMain.packedblocksIV.blockID;
    default:return blockID;
    }
}

@Override
public int damageDropped(int meta){
return meta;
}

public int idPicked(World par1World, int par2, int par3, int par4)
{
    return this.blockID;
}
  
public ItemStack getPickBlock(MovingObjectPosition target,World world, int x, int y, int z)
{
    return null;
}
  
public void getSubBlocks(int i,CreativeTabs tab, List list)
{
    list.add(new ItemStack(i,1,0));
    list.add(new ItemStack(i,1,1));
    list.add(new ItemStack(i,1,2));
    list.add(new ItemStack(i,1,3));
    list.add(new ItemStack(i,1,4));
    list.add(new ItemStack(i,1,5));
    list.add(new ItemStack(i,1,6));
    list.add(new ItemStack(i,1,7));
    list.add(new ItemStack(i,1,8));
    list.add(new ItemStack(i,1,9));
    list.add(new ItemStack(i,1,10));
    list.add(new ItemStack(i,1,11));
}


}