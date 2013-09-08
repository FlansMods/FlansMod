package icbm.api.explosion;

import net.minecraft.entity.Entity;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event;

/**
 * Use ForgeSubscribe to subscribe to this event. This event is called every single time when an
 * ICBM explosion happens.
 * 
 * @author Calclavia
 * 
 */
@Cancelable
public class ExplosionEvent extends Event
{
	/**
	 * The explosion object. Can be cast into {@link Explosion}. This event can be canceled to
	 * prevent a specific part of an explosion from being executed.
	 */
	public World world;
	public double x, y, z;
	public IExplosion iExplosion;

	/**
	 * Pre-cast explosion class.
	 */
	public Explosion explosion;

	public ExplosionEvent(World world, IExplosion iExplosion)
	{
		this.world = world;
		this.iExplosion = iExplosion;
		this.x = ((Explosion) iExplosion).explosionX;
		this.y = ((Explosion) iExplosion).explosionY;
		this.z = ((Explosion) iExplosion).explosionZ;
	}

	/**
	 * Called before an explosive is detonated or a missile is placed to check if detonation is
	 * possible. You may cancel and explosion here if needed. After this it will be a bit too late
	 * to prevent destruction without any losses.
	 * 
	 * @author Calclavia
	 * 
	 */
	@Cancelable
	public static class ExplosivePreDetonationEvent extends Event
	{
		/** The world object */
		public World world;
		/** The entity causing the explosion. This could be null */
		public Entity entity;
		/** The position in which the explosion might happen. */
		public double x, y, z;
		/** The explosive object. */
		public IExplosive explosion;
		/** The explosive type. */
		public ExplosiveType type;

		public ExplosivePreDetonationEvent(World world, double x, double y, double z, ExplosiveType type, IExplosive explosion)
		{
			this.world = world;
			this.type = type;
			this.explosion = explosion;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public ExplosivePreDetonationEvent(World world, Entity entity, ExplosiveType type, IExplosive explosion)
		{
			this.world = world;
			this.entity = entity;
			this.type = type;
			this.explosion = explosion;
			this.x = entity.posX;
			this.y = entity.posY;
			this.z = entity.posZ;
		}
	}

	/**
	 * Called when an explosion is constructed.
	 * 
	 * @author Calclavia
	 * 
	 */
	public static class ExplosionConstructionEvent extends ExplosionEvent
	{
		public ExplosionConstructionEvent(World world, IExplosion explosion)
		{
			super(world, explosion);
		}
	}

	/**
	 * Called before an explosion happens.
	 * 
	 * @author Calclavia
	 * 
	 */
	public static class PreExplosionEvent extends ExplosionEvent
	{
		public PreExplosionEvent(World world, IExplosion explosion)
		{
			super(world, explosion);
		}
	}

	/**
	 * Called while an explosion happens. May be called every single tick if explosion is
	 * procedural. (E.g: Red matter explosive)
	 * 
	 * @author Calclavia
	 * 
	 */
	public static class DoExplosionEvent extends ExplosionEvent
	{
		public DoExplosionEvent(World world, IExplosion explosion)
		{
			super(world, explosion);
		}
	}

	/**
	 * Called after an explosion happens.
	 * 
	 * @author Calclavia
	 * 
	 */
	public static class PostExplosionEvent extends ExplosionEvent
	{
		public PostExplosionEvent(World world, IExplosion explosion)
		{
			super(world, explosion);
		}
	}
}
