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



public class packedblocksIV extends Block {
	public packedblocksIV(int id, int texture) {
		super(id, Material.rock);
	    
	}
	protected Icon[] icon = new Icon[12];
	


@Override
public void registerIcons(IconRegister iconRegister)
{
icon[0] = iconRegister.registerIcon("storemore:p_obsidianI");
icon[1] = iconRegister.registerIcon("storemore:p_obsidianII");
icon[2] = iconRegister.registerIcon("storemore:p_obsidianIII");
icon[3] = iconRegister.registerIcon("storemore:p_obsidianIV");
icon[4] = iconRegister.registerIcon("storemore:p_netherrackI");
icon[5] = iconRegister.registerIcon("storemore:p_netherrackII");
icon[6] = iconRegister.registerIcon("storemore:p_netherrackIII");
icon[7] = iconRegister.registerIcon("storemore:p_netherrackIV");
icon[8] = iconRegister.registerIcon("storemore:p_glowstoneI");
icon[9] = iconRegister.registerIcon("storemore:p_glowstoneII");
icon[10] = iconRegister.registerIcon("storemore:p_glowstoneIII");
icon[11] = iconRegister.registerIcon("storemore:p_glowstoneIV");
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
	for(int NumOfMets=0; NumOfMets<12; NumOfMets++){
		list.add(new ItemStack(par1, 1, NumOfMets));}
	
}
}