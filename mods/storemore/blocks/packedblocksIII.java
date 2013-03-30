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



public class packedblocksIII extends Block {
	public packedblocksIII(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[16];
	


@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_sandI");
icon[1] = iconRegister.registerIcon("storemore:p_sandII");
icon[2] = iconRegister.registerIcon("storemore:p_sandIII");
icon[3] = iconRegister.registerIcon("storemore:p_sandIV");
icon[4] = iconRegister.registerIcon("storemore:p_sandV");
icon[5] = iconRegister.registerIcon("storemore:p_sandVI");
icon[6] = iconRegister.registerIcon("storemore:p_sandVII");
icon[7] = iconRegister.registerIcon("storemore:p_sandVIII");
icon[8] = iconRegister.registerIcon("storemore:p_sandstoneI");
icon[9] = iconRegister.registerIcon("storemore:p_sandstoneII");
icon[10] = iconRegister.registerIcon("storemore:p_sandstoneIII");
icon[11] = iconRegister.registerIcon("storemore:p_sandstoneIV");
icon[12] = iconRegister.registerIcon("storemore:p_sandstoneV");
icon[13] = iconRegister.registerIcon("storemore:p_sandstoneVI");
icon[14] = iconRegister.registerIcon("storemore:p_sandstoneVII");
icon[15] = iconRegister.registerIcon("storemore:p_sandstoneVIII");
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