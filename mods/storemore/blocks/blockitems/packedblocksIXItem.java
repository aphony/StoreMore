package mods.storemore.blocks.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksIXItem extends ItemBlock {

	public packedblocksIXItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_redstoneI";
        case 1:return "p_redstoneII";
        case 2:return "p_redstoneIII";
        case 3:return "p_redstoneIV";
        case 4:return "p_quartzI";
        case 5:return "p_quartzII";
        case 6:return "p_quartzIII";
        case 7:return "p_quartzIV";
        case 8:return "p_soulsandI";
        case 9:return "p_soulsandII";
        case 10:return "p_soulsandIII";
        case 11:return "p_soulsandIV";
        case 12:return "p_clayI";
        case 13:return "p_clayII";
        case 14:return "p_clayIII";
        case 15:return "p_clayIV";
        default:return "";
        }

	}
        
    	public int getMetadata(int meta){
    		return meta;
    	
    	}
    	
    	@SideOnly(Side.CLIENT)
        public Icon getIconFromDamage(int par1)
        {
            return storemoreMain.packedblocksIX.getBlockTextureFromSide(par1);
        }
      
    }
