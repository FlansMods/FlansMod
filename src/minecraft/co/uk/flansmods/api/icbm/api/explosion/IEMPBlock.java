package icbm.api.explosion;

import net.minecraft.world.World;
import universalelectricity.core.vector.Vector3;

/**
 * Applied to all blocks that has a custom reaction to EMPs. Blocks not TileEntities.
 * 
 * @author Calclavia
 * 
 */
public interface IEMPBlock
{
	/**
	 * Called when this block gets attacked by EMP.
	 * 
	 * @param world - The world object.
	 * @param position - The position.
	 * @param empExplosive - The explosion
	 */
	public void onEMP(World world, Vector3 position, IExplosion empExplosive);
}
