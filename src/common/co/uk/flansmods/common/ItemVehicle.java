package co.uk.flansmods.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.ItemMapBase;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class ItemVehicle extends ItemMapBase
{
    public ItemVehicle(int i, VehicleType type1)
    {
        super(i);
        maxStackSize = 1;
		setIconIndex(type1.iconIndex);
		type = type1;
		type.item = this;
		setCreativeTab(CreativeTabs.tabTransport);
    }
	
	public String getTextureFile()
    {
        return "/spriteSheets/vehicles.png";
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	System.out.println("Vehicle");
        float f = 1.0F;
        float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
        double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
        double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
        Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do(vec3d, vec3d1, true);
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
				world.spawnEntityInWorld(new EntityVehicle(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getVehicleData(itemstack, world)));
            }
			if(world.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
			{	
				itemstack.stackSize--;
			}
        }
        return itemstack;
    }
	
	public VehicleData getVehicleData(ItemStack itemstack, World world)
    {
        String s = (new StringBuilder()).append("vehicle_").append(itemstack.getItemDamage()).toString();
        VehicleData vehicleData = (VehicleData)world.loadItemData(co.uk.flansmods.common.VehicleData.class, "vehicle_" + itemstack.getItemDamage());
        if(itemstack.getItemDamage() == 0 || vehicleData == null)
		{
			int dataID = world.getUniqueDataId("vehicle");
			//Avoid dataID 0 : default for TMI / Creative
			if(dataID == 0)
				dataID = world.getUniqueDataId("vehicle");
			vehicleData = new VehicleData("vehicle_" + dataID, type);
			world.setItemData("vehicle_" + dataID, vehicleData);
			vehicleData.markDirty();
			itemstack.setItemDamage(dataID);
			try
			{
				vehicleData.engine = PartType.defaultEngine;
			}
			catch(Exception e)
			{
				FlansMod.log("Tried spawning vehicle without engine. Default engine not found.");
				return null;
			}
		}
		return vehicleData;
    }
	
	public int getColorFromDamage(int i, int j)
	{
		return type.colour;
	}
	
	public VehicleType type;
}
