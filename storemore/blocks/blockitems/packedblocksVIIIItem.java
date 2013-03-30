package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksVIIIItem extends ItemBlock {

	public packedblocksVIIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksVIII";
		switch(is.getItemDamage()){
		case 0: {name = "oakplanksI";
		break;}
		case 1: {name = "oakplanksII";
		break;}
		case 2: {name = "oakplanksIII";
		break;}
		case 3: {name = "oakplanksIV";
		break;}
		case 4: {name = "spruceplanksI";
		break;}
		case 5: {name = "spruceplanksII";
		break;}
		case 6: {name = "spruceplanksIII";
		break;}
		case 7: {name = "spruceplanksIV";
		break;}
		case 8: {name = "birchplanksI";
		break;}
		case 9: {name = "birchplanksII";
		break;}
		case 10: {name = "birchplanksIII";
		break;}
		case 11: {name = "birchplanksIV";
		break;}
		case 12: {name = "jungleplanksI";
		break;}
		case 13: {name = "jungleplanksII";
		break;}
		case 14: {name = "jungleplanksIII";
		break;}
		case 15: {name = "jungleplanksIV";
		break;}
		default: name = "oakplanksI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}