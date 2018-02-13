package com.flansmod.common.guns;

import java.util.ArrayList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemAAGun extends Item implements IFlanItem
{
    public static final ArrayList<String> names = new ArrayList<String>();
	public AAGunType type;

	public ItemAAGun(AAGunType type1)
	{
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D;
        Vec3 posVec = new Vec3(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.getYOffset(), entityplayer.posZ);        
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, true);
        
        //Result check
		if (movingobjectposition == null)
		{
			return itemstack;
		}
		if (movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
		{
			int i = movingobjectposition.getBlockPos().getX();
			int j = movingobjectposition.getBlockPos().getY();
			int k = movingobjectposition.getBlockPos().getZ();
			if (!world.isRemote && world.isSideSolid(movingobjectposition.getBlockPos(), EnumFacing.UP))
			{
				world.spawnEntity(new EntityAAGun(world, type, (double) i + 0.5F, (double) j + 1F, (double) k + 0.5F, entityplayer));
			}
			if (!entityplayer.capabilities.isCreativeMode)
			{
				itemstack.stackSize--;
			}
		}
		return itemstack;
	}
	
	public Entity spawnAAGun(World world, double x, double y, double z, ItemStack stack)
	{
		Entity entity = new EntityAAGun(world, type, x, y, z, null);
		if(!world.isRemote)
		{
			world.spawnEntity(entity);
        }
    	return entity;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }

	
	@Override
	public InfoType getInfoType() 
	{
		return type;
	}
}
