package com.flansmod.client;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.driveables.EntityDriveable;

//TODO : Implement this!
public class MovingSoundDriveable extends MovingSound 
{
	private final EntityDriveable driveable;
	private float field_147669_l = 0.0F;
	
	public MovingSoundDriveable(ResourceLocation sound, EntityDriveable driveable)
	{
	    super(sound);
	    this.driveable = driveable;
	    repeat = true;
	    //Repeat delay?
	    field_147665_h = 0;
	}
	
	/**
	 * Updates the JList with a new model.
	 */
	public void update()
	{
	    if(driveable.isDead)
	    {
	        donePlaying = true;
	    }
	    else
	    {
	        xPosF = (float)driveable.posX;
	        yPosF = (float)driveable.posY;
	        zPosF = (float)driveable.posZ;
	        float f = MathHelper.sqrt_double(driveable.motionX * driveable.motionX + driveable.motionZ * driveable.motionZ);
	
	        if ((double)f >= 0.01D)
	        {
	            field_147669_l = MathHelper.clamp_float(field_147669_l + 0.0025F, 0.0F, 1.0F);
	            volume = 0.0F + MathHelper.clamp_float(f, 0.0F, 0.5F) * 0.7F;
	        }
	        else
	        {
	            field_147669_l = 0.0F;
	            volume = 0.0F;
	        }
	    }
	}
	}
