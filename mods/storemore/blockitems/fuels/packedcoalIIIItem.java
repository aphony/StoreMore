package mods.storemore.blockitems.fuels;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedcoalIIIItem extends ItemBlock {

	public packedcoalIIIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_coalIII";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return StoreMore.packedcoalIII.getBlockTextureFromSide(par1);
    }
  
}
