package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedfoodI_Item extends ItemBlock {

	public packedfoodI_Item(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_appleI";
        case 1:return "p_appleII";
        case 2:return "p_appleIII";
        case 3:return "p_appleIV";
        case 4:return "p_goldappleI";
        case 5:return "p_goldappleII";
        case 6:return "p_goldappleIII";
        case 7:return "p_goldappleIV";
        case 8:return "p_rawbeefI";
        case 9:return "p_rawbeefII";
        case 10:return "p_rawbeefIII";
        case 11:return "p_rawbeefIV";
        case 12:return "p_cookedbeefI";
        case 13:return "p_cookedbeefII";
        case 14:return "p_cookedbeefIII";
        case 15:return "p_cookedbeefIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return StoreMore.packedfoodI.getBlockTextureFromSide(par1);
        }
      
    }
