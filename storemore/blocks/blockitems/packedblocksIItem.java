package mods.storemore.blocks.blockitems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class packedblocksIItem extends ItemBlock {
	
	public static Block theBlock;

	public packedblocksIItem(int id, Block block) {
		super(id);
		setHasSubtypes(true);
		theBlock = block;
	}
	
	public String getItemDisplayName(ItemStack p_blocksI){
		String name = "";
		switch(p_blocksI.getItemDamage()){
		case 0: name = "Packed Cobble I";
		break;
		case 1: {name = "Packed Cobble II";
		break;}
		case 2: {name = "Packed Cobble III";
		break;}
		case 3: {name = "Packed Cobble IV";
		break;}
		case 4: {name = "Packed Cobble V";
		break;}
		case 5: {name = "Packed Cobble VI";
		break;}
		case 6: {name = "Packed Cobble VII";
		break;}
		case 7: {name = "Packed Cobble VIII";
		break;}
		case 8: {name = "p_stoneI";
		break;}
		case 9: {name = "p_stoneII";
		break;}
		case 10: {name = "p_stoneIII";
		break;}
		case 11: {name = "p_stoneIV";
		break;}
		case 12: {name = "p_stoneV";
		break;}
		case 13: {name = "p_stoneVI";
		break;}
		case 14: {name = "p_stoneVII";
		break;}
		case 15: {name = "p_stoneVIII";
		break;}
		default: name = "p_cobbleI";
		}
		return getUnlocalizedName() + "." +name;
		}
	public int getMetadata(int meta){
		return meta;
	
	}
	
	
}
