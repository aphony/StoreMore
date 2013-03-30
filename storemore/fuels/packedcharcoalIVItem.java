package mods.storemore.fuels;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedcharcoalIVItem extends ItemBlock {

	public packedcharcoalIVItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedcharcoalIV";
		switch(is.getItemDamage()){
		case 0: {name = "charcoalIV";
		break;}
		default: name = "charcoalIV";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}
