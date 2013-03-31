package mods.storemore.blocks.blockitems;

import mods.storemore.common.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksIVItem extends ItemBlock {

	public packedblocksIVItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_obsidianI";
        case 1:return "p_obsidianII";
        case 2:return "p_obsidianIII";
        case 3:return "p_obsidianIV";
        case 4:return "p_netherrackI";
        case 5:return "p_netherrackII";
        case 6:return "p_netherrackIII";
        case 7:return "p_netherrackIV";
        case 8:return "p_glowstoneI";
        case 9:return "p_glowstoneII";
        case 10:return "p_glowstoneIII";
        case 11:return "p_glowstoneIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedblocksIV.getBlockTextureFromSide(par1);
    }
  
}
