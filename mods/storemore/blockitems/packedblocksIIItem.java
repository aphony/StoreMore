package mods.storemore.blockitems;

import mods.storemore.storemoreMain;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class packedblocksIIItem extends ItemBlock {

	public packedblocksIIItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "p_dirtI";
        case 1:return "p_dirtII";
        case 2:return "p_dirtIII";
        case 3:return "p_dirtIV";
        case 4:return "p_dirtV";
        case 5:return "p_dirtVI";
        case 6:return "p_dirtVII";
        case 7:return "p_dirtVIII";
        case 8:return "p_gravelI";
        case 9:return "p_gravelII";
        case 10:return "p_gravelIII";
        case 11:return "p_gravelIV";
        case 12:return "p_gravelV";
        case 13:return "p_gravelVI";
        case 14:return "p_gravelVII";
        case 15:return "p_gravelVIII";
        default:return "";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return storemoreMain.packedblocksII.getBlockTextureFromSide(par1);
    }
  
}