package com.flansmod.common.driveables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMapBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class ItemVehicle extends ItemMapBase implements IPaintableItem
{
	public VehicleType type;
	
	public ItemVehicle(VehicleType type1)
	{
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanDriveables);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
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
			if(!world.isRemote && stack.getItemDamage() != 0)
				stack.setTagCompound(getOldTagCompound(stack, world));
			if(stack.getTagCompound() == null)
			{
				NBTTagCompound tags = new NBTTagCompound();
				stack.setTagCompound(tags);
				tags.setString("Type", type.shortName);
				tags.setString("Engine", PartType.defaultEngines.get(EnumType.vehicle).shortName);
			}
		}
		return stack.getTagCompound();
	}
	
	private NBTTagCompound getOldTagCompound(ItemStack stack, World world)
	{
		try
		{
			File file1 = world.getSaveHandler().getMapFileFromName("vehicle_" + stack.getItemDamage());
			FileInputStream fileinputstream = new FileInputStream(file1);
			NBTTagCompound tags = CompressedStreamTools.readCompressed(fileinputstream).getCompoundTag("data");
			for(EnumDriveablePart part : EnumDriveablePart.values())
			{
				tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
				tags.setBoolean(part.getShortName() + "_Fire", false);
			}
			fileinputstream.close();
			return tags;
		}
		catch(IOException e)
		{
			FlansMod.log("Failed to read old vehicle file");
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
		NBTTagCompound tags = getTagCompound(stack, player.worldObj);
		String engineName = tags.getString("Engine");
		PartType part = PartType.getPart(engineName);
		if(part != null)
			lines.add(part.name);
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
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, type.placeableOnWater);
        
        //Result check
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
        {
            BlockPos pos = movingobjectposition.getBlockPos();
            Block block = world.getBlockState(pos).getBlock();
            if(type.placeableOnLand || block instanceof BlockLiquid)
            {
	            if(!world.isRemote)
	            {
					world.spawnEntityInWorld(new EntityVehicle(world, (double)pos.getX() + 0.5F, (double)pos.getY() + 2.5F, (double)pos.getZ() + 0.5F, entityplayer, type, getData(itemstack, world)));
	            }
				if(!entityplayer.capabilities.isCreativeMode)
				{	
					itemstack.stackSize--;
				}
			}
		}
		return itemstack;
	}

	public Entity spawnVehicle(World world, double x, double y, double z, ItemStack stack)
	{
		Entity entity = new EntityVehicle(world, x, y, z, type, getData(stack, world));
		if(!world.isRemote)
		{
			world.spawnEntityInWorld(entity);
		}
		return entity;
	}
	
	public DriveableData getData(ItemStack itemstack, World world)
	{
		return new DriveableData(getTagCompound(itemstack, world), itemstack.getItemDamage());
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
    
    /** Make sure that creatively spawned planes have nbt data */
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack planeStack = new ItemStack(item, 1, 0);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Type", type.shortName);
    	if(PartType.defaultEngines.containsKey(EnumType.vehicle))
    		tags.setString("Engine", PartType.defaultEngines.get(EnumType.vehicle).shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	planeStack.setTagCompound(tags);
        list.add(planeStack);
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
