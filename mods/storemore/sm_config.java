package mods.storemore;

import java.io.File;

import mods.storemore.blocks.blockitems.packedblocksIItem;
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
		public static int packedcoalIID = 2150;
		public static int packedcoalIIID = 2151;
		public static int packedcoalIIIID = 2152;
		public static int packedcoalIVID = 2153;
		public static int packedcharcoalIID = 2154;
		public static int packedcharcoalIIID = 2155;
		public static int packedcharcoalIIIID = 2156;
		public static int packedcharcoalIVID = 2157;
		public static int packedblocksVIID = 2106;
		public static int packedblocksVIIID = 2107;
		public static int packedblocksVIIIID = 2108;
		
		public static void initialize(File file)
	    {
	        config = new Configuration(file); 
	        
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
		    
		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}
