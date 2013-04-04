package mods.storemore.ic2;

import mods.storemore.SProxy;
import mods.storemore.sm_config;
import mods.storemore.storemoreMain;
import mods.storemore.ic2.blockitems.ic2blocksIItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = "StoreMore|IC2", name = "StoreMore IC2", version = "0.1", useMetadata = true)

@NetworkMod(channels = "StoreMore", clientSideRequired = true, serverSideRequired = false)
public class sm_ic2plugin


{

	@SidedProxy(clientSide = "mods.storemore.client.CProxy", serverSide = "mods.storemore.common.SProxy")
		public static SProxy proxy;
    
	public static boolean isIndustrialCraftLoaded() {
		return Loader.isModLoaded("IC2");
	}

	public static boolean IC2RecipesEnabled() {
		boolean defaultval = isIndustrialCraftLoaded();
		return sm_config.config.get(Configuration.CATEGORY_GENERAL, "IndustrialCraft Recipes", defaultval).getBoolean(defaultval);
}
	
	public static Block ic2blocksI;
   

	@PreInit()
    public void preInit(FMLPreInitializationEvent event) {

	      sm_config.init();
          
	        sm_config.initialize(event.getSuggestedConfigurationFile());
	          
	        sm_config.save(); 
		
	}
	
	@Instance("StoreMoreIC2")
	public static sm_ic2plugin instance;
	
	@Init
	public void load(FMLInitializationEvent event){
	proxy.registerRenderers();
    sm_ic2recipes.initIC2Recipes();
    sm_ic2naming.initIC2Naming();
	}
    
	
	{

	ic2blocksI = new mods.storemore.ic2.blocks.ic2blocksI(sm_config.ic2blocksIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(storemoreMain.StoreMoreTab).setUnlocalizedName("ic2blocksI");
	
	}
	
	{

		Item.itemsList[sm_config.ic2blocksIID] = new ic2blocksIItem(sm_config.ic2blocksIID-256).setUnlocalizedName("ic2blocksI");

	}



}

 