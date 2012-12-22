package co.uk.flansmods.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMapBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPlane extends ItemMapBase
{
    public ItemPlane(int i, PlaneType type1)
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
        return "/spriteSheets/planes.png";
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
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
				world.spawnEntityInWorld(new EntityPlane(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getPlaneData(itemstack, world)));
            }
			if(world.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
			{	
				itemstack.stackSize--;
			}
        }
        return itemstack;
    }
	
	public PlaneData getPlaneData(ItemStack itemstack, World world)
    {
        String s = (new StringBuilder()).append("plane_").append(itemstack.getItemDamage()).toString();
        PlaneData planeData = (PlaneData)world.loadItemData(co.uk.flansmods.common.PlaneData.class, "plane_" + itemstack.getItemDamage());
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
	
	public PlaneType type;
}
