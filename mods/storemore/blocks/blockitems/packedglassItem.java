package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedglassItem extends ItemBlock {

	public packedglassItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedglass";
		switch(is.getItemDamage()){
		case 0: {name = "glassI";
		break;}
		case 1: {name = "glassII";
		break;}
		case 2: {name = "glassIII";
		break;}
		case 3: {name = "glassIV";
		break;}
		default: name = "glassI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}