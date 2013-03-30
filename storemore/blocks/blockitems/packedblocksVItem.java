package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksVItem extends ItemBlock {

	public packedblocksVItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksV";
		switch(is.getItemDamage()){
		case 0: {name = "ironI";
		break;}
		case 1: {name = "ironII";
		break;}
		case 2: {name = "ironIII";
		break;}
		case 3: {name = "ironIV";
		break;}
		case 4: {name = "goldI";
		break;}
		case 5: {name = "goldII";
		break;}
		case 6: {name = "goldIII";
		break;}
		case 7: {name = "goldIV";
		break;}
		case 8: {name = "diamondI";
		break;}
		case 9: {name = "diamondII";
		break;}
		case 10: {name = "diamondIII";
		break;}
		case 11: {name = "diamondIV";
		break;}
		case 12: {name = "emeraldI";
		break;}
		case 13: {name = "emeraldII";
		break;}
		case 14: {name = "emeraldIII";
		break;}
		case 15: {name = "emeraldIV";
		break;}
		default: name = "ironI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}