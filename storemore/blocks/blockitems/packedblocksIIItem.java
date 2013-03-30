package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksIIItem extends ItemBlock {

	public packedblocksIIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksII";
		switch(is.getItemDamage()){
		case 0: {name = "dirtI";
		break;}
		case 1: {name = "dirtII";
		break;}
		case 2: {name = "dirtIII";
		break;}
		case 3: {name = "dirtIV";
		break;}
		case 4: {name = "dirtV";
		break;}
		case 5: {name = "dirtVI";
		break;}
		case 6: {name = "dirtVII";
		break;}
		case 7: {name = "dirtVIII";
		break;}
		case 8: {name = "gravelI";
		break;}
		case 9: {name = "gravelII";
		break;}
		case 10: {name = "gravelIII";
		break;}
		case 11: {name = "gravelIV";
		break;}
		case 12: {name = "gravelV";
		break;}
		case 13: {name = "gravelVI";
		break;}
		case 14: {name = "gravelVII";
		break;}
		case 15: {name = "gravelVIII";
		break;}
		default: name = "dirtI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}