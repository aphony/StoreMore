package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class packedblocksIVItem extends ItemBlock {

	public packedblocksIVItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);		
	}
	public String getItemNameIS(ItemStack is){
		String name = "packedblocksIV";
		switch(is.getItemDamage()){
		case 0: {name = "obsidianI";
		break;}
		case 1: {name = "obsidianII";
		break;}
		case 2: {name = "obsidianIII";
		break;}
		case 3: {name = "obsidianIV";
		break;}
		case 4: {name = "netherrackI";
		break;}
		case 5: {name = "netherrackII";
		break;}
		case 6: {name = "netherrackIII";
		break;}
		case 7: {name = "netherrackIV";
		break;}
		case 8: {name = "glowstoneI";
		break;}
		case 9: {name = "glowstoneII";
		break;}
		case 10: {name = "glowstoneIII";
		break;}
		case 11: {name = "glowstoneIV";
		break;}
		default: name = "obsidianI";
		}
		return getUnlocalizedName()+"."+name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
	
	
}