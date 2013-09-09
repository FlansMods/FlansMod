package co.uk.flansmods.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMapBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVehicle extends ItemMapBase
{
    public ItemVehicle(int i, VehicleType type1)
    {
        super(i);
        maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanDriveables);
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
			if(!world.isRemote)
				stack.stackTagCompound = getOldTagCompound(stack, world);
			if(stack.stackTagCompound == null)
			{
				stack.stackTagCompound = new NBTTagCompound();
				stack.stackTagCompound.setString("Type", type.shortName);
				stack.stackTagCompound.setString("Engine", PartType.defaultEngine.shortName);
			}
		}
		return stack.stackTagCompound;
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
		NBTTagCompound tags = getTagCompound(stack, player.worldObj);
		String engineName = tags.getString("Engine");
		PartType part = PartType.getPart(engineName);
		lines.add(part.name);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - (double)entityplayer.yOffset, entityplayer.posZ);        
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.clip(posVec, lookVec, true);
        
        //Result check
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            if(!world.isRemote)
            {
				world.spawnEntityInWorld(new EntityVehicle(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getData(itemstack, world)));
            }
			if(!entityplayer.capabilities.isCreativeMode)
			{	
				itemstack.stackSize--;
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
		return new DriveableData(getTagCompound(itemstack, world));
    }
	
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
    /** Make sure that creatively spawned planes have nbt data */
    @Override
    public void getSubItems(int i, CreativeTabs tabs, List list)
    {
    	ItemStack planeStack = new ItemStack(i, 1, 0);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Type", type.shortName);
    	if(PartType.defaultEngine != null)
    		tags.setString("Engine", PartType.defaultEngine.shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	planeStack.stackTagCompound = tags;
        list.add(planeStack);
    }
	
	public VehicleType type;
}
