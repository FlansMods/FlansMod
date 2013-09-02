package co.uk.flansmods.client.model;

import java.util.HashMap;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import net.minecraft.client.model.ModelBase;

public class ModelDriveable extends ModelBase 
{
	public static final float pi = 3.14159265F;
	public static final float tau = 2 * pi;
	
	public HashMap<String, ModelRendererTurbo[][]> gunModels = new HashMap<String, ModelRendererTurbo[][]>();
    public ModelRendererTurbo bodyModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];
	
	/** For rendering a specific entity */
	public void render(EntityDriveable driveable, float f1)
	{
	}
	   
	/** For rendering from GUIs */
	public void render()
	{
		renderPart(bodyModel);
		renderPart(bodyDoorCloseModel);
		for(ModelRendererTurbo[][] gun : gunModels.values())
			for(ModelRendererTurbo[] gunPart : gun)
				renderPart(gunPart);
	}
	
	/** Renders the specified parts */
	public void renderPart(ModelRendererTurbo[] part)
	{
		for(ModelRendererTurbo bit : part)
		{
			bit.render(0.0625F);
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
    		part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
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
}
