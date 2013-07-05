package co.uk.flansmods.common;

import co.uk.flansmods.common.network.PacketRightClick;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class EntityCollisionBox extends Entity
{
    public final EntityDriveable plane;
	public final int x;
	public final int y;
	public final int z;
	public final int strength;
	public final int part; 	//0 = Body, 1 = Left Wing, 2 = Right Wing, 3 = Tail, 4 = Turret
	public boolean wasInBlock;
	public boolean inBlock;

    public EntityCollisionBox(EntityDriveable p, int i, int j, int k, int s, int pt)
    {
        super(p.worldObj);
        setSize(1F, 1F);
        plane = p;
		setPosition(plane.posX, plane.posY, plane.posZ);
		x = i;
		y = j;
		z = k;
		strength = s;
		part = pt;
    }
	
    @Override
	public void onUpdate()
	{
		super.onUpdate();
		wasInBlock = inBlock;
		if(plane.isDead)
			setDead();
		plane.updateCollisionBox(this);
	}
	
	public void smashIntoBlock(int i, int j, int k)
	{
		if(worldObj.isRemote || !FlansMod.explosions)
			return;
		int blockID = worldObj.getBlockId(i, j, k);
		if(blockID != 0)
		{
			int meta = worldObj.getBlockMetadata(i, j, k);
			Block block = Block.blocksList[blockID];
			if(block.blockMaterial.isSolid())
			{
				float damage = block.getBlockHardness(worldObj, i, j, k) * 20F;
				double speed = motionX * motionX + motionY * motionY + motionZ * motionZ;
				attackEntityFrom(DamageSource.inWall, (int)(damage * speed));
				if(damage <= 20F && damage > 0F && speed > 0.3D)
				{
					worldObj.setBlock(i, j, k, 0, 0, 5);
					block.dropBlockAsItem(worldObj, i, j, k, meta, 1);
					FlansMod.proxy.playBlockBreakSound(i, j, k, block.blockID);
				}
			}
		}
	}
	
	public boolean hasEnteredBlock()
	{
		Vec3 vec = plane.rotate(x / 16D, y / 16D, z / 16D);
		int tileX = MathHelper.floor_double(plane.posX + vec.xCoord + 0.5D);
		int tileY = MathHelper.floor_double(plane.posY + vec.yCoord + 0.5D);
		int tileZ = MathHelper.floor_double(plane.posZ + vec.zCoord + 0.5D);
		return worldObj.getBlockId(tileX, tileY, tileZ) != 0;
	}
	
	public void explode()
	{
		if(isDead)
			return;
		setDead();
		if(FlansMod.explosions)
			worldObj.createExplosion(this, posX, posY, posZ, 1F, false);
		int tileX = MathHelper.floor_double(posX + 0.5D);
		int tileY = MathHelper.floor_double(posY + 0.5D);
		int tileZ = MathHelper.floor_double(posZ + 0.5D);
		if(FlansMod.explosions && worldObj.getBlockId(tileX, tileY, tileZ) == 0)
			worldObj.setBlock(tileX, tileY, tileZ, Block.fire.blockID, 0, 5);
		for(int j = 0; j < 50; j++)
		{				
			worldObj.spawnParticle("smoke", posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}
		for(int j = 0; j < 10; j++)
		{				
			worldObj.spawnParticle("flame", posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}
	}

	@Override
    protected void entityInit() {}

	@Override
    protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {}
	
	@Override
    protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {}

	@Override
    public boolean canBeCollidedWith()
    {
        return true;
    }
	
	@Override
	public boolean interact(EntityPlayer player)
    {
		if(worldObj.isRemote)
		{
			PacketDispatcher.sendPacketToServer(PacketRightClick.buildClickPacket(this));
		}
		return plane.interact(player);
	}
	
	@Override
    public boolean attackEntityFrom(DamageSource damageSource, float i)
    {
		if(plane != null)
			return plane.attackEntityFromPart(this, damageSource, i);
		return false;
    }

	@Override
    public boolean isEntityEqual(Entity entity)
    {
		for(EntityCollisionBox box : plane.boxes)
		{
			if(entity == box)
				return true;
		}
		for(EntityPassengerSeat seat : plane.seats)
		{
			if(entity == seat || entity == seat.riddenByEntity)
				return true;
		}
        return this == entity || plane == entity || plane.riddenByEntity == entity;
    }
}
