package mods.storemore.handlers;

import net.minecraft.creativetab.CreativeTabs;

public class StoreMoreTab extends CreativeTabs {
	public StoreMoreTab(int position,String tabID){
		super(position,tabID);
	}

	public String getTranslatedTabLabel()
	{
	return "StoreMore"; //the name that shows up in-game
	}

}