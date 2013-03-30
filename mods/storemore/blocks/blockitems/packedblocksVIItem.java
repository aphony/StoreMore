package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksVIItem extends ItemBlock {

	public packedblocksVIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksVI";
		switch(is.getItemDamage()){
		case 0: {name = "sticksI";
		break;}
		case 1: {name = "sticksII";
		break;}
		case 2: {name = "sticksIII";
		break;}
		case 3: {name = "sticksIV";
		break;}
		case 4: {name = "torchesI";
		break;}
		case 5: {name = "torchesII";
		break;}
		case 6: {name = "torchesIII";
		break;}
		case 7: {name = "torchesIV";
		break;}
		case 8: {name = "gunpowderI";
		break;}
		case 9: {name = "gunpowderII";
		break;}
		case 10: {name = "gunpowderIII";
		break;}
		case 11: {name = "gunpowderIV";
		break;}
		case 12: {name = "flintI";
		break;}
		case 13: {name = "flintII";
		break;}
		case 14: {name = "flintIII";
		break;}
		case 15: {name = "flintIV";
		break;}
		default: name = "sticksI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}