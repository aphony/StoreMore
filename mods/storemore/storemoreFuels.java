package mods.storemore;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;


public class storemoreFuels implements IFuelHandler{
	
	
@Override
public int getBurnTime(ItemStack fuel) {
if(fuel.itemID == StoreMore.packedcoalI.blockID){
return 7000;
}
else if(fuel.itemID == StoreMore.packedcoalII.blockID){
return 72000;
}
else if(fuel.itemID == StoreMore.packedcoalIII.blockID){
return 750000;
}
else if(fuel.itemID == StoreMore.packedcoalIV.blockID){
return 8000000;
}
else if(fuel.itemID == StoreMore.packedcharcoalI.blockID){
return 4500;
}
else if(fuel.itemID == StoreMore.packedcharcoalII.blockID){
return 50000;
}
else if(fuel.itemID == StoreMore.packedcharcoalIII.blockID){
return 550000;
}
else if(fuel.itemID == StoreMore.packedcharcoalIV.blockID){
return 6000000;
}
else
return 0;
}
}