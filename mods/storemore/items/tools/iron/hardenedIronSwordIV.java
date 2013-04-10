package mods.storemore.items.tools.iron;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class hardenedIronSwordIV  extends ItemSword{

	public hardenedIronSwordIV(int id, EnumToolMaterial hardenedIronIV) {
		super(id, hardenedIronIV);
		this.setCreativeTab(StoreMore.StoreMoreTab);	
		// TODO Auto-generated constructor stub
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}