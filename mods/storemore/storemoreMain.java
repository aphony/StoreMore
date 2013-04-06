package mods.storemore;

import mods.storemore.blockitems.packedblocksIIIItem;
import mods.storemore.blockitems.packedblocksIIItem;
import mods.storemore.blockitems.packedblocksIItem;
import mods.storemore.blockitems.packedblocksIVItem;
import mods.storemore.blockitems.packedblocksIXItem;
import mods.storemore.blockitems.packedblocksVIIIItem;
import mods.storemore.blockitems.packedblocksVIIItem;
import mods.storemore.blockitems.packedblocksVIItem;
import mods.storemore.blockitems.packedblocksVItem;
import mods.storemore.blockitems.packedfoodIII_Item;
import mods.storemore.blockitems.packedfoodII_Item;
import mods.storemore.blockitems.packedfoodIV_Item;
import mods.storemore.blockitems.packedfoodI_Item;
import mods.storemore.blockitems.packedglassItem;
import mods.storemore.blockitems.fuels.packedcharcoalIIIItem;
import mods.storemore.blockitems.fuels.packedcharcoalIIItem;
import mods.storemore.blockitems.fuels.packedcharcoalIItem;
import mods.storemore.blockitems.fuels.packedcharcoalIVItem;
import mods.storemore.blockitems.fuels.packedcoalIIIItem;
import mods.storemore.blockitems.fuels.packedcoalIIItem;
import mods.storemore.blockitems.fuels.packedcoalIItem;
import mods.storemore.blockitems.fuels.packedcoalIVItem;
import mods.storemore.client.CProxy;
import mods.storemore.ic2.blockitems.ic2blocksIItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "StoreMore", name = "StoreMore", version = "1.3.1_MC1.5.1", useMetadata = false, dependencies = "before:StoreMore|IC2")

@NetworkMod(channels = "StoreMore", packetHandler = sm_packetHandler.class, clientSideRequired = true, serverSideRequired = false)
public class storemoreMain {

public static final String MOD = "StoreMore";



	public static final String sm_dependency = "required-after:StoreMore";
	public static final String sm_dependencyic2 = "required-after:IC2";
	
	@SidedProxy(clientSide = "mods.storemore.client.CProxy", serverSide = "mods.storemore.SProxy")
		public static SProxy proxy;
	
	//Block Registering
		public static Block packedblocksI;
		public static Block packedblocksII;
		public static Block packedblocksIII;
		public static Block packedblocksIV;
		public static Block packedblocksV;
		public static Block packedglass;
		public static Block packedcoalI;
		public static Block packedcoalII;
		public static Block packedcoalIII;
		public static Block packedcoalIV;
		public static Block packedcharcoalI;
		public static Block packedcharcoalII;
		public static Block packedcharcoalIII;
		public static Block packedcharcoalIV;
		public static Block packedblocksVI;
		public static Block packedblocksVII;
		public static Block packedblocksVIII;
		public static Block packedblocksIX;
		public static Block packedfoodI;
		public static Block packedfoodII;
		public static Block packedfoodIII;
		public static Block packedfoodIV;
		public static Block packedfoodV;
		
		
		
		
		
		@Instance("StoreMore")
		public static storemoreMain instance;
	
	@PreInit()
    public void preInit(FMLPreInitializationEvent event) {

	      sm_config.init();
          
	        sm_config.initialize(event.getSuggestedConfigurationFile());
	          
	        sm_config.save(); 
		
	}
	@Init
	public void load(FMLInitializationEvent event){
	proxy.registerRenderers();
    sm_naming.init();
    sm_recipes.initRecipes();
	}

	public static CreativeTabs StoreMoreTab = new StoreMoreTab(CreativeTabs.getNextID(), "Store More");

	{
	    
	    
//Multiblocks	
		
		packedblocksI = new mods.storemore.blocks.packedblocksI(sm_config.packedblocksIID).setHardness(3.5f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksI");
		packedblocksII = new mods.storemore.blocks.packedblocksII(sm_config.packedblocksIIID).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksII");
		packedblocksIII = new mods.storemore.blocks.packedblocksIII(sm_config.packedblocksIIIID).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksIII");
		packedblocksIV = new mods.storemore.blocks.packedblocksIV(sm_config.packedblocksIVID).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksIV");
		packedblocksV = new mods.storemore.blocks.packedblocksV(sm_config.packedblocksVID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksV");
		packedglass = new mods.storemore.blocks.packedglass(sm_config.packedglassID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedglass");
		packedcoalI = new mods.storemore.blocks.fuels.packedcoalI(sm_config.packedcoalIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalI");
		packedcoalII = new mods.storemore.blocks.fuels.packedcoalII(sm_config.packedcoalIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalII");
		packedcoalIII = new mods.storemore.blocks.fuels.packedcoalIII(sm_config.packedcoalIIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalIII");
		packedcoalIV = new mods.storemore.blocks.fuels.packedcoalIV(sm_config.packedcoalIVID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalIV");
		packedcharcoalI = new mods.storemore.blocks.fuels.packedcharcoalI(sm_config.packedcharcoalIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalI");
		packedcharcoalII = new mods.storemore.blocks.fuels.packedcharcoalII(sm_config.packedcharcoalIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalII");
		packedcharcoalIII = new mods.storemore.blocks.fuels.packedcharcoalIII(sm_config.packedcharcoalIIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalIII");
		packedcharcoalIV = new mods.storemore.blocks.fuels.packedcharcoalIV(sm_config.packedcharcoalIVID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalIV");
		packedblocksVI = new mods.storemore.blocks.packedblocksVI(sm_config.packedblocksVIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVI");
		packedblocksVII = new mods.storemore.blocks.packedblocksVII(sm_config.packedblocksVIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVII");
		packedblocksVIII = new mods.storemore.blocks.packedblocksVIII(sm_config.packedblocksVIIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVIII");
		packedblocksIX = new mods.storemore.blocks.packedblocksIX(sm_config.packedblocksIXID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksIX");
		packedfoodI = new mods.storemore.blocks.packedfoodI(sm_config.packedfoodIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedfoodI");
		packedfoodII = new mods.storemore.blocks.packedfoodII(sm_config.packedfoodIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedfoodII");
		packedfoodIII = new mods.storemore.blocks.packedfoodIII(sm_config.packedfoodIIIID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedfoodIII");
		packedfoodIV = new mods.storemore.blocks.packedfoodIV(sm_config.packedfoodIVID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedfoodIV");
		packedfoodV = new mods.storemore.blocks.packedfoodV(sm_config.packedfoodVID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedfoodV");
		

//Multiblock ItemBlocks	

Item.itemsList[sm_config.packedblocksIID]	= new packedblocksIItem(sm_config.packedblocksIID-256).setUnlocalizedName("packedblocksI");
Item.itemsList[sm_config.packedblocksIIID]	= new packedblocksIIItem(sm_config.packedblocksIIID-256).setUnlocalizedName("packedblocksII");
Item.itemsList[sm_config.packedblocksIIIID] = new packedblocksIIIItem(sm_config.packedblocksIIIID-256).setUnlocalizedName("packedblocksIII");
Item.itemsList[sm_config.packedblocksIVID] = new packedblocksIVItem(sm_config.packedblocksIVID-256).setUnlocalizedName("packedblocksIV");
Item.itemsList[sm_config.packedblocksVID] = new packedblocksVItem(sm_config.packedblocksVID-256).setUnlocalizedName("packedblocksV");
Item.itemsList[sm_config.packedblocksVIID] = new packedblocksVIItem(sm_config.packedblocksVIID-256).setUnlocalizedName("packedblocksVI");
Item.itemsList[sm_config.packedblocksVIIID] = new packedblocksVIIItem(sm_config.packedblocksVIIID-256).setUnlocalizedName("packedblocksVII");
Item.itemsList[sm_config.packedblocksVIIIID] = new packedblocksVIIIItem(sm_config.packedblocksVIIIID-256).setUnlocalizedName("packedblocksVIII");
Item.itemsList[sm_config.packedblocksIXID] = new packedblocksIXItem(sm_config.packedblocksIXID-256).setUnlocalizedName("packedblocksIX");
Item.itemsList[sm_config.packedglassID] = new packedglassItem(sm_config.packedglassID-256).setUnlocalizedName("packedglass");
Item.itemsList[sm_config.packedcoalIID] = new packedcoalIItem(sm_config.packedcoalIID-256).setUnlocalizedName("packedcoalI");
Item.itemsList[sm_config.packedcoalIIID] = new packedcoalIIItem(sm_config.packedcoalIIID-256).setUnlocalizedName("packedcoalII");
Item.itemsList[sm_config.packedcoalIIIID] = new packedcoalIIIItem(sm_config.packedcoalIIIID-256).setUnlocalizedName("packedcoalIII");
Item.itemsList[sm_config.packedcoalIVID] = new packedcoalIVItem(sm_config.packedcoalIVID-256).setUnlocalizedName("packedcoalIV");
Item.itemsList[sm_config.packedcharcoalIID] = new packedcharcoalIItem(sm_config.packedcharcoalIID-256).setUnlocalizedName("packedcharcoalI");
Item.itemsList[sm_config.packedcharcoalIIID] = new packedcharcoalIIItem(sm_config.packedcharcoalIIID-256).setUnlocalizedName("packedcharcoalII");
Item.itemsList[sm_config.packedcharcoalIIIID] = new packedcharcoalIIIItem(sm_config.packedcharcoalIIIID-256).setUnlocalizedName("packedcharcoalIII");
Item.itemsList[sm_config.packedcharcoalIVID] = new packedcharcoalIVItem(sm_config.packedcharcoalIVID-256).setUnlocalizedName("packedcharcoalIV");
Item.itemsList[sm_config.packedfoodIID] = new packedfoodI_Item(sm_config.packedfoodIID-256).setUnlocalizedName("packedfoodI");
Item.itemsList[sm_config.packedfoodIIID] = new packedfoodII_Item(sm_config.packedfoodIIID-256).setUnlocalizedName("packedfoodII");
Item.itemsList[sm_config.packedfoodIIIID] = new packedfoodIII_Item(sm_config.packedfoodIIIID-256).setUnlocalizedName("packedfoodIII");
Item.itemsList[sm_config.packedfoodIVID] = new packedfoodIV_Item(sm_config.packedfoodIVID-256).setUnlocalizedName("packedfoodIV");
Item.itemsList[sm_config.packedfoodVID] = new packedfoodIV_Item(sm_config.packedfoodVID-256).setUnlocalizedName("packedfoodV");
	}
	
{

GameRegistry.registerFuelHandler(new storemoreFuels());
	}
@PostInit
public void postInit(FMLPostInitializationEvent event) {
	 
	        
	        
}
}
