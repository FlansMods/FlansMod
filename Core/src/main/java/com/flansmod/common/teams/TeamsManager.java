package com.flansmod.common.teams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamSelect;
import com.flansmod.common.types.InfoType;

public class TeamsManager
{
	/**
	 * Overall switch for teams mod
	 */
	public static boolean enabled = true;
	/**
	 * The instance
	 */
	public static TeamsManager instance;
	
	//Configuration variables
	// Player changeable stuff
	public static boolean voting = false, explosions = true, driveablesBreakBlocks = true,
			bombsEnabled = true, shellsEnabled = true, missilesEnabled = true, bulletsEnabled = true, forceAdventureMode = true, canBreakGuns = true, canBreakGlass = true,
			armourDrops = true, vehiclesNeedFuel = true, overrideHunger = true;
	
	public static int weaponDrops = 1; //0 = no drops, 1 = drops, 2 = smart drops
	//Life of certain entity types. 0 is eternal.
	public static int mgLife = 0, planeLife = 0, vehicleLife = 0, mechaLove = 0, aaLife = 0;
	
	/**
	 * The number of ticks for which to display the round summary page
	 */
	public static int scoreDisplayTime = 200;
	/**
	 * The number of ticks for which to display the voting box, if enabled
	 */
	public static int votingTime = 200;
	/**
	 * The number of ticks for which to display the rank update page
	 */
	public static int rankUpdateTime = 200;
	
	/**
	 * The current round in play. This class replaces the old set of 3 fields "currentGametype", "currentMap" and "teams"
	 */
	public TeamsRound currentRound;
	/**
	 * This contains a list of all the valid rounds, similar to the old RotationEntry and map rotation
	 */
	public ArrayList<TeamsRound> rounds;
	/**
	 * The list of all available maps
	 */
	public HashMap<String, TeamsMap> maps;
	
	/**
	 * For assigning base IDs to bases. Used primarily in client-server syncing and saving
	 */
	private int nextBaseID = 1;
	public ArrayList<ITeamBase> bases;
	public ArrayList<ITeamObject> objects;
	
	protected long time;
	
	/**
	 * A downwards counter that times the round (in ticks)
	 */
	public int roundTimeLeft;
	/**
	 * A downwards counter that times inter-round phases (in ticks)
	 */
	public int interRoundTimeLeft;
	/**
	 * The list of rounds currently being voted upon
	 */
	public TeamsRound[] voteOptions;
	/**
	 * For forcing the next round. Not normally used
	 */
	public TeamsRound nextRound;
	
	/**
	 * Whether to use autobalance
	 */
	public static boolean autoBalance;
	/**
	 * Time between autobalance attempts
	 */
	public static int autoBalanceInterval;
	/**
	 * The current message of the day. Displays at the top of the landing page
	 */
	public String motd = "Welcome to the Teams server";
	
	//Disused. Delete when done
	//public Gametype currentGametype;
	//public TeamsMap currentMap;
	//public Team[] teams;
	//public List<RotationEntry> rotation;
	//public int currentRotationEntry;
	
	public TeamsManager()
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
		//Init arrays
		bases = new ArrayList<>();
		objects = new ArrayList<>();
		maps = new HashMap<>();
		rounds = new ArrayList<>();
		
		//rotation = new ArrayList<RotationEntry>();
		//currentMap = TeamsMap.def;
		
		
		//Testing stuff. TODO : Replace with automatic Gametype loader
		new GametypeTDM();
		new GametypeZombies();
		//new GametypeConquest();
		new GametypeDM();
		new GametypeCTF();
		//new GametypeNerf();
		//-----
	}
	
	public void reset()
	{
		//currentGametype = null;
		//currentMap = TeamsMap.def;
		//teams = null;
		
		currentRound = null;
		
		bases = new ArrayList<>();
		objects = new ArrayList<>();
		maps = new HashMap<>();
		rounds = new ArrayList<>();
		
		//rotation = new ArrayList<RotationEntry>();
	}
	
	public static TeamsManager getInstance()
	{
		return instance;
	}
	
	public void tick()
	{
		//Send a full team info update to players every 2 seconds.
		if(time % 40 == 0)
		{
			FlansMod.INSTANCE.getPacketHandler().sendToAll(new PacketTeamInfo());
			showTeamsMenuToAll(true);
		}
		
		if(!enabled)
			return;
		
		if(currentRound != null)
			currentRound.gametype.tick();
		time++;
		
		
		//Tick bases and objects
		for(ITeamBase base : bases)
			base.tick();
		for(ITeamObject object : objects)
			object.tick();
		if(overrideHunger && currentRound != null)
			for(World world : FMLCommonHandler.instance().getMinecraftServerInstance().worlds)
				for(Object player : world.playerEntities)
					((EntityPlayer)player).getFoodStats().addStats(20, 10F);
		
		//Check round timer
		//If inbetween rounds
		if(interRoundTimeLeft > 0)
		{
			interRoundTimeLeft--;
			//If we're done showing scores, show the voting box
			if(voting)
			{
				//If the next round is forced, go to it
				if(nextRound != null)
				{
					startNextRound();
					interRoundTimeLeft = 0;
					return;
				}
				else
				{
					//if(interRoundTimeLeft == votingTime)
					//	pickVoteOptions();
					if(interRoundTimeLeft <= votingTime)
					{
						if(voteOptions == null)
							pickVoteOptions();
						displayVotingGUI();
					}
				}
			}
			//If the timer is finished, start the next round
			if(interRoundTimeLeft == 0)
			{
				startNextRound();
			}
		}
		
		//If in a round
		if(currentRound != null && roundTimeLeft > 0)
		{
			//10 seconds before autobalance, display a message
			if(autoBalance() && time % autoBalanceInterval == autoBalanceInterval - 200 && needAutobalance())
			{
				TeamsManager.messageAll("\u00a7fAutobalancing teams...");
			}
			if(autoBalance() && time % autoBalanceInterval == 0 && needAutobalance())
			{
				autobalance();
			}
			
			roundTimeLeft--;
			boolean roundEnded = roundTimeLeft == 0;
			if(roundEnded)
				messageAll(randomTimeOutString());
			for(Team team : currentRound.teams)
			{
				if(currentRound.gametype.teamHasWon(team))
				{
					roundEnded = true;
					messageAll(team.name + " won the round!");
				}
			}
			
			if(roundEnded)
			{
				OnRoundEnded();
			}
		}
	}
	
	protected void OnRoundEnded()
	{
		//The round has ended on a timer, so display the scoreboard summary
		roundTimeLeft = 0;
		interRoundTimeLeft = scoreDisplayTime + rankUpdateTime;
		if(voting) interRoundTimeLeft += votingTime;
		displayScoreboardGUI();
		currentRound.gametype.roundEnd();
		PlayerHandler.roundEnded();
	}
	
	public boolean needAutobalance()
	{
		if(!autoBalance() || currentRound == null || currentRound.teams.length != 2)
			return false;
		int membersTeamA = currentRound.teams[0].members.size();
		int membersTeamB = currentRound.teams[1].members.size();
		if(Math.abs(membersTeamA - membersTeamB) > 1)
			return true;
		return false;
	}
	
	public void autobalance()
	{
		if(!autoBalance() || currentRound == null || currentRound.teams.length != 2)
			return;
		int membersTeamA = currentRound.teams[0].members.size();
		int membersTeamB = currentRound.teams[1].members.size();
		if(membersTeamA - membersTeamB > 1)
		{
			for(int i = 0; i < (membersTeamA - membersTeamB) / 2; i++)
			{
				//My goodness this is convoluted...
				EntityPlayerMP playerToKick = getPlayer(currentRound.teams[1].addPlayer(currentRound.teams[0].removeWorstPlayer()));
				this.messagePlayer(playerToKick, "You were moved to the other team by the autobalancer.");
				sendClassMenuToPlayer(playerToKick);
			}
		}
		if(membersTeamB - membersTeamA > 1)
		{
			for(int i = 0; i < (membersTeamB - membersTeamA) / 2; i++)
			{
				EntityPlayerMP playerToKick = getPlayer(currentRound.teams[0].addPlayer(currentRound.teams[1].removeWorstPlayer()));
				this.messagePlayer(playerToKick, "You were moved to the other team by the autobalancer.");
				sendClassMenuToPlayer(playerToKick);
			}
		}
	}
	
	public String randomTimeOutString()
	{
		switch(Gametype.rand.nextInt(4))
		{
			case 0: return "That's time!";
			case 1: return "How dull; a tie...";
			case 2: return "Everybody's a loser but the clock.";
			default: return "Time up.";
		}
	}
	
	public void displayScoreboardGUI()
	{
		/*
		for(EntityPlayer player : getPlayers())
		{
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(!data.builder)
				sendPacketToPlayer(new PacketRoundFinished(scoreDisplayTime), (EntityPlayerMP)player);
		}
		*/
	}
	
	public void displayVotingGUI()
	{
	}
	
	public void pickVoteOptions()
	{
		Collections.sort(rounds);
		voteOptions = new TeamsRound[Math.min(5, rounds.size())];
		for(int i = 0; i < voteOptions.length; i++)
		{
			voteOptions[i] = rounds.get(i);
		}
		
		//Wildcard option!
		voteOptions[Gametype.rand.nextInt(voteOptions.length)] = rounds.get(Gametype.rand.nextInt(rounds.size()));
	}
	
	public void start()
	{
		if(!enabled || rounds.isEmpty())
			return;
		
		//Can only start once
		//if(currentRound != null)
		//	return;
		
		if(currentRound != null)
		{
			
			currentRound.gametype.roundCleanup();
			resetScores();
		}
		
		currentRound = rounds.get(0);
		startRound();
	}
	
	public void startNextRound()
	{
		if(!enabled || rounds.isEmpty())
			return;
		
		//If the next round has not been forced
		if(nextRound == null)
		{
			if(voting)
			{
				//Gather votes and decide which map to play
				int winner = 0;
				int mostVotes = 0;
				
				//Collect the votes from player data
				int[] numVotes = new int[voteOptions.length];
				for(PlayerData data : PlayerHandler.serverSideData.values())
				{
					if(data.vote > 0)
						numVotes[data.vote - 1]++;
				}
				
				//Find the highest one
				for(int i = 0; i < voteOptions.length; i++)
				{
					if(numVotes[i] > mostVotes)
					{
						mostVotes = numVotes[i];
						winner = i;
					}
				}
				nextRound = voteOptions[winner];
				
				
				//Update ratings
				for(TeamsRound round : rounds)
					round.roundsSincePlayed++;
				
				for(int i = 0; i < voteOptions.length; i++)
				{
					if(i == winner)
					{
						voteOptions[i].popularity = 1F - (1F - voteOptions[i].popularity) * 0.8F;
						voteOptions[i].roundsSincePlayed = 0;
					}
					else
					{
						voteOptions[i].popularity *= 0.9F;
						voteOptions[i].popularity += 0.01F;
					}
				}
				
				//Clear votes
				for(PlayerData data : PlayerHandler.serverSideData.values())
					data.vote = 0;
			}
			else //Use standard rotation. Go to next map
			{
				int lastRoundID = rounds.indexOf(currentRound);
				int nextRoundID = ++lastRoundID % rounds.size();
				nextRound = rounds.get(nextRoundID);
			}
		}
		
		//End the last round
		if(currentRound != null)
		{
			for(ITeamBase base : currentRound.map.bases)
				base.roundCleanup();
			currentRound.gametype.roundCleanup();
		}
		resetScores();
		
		//Advance to next round
		if(nextRound != null)
			currentRound = nextRound;
		//Note that if nextRound is null, we stay on the round we just played
		
		//Begin the next round
		startRound();
		
		//Reset this. Used for round forcing only.
		nextRound = null;
	}
	
	public void startRound()
	{
		currentRound.gametype.roundStart();
		roundTimeLeft = currentRound.timeLimit * 60 * 20;
		for(ITeamBase base : bases)
		{
			base.startRound();
		}
		
		for(EntityPlayer player : getPlayers())
			forceRespawn((EntityPlayerMP)player);
		
		showTeamsMenuToAll();
		
		messageAll("\u00a7fA new round has started!");
	}
	
	/**
	 * Called at the start of a round. Shows all players the team selection menu. Exludes people on the building / op team
	 */
	public void showTeamsMenuToAll()
	{
		showTeamsMenuToAll(false);
	}
	
	public void showTeamsMenuToAll(boolean info)
	{
		for(EntityPlayer player : getPlayers())
		{
			PlayerData data = PlayerHandler.getPlayerData(player);
			//Catch for broken player data
			if(data == null)
				continue;
			//Catch for people not on a team, such as builders
			if(data.builder && playerIsOp(player))
				continue;
			
			sendTeamsMenuToPlayer((EntityPlayerMP)player, info);
		}
	}
	
	@SubscribeEvent
	public void onPlayerInteract(EntityInteract event)
	{
		if(event.getEntityPlayer().inventory.getCurrentItem() != null && event.getEntityPlayer().inventory.getCurrentItem().getItem() instanceof ItemOpStick)
			((ItemOpStick)event.getEntityPlayer().inventory.getCurrentItem().getItem()).clickedEntity(event.getEntityPlayer().world, event.getEntityPlayer(), event.getTarget());
	}
	
	/**
	 * Stop damage being taken when it shouldn't
	 * N - NoTeam, S - Spectator, 1 - Team 1, 2 - Team 2, O - Other (mobs and world inflicted damage etc)
	 * <p>
	 * | N S O 1 2
	 * ------------
	 * N| y n y n n
	 * S| n n n n n
	 * O| y n y y y
	 * 1| n n y G G
	 * 2| n n y G G
	 * <p>
	 * y - yes, can hurt
	 * n - no, can't hurt
	 * G - decided by gametype
	 */
	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event)
	{
		if(!enabled || currentRound == null)
			return;
		if(event.getEntity() instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP)event.getEntity();
			PlayerData data = PlayerHandler.getPlayerData(player);
			DamageSource source = event.getSource();
			
			if(data.team == Team.spectators && source != DamageSource.GENERIC)
			{
				event.setCanceled(true);
				return;
			}
			
			if(source instanceof EntityDamageSource && source.getImmediateSource() instanceof EntityPlayerMP)
			{
				EntityPlayerMP attacker = ((EntityPlayerMP)source.getImmediateSource());
				PlayerData attackerData = PlayerHandler.getPlayerData(attacker);
				
				if(attackerData == null)
					return;
				
				//Can hurt self
				if(attacker == player)
					return;
				
				//Cannot be attacked by a spectator
				if(attackerData.team == Team.spectators)
				{
					event.setCanceled(true);
					return;
				}
				
				//Cannot be fights between people in the game and outside the game
				if((attackerData.team == null && data.team != null) || (attackerData.team != null && data.team == null))
				{
					event.setCanceled(true);
					return;
				}
				
				//Final case. Either the two players are not in the game (in which case, ignore) or they are both in the game.
				//At this point, we pass over to the gametype
				if(attackerData.team != null && data.team != null)
				{
					//The roundTimeLeft check ensures that players do not fight during the cooldown period
					if(roundTimeLeft > 0 && !currentRound.gametype.playerCanAttack(attacker, attackerData.team, player, data.team))
					{
						event.setCanceled(true);
					}
				}
			}
			else
			{
				//Not being attacked by a player, so this is fine
			}
			
		}
	}
	
	/**
	 * Handles entity deaths. Passes information to gametype for scoring
	 */
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent event)
	{
		if(!enabled)
			return;
		if(currentRound != null)
		{
			currentRound.gametype.entityKilled(event.getEntity(), event.getSource());
		}
		
		if(event.getEntity() instanceof EntityPlayerMP)
		{
			OnPlayerKilled((EntityPlayerMP)event.getEntity(), event.getSource());
		}
	}
	
	public void OnPlayerKilled(EntityPlayerMP player, DamageSource source)
	{
		if(currentRound != null)
		{
			currentRound.gametype.playerKilled(player, source);
		}
	}
	
	/**
	 * Base and object gathering hooks for entities, not tile entities
	 */
	@SubscribeEvent
	public void entityJoinedWorld(EntityJoinWorldEvent event)
	{
		if(event.getEntity() instanceof ITeamBase)
		{
			registerBase((ITeamBase)event.getEntity());
		}
		if(event.getEntity() instanceof ITeamObject)
		{
			objects.add((ITeamObject)event.getEntity());
		}
	}
	
	@SubscribeEvent
	public void playerUseEntity(EntityInteract event)
	{
		if(!enabled)
			return;
		if(event.getEntityPlayer().world.isRemote)
			return;
		
		ItemStack currentItem = event.getEntityPlayer().getHeldItemMainhand();
		if(currentItem.getItem() instanceof ItemOpStick)
		{
			//if(event.target instanceof ITeamObject)
			//	((ItemOpStick)currentItem.getItem()).clickedObject(event.getEntityPlayer().world, (EntityPlayerMP)event.getEntityPlayer(), (ITeamObject)event.target);
			//if(event.target instanceof ITeamBase)
			//	((ItemOpStick)currentItem.getItem()).clickedBase(event.getEntityPlayer().world, (EntityPlayerMP)event.getEntityPlayer(), (ITeamBase)event.target);
		}
		else if(currentRound != null)
		{
			if(event.getTarget() instanceof ITeamObject)
				currentRound.gametype.objectClickedByPlayer((ITeamObject)event.getTarget(), (EntityPlayerMP)event.getEntityPlayer());
			if(event.getTarget() instanceof ITeamBase)
				currentRound.gametype.baseClickedByPlayer((ITeamBase)event.getTarget(), (EntityPlayerMP)event.getEntityPlayer());
		}
	}
	
	@SubscribeEvent
	public void playerInteracted(PlayerInteractEvent event)
	{
		if(!enabled)
			return;
		if(event.getHand() == EnumHand.MAIN_HAND && event.getEntityPlayer().getHeldItemMainhand() != null && event.getEntityPlayer().getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			//event.setCanceled(true);
			return;
		}
		
		if(event.getEntityPlayer().world.isRemote)
			return;
		TileEntity te = event.getEntityPlayer().world.getTileEntity(event.getPos());
		if(te != null)
		{
			ItemStack currentItem = event.getEntityPlayer().getHeldItemMainhand();
			if(currentItem.getItem() instanceof ItemOpStick)
			{
				if(te instanceof ITeamObject)
					((ItemOpStick)currentItem.getItem()).clickedObject(event.getEntityPlayer().world, (EntityPlayerMP)event.getEntityPlayer(), (ITeamObject)te);
				if(te instanceof ITeamBase)
					((ItemOpStick)currentItem.getItem()).clickedBase(event.getEntityPlayer().world, (EntityPlayerMP)event.getEntityPlayer(), (ITeamBase)te);
			}
			else if(currentRound != null)
			{
				if(te instanceof ITeamObject)
					currentRound.gametype.objectClickedByPlayer((ITeamObject)te, (EntityPlayerMP)event.getEntityPlayer());
				if(te instanceof ITeamBase)
					currentRound.gametype.baseClickedByPlayer((ITeamBase)te, (EntityPlayerMP)event.getEntityPlayer());
			}
		}
	}
	
	@SubscribeEvent
	public void playerDrops(PlayerDropsEvent event)
	{
		ArrayList<EntityItem> dropsToThrow = new ArrayList<>();
		//First collect together guns and ammo if smart drops are enabled
		if(weaponDrops == 2)
		{
			for(EntityItem entity : event.getDrops())
			{
				ItemStack stack = entity.getItem();
				if(stack != null && !stack.isEmpty())
				{
					if(stack.getItem() instanceof ItemGun)
					{
						EntityGunItem gunEntity = new EntityGunItem(entity);
						stack.setCount(0);
						boolean alreadyAdded = false;
						for(EntityItem check : dropsToThrow)
						{
							if(check.getItem().isEmpty() || !(check.getItem().getItem() instanceof ItemGun))
								continue;
							
							if(((ItemGun)stack.getItem()).GetType() == ((ItemGun)check.getItem().getItem()).GetType())
								alreadyAdded = true;
						}
						if(!alreadyAdded)
						{
							event.getEntityPlayer().world.spawnEntity(gunEntity);
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
			GunType gunType = ((ItemGun)gunEntity.getItem().getItem()).GetType();
			for(EntityItem ammoEntity : event.getDrops())
			{
				ItemStack ammoItemstack = ammoEntity.getItem();
				if(ammoItemstack != null && ammoItemstack.getItem() instanceof ItemShootable)
				{
					ShootableType bulletType = ((ItemShootable)ammoItemstack.getItem()).type;
					if(gunType.isAmmo(bulletType))
					{
						gunEntity.ammoStacks.add(ammoItemstack.copy());
						ammoItemstack.setCount(0);
					}
				}
			}
		}
		//Now check the remaining items to see if they should be dropped
		for(EntityItem entity : event.getDrops())
		{
			ItemStack stack = entity.getItem();
			if(stack != null && !stack.isEmpty())
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
		event.getDrops().removeAll(dropsToThrow);
		
	}
	
	/**
	 * Stop spectators looting items
	 */
	@SubscribeEvent
	public void playerLoot(EntityItemPickupEvent event)
	{
		if(event.getEntity() instanceof EntityPlayer)
		{
			ItemStack itemStack = event.getItem().getItem();
			PlayerData data = PlayerHandler.getPlayerData(event.getEntityPlayer());
			if(enabled && currentRound != null && data != null)
			{
				if(data.team == Team.spectators || !currentRound.gametype.playerCanLoot(itemStack, InfoType.getType(itemStack), event.getEntityPlayer(), data.team))
					event.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerRespawn(PlayerEvent event)
	{
		if(event instanceof PlayerEvent.PlayerRespawnEvent)
			respawnPlayer(event.player, false);
		if(event instanceof PlayerEvent.PlayerLoggedOutEvent)
			onPlayerLogout(event.player);
		if(event instanceof PlayerEvent.PlayerLoggedInEvent)
			onPlayerLogin(event.player);
	}
	
	public void onPlayerLogin(EntityPlayer player)
	{
		if(!enabled || currentRound == null)
			return;
		
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			sendTeamsMenuToPlayer(playerMP);
			currentRound.gametype.playerJoined(playerMP);
		}
	}
	
	public void onPlayerLogout(EntityPlayer player)
	{
		for(Team team : Team.teams)
			team.removePlayer(player);
	}
	
	public void respawnPlayer(EntityPlayer player, boolean firstSpawn)
	{
		if(player.world.isRemote)
			return;
		
		if(!enabled || currentRound == null)
			return;
		
		EntityPlayerMP playerMP = ((EntityPlayerMP)player);
		PlayerData data = PlayerHandler.getPlayerData(playerMP);
		
		if(data == null || (data.builder && playerIsOp(playerMP)))
			return;
		
		//On the first spawn, we don't kill the player, we simply move them over, so do a /tp like command
		if(firstSpawn)
		{
			Vec3d spawnPoint = currentRound.gametype.getSpawnPoint(playerMP);
			if(spawnPoint != null)
			{
				//player.setPositionAndUpdate(spawnPoint.x, spawnPoint.y, spawnPoint.z);
				playerMP.dismountRidingEntity();
				EnumSet enumset = EnumSet.noneOf(SPacketPlayerPosLook.EnumFlags.class);
				playerMP.connection.setPlayerLocation(spawnPoint.x, spawnPoint.y, spawnPoint.z, 0F, 0F, enumset);
				//playerMP.setRotationYawHead(f);
			}
		}
		
		//To set their next spawn position, override their bed position
		setPlayersNextSpawnpoint(playerMP);
		
		if(forceAdventureMode)
			player.setGameType(GameType.ADVENTURE);
		resetInventory(player);
		currentRound.gametype.playerRespawned((EntityPlayerMP)player);
	}
	
	private void setPlayersNextSpawnpoint(EntityPlayerMP player, BlockPos pos, int dimension)
	{
		player.setSpawnChunk(pos, true, dimension);
	}
	
	private void setPlayersNextSpawnpoint(EntityPlayerMP player)
	{
		if(!enabled || currentRound == null)
			return;
		
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		Vec3d spawnPoint = currentRound.gametype.getSpawnPoint(player);
		if(spawnPoint != null)
			setPlayersNextSpawnpoint(player, new BlockPos(MathHelper.floor(spawnPoint.x), MathHelper.floor(spawnPoint.y) + 1, MathHelper.floor(spawnPoint.z)), 0);
		else
			FlansMod.log.warn("Could not find spawn point for " + player.getDisplayName() + " on team " +
					(data.newTeam == null ? "null" : data.newTeam.name));
	}
	
	/**
	 * Force a respawn
	 */
	public void forceRespawn(EntityPlayerMP player)
	{
		if(playerIsOp(player) && PlayerHandler.getPlayerData(player).builder)
			return;
		player.inventory.clear();
		player.heal(9001);
		if(forceAdventureMode)
			player.setGameType(GameType.ADVENTURE);
		respawnPlayer(player, true);
	}
	
	public void sendTeamsMenuToPlayer(EntityPlayerMP player)
	{
		sendTeamsMenuToPlayer(player, false);
	}
	
	public void sendTeamsMenuToPlayer(EntityPlayerMP player, boolean info)
	{
		if(!enabled || currentRound == null || currentRound.teams == null)
			return;
		//Get the available teams from the gametype
		Team[] availableTeams = currentRound.gametype.getTeamsCanSpawnAs(currentRound, player);
		//Add in the spectators as an option and "none" if the player is an op
		boolean playerIsOp = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(player.getGameProfile());
		Team[] allAvailableTeams = new Team[availableTeams.length + (playerIsOp ? 2 : 1)];
		System.arraycopy(availableTeams, 0, allAvailableTeams, 0, availableTeams.length);
		allAvailableTeams[availableTeams.length] = Team.spectators;
		
		sendPacketToPlayer(new PacketTeamSelect(allAvailableTeams, info), player);
	}
	
	public void sendClassMenuToPlayer(EntityPlayerMP player)
	{
		Team team = PlayerHandler.getPlayerData(player).newTeam;
		if(team == null)
		{
			sendTeamsMenuToPlayer(player);
		}
		else if(team != Team.spectators && team.classes.size() > 0)
		{
			sendPacketToPlayer(new PacketTeamSelect(team.classes.toArray(new PlayerClass[team.classes.size()])), player);
		}
	}
	
	public boolean playerIsOp(EntityPlayer player)
	{
		return FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(player.getGameProfile());
	}
	
	public boolean autoBalance()
	{
		return !(currentRound != null && !currentRound.gametype.shouldAutobalance()) && autoBalance;
	}
	
	//
	public void playerSelectedTeam(EntityPlayerMP player, String teamName)
	{
		if(!enabled || currentRound == null)
			return;
		
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		data.builder = false;
		
		//The player picked the op / builder team
		if(teamName.equals("null"))
		{
			if(playerIsOp(player))
			{
				data.team = null;
				data.builder = true;
				return;
			}
			else teamName = "spectators";
		}
		
		//The team the player selected
		Team selectedTeam = Team.getTeam(teamName);
		//They cannot pick no team
		if(selectedTeam == null)
			selectedTeam = Team.spectators;
		
		//Validate the selected team
		boolean isValid = selectedTeam == Team.spectators;
		Team[] validTeams = currentRound.gametype.getTeamsCanSpawnAs(currentRound, player);
		for(Team validTeam : validTeams)
		{
			if(selectedTeam == validTeam)
				isValid = true;
		}
		//Default to spectator
		if(!isValid)
		{
			player.sendMessage(new TextComponentString("You may not join " + selectedTeam.name + " for it is invalid. Please try again"));
			FlansMod.log.warn(player.getName() + " tried to spawn on an invalid team : " + selectedTeam.name);
			selectedTeam = Team.spectators;
		}
		
		//Spawn spectators immediately
		if(selectedTeam == Team.spectators)
		{
			messageAll(player.getName() + " joined \u00a7" + selectedTeam.textColour + selectedTeam.name);
			if(data.team != null)
				data.team.removePlayer(player);
			data.newTeam = data.team = Team.spectators;
			player.inventory.clear();
			data.team.addPlayer(player);
			player.heal(9001);
			respawnPlayer(player, true);
		}
		//Give other players the chance to select a class
		else
		{
			Team otherTeam = currentRound.getOtherTeam(selectedTeam);
			if(autoBalance() && selectedTeam.members.size() > otherTeam.members.size() + 1)
			{
				player.sendMessage(new TextComponentString("You may not join " + selectedTeam.name + " due to imbalance. Please try again"));
				sendTeamsMenuToPlayer(player);
				return;
			}
			data.newTeam = selectedTeam;
			sendClassMenuToPlayer(player);
		}
		
		currentRound.gametype.playerChoseTeam(player, data.team, selectedTeam);
	}
	
	public void playerSelectedClass(EntityPlayerMP player, String className)
	{
		if(!enabled || currentRound == null)
			return;
		
		//Get player class requested
		PlayerClass playerClass = PlayerClass.getClass(className);
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		//Validate class
		if(!data.newTeam.classes.contains(playerClass))
		{
			player.sendMessage(new TextComponentString("You may not select " + playerClass.name + ". Please try again"));
			FlansMod.log.warn(player.getName() + " tried to pick an invalid class : " + playerClass.name);
			//sendClassMenuToPlayer(player);
			return;
		}
		
		playerSelectedClass(player, playerClass);
	}
	
	public void playerSelectedClass(EntityPlayerMP player, IPlayerClass playerClass)
	{
		if(playerClass == null)
		{
			FlansMod.log.warn("Error in class selection");
			return;
		}
		
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		//Check cases
		//1 : Player switched class only
		if(data.team == data.newTeam && data.playerClass != null && !data.playerClass.GetShortName().equals(playerClass.GetShortName()))
		{
			currentRound.gametype.playerChoseNewClass(player, playerClass);
			data.newPlayerClass = playerClass;
			player.sendMessage(new TextComponentString("You will respawn with the " + playerClass.GetName() + " class"));
		}
		//2 : Player switched team
		else if(data.team != null && data.team != data.newTeam)
		{
			messageAll(player.getName() + " switched to \u00a7" + data.newTeam.textColour + data.newTeam.name);
			currentRound.gametype.playerDefected(player, data.team, data.newTeam);
			setPlayersNextSpawnpoint(player);
			player.attackEntityFrom(DamageSource.GENERIC, 10000F);
			if(data.team != null)
				data.team.removePlayer(player);
			data.newTeam.addPlayer(player);
			data.team = data.newTeam;
			data.newPlayerClass = playerClass;
		}
		//3 : Player has only just joined
		else if(data.team == null)
		{
			if(data.newTeam == null)
			{
				FlansMod.Assert(false, "NULL TEAM");
			}
			else
			{
				messageAll(player.getName() + " joined \u00a7" + data.newTeam.textColour + data.newTeam.name);
				currentRound.gametype.playerEnteredTheGame(player, data.newTeam, playerClass);
				data.newTeam.addPlayer(player);
				data.team = data.newTeam;
				data.newPlayerClass = playerClass;
				currentRound.gametype.playerChoseNewClass(player, playerClass);
				respawnPlayer(player, true);
			}
		}
	}
	
	public void resetInventory(EntityPlayer player)
	{
		Team team = PlayerHandler.getPlayerData(player).team;
		IPlayerClass playerClass = PlayerHandler.getPlayerData(player).getPlayerClass();
		
		if(team == null)
			return;
		
		player.inventory.clear();
		
		//Set team armour
		if(team.hat != null)
			player.setItemStackToSlot(EntityEquipmentSlot.HEAD, team.hat.copy());
		if(team.chest != null)
			player.setItemStackToSlot(EntityEquipmentSlot.CHEST, team.chest.copy());
		if(team.legs != null)
			player.setItemStackToSlot(EntityEquipmentSlot.LEGS, team.legs.copy());
		if(team.shoes != null)
			player.setItemStackToSlot(EntityEquipmentSlot.FEET, team.shoes.copy());
		
		if(playerClass == null)
			return;
		
		//Override with class armour
		if(playerClass.GetHat() != null)
			player.setItemStackToSlot(EntityEquipmentSlot.HEAD, playerClass.GetHat().copy());
		if(playerClass.GetChest() != null)
			player.setItemStackToSlot(EntityEquipmentSlot.CHEST, playerClass.GetChest().copy());
		if(playerClass.GetLegs() != null)
			player.setItemStackToSlot(EntityEquipmentSlot.LEGS, playerClass.GetLegs().copy());
		if(playerClass.GetShoes() != null)
			player.setItemStackToSlot(EntityEquipmentSlot.FEET, playerClass.GetShoes().copy());
		
		for(ItemStack stack : playerClass.GetStartingItems())
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
				((ItemGun)stack.getItem()).Reload(stack, player.world, player, player.inventory, EnumHand.MAIN_HAND, false, true, false);
			}
		}
	}
	
	//---------------------------------------------------------
	// Saving and Loading
	//---------------------------------------------------------
	
	@SubscribeEvent
	public void chunkLoaded(ChunkDataEvent event)
	{
		Chunk chunk = event.getChunk();
		for(ClassInheritanceMultiMap list : chunk.getEntityLists())
		{
			Iterator it = list.iterator();
			Entity entity;
			while(it.hasNext())
			{
				entity = (Entity)it.next();
				if(entity instanceof ITeamBase)
				{
					bases.add((ITeamBase)entity);
					if(((ITeamBase)entity).getBaseID() > nextBaseID)
					{
						FlansMod.log.warn("Loaded base with ID higher than the supposed highest ID. Adjusted highest ID");
						nextBaseID = ((ITeamBase)entity).getBaseID();
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
		if(event.getWorld().isRemote)
			return;
		if(event instanceof WorldEvent.Load)
		{
			loadPerWorldData(event, event.getWorld());
			savePerWorldData(event, event.getWorld());
		}
		if(event instanceof WorldEvent.Save)
		{
			savePerWorldData(event, event.getWorld());
		}
	}
	
	private void loadPerWorldData(Event event, World world)
	{
		//Reset the teams manager before loading a new world
		reset();
		//Read the teams dat file
		File file = new File(world.getSaveHandler().getWorldDirectory(), "teams_" + world.provider.getDimensionType().getName() + ".dat");
		if(!checkFileExists(file))
			return;
		try
		{
			NBTTagCompound tags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(file)));
			
			ReadFromNBT(tags, world);
			
			//Start the rotation
			if(enabled && rounds.size() > 0)
				start();
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to load from teams.dat");
			FlansMod.log.throwing(e);
			
		}
		
		//Reset all infotypes. Specifically, send this to player classes so that they may create itemstacks from strings regarding attachments for guns
		for(InfoType type : InfoType.infoTypes.values())
			type.onWorldLoad(world);
	}
	
	private void savePerWorldData(Event event, World world)
	{
		File file = new File(world.getSaveHandler().getWorldDirectory(), "teams_" + world.provider.getDimensionType().getName() + ".dat");
		checkFileExists(file);
		try
		{
			NBTTagCompound tags = new NBTTagCompound();
			
			WriteToNBT(tags);
			
			CompressedStreamTools.write(tags, new DataOutputStream(new FileOutputStream(file)));
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to save to teams.dat");
			FlansMod.log.throwing(e);
		}
	}
	
	protected void ReadFromNBT(NBTTagCompound tags, World world)
	{
		nextBaseID = tags.getInteger("NextBaseID");
		//Read maps
		for(int i = 0; i < tags.getInteger("NumberOfMaps"); i++)
		{
			TeamsMap map = new TeamsMap(world, tags.getCompoundTag("Map_" + i));
			maps.put(map.shortName, map);
		}
		
		int dimension = 0; //TODO : FIX THIS
		if(maps.isEmpty())
		{
			maps.put("default" + dimension, new TeamsMap(world, "default" + dimension, "Default " + world.getWorldInfo().getWorldName()));
		}
		
		//Read the rounds list		
		for(int i = 0; i < tags.getInteger("RoundsSize"); i++)
		{
			TeamsRound round = new TeamsRound(tags.getCompoundTag("Round_" + i));
			rounds.add(round);
		}
		
		//Read variables
		enabled = tags.getBoolean("Enabled");
		voting = tags.getBoolean("Voting");
		votingTime = tags.getInteger("VotingTime");
		scoreDisplayTime = tags.getInteger("ScoreTime");
		rankUpdateTime = tags.getInteger("RankUpdateTime");
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
	
	protected void WriteToNBT(NBTTagCompound tags)
	{
		tags.setInteger("NextBaseID", nextBaseID);
		//Changed name so that it does not try to read old maps
		tags.setInteger("NumberOfMaps", maps.size());
		//Write the maps to memory
		if(maps != null)
		{
			int i = 0;
			for(TeamsMap map : maps.values())
			{
				NBTTagCompound mapTags = new NBTTagCompound();
				map.writeToNBT(mapTags);
				tags.setTag("Map_" + i, mapTags);
				i++;
			}
		}
		//Write the rounds list to memory
		if(rounds != null)
		{
			tags.setInteger("RoundsSize", rounds.size());
			for(int i = 0; i < rounds.size(); i++)
			{
				TeamsRound entry = rounds.get(i);
				if(entry != null)
				{
					NBTTagCompound roundTags = new NBTTagCompound();
					entry.writeToNBT(roundTags);
					tags.setTag("Round_" + i, roundTags);
				}
			}
		}
		else tags.setInteger("RoundsSize", 0);
		//Write the current round to memory
		if(currentRound != null)
			tags.setInteger("CurrentRound", rounds.indexOf(currentRound));
		//Save gametype settings to memory
		for(Gametype gametype : Gametype.gametypes.values())
		{
			gametype.saveToNBT(tags);
		}
		
		//Save variables
		tags.setBoolean("Enabled", enabled);
		tags.setBoolean("Voting", voting);
		tags.setInteger("VotingTime", votingTime);
		tags.setInteger("ScoreTime", scoreDisplayTime);
		tags.setInteger("RankUpdateTime", rankUpdateTime);
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
	}
	
	
	private boolean checkFileExists(File file)
	{
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
				FlansMod.log.info("Created new file");
			}
			catch(Exception e)
			{
				FlansMod.log.error("Failed to create file");
				FlansMod.log.error(file.getAbsolutePath());
				FlansMod.log.throwing(e);
			}
			return false;
		}
		return true;
	}
	
	//------------------------------------------------------------------------------
	// Getters, setters, registers, loggers and the likes 
	//------------------------------------------------------------------------------
	
	public void resetScores()
	{
		for(Team team : Team.teams)
		{
			team.score = 0;
			team.members.clear();
		}
		for(EntityPlayer player : getPlayers())
			if(PlayerHandler.getPlayerData(player) != null)
				PlayerHandler.getPlayerData(player).resetScore();
	}
	
	public ITeamBase getBase(int ID)
	{
		for(ITeamBase base : bases)
		{
			if(base.getBaseID() == ID)
				return base;
		}
		return null;
	}
	
	public void registerBase(ITeamBase base)
	{
		if(base.getBaseID() == 0)
			base.setBaseID(nextBaseID++);
		bases.add(base);
	}
	
	public void registerObject(ITeamObject obj)
	{
		objects.add(obj);
	}
	
	public static EntityPlayerMP getPlayer(String username)
	{
		return FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUsername(username);
	}
	
	public static void log(String s)
	{
		FlansMod.log.info("Teams Info : " + s);
	}
	
	public static void messagePlayer(EntityPlayerMP player, String s)
	{
		player.sendMessage(new TextComponentString(s));
	}
	
	public static void messageAll(String s)
	{
		FlansMod.log.info("Teams Announcement : " + s);
		for(EntityPlayerMP player : getPlayers())
		{
			player.sendMessage(new TextComponentString(s));
		}
	}
	
	public static void sendPacketToPlayer(PacketBase packet, EntityPlayerMP player)
	{
		FlansMod.getPacketHandler().sendTo(packet, player);
	}
	
	public static List<EntityPlayerMP> getPlayers()
	{
		return FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayers();
	}
	
	/**
	 * Returns the team associated with the given ID
	 */
	public Team getTeam(int spawnerTeamID)
	{
		if(!enabled || currentRound == null || spawnerTeamID == 0)
			return null;
		if(spawnerTeamID == 1)
			return Team.spectators;
		return currentRound.teams[spawnerTeamID - 2];
	}
	
	/**
	 * The maps HashMap is indexed by shortName, not full name, so this method helps there
	 */
	public TeamsMap getMapFromFullName(String string)
	{
		for(TeamsMap map : maps.values())
		{
			if(map.name.equals(string))
				return map;
		}
		return null;
	}
	
	public void SelectTeam(Team team)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(team == null ? "null" : team.shortName, false));
		Minecraft.getMinecraft().displayGuiScreen(null);
	}
}
