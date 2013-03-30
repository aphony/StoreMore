package mods.storemore.fuels;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedcharcoalIIItem extends ItemBlock {

	public packedcharcoalIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedcharcoalII";
		switch(is.getItemDamage()){
		case 0: {name = "charcoalII";
		break;}
		default: name = "charcoalII";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}
