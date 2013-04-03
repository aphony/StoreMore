package mods.storemore.blocks.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksVIIIItem extends ItemBlock {

	public packedblocksVIIIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_oakplanksI";
        case 1:return "p_oakplanksII";
        case 2:return "p_oakplanksIII";
        case 3:return "p_oakplanksIV";
        case 4:return "p_birchplanksI";
        case 5:return "p_birchplanksII";
        case 6:return "p_birchplanksIII";
        case 7:return "p_birchplanksIV";
        case 8:return "p_spruceplanksI";
        case 9:return "p_spruceplanksII";
        case 10:return "p_spruceplanksIII";
        case 11:return "p_spruceplanksIV";
        case 12:return "p_jungleplanksI";
        case 13:return "p_jungleplanksII";
        case 14:return "p_jungleplanksIII";
        case 15:return "p_jungleplanksIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return storemoreMain.packedblocksVIII.getBlockTextureFromSide(par1);
        }
      
    }
