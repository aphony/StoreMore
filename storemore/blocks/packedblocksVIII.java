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



public class packedblocksVIII extends Block {
	public packedblocksVIII(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[16];
	


@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_planksI");
icon[1] = iconRegister.registerIcon("storemore:p_planksII");
icon[2] = iconRegister.registerIcon("storemore:p_planksIII");
icon[3] = iconRegister.registerIcon("storemore:p_planksIV");
icon[4] = iconRegister.registerIcon("storemore:p_planksI");
icon[5] = iconRegister.registerIcon("storemore:p_planksII");
icon[6] = iconRegister.registerIcon("storemore:p_planksIII");
icon[7] = iconRegister.registerIcon("storemore:p_planksIV");
icon[8] = iconRegister.registerIcon("storemore:p_planksI");
icon[9] = iconRegister.registerIcon("storemore:p_planksII");
icon[10] = iconRegister.registerIcon("storemore:p_planksIII");
icon[11] = iconRegister.registerIcon("storemore:p_planksIV");
icon[12] = iconRegister.registerIcon("storemore:p_planksI");
icon[13] = iconRegister.registerIcon("storemore:p_planksII");
icon[14] = iconRegister.registerIcon("storemore:p_planksIII");
icon[15] = iconRegister.registerIcon("storemore:p_planksIV");
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
	for(int NumOfMets=0; NumOfMets<16; NumOfMets++){
		list.add(new ItemStack(par1, 1, NumOfMets));}
	
}
}