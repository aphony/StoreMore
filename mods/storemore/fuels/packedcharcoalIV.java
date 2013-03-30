package mods.storemore.fuels;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;



public class packedcharcoalIV extends Block {
	public packedcharcoalIV(int id, int texture) {
		super(id, Material.rock);
	    
	}

	protected Icon[] icon = new Icon[1];

	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	icon[0] = iconRegister.registerIcon("storemore:p_coalIV");
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
	for(int NumOfMets=0; NumOfMets<1; NumOfMets++){
		list.add(new ItemStack(par1, 1, NumOfMets));
	
}

}
}
