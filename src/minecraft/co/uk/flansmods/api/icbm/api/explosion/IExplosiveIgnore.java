package icbm.api.explosion;

/**
 * Applied to entities that ignore the affects of a specific explosion.
 * 
 * @author Calclavia
 * 
 */
public interface IExplosiveIgnore
{
	public boolean canIgnore(IExplosion explosion);
}
