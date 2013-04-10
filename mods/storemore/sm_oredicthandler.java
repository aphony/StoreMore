package mods.storemore;
  
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
  
public class sm_oredicthandler
{
    public static ItemStack coalI;

	public static void init()
    {
    	
        OreDictionary.registerOre("coalI", new ItemStack(StoreMore.packedcoalI));
          
    }
} 