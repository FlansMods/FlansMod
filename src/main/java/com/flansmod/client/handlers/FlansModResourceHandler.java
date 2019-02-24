package com.flansmod.client.handlers;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class FlansModResourceHandler
{
	private static HashMap<InfoType, ResourceLocation> iconMap = new HashMap<>();
	private static HashMap<InfoType, ResourceLocation> textureMap = new HashMap<>();
	private static HashMap<InfoType, ResourceLocation> trailTextureMap = new HashMap<>();
	private static HashMap<Paintjob, ResourceLocation> paintjobMap = new HashMap<>();
	private static HashMap<Paintjob, ResourceLocation> paintjobIconMap = new HashMap<>();
	private static HashMap<String, ResourceLocation> scopeMap = new HashMap<>();
	private static HashMap<String, SoundEvent> soundMap = new HashMap<>();
	private static HashMap<String, ResourceLocation> blockMap = new HashMap<>();
	
	public static ResourceLocation flag = new ResourceLocation("flansmod", "textures/items/flagpole.png");
	public static ResourceLocation[] opStick = new ResourceLocation[]{new ResourceLocation("flansmod", "textures/items/opStick_ownership.png"),
			new ResourceLocation("flansmod", "textures/items/opStick_connecting.png"), new ResourceLocation("flansmod", "textures/items/opStick_mapping.png"),
			new ResourceLocation("flansmod", "textures/items/opStick_destruction.png")};
	
	public static ResourceLocation getIcon(InfoType infoType)
	{
		if(iconMap.containsKey(infoType))
		{
			return iconMap.get(infoType);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "textures/items/" + infoType.iconPath + ".png");
		iconMap.put(infoType, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getTexture(InfoType infoType)
	{
		if(textureMap.containsKey(infoType))
		{
			return textureMap.get(infoType);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + infoType.texture + ".png");
		if(infoType.texture != null)
		{
			textureMap.put(infoType, resLoc);
			return resLoc;
		}
		else return null;
	}
	
	public static ResourceLocation getDeployableTexture(GunType gunType)
	{
		if(textureMap.containsKey(gunType))
		{
			return textureMap.get(gunType);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + gunType.deployableTexture + ".png");
		textureMap.put(gunType, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getScope(String scopeTexture)
	{
		if(scopeMap.containsKey(scopeTexture))
		{
			return scopeMap.get(scopeTexture);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "gui/" + scopeTexture + ".png");
		scopeMap.put(scopeTexture, resLoc);
		return resLoc;
	}
	
	public static SoundEvent getSoundEvent(String sound)
	{
		if(soundMap.containsKey(sound))
		{
			return soundMap.get(sound);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", sound);
		SoundEvent event = new SoundEvent(resLoc);
		event.setRegistryName(sound);
		soundMap.put(sound, event);
		return event;
	}
	
	public static ResourceLocation getPaintjobTexture(Paintjob paintjob)
	{
		if(paintjobMap.containsKey(paintjob))
		{
			return paintjobMap.get(paintjob);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + paintjob.textureName + ".png");
		paintjobMap.put(paintjob, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getBlockTexture(String texturePath)
	{
		if(blockMap.containsKey(texturePath))
		{
			return blockMap.get(texturePath);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "blocks/" + texturePath);
		blockMap.put(texturePath, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getIcon(PaintableType paintableType, Paintjob paintjob)
	{
		if(paintjobIconMap.containsKey(paintjob))
		{
			return paintjobIconMap.get(paintjob);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "textures/items/" + paintjob.iconName + ".png");
		paintjobIconMap.put(paintjob, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getTrailTexture(BulletType bulletType)
	{
		if(trailTextureMap.containsKey(bulletType))
		{
			return trailTextureMap.get(bulletType);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + bulletType.trailTexture + ".png");
		trailTextureMap.put(bulletType, resLoc);
		return resLoc;
	}
	
	private static HashMap<Integer, ResourceLocation> customPaintjobSkins = new HashMap<>();
	private static HashMap<Integer, ResourceLocation> customPaintjobIcons = new HashMap<>();
	private static final int BYTES_PER_PIXEL = 4;
	
	public static boolean HasResourceForHash(int customPaintHash)
	{
		return customPaintjobSkins.containsKey(customPaintHash) && customPaintjobIcons.containsKey(customPaintHash);
	}
	
	public static void CreateSkinResourceFromByteArray(byte[] byteArray, int textureWidth, int textureHeight, int customPaintHash)
	{
		String internalLocation = "skins/skin_" + customPaintHash + ".png";
		String fileLocation = "Flan/Customs/assets/flansmod/" + internalLocation;
		
		try
		{
			DataBuffer buffer = new DataBufferByte(byteArray, byteArray.length);
			
			WritableRaster raster = Raster.createInterleavedRaster(buffer, textureWidth, textureHeight, BYTES_PER_PIXEL * textureWidth, BYTES_PER_PIXEL, new int[]{0, 1, 2}, null);
			ColorModel cm = new ComponentColorModel(ColorModel.getRGBdefault().getColorSpace(), false, true, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
			BufferedImage image = new BufferedImage(cm, raster, true, null);
			File file = new File(fileLocation);
			
			if(!file.exists())
			{
				file.mkdirs();
				file.createNewFile();
			}
			ImageIO.write(image, "png", file);
			
			customPaintjobSkins.put(customPaintHash, new ResourceLocation("flansmod", internalLocation));
		}
		catch(IOException e)
		{
			FlansMod.log.error("Failed to create custom skin!");
			return;
		}
	}
	
	public static void CreateIconResourceFromByteArray(byte[] byteArray, int textureWidth, int textureHeight, int customPaintHash)
	{
		String location = "customs/icon_" + customPaintHash + ".png";
		
		try
		{
			DataBuffer buffer = new DataBufferByte(byteArray, byteArray.length);
			
			WritableRaster raster = Raster.createInterleavedRaster(buffer, textureWidth, textureHeight, BYTES_PER_PIXEL * textureWidth, BYTES_PER_PIXEL, new int[]{0, 1, 2, 3}, null);
			ColorModel cm = new ComponentColorModel(ColorModel.getRGBdefault().getColorSpace(), false, true, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
			BufferedImage image = new BufferedImage(cm, raster, true, null);
			
			ImageIO.write(image, "png", new File(location));
			
			customPaintjobIcons.put(customPaintHash, new ResourceLocation("flansmod", location));
		}
		catch(IOException e)
		{
			FlansMod.log.error("Failed to create custom icon!");
			return;
		}
	}
	
	public static ResourceLocation GetSkinResourceFromHash(int customPaintHash)
	{
		return customPaintjobSkins.get(customPaintHash);
	}
	
	public static ResourceLocation GetIconResourceFromHash(int customPaintHash)
	{
		return customPaintjobIcons.get(customPaintHash);
	}
}
