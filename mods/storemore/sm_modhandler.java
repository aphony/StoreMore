package mods.storemore;
  
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
        	
        	/*
            sm_ic2handler.adamantineRecipe();
            sm_ic2handler.mithrilRecipe();
            sm_ic2handler.verditeRecipe();
        	*/
        
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