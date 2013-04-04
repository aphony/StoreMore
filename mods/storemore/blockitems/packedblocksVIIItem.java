package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
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
        case 0:return "p_oakwoodI";
        case 1:return "p_oakwoodII";
        case 2:return "p_oakwoodIII";
        case 3:return "p_oakwoodIV";
        case 4:return "p_birchwoodI";
        case 5:return "p_birchwoodII";
        case 6:return "p_birchwoodIII";
        case 7:return "p_birchwoodIV";
        case 8:return "p_sprucewoodI";
        case 9:return "p_sprucewoodII";
        case 10:return "p_sprucewoodIII";
        case 11:return "p_sprucewoodIV";
        case 12:return "p_junglewoodI";
        case 13:return "p_junglewoodII";
        case 14:return "p_junglewoodIII";
        case 15:return "p_junglewoodIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return storemoreMain.packedblocksVII.getBlockTextureFromSide(par1);
        }
      
    }
