package mods.storemore.items.tools.stone;

import mods.storemore.StoreMore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class hardenedStonePickaxeIV extends ItemPickaxe{

	public hardenedStonePickaxeIV(int id, EnumToolMaterial hardenedStoneIV) {
		super(id, hardenedStoneIV);
		this.setCreativeTab(StoreMore.StoreMoreTab);		
	}
	
	public void updateIcons(IconRegister par1IconRegister)
	{
	    this.iconIndex = par1IconRegister.registerIcon(StoreMore.MODtextures + ":" + this.getUnlocalizedName());
	}


}