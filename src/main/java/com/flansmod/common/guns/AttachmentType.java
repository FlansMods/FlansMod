package com.flansmod.common.guns;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class AttachmentType extends InfoType implements IScope
{
	public static ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
	
	/** The type of attachment. Each gun can have one barrel, one scope, one grip, one stock and some number of generics up to a limit set by the gun */
	public EnumAttachmentType type = EnumAttachmentType.generic;
	
	/** This variable controls whether or not bullet sounds should be muffled */
	public boolean silencer = false;
	/** If true, then this attachment will act like a flashlight */
	public boolean flashlight = false;
	/** Flashlight range. How far away it lights things up */
	public float flashlightRange = 10F;
	/** Flashlight strength between 0 and 15 */
	public int flashlightStrength = 12;
	
	//Gun behaviour modifiers
	/** These stack between attachments and apply themselves to the gun's default spread */
	public float spreadMultiplier = 1F;
	/** Likewise these stack and affect recoil */
	public float recoilMultiplier = 1F;
	/** Another stacking variable for damage */
	public float damageMultiplier = 1F;
	/** Melee damage modifier */
	public float meleeDamageMultiplier = 1F;
	/** Bullet speed modifier */
	public float bulletSpeedMultiplier = 1F;
	/** This modifies the reload time, which is then rounded down to the nearest tick */
	public float reloadTimeMultiplier = 1F;
	
	//Scope variables (These variables only come into play for scope attachments)
	/** The zoomLevel of this scope */
	public float zoomLevel = 1F;
	/** The FOV zoom level of this scope */
	public float FOVZoomLevel = 1F;
	/** The overlay to render when using this scope */
	public String zoomOverlay;
	/** Whether to overlay a texture or not */
	public boolean hasScopeOverlay = false;
	
	@SideOnly(Side.CLIENT)
	/** Model. Only applicable when the attachment is added to 3D guns */
	public ModelAttachment model;
	/** For making detailed models and scaling down mainly */
	public float modelScale = 1F;
	
	//Some more mundane variables
	/** The max stack size in the inventory */
	public int maxStackSize = 1;
	
	public AttachmentType(TypeFile file) 
	{
		super(file);
		attachments.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("AttachmentType"))
				type = EnumAttachmentType.get(split[1]);
			if(FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("Model")))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelAttachment.class);
			if(split[0].equals("ModelScale"))
				modelScale = Float.parseFloat(split[1]);
			if(split[0].equals("Texture"))
				texture = split[1];
			
			if(split[0].equals("Silencer"))
				silencer = Boolean.parseBoolean(split[1].toLowerCase());
			
			//Flashlight settings
			if(split[0].equals("Flashlight"))
				flashlight = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("FlashlightRange"))
				flashlightRange = Float.parseFloat(split[1]);
			if(split[0].equals("FlashlightStrength"))
				flashlightStrength = Integer.parseInt(split[1]);
			
			
			//Multipliers
			if(split[0].equals("MeleeDamageMultiplier"))
				meleeDamageMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("DamageMultiplier"))
				damageMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("SpreadMultiplier"))
				spreadMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("RecoilMultiplier"))
				recoilMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("BulletSpeedMultiplier"))
				bulletSpeedMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("ReloadTimeMultiplier"))
				reloadTimeMultiplier = Float.parseFloat(split[1]);
			//Scope Variables
			if(split[0].equals("ZoomLevel"))
				zoomLevel = Float.parseFloat(split[1]);
			if(split[0].equals("FOVZoomLevel"))
				FOVZoomLevel = Float.parseFloat(split[1]);
			if (split[0].equals("ZoomOverlay"))
			{
				hasScopeOverlay = true;
				if (split[1].equals("None"))
					hasScopeOverlay = false;
				else zoomOverlay = split[1];
			}
		}
		catch (Exception e)
		{
			System.out.println("Reading attachment file failed.");
			e.printStackTrace();
		}
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelAttachment.class);
	}
	
	public static AttachmentType getFromNBT(NBTTagCompound tags)
	{
		ItemStack stack = ItemStack.loadItemStackFromNBT(tags);
		if(stack != null && stack.getItem() instanceof ItemAttachment)
			return ((ItemAttachment)stack.getItem()).type;
		return null;
	}

	@Override
	public float getZoomFactor() 
	{
		return zoomLevel;
	}

	@Override
	public boolean hasZoomOverlay() 
	{
		return hasScopeOverlay;
	}

	@Override
	public String getZoomOverlay() 
	{
		return zoomOverlay;
	}

	@Override
	public float getFOVFactor() 
	{ 
		return FOVZoomLevel;
	}

	public static AttachmentType getAttachment(String s)
	{
		for(AttachmentType attachment : attachments)
		{
			if(attachment.shortName.equals(s))
				return attachment;
		}
		return null;
	}
}
