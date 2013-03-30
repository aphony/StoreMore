package mods.storemore.fuels;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedcoalIIIItem extends ItemBlock {

	public packedcoalIIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedcoalIII";
		switch(is.getItemDamage()){
		case 0: {name = "coalIII";
		break;}
		default: name = "coalIII";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}
