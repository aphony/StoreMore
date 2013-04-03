package mods.storemore;
  
import mods.storemore.handlers.sm_config;
import mods.storemore.handlers.sm_modCompatability;
import mods.storemore.ic2.api.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
  
public class sm_modhandler
{
    public static void init()
    {
        /*
        //Thaumcraft API
        if(Loader.isModLoaded("Thaumcraft") == true)
        {
            ThaumcraftApi.registerObjectTag(exampleModMain.ExampleItem.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 10).add(EnumTag.VALUABLE, 4));
            
        }
        */
        
    	
        //IC2 API
     }
    

    	public static void initIC2Recipes()
    	{
    		
    		
    		
    		if(Loader.isModLoaded("IC2"))
    		{
    			
    			ItemStack copperBlock = sm_modCompatability.getIC2Item("copperBlock");
    			ItemStack tinBlock = sm_modCompatability.getIC2Item("tinBlock");
    			ItemStack uraniumBlock = sm_modCompatability.getIC2Item("uraniumBlock");
    			ItemStack bronzeBlock = sm_modCompatability.getIC2Item("bronzeBlock");
    	

    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,0), "XXX", "XXX", "XXX", Character.valueOf('X'), copperBlock,9,0);
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,1), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,0));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,2), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,1));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,3), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,2));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,4), "XXX", "XXX", "XXX", Character.valueOf('X'), tinBlock,9,0);
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,5), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,4));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,6), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,5));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,7), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,6));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,8), "XXX", "XXX", "XXX", Character.valueOf('X'), uraniumBlock,9,0);
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,9), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,8));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,10), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,9));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,11), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,10));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,12), "XXX", "XXX", "XXX", Character.valueOf('X'), bronzeBlock,9,0);
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,13), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,12));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,14), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,13));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,15), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,14));
    		
    		GameRegistry.addShapelessRecipe(copperBlock,9,0, new ItemStack(storemoreMain.ic2blocksI,1,0));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,0), new ItemStack(storemoreMain.ic2blocksI,1,1));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,1), new ItemStack(storemoreMain.ic2blocksI,1,2));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,2), new ItemStack(storemoreMain.ic2blocksI,1,3));
    		GameRegistry.addShapelessRecipe(tinBlock,9,0, new ItemStack(storemoreMain.ic2blocksI,1,4));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,4), new ItemStack(storemoreMain.ic2blocksI,1,5));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,5), new ItemStack(storemoreMain.ic2blocksI,1,6));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,6), new ItemStack(storemoreMain.ic2blocksI,1,7));
    		GameRegistry.addShapelessRecipe(uraniumBlock,9,0, new ItemStack(storemoreMain.ic2blocksI,1,8));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,8), new ItemStack(storemoreMain.ic2blocksI,1,9));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,9), new ItemStack(storemoreMain.ic2blocksI,1,10));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,10), new ItemStack(storemoreMain.ic2blocksI,1,11));
    		GameRegistry.addShapelessRecipe(bronzeBlock,9,0, new ItemStack(storemoreMain.ic2blocksI,1,12));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,12), new ItemStack(storemoreMain.ic2blocksI,1,13));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,13), new ItemStack(storemoreMain.ic2blocksI,1,14));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,14), new ItemStack(storemoreMain.ic2blocksI,1,15));
    		
    		
    		}
   		
    	
  
        /*
        //TE API
        if(Loader.isModLoaded("ThermalExpansion") == true && Config.DustsEnabled == true)
        {
            ThermalExpansionHandler.init();
              
            GameRegistry.addSmelting(modMain.startItem.itemID, new ItemStack(modMain.endItem), 0.0F);
        }
        
    }
		*/

}
}
 