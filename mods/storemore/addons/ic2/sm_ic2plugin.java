package mods.storemore.addons.ic2;

import mods.storemore.sm_config;
import mods.storemore.sm_packetHandler;
import mods.storemore.StoreMore;
import mods.storemore.addons.ic2.blockitems.ic2blocksIItem;
import mods.storemore.proxys.SProxy;
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



@Mod(modid = "StoreMore|IC2", name = "StoreMore IC2", version = "0.1", useMetadata = true, dependencies = "after:StoreMore")

@NetworkMod(channels = "StoreMore", packetHandler = sm_packetHandler.class, clientSideRequired = true, serverSideRequired = false)
public class sm_ic2plugin


{
	
	

	@SidedProxy(clientSide = "mods.storemore.proxys.CProxy", serverSide = "mods.storemore.proxys.SProxy")
		public static SProxy proxy;
    
	public static boolean isIndustrialCraftLoaded() {
		return Loader.isModLoaded("IC2");
	}

	public static boolean IC2RecipesEnabled() {
		boolean defaultval = isIndustrialCraftLoaded();
		return sm_config.config.get(Configuration.CATEGORY_GENERAL, "IndustrialCraft Recipes", defaultval).getBoolean(defaultval);
}
	
	public static Block ic2blocksI;
	
	@Instance("StoreMoreIC2")
	public static sm_ic2plugin instance;
	
	@Init
	public void load(FMLInitializationEvent event){
	proxy.registerRenderers();
    sm_ic2recipes.initIC2Recipes();
    sm_ic2naming.initIC2Naming();
	}
    
	
	{

	ic2blocksI = new mods.storemore.addons.ic2.blocks.ic2blocksI(sm_config.ic2blocksIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMore.StoreMoreTab).setUnlocalizedName("ic2blocksI");
	
	}
	
	{

		Item.itemsList[sm_config.ic2blocksIID] = new ic2blocksIItem(sm_config.ic2blocksIID-256).setUnlocalizedName("ic2blocksI");

	}



}

 