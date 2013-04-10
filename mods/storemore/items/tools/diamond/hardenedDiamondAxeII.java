package mods.storemore.items.tools.diamond;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class hardenedDiamondAxeII extends ItemAxe{

	public hardenedDiamondAxeII(int id, EnumToolMaterial hardenedDiamondII) {
		super(id, hardenedDiamondII);
		this.setCreativeTab(StoreMore.StoreMoreTab);	
		// TODO Auto-generated constructor stub
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}

