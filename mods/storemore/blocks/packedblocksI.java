package mods.storemore.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Icon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;




public class packedblocksI extends Block {
	public packedblocksI(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[16];
	
	
	public static Icon p_cobbleI,p_cobbleII,p_cobbleIII,p_cobbleIV,p_cobbleV,p_cobbleVI,p_cobbleVII,p_cobbleVIII,p_stoneI,p_stoneII,p_stoneIII,p_stoneIV,p_stoneV,p_stoneVI,p_stoneVII,p_stoneVIII;
	
@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_cobbleI");
icon[1] = iconRegister.registerIcon("storemore:p_cobbleII");
icon[2] = iconRegister.registerIcon("storemore:p_cobbleIII");
icon[3] = iconRegister.registerIcon("storemore:p_cobbleIV");
icon[4] = iconRegister.registerIcon("storemore:p_cobbleV");
icon[5] = iconRegister.registerIcon("storemore:p_cobbleVI");
icon[6] = iconRegister.registerIcon("storemore:p_cobbleVII");
icon[7] = iconRegister.registerIcon("storemore:p_cobbleVIII");
icon[8] = iconRegister.registerIcon("storemore:p_stoneI");
icon[9] = iconRegister.registerIcon("storemore:p_stoneII");
icon[10] = iconRegister.registerIcon("storemore:p_stoneIII");
icon[11] = iconRegister.registerIcon("storemore:p_stoneIV");
icon[12] = iconRegister.registerIcon("storemore:p_stoneV");
icon[13] = iconRegister.registerIcon("storemore:p_stoneVI");
icon[14] = iconRegister.registerIcon("storemore:p_stoneVII");
icon[15] = iconRegister.registerIcon("storemore:p_stoneVIII");
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