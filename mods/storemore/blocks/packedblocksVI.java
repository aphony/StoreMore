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



public class packedblocksVI extends Block {
	public packedblocksVI(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[16];
	


@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_sticksI");
icon[1] = iconRegister.registerIcon("storemore:p_sticksII");
icon[2] = iconRegister.registerIcon("storemore:p_sticksIII");
icon[3] = iconRegister.registerIcon("storemore:p_sticksIV");
icon[4] = iconRegister.registerIcon("storemore:p_torchesI");
icon[5] = iconRegister.registerIcon("storemore:p_torchesII");
icon[6] = iconRegister.registerIcon("storemore:p_torchesIII");
icon[7] = iconRegister.registerIcon("storemore:p_torchesIV");
icon[8] = iconRegister.registerIcon("storemore:p_gunpowderI");
icon[9] = iconRegister.registerIcon("storemore:p_gunpowderII");
icon[10] = iconRegister.registerIcon("storemore:p_gunpowderIII");
icon[11] = iconRegister.registerIcon("storemore:p_gunpowderIV");
icon[12] = iconRegister.registerIcon("storemore:p_flintI");
icon[13] = iconRegister.registerIcon("storemore:p_flintII");
icon[14] = iconRegister.registerIcon("storemore:p_flintIII");
icon[15] = iconRegister.registerIcon("storemore:p_flintIV");
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