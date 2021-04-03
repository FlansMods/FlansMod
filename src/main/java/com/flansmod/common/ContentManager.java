package com.flansmod.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.enchantments.GloveType;
import com.flansmod.common.enchantments.ItemGlove;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.ItemRewardBox;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.RewardBox;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;

public class ContentManager 
{
	public class ContentPackMod implements IFlansModContentProvider
	{
		public ContentPackMod(ModContainer c, IFlansModContentProvider p)
		{
			container = c;
			provider = p;
		}
		public IFlansModContentProvider provider;
		public ModContainer container;
		
		@Override
		public String GetContentFolder() 
		{
			return provider.GetContentFolder();
		}
		
		@Override
		public void RegisterModelRedirects() 
		{
			provider.RegisterModelRedirects();
		}
	}
	
	public class ContentPackFlanFolder implements IFlansModContentProvider
	{
		public ContentPackFlanFolder(String n, File f) { folder = f; name = n; }
		public String name;
		public File folder;
		
		@Override
		public String GetContentFolder() 
		{
			return name;
		}
		
		@Override
		public void RegisterModelRedirects() 
		{
			try
			{
				if(folder.isDirectory())
				{
					File redirectInfo = new File(folder, "/redirect.info");
					if(redirectInfo.exists())
					{
						BufferedReader reader = new BufferedReader(new FileReader(redirectInfo));
						String src = reader.readLine();
						String dst = reader.readLine();
						
						if(src != null && dst != null)
						{
							FlansMod.log.info("Registered Flan folder model redirect from " + src + " to " + dst);
							FlansMod.RegisterModelRedirect(src, dst);
						}
						
						reader.close();
					}
				}
				else if(zipJar.matcher(folder.getName()).matches())
				{
					ZipFile zip = new ZipFile(folder);
					ZipEntry entry = zip.getEntry("redirect.info");
					
					if(entry != null && !entry.isDirectory())
					{
						BufferedReader reader = new BufferedReader(new InputStreamReader(zip.getInputStream(entry)));
						String src = reader.readLine();
						String dst = reader.readLine();
						
						if(src != null && dst != null)
						{
							FlansMod.log.info("Registered Flan folder model redirect from " + src + " to " + dst);
							FlansMod.RegisterModelRedirect(src, dst);
						}
						
						reader.close();
					}
					
					zip.close();
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	private HashMap<String, IFlansModContentProvider> packs = new HashMap<String, IFlansModContentProvider>();
	protected Pattern zipJar = Pattern.compile("(.+)\\.(zip|jar)$");
	private boolean wasAnythingInFlanFolder = false;
	
	public boolean LoadedAnyContentFromFlanFolder()
	{
		return wasAnythingInFlanFolder;
	}
	
	public void FindContentInFlanFolder()
	{
		for(File file : FlansMod.flanDir.listFiles())
		{
			//Load folders and valid zip files
			if(file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				//Add the directory to the content pack list
				if(packs.containsKey(file.getName()))
				{
					FlansMod.log.info("Skipping loading content pack from Flan folder as it is duplicated: " + file.getName());
				}
				else
				{
					FlansMod.log.info("Loaded content pack from Flan folder : " + file.getName());
					packs.put(file.getName(), new ContentPackFlanFolder(file.getName(), file));
					wasAnythingInFlanFolder = true;
				}
			}
		}
		FlansMod.log.info("Loaded content pack list from Flan folder");
	}
	
	
	public void LoadAssetsFromFlanFolder()
	{
		FlansMod.proxy.LoadAssetsFromFlanFolder();
	}
	
	public void RegisterModelRedirects()
	{
		for(IFlansModContentProvider provider : packs.values())
			provider.RegisterModelRedirects();
	}
	
	public void FindContentInModsFolder()
	{
		// Search for content packs in the mods folder
		for(ModContainer container : Loader.instance().getActiveModList())
		{
			for(ArtifactVersion requirement : container.getRequirements())
			{
				if(requirement.getLabel().equals(FlansMod.MODID))
				{
					if(container.getMod() instanceof IFlansModContentProvider)
					{
						IFlansModContentProvider mod = ((IFlansModContentProvider)container.getMod());
						String folder = mod.GetContentFolder();
					
						// This is a Flan's Mod dependency. Register it as a content pack
						File source = container.getSource();
						if(source.getName().endsWith("bin"))
						{
							FlansMod.log.info("Found .java content pack" + source.getName() + " We must be in MCP. Loading from folder using IFlansModContentProvider");
							packs.put(folder, new ContentPackMod(container, mod));
						}
						else if(zipJar.matcher(source.getName()).matches())
						{
							FlansMod.log.info("Found .jar content pack " + source.getName() + " in mods folder. Loading from jar");
							packs.put(folder, new ContentPackMod(container, mod));
						}
					}
					else
					{
						FlansMod.log.error("Found Flan's Mod content pack on the classpath which did not implement IFlansModContentProvider");
					}
				}
			}
		}
	}
	
	private void LoadTypesFromDirectory(String contentPackName, File contentPack)
	{
		for(EnumType typeToCheckFor : EnumType.values())
		{
			File typesDir = new File(contentPack, "/" + typeToCheckFor.folderName + "/");
			if(!typesDir.exists())
				continue;
			for(File file : FileUtils.listFiles(typesDir, new String[] {"txt" }, true))
			{
				if(!file.isDirectory())
				{
					try
					{
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String[] splitName = file.getName().split("/");
						TypeFile typeFile = new TypeFile(contentPackName, typeToCheckFor, splitName[splitName.length - 1].split("\\.")[0]);
						for(; ; )
						{
							String line = null;
							try
							{
								line = reader.readLine();
							}
							catch(Exception e)
							{
								break;
							}
							if(line == null)
								break;
							typeFile.parseLine(line);
						}
						reader.close();
					}
					catch(IOException e)
					{
						FlansMod.log.throwing(e);
					}
				}
			}
		}
	}
	
	private void LoadTypesFromArchive(String contentPackName, File contentPack)
	{
		try
		{
			ZipFile zip = new ZipFile(contentPack);
			ZipInputStream zipStream = new ZipInputStream(new FileInputStream(contentPack));
			BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
			ZipEntry zipEntry = zipStream.getNextEntry();
			do
			{
				zipEntry = zipStream.getNextEntry();
				if(zipEntry == null)
					continue;
				if(zipEntry.isDirectory())
					continue;
				TypeFile typeFile = null;
				for(EnumType type : EnumType.values())
				{
					if(zipEntry.getName().startsWith(type.folderName + "/") && zipEntry.getName().split(type.folderName + "/").length > 1 && zipEntry.getName().split(type.folderName + "/")[1].length() > 0)
					{
						String[] splitName = zipEntry.getName().split("/");
						typeFile = new TypeFile(zip.getName(), type, splitName[splitName.length - 1].split("\\.")[0]);
					}
				}
				if(typeFile == null)
				{
					continue;
				}
				for(; ; )
				{
					String line = null;
					try
					{
						line = reader.readLine();
					}
					catch(Exception e)
					{
						break;
					}
					if(line == null)
						break;
					typeFile.parseLine(line);
				}
			}
			while(zipEntry != null);
			reader.close();
			zip.close();
			zipStream.close();
		}
		catch(IOException e)
		{
			FlansMod.log.throwing(e);
		}
	}
	
	public void LoadTypes()
	{
		for(HashMap.Entry<String, IFlansModContentProvider> entry : packs.entrySet())
		{
			String contentPackName = entry.getKey();
			IFlansModContentProvider provider = entry.getValue();
			
			if(provider instanceof ContentPackFlanFolder)
			{
				ContentPackFlanFolder contentPack = (ContentPackFlanFolder)provider;
				if(contentPack.folder.isDirectory())
				{
					LoadTypesFromDirectory(contentPackName, contentPack.folder);
				}
				else // Let's hope its a zip / jar
				{
					LoadTypesFromArchive(contentPackName, contentPack.folder);
				}
			}
			else if(provider instanceof ContentPackMod)// Must be a mod in the classpath
			{
				ContentPackMod mod = (ContentPackMod)provider;
				
				if(mod.container.getSource().getName().endsWith("bin"))
				{	
					// If loading from inside MCP, use the content name to find content in run directory
					LoadTypesFromDirectory(contentPackName, new File(FlansMod.flanDir + "/" + contentPackName));
				}
				else if(zipJar.matcher(mod.container.getSource().getName()).matches())
				{
					// Else must be a mod loading from a jar in the mods folder
					LoadTypesFromArchive(contentPackName, mod.container.getSource());
				}
			}	
		}
	}
	
	public void CreateItems()
	{
		for(EnumType type : EnumType.values())
		{
			Class<? extends InfoType> typeClass = type.getTypeClass();
			for(TypeFile typeFile : TypeFile.files.get(type))
			{
				try
				{
					InfoType infoType = (typeClass.getConstructor(TypeFile.class).newInstance(typeFile));
					infoType.read(typeFile);
					switch(type)
					{
						case bullet: new ItemBullet((BulletType)infoType).setTranslationKey(infoType.shortName);
							break;
						case attachment: new ItemAttachment((AttachmentType)infoType).setTranslationKey(infoType.shortName);
							break;
						case gun: new ItemGun((GunType)infoType).setTranslationKey(infoType.shortName);
							break;
						case grenade: new ItemGrenade((GrenadeType)infoType).setTranslationKey(infoType.shortName);
							break;
						case part: FlansMod.partItems.add((ItemPart)new ItemPart((PartType)infoType).setTranslationKey(infoType.shortName));
							break;
						case plane: new ItemPlane((PlaneType)infoType).setTranslationKey(infoType.shortName);
							break;
						case vehicle: new ItemVehicle((VehicleType)infoType).setTranslationKey(infoType.shortName);
							break;
						case aa: new ItemAAGun((AAGunType)infoType).setTranslationKey(infoType.shortName);
							break;
						case mechaItem: new ItemMechaAddon((MechaItemType)infoType).setTranslationKey(infoType.shortName);
							break;
						case mecha: FlansMod.mechaItems.add((ItemMecha)new ItemMecha((MechaType)infoType).setTranslationKey(infoType.shortName));
							break;
						case tool: FlansMod.toolItems.add((ItemTool)new ItemTool((ToolType)infoType).setTranslationKey(infoType.shortName));
							break;
						case box: new BlockGunBox((GunBoxType)infoType).setTranslationKey(infoType.shortName);
							break;
						case armour: FlansMod.armourItems.add((ItemTeamArmour)new ItemTeamArmour((ArmourType)infoType).setTranslationKey(infoType.shortName));
							break;
						case armourBox: new BlockArmourBox((ArmourBoxType)infoType).setTranslationKey(infoType.shortName);
							break;
						case playerClass: break;
						case team: break;
						case itemHolder: new BlockItemHolder((ItemHolderType)infoType);
							break;
						case rewardBox: new ItemRewardBox((RewardBox)infoType).setTranslationKey(infoType.shortName);
							break;
						case loadout: break;
						case glove:
							new ItemGlove((GloveType)infoType);
							break;
						default: FlansMod.log.warn("Unrecognised type for " + infoType.shortName);
							break;
					}
				}
				catch(Exception e)
				{
					FlansMod.log.error("Failed to add " + type.name() + " : " + typeFile.name);
					FlansMod.log.throwing(e);
				}
			}
			FlansMod.log.info("Loaded " + type.name() + ".");
		}
	}

	public List<File> GetFolderContentPacks() 
	{
		List<File> result = new ArrayList<File>();
		for(HashMap.Entry<String, IFlansModContentProvider> entry : packs.entrySet())
		{
			String contentPackName = entry.getKey();
			IFlansModContentProvider provider = entry.getValue();
			
			if(provider instanceof ContentPackFlanFolder)
			{
				ContentPackFlanFolder contentPack = (ContentPackFlanFolder)provider;
				if(contentPack.folder.isDirectory())
				{
					result.add(contentPack.folder);
				}
			}
			else if(provider instanceof ContentPackMod)
			{
				ContentPackMod mod = (ContentPackMod)provider;
				if(mod.container.getSource().getName().endsWith("bin"))
				{	
					// If loading from inside MCP, use the content name to find content in run directory
					result.add(new File(FlansMod.flanDir + "/" + contentPackName));
				}
			}
		}
		return result;
	}
}
