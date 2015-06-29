package com.flansmod.client;

import java.io.File;
import java.util.HashMap;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityBlockDustFX;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityFishWakeFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.particle.EntitySuspendFX;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.renderhack.FlansModRendererDispatcher;
import com.flansmod.client.renderhack.RenderItemOld;
import com.flansmod.client.renderhack.RenderRegistry;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

public class FlansModClient extends FlansMod
{
	//Plane / Vehicle control handling
	/** Whether the player has received the vehicle tutorial text */
	public static boolean doneTutorial = false;
	/** Whether the player is in mouse control mode */
	public static boolean controlModeMouse = true;
	/** A delayer on the mouse control switch */
	public static int controlModeSwitchTimer = 20;
	
	/** The delay between shots / reloading */
	public static int shootTimeLeft, shootTimeRight;
	
	//Recoil variables
	/** The recoil applied to the player view by shooting */
	public static float playerRecoil;
	/** The amount of compensation to apply to the recoil in order to bring it back to normal */
	public static float antiRecoil;
	
	//Gun animations
	/** Gun animation variables for each entity holding a gun. Currently only applicable to the player */
	public static HashMap<EntityLivingBase, GunAnimations> gunAnimationsRight = new HashMap<EntityLivingBase, GunAnimations>(), gunAnimationsLeft = new HashMap<EntityLivingBase, GunAnimations>();
	
	//Scope variables
	/** A delayer on the scope button to avoid repeat presses */
	public static int scopeTime;
	/** The scope that is currently being looked down */
	public static IScope currentScope = null;
	/** The transition variable for zooming in / out with a smoother. 0 = unscoped, 1 = scoped */
	public static float zoomProgress = 0F, lastZoomProgress = 0F;
	/** The zoom level of the last scope used, for transitioning out of being scoped, even after the scope is forgotten */
	public static float lastZoomLevel = 1F, lastFOVZoomLevel = 1F;

	//Variables to hold the state of some settings so that after being hacked for scopes, they may be restored
	/** The player's mouse sensitivity setting, as it was before being hacked by my mod */
	public static float originalMouseSensitivity = 0.5F;
	/** The player's original FOV */
	public static float originalFOV = 90F;
	/** The original third person mode, before being hacked */
	public static int originalThirdPerson = 0;
	
	/** Whether the player is in a plane or not */
	public static boolean inPlane = false;
	
	/** Packet containing teams mod information from the server */
	public static PacketTeamInfo teamInfo;
	/** When a round ends, the teams score GUI is locked for this length of time */
	public static int teamsScoreGUILock = 0;	
	
	public void load()
	{		
		log("Loading Flan's mod client side.");
		MinecraftForge.EVENT_BUS.register(this);
		Minecraft mc = Minecraft.getMinecraft();

        // Prerequisite
        ModelManager modelManager = ObfuscationReflectionHelper.getPrivateValue(Minecraft.class, mc, "aL", "field_175617_aL", "modelManager");
        RenderManager renderManager = mc.getRenderManager();
        IReloadableResourceManager resourceManager = ((IReloadableResourceManager) mc.getResourceManager());

        // Render Item Hook
        RenderItem item = new RenderItemOld(mc.getTextureManager(), modelManager);
        ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, mc, item, "X", "field_175621_X", "renderItem");
        ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, mc, new ItemRenderer(mc), "Y", "field_175620_Y", "itemRenderer");
        renderManager.entityRenderMap.remove(EntityItem.class);
        renderManager.entityRenderMap.put(EntityItem.class, new RenderEntityItem(renderManager, item));
        renderManager.entityRenderMap.remove(EntityItemFrame.class);
        renderManager.entityRenderMap.put(EntityItemFrame.class, new RenderItemFrame(renderManager, item));
        mc.entityRenderer = new EntityRenderer(mc, resourceManager);

        // Render Block Dispatcher Hook
        BlockRendererDispatcher rendererDispatcher = new FlansModRendererDispatcher(modelManager.getBlockModelShapes(), mc.gameSettings);
        ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, mc, rendererDispatcher, "aM", "field_175618_aM", "blockRenderDispatcher");

        // Register Reload Listeners
        resourceManager.registerReloadListener(rendererDispatcher);
        resourceManager.registerReloadListener(item);
        resourceManager.registerReloadListener(mc.entityRenderer);
	}
	
	//private static final ResourceLocation zombieSkin = new ResourceLocation("flansmod", "skins/zombie.png");
			
	@SubscribeEvent
	public void renderOffHandGun(RenderPlayerEvent.Specials.Post event)
	{
		RenderPlayer renderer = event.renderer;
		EntityPlayer player = event.entityPlayer;
		float dt = event.partialRenderTick;
		PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
		
		ItemStack gunStack = null;
		
		//Check current stack is a one handed gun
		if(player instanceof EntityOtherPlayerMP)
		{
			gunStack = data.offHandGunStack;
		}
		else
		{
			ItemStack currentStack = player.getCurrentEquippedItem();
			if(currentStack == null || !(currentStack.getItem() instanceof ItemGun) || !((ItemGun)currentStack.getItem()).type.oneHanded || data.offHandGunSlot == 0)
				return;
			gunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
		}
				
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
			return;
		GunType gunType = ((ItemGun)gunStack.getItem()).type;
				
		//Render!
		GL11.glPushMatrix();

		renderer.getPlayerModel().bipedLeftArm.postRender(0.0625F);
        GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);


		float f2 = 1F;

		GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
		GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(-f2, -f2, f2);

		int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
		float f11 = (float)(k >> 16 & 255) / 255.0F;
		float f12 = (float)(k >> 8 & 255) / 255.0F;
		float f3 = (float)(k & 255) / 255.0F;
		GL11.glColor4f(f11, f12, f3, 1.0F);
		ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);

		GL11.glPopMatrix();
	}
	
	private float interpolateRotation(float x, float y, float dT)
	{
		float f3;

		for(f3 = y - x; f3 < -180.0F; f3 += 360.0F) { }
		for( ; f3 >= 180.0F; f3 -= 360.0F) { }

		return x + dT * f3;
	}

	//Handle player hiding / name tag removal for teams
	@SubscribeEvent
	public void renderLiving(RenderPlayerEvent.Pre event)
	{
		PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
		
		//Render debug boxes for player snapshots
		if(FlansMod.DEBUG && data != null)
		{
			if(data.snapshots[0] != null)
				data.snapshots[0].renderSnapshot();
		}
					
		RendererLivingEntity.NAME_TAG_RANGE = 64F;
		RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32F;		
		if(event.entity instanceof EntityPlayer && teamInfo != null && teamInfo.gametype != null && !"No Gametype".equals(teamInfo.gametype))
		{
			PlayerScoreData rendering = teamInfo.getPlayerScoreData(event.entity.getName());
			PlayerScoreData thePlayer = teamInfo.getPlayerScoreData(minecraft.thePlayer.getName());
			
			Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
			Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;
						
			//Do custom skin overrides
			//If we have no stored skin, try to get it
			if(data.skin == null)
				data.skin = ((AbstractClientPlayer)event.entityPlayer).getLocationSkin();
			//Only once we have the stored skin may we override
			if(data.skin != null)
			{
				ResourceLocation skin = rendering == null || rendering.playerClass == null ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
				//((AbstractClientPlayer)event.entityPlayer).func_152121_a(Type.SKIN, skin == null ? data.skin : skin);
			}
			
			//Spectators see all
			if(thePlayerTeam == Team.spectators)
				return;
			//Nobody sees spectators
			if(renderingTeam == Team.spectators)
			{
				event.setCanceled(true);
				return;
			}
			//If we are on the other team, don't render the name tag
			if(renderingTeam != thePlayerTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
				return;
			}
			//If its DM, don't render the name tag
			if(!teamInfo.sortedByTeam)
			{
				RendererLivingEntity.NAME_TAG_RANGE = 0F;
				RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
			}
		}
		

	}
	
	public static int shootTime(boolean left)
	{
		return left ? shootTimeLeft : shootTimeRight;
	}
	
	@SubscribeEvent
	public void cameraSetup(CameraSetup event)
	{
		if(minecraft.thePlayer.ridingEntity instanceof IControllable)
		{
			IControllable cont = (IControllable)minecraft.thePlayer.ridingEntity;
			event.roll = cont.getPrevPlayerRoll() + (cont.getPlayerRoll() - cont.getPrevPlayerRoll()) * (float)event.renderPartialTicks;
		}
	}

	public static void tick()
	{
		if (minecraft.thePlayer == null || minecraft.theWorld == null)
			return;
		
		if(minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null)
			minecraft.displayGuiScreen(new GuiDriveableController((IControllable)minecraft.thePlayer.ridingEntity));
		
		if(teamInfo != null && teamInfo.timeLeft > 0)
			teamInfo.timeLeft--;
		
		//Teams GUI lock at end of rounds
		if(teamsScoreGUILock > 0)
		{
			teamsScoreGUILock--;
			if(minecraft.currentScreen == null)
				minecraft.displayGuiScreen(new GuiTeamScores());
		}
		
		
		// Guns
		if (shootTimeLeft > 0)
			shootTimeLeft--;
		if (shootTimeRight > 0)
			shootTimeRight--;
		if(scopeTime > 0)
			scopeTime--;
		if (playerRecoil > 0)
			playerRecoil *= 0.8F;
		minecraft.thePlayer.rotationPitch -= playerRecoil;
		antiRecoil += playerRecoil;

		minecraft.thePlayer.rotationPitch += antiRecoil * 0.2F;
		antiRecoil *= 0.8F;
		
		//Update gun animations for the gun in hand
		for(GunAnimations g : gunAnimationsRight.values())
		{
			g.update();
		}		
		for(GunAnimations g : gunAnimationsLeft.values())
		{
			g.update();
		}		
		
		for(Object obj : minecraft.theWorld.playerEntities)
		{
			EntityPlayer player = (EntityPlayer)obj;
			ItemStack currentItem = player.getCurrentEquippedItem();
			if(currentItem != null && currentItem.getItem() instanceof ItemGun)
			{
				if(player == minecraft.thePlayer && minecraft.gameSettings.thirdPersonView == 0)
					player.clearItemInUse();
				else
				{
					player.setItemInUse(currentItem, 100);
				}
			}
		}

		//If the currently held item is not a gun or is the wrong gun, unscope
		Item itemInHand = null;
		ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
		if (itemstackInHand != null)
			itemInHand = itemstackInHand.getItem();
		if (currentScope != null && (itemInHand == null || !(itemInHand instanceof ItemGun && ((ItemGun)itemInHand).type.getCurrentScope(itemstackInHand) == currentScope)))
		{
			currentScope = null;
			minecraft.gameSettings.fovSetting = originalFOV;
			minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
			minecraft.gameSettings.thirdPersonView = originalThirdPerson;
		}
		
		//Calculate new zoom variables
		lastZoomProgress = zoomProgress;
		if(currentScope == null)
		{
			zoomProgress *= 0.66F;
		}
		else
		{
			zoomProgress = 1F - (1F - zoomProgress) * 0.66F; 
		}
		
		if (minecraft.thePlayer.ridingEntity instanceof IControllable)
		{
			inPlane = true;	
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable)minecraft.thePlayer.ridingEntity).getCameraDistance(), "thirdPersonDistance", "q", "field_78490_B");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}		
		}
		else if(inPlane)
		{
			try
			{
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "q", "field_78490_B");
			} catch (Exception e)
			{
				log("I forgot to update obfuscated reflection D:");
				throw new RuntimeException(e);
			}	
			inPlane = false;
		}
		if (controlModeSwitchTimer > 0)
			controlModeSwitchTimer--;
	}
	
	public static void renderTick(float smoothing)
	{
		//If the zoom has changed sufficiently, update it via reflection
		if(Math.abs(zoomProgress - lastZoomProgress) > 0.0001F)
		{
			float actualZoomProgress = lastZoomProgress + (zoomProgress - lastZoomProgress) * smoothing;
			float botchedZoomProgress = zoomProgress > 0.8F ? 1F : 0F;
			double zoomLevel = botchedZoomProgress * lastZoomLevel + (1 - botchedZoomProgress);
			float FOVZoomLevel = actualZoomProgress * lastFOVZoomLevel + (1 - actualZoomProgress);
			if(Math.abs(zoomLevel - 1F) < 0.01F)
				zoomLevel = 1.0D;
			
			float zoomToApply = Math.max(FOVZoomLevel, (float)zoomLevel);
			minecraft.gameSettings.fovSetting = (((originalFOV * 40 + 70) / zoomToApply) - 70) / 40;
		}
	}
	
	@SubscribeEvent
	public void chatMessage(ClientChatReceivedEvent event)
	{
		if(event.message.getUnformattedText().equals("#flansmod"))
		{
			//String[] split = event.message.getUnformattedText().split("\\.");
			//split[split.length - 1] = split[split.length - 1].split("\"}")[0];
			event.setCanceled(true);
			//TickHandlerClient.addKillMessage(split);
			//FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(split[3] + " killed " + split[2] + " with a " + InfoType.getType(split[1]).name);
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

	public static boolean flipControlMode()
	{
		if (controlModeSwitchTimer > 0)
			return false;
		controlModeMouse = !controlModeMouse;
		FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable)FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
		controlModeSwitchTimer = 40;
		return true;
	}
	
	public static void reloadModels(boolean reloadSkins)
	{
		for(InfoType type : InfoType.infoTypes)
		{
			type.reloadModel();
		}
		if(reloadSkins)
			proxy.forceReload();
	}
	
	public static Minecraft minecraft = FMLClientHandler.instance().getClient();

	/** Gets the team class from an ID */
	public static Team getTeam(int spawnerTeamID) 
	{
		if(teamInfo == null)
			return null;
		else return teamInfo.getTeam(spawnerTeamID);
	}

	public static boolean isCurrentMap(String map) {
		return !(teamInfo == null || teamInfo.mapShortName == null) && teamInfo.mapShortName.equals(map);
	}
	
	public static EnumParticleTypes getParticleType(String s)
	{
		if(s.equals("hugeexplosion")) 		return EnumParticleTypes.EXPLOSION_HUGE;
		else if(s.equals("largeexplode"))	return EnumParticleTypes.EXPLOSION_LARGE;
		else if(s.equals("explode"))		return EnumParticleTypes.EXPLOSION_NORMAL;
		else if(s.equals("fireworksSpark"))	return EnumParticleTypes.FIREWORKS_SPARK;
		else if(s.equals("bubble"))			return EnumParticleTypes.WATER_BUBBLE;
		else if(s.equals("splash"))			return EnumParticleTypes.WATER_SPLASH;
		else if(s.equals("wake"))			return EnumParticleTypes.WATER_WAKE;
		else if(s.equals("drop"))			return EnumParticleTypes.WATER_DROP;
		else if(s.equals("suspended"))		return EnumParticleTypes.SUSPENDED;
		else if(s.equals("depthsuspend"))	return EnumParticleTypes.SUSPENDED_DEPTH;
		else if(s.equals("townaura"))		return EnumParticleTypes.TOWN_AURA;
		else if(s.equals("crit"))			return EnumParticleTypes.CRIT;
		else if(s.equals("magicCrit"))		return EnumParticleTypes.CRIT_MAGIC;
		else if(s.equals("smoke"))			return EnumParticleTypes.SMOKE_NORMAL;
		else if(s.equals("largesmoke"))		return EnumParticleTypes.SMOKE_LARGE;
		else if(s.equals("spell"))			return EnumParticleTypes.SPELL;
		else if(s.equals("instantSpell"))	return EnumParticleTypes.SPELL_INSTANT;
		else if(s.equals("mobSpell"))		return EnumParticleTypes.SPELL_MOB;
		else if(s.equals("mobSpellAmbient"))return EnumParticleTypes.SPELL_MOB_AMBIENT;
		else if(s.equals("witchMagic"))		return EnumParticleTypes.SPELL_WITCH;
		else if(s.equals("dripWater"))		return EnumParticleTypes.DRIP_WATER;
		else if(s.equals("dripLava"))		return EnumParticleTypes.DRIP_LAVA;
		else if(s.equals("angryVillager"))	return EnumParticleTypes.VILLAGER_ANGRY;
		else if(s.equals("happyVillager"))	return EnumParticleTypes.VILLAGER_HAPPY;
		else if(s.equals("note"))			return EnumParticleTypes.NOTE;
		else if(s.equals("portal"))			return EnumParticleTypes.PORTAL;
		else if(s.equals("enchantmenttable"))return EnumParticleTypes.ENCHANTMENT_TABLE;
		else if(s.equals("flame"))			return EnumParticleTypes.FLAME;
		else if(s.equals("lava"))			return EnumParticleTypes.LAVA;
		else if(s.equals("footstep"))		return EnumParticleTypes.FOOTSTEP;
		else if(s.equals("cloud"))			return EnumParticleTypes.CLOUD;
		else if(s.equals("reddust"))		return EnumParticleTypes.REDSTONE;
		else if(s.equals("snowballpoof"))	return EnumParticleTypes.SNOWBALL;
		else if(s.equals("snowshovel"))		return EnumParticleTypes.SNOW_SHOVEL;
		else if(s.equals("slime"))			return EnumParticleTypes.SLIME;
		else if(s.equals("heart"))			return EnumParticleTypes.HEART;
		else if(s.equals("barrier"))		return EnumParticleTypes.BARRIER;
		
		return EnumParticleTypes.WATER_BUBBLE;
	}
	
	@SideOnly(Side.CLIENT)
	public static EntityFX getParticle(String s, World w, double x, double y, double z)
	{
		Minecraft mc = Minecraft.getMinecraft();
		//return mc.renderGlobal.doSpawnParticle(s, x, y, z, 0.01D, 0.01D, 0.01D);
		
        int particleID = 0;
        int[] data = new int[0];
              
		if(s.equals("hugeexplosion")) 		particleID = EnumParticleTypes.EXPLOSION_HUGE.getParticleID();
		else if(s.equals("largeexplode"))	particleID = EnumParticleTypes.EXPLOSION_LARGE.getParticleID();
		else if(s.equals("explode"))		particleID = EnumParticleTypes.EXPLOSION_NORMAL.getParticleID();
		else if(s.equals("fireworksSpark"))	particleID = EnumParticleTypes.FIREWORKS_SPARK.getParticleID();
		else if(s.equals("bubble"))			particleID = EnumParticleTypes.WATER_BUBBLE.getParticleID();
		else if(s.equals("splash"))			particleID = EnumParticleTypes.WATER_SPLASH.getParticleID();
		else if(s.equals("wake"))			particleID = EnumParticleTypes.WATER_WAKE.getParticleID();
		else if(s.equals("drop"))			particleID = EnumParticleTypes.WATER_DROP.getParticleID();
		else if(s.equals("suspended"))		particleID = EnumParticleTypes.SUSPENDED.getParticleID();
		else if(s.equals("depthsuspend"))	particleID = EnumParticleTypes.SUSPENDED_DEPTH.getParticleID();
		else if(s.equals("townaura"))		particleID = EnumParticleTypes.TOWN_AURA.getParticleID();
		else if(s.equals("crit"))			particleID = EnumParticleTypes.CRIT.getParticleID();
		else if(s.equals("magicCrit"))		particleID = EnumParticleTypes.CRIT_MAGIC.getParticleID();
		else if(s.equals("smoke"))			particleID = EnumParticleTypes.SMOKE_NORMAL.getParticleID();
		else if(s.equals("largesmoke"))		particleID = EnumParticleTypes.SMOKE_LARGE.getParticleID();
		else if(s.equals("spell"))			particleID = EnumParticleTypes.SPELL.getParticleID();
		else if(s.equals("instantSpell"))	particleID = EnumParticleTypes.SPELL_INSTANT.getParticleID();
		else if(s.equals("mobSpell"))		particleID = EnumParticleTypes.SPELL_MOB.getParticleID();
		else if(s.equals("mobSpellAmbient"))particleID = EnumParticleTypes.SPELL_MOB_AMBIENT.getParticleID();
		else if(s.equals("witchMagic"))		particleID = EnumParticleTypes.SPELL_WITCH.getParticleID();
		else if(s.equals("dripWater"))		particleID = EnumParticleTypes.DRIP_WATER.getParticleID();
		else if(s.equals("dripLava"))		particleID = EnumParticleTypes.DRIP_LAVA.getParticleID();
		else if(s.equals("angryVillager"))	particleID = EnumParticleTypes.VILLAGER_ANGRY.getParticleID();
		else if(s.equals("happyVillager"))	particleID = EnumParticleTypes.VILLAGER_HAPPY.getParticleID();
		else if(s.equals("note"))			particleID = EnumParticleTypes.NOTE.getParticleID();
		else if(s.equals("portal"))			particleID = EnumParticleTypes.PORTAL.getParticleID();
		else if(s.equals("enchantmenttable"))particleID = EnumParticleTypes.ENCHANTMENT_TABLE.getParticleID();
		else if(s.equals("flame"))			particleID = EnumParticleTypes.FLAME.getParticleID();
		else if(s.equals("lava"))			particleID = EnumParticleTypes.LAVA.getParticleID();
		else if(s.equals("footstep"))		particleID = EnumParticleTypes.FOOTSTEP.getParticleID();
		else if(s.equals("cloud"))			particleID = EnumParticleTypes.CLOUD.getParticleID();
		else if(s.equals("reddust"))		particleID = EnumParticleTypes.REDSTONE.getParticleID();
		else if(s.equals("snowballpoof"))	particleID = EnumParticleTypes.SNOWBALL.getParticleID();
		else if(s.equals("snowshovel"))		particleID = EnumParticleTypes.SNOW_SHOVEL.getParticleID();
		else if(s.equals("slime"))			particleID = EnumParticleTypes.SLIME.getParticleID();
		else if(s.equals("heart"))			particleID = EnumParticleTypes.HEART.getParticleID();
		else if(s.equals("barrier"))		particleID = EnumParticleTypes.BARRIER.getParticleID();
        else if(s.contains("_"))
        {
            int k;
            String[] split = s.split("_", 3);
            
            

            if(split[0].equals("iconcrack"))
            {
                data = new int[] { Item.getIdFromItem(InfoType.getRecipeElement(split[1],0).getItem()) };
                particleID = EnumParticleTypes.ITEM_CRACK.getParticleID();
            }
            else
            {
            	data = new int[] { Block.getIdFromBlock(Block.getBlockFromItem(InfoType.getRecipeElement(split[1],0).getItem())) };

                if(split[0].equals("blockcrack"))
                {
                	 particleID = EnumParticleTypes.BLOCK_CRACK.getParticleID();
                }
                else if(split[0].equals("blockdust"))
                {
                	 particleID = EnumParticleTypes.BLOCK_DUST.getParticleID();
                }
            }
        }

        
        EntityFX fx = mc.effectRenderer.spawnEffectParticle(particleID, x, y, z, 0D, 0D, 0D, data);
        
		if(mc.gameSettings.fancyGraphics)
			fx.renderDistanceWeight = 200D;
		
		return fx;
	}

	public static GunAnimations getGunAnimations(EntityLivingBase living, boolean offHand) 
	{
		GunAnimations animations = null;
		if(offHand)
		{
			if(FlansModClient.gunAnimationsLeft.containsKey(living))
				animations = FlansModClient.gunAnimationsLeft.get(living);
			else 
			{
				animations = new GunAnimations();
				FlansModClient.gunAnimationsLeft.put(living, animations);
			}
		}
		else
		{
			if(FlansModClient.gunAnimationsRight.containsKey(living))
				animations = FlansModClient.gunAnimationsRight.get(living);
			else 
			{
				animations = new GunAnimations();
				FlansModClient.gunAnimationsRight.put(living, animations);
			}
		}
		return animations;
	}
	
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onTextureStitch(TextureStitchEvent.Pre event)
    {
        if (event.map == Minecraft.getMinecraft().getTextureMapBlocks())
        {
            RenderRegistry.instance().injectTexture(event.map);
        }
    }
}
