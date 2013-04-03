package mods.storemore.fuels;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedcoalIVItem extends ItemBlock {

	public packedcoalIVItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_coalIV";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedcoalIV.getBlockTextureFromSide(par1);
    }
  
}
