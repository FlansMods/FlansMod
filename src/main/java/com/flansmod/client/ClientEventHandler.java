package com.flansmod.client;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderItemInFrameEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.InstantBulletRenderer;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;

/**
 * All handled events for the client should go through here and be passed on. Makes it easier to see which events are being handled by the mod
 */
public class ClientEventHandler
{
	private KeyInputHandler keyInputHandler = new KeyInputHandler();
	private ClientRenderHooks renderHooks = new ClientRenderHooks();
	
	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
			case START:
			{
				RenderGun.smoothing = event.renderTickTime;
				FlansModClient.UpdateCameraZoom(event.renderTickTime);
				renderHooks.SetPartialTick(event.renderTickTime);
				break;
			}
			case END:
			{
				
				break;
			}
		}
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
			case START:
			{
				//Handle all packets received since last tick
				FlansMod.getPacketHandler().handleClientPackets();
				FlansModClient.UpdateFlashlights(Minecraft.getMinecraft());
				break;
			}
			case END:
			{
				InstantBulletRenderer.UpdateAllTrails();
				renderHooks.update();
				RenderFlag.angle += 2F;
				FlansModClient.tick();
				
				break;
			}
		}
	}
	
	@SubscribeEvent
	public void chatMessage(ClientChatReceivedEvent event)
	{
		if(event.getMessage().getUnformattedText().equals("#flansmod"))
		{
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void CheckForOffHandWeaponSwitch(MouseEvent event)
	{
		EntityPlayer player = Minecraft.getMinecraft().player;
		if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			if(((ItemGun)player.getHeldItemMainhand().getItem()).GetType().oneHanded &&
					Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) && Math.abs(event.getDwheel()) > 0)
				event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void CheckKeyInput(KeyInputEvent event)
	{
		keyInputHandler.CheckKeyInput(event);
	}
	
	@SubscribeEvent
	public void renderWorld(RenderWorldLastEvent event)
	{
		InstantBulletRenderer.RenderAllTrails(event.getPartialTicks());
	}
	
	// ----------------------------------------
	// Lots of events for the ClientRenderHooks
	// ----------------------------------------
	@SubscribeEvent
	public void renderItemFrame(RenderItemInFrameEvent event)
	{
		renderHooks.renderItemFrame(event);
	}
	
	@SubscribeEvent
	public void renderHeldItem(RenderSpecificHandEvent event)
	{
		renderHooks.renderHeldItem(event);
	}
	
	@SubscribeEvent
	public void renderThirdPersonWeapons(RenderLivingEvent.Pre event)
	{
		renderHooks.renderThirdPersonWeapons(event);
	}
	
	@SubscribeEvent
	public void renderPlayer(RenderPlayerEvent.Pre event)
	{
		renderHooks.renderPlayer(event);
	}
	
	@SubscribeEvent
	public void cameraSetup(CameraSetup event)
	{
		renderHooks.cameraSetup(event);
	}
	
	@SubscribeEvent
	public void ModifyHUD(RenderGameOverlayEvent event)
	{
		renderHooks.ModifyHUD(event);
	}
}
