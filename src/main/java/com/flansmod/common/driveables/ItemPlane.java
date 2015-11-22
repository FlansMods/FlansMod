package com.flansmod.common.driveables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class ItemPlane extends Item implements IFlanItem
{
	public PlaneType type;
	
    public ItemPlane(PlaneType type1)
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
		if(stack.stackTagCompound == null)
		{
			if(!world.isRemote && stack.getItemDamage() != 0)
				stack.stackTagCompound = getOldTagCompound(stack, world);
			if(stack.stackTagCompound == null)
			{
				stack.stackTagCompound = new NBTTagCompound();
				stack.stackTagCompound.setString("Type", type.shortName);
				stack.stackTagCompound.setString("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
			}
		}
		return stack.stackTagCompound;
	}
	
	private NBTTagCompound getOldTagCompound(ItemStack stack, World world)
    {
		try
		{
			File file1 = world.getSaveHandler().getMapFileFromName("plane_" + stack.getItemDamage());
			if(file1 != null && file1.exists())
			{
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
		}
		catch(IOException e)
		{
			FlansMod.log("Failed to read old vehicle file");
			e.printStackTrace();
		}
		return null;
    }


	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) 
	{
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
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);        
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, type.placeableOnWater);
        
        //Result check
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            Block block = world.getBlock(i, j, k);
            if(type.placeableOnLand || block instanceof BlockLiquid)
            {
	            if(!world.isRemote)
	            {
	            	DriveableData data = getPlaneData(itemstack, world);
	            	if(data != null)
	            		world.spawnEntityInWorld(new EntityPlane(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, data));
	            }
				if(!entityplayer.capabilities.isCreativeMode)
				{	
					itemstack.stackSize--;
				}
            }
        }
        return itemstack;
    }
    
    public Entity spawnPlane(World world, double x, double y, double z, ItemStack stack)
    {
    	DriveableData data = getPlaneData(stack, world);
    	if(data != null)
    	{
	    	Entity entity = new EntityPlane(world, x, y, z, type, data);
	    	if(!world.isRemote)
	        {
				world.spawnEntityInWorld(entity);
	        }
	    	return entity;
    	}
    	return null;
    }
	
	public DriveableData getPlaneData(ItemStack itemstack, World world)
    {
		return new DriveableData(getTagCompound(itemstack, world));
    }
		
    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
    /** Make sure that creatively spawned planes have nbt data */
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack planeStack = new ItemStack(item, 1, 0);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Type", type.shortName);
    	if(PartType.defaultEngines.containsKey(EnumType.plane))
    		tags.setString("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	planeStack.stackTagCompound = tags;
        list.add(planeStack);
    }
	
	@Override
	public InfoType getInfoType() 
	{
		return type;
	}
}
