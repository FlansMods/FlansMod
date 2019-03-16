package com.flansmod.client.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.handlers.KeyInputHandler;
import com.flansmod.common.FlansMod;

public class GuiDriveableController extends GuiScreen
{
	private IControllable plane;
	private boolean leftMouseHeld;
	private boolean rightMouseHeld;
	
	public GuiDriveableController(IControllable thePlane)
	{
		super();
		plane = thePlane;
	}
	
	@Override
	public void initGui()
	{
		if(mc.gameSettings.thirdPersonView == 1)
			mc.setRenderViewEntity((plane.getCamera() == null ? mc.player : plane.getCamera()));
	}
	
	@Override
	public void onGuiClosed()
	{
		mc.mouseHelper.ungrabMouseCursor();
		mc.setRenderViewEntity(mc.player);
	}
	
	@Override
	public void handleMouseInput()
	{
		EntityPlayer player = (EntityPlayer)plane.getControllingEntity();
		if(player != mc.player)
		{
			mc.displayGuiScreen(null);
			return;
		}
		
		int dWheel = Mouse.getDWheel();
		if(dWheel != 0)
		{
			player.inventory.changeCurrentItem(dWheel);
		}
		
		//Right mouse. Fires shells, drops bombs. Is not a holding thing
		if(Mouse.isButtonDown(1))
			plane.pressKey(8, player, true);
		
		if(!leftMouseHeld && Mouse.isButtonDown(0)) //Left mouse, for MGs. Is a holding thing
		{
			leftMouseHeld = true;
			plane.updateKeyHeldState(9, true);
		}
		if(leftMouseHeld && !Mouse.isButtonDown(0))
		{
			leftMouseHeld = false;
			plane.updateKeyHeldState(9, false);
		}
		if(!rightMouseHeld && Mouse.isButtonDown(1)) //Right mouse
		{
			rightMouseHeld = true;
			plane.updateKeyHeldState(8, true);
		}
		if(rightMouseHeld && !Mouse.isButtonDown(1))
		{
			rightMouseHeld = false;
			plane.updateKeyHeldState(8, false);
		}
		
		MinecraftForge.EVENT_BUS.post(new InputEvent.MouseInputEvent());
	}
	
	@Override
	protected void keyTyped(char c, int i)
	{

		
		if(i == 63)
		{
			mc.gameSettings.thirdPersonView = (mc.gameSettings.thirdPersonView + 1) % 3;
			if(mc.gameSettings.thirdPersonView == 1)
				mc.setRenderViewEntity((plane.getCamera() == null ? mc.player : plane.getCamera()));
			else mc.setRenderViewEntity(mc.player);
		}
		if(i == KeyInputHandler.debugKey.getKeyCode())
		{
			FlansMod.DEBUG = !FlansMod.DEBUG;
		}
		if(i == KeyInputHandler.reloadModelsKey.getKeyCode())
		{
			FlansModClient.reloadModels(false);
		}
		
		MinecraftForge.EVENT_BUS.post(new InputEvent.KeyInputEvent());
	}
	
	@Override
	public void updateScreen()
	{
		if(mc.gameSettings.thirdPersonView == 1)
			mc.setRenderViewEntity((plane.getCamera() == null ? mc.player : plane.getCamera()));
		else mc.setRenderViewEntity(mc.player);
	}
	
	@Override
	public void handleInput()
	{
		EntityPlayer player = (EntityPlayer)plane.getControllingEntity();
		if(player != mc.player)
		{
			mc.displayGuiScreen(null);
			return;
		}
		if(!Mouse.isGrabbed())
		{
			mc.mouseHelper.grabMouseCursor();
		}
		handleMouseInput();
		
		for(; Keyboard.next(); )
		{
			try
			{
				handleKeyboardInput();
			}
			catch(IOException e)
			{
			}
		}
		
		int l = Mouse.getDX();
		int m = Mouse.getDY();
		
		plane.onMouseMoved(l, m);
		
		if(plane != null && !plane.isDead() && plane.getControllingEntity() != null && plane.getControllingEntity() instanceof EntityPlayer)
		{
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindForward.getKeyCode()))//KeyInputHandler.accelerateKey.getKeyCode()))
			{
				plane.pressKey(0, player, true);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindBack.getKeyCode()))//KeyInputHandler.decelerateKey.getKeyCode()))
			{
				plane.pressKey(1, player, true);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindLeft.getKeyCode()))//KeyInputHandler.leftKey.getKeyCode()))
			{
				plane.pressKey(2, player, true);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindRight.getKeyCode()))//KeyInputHandler.rightKey.getKeyCode()))
			{
				plane.pressKey(3, player, true);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindJump.getKeyCode()))//KeyInputHandler.upKey.getKeyCode()))
			{
				plane.pressKey(4, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.downKey.getKeyCode()))
			{
				plane.pressKey(5, player, true);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindSneak.getKeyCode()))//KeyInputHandler.exitKey.getKeyCode()))
			{
				plane.pressKey(6, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.vehicleMenuKey.getKeyCode()))
			{
				plane.pressKey(7, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.bombKey.getKeyCode()))
			{
				plane.pressKey(8, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.gunKey.getKeyCode()))
			{
				plane.pressKey(9, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.controlSwitchKey.getKeyCode()))
			{
				plane.pressKey(10, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.leftRollKey.getKeyCode()))
			{
				plane.pressKey(11, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.rightRollKey.getKeyCode()))
			{
				plane.pressKey(12, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.gearKey.getKeyCode()))
			{
				plane.pressKey(13, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.doorKey.getKeyCode()))
			{
				plane.pressKey(14, player, true);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.modeKey.getKeyCode()))
			{
				plane.pressKey(15, player, true);
			}
			
		}
		else
		{
			mc.displayGuiScreen(null);
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
