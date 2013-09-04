package co.uk.flansmods.client;

import java.io.File;
import java.util.HashMap;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.guns.GunType;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class FlansModResourceHandler 
{
	private static HashMap<InfoType, ResourceLocation> iconMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<InfoType, ResourceLocation> textureMap = new HashMap<InfoType, ResourceLocation>();
	private static HashMap<GunType, ResourceLocation> scopeMap = new HashMap<GunType, ResourceLocation>();
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
		textureMap.put(infoType, resLoc);
		return resLoc;
	}
	
	public static ResourceLocation getScope(GunType gunType)
	{
		if(scopeMap.containsKey(gunType))
		{
			return scopeMap.get(gunType);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "gui/" + gunType.scope + ".png");
		scopeMap.put(gunType, resLoc);
		return resLoc;
	}
	
	public static void getSound(String contentPack, String type, String sound)
	{
		/*if(soundMap.containsKey(contentPack + "." + sound))
		{
			return soundMap.get(contentPack + "." + sound);
		}
		ResourceLocation resLoc = new ResourceLocation("flansmod", "sounds/" + sound + ".wav");
		soundMap.put(contentPack + "." + sound, resLoc);*/
		FMLClientHandler.instance().getClient().sndManager.addSound("flansmod:" + sound + ".ogg");   
	}
}
