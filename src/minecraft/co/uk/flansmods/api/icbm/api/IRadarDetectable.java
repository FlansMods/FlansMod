package icbm.api;

import net.minecraft.tileentity.TileEntity;

/**
 * Make your TileEntity implement this to have special reaction to radar scanning.
 * 
 * @author Calclavia
 * 
 */
public interface IRadarDetectable
{
	/**
	 * @param radar - The radar tile entity
	 * @return True if this tile is to be shown in the radar.
	 */
	public boolean canDetect(TileEntity radar);
}
