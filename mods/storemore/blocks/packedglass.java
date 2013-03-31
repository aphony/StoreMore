package mods.storemore.blocks;

import java.util.List;
import java.util.Random;

import mods.storemore.common.storemoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;




public class packedglass extends Block {
	
	protected Icon[] icon = new Icon [16];
	
	public packedglass(int id){
		super(id, Material.rock);
		setHardness(3.0F);
		setResistance(120.0F);
		setCreativeTab(storemoreMain.StoreMoreTab);
	    
	}
	
	

@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_glassI");
icon[1] = iconRegister.registerIcon("storemore:p_glassII");
icon[2] = iconRegister.registerIcon("storemore:p_glassIII");
icon[3] = iconRegister.registerIcon("storemore:p_glassIV");
}

@Override
public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
{
    return icon[meta];
} 

	
public int idDropped(int par1, Random par2Random, int par3)
{
    switch(par1){
    case 1:return storemoreMain.packedblocksVIII.blockID;
    case 2:return storemoreMain.packedblocksVIII.blockID;
    case 3:return storemoreMain.packedblocksVIII.blockID;
    case 4:return storemoreMain.packedblocksVIII.blockID;
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
}


}