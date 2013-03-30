package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksIIIItem extends ItemBlock {

	public packedblocksIIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksII";
		switch(is.getItemDamage()){
		case 0: {name = "sandI";
		break;}
		case 1: {name = "sandII";
		break;}
		case 2: {name = "sandIII";
		break;}
		case 3: {name = "sandIV";
		break;}
		case 4: {name = "sandV";
		break;}
		case 5: {name = "sandVI";
		break;}
		case 6: {name = "sandVII";
		break;}
		case 7: {name = "sandVIII";
		break;}
		case 8: {name = "sandstoneI";
		break;}
		case 9: {name = "sandstoneII";
		break;}
		case 10: {name = "sandstoneIII";
		break;}
		case 11: {name = "sandstoneIV";
		break;}
		case 12: {name = "sandstoneV";
		break;}
		case 13: {name = "sandstoneVI";
		break;}
		case 14: {name = "sandstoneVII";
		break;}
		case 15: {name = "sandstoneVIII";
		break;}
		default: name = "sandI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}