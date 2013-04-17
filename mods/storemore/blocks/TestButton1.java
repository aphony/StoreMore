package mods.storemore.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.storemore.items.TimedButton;
import net.minecraft.block.Block;
import net.minecraft.util.Icon;

public class TestButton1 extends TimedButton
{
    public TestButton1(int par1)
    {
        super(par1, true);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return Block.planks.getBlockTextureFromSide(1);
    }
}
