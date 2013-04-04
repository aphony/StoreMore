package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksVItem extends ItemBlock {

	public packedblocksVItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_ironI";
        case 1:return "p_ironII";
        case 2:return "p_ironIII";
        case 3:return "p_ironIV";
        case 4:return "p_goldI";
        case 5:return "p_goldII";
        case 6:return "p_goldIII";
        case 7:return "p_goldIV";
        case 8:return "p_diamondI";
        case 9:return "p_diamondII";
        case 10:return "p_diamondIII";
        case 11:return "p_diamondIV";
        case 12:return "p_emeraldI";
        case 13:return "p_emeraldII";
        case 14:return "p_emeraldIII";
        case 15:return "p_emeraldIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedblocksV.getBlockTextureFromSide(par1);
    }
  
}
