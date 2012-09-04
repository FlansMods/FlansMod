package flan.server;

import java.util.List;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Vec3;

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
					worldObj.setBlockWithNotify(i, j, k, 0);
					FMLClientHandler.instance().getClient().effectRenderer.addBlockHitEffects(i, j, k, 1);
					block.dropBlockAsItem(worldObj, i, j, k, meta, 1);
					FMLClientHandler.instance().getClient().sndManager.playSound(block.stepSound.getBreakSound(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
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
	
	public void die()
	{
		if(isDead)
			return;
		setDead();
		if(FlansMod.explosions)
			worldObj.createExplosion(this, posX, posY, posZ, 1F);
		int tileX = MathHelper.floor_double(posX + 0.5D);
		int tileY = MathHelper.floor_double(posY + 0.5D);
		int tileZ = MathHelper.floor_double(posZ + 0.5D);
		if(FlansMod.explosions && worldObj.getBlockId(tileX, tileY, tileZ) == 0)
			worldObj.setBlockWithNotify(tileX, tileY, tileZ, Block.fire.blockID);
		for(int j = 0; j < 50; j++)
		{				
			worldObj.spawnParticle("smoke", posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}
		for(int j = 0; j < 10; j++)
		{				
			worldObj.spawnParticle("flame", posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}
	}

    protected void entityInit() {}

    protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {}
	
    protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {}

    public boolean canBeCollidedWith()
    {
        return true;
    }
	
	public boolean interact(EntityPlayer player)
    {
		return plane.interact(player);
	}
	
    public boolean attackEntityFrom(DamageSource damageSource, int i)
    {
		if(plane != null)
			return plane.attackEntityFromPart(this, damageSource, i);
		return false;
    }

    public boolean isEntityEqual(Entity entity)
    {
		for(EntityCollisionBox box : plane.boxes)
		{
			if(entity == box)
				return true;
		}
        return this == entity || plane == entity;
    }
}
