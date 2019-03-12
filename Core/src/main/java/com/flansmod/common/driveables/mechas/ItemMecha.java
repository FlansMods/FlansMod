package com.flansmod.common.driveables.mechas;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class ItemMecha extends Item implements IPaintableItem
{
	public MechaType type;

	public ItemMecha(MechaType type1)
	{
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanMechas);
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
		NBTTagCompound tags = getTagCompound(stack, world);
		String engineName = tags.getString("Engine");
		PartType part = PartType.getPart(engineName);
		if(part != null)
			lines.add(part.name);
	}
	
	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}
	
	private NBTTagCompound getTagCompound(ItemStack stack, World world)
	{
		if(stack.getTagCompound() == null)
		{
			if(stack.getTagCompound() == null)
			{
				NBTTagCompound tags = new NBTTagCompound();
				stack.setTagCompound(tags);
				tags.setString("Type", type.shortName);
				tags.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
			}
		}
		return stack.getTagCompound();
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
			BlockPos pos = RayTraceResult.getBlockPos();
			if(!world.isRemote)
			{
				world.spawnEntity(new EntityMecha(world, (double)pos.getX() + 0.5F, (double)pos.getY() + 1.5F + type.yOffset, (double)pos.getZ() + 0.5F, entityplayer, type, getData(itemstack, world), getTagCompound(itemstack, world)));
			}
			if(!entityplayer.capabilities.isCreativeMode)
			{
				itemstack.setCount(itemstack.getCount() - 1);
			}
			return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<>(EnumActionResult.PASS, itemstack);
	}
	
	public DriveableData getData(ItemStack itemstack, World world)
	{
		return new DriveableData(getTagCompound(itemstack, world), itemstack.getItemDamage());
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(tab != FlansMod.tabFlanMechas && tab != CreativeTabs.SEARCH)
			return;

		ItemStack mechaStack = new ItemStack(this, 1, 0);
		NBTTagCompound tags = new NBTTagCompound();
		tags.setString("Type", type.shortName);
		if(PartType.defaultEngines.containsKey(EnumType.mecha))
			tags.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
		for(EnumDriveablePart part : EnumDriveablePart.values())
		{
			tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
			tags.setBoolean(part.getShortName() + "_Fire", false);
		}
		mechaStack.setTagCompound(tags);
		items.add(mechaStack);
	}

	@Override
	public InfoType getInfoType()
	{
		return type;
	}

	@Override
	public PaintableType GetPaintableType()
	{
		return type;
	}
}
