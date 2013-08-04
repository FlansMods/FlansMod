package co.uk.flansmods.client;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import co.uk.flansmods.common.EntityPlane;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;

public class GuiPlaneController extends GuiScreen 
{
	private EntityPlane plane;
	
	public GuiPlaneController(EntityPlane thePlane)
	{
		super();
		plane = thePlane;
	}
	
	@Override
	public void onGuiClosed()
    {
		//mc.setIngameNotInFocus();
		mc.mouseHelper.ungrabMouseCursor();
		//mc.renderViewEntity = mc.thePlayer;
    }
	
	@Override
    public void handleMouseInput()
    {
        int k = Mouse.getEventButton();
		EntityPlayer player = (EntityPlayer)plane.riddenByEntity;
		if(player != mc.thePlayer)
		{
			mc.displayGuiScreen(null);
			return;
		}

		if(k == 0) //Left mouse
		{
			plane.pressKey(9, player); //Shoot
		}
		if(k == 1) //Right mouse
		{
			plane.pressKey(8, player); //Bomb
		}
		int l = Mouse.getDX();
		int m = Mouse.getDY();
		
		plane.onMouseMoved(l, m);
    }
	
	protected void keyTyped(char c, int i)
    {
		if(i == 1)
		{
			//mc.mouseHelper.ungrabMouseCursor();
			//mc.setIngameNotInFocus();
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
		}
		if(i == 66)
		{
			mc.gameSettings.smoothCamera = !mc.gameSettings.smoothCamera;
		}
		if(i == mc.gameSettings.keyBindInventory.keyCode)
		{
			mc.displayGuiScreen(new GuiInventory(mc.thePlayer));
		}
		if(i == mc.gameSettings.keyBindDrop.keyCode)
		{
			//mc.thePlayer.dropCurrentItem();
		}
		if(i == mc.gameSettings.keyBindChat.keyCode)
		{
			mc.displayGuiScreen(new GuiChat());
		}
    }
	
    public void handleInput()
    {
		EntityPlayer player = (EntityPlayer)plane.riddenByEntity;
		if(player != mc.thePlayer)
		{
			mc.displayGuiScreen(null);
			return;
		}
		if(!Mouse.isGrabbed())
		{
			mc.mouseHelper.grabMouseCursor();
		}
        for(; Mouse.next(); handleMouseInput()) { }
        for(; Keyboard.next(); handleKeyboardInput()) { }
		if(plane != null && !plane.isDead && plane.riddenByEntity != null && plane.riddenByEntity instanceof EntityPlayer)
		{
			if(Keyboard.isKeyDown(KeyInputHandler.accelerateKey.keyCode))
			{
				plane.pressKey(0, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.decelerateKey.keyCode))
			{
				plane.pressKey(1, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.leftKey.keyCode))
			{
				plane.pressKey(2, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.rightKey.keyCode))
			{
				plane.pressKey(3, player);
			}	
			if(Keyboard.isKeyDown(KeyInputHandler.upKey.keyCode))
			{
				plane.pressKey(4, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.downKey.keyCode))
			{
				plane.pressKey(5, player);
			}	
			if(Keyboard.isKeyDown(KeyInputHandler.exitKey.keyCode))
			{
				plane.pressKey(6, player);
			}	
			if(Keyboard.isKeyDown(KeyInputHandler.inventoryKey.keyCode))
			{
				plane.pressKey(7, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.bombKey.keyCode))
			{
				plane.pressKey(8, player);
			}
			if(Keyboard.isKeyDown(KeyInputHandler.gunKey.keyCode))
			{
				plane.pressKey(9, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.controlSwitchKey.keyCode))
			{
				plane.pressKey(10, player);
			}				
	
		}
		else
		{
            mc.displayGuiScreen(null);
			return;
		}
    }
	
	public void drawBackground(int i)
    {
		//Plane gauges overlay
    }

    public boolean doesGuiPauseGame()
    {
        return false;
    }
}
