package co.uk.flansmods.common;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityParachute extends Entity implements IEntityAdditionalSpawnData
{
	public ToolType type;
	
	public EntityParachute(World w) 
	{
		super(w);
		ignoreFrustumCheck = true;
	}
	
	public EntityParachute(World w, ToolType t, EntityPlayer player)
	{
		this(w);
		type = t;
		setPosition(player.posX, player.posY, player.posZ);
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(riddenByEntity != null)
			riddenByEntity.fallDistance = 0F;
		
		motionY = -0.1D;
		
		if(riddenByEntity != null && riddenByEntity instanceof EntityLivingBase)
		{
			float speedMultiplier = 0.002F;
			double moveForwards = (double)((EntityLivingBase)this.riddenByEntity).moveForward;
			double moveStrafing = (double)((EntityLivingBase)this.riddenByEntity).moveStrafing;
			double sinYaw = -Math.sin((double)(riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
			double cosYaw = Math.cos((double)(this.riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
			motionX += (moveForwards * sinYaw + moveStrafing * cosYaw) * speedMultiplier;
			motionZ += (moveForwards * cosYaw - moveStrafing * sinYaw) * speedMultiplier;
			
			prevRotationYaw = riddenByEntity.prevRotationYaw;
			rotationYaw = riddenByEntity.rotationYaw;
		}		
		
		moveEntity(motionX, motionY, motionZ);
		
		if(onGround)
			setDead();
	}
	
	@Override
	protected void entityInit() 
	{
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		type = ToolType.getType(tags.getString("Type"));
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		tags.setString("Type", type.shortName);
	}

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) 
	{
		data.writeUTF(type.shortName);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data)
	{
		type = ToolType.getType(data.readUTF());
	}

}
