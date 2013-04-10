package mods.storemore.items.tools;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class hardenedDiamondShovelI extends ItemSpade{

	public hardenedDiamondShovelI(int id, EnumToolMaterial hardenedDiamondI) {
		super(id, hardenedDiamondI);
		this.setCreativeTab(StoreMore.StoreMoreTab);	
		// TODO Auto-generated constructor stub
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}
