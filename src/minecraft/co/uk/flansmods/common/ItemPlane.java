package co.uk.flansmods.common;

import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.PlaneData;
import co.uk.flansmods.common.driveables.PlaneType;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMapBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPlane extends ItemMapBase
{
    public ItemPlane(int i, PlaneType type1)
    {
        super(i);
        maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanVehicles);
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
				world.spawnEntityInWorld(new EntityPlane(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getPlaneData(itemstack, world)));
            }
			if(!entityplayer.capabilities.isCreativeMode)
			{	
				itemstack.stackSize--;
			}
        }
        return itemstack;
    }
    
    public Entity spawnPlane(World world, double x, double y, double z, ItemStack stack)
    {
    	Entity entity = new EntityPlane(world, x, y, z, type, getPlaneData(stack, world));
    	if(!world.isRemote)
        {
			world.spawnEntityInWorld(entity);
        }
    	return entity;
    }
	
	public PlaneData getPlaneData(ItemStack itemstack, World world)
    {
        String s = (new StringBuilder()).append("plane_").append(itemstack.getItemDamage()).toString();
        PlaneData planeData = (PlaneData)world.loadItemData(co.uk.flansmods.common.driveables.PlaneData.class, "plane_" + itemstack.getItemDamage());
        if(itemstack.getItemDamage() == 0 || planeData == null)
		{
			int dataID = world.getUniqueDataId("plane");
			planeData = new PlaneData("plane_" + dataID, type);
			//Avoid dataID 0 : default for TMI / Creative
			if(dataID == 0)
			{
				dataID = world.getUniqueDataId("plane");
				planeData = new PlaneData("plane_" + dataID, type);
			}
			world.setItemData("plane_" + dataID, planeData);
			planeData.markDirty();
			itemstack.setItemDamage(dataID);
			try
			{
				planeData.engine = PartType.defaultEngine;
			}
			catch(Exception e)
			{
				System.out.println("Tried spawning plane without engine. Default engine not found.");
				return null;
			}
		}
		return planeData;
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
    
	public PlaneType type;
}
