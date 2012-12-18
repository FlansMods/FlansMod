package co.uk.flansmods.common.teams;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemFlagpole extends Item {

	public ItemFlagpole(int i) 
	{
		super(i);
		setCreativeTab(CreativeTabs.tabMisc);
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
				if(world.getBlockId(i, j, k) == Block.snow.blockID)
				{
					j--;
				}
				if(isSolid(world, i, j, k))
				{
					world.spawnEntityInWorld(new EntityFlagpole(world, i, j + 1, k));
				}		            
			}
        }
		return itemstack;
	}
	
	private boolean isSolid(World world, int i, int j, int k)
	{
		int blockID = world.getBlockId(i, j, k);
		if (blockID == 0)
			return false;
		return Block.blocksList[blockID].blockMaterial.isSolid() && Block.blocksList[blockID].isOpaqueCube();
	}
	
	public String getTextureFile()
	{
		return "/spriteSheets/armour.png";
	}
}
