package com.flansmod.client.gui.teams;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.RewardBox;

import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class GuiOpenRewardBox extends GuiTeamsBase 
{
	private static enum EnumPageState
	{
		SPINNING,
		READY_TO_SLOW_DOWN,
		SLOWING_DOWN,
		STOPPED,
	}
	
	/** The background image */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/OpenCrates.png");	
	private static final int WIDTH = 196, HEIGHT = 200;
	private static final int WAITING_FOR_SERVER = -1;
	private static int spinTime = 40, slowdownTime = 40;
	private float spinSpeed = 0.555555555f;
	
	private ArrayList<Paintjob> options = new ArrayList<Paintjob>(); 
	private int target = WAITING_FOR_SERVER;
	private EnumPageState state = EnumPageState.SPINNING;
	private int timeLeftInState = spinTime;
	private float spinner = 0.0f;
	
	public void SetTarget(Paintjob paint)
	{
		for(int i = 0; i < options.size(); i++)
		{
			if(options.get(i) == paint)
			{
				target = i;
				return;
			}
		}
		FlansMod.Assert(false, "Could not find paintjob we just unlocked!");
	}

	public GuiOpenRewardBox(RewardBox rewardBox)
	{
		super();
		state = EnumPageState.SPINNING;
		timeLeftInState = spinTime;
		target = WAITING_FOR_SERVER;
		spinSpeed = InitialVelocity();
		
		for(Paintjob paintjob : rewardBox.paintjobs)
		{
			options.add(paintjob);
		}
	}
	
	@Override 
	public void updateScreen()
	{
		super.updateScreen();
		
		timeLeftInState--;
		
		switch(state)
		{
			case SPINNING:
			{
				SimulateSpinner();
				// Make sure we have our target from the server before trying to spin down on to it
				if(timeLeftInState <= 0 && target != WAITING_FOR_SERVER)
				{
					SwitchToState(EnumPageState.READY_TO_SLOW_DOWN);
				}
				break;
			}
			case READY_TO_SLOW_DOWN:
			{
				SimulateSpinner();
				float difference = MathHelper.abs(spinner - target);
				if(difference < 1.0f)
				{
					// We're here (ish). Fix the position and then spin round one last time, slowing down as we go.
					spinner = target;
					SwitchToState(EnumPageState.SLOWING_DOWN);
				}
				break;
			}
			case SLOWING_DOWN:
			{
				spinSpeed += Acceleration();
				SimulateSpinner();
				break;
			}
			case STOPPED:
			{
				spinner = target;
				break;
			}

			default:
				break;
		}
	}
	
	private void SimulateSpinner()
	{
		spinner += spinSpeed;
		if(spinner > options.size())
		{
			spinner -= options.size();
		}
	}
	private float InitialVelocity() { return (2.0f / (float)slowdownTime) * options.size(); }
	private float Acceleration() { return -(InitialVelocity() * InitialVelocity()) / (2 * options.size()); }
	
	private void SwitchToState(EnumPageState newState)
	{
		state = newState;
	}
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		
		int textureX = 512;
		int textureY = 256;
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log("Problem in landing page!");
			return;
		}
		
		//Draw the background
		drawModalRectWithCustomSizedTexture(guiOriginX, guiOriginY, 0, 0, WIDTH, HEIGHT, textureX, textureY);
				
		// Draw text
		drawCenteredString(fontRendererObj, "Opening a Crate", guiOriginX + 98, guiOriginY + 12, 0xffffff);
		
		int pixelOffset = ModuloHelper.modulo(MathHelper.floor_float(spinner * 18.0f), 18);
		
		drawModalRectWithCustomSizedTexture(guiOriginX + 9, guiOriginY + 101, 239 + pixelOffset, 101, 162, 18, textureX, textureY);
		
		for(int n = 0; n < 10; n++)
		{
			int index = MathHelper.floor_float(spinner) - 4 + n;
			Paintjob paintjob = options.get(ModuloHelper.modulo(index, options.size()));
			
			ItemStack stack = new ItemStack(paintjob.parent.getItem(), 1, paintjob.ID);
			drawSlotInventory(stack, guiOriginX + 18 - 18 + pixelOffset, guiOriginY + 102 - 18);
		}
		
		mc.renderEngine.bindTexture(texture);
		drawModalRectWithCustomSizedTexture(guiOriginX + 12, guiOriginY + 93, 12, 93, 172, 34, textureX, textureY);
		
		super.drawScreen(i, j, f);
	}	
}
