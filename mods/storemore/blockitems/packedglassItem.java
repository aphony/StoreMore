package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedglassItem extends ItemBlock {

	public packedglassItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_glassI";
        case 1:return "p_glassII";
        case 2:return "p_glassIII";
        case 3:return "p_glassIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return StoreMore.packedglass.getBlockTextureFromSide(par1);
    }
  
}
