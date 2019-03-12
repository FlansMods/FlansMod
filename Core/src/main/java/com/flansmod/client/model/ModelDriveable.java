package com.flansmod.client.model;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;

public class ModelDriveable extends ModelBase
{
	public static final float pi = 3.14159265F;
	public static final float tau = 2 * pi;
	
	public HashMap<String, ModelRendererTurbo[][]> gunModels = new HashMap<>();
	public ModelRendererTurbo bodyModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];
	
	/**
	 * Set to true to use the old rotation order (ZYX) rather than (YZX)
	 */
	public boolean oldRotateOrder = false;
	
	/**
	 * For rendering a specific entity
	 */
	public void render(EntityDriveable driveable, float f1)
	{
	}

	/**
	 * For rendering from GUIs
	 */
	public void render(DriveableType type)
	{
		renderPart(bodyModel);
		renderPart(bodyDoorCloseModel);
		for(ModelRendererTurbo[][] gun : gunModels.values())
			for(ModelRendererTurbo[] gunPart : gun)
				renderPart(gunPart);
	}
	
	/**
	 * Renders the specified parts
	 */
	public void renderPart(ModelRendererTurbo[] part)
	{
		for(ModelRendererTurbo bit : part)
		{
			bit.render(0.0625F, oldRotateOrder);
		}
	}
	
	public void registerGunModel(String name, ModelRendererTurbo[][] gunModel)
	{
		gunModels.put(name, gunModel);
	}
	
	protected void flip(ModelRendererTurbo[] model)
	{
		for(ModelRendererTurbo part : model)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
		}
	}

	public void flipAll()
	{
		flip(bodyModel);
		flip(bodyDoorOpenModel);
		flip(bodyDoorCloseModel);
		for(ModelRendererTurbo[][] modsOfMods : gunModels.values())
		{
			for(ModelRendererTurbo[] mods : modsOfMods)
			{
				flip(mods);
			}
		}
	}
	
	protected void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	
	public void translateAll(float x, float y, float z)
	{
		translate(bodyModel, x, y, z);
		translate(bodyDoorOpenModel, x, y, z);
		translate(bodyDoorCloseModel, x, y, z);
		for(ModelRendererTurbo[][] modsOfMods : gunModels.values())
		{
			for(ModelRendererTurbo[] mods : modsOfMods)
			{
				translate(mods, x, y, z);
			}
		}
	}
	
	public void translateAll(int x, int y, int z)
	{
		translateAll((float)x, (float)y, (float)z);
	}
}
