package mods.storemore.items.tools.diamond;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class hardenedDiamondSwordIV extends ItemSword{

	public hardenedDiamondSwordIV(int id, EnumToolMaterial hardenedDiamondIV) {
		super(id, hardenedDiamondIV);
		this.setCreativeTab(StoreMore.StoreMoreTab);	
		// TODO Auto-generated constructor stub
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}