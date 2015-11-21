package com.flansmod.client;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3i;

public class TickHandlerClient
{
	public static ArrayList<Vector3i> blockLightOverrides = new ArrayList<Vector3i>();
	public static int lightOverrideRefreshRate = 5;
	
	public TickHandlerClient()
	{
		FMLCommonHandler.instance().bus().register(this);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void eventHandler(MouseEvent event)
	{
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
		{
			if(((ItemGun)player.getCurrentEquippedItem().getItem()).type.oneHanded && Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) && Math.abs(event.dwheel) > 0)
				event.setCanceled(true);
		}
	}
	

	
	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			RenderGun.smoothing = event.renderTickTime;
			renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
			break;
		case END :
			//renderTickEnd(Minecraft.getMinecraft());
			break;
		}	
	}
	
	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			clientTickStart(Minecraft.getMinecraft());
			break;
		case END :
			clientTickEnd(Minecraft.getMinecraft());
			break;
		}	
	}
	
	/** Handle flashlight block light override */	
	public void clientTickStart(Minecraft mc)
	{
		//Handle all packets received since last tick
		FlansMod.getPacketHandler().handleClientPackets();
		
		//Handle lighting from flashlights and glowing bullets
		if(FlansMod.ticker % lightOverrideRefreshRate == 0 && mc.theWorld != null)
		{
			//Check graphics setting and adjust refresh rate
			lightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 10 : 20;
			
			//Reset old light values
			for(Vector3i v : blockLightOverrides)
			{
				mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(v.x, v.y, v.z));
			}
			//Clear the list
			blockLightOverrides.clear();
			
			//Find all flashlights
			for(Object obj : mc.theWorld.playerEntities)
			{
				EntityPlayer player = (EntityPlayer)obj;
				ItemStack currentHeldItem = player.getCurrentEquippedItem();
				if(currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun)
				{
					GunType type = ((ItemGun)currentHeldItem.getItem()).type;
					AttachmentType grip = type.getGrip(currentHeldItem);
					if(grip != null && grip.flashlight)
					{
						for(int i = 0; i < 2; i++)
						{
							MovingObjectPosition ray = player.rayTrace(grip.flashlightRange / 2F * (i + 1), 1F);
							if(ray != null)
							{
								int x = ray.getBlockPos().getX();
								int y = ray.getBlockPos().getY();
								int z = ray.getBlockPos().getZ();
								EnumFacing side = ray.sideHit;
								switch(side)
								{
								case DOWN : y--; break;
								case UP : y++; break;
								case NORTH : z--; break;
								case SOUTH : z++; break;
								case WEST : x--; break;
								case EAST : x++; break;
								}
								blockLightOverrides.add(new Vector3i(x, y, z));
								mc.theWorld.setLightFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z), 12);
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y + 1, z));
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y - 1, z));
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x + 1, y, z));
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x - 1, y, z));
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z + 1));
								mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z - 1));
							}
						}
					}
				}
			}
			
			for(Object obj : mc.theWorld.loadedEntityList)
			{
				if(obj instanceof EntityBullet)
				{
					EntityBullet bullet = (EntityBullet)obj;
					if(!bullet.isDead && bullet.type.hasLight)
					{
						int x = MathHelper.floor_double(bullet.posX);
						int y = MathHelper.floor_double(bullet.posY);
						int z = MathHelper.floor_double(bullet.posZ);
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z), 15);
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y + 1, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y - 1, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x + 1, y, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x - 1, y, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z + 1));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z - 1));
					}
				}
				else if(obj instanceof EntityMecha)
				{
					EntityMecha mecha = (EntityMecha)obj;
					int x = MathHelper.floor_double(mecha.posX);
					int y = MathHelper.floor_double(mecha.posY);
					int z = MathHelper.floor_double(mecha.posZ);
					if(mecha.lightLevel() > 0)
					{
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z), Math.max(mc.theWorld.getLightFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z)), mecha.lightLevel()));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y + 1, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y - 1, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x + 1, y, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x - 1, y, z));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z + 1));
						mc.theWorld.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, new BlockPos(x, y, z - 1));
					}
					if(mecha.forceDark())
					{
						for(int i = -3; i <= 3; i++)
						{
							for(int j = -3; j <= 3; j++)
							{
								for(int k = -3; k <= 3; k++)
								{
									int xd = i + x;
									int yd = j + y;
									int zd = k + z;
									blockLightOverrides.add(new Vector3i(xd, yd, zd));
									mc.theWorld.setLightFor(EnumSkyBlock.SKY, new BlockPos(xd, yd, zd), Math.abs(i) + Math.abs(j) + Math.abs(k));
								}
							}
						}
					}
				}
			}
		}
	}

	public void clientTickEnd(Minecraft minecraft)
	{ /* Client side only */
		ClientRenderHooks.gameTick();
		RenderFlag.angle += 2F;
		FlansModClient.tick();
	}
	
	
	public void renderTickStart(Minecraft mc, float smoothing)
	{
		// CAPTURE MOUSE INPUT!
		if (mc.currentScreen == null && FlansModClient.controlModeMouse)
		{
			MouseHelper mouse = mc.mouseHelper;
			Entity ridden = mc.thePlayer.ridingEntity;

			if (ridden instanceof EntityDriveable)
			{
				EntityDriveable entity = (EntityDriveable) ridden;
				entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
			}
		}
		
		FlansModClient.renderTick(smoothing);
		ClientRenderHooks.updateRenderTick(smoothing);
	}
}
