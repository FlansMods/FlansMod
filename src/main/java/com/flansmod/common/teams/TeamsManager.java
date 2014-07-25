package com.flansmod.common.teams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class TeamsManager
{
	//Configuration variables
	// Player changeable stuff
	public static boolean useRotation = false, explosions = true, driveablesBreakBlocks = true,
			bombsEnabled = true, bulletsEnabled = true, forceAdventureMode = true, canBreakGuns = true, canBreakGlass = true,
			armourDrops = true, vehiclesNeedFuel = true;
	
	public static int weaponDrops = 1; //0 = no drops, 1 = drops, 2 = smart drops
	//Life of certain entity types. 0 is eternal.
	public static int mgLife = 0, planeLife = 0, vehicleLife = 0, mechaLove = 0, aaLife = 0; 
	
	public Gametype currentGametype;
	public TeamsMap currentMap;
	public Team[] teams;
	public static TeamsManager instance;
	public List<ITeamBase> bases;
	public List<ITeamObject> objects;
	public List<TeamsMap> maps;
	private int nextBaseID = 1;
	private long time;
	public List<RotationEntry> rotation;
	public int currentRotationEntry;
	
	public TeamsManager()
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);

		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		maps = new ArrayList<TeamsMap>();
		maps.add(TeamsMap.def);
		rotation = new ArrayList<RotationEntry>();
		currentMap = TeamsMap.def;
		
		
		//Testing stuff. TODO : Replace with automatic Gametype loader
		new GametypeTDM();
		new GametypeConquest();
		new GametypeDM();
		new GametypeCTF();
		new GametypeNerf();
		//-----
	}
	
	public void reset()
	{
		currentGametype = null;
		currentMap = TeamsMap.def;
		teams = null;
		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		maps = new ArrayList<TeamsMap>();
		maps.add(TeamsMap.def);
		rotation = new ArrayList<RotationEntry>();
	}
	
	public static TeamsManager getInstance()
	{
		return instance;
	}
	
	public void tick()
	{
		if(currentGametype != null)
			currentGametype.tick();
		time++;
		//Send a full team info update every 2 seconds.
		if(time % 40 == 0)
		{
			FlansMod.INSTANCE.getPacketHandler().sendToAll(new PacketTeamInfo());
		}
		for(ITeamBase base : bases)
		{
			base.tick();
		}
		for(ITeamObject object : objects)
		{
			object.tick();
		}
		for(Object obj : MinecraftServer.getServer().getConfigurationManager().playerEntityList)
		{
            try {
                if(obj instanceof EntityPlayerMP){
                    EntityPlayerMP player = (EntityPlayerMP) obj;
                    PlayerData data = PlayerHandler.getPlayerData(player);
                    if (data.spawnDelay == 0) {
                        WorldServer world = (WorldServer) player.worldObj;
                        world.getEntityTracker().func_151247_a(player, new S18PacketEntityTeleport(player));
                    }
                }
			} catch(Exception e) {
                e.printStackTrace();
            }
		}
	}
	
	public void switchToNextGametype()
	{
		PlayerHandler.roundEnded();
		currentRotationEntry = (currentRotationEntry + 1) % rotation.size();
		RotationEntry entry = rotation.get(currentRotationEntry);
		if(currentGametype != null && currentGametype != entry.gametype)
		{
			currentGametype.stopGametype();
		}
		currentGametype = entry.gametype;
		currentMap = entry.map;
		teams = entry.teams;
		currentGametype.initGametype();
	}
	
	public EntityPlayerMP getPlayer(String username)
	{
		return MinecraftServer.getServer().getConfigurationManager().func_152612_a(username);
	}
	
	public static void log(String s)
	{
		FlansMod.log("Teams Info : " + s);
	}	
	
	public static void messagePlayer(EntityPlayerMP player, String s)
	{
		player.addChatComponentMessage(new ChatComponentText(s));
	}
	
	public static void messageAll(String s)
	{
		FlansMod.log("Teams Announcement : " + s);
		for(EntityPlayerMP player : (List<EntityPlayerMP>)MinecraftServer.getServer().getConfigurationManager().playerEntityList)
		{
			player.addChatComponentMessage(new ChatComponentText(s));
		}
	}
	
	@SubscribeEvent
	public void onPlayerUpdate(EntityInteractEvent event)
	{
		if(event.entityPlayer.inventory.getCurrentItem() != null && event.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemOpStick)
			((ItemOpStick)event.entityPlayer.inventory.getCurrentItem().getItem()).clickedEntity(event.entityPlayer.worldObj, event.entityPlayer, event.target);
	}	
	
	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event) 
	{
		if(event.entity instanceof EntityPlayerMP && currentGametype != null)
			if(!currentGametype.playerAttacked((EntityPlayerMP)event.entity, event.source))
				event.setCanceled(true);
	}
	
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent event) 
	{
		if(event.entity instanceof EntityPlayerMP && currentGametype != null)
		{
			EntityPlayerMP killed = (EntityPlayerMP)event.entity;
			currentGametype.playerKilled(killed, event.source);
			if(event.source instanceof EntityDamageSource)
			{
				Entity entity = event.source.getSourceOfDamage();
				if(entity instanceof EntityPlayer)
				{
					ItemStack stack = ((EntityPlayer)entity).getCurrentEquippedItem();
					if(stack != null && stack.getItem() != null && stack.getItem() instanceof ItemGun)
						messageAll("flanDeath." + ((ItemGun)stack.getItem()).type.shortName + "." + PlayerHandler.getPlayerData(killed).team.textColour + event.entity.getCommandSenderName() + "." + PlayerHandler.getPlayerData((EntityPlayer)entity).team.textColour + entity.getEntityId());
				}
			}
		}
	}
	
	@SubscribeEvent
	public void entityJoinedWorld(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof ITeamBase)
		{
			registerBase((ITeamBase)event.entity);
		}
		if(event.entity instanceof ITeamObject)
		{
			objects.add((ITeamObject)event.entity);
		}	
	}
	
	@SubscribeEvent
	public void playerInteracted(PlayerInteractEvent event)
	{
		if(event.action == Action.LEFT_CLICK_BLOCK && !event.entityPlayer.capabilities.allowEdit)
		{
			event.setCanceled(true);
			return;	
		}
		
		if(event.entityPlayer.worldObj.isRemote)
			return;
		TileEntity te = event.entityPlayer.worldObj.getTileEntity(event.x, event.y, event.z);
		if(te != null)
		{
			ItemStack currentItem = event.entityPlayer.getCurrentEquippedItem();
			if(currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemOpStick)
			{
				if(te instanceof ITeamObject)
					((ItemOpStick)currentItem.getItem()).clickedObject(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamObject)te);
				if(te instanceof ITeamBase)
					((ItemOpStick)currentItem.getItem()).clickedBase(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamBase)te);
			}
			else if(currentGametype != null)
			{
				if(te instanceof ITeamObject)
					currentGametype.objectClickedByPlayer((ITeamObject)te, (EntityPlayerMP)event.entityPlayer);
				if(te instanceof ITeamBase)
					currentGametype.baseClickedByPlayer((ITeamBase)te, (EntityPlayerMP)event.entityPlayer);
			}
		}
	}
	
	@SubscribeEvent
	public void playerDrops(PlayerDropsEvent event)
	{
		ArrayList<EntityItem> dropsToThrow = new ArrayList<EntityItem>();
		//First collect together guns and ammo if smart drops are enabled
		if(weaponDrops == 2)
		{
			for(EntityItem entity : event.drops)
			{
				ItemStack stack = entity.getEntityItem();
				if(stack != null && stack.getItem() != null)
				{
					if(stack.getItem() instanceof ItemGun)
					{	
						EntityGunItem gunEntity = new EntityGunItem(entity);
						stack.stackSize = 0;
						boolean alreadyAdded = false;
						for(EntityItem check : dropsToThrow)
						{
							if(((ItemGun)stack.getItem()).type == ((ItemGun)check.getEntityItem().getItem()).type)
								alreadyAdded = true;
						}
						if(!alreadyAdded)
						{
							event.entityPlayer.worldObj.spawnEntityInWorld(gunEntity);
							dropsToThrow.add(gunEntity);
						}
					}
				}
			}
		}
		//Now iterate again and look for ammo
		for(EntityItem entity : dropsToThrow)
		{
			EntityGunItem gunEntity = (EntityGunItem)entity;
			GunType gunType = ((ItemGun)gunEntity.getEntityItem().getItem()).type;
			for(EntityItem ammoEntity : event.drops)
			{
				ItemStack ammoItemstack = ammoEntity.getEntityItem();
				if(ammoItemstack != null && ammoItemstack.getItem() instanceof ItemBullet)
				{
					BulletType bulletType = ((ItemBullet)ammoItemstack.getItem()).type;
					if(gunType.isAmmo(bulletType))
					{
						gunEntity.ammoStacks.add(ammoItemstack.copy());
						ammoItemstack.stackSize = 0;
					}	
				}
			}
		}
		//Now check the remaining items to see if they should be dropped
		for(EntityItem entity : event.drops)
		{
			ItemStack stack = entity.getEntityItem();
			if(stack != null && stack.getItem() != null && stack.stackSize > 0)
			{
				if(stack.getItem() instanceof ItemGun || stack.getItem() instanceof ItemPlane || stack.getItem() instanceof ItemVehicle || stack.getItem() instanceof ItemAAGun || stack.getItem() instanceof ItemBullet)
				{
					if(weaponDrops != 1)
						dropsToThrow.add(entity);
				}
				else if(stack.getItem() instanceof ItemTeamArmour)
				{
					if(!armourDrops)
						dropsToThrow.add(entity);
				}
			}
		}
		event.drops.removeAll(dropsToThrow);

	}
	
	@SubscribeEvent
	public void playerLoot(EntityItemPickupEvent event)
	{
		PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer);
		if(data != null && data.team == Team.spectators)
			event.setCanceled(true);
		
	}
	
	@SubscribeEvent
	public void chunkLoaded(ChunkDataEvent event)
	{
		Chunk chunk = event.getChunk();
		for(List<Entity> list : chunk.entityLists)
		{
			for(Entity entity : list)
			{
				if(entity instanceof ITeamBase)
				{
					bases.add((ITeamBase)entity);
					if(((ITeamBase)entity).getID() > nextBaseID)
					{
						FlansMod.log("Loaded base with ID higher than the supposed highest ID. Adjusted highest ID");
						nextBaseID = ((ITeamBase)entity).getID();
					}
				}
				if(entity instanceof ITeamObject)
					objects.add((ITeamObject)entity);
			}
		}
	}
	
	@SubscribeEvent
	public void worldData(WorldEvent event)
	{
		if(event.world.isRemote)
			return;
		if(event instanceof WorldEvent.Load)
		{
			loadPerWorldData(event, event.world);
			savePerWorldData(event, event.world);
		}
		if(event instanceof WorldEvent.Save)
		{
			savePerWorldData(event, event.world);
		}
	}
	
	private void loadPerWorldData(Event event, World world)
	{

		//Reset the teams manager before loading a new world
		reset();
		//Read the teams dat file
		File file = new File((FMLCommonHandler.instance().getSide().isClient() ? "saves/" + MinecraftServer.getServer().getWorldName() : MinecraftServer.getServer().getFolderName()), "teams.dat");
		if(!checkFileExists(file))
			return;
		try
		{
			NBTTagCompound tags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(file)));
			nextBaseID = tags.getInteger("NextBaseID");
			for(int i = 0; i < tags.getInteger("NumMaps"); i++)
			{
				String shortName = tags.getString("MapShortName " + i);
				if(shortName.equals("default"))
					continue;
				maps.add(new TeamsMap(shortName, tags.getString("MapName " + i)));
			}
			currentMap = getTeamsMap(tags.getString("Map"));
			currentGametype = Gametype.getGametype(tags.getString("Gametype"));
			if(currentGametype != null)
			{
				currentGametype.initGametype();
				currentGametype.readFromNBT(tags);
				teams = new Team[currentGametype.numTeamsRequired];
				for(int i = 0; i < teams.length; i++)
				{
					teams[i] = Team.getTeam(tags.getString("Team " + i));
				}
			}
			int rotationSize = tags.getInteger("RotationSize");
			for(int i = 0; i < rotationSize; i++)
			{
				TeamsMap map = getTeamsMap(tags.getString("RotationMap " + i));
				Gametype gametype = Gametype.getGametype(tags.getString("RotationGametype " + i));
				int nTeams = tags.getInteger("RotationTeams " + i);
				Team[] demTeams = new Team[nTeams];
				for(int j = 0; j < nTeams; j++)
				{
					demTeams[j] = Team.getTeam(tags.getString("RotationTeam " + i + " " + j));
				}
				if(map != null && gametype != null)
				{
					rotation.add(new RotationEntry(map, gametype, demTeams));
				}
			}
			useRotation = tags.getBoolean("UseRotation");
			bombsEnabled = tags.getBoolean("Bombs");
			bulletsEnabled = tags.getBoolean("Bullets");
			explosions = tags.getBoolean("Explosions");
			forceAdventureMode = tags.getBoolean("ForceAdventure");
			canBreakGuns = tags.getBoolean("CanBreakGuns");
			canBreakGlass = tags.getBoolean("CanBreakGlass");
			armourDrops = tags.getBoolean("ArmourDrops");
			weaponDrops = tags.getInteger("WeaponDrops");
			vehiclesNeedFuel = tags.getBoolean("NeedFuel");
			mgLife = tags.getInteger("MGLife");
			aaLife = tags.getInteger("AALife");
			vehicleLife = tags.getInteger("VehicleLife");
			mechaLove = tags.getInteger("MechaLove");
			planeLife = tags.getInteger("PlaneLife");
			driveablesBreakBlocks = tags.getBoolean("BreakBlocks");
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load from teams.dat");
			e.printStackTrace();
			
		}
	}
	
	private void savePerWorldData(Event event, World world)
	{
		File file = new File((FMLCommonHandler.instance().getSide().isClient() ? "saves/" + MinecraftServer.getServer().getWorldName() : MinecraftServer.getServer().getFolderName()), "teams.dat");
		checkFileExists(file);
		try
		{
			NBTTagCompound tags = new NBTTagCompound();
			tags.setInteger("NextBaseID", nextBaseID);
			tags.setInteger("NumMaps", maps.size());
			if(maps != null)
			{
				for(int i = 0; i < maps.size(); i++)
				{
					if(maps.get(i) != null)
					{
						tags.setString("MapShortName " + i, maps.get(i).shortName);
						tags.setString("MapName " + i, maps.get(i).name);
					}
				}
			}
			if(currentMap != null)
				tags.setString("Map", currentMap.shortName);
			tags.setString("Gametype", currentGametype == null ? "None" : currentGametype.shortName);
			for(Gametype gametype : Gametype.gametypes)
			{
				gametype.saveToNBT(tags);
			}
			if(teams != null)
			{
				for(int i = 0; i < teams.length; i++)
				{
					if(teams[i] != null)
						tags.setString("Team " + i, teams[i].shortName);
				}
			}
			if(rotation != null)
			{
				tags.setInteger("RotationSize", rotation.size());
				for(int i = 0; i < rotation.size(); i++)
				{
					RotationEntry entry = rotation.get(i);
					if(entry != null)
					{
						tags.setString("RotationMap " + i, entry.map.shortName);
						tags.setString("RotationGametype " + i, entry.gametype.shortName);
						tags.setInteger("RotationTeams " + i, entry.teams.length);
						for(int j = 0; j < entry.teams.length; j++)
						{
							tags.setString("RotationTeam " + i + " " + j, entry.teams[j].shortName);
						}
					}
				}
			}
			else tags.setInteger("RotationSize", 0);
			tags.setBoolean("UseRotation", useRotation);
			tags.setBoolean("Bombs", bombsEnabled);
			tags.setBoolean("Bullets", bulletsEnabled);
			tags.setBoolean("Explosions", explosions);
			tags.setBoolean("ForceAdventure", forceAdventureMode);
			tags.setBoolean("CanBreakGuns", canBreakGuns);
			tags.setBoolean("CanBreakGlass", canBreakGlass);
			tags.setBoolean("ArmourDrops", armourDrops);
			tags.setInteger("WeaponDrops", weaponDrops);
			tags.setBoolean("NeedFuel", vehiclesNeedFuel);
			tags.setInteger("MGLife", mgLife);
			tags.setInteger("AALife", aaLife);
			tags.setInteger("VehicleLife", vehicleLife);
			tags.setInteger("MechaLove", mechaLove);
			tags.setInteger("PlaneLife", planeLife);
			tags.setBoolean("BreakBlocks", driveablesBreakBlocks);
			
			CompressedStreamTools.write(tags, new DataOutputStream(new FileOutputStream(file)));
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to save to teams.dat");
		}
	}
	
	private boolean checkFileExists(File file)
	{
		if(!file.exists())
		{
			try
			{ 
				file.createNewFile();
			}
			catch(Exception e)
			{
				FlansMod.log("Failed to create file");
				FlansMod.log(file.getAbsolutePath());
			}
			return false;
		}	
		return true;
	}
	
	public ITeamBase getBase(int ID)
	{
		for(ITeamBase base : bases)
		{
			if(base.getID() == ID)
				return base;
		}
		return null;
	}
	
	public void registerBase(ITeamBase base)
	{
		if(base.getID() == 0)
			base.setID(nextBaseID++);
		bases.add(base);
	}	
	
	public void registerObject(ITeamObject obj)
	{
		objects.add(obj);
	}

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) 
	{
		EntityPlayer player = event.player;
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			if(currentGametype != null)
				currentGametype.playerJoined(playerMP);
		}
	}

	@SubscribeEvent
	public void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) 
	{
		for(Team team : Team.teams)
		{
			team.removePlayer(event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) 
	{
		onPlayerRespawn(event.player);
	}
	
	public void onPlayerRespawn(EntityPlayer player)
	{
		if(currentGametype != null)
		{		
			EntityPlayerMP playerMP = ((EntityPlayerMP)player);
			PlayerData data = PlayerHandler.getPlayerData(playerMP);
			if(playerMP != null && data != null && data.team == Team.spectators && MinecraftServer.getServer().getConfigurationManager().func_152596_g(playerMP.getGameProfile()))
			{
				return;
			}
			Vec3 spawnPoint = currentGametype.getSpawnPoint(playerMP);
			if(spawnPoint != null)
			{
				player.setSpawnChunk(new ChunkCoordinates(MathHelper.floor_double(spawnPoint.xCoord), MathHelper.floor_double(spawnPoint.yCoord) + 1, MathHelper.floor_double(spawnPoint.zCoord)), true);
				data.setSpawn(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 5);
				playerMP.setLocationAndAngles(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 0, 0);

				if(data.playerClass != null && data.playerClass.horse)
				{
					EntityHorse horse = new EntityHorse(playerMP.worldObj);
					
					NBTTagCompound tags = new NBTTagCompound();
					horse.writeToNBT(tags);
					tags.setBoolean("Tame", true);
					tags.setInteger("Temper", 0);
					tags.setString("OwnerName", playerMP.getCommandSenderName());
					tags.setTag("SaddleItem", new ItemStack(Items.saddle).writeToNBT(new NBTTagCompound()));
					tags.setInteger("Type", 0);
					tags.setInteger("Variant", 0);
					horse.readFromNBT(tags);
					horse.setPosition(playerMP.posX, playerMP.posY, playerMP.posZ);
					playerMP.worldObj.spawnEntityInWorld(horse);
					playerMP.mountEntity(horse);
				}
				
				if(forceAdventureMode && player.capabilities.allowEdit)
					player.setGameType(GameType.ADVENTURE);
				resetInventory(player);	
			}
			currentGametype.playerRespawned((EntityPlayerMP)player);
		}
	}
	
	public void forceRespawn(EntityPlayerMP player)
	{
		player.inventory.armorInventory = new ItemStack[4];
		player.inventory.mainInventory = new ItemStack[36];
		player.heal(9001);
		if(forceAdventureMode && player.capabilities.allowEdit)
			player.setGameType(GameType.ADVENTURE);
		onPlayerRespawn(player);
	}
	
	public void playerSelectedTeam(EntityPlayerMP player, String teamName)
	{
		Team previousTeam = Gametype.getPlayerData(player).team;
		if(previousTeam != null && previousTeam.shortName.equals(teamName))
		{
			Gametype.sendClassMenuToPlayer(player);
			return;
		}
		Team team = null;
		for(Team t : teams)
		{
			if(t != null && t.shortName.equals(teamName))
				team = t;
		}
		if(teamName.equals(Team.spectators.shortName))
		{
			team = Team.spectators;
		}
		if(team == null)
			team = Team.spectators;
		if(team != null)
		{
			if(currentGametype != null)
			{
				PlayerHandler.getPlayerData(player).team = team;
				boolean canJoinTeam = currentGametype.playerChoseTeam(player, team, previousTeam);
				if(canJoinTeam)
				{
					team.addPlayer(player);
					messageAll(player.getCommandSenderName() + " joined \u00a7" + team.textColour + team.name);
				}
				else 
				{
					player.addChatMessage(new ChatComponentText("You may not pick that team"));
					Gametype.sendTeamsMenuToPlayer(player);
				}
			}
		}
		if(team == Team.spectators)
		{
			PlayerHandler.getPlayerData(player).playerClass = PlayerHandler.getPlayerData(player).newPlayerClass = null;
			resetInventory(player);
			player.capabilities.allowFlying = true;
		}
		else player.capabilities.allowFlying = false;
	}	
	
	public void playerSelectedClass(EntityPlayerMP player, String className)
	{
		Team team = PlayerHandler.getPlayerData(player).team;
		if(team == null)
			return;
		PlayerClass playerClass = null;
		for(PlayerClass pc : team.classes)
		{
			if(pc.shortName.equals(className))
				playerClass = pc;
		}
		if(playerClass != null)
		{
			if(currentGametype != null)
				currentGametype.playerChoseClass(player, playerClass);
			PlayerHandler.getPlayerData(player).playerClass = playerClass;
		}
	}
	
	public void resetInventory(EntityPlayer player)
	{
		Team team = PlayerHandler.getPlayerData(player).team;
		PlayerClass playerClass = PlayerHandler.getPlayerData(player).getPlayerClass();

		if(team == null)
			return;
		
		player.inventory.armorInventory = new ItemStack[4];
		player.inventory.mainInventory = new ItemStack[36];
		if(team.hat != null)
			player.inventory.armorInventory[3] = team.hat.copy();
		if(team.chest != null)
			player.inventory.armorInventory[2] = team.chest.copy();
		if(team.legs != null)
			player.inventory.armorInventory[1] = team.legs.copy();
		if(team.shoes != null)
			player.inventory.armorInventory[0] = team.shoes.copy();		
		
		if(playerClass == null)
			return;
		
		for(ItemStack stack : playerClass.startingItems)
		{
			player.inventory.addItemStackToInventory(stack.copy());
			//Load up as many guns as possible
		}
		
		//Preload each gun
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if(stack != null && stack.getItem() instanceof ItemGun)
			{
				((ItemGun)stack.getItem()).reload(stack, player.worldObj, player, true);
			}
		}
	}
	
	public boolean areTeamsValid()
	{
		if(teams == null)
			return false;
		for(Team t : teams)
		{
			if(t == null)
				return false;
		}
		return true;
	}
	
	public static class TeamsMap
	{
		public static TeamsMap def = new TeamsMap("default", "Default");
		public String name;
		public String shortName;
		
		public TeamsMap(String s1, String s2)
		{
			shortName = s1;
			name = s2;
		}
	}
	
	public TeamsMap getTeamsMap(String s)
	{
		for(TeamsMap map : maps)
		{
			if(map.shortName.equals(s))
				return map;
		}
		return null;
	}
	
	public static class RotationEntry
	{
		public TeamsMap map;
		public Gametype gametype;
		public Team[] teams;
		
		public RotationEntry(TeamsMap m, Gametype g, Team[] t)
		{
			map = m;
			gametype = g;
			teams = t;
		}
	}
}
