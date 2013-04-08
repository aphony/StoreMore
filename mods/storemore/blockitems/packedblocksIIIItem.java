package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksIIIItem extends ItemBlock {

	public packedblocksIIIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_sandI";
        case 1:return "p_sandII";
        case 2:return "p_sandIII";
        case 3:return "p_sandIV";
        case 4:return "p_sandV";
        case 5:return "p_sandVI";
        case 6:return "p_sandVII";
        case 7:return "p_sandVIII";
        case 8:return "p_sandstoneI";
        case 9:return "p_sandstoneII";
        case 10:return "p_sandstoneIII";
        case 11:return "p_sandstoneIV";
        case 12:return "p_sandstoneV";
        case 13:return "p_sandstoneVI";
        case 14:return "p_sandstoneVII";
        case 15:return "p_sandstoneVIII";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return StoreMore.packedblocksIII.getBlockTextureFromSide(par1);
    }
  
}
