package mods.storemore.blockitems;

import mods.storemore.StoreMore;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksVIIItem extends ItemBlock {

	public packedblocksVIIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_woodI";
        case 1:return "p_woodII";
        case 2:return "p_woodIII";
        case 3:return "p_woodIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return StoreMore.packedblocksVII.getBlockTextureFromSide(par1);
        }
      
    }
