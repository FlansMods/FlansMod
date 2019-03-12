package com.flansmod.apocalypse.common;

import java.util.EnumSet;
import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.flansmod.apocalypse.common.entity.EntityAIMecha;
import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityFlyByPlane;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.apocalypse.common.network.PacketApocalypseCountdown;
import com.flansmod.apocalypse.common.world.TeleporterApocalypse;
import com.flansmod.apocalypse.common.world.buildings.StructureAbandonedVillagePieces;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.parts.PartType;

public class CommonProxyApocalypse
{
	private int apocalypseCountdown = 0;
	/**
	 * The mecha that started all this
	 */
	private EntityMecha apocalypseMecha = null;
	public ApocalypseData data;
	
	private static HashMap<EntityPlayer, BlockPos> deathPoints = new HashMap<>();
	
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(data = new ApocalypseData());
		
		StructureAbandonedVillagePieces.registerVillagePieces();
	}
	
	public void init(FMLInitializationEvent event)
	{
		FlansMod.getPacketHandler().registerPacket(PacketApocalypseCountdown.class);
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event)
	{
		event.getRegistry().register(new EntityEntry(EntitySurvivor.class, "Survivor").setRegistryName("Survivor"));
		event.getRegistry().register(new EntityEntry(EntityTeleporter.class, "Teleporter").setRegistryName("Teleporter"));
		event.getRegistry().register(new EntityEntry(EntityAIMecha.class, "AIMecha").setRegistryName("AIMecha"));
		event.getRegistry().register(new EntityEntry(EntityFakePlayer.class, "FakePlayer").setRegistryName("FakePlayer"));
		event.getRegistry().register(new EntityEntry(EntityNukeDrop.class, "NukeDrop").setRegistryName("NukeDrop"));
		event.getRegistry().register(new EntityEntry(EntityFlyByPlane.class, "FlyByPlane").setRegistryName("FlyByPlane"));
		
		//EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:Survivor"), 		EntitySurvivor.class, "Survivor", 112, FlansModApocalypse.INSTANCE, 100, 20, true, 0, 0);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:Teleporter"), EntityTeleporter.class, "Teleporter", 113, FlansModApocalypse.INSTANCE, 100, 20, true);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:AIMecha"), EntityAIMecha.class, "AIMecha", 114, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:FakePlayer"), EntityFakePlayer.class, "FakePlayer", 115, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:NukeDrop"), EntityNukeDrop.class, "NukeDrop", 116, FlansModApocalypse.INSTANCE, 250, 20, false);
		EntityRegistry.registerModEntity(new ResourceLocation("flansmodapocalypse:FlyByPlane"), EntityFlyByPlane.class, "FlyByPlane", 117, FlansModApocalypse.INSTANCE, 250, 20, false);
	}
	
	/**
	 * Tick hook for server
	 */
	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event)
	{
		if(event.phase == TickEvent.Phase.START)
		{
			//Countdown to 0 and on 0, do apocalypse things
			if(getApocalypseCountdown() > 0)
			{
				if(apocalypseMecha == null || apocalypseMecha.isDead())
				{
					setApocalypseCountdown(0);
				}
				else
				{
					setApocalypseCountdown(getApocalypseCountdown() - 1);
					
					//Wiggle the apocalypse mecha
					apocalypseMecha.getSeat(0).prevLooking = apocalypseMecha.getSeat(0).looking.clone();
					apocalypseMecha.getSeat(0).looking.rotateGlobalYaw(apocalypseMecha.world.rand.nextFloat() * 10F);
					apocalypseMecha.getSeat(0).looking.rotateGlobalPitch((float)apocalypseMecha.world.rand.nextGaussian() * 3F);
					
					//Drop nukes
					if(getApocalypseCountdown() % 20 == 0)
					{
						World world = apocalypseMecha.world;
						float range = 150F;
						world.spawnEntity(new EntityNukeDrop(world, apocalypseMecha.posX + world.rand.nextGaussian() * range, 256, apocalypseMecha.posZ + world.rand.nextGaussian() * range));
					}
					
					//Start the apocalypse
					if(getApocalypseCountdown() == 0)
					{
						FlansMod.log.info("The apocalypse has begun!");
						EntityPlayer placer = apocalypseMecha.placer;
						
						switch(FlansModApocalypse.OPTION)
						{
							case DIM:
								for(int i = 0; i < placer.world.playerEntities.size(); i++)
									if(placer.world.playerEntities.get(i).dimension == 0)
										sendPlayerToApocalypse(placer.world.playerEntities.get(i));
								break;
							case DIM_OPT_IN:
								break;
							case NEARBY:
								for(Object player : placer.world.playerEntities)
									if(((Entity)player).dimension == 0 && ((Entity)player).getDistanceSq(placer) < 50 * 50)
										sendPlayerToApocalypse((EntityPlayer)player);
								break;
							case NEARBY_OPT_IN:
								break;
							case PLACER_ONLY:
								sendPlayerToApocalypse(placer);
								break;
						}
						apocalypseMecha.setDead();
					}
				}
			}
			
			WorldServer world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(FlansModApocalypse.dimensionID);
			if(world != null)
			{
				for(int i = 0; i < world.playerEntities.size(); i++)
				{
					EntityPlayer player = world.playerEntities.get(i);
					//FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().transferPlayerToDimension((EntityPlayerMP)player, 0, new TeleporterApocalypse(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(FlansModApocalypse.dimensionID)));
					
					if(world.rand.nextInt(5000) == 0)
					{
						double dX = world.rand.nextFloat() - 0.5F;
						double dZ = world.rand.nextFloat() - 0.5F;
						double mag = Math.sqrt(dX * dX + dZ * dZ);
						dX /= mag;
						dZ /= mag;
						double dist = 200D;
						dX *= dist;
						dZ *= dist;
						
						PlaneType type = FlansModApocalypse.getLootGenerator().getRandomPlane(world.rand);
						NBTTagCompound tags = new NBTTagCompound();
						tags.setString("Engine", FlansModApocalypse.getLootGenerator().getRandomEngine(type, world.rand).shortName);
						tags.setString("Type", type.shortName);
						for(EnumDriveablePart part : EnumDriveablePart.values())
						{
							tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
							tags.setBoolean(part.getShortName() + "_Fire", false);
						}
						DriveableData data = new DriveableData(tags);
						
						EntityFlyByPlane plane = new EntityFlyByPlane(world, player.posX + dX, 120, player.posZ + dZ, type, data);
						
						plane.throttle = 1F;
						world.spawnEntity(plane);
						
						float yaw = 180F + (float)Math.atan2(dZ, dX) * 180F / 3.14159F;
						plane.getSeat(0).looking.setAngles(yaw, 0F, 0F);
						plane.getSeat(0).prevLooking.setAngles(yaw, 0F, 0F);
						plane.axes.setAngles(yaw, 0F, 0F);
						plane.prevAxes.setAngles(yaw, 0F, 0F);
						
						Entity pilot = new EntitySkeleton(world);
						pilot.setPosition(plane.posX, plane.posY, plane.posZ);
						world.spawnEntity(pilot);
						
						pilot.startRiding(plane.getSeat(0));
					}
					
					if(world.rand.nextInt(FlansModApocalypse.WANDERING_SURVIVOR_RARITY) == 0 && !world.provider.isDaytime())
					{
						double angle = world.rand.nextFloat() * 3.14159F * 2F;
						double dist = 50D;
						double dX = Math.cos(angle) * dist;
						double dZ = Math.sin(angle) * dist;
						
						EntitySurvivor survivor = new EntitySurvivor(world);
						survivor.setPosition(player.posX + dX, world.getTopSolidOrLiquidBlock(new BlockPos(player.posX + dX, 0, player.posZ + dZ)).getY() + 1D, player.posZ + dZ);
						
						world.spawnEntity(survivor);
					}
				}
			}
		}
	}
	
	private void sendPlayerToApocalypse(EntityPlayer player)
	{
		//Make a copy of the player to hold their inventory and hang around until they get back
		EntityFakePlayer fakePlayer = new EntityFakePlayer(player.world, player);
		player.world.spawnEntity(fakePlayer);
		
		player.inventory.clear();
		
		//Teleport them, making note of where they got in
		player.timeUntilPortal = 10;
		data.entryPoints.put(player.getPersistentID(), new BlockPos(apocalypseMecha.posX, apocalypseMecha.posY, apocalypseMecha.posZ));
		BlockPos exitPoint = new BlockPos(apocalypseMecha.posX, 128, apocalypseMecha.posZ);
		for(; FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(FlansModApocalypse.dimensionID).isAirBlock(exitPoint); exitPoint = exitPoint.down())
		{
		}
		FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().transferPlayerToDimension((EntityPlayerMP)player, FlansModApocalypse.dimensionID, new TeleporterApocalypse(FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(FlansModApocalypse.dimensionID), exitPoint.add(0, 1, 0)));
		
		giveStarterKit(player);
	}
	
	private void giveStarterKit(EntityPlayer player)
	{
		player.inventory.addItemStackToInventory(new ItemStack(Items.STONE_PICKAXE));
		player.inventory.addItemStackToInventory(new ItemStack(Items.STONE_SHOVEL));
		player.inventory.addItemStackToInventory(new ItemStack(Blocks.LOG, 8));
		player.inventory.addItemStackToInventory(new ItemStack(Items.COOKED_BEEF, 4));
	}
	
	@SubscribeEvent
	public void itemPlaced(EntityJoinWorldEvent event)
	{
		if(!event.getWorld().isRemote && event.getEntity() instanceof EntityMecha && event.getEntity().dimension == 0)
		{
			EntityMecha mecha = (EntityMecha)event.getEntity();
			PartType engine = mecha.getDriveableData().engine;
			if(engine.isAIChip)
			{
				setApocalypseCountdown(FlansModApocalypse.apocalypseCountdownLength);
				apocalypseMecha = mecha;
				FlansMod.getPacketHandler().sendTo(new PacketApocalypseCountdown(getApocalypseCountdown()), (EntityPlayerMP)mecha.placer);
			}
		}
	}
	
	/**
	 * Take note of where the player died
	 */
	@SubscribeEvent
	public void playerDied(LivingDeathEvent event)
	{
		if(event.getEntityLiving().dimension == FlansModApocalypse.dimensionID && event.getEntityLiving() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.getEntityLiving();
			
			deathPoints.put(player, new BlockPos(player.posX, player.posY, player.posZ));
		}
	}
	
	/**
	 * Respawn the player somewhere nearby where they died on the surface
	 */
	@SubscribeEvent
	public void playerRespawned(PlayerRespawnEvent event)
	{
		if(event.player.dimension == FlansModApocalypse.dimensionID)
		{
			BlockPos pos = deathPoints.get(event.player);
			if(pos != null)
			{
				EnumSet enumset = EnumSet.noneOf(SPacketPlayerPosLook.EnumFlags.class);
				float angle = event.player.world.rand.nextFloat() * 2F * 3.14159F;
				pos = pos.add((int)(Math.cos(angle) * FlansModApocalypse.SPAWN_RADIUS), 128 - pos.getY(), (int)(Math.sin(angle) * FlansModApocalypse.SPAWN_RADIUS));
				for(; event.player.world.isAirBlock(pos); pos = pos.down())
				{
					
				}
				((EntityPlayerMP)event.player).connection.setPlayerLocation(pos.getX() + 0.5D, pos.getY() + 1.5D, pos.getZ() + 0.5D, 0F, 0F, enumset);
				event.player.posX = event.player.prevPosX = pos.getX() + 0.5D;
				event.player.posY = event.player.prevPosY = pos.getY() + 0.5D;
				event.player.posZ = event.player.prevPosZ = pos.getZ() + 0.5D;
			}
		}
	}
	
	public int getApocalypseCountdown()
	{
		return apocalypseCountdown;
	}
	
	private void setApocalypseCountdown(int apocalypseCountdown)
	{
		this.apocalypseCountdown = apocalypseCountdown;
	}
	
}
