package com.flansmod.client;

import java.util.HashMap;

import net.minecraft.util.ResourceLocation;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.InfoType;

public class FlansModResourceHandler 
{
	private static HashMap<InfoType, ResourceLocation> iconMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<InfoType, ResourceLocation> textureMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<Paintjob, ResourceLocation> paintjobMap = new HashMap<Paintjob, ResourceLocation>();
	private static HashMap<String, ResourceLocation> scopeMap = new HashMap<String, ResourceLocation>();
	private static HashMap<String, ResourceLocation> soundMap = new HashMap<String, ResourceLocation>();
	
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
	
	public static ResourceLocation getSound(String sound)
	{
		if(soundMap.containsKey(sound))
		{
			//return soundMap.get(sound);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", sound);
		soundMap.put(sound, resLoc);
		return resLoc;
		//FMLClientHandler.instance().getClient().getSoundHandler().playSound("flansmod:" + sound + ".ogg");   
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
}
