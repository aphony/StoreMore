package mods.storemore;

import java.util.logging.Level;

import mods.storemore.blocks.blockitems.packedblocksIIIItem;
import mods.storemore.blocks.blockitems.packedblocksIIItem;
import mods.storemore.blocks.blockitems.packedblocksIItem;
import mods.storemore.blocks.blockitems.packedblocksIVItem;
import mods.storemore.blocks.blockitems.packedblocksVIIIItem;
import mods.storemore.blocks.blockitems.packedblocksVIIItem;
import mods.storemore.blocks.blockitems.packedblocksVIItem;
import mods.storemore.blocks.blockitems.packedblocksVItem;
import mods.storemore.blocks.blockitems.packedglassItem;
import mods.storemore.fuels.packedcharcoalIIIItem;
import mods.storemore.fuels.packedcharcoalIIItem;
import mods.storemore.fuels.packedcharcoalIItem;
import mods.storemore.fuels.packedcharcoalIVItem;
import mods.storemore.fuels.packedcoalIIIItem;
import mods.storemore.fuels.packedcoalIIItem;
import mods.storemore.fuels.packedcoalIItem;
import mods.storemore.fuels.packedcoalIVItem;
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
import cpw.mods.fml.common.Mod.Init;
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

@Mod(modid = "StoreMore", name = "Store More Mod", version = "1.5.1.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class storemoreMain
{

	@SidedProxy(clientSide = "mods.storemore.CProxy", serverSide = "mods.storemore.SProxy")
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
		
		
	int packedblocksIID = 2100;
	int packedblocksIIID = 2101;
	int packedblocksIIIID = 2102;
	int packedblocksIVID = 2103;
	int packedblocksVID = 2104;
	int packedglassID = 2105;
	int packedcoalIID = 2150;
	int packedcoalIIID = 2151;
	int packedcoalIIIID = 2152;
	int packedcoalIVID = 2153;
	int packedcharcoalIID = 2154;
	int packedcharcoalIIID = 2155;
	int packedcharcoalIIIID = 2156;
	int packedcharcoalIVID = 2157;
	int packedblocksVIID = 2106;
	int packedblocksVIIID = 2107;
	int packedblocksVIIIID = 2108;
	
	@PreInit()
    public void preInit(FMLPreInitializationEvent event) {
		
		
    Configuration config = new Configuration(event.getSuggestedConfigurationFile());

	    config.load();
	    
	    try {

        
	    packedblocksIID = config.get(Configuration.CATEGORY_BLOCK, "Cobblestone & Stone", 2100).getInt();
	    packedblocksIIID = config.get(Configuration.CATEGORY_BLOCK, "Dirt & Gravel", 2101).getInt();
	    packedblocksIIIID = config.get(Configuration.CATEGORY_BLOCK, "Sand & Sandstone", 2102).getInt();
	    packedblocksIVID = config.get(Configuration.CATEGORY_BLOCK, "Obsidian, Glowstone, & Netherrack", 2103).getInt();
	    packedblocksVID = config.get(Configuration.CATEGORY_BLOCK, "Iron, Gold, Diamond, & Emerald", 2104).getInt();
	    packedglassID = config.get(Configuration.CATEGORY_BLOCK, "Glass", 2105).getInt();
	    packedcoalIID = config.get(Configuration.CATEGORY_BLOCK, "Coal I", 2150).getInt();
	    packedcoalIIID = config.get(Configuration.CATEGORY_BLOCK, "Coal II", 2151).getInt();
	    packedcoalIIIID = config.get(Configuration.CATEGORY_BLOCK, "Coal III", 2152).getInt();
	    packedcoalIVID = config.get(Configuration.CATEGORY_BLOCK, "Coal IV", 2153).getInt();
	    packedcharcoalIID = config.get(Configuration.CATEGORY_BLOCK, "Charcoal I", 2154).getInt();
	    packedcharcoalIIID = config.get(Configuration.CATEGORY_BLOCK, "Charcoal II", 2155).getInt();
	    packedcharcoalIIIID = config.get(Configuration.CATEGORY_BLOCK, "Charcoal III", 2156).getInt();
	    packedcharcoalIVID = config.get(Configuration.CATEGORY_BLOCK, "Charcoal IV", 2157).getInt();
	    packedblocksVIID = config.get(Configuration.CATEGORY_BLOCK, "Sticks, Torches, Gunpowder, Flint", 2106).getInt();
	    packedblocksVIIID = config.get(Configuration.CATEGORY_BLOCK, "Wood Blocks I", 2107).getInt();
	    packedblocksVIIIID = config.get(Configuration.CATEGORY_BLOCK, "Wood Planks I", 2108).getInt();
	    
	    } catch (Exception e) {

	    	FMLLog.log(Level.SEVERE, e, "StoreMore has an issue loading config.");

	    	} finally {

	    
        config.save();
        
	    	}

	}
	@Init
	public void load(FMLInitializationEvent event){
	proxy.registerRenderers();
    sm_naming.initNaming();
    sm_recipes.initRecipes();
	}

	public static CreativeTabs StoreMoreTab = new StoreMoreTab(CreativeTabs.getNextID(), "Store More");

	{
	    
	    
//Multiblocks	
		
		packedblocksI = new mods.storemore.blocks.packedblocksI(packedblocksIID, 0).setHardness(3.5f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksI");
		packedblocksII = new mods.storemore.blocks.packedblocksII(packedblocksIIID, 0).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksII");
		packedblocksIII = new mods.storemore.blocks.packedblocksIII(packedblocksIIIID, 0).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksIII");
		packedblocksIV = new mods.storemore.blocks.packedblocksIV(packedblocksIVID, 0).setHardness(2.0f).setResistance(120.0F).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksIV");
		packedblocksV = new mods.storemore.blocks.packedblocksV(packedblocksVID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksV");
		packedglass = new mods.storemore.blocks.packedglass(packedglassID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedglass");
		packedcoalI = new mods.storemore.fuels.packedcoalI(packedcoalIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalI");
		packedcoalII = new mods.storemore.fuels.packedcoalII(packedcoalIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalII");
		packedcoalIII = new mods.storemore.fuels.packedcoalIII(packedcoalIIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalIII");
		packedcoalIV = new mods.storemore.fuels.packedcoalIV(packedcoalIVID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcoalIV");
		packedcharcoalI = new mods.storemore.fuels.packedcharcoalI(packedcharcoalIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalI");
		packedcharcoalII = new mods.storemore.fuels.packedcharcoalII(packedcharcoalIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalII");
		packedcharcoalIII = new mods.storemore.fuels.packedcharcoalIII(packedcharcoalIIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalIII");
		packedcharcoalIV = new mods.storemore.fuels.packedcharcoalIV(packedcharcoalIVID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedcharcoalIV");
		packedblocksVI = new mods.storemore.blocks.packedblocksVI(packedblocksVIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVI");
		packedblocksVII = new mods.storemore.blocks.packedblocksVII(packedblocksVIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVII");
		packedblocksVIII = new mods.storemore.blocks.packedblocksVIII(packedblocksVIIIID, 0).setHardness(1.0f).setResistance(50.0f).setCreativeTab(StoreMoreTab).setUnlocalizedName("packedblocksVIII");
		

//Multiblock ItemBlocks	

Item.itemsList[packedblocksIID]	= new packedblocksIItem(packedblocksIID-256, packedblocksI).setUnlocalizedName("packedblocksI");
Item.itemsList[packedblocksIIID]	= new packedblocksIIItem(packedblocksIIID-256, packedblocksII).setUnlocalizedName("packedblocksII");
Item.itemsList[packedblocksIIIID] = new packedblocksIIIItem(packedblocksIIIID-256, packedblocksIII).setUnlocalizedName("packedblocksIII");
Item.itemsList[packedblocksIVID] = new packedblocksIVItem(packedblocksIVID-256, packedblocksIV).setUnlocalizedName("packedblocksIV");
Item.itemsList[packedblocksVID] = new packedblocksVItem(packedblocksVID-256, packedblocksV).setUnlocalizedName("packedblocksV");
Item.itemsList[packedglassID] = new packedglassItem(packedglassID-256, packedglass).setUnlocalizedName("packedglass");
Item.itemsList[packedcoalIID] = new packedcoalIItem(packedcoalIID-256, packedcoalI).setUnlocalizedName("packedcoalI");
Item.itemsList[packedcoalIIID] = new packedcoalIIItem(packedcoalIIID-256, packedcoalII).setUnlocalizedName("packedcoalII");
Item.itemsList[packedcoalIIIID] = new packedcoalIIIItem(packedcoalIIIID-256, packedcoalIII).setUnlocalizedName("packedcoalIII");
Item.itemsList[packedcoalIVID] = new packedcoalIVItem(packedcoalIVID-256, packedcoalIV).setUnlocalizedName("packedcoalIV");
Item.itemsList[packedcharcoalIID] = new packedcharcoalIItem(packedcharcoalIID-256, packedcharcoalI).setUnlocalizedName("packedcharcoalI");
Item.itemsList[packedcharcoalIIID] = new packedcharcoalIIItem(packedcharcoalIIID-256, packedcharcoalII).setUnlocalizedName("packedcharcoalII");
Item.itemsList[packedcharcoalIIIID] = new packedcharcoalIIIItem(packedcharcoalIIIID-256, packedcharcoalIII).setUnlocalizedName("packedcharcoalIII");
Item.itemsList[packedcharcoalIVID] = new packedcharcoalIVItem(packedcharcoalIVID-256, packedcharcoalIV).setUnlocalizedName("packedcharcoalIV");
Item.itemsList[packedblocksVIID] = new packedblocksVIItem(packedblocksVIID-256, packedblocksVI).setUnlocalizedName("packedblocksVI");
Item.itemsList[packedblocksVIIID] = new packedblocksVIIItem(packedblocksVIIID-256, packedblocksVII).setUnlocalizedName("packedblocksVII");
Item.itemsList[packedblocksVIIIID] = new packedblocksVIIIItem(packedblocksVIIIID-256, packedblocksVIII).setUnlocalizedName("packedblocksVIII");
	}
	
{

GameRegistry.registerFuelHandler(new storemoreFuels());
	}
@PostInit
public void postInit(FMLPostInitializationEvent event) {
       
}

}