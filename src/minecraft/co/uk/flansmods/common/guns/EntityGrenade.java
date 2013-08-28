package co.uk.flansmods.common.guns;

import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.vector.Vector3f;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends Entity 
{
	public GrenadeType type;
	public EntityLivingBase thrower;
	/** Yeah, I want my grenades to have fancy physics */
	public RotatedAxes axes = new RotatedAxes();
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 10F);
	public float prevRotationRoll = 0F;
	
	public EntityGrenade(World w) 
	{
		super(w);
	}
	
	public EntityGrenade(World w, GrenadeType g, EntityLivingBase t) 
	{
		this(w);
		setPosition(t.posX, t.posY, t.posZ);
		type = g;
		thrower = t;
		setSize(g.hitBoxSize, g.hitBoxSize);
		axes.setAngles(t.rotationYaw + 90F, t.rotationPitch, 0F);
		rotationYaw = prevRotationYaw = t.rotationYaw + 90F;
		rotationPitch = prevRotationPitch = t.rotationPitch;
		float speed = 0.5F * type.throwSpeed;
		motionX = axes.getXAxis().x * speed;
		motionY = axes.getXAxis().y * speed;
		motionZ = axes.getXAxis().z * speed;
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		//Visuals
		if(type.trailParticles)
			worldObj.spawnParticle(type.trailParticleType, posX, posY, posZ, 0F, 0F, 0F);
		
		//Physics and motion
		prevRotationYaw = axes.getYaw();
		prevRotationPitch = axes.getPitch();
		prevRotationRoll = axes.getRoll();
		if(angularVelocity.lengthSquared() > 0.00000001F)
			axes.rotateLocal(angularVelocity.length(), angularVelocity.normalise(null));
		
		motionY -= 9.81D / 400D * type.fallSpeed;
		
		Vector3f posVec = new Vector3f(posX, posY, posZ);
		Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
		Vector3f nextPosVec = Vector3f.add(posVec, motVec, null);
		
		//Raytrace the motion of this grenade
		MovingObjectPosition hit = worldObj.clip(posVec.toVec3(), nextPosVec.toVec3());
		//If we hit block
		if(hit != null && hit.typeOfHit == EnumMovingObjectType.TILE)
		{
			//Get the blockID and block material
			int blockID = worldObj.getBlockId(hit.blockX, hit.blockY, hit.blockZ);
			Material mat = worldObj.getBlockMaterial(hit.blockX, hit.blockY, hit.blockZ);
			
			//If we hit glass and can break it, do so
			if(type.breaksGlass && mat == Material.glass)
				worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
		}
		
		moveEntity(motionX, motionY, motionZ);
	}

	@Override
	protected void entityInit() 
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) 
	{

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) 
	{
		
	}

}
