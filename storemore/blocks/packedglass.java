package mods.storemore.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;



public class packedglass extends Block {
	public packedglass(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[2];
	


@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_glassI");
icon[1] = iconRegister.registerIcon("storemore:p_glassII");
}

@SideOnly(Side.CLIENT)
public Icon getIconFromDamage(int i)
{
return icon[i];
}

	
@Override
public int damageDropped(int meta){
	return meta;
	
}
@SideOnly(Side.CLIENT)
public void getSubBlocks(int par1, CreativeTabs tab, List list){
	for(int NumOfMets=0; NumOfMets<4; NumOfMets++){
		list.add(new ItemStack(par1, 1, NumOfMets));}
	
}

	public int getRenderBlockPass() //Put 0 for fully transparent or opaque blocks, and 1 for semi-transparent
	{
	         return 1;
	}

	public boolean isOpaqueCube() //Tells the game if the block is transparent
	{
	         return false;
	}

	public boolean renderAsNormalBlock() //Tells the game how to render the block
	{
	         return false;
	}

	protected boolean canSilkHarvest() //Tells the game if silk touch can harvest the block
	{
	         return true;
	}

	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) //Renders neighbouring blocks
	{

	int i = par1IBlockAccess.getBlockId(par2, par3, par4);

	return i == blockID ? false:true;
	}

}

