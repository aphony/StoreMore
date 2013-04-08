package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedfoodIII_Item extends ItemBlock {

	public packedfoodIII_Item(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_rawchickenI";
        case 1:return "p_rawchickenII";
        case 2:return "p_rawchickenIII";
        case 3:return "p_rawchickenIV";
        case 4:return "p_cookedchickenI";
        case 5:return "p_cookedchickenII";
        case 6:return "p_cookedchickenIII";
        case 7:return "p_cookedchickenIV";
        case 8:return "p_cookiesI";
        case 9:return "p_cookiesII";
        case 10:return "p_cookiesIII";
        case 11:return "p_cookiesIV";
        case 12:return "p_eggI";
        case 13:return "p_eggII";
        case 14:return "p_eggIII";
        case 15:return "p_eggIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return StoreMore.packedfoodIII.getBlockTextureFromSide(par1);
        }
      
    }
