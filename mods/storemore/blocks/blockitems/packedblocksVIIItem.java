package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksVIIItem extends ItemBlock {

	public packedblocksVIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksVII";
		switch(is.getItemDamage()){
		case 0: {name = "oakwoodI";
		break;}
		case 1: {name = "oakwoodII";
		break;}
		case 2: {name = "oakwoodIII";
		break;}
		case 3: {name = "oakwoodIV";
		break;}
		case 4: {name = "sprucewoodI";
		break;}
		case 5: {name = "sprucewoodII";
		break;}
		case 6: {name = "sprucewoodIII";
		break;}
		case 7: {name = "sprucewoodIV";
		break;}
		case 8: {name = "birchwoodI";
		break;}
		case 9: {name = "birchwoodII";
		break;}
		case 10: {name = "birchwoodIII";
		break;}
		case 11: {name = "birchwoodIV";
		break;}
		case 12: {name = "junglewoodI";
		break;}
		case 13: {name = "junglewoodII";
		break;}
		case 14: {name = "junglewoodIII";
		break;}
		case 15: {name = "junglewoodIV";
		break;}
		default: name = "oakwoodI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}