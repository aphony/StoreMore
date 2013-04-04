package mods.storemore;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Loader;

public class sm_modCompatability {
	
	private static Class Ic2Items;

	public static ItemStack getIC2Item(String name) {
		try {
			if (Ic2Items == null)
				Ic2Items = Class.forName("ic2.core.Ic2Items");

			Object ret = Ic2Items.getField(name).get(null);

			if (ret instanceof ItemStack) {
				return ((ItemStack) ret).copy();
			} 
			
			else {
				return null;
			}
		} catch (Exception e) {
	System.out.println("IC2 API: Call getItem failed for "+name);

return null;
}
}

}