package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksVIItem extends ItemBlock {

	public packedblocksVIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_sticksI";
        case 1:return "p_sticksII";
        case 2:return "p_sticksIII";
        case 3:return "p_sticksIV";
        case 4:return "p_torchesI";
        case 5:return "p_torchesII";
        case 6:return "p_torchesIII";
        case 7:return "p_torchesIV";
        case 8:return "p_gunpowderI";
        case 9:return "p_gunpowderII";
        case 10:return "p_gunpowderIII";
        case 11:return "p_gunpowderIV";
        case 12:return "p_flintI";
        case 13:return "p_flintII";
        case 14:return "p_flintIII";
        case 15:return "p_flintIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedblocksVI.getBlockTextureFromSide(par1);
    }
  
}