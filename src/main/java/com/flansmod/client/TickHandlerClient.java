package com.flansmod.client;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;

import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

public class TickHandlerClient
{
	public static final ResourceLocation offHand = new ResourceLocation("flansmod","gui/offHand.png");
	
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
	public void eventHandler(RenderGameOverlayEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		
		//Remove crosshairs if looking down the sights of a gun
		if(event.type == ElementType.CROSSHAIRS && FlansModClient.currentScope != null)
		{
			event.setCanceled(true);
			return;
		}

	    if(!event.isCancelable() && event.type == ElementType.HOTBAR)
	    {      
			ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
						
			Tessellator tessellator = Tessellator.instance;
			//Player ammo overlay
			if(mc.thePlayer != null)
			{
				ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
				if(stack != null && stack.getItem() instanceof ItemGun)
				{
					ItemGun gunItem = (ItemGun)stack.getItem();
					GunType gunType = gunItem.type;
					int x = 0;
					for(int n = 0; n < gunType.numAmmoItemsInGun; n++)
					{
						ItemStack bulletStack = ((ItemGun)stack.getItem()).getBulletItemStack(stack, n);
						if(bulletStack != null && bulletStack.getItem() != null)
						{
							RenderHelper.enableGUIStandardItemLighting();
							GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
							GL11.glEnable(GL12.GL_RESCALE_NORMAL);
							OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
							drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 + 54 - x, j - 65);
							GL11.glDisable(GL12.GL_RESCALE_NORMAL);
							RenderHelper.disableStandardItemLighting();
							String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
							if(bulletStack.getMaxDamage() == 1)
								s = "";
							mc.fontRenderer.drawString(s, i / 2 + 70 - x, j - 59, 0x000000);
							mc.fontRenderer.drawString(s, i / 2 + 69 - x, j - 60, 0xffffff);
							x += 16 + mc.fontRenderer.getStringWidth(s);
						}
					}
					//Render secondary gun
					PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
					if(gunType.oneHanded && data.offHandGunSlot != 0)
					{
						ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
						if(offHandStack != null && offHandStack.getItem() instanceof ItemGun)
						{
							GunType offHandGunType = ((ItemGun)offHandStack.getItem()).type;
							x = 0;
							for(int n = 0; n < offHandGunType.numAmmoItemsInGun; n++)
							{
								ItemStack bulletStack = ((ItemGun)offHandStack.getItem()).getBulletItemStack(offHandStack, n);
								if(bulletStack != null && bulletStack.getItem() != null)
								{
									RenderHelper.enableGUIStandardItemLighting();
									GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
									GL11.glEnable(GL12.GL_RESCALE_NORMAL);
									OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
									drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 - 89 + x, j - 65);
									GL11.glDisable(GL12.GL_RESCALE_NORMAL);
									RenderHelper.disableStandardItemLighting();
									String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
									if(bulletStack.getMaxDamage() == 1)
										s = "";
									mc.fontRenderer.drawString(s, i / 2 - 71 + x, j - 59, 0x000000);
									mc.fontRenderer.drawString(s, i / 2 - 72 + x, j - 60, 0xffffff);
									x += 16 + mc.fontRenderer.getStringWidth(s);
								}
							}
						}
					}
				}
			}
			
			PacketTeamInfo teamInfo = FlansModClient.teamInfo;
			
			if(teamInfo != null && FlansModClient.minecraft.thePlayer != null && (teamInfo.numTeams > 0 || !teamInfo.sortedByTeam) && teamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getCommandSenderName()) != null)
			{
				GL11.glEnable(3042 /* GL_BLEND */);
				GL11.glDisable(2929 /* GL_DEPTH_TEST */);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(770, 771);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				GL11.glDisable(3008 /* GL_ALPHA_TEST */);
	
				mc.renderEngine.bindTexture(GuiTeamScores.texture);
								
				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 85D / 256D, 27D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 171D / 256D, 27D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 171D / 256D, 0D / 256D);
				tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 85D / 256D, 0D / 256D);
				tessellator.draw();
				
				//If we are in a two team gametype, draw the team scores at the top of the screen
				if(teamInfo.numTeams == 2 && teamInfo.sortedByTeam)
				{
					//Draw team 1 colour bit
					int colour = teamInfo.teamData[0].team.teamColour;	
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 0D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 27, -90D, 24D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 0D, -90D, 24D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 0D / 256D, 98D / 256D);
					tessellator.draw();
					//Draw team 2 colour bit
					colour = teamInfo.teamData[1].team.teamColour;	
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 + 19, 27, -90D, 62D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 86D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 86D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 + 19, 0D, -90D, 62D / 256D, 98D / 256D);
					tessellator.draw();
					
					GL11.glDepthMask(true);
					GL11.glEnable(2929 /* GL_DEPTH_TEST */);
					GL11.glEnable(3008 /* GL_ALPHA_TEST */);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
					
					//Draw the team scores
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 36, 8, 0xffffff);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 8, 0xffffff);
				}
				
				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 48, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 47, 8, 0xffffff);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 47 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 48 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 8, 0xffffff);
				
				int secondsLeft = teamInfo.timeLeft / 20;
				int minutesLeft = secondsLeft / 60;
				secondsLeft = secondsLeft % 60;
				String timeLeft = minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2 - 1, 29, 0x000000);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2, 30, 0xffffff);
	
				
				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();
				
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).score + "", i / 2 - 7, 1, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).kills + "", i / 2 - 7, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).deaths + "", i / 2 - 7, 17, 0x000000);
			}
			for(int n = 0; n < killMessages.size(); n++)
			{
				KillMessage killMessage = killMessages.get(n);
				mc.fontRenderer.drawString("\u00a7" + killMessage.killerName + "     " + "\u00a7" + killMessage.killedName, i - mc.fontRenderer.getStringWidth(killMessage.killerName + "     " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 0xffffff);
			}
						
			//Draw icons indicated weapons used
			RenderHelper.enableGUIStandardItemLighting();
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);	
			for(int n = 0; n < killMessages.size(); n++)
			{
				KillMessage killMessage = killMessages.get(n);
				drawSlotInventory(mc.fontRenderer, new ItemStack(killMessage.weapon.item), i - mc.fontRenderer.getStringWidth("     " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
			}
			GL11.glDisable(3042 /*GL_BLEND*/);
			RenderHelper.disableStandardItemLighting();
			
			//Off-hand weapon graphics
			mc.renderEngine.bindTexture(offHand);
			
			ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
			PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
			
			if(currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).type.oneHanded)
			{
				for(int n = 0; n < 9; n++)
				{
					if(data.offHandGunSlot == n + 1)
					{
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 32D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 32D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.draw();
					}
					else if(data.isValidOffHandWeapon(mc.thePlayer, n + 1))
					{					
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 0D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 0D / 64D, 0D / 32D);
						tessellator.draw();
					}
				}
			}
			
			//DEBUG vehicles
			if(FlansMod.DEBUG && mc.thePlayer.ridingEntity instanceof EntitySeat)
			{
				EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
				mc.fontRenderer.drawString("MotionX : " + ent.motionX, 2, 2, 0xffffff);
				mc.fontRenderer.drawString("MotionY : " + ent.motionY, 2, 12, 0xffffff);
				mc.fontRenderer.drawString("MotionZ : " + ent.motionZ, 2, 22, 0xffffff);
				mc.fontRenderer.drawString("Throttle : " + ent.throttle, 2, 32, 0xffffff);

			}
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
			renderTickEnd(Minecraft.getMinecraft());
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
			
	public void clientTickStart(Minecraft minecraft)
	{ /* Client side only */
			
	}

	public void clientTickEnd(Minecraft minecraft)
	{ /* Client side only */
		for(int i = 0; i < killMessages.size(); i++)
		{
			killMessages.get(i).timer--;
			if(killMessages.get(i).timer == 0)
			{
				killMessages.remove(i);
			}
		}
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
	}

	public void renderTickEnd(Minecraft mc)
	{
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();
		
		if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(FlansModClient.currentScope.getZoomOverlay()));

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
	
	private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
	}
		
	public static void addKillMessage(boolean headshot, InfoType infoType, String killer, String killed)
	{
		for(KillMessage killMessage : killMessages)
		{
			killMessage.line++;
			if(killMessage.line > 10)
				killMessage.timer = 0;
		}
		killMessages.add(new KillMessage(headshot, infoType, killer, killed));
	}
	
	private static RenderItem itemRenderer = new RenderItem();
	private static List<KillMessage> killMessages = new ArrayList<KillMessage>();
	
	private static class KillMessage
	{
		public KillMessage(boolean head, InfoType infoType, String killer, String killed)
		{
			headshot = head;
			killerName = killer;
			killedName = killed;
			weapon = infoType;
			line = 0;
			timer = 200;
		}
		
		public String killerName;
		public String killedName;
		public InfoType weapon;
		public int timer;
		public int line;
		public boolean headshot;
	}
}
