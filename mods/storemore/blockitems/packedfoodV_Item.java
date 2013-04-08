package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedfoodV_Item extends ItemBlock {

	public packedfoodV_Item(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_rawfishI";
        case 1:return "p_rawfishII";
        case 2:return "p_rawfishIII";
        case 3:return "p_rawfishIV";
        case 4:return "p_cookedfishI";
        case 5:return "p_cookedfishII";
        case 6:return "p_cookedfishIII";
        case 7:return "p_cookedfishIV";
        case 8:return "p_rawporkI";
        case 9:return "p_rawporkII";
        case 10:return "p_rawporkIII";
        case 11:return "p_rawporkIV";
        case 12:return "p_cookedporkI";
        case 13:return "p_cookedporkII";
        case 14:return "p_cookedporkIII";
        case 15:return "p_cookedporkIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return StoreMore.packedfoodV.getBlockTextureFromSide(par1);
        }
      
    }
