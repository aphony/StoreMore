package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedfoodIV_Item extends ItemBlock {

	public packedfoodIV_Item(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_sugarI";
        case 1:return "p_sugarII";
        case 2:return "p_sugarIII";
        case 3:return "p_sugarIV";
        case 4:return "p_potatoI";
        case 5:return "p_potatoII";
        case 6:return "p_potatoIII";
        case 7:return "p_potatoIV";
        case 8:return "p_bakedpotatoI";
        case 9:return "p_bakedpotatoII";
        case 10:return "p_bakedpotatoIII";
        case 11:return "p_bakedpotatoIV";
        case 12:return "p_poisonedpotatoI";
        case 13:return "p_poisonedpotatoII";
        case 14:return "p_poisonedpotatoIII";
        case 15:return "p_poisonedpotatoIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return storemoreMain.packedfoodIV.getBlockTextureFromSide(par1);
        }
      
    }
