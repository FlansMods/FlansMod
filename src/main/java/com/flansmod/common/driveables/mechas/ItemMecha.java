package com.flansmod.common.driveables.mechas;

import java.util.Collections;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IFlanItem;
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
		setCreativeTab(FlansMod.tabFlanMechas);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
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
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
        {
        	BlockPos pos = movingobjectposition.getBlockPos();
            if(!world.isRemote)
            {
				world.spawnEntityInWorld(new EntityMecha(world, (double)pos.getX() + 0.5F, (double)pos.getY() + 1.5F + type.yOffset, (double)pos.getZ() + 0.5F, entityplayer, type, getData(itemstack, world), getTagCompound(itemstack, world)));
            }
			if(!entityplayer.capabilities.isCreativeMode)
			{	
				itemstack.stackSize--;
			}
		}
		return itemstack;
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
	
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack mechaStack = new ItemStack(item, 1, 0);
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
        list.add(mechaStack);
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
