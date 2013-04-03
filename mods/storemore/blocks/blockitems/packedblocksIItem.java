package mods.storemore.blocks.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksIItem extends ItemBlock {

	public packedblocksIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_cobbleI";
        case 1:return "p_cobbleII";
        case 2:return "p_cobbleIII";
        case 3:return "p_cobbleIV";
        case 4:return "p_cobbleV";
        case 5:return "p_cobbleVI";
        case 6:return "p_cobbleVII";
        case 7:return "p_cobbleVIII";
        case 8:return "p_stoneI";
        case 9:return "p_stoneII";
        case 10:return "p_stoneIII";
        case 11:return "p_stoneIV";
        case 12:return "p_stoneV";
        case 13:return "p_stoneVI";
        case 14:return "p_stoneVII";
        case 15:return "p_stoneVIII";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedblocksI.getBlockTextureFromSide(par1);
    }
  
}
