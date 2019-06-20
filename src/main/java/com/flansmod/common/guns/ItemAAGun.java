package com.flansmod.common.guns;

import java.util.ArrayList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemAAGun extends Item implements IFlanItem
{
	public static final ArrayList<String> names = new ArrayList<>();
	public AAGunType type;
	
	public ItemAAGun(AAGunType type1)
	{
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityplayer, EnumHand hand)
	{
		ItemStack itemstack = entityplayer.getHeldItem(hand);
		//Raytracing
		float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
		float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
		float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
		float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
		double length = 5D;
		Vec3d posVec = new Vec3d(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.getYOffset(), entityplayer.posZ);
		Vec3d lookVec = posVec.add(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
		RayTraceResult RayTraceResult = world.rayTraceBlocks(posVec, lookVec, true);
		
		//Result check
		if(RayTraceResult == null)
		{
			return new ActionResult<>(EnumActionResult.PASS, itemstack);
		}
		if(RayTraceResult.typeOfHit == Type.BLOCK)
		{
			int i = RayTraceResult.getBlockPos().getX();
			int j = RayTraceResult.getBlockPos().getY();
			int k = RayTraceResult.getBlockPos().getZ();
			if(!world.isRemote && world.isSideSolid(RayTraceResult.getBlockPos(), EnumFacing.UP))
			{
				world.spawnEntity(new EntityAAGun(world, type, (double)i + 0.5F, (double)j + 1F, (double)k + 0.5F, entityplayer));
			}
			if(!entityplayer.capabilities.isCreativeMode)
			{
				itemstack.setCount(itemstack.getCount() - 1);
			}
			return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<>(EnumActionResult.PASS, itemstack);
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
	public InfoType getInfoType()
	{
		return type;
	}
}
