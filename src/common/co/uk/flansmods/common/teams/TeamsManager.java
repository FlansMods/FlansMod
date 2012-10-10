package co.uk.flansmods.common.teams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.Chunk;
import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.IEventListener;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;

public class TeamsManager implements IPlayerTracker
{
	public Gametype currentGametype;
	public Team[] teams;
	public static TeamsManager instance;
	public List<ITeamBase> bases;
	public List<ITeamObject> objects;
	public List<String> maps;
	private int nextBaseID = 1;
	
	public TeamsManager()
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerPlayerTracker(this);

		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		maps = new ArrayList<String>();
		
		
		//Testing stuff. TODO : Replace with automatic Gametype loader
		new GametypeTDM();
		//-----
	}
	
	public void reset()
	{
		currentGametype = null;
		teams = null;
		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		maps = new ArrayList<String>();
	}
	
	public static TeamsManager getInstance()
	{
		return instance;
	}
	
	public void tick()
	{
		currentGametype.tick();
		for(ITeamBase base : bases)
		{
			base.tick();
		}
		for(ITeamObject object : objects)
		{
			object.tick();
		}
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
		if(event instanceof WorldEvent.Load)
		{
			loadPerWorldData(event, event.world);
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
		File file = new File((FMLCommonHandler.instance().getSide().isClient() ? "saves/" : "" ) + FMLCommonHandler.instance().getMinecraftServerInstance().getWorldName(), "teams.dat");
		checkFileExists(file);
		try
		{
			NBTTagCompound tags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(file)));
			nextBaseID = tags.getInteger("NextBaseID");
			currentGametype = Gametype.getGametype(tags.getString("Gametype"));
			currentGametype.initGametype();
			teams = new Team[currentGametype.numTeamsRequired];
			for(int i = 0; i < teams.length; i++)
			{
				teams[i] = Team.getTeam(tags.getString("Team " + i));
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load from teams.dat");
		}
	}
	
	private void savePerWorldData(Event event, World world)
	{
		File file = new File((FMLCommonHandler.instance().getSide().isClient() ? "saves/" : "" ) + MinecraftServer.getServer().getWorldName(), "teams.dat");
		checkFileExists(file);
		try
		{
			NBTTagCompound tags = new NBTTagCompound();
			tags.setInteger("NextBaseID", nextBaseID);
			tags.setString("Gametype", currentGametype == null ? "None" : currentGametype.shortName);
			if(teams != null)
			{
				for(int i = 0; i < teams.length; i++)
				{
					if(teams[i] != null)
						tags.setString("Team " + i, teams[i].shortName);
				}
			}
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
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) 
	{	
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) 
	{
		Team team = FlansModPlayerHandler.getPlayerData(player).team;
		if(team.hat != null)
			player.inventory.armorInventory[3] = team.hat.copy();
		if(team.chest != null)
			player.inventory.armorInventory[2] = team.chest.copy();
		if(team.legs != null)
			player.inventory.armorInventory[1] = team.legs.copy();
		if(team.shoes != null)
			player.inventory.armorInventory[0] = team.shoes.copy();
		PlayerClass playerClass = FlansModPlayerHandler.getPlayerData(player).playerClass;
		if(playerClass != null)
		{
			for(ItemStack stack : playerClass.startingItems)
			{
				player.inventory.addItemStackToInventory(stack.copy());
			}
		}
		Vec3 spawnPoint = currentGametype.getSpawnPoint((EntityPlayerMP)player);
		if(spawnPoint != null)
		{
			player.setLocationAndAngles(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord, 0, 0);
		}
		currentGametype.playerRespawned((EntityPlayerMP)player);
	}
	
	public void forceRespawn(EntityPlayerMP player)
	{
		player.inventory.armorInventory = new ItemStack[4];
		player.inventory.mainInventory = new ItemStack[36];
		player.heal(9001);
		onPlayerRespawn(player);
	}
}
