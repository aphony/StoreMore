package mods.storemore;

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.IGuiHandler;

public class SProxy 
implements IGuiHandler{
	
	@SidedProxy(clientSide = "mods.storemore.client.CProxy", serverSide = "mods.storemore.SProxy")
	public static SProxy proxy;

	public void registerRenderers(){


	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		return null;
	}



	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		return null;
	} 

	  public void registerTiles()
	  {
	  }

	  public void registerBlocks()
	  {
	  }

	  public void addNames()
	  {
	  }

	  public void addRecipes()
	  {
	  }
	  
	  public String getCurrentLanguage() {
			return null;
		}

	  public File getStoreMoreBase() {
			return new File("./");
		}


}