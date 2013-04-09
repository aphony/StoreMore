package mods.storemore;

import java.io.File;

import mods.storemore.blockitems.packedblocksIItem;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public class sm_config 

	{
	
	public static void init() {
	} 
	
		public static Configuration config; 
		
	
		public static int packedblocksIID = 2100;
		public static int packedblocksIIID = 2101;
		public static int packedblocksIIIID = 2102;
		public static int packedblocksIVID = 2103;
		public static int packedblocksVID = 2104;
		public static int packedglassID = 2105;
		public static int packedblocksVIID = 2106;
		public static int packedblocksVIIID = 2107;
		public static int packedblocksVIIIID = 2108;
		public static int packedblocksIXID = 2109;
		
		public static int packedfoodIID = 2130;
		public static int packedfoodIIID = 2131;
		public static int packedfoodIIIID = 2132;
		public static int packedfoodIVID = 2133;
		public static int packedfoodVID = 2134;

		public static int packedcoalIID = 2150;
		public static int packedcoalIIID = 2151;
		public static int packedcoalIIIID = 2152;
		public static int packedcoalIVID = 2153;
		public static int packedcharcoalIID = 2154;
		public static int packedcharcoalIIID = 2155;
		public static int packedcharcoalIIIID = 2156;
		public static int packedcharcoalIVID = 2157;
		
		public static int superCompressorIdleID = 2180; 
		
		public static int ic2blocksIID = 2160;
		
		public static int hardenedWoodPickaxeIID = 15000;
		public static int hardenedWoodPickaxeIIID = 15001;
		public static int hardenedWoodPickaxeIIIID = 15002;
		public static int hardenedWoodPickaxeIVID = 15003;		
		public static int hardenedStonePickaxeIID = 15004;
		public static int hardenedStonePickaxeIIID = 15005;
		public static int hardenedStonePickaxeIIIID = 15006;
		public static int hardenedStonePickaxeIVID = 15007;		
		public static int hardenedIronPickaxeIID = 15008;
		public static int hardenedIronPickaxeIIID = 15009;
		public static int hardenedIronPickaxeIIIID = 15010;
		public static int hardenedIronPickaxeIVID = 15011;		
		public static int hardenedGoldPickaxeIID = 15012;
		public static int hardenedGoldPickaxeIIID = 15013;
		public static int hardenedGoldPickaxeIIIID = 15014;
		public static int hardenedGoldPickaxeIVID = 15015;		
		public static int hardenedDiamondPickaxeIID = 15016;
		public static int hardenedDiamondPickaxeIIID = 15017;
		public static int hardenedDiamondPickaxeIIIID = 15018;
		public static int hardenedDiamondPickaxeIVID = 15019;
		
		
	    public static boolean IC2Enabled;


		
		public static void initialize(File file)
	    {
	        config = new Configuration(file); 

	        packedblocksIID = config.get("Packed Blocks", "Cobblestone & Stone", 2100).getInt();
		    packedblocksIIID = config.get("Packed Blocks", "Dirt & Gravel", 2101).getInt();
		    packedblocksIIIID = config.get("Packed Blocks", "Sand & Sandstone", 2102).getInt();
		    packedblocksIVID = config.get("Packed Blocks", "Obsidian, Glowstone, & Netherrack", 2103).getInt();
		    packedblocksVID = config.get("Packed Blocks", "Iron, Gold, Diamond, & Emerald", 2104).getInt();
		    packedglassID = config.get("Packed Blocks", "Glass", 2105).getInt();
		    packedblocksVIID = config.get("Packed Blocks", "Sticks, Torches, Gunpowder, Flint", 2106).getInt();
		    packedblocksVIIID = config.get("Packed Blocks", "Wood Blocks I", 2107).getInt();
		    packedblocksVIIIID = config.get("Packed Blocks", "Wood Planks I", 2108).getInt();
		    packedblocksIXID = config.get("Packed Blocks", "Redstone, Quartz, Soulsand & Clay", 2109).getInt();
		    
		    packedfoodIID = config.get("Packed Foods", "Red Apples, Gold Apples, Raw Beef, Cooked Beef", 2130).getInt();
		    packedfoodIIID = config.get("Packed Foods", "Bread, Cake, Carrots, Golden Carrots", 2131).getInt();
		    packedfoodIIID = config.get("Packed Foods", "Raw Chicken, Cooked Chicken, Cookies, Eggs", 2132).getInt();
		    packedfoodIIID = config.get("Packed Foods", "Sugar, Potato, Baked Potato, Poisened Potato", 2133).getInt();
		    packedfoodIIID = config.get("Packed Foods", "Raw Fish, Cooked Fish, Raw Pork, Cooked Pork", 2134).getInt();

		    packedcoalIID = config.get("Packed Fuels", "Coal I", 2150).getInt();
		    packedcoalIIID = config.get("Packed Fuels", "Coal II", 2151).getInt();
		    packedcoalIIIID = config.get("Packed Fuels", "Coal III", 2152).getInt();
		    packedcoalIVID = config.get("Packed Fuels", "Coal IV", 2153).getInt();
		    packedcharcoalIID = config.get("Packed Fuels", "Charcoal I", 2154).getInt();
		    packedcharcoalIIID = config.get("Packed Fuels", "Charcoal II", 2155).getInt();
		    packedcharcoalIIIID = config.get("Packed Fuels", "Charcoal III", 2156).getInt();
		    packedcharcoalIVID = config.get("Packed Fuels", "Charcoal IV", 2157).getInt();
	        
		    IC2Enabled = config.get("Mod Add-ons", "Enable Recipes for IC2", true).getBoolean(IC2Enabled);
	        		    
		    ic2blocksIID = config.get("IC2 Blocks", "Copper, Tin, Uranium & Bronze", 2160).getInt();
		    
		    hardenedWoodPickaxeIID = config.get("Tools", "Hardened Wood Pickaxe I", 15000).getInt();
		    hardenedWoodPickaxeIIID = config.get("Tools", "Hardened Wood Pickaxe II", 15001).getInt();
		    hardenedWoodPickaxeIIIID = config.get("Tools", "Hardened Wood Pickaxe III", 15002).getInt();
		    hardenedWoodPickaxeIVID = config.get("Tools", "Hardened Wood Pickaxe IV", 15003).getInt();
		    hardenedStonePickaxeIID = config.get("Tools", "Hardened Stone Pickaxe I", 15004).getInt();
		    hardenedStonePickaxeIIID = config.get("Tools", "Hardened Stone Pickaxe II", 15005).getInt();
		    hardenedStonePickaxeIIIID = config.get("Tools", "Hardened Stone Pickaxe III", 15006).getInt();
		    hardenedStonePickaxeIVID = config.get("Tools", "Hardened Stone Pickaxe IV", 15007).getInt();
		    hardenedIronPickaxeIID = config.get("Tools", "Hardened Iron Pickaxe I", 15008).getInt();
		    hardenedIronPickaxeIIID = config.get("Tools", "Hardened Iron Pickaxe II", 15009).getInt();
		    hardenedIronPickaxeIIIID = config.get("Tools", "Hardened Iron Pickaxe III", 15010).getInt();
		    hardenedIronPickaxeIVID = config.get("Tools", "Hardened Iron Pickaxe IV", 15011).getInt();
		    hardenedGoldPickaxeIID = config.get("Tools", "Hardened Gold Pickaxe I", 15012).getInt();
		    hardenedGoldPickaxeIIID = config.get("Tools", "Hardened Gold Pickaxe II", 15013).getInt();
		    hardenedGoldPickaxeIIIID = config.get("Tools", "Hardened Gold Pickaxe III", 15014).getInt();
		    hardenedGoldPickaxeIVID = config.get("Tools", "Hardened Gold Pickaxe IV", 15015).getInt();
		    hardenedDiamondPickaxeIID = config.get("Tools", "Hardened Diamond Pickaxe I", 15016).getInt();
		    hardenedDiamondPickaxeIIID = config.get("Tools", "Hardened Diamond Pickaxe II", 15017).getInt();
		    hardenedDiamondPickaxeIIIID = config.get("Tools", "Hardened Diamond Pickaxe III", 15018).getInt();
		    hardenedDiamondPickaxeIVID = config.get("Tools", "Hardened Diamond Pickaxe IV", 15019).getInt();
		    
		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}
