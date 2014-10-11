package com.flansmod.client.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.KeyInputHandler;
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
			mc.renderViewEntity = (plane.getCamera() == null ? mc.thePlayer : plane.getCamera());
	}
	
	@Override
	public void onGuiClosed()
    {
		mc.mouseHelper.ungrabMouseCursor();
		mc.renderViewEntity = mc.thePlayer;
    }
	
	@Override
    public void handleMouseInput()
    {
		EntityPlayer player = (EntityPlayer)plane.getControllingEntity();
		if(player != mc.thePlayer)
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
			plane.pressKey(8, player);
		
		if(!leftMouseHeld&& Mouse.isButtonDown(0)) //Left mouse, for MGs. Is a holding thing
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
    }
	
	@Override
	protected void keyTyped(char c, int i)
    {
		if(i == 1)
		{
            mc.displayGuiScreen(null);
			mc.displayInGameMenu();		
		}
		if(i == 59)
		{
			mc.gameSettings.hideGUI = !mc.gameSettings.hideGUI;
		}
		if(i == 61)
		{
			mc.gameSettings.showDebugInfo = !mc.gameSettings.showDebugInfo;
		}
		if(i == 63)
		{
			mc.gameSettings.thirdPersonView = (mc.gameSettings.thirdPersonView + 1) % 3;
			if(mc.gameSettings.thirdPersonView == 1)
				mc.renderViewEntity = (plane.getCamera() == null ? mc.thePlayer : plane.getCamera());
			else mc.renderViewEntity = mc.thePlayer;
		}
		if(i == 66)
		{
			mc.gameSettings.smoothCamera = !mc.gameSettings.smoothCamera;
		}
		if(i == mc.gameSettings.keyBindInventory.getKeyCode())
		{
			mc.displayGuiScreen(new GuiInventory(mc.thePlayer));
		}
		if(i == mc.gameSettings.keyBindDrop.getKeyCode())
		{
			//mc.thePlayer.dropCurrentItem();
		}
		if(i == mc.gameSettings.keyBindChat.getKeyCode())
		{
			mc.displayGuiScreen(new GuiChat());
		}
		if(i == mc.gameSettings.keyBindCommand.getKeyCode())
		{
			mc.displayGuiScreen(new GuiChat("/"));
		}
		if(i == KeyInputHandler.debugKey.getKeyCode())
		{
			FlansMod.DEBUG = !FlansMod.DEBUG;
		}
		if(i == KeyInputHandler.reloadModelsKey.getKeyCode())
		{
			FlansModClient.reloadModels(false);
		}
    }
	
	@Override
	public void updateScreen()
	{
		if(mc.gameSettings.thirdPersonView == 1)
			mc.renderViewEntity = (plane.getCamera() == null ? mc.thePlayer : plane.getCamera());
		else mc.renderViewEntity = mc.thePlayer;
	}
	
    @Override
	public void handleInput()
    {
		EntityPlayer player = (EntityPlayer)plane.getControllingEntity();
		if(player != mc.thePlayer)
		{
			mc.displayGuiScreen(null);
			return;
		}
		if(!Mouse.isGrabbed())
		{
			mc.mouseHelper.grabMouseCursor();
		}
		handleMouseInput();
        for(; Keyboard.next(); handleKeyboardInput()) { }
        
		int l = Mouse.getDX();
		int m = Mouse.getDY();
		
		plane.onMouseMoved(l, m);
        
		if(plane != null && !plane.isDead() && plane.getControllingEntity() != null && plane.getControllingEntity() instanceof EntityPlayer)
		{
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindForward.getKeyCode()))//KeyInputHandler.accelerateKey.getKeyCode()))
			{
				plane.pressKey(0, player);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindBack.getKeyCode()))//KeyInputHandler.decelerateKey.getKeyCode()))
			{
				plane.pressKey(1, player);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindLeft.getKeyCode()))//KeyInputHandler.leftKey.getKeyCode()))
			{
				plane.pressKey(2, player);
			}
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindRight.getKeyCode()))//KeyInputHandler.rightKey.getKeyCode()))
			{
				plane.pressKey(3, player);
			}	
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindJump.getKeyCode()))//KeyInputHandler.upKey.getKeyCode()))
			{
				plane.pressKey(4, player);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.downKey.getKeyCode()))
			{
				plane.pressKey(5, player);
			}	
			if(FlansMod.proxy.keyDown(mc.gameSettings.keyBindSneak.getKeyCode()))//KeyInputHandler.exitKey.getKeyCode()))
			{
				plane.pressKey(6, player);
			}	
			if(FlansMod.proxy.keyDown(KeyInputHandler.inventoryKey.getKeyCode()))
			{
				plane.pressKey(7, player);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.bombKey.getKeyCode()))
			{
				plane.pressKey(8, player);
			}
			if(FlansMod.proxy.keyDown(KeyInputHandler.gunKey.getKeyCode()))
			{
				plane.pressKey(9, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.controlSwitchKey.getKeyCode()))
			{
				plane.pressKey(10, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.leftRollKey.getKeyCode()))
			{
				plane.pressKey(11, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.rightRollKey.getKeyCode()))
			{
				plane.pressKey(12, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.gearKey.getKeyCode()))
			{
				plane.pressKey(13, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.doorKey.getKeyCode()))
			{
				plane.pressKey(14, player);
			}				
			if(FlansMod.proxy.keyDown(KeyInputHandler.modeKey.getKeyCode()))
			{
				plane.pressKey(15, player);
			}				
			//if(FlansMod.proxy.keyDown(KeyInputHandler.trimKey.getKeyCode()))
			//{
			//	plane.pressKey(16, player);
			//}				
	
		}
		else
		{
            mc.displayGuiScreen(null);
        }
    }
	   
	@Override
	public void drawBackground(int i)
    {
		//Plane gauges overlay
    }

    @Override
	public boolean doesGuiPauseGame()
    {
        return false;
    }
}
