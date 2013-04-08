package mods.storemore.gui;

import mods.storemore.containers.ContainerSuperCompressor;
import mods.storemore.machine.tileentities.TileSuperCompressor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z)
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileSuperCompressor)
		{
			return new ContainerSuperCompressor(player.inventory,
					(TileSuperCompressor) tileEntity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z)
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileSuperCompressor)
		{
			return new GuiSuperCompressor(player.inventory,
					(TileSuperCompressor) tileEntity);
		}
		return null;

	}
}