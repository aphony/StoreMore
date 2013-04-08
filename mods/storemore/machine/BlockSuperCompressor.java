package mods.storemore.machine;

import java.util.Random;

import mods.storemore.StoreMore;
import mods.storemore.machine.tileentities.TileSuperCompressor;
import mods.storemore.proxys.SProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSuperCompressor extends BlockContainer
{

	private Random furnaceRand = new Random();

	private final boolean isActive;

	private Icon icoFurnaceTop;
	private Icon icoFurnaceBottom;
	private Icon icoFurnaceSide;
	private Icon icoFurnaceFrontInactive;
	private Icon icoFurnaceFrontActive;

	private static boolean keepInventory = false;

	private static final int METADATA_BITMASK = 0x7;
	private static final int METADATA_ACTIVEBIT = 0x8;
	private static final int METADATA_CLEARACTIVEBIT = -METADATA_ACTIVEBIT - 1;

	public static int clearActiveOnMetadata(int metadata)
	{
		return metadata & METADATA_CLEARACTIVEBIT;
	}

	public static boolean isActiveSet(int metadata)
	{
		return (metadata & METADATA_ACTIVEBIT) != 0;
	}

	public static int setActiveOnMetadata(int metadata)
	{
		return metadata | METADATA_ACTIVEBIT;
	}

	public static int unmarkedMetadata(int metadata)
	{
		return metadata & METADATA_BITMASK;
	}

	private static boolean keepFurnaceInventory = false;

	public BlockSuperCompressor(int id, boolean par2, Material material)
	{
		super(id, material);
		this.isActive = par2;
		this.setStepSound(soundStoneFootstep);
		this.setTickRandomly(true);
	}

	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "SuperCompressor";
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return StoreMore.BlockSuperCompressor.blockID;
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World,
			int par2, int par3, int par4)
	{
		int l = par1World.getBlockMetadata(par2, par3, par4);
		TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
		keepFurnaceInventory = true;

		if (par0)
		{
			par1World.setBlock(par2, par3, par4,
					StoreMore.superCompressorActive.blockID);
		} else
		{
			par1World.setBlock(par2, par3, par4,
					StoreMore.superCompressorIdle.blockID);
		}

		keepFurnaceInventory = false;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (tileentity != null)
		{
			tileentity.validate();
			par1World.setBlockTileEntity(par2, par3, par4, tileentity);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		icoFurnaceTop = par1IconRegister.registerIcon(SProxy
				.getIconLocation("SuperCompressorTop"));
		icoFurnaceBottom = par1IconRegister.registerIcon(SProxy
				.getIconLocation("SuperCompressorBottom"));
		icoFurnaceSide = par1IconRegister.registerIcon(SProxy
				.getIconLocation("SuperCompressorSide"));
		icoFurnaceFrontInactive = par1IconRegister.registerIcon(SProxy
				.getIconLocation("SuperCompressorFrontInactive"));
		icoFurnaceFrontActive = par1IconRegister.registerIcon(SProxy
				.getIconLocation("SuperCompressorFrontActive"));

	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int x, int y,
			int z, int side)
	{
		int meta = par1IBlockAccess.getBlockMetadata(x, y, z);
		switch (side)
		{
		case StoreMore.sideBottom:
			return icoFurnaceBottom;
		case StoreMore.sideTop:
			return icoFurnaceTop;
		default:
		{
			if (side == unmarkedMetadata(meta))
			{
				if (this.isActiveSet(meta))
					return icoFurnaceFrontActive;
				else
					return icoFurnaceFrontInactive;
			} else
				return icoFurnaceSide;
		}
		}
	};

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
	{
		switch (side)
		{
		case StoreMore.sideBottom:
			return icoFurnaceBottom;
		case StoreMore.sideTop:
			return icoFurnaceTop;
		case StoreMore.sideSouth:
			return icoFurnaceFrontInactive;
		default:
			return icoFurnaceSide;
		}
	};

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer entityplayer, int a, float b, float c, float d)
	{

		entityplayer.openGui(StoreMore.instance, 0, world, x, y, z);
		return false;
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4,
			int par5, int par6)
	{
		if (!keepFurnaceInventory)
		{
			TileSuperCompressor var7 = (TileSuperCompressor) par1World
					.getBlockTileEntity(par2, par3, par4);

			if (var7 != null)
			{
				for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
				{
					ItemStack var9 = var7.getStackInSlot(var8);

					if (var9 != null)
					{
						float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

						while (var9.stackSize > 0)
						{
							int var13 = this.furnaceRand.nextInt(21) + 10;

							if (var13 > var9.stackSize)
							{
								var13 = var9.stackSize;
							}

							var9.stackSize -= var13;
							EntityItem var14 = new EntityItem(par1World,
									(double) ((float) par2 + var10),
									(double) ((float) par3 + var11),
									(double) ((float) par4 + var12),
									new ItemStack(var9.itemID, var13,
											var9.getItemDamage()));

							if (var9.hasTagCompound())
							{
								// func_92014_d() gets back an Item
								var14.getEntityItem().setTagCompound(
										(NBTTagCompound) var9.getTagCompound()
										.copy());
							}

							float var15 = 0.05F;
							var14.motionX = (double) ((float) this.furnaceRand
									.nextGaussian() * var15);
							var14.motionY = (double) ((float) this.furnaceRand
									.nextGaussian() * var15 + 0.2F);
							var14.motionZ = (double) ((float) this.furnaceRand
									.nextGaussian() * var15);
							par1World.spawnEntityInWorld(var14);
						}
					}
				}
			}
		}

		super.breakBlock(par1World, par2, par3, par4, par5, par6);

	}

	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random par5Random)
	{
		if (this.isActive(par1World, par2, par3, par4))
		{
			int var6 = unmarkedMetadata(par1World.getBlockMetadata(par2, par3,
					par4));
			float var7 = (float) par2 + 0.5F;
			float var8 = (float) par3 + 0.0F + par5Random.nextFloat() * 6.0F
					/ 16.0F;
			float var9 = (float) par4 + 0.5F;
			float var10 = 0.52F;
			float var11 = par5Random.nextFloat() * 0.6F - 0.3F;

			if (var6 == 4)
			{
				par1World.spawnParticle("smoke", (double) (var7 - var10),
						(double) var8, (double) (var9 + var11), 0.0D, 0.0D,
						0.0D);

			} else if (var6 == 5)
			{
				par1World.spawnParticle("smoke", (double) (var7 + var10),
						(double) var8, (double) (var9 + var11), 0.0D, 0.0D,
						0.0D);

			} else if (var6 == 2)
			{
				par1World.spawnParticle("smoke", (double) (var7 + var11),
						(double) var8, (double) (var9 - var10), 0.0D, 0.0D,
						0.0D);

			} else if (var6 == 3)
			{
				par1World.spawnParticle("smoke", (double) (var7 + var11),
						(double) var8, (double) (var9 + var10), 0.0D, 0.0D,
						0.0D);

			}
		}
	}

	private boolean isActive(World par1World, int par2, int par3, int par4)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		if (isActiveSet(meta))
			return true;
		else
			return false;
	}

	private boolean isActive(IBlockAccess par1IBlockAccess, int par2, int par3,
			int par4)
	{
		int meta = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if (isActiveSet(meta))
			return true;
		else
			return false;
	}

	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		super.onBlockAdded(par1World, par2, par3, par4);
		this.setDefaultDirection(par1World, par2, par3, par4);
		par1World.markBlockForUpdate(par2, par3, par4);
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4,
			EntityLiving par5EntityLiving, ItemStack par6ItemStack)
	{
		int var6 = MathHelper
				.floor_double((double) (par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (var6 == 0)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}

		if (var6 == 1)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
		}

		if (var6 == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}

		if (var6 == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
		}
	}

	private void setDefaultDirection(World par1World, int par2, int par3,
			int par4)
	{
		if (!par1World.isRemote)
		{
			int var5 = par1World.getBlockId(par2, par3, par4 - 1);
			int var6 = par1World.getBlockId(par2, par3, par4 + 1);
			int var7 = par1World.getBlockId(par2 - 1, par3, par4);
			int var8 = par1World.getBlockId(par2 + 1, par3, par4);
			byte var9 = 3;

			if (Block.opaqueCubeLookup[var5] && !Block.opaqueCubeLookup[var6])
			{
				var9 = 3;
			}

			if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var5])
			{
				var9 = 2;
			}

			if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var8])
			{
				var9 = 5;
			}

			if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var7])
			{
				var9 = 4;
			}

			par1World.setBlockMetadataWithNotify(par2, par3, par4, var9,
					BlockNotifyType.ALL);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileSuperCompressor();
	}

}