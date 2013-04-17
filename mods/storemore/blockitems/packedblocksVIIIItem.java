package mods.storemore.blockitems;

import mods.storemore.StoreMore;
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
        case 0:return "p_planksI";
        case 1:return "p_planksII";
        case 2:return "p_planksIII";
        case 3:return "p_planksIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return StoreMore.packedblocksVIII.getBlockTextureFromSide(par1);
        }
      
    }
