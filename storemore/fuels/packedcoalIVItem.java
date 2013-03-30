package mods.storemore.fuels;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedcoalIVItem extends ItemBlock {

	public packedcoalIVItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedcoalIV";
		switch(is.getItemDamage()){
		case 0: {name = "coalIV";
		break;}
		default: name = "coalIV";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}
