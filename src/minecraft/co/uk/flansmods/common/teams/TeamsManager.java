package co.uk.flansmods.common.teams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet10Flying;
import net.minecraft.network.packet.Packet11PlayerPosition;
import net.minecraft.network.packet.Packet34EntityTeleport;
import net.minecraft.network.packet.Packet39AttachEntity;
import net.minecraft.network.packet.Packet6SpawnPosition;
import net.minecraft.network.packet.Packet9Respawn;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;
import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.EntityDamageSourceGun;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemGun;
import co.uk.flansmods.common.ItemAAGun;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemPlane;
import co.uk.flansmods.common.ItemVehicle;
import co.uk.flansmods.common.network.PacketPlayerSpawn;
import co.uk.flansmods.common.network.PacketTeamInfo;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.GameRegistry;

public class TeamsManager implements IPlayerTracker
{
	public Gametype currentGametype;
	public TeamsMap currentMap;
	public Team[] teams;
	public static TeamsManager instance;
	public List<ITeamBase> bases;
	public List<ITeamObject> objects;
	public List<TeamsMap> maps;
	private int nextBaseID = 1;
	private long time;
	
	public TeamsManager()
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerPlayerTracker(this);

		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		maps = new ArrayList<TeamsMap>();
		maps.add(TeamsMap.def);
		currentMap = TeamsMap.def;
		
		
		//Testing stuff. TODO : Replace with automatic Gametype loader
		new GametypeTDM();
		new GametypeConquest();
		new GametypeDM();
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
			PacketDispatcher.sendPacketToAllPlayers(PacketTeamInfo.buildInfoPacket());
		}
		for(ITeamBase base : bases)
		{
			base.tick();
		}
		for(ITeamObject object : objects)
		{
			object.tick();
		}
		for(Object obj : MinecraftServer.getServerConfigurationManager(FMLCommonHandler.instance().getMinecraftServerInstance()).playerEntityList)
		{
			EntityPlayerMP player = (EntityPlayerMP)obj;
			FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player);
			if(data.spawnDelay == 0)
			{
		        WorldServer world = (WorldServer)player.worldObj;
		        world.getEntityTracker().sendPacketToAllPlayersTrackingEntity(player, new Packet34EntityTeleport(player));	
			}
		}
	}
	
	public EntityPlayerMP getPlayer(String username)
	{
		return MinecraftServer.getServerConfigurationManager(FMLCommonHandler.instance().getMinecraftServerInstance()).getPlayerForUsername(username);
	}
	
	public static void log(String s)
	{
		FlansMod.log("Teams Info : " + s);
	}	
	
	public static void messagePlayer(EntityPlayerMP player, String s)
	{
		player.addChatMessage(s);
	}
	
	public static void messageAll(String s)
	{
		FlansMod.log("Teams Announcement : " + s);
		for(EntityPlayerMP player : (List<EntityPlayerMP>)MinecraftServer.getServer().getConfigurationManager().playerEntityList)
		{
			player.sendChatToPlayer(s);
		}
	}
	
	@ForgeSubscribe
	public void onPlayerUpdate(EntityInteractEvent event)
	{
		if(event.entityPlayer.inventory.getCurrentItem() != null && event.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemOpStick)
			((ItemOpStick)event.entityPlayer.inventory.getCurrentItem().getItem()).clickedEntity(event.entityPlayer.worldObj, event.entityPlayer, event.target);
	}	
	
	@ForgeSubscribe
	public void onEntityHurt(LivingHurtEvent event) 
	{
		if(event.entity instanceof EntityPlayerMP && currentGametype != null)
			if(!currentGametype.playerAttacked((EntityPlayerMP)event.entity, event.source))
				event.ammount = 0;
	}
	
	@ForgeSubscribe
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
						messageAll("flanDeath." + ((ItemGun)stack.getItem()).type.shortName + "." + FlansModPlayerHandler.getPlayerData(killed).team.textColour + event.entity.getEntityName() + "." + FlansModPlayerHandler.getPlayerData((EntityPlayer)entity).team.textColour + entity.getEntityName());
				}
			}
		}
	}
	
	@ForgeSubscribe
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
	
	@ForgeSubscribe
	public void playerInteracted(PlayerInteractEvent event)
	{
		if(event.entityPlayer.worldObj.isRemote)
			return;
		TileEntity te = event.entityPlayer.worldObj.getBlockTileEntity(event.x, event.y, event.z);
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
	
	@ForgeSubscribe
	public void playerDrops(PlayerDropsEvent event)
	{
		ArrayList<EntityItem> dropsToThrow = new ArrayList<EntityItem>();
		//First collect together guns and ammo if smart drops are enabled
		if(FlansMod.weaponDrops == 2)
		{
			
			for(Iterator<EntityItem> iterator = event.drops.listIterator(); iterator.hasNext(); )
			{
				EntityItem entity = iterator.next();
				ItemStack stack = entity.getEntityItem();
				if(stack != null && stack.getItem() != null)
				{
					if(stack.getItem() instanceof ItemGun)
					{	
						EntityGunItem gunEntity = new EntityGunItem(entity);
						stack.stackSize = 0;
						boolean alreadyAdded = false;
						for(Iterator<EntityItem> checker = dropsToThrow.listIterator(); checker.hasNext(); )
						{
							EntityItem check = checker.next();
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
		for(Iterator<EntityItem> gunIterator = dropsToThrow.listIterator(); gunIterator.hasNext(); )
		{
			EntityGunItem gunEntity = (EntityGunItem)gunIterator.next();
			GunType gunType = ((ItemGun)gunEntity.getEntityItem().getItem()).type;
			for(Iterator<EntityItem> ammoIterator = event.drops.listIterator(); ammoIterator.hasNext(); )
			{
				EntityItem ammoEntity = ammoIterator.next();
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
					if(FlansMod.weaponDrops > 0)
						dropsToThrow.add(entity);
				}
				else if(stack.getItem() instanceof ItemTeamArmour)
				{
					if(!FlansMod.armourDrops)
						dropsToThrow.add(entity);
				}
			}
		}
		event.drops.removeAll(dropsToThrow);

	}
	
	@ForgeSubscribe
	public void playerLoot(EntityItemPickupEvent event)
	{
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(event.entityPlayer);
		if(data != null && data.team == Team.spectators)
			event.setCanceled(true);
		
	}
	
	@ForgeSubscribe
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
	
	@ForgeSubscribe
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
		checkFileExists(file);
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
			FlansMod.bombsEnabled = tags.getBoolean("Bombs");
			FlansMod.bulletsEnabled = tags.getBoolean("Bullets");
			FlansMod.explosions = tags.getBoolean("Explosions");
			FlansMod.forceAdventureMode = tags.getBoolean("ForceAdventure");
			FlansMod.canBreakGuns = tags.getBoolean("CanBreakGuns");
			FlansMod.armourDrops = tags.getBoolean("ArmourDrops");
			FlansMod.weaponDrops = tags.getInteger("WeaponDrops");
			FlansMod.vehiclesNeedFuel = tags.getBoolean("NeedFuel");
			FlansMod.mgLife = tags.getInteger("MGLife");
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
			if(currentGametype != null)
			{
				currentGametype.saveToNBT(tags);
			}
			if(teams != null)
			{
				for(int i = 0; i < teams.length; i++)
				{
					if(teams[i] != null)
						tags.setString("Team " + i, teams[i].shortName);
				}
			}
			tags.setBoolean("Bombs", FlansMod.bombsEnabled);
			tags.setBoolean("Bullets", FlansMod.bulletsEnabled);
			tags.setBoolean("Explosions", FlansMod.explosions);
			tags.setBoolean("ForceAdventure", FlansMod.forceAdventureMode);
			tags.setBoolean("CanBreakGuns", FlansMod.canBreakGuns);
			tags.setBoolean("ArmourDrops", FlansMod.armourDrops);
			tags.setInteger("WeaponDrops", FlansMod.weaponDrops);
			tags.setBoolean("NeedFuel", FlansMod.vehiclesNeedFuel);
			tags.setInteger("MGLife", FlansMod.mgLife);
			CompressedStreamTools.write(tags, new DataOutputStream(new FileOutputStream(file)));
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to save to teams.dat");
		}
	}
	
	private void checkFileExists(File file)
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
		}	
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

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			if(currentGametype != null)
				currentGametype.playerJoined(playerMP);
			
		}
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		for(Team team : Team.teams)
		{
			team.removePlayer(player);
		}
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) 
	{	
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) 
	{
		if(currentGametype != null)
		{		
			resetInventory(player);
			if(FlansMod.forceAdventureMode && player.capabilities.allowEdit)
				player.setGameType(EnumGameType.ADVENTURE);
			Vec3 spawnPoint = currentGametype.getSpawnPoint((EntityPlayerMP)player);
			if(spawnPoint != null)
			{
				EntityPlayerMP playerMP = ((EntityPlayerMP)player);
				
				FlansModPlayerHandler.getPlayerData(playerMP).setSpawn(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 5);
				playerMP.setLocationAndAngles(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 0, 0);
				//playerMP.playerNetServerHandler.setPlayerLocation(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 0F, 0F);
			}
			
			
			currentGametype.playerRespawned((EntityPlayerMP)player);
		}
	}
	
	public void forceRespawn(EntityPlayerMP player)
	{
		player.inventory.armorInventory = new ItemStack[4];
		player.inventory.mainInventory = new ItemStack[36];
		player.heal(9001);
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
				FlansModPlayerHandler.getPlayerData(player).team = team;
				boolean canJoinTeam = currentGametype.playerChoseTeam(player, team, previousTeam);
				if(canJoinTeam)
				{
					team.addPlayer(player);
					messageAll(player.username + " joined \u00a7" + team.textColour + team.name);
				}
				else 
				{
					player.addChatMessage("You may not pick that team");
					Gametype.sendTeamsMenuToPlayer(player);
				}
			}
		}
		if(team == Team.spectators)
		{
			FlansModPlayerHandler.getPlayerData(player).playerClass = FlansModPlayerHandler.getPlayerData(player).newPlayerClass = null;
			resetInventory(player);
			player.capabilities.allowFlying = true;
		}
		else player.capabilities.allowFlying = false;
	}	
	
	public void playerSelectedClass(EntityPlayerMP player, String className)
	{
		Team team = FlansModPlayerHandler.getPlayerData(player).team;
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
			FlansModPlayerHandler.getPlayerData(player).playerClass = playerClass;
		}
	}
	
	public void resetInventory(EntityPlayer player)
	{
		Team team = FlansModPlayerHandler.getPlayerData(player).team;
		PlayerClass playerClass = FlansModPlayerHandler.getPlayerData(player).getPlayerClass();

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
}
