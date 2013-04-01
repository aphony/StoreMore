/*

package mods.storemore.blocks.blockitems;

import mods.storemore.common.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ic2blocksIItem extends ItemBlock {

	public ic2blocksIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_copperI";
        case 1:return "p_copperII";
        case 2:return "p_copperIII";
        case 3:return "p_copperIV";
        case 4:return "p_tinI";
        case 5:return "p_tinII";
        case 6:return "p_tinIII";
        case 7:return "p_tinIV";
        case 8:return "p_uraniumI";
        case 9:return "p_uraniumII";
        case 10:return "p_uraniumIII";
        case 11:return "p_uraniumIV";
        case 12:return "p_bronzeI";
        case 13:return "p_bronzeII";
        case 14:return "p_bronzeIII";
        case 15:return "p_bronzeIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.ic2blocksI.getBlockTextureFromSide(par1);
    }
  
}

*/