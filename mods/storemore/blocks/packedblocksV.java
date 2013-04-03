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




public class packedblocksV extends Block {
	
	protected Icon[] icon = new Icon [16];
	
	public packedblocksV(int id){
		super(id, Material.rock);
		setHardness(3.0F);
		setResistance(120.0F);
		setCreativeTab(storemoreMain.StoreMoreTab);
	    
	}
	
	
	
@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_ironI");
icon[1] = iconRegister.registerIcon("storemore:p_ironII");
icon[2] = iconRegister.registerIcon("storemore:p_ironIII");
icon[3] = iconRegister.registerIcon("storemore:p_ironIV");
icon[4] = iconRegister.registerIcon("storemore:p_goldI");
icon[5] = iconRegister.registerIcon("storemore:p_goldII");
icon[6] = iconRegister.registerIcon("storemore:p_goldIII");
icon[7] = iconRegister.registerIcon("storemore:p_goldIV");
icon[8] = iconRegister.registerIcon("storemore:p_diamondI");
icon[9] = iconRegister.registerIcon("storemore:p_diamondII");
icon[10] = iconRegister.registerIcon("storemore:p_diamondIII");
icon[11] = iconRegister.registerIcon("storemore:p_diamondIV");
icon[12] = iconRegister.registerIcon("storemore:p_emeraldI");
icon[13] = iconRegister.registerIcon("storemore:p_emeraldII");
icon[14] = iconRegister.registerIcon("storemore:p_emeraldIII");
icon[15] = iconRegister.registerIcon("storemore:p_emeraldIV");
}

@Override
public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
{
    return icon[meta];
} 

	
public int idDropped(int par1, Random par2Random, int par3)
{
    switch(par1){
    case 1:return storemoreMain.packedblocksV.blockID;
    case 2:return storemoreMain.packedblocksV.blockID;
    case 3:return storemoreMain.packedblocksV.blockID;
    case 4:return storemoreMain.packedblocksV.blockID;
    case 5:return storemoreMain.packedblocksV.blockID;
    case 6:return storemoreMain.packedblocksV.blockID;
    case 7:return storemoreMain.packedblocksV.blockID;
    case 8:return storemoreMain.packedblocksV.blockID;
    case 9:return storemoreMain.packedblocksV.blockID;
    case 10:return storemoreMain.packedblocksV.blockID;
    case 11:return storemoreMain.packedblocksV.blockID;
    case 12:return storemoreMain.packedblocksV.blockID;
    case 13:return storemoreMain.packedblocksV.blockID;
    case 14:return storemoreMain.packedblocksV.blockID;
    case 15:return storemoreMain.packedblocksV.blockID;
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
    list.add(new ItemStack(i,1,12));
    list.add(new ItemStack(i,1,13));
    list.add(new ItemStack(i,1,14));
    list.add(new ItemStack(i,1,15));
}


}