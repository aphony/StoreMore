package mods.storemore;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;


public class storemoreFuels implements IFuelHandler{
	
	
@Override
public int getBurnTime(ItemStack fuel) {
if(fuel.itemID == storemoreMain.packedcoalI.blockID){
return 7000;
}
else if(fuel.itemID == storemoreMain.packedcoalII.blockID){
return 72000;
}
else if(fuel.itemID == storemoreMain.packedcoalIII.blockID){
return 750000;
}
else if(fuel.itemID == storemoreMain.packedcoalIV.blockID){
return 8000000;
}
else if(fuel.itemID == storemoreMain.packedcharcoalI.blockID){
return 4500;
}
else if(fuel.itemID == storemoreMain.packedcharcoalII.blockID){
return 50000;
}
else if(fuel.itemID == storemoreMain.packedcharcoalIII.blockID){
return 550000;
}
else if(fuel.itemID == storemoreMain.packedcharcoalIV.blockID){
return 6000000;
}
else
return 0;
}
}