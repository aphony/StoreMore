package mods.storemore;
  
import mods.storemore.common.storemoreMain;
import mods.storemore.ic2.api.Items;
import net.minecraft.item.ItemStack;
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
            ThaumcraftApi.registerObjectTag(MysticOres.AdamantineIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 10).add(EnumTag.VALUABLE, 4));
            ThaumcraftApi.registerObjectTag(MysticOres.MithrilIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.MAGIC, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.VerditeIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.PLANT, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.IridiumIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 16).add(EnumTag.VALUABLE, 8));
            ThaumcraftApi.registerObjectTag(MysticOres.AmethystGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.TourmalineGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.TopazGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.AgateGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.MysticPowder.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2)
                    .add(EnumTag.EXCHANGE, 9));
            ThaumcraftApi.registerObjectTag(MysticOres.ReinforcedGlass.blockID, 0, (new ObjectTags()).add(EnumTag.CRYSTAL, 4).add(EnumTag.ROCK, 2));
            ThaumcraftApi.registerObjectTag(MysticOres.IridiumNugget.itemID, 0, (new ObjectTags()).add(EnumTag.POISON, 2).add(EnumTag.FIRE, 1).add(EnumTag.MAGIC, 4)
                    .add(EnumTag.POWER, 6));
            ThaumcraftApi.registerObjectTag(MysticOres.BloodstoneShard.itemID, 0, (new ObjectTags()).add(EnumTag.CRYSTAL, 1).add(EnumTag.DARK, 1));
            ThaumcraftApi.registerObjectTag(MysticOres.BlockOres.blockID, 7, (new ObjectTags()).add(EnumTag.DARK, 4).add(EnumTag.EVIL, 2));
        }
        */
          
        //IC2 API
        if(Loader.isModLoaded("IC2") == true && sm_config.IC2Enabled == true)
        {
        	
            sm_ic2handler.compressedcoalIIRecipe();
            sm_ic2handler.compressedcoalIIIRecipe();
         
        }
    }

    	public static void initIC2Recipes()
    	{
    		if(Loader.isModLoaded("IC2") == true && sm_config.IC2Enabled == true)
    		{

    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,0), "XXX", "XXX", "XXX", Character.valueOf('X'), (Items.getItem2("copperOreBlock",1,0)));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,1), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,0));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,2), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,1));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,3), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,2));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,4), "XXX", "XXX", "XXX", Character.valueOf('X'), (Items.getItem2("tinBlock",1,0)));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,5), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,4));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,6), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,5));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,7), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,6));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,8), "XXX", "XXX", "XXX", Character.valueOf('X'), (Items.getItem2("uraniumBlock",1,0)));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,9), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,8));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,10), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,9));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,11), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,10));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,12), "XXX", "XXX", "XXX", Character.valueOf('X'), (Items.getItem2("bronzeBlock",1,0)));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,13), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,12));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,14), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,13));
    		GameRegistry.addRecipe(new ItemStack(storemoreMain.ic2blocksI,1,15), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(storemoreMain.ic2blocksI,1,14));
    		
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.getItem2("copperBlock",9,0)), new ItemStack(storemoreMain.ic2blocksI,1,0));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,0), new ItemStack(storemoreMain.ic2blocksI,1,1));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,1), new ItemStack(storemoreMain.ic2blocksI,1,2));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,2), new ItemStack(storemoreMain.ic2blocksI,1,3));
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.getItem2("tinBlock",9,0)), new ItemStack(storemoreMain.ic2blocksI,1,4));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,4), new ItemStack(storemoreMain.ic2blocksI,1,5));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,5), new ItemStack(storemoreMain.ic2blocksI,1,6));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,6), new ItemStack(storemoreMain.ic2blocksI,1,7));
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.getItem2("uraniumBlock,",9,0)), new ItemStack(storemoreMain.ic2blocksI,1,8));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,8), new ItemStack(storemoreMain.ic2blocksI,1,9));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,9), new ItemStack(storemoreMain.ic2blocksI,1,10));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,10), new ItemStack(storemoreMain.ic2blocksI,1,11));
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.getItem2("bronzeBlock",9,0)), new ItemStack(storemoreMain.ic2blocksI,1,12));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,12), new ItemStack(storemoreMain.ic2blocksI,1,13));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,13), new ItemStack(storemoreMain.ic2blocksI,1,14));
    		GameRegistry.addShapelessRecipe(new ItemStack(storemoreMain.ic2blocksI,9,14), new ItemStack(storemoreMain.ic2blocksI,1,15));
    		
    		
    		}
   		
    	
  
        /*
        //TE API
        if(Loader.isModLoaded("ThermalExpansion") == true && Config.DustsEnabled == true)
        {
            ThermalExpansionHandler.init();
              
            GameRegistry.addSmelting(MysticOres.AdamantineDust.itemID, new ItemStack(MysticOres.AdamantineIngot), 0.0F);
            GameRegistry.addSmelting(MysticOres.MithrilDust.itemID, new ItemStack(MysticOres.MithrilIngot), 0.0F);
            GameRegistry.addSmelting(MysticOres.VerditeDust.itemID, new ItemStack(MysticOres.VerditeIngot), 0.0F);
        }
        */
    }
}
 