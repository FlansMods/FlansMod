package co.uk.flansmods.client;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.common.FlansMod;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;

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
	public void onGuiClosed()
    {
		mc.mouseHelper.ungrabMouseCursor();
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

		if(!leftMouseHeld&& Mouse.isButtonDown(0)) //Left mouse
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
		if(i == mc.gameSettings.keyBindCommand.keyCode)
		{
			mc.displayGuiScreen(new GuiChat("/"));
		}
		if(i == KeyInputHandler.debugKey.keyCode)
		{
			FlansMod.DEBUG = !FlansMod.DEBUG;
		}
		if(i == KeyInputHandler.reloadModelsKey.keyCode)
		{
			FlansModClient.reloadModels();
		}
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
			if(Keyboard.isKeyDown(KeyInputHandler.leftRollKey.keyCode))
			{
				plane.pressKey(11, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.rightRollKey.keyCode))
			{
				plane.pressKey(12, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.gearKey.keyCode))
			{
				plane.pressKey(13, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.doorKey.keyCode))
			{
				plane.pressKey(14, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.wingKey.keyCode))
			{
				plane.pressKey(15, player);
			}				
			if(Keyboard.isKeyDown(KeyInputHandler.trimKey.keyCode))
			{
				plane.pressKey(16, player);
			}				
	
		}
		else
		{
            mc.displayGuiScreen(null);
			return;
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
