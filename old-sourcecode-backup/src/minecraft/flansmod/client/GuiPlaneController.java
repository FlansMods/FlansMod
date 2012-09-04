package flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumOptions;
import net.minecraft.src.GuiChat;
import net.minecraft.src.GuiInventory;
import net.minecraft.src.GuiScreen;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;

import flansmod.common.EntityPlane;

public class GuiPlaneController extends GuiScreen
{
    public GuiPlaneController(EntityPlane entityplane)
    {
		super();
		plane = entityplane;
		FMLClientHandler.instance().getClient().setIngameFocus();
		guiWasHidden = FMLClientHandler.instance().getClient().gameSettings.hideGUI;
		FMLClientHandler.instance().getClient().gameSettings.hideGUI = true;
    }
		
	public void onGuiClosed()
    {
		mc.setIngameNotInFocus();
		mc.mouseHelper.ungrabMouseCursor();
		mc.gameSettings.hideGUI = guiWasHidden;
    }
		
	protected void mouseMovedOrUp(int i, int j, int button)
    {
		if(button == 1) //Right mouse
		{
			plane.pressKey(8); //Bomb
		}
		int l = Mouse.getDX();
		int m = Mouse.getDY();
		if(l > 100)
			l = 100;
		if(l < -100)
			l = -100;
		if(m > 100)
			m = 100;
		if(m < -100)
			m = -100;
		double pitchModifier = m > 0 ? plane.type.lookUpModifier : plane.type.lookDownModifier;
		if(plane.tailHealth > 0 && plane.propSpeed > plane.type.takeOffSpeed)
		{
			plane.velocityPitch -= pitchModifier * (plane.propSpeed - plane.type.takeOffSpeed) * 0.001F * m;
			plane.flapsPitchLeft += 1F * m;
			plane.flapsPitchRight += 1F * m;
		}
		double rollModifier = l > 0 ? plane.type.lookUpModifier : plane.type.lookDownModifier;
		if(plane.tailHealth > 0 && plane.propSpeed > plane.type.takeOffSpeed)
		{
			plane.velocityRoll -= rollModifier * (plane.propSpeed - plane.type.takeOffSpeed) * 0.001F * l;
			plane.flapsPitchLeft += 1F * l;
			plane.flapsPitchRight -= 1F * l;
		}
    }
		
    public void handleInput()
    {
		if(FlansModClient.controlMode != 1)
		{
			mc.thePlayer.closeScreen();
			return;
		}
		if(!Mouse.isGrabbed())
		{
			mc.mouseHelper.grabMouseCursor();
		}
		if(FlansModClient.controlModeSwitchTimer > 0)
			FlansModClient.controlModeSwitchTimer--;
		if(Mouse.isButtonDown(0)) //Left mouse
		{
			plane.pressKey(9); //Shoot
		}
		if(Mouse.isButtonDown(1)) //Right mouse
		{
			plane.pressKey(9); //Bomb
		}
        for(; Mouse.next(); handleMouseInput()) { }
        for(; Keyboard.next(); handleKeyboardInput()) { }
		if(plane != null && !plane.isDead && plane.riddenByEntity != null && plane.riddenByEntity instanceof EntityPlayer && FlansModClient.controlMode == 1)
		{
			if(Keyboard.isKeyDown(FlansModClient.accelerateKey))
			{
				plane.pressKey(0);
			}
			if(Keyboard.isKeyDown(FlansModClient.decelerateKey))
			{
				plane.pressKey(1);
			}
			if(Keyboard.isKeyDown(FlansModClient.inventoryKey))
			{
				plane.pressKey(7);
			}
			if(Keyboard.isKeyDown(FlansModClient.exitKey))
			{
				plane.pressKey(6);
			}	
			if(Keyboard.isKeyDown(FlansModClient.upKey))
			{
				//Not used
			}
			if(Keyboard.isKeyDown(FlansModClient.downKey))
			{
				//Not used
			}	
			if(Keyboard.isKeyDown(FlansModClient.bombKey))
			{
				plane.pressKey(8);
			}
			if(Keyboard.isKeyDown(FlansModClient.gunKey))
			{
				plane.pressKey(9);
			}				
			if(Keyboard.isKeyDown(FlansModClient.leftKey))
			{
				plane.pressKey(2);
			}
			if(Keyboard.isKeyDown(FlansModClient.rightKey))
			{
				plane.pressKey(3);
			}		
			if(Keyboard.isKeyDown(FlansModClient.controlSwitchKey))
			{
				FlansModClient.setControlMode(0);
				mc.thePlayer.closeScreen();
				return;
			}
		}
		else
		{
            mc.thePlayer.closeScreen();
			return;
		}
	}
	
		
	public void handleKeyboardInput()
	{
	    if(Keyboard.getEventKeyState())
        {
            if(Keyboard.getEventKey() == 87)
            {
                mc.toggleFullscreen();
                return;
            }
			//Stuff from Minecraft that doesnt get called when in a GUI, but which should in this case
			if (Keyboard.getEventKey() == 1)
			{
				mc.thePlayer.closeScreen();
				mc.displayInGameMenu();
			}

			if(Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61))
				mc.renderEngine.refreshTextures();

			if(Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61))
			{
				boolean var6 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
				mc.gameSettings.setOptionValue(EnumOptions.RENDER_DISTANCE, var6 ? -1 : 1);
			}

			if(Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61))
				mc.renderGlobal.loadRenderers();

			if(Keyboard.getEventKey() == 59)
				mc.gameSettings.hideGUI = !mc.gameSettings.hideGUI;
				
			if(Keyboard.getEventKey() == 61)
				mc.gameSettings.showDebugInfo = !mc.gameSettings.showDebugInfo;

			if(Keyboard.getEventKey() == 63)
			{
				++mc.gameSettings.thirdPersonView;
				if (mc.gameSettings.thirdPersonView > 2)
				{
					mc.gameSettings.thirdPersonView = 0;
				}
			}

			if(Keyboard.getEventKey() == 66)
				mc.gameSettings.smoothCamera = !mc.gameSettings.smoothCamera;
				
			for(int i = 0; i < 9; ++i)
			{
				if(Keyboard.getEventKey() == 2 + i)
				{
					mc.thePlayer.inventory.currentItem = i;
				}
			}
			
			if(Keyboard.getEventKey() == mc.gameSettings.keyBindInventory.keyCode)
            {
                mc.displayGuiScreen(new GuiInventory(mc.thePlayer));
            }

            if(Keyboard.getEventKey() == mc.gameSettings.keyBindDrop.keyCode)
            {
                mc.thePlayer.dropOneItem();
            }

            if(Keyboard.getEventKey() == mc.gameSettings.keyBindChat.keyCode)
            {
                mc.displayGuiScreen(new GuiChat());
            }
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
	
	private EntityPlane plane;
	private boolean guiWasHidden = false;
}