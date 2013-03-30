package mods.storemore.fuels;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedcoalIIItem extends ItemBlock {

	public packedcoalIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedcoalII";
		switch(is.getItemDamage()){
		case 0: {name = "coalII";
		break;}
		default: name = "coalII";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}
