package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedfoodII_Item extends ItemBlock {

	public packedfoodII_Item(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_breadI";
        case 1:return "p_breadII";
        case 2:return "p_breadIII";
        case 3:return "p_breadIV";
        case 4:return "p_cakeI";
        case 5:return "p_cakeII";
        case 6:return "p_cakeIII";
        case 7:return "p_cakeIV";
        case 8:return "p_carrotI";
        case 9:return "p_carrotII";
        case 10:return "p_carrotIII";
        case 11:return "p_carrotIV";
        case 12:return "p_goldcarrotI";
        case 13:return "p_goldcarrotII";
        case 14:return "p_goldcarrotIII";
        case 15:return "p_goldcarrotIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return storemoreMain.packedfoodII.getBlockTextureFromSide(par1);
        }
      
    }
