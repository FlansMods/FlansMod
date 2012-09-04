package flansmod.client;

import flansmod.common.CollisionBox;
import flansmod.common.EntityPlane;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRendererTurbo;

//Extensible ModelPlane class for rendering plane models
public class ModelPlane extends ModelBase
{

    public ModelPlane()    
	{
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityPlane plane)
    {
		//Rotating the propeller
		float angle = plane.propAngle;
		for(int i = 0; i < propellerModels.length; i++)
		{	
			if(plane.propBlown.length > i && !plane.propBlown[i])
			{
				int numParts = propellerModels[i].length;
				for(int j = 0; j < numParts; j++)
				{
					//propellerModels[i][j].setPosition(plane.plane.propellerX, plane.type.propellerY, plane.plane.propellerZ * (i % 2 == 0 ? 1 : -1));			//Set the point about which the box rotates, the centre of the propeller
					propellerModels[i][j].rotateAngleX = angle + (j * 2F * 3.1415926535F) / (numParts);
					propellerModels[i][j].render(f5);
				}
			}
		}
		//Rotating the yaw flap
		for(int i = 0; i < yawFlapModel.length; i++)
		{
			if(plane.tailHealth > 0)
			{
				yawFlapModel[i].rotateAngleY = plane.flapsYaw * 3.14159265F / 180F;
				yawFlapModel[i].render(f5);
			}
		}
		//Rotating the left pitch flap
		for(int i = 0; i < pitchFlapLeftModel.length; i++)
		{
			if(plane.tailHealth > 0)
			{
				pitchFlapLeftModel[i].rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				pitchFlapLeftModel[i].render(f5);
			}
		}
		//Rotating the right pitch flap
		for(int i = 0; i < pitchFlapRightModel.length; i++)
		{
			if(plane.tailHealth > 0)
			{
				pitchFlapRightModel[i].rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				pitchFlapRightModel[i].render(f5);
			}
		}
		//Rotating the left wing pitch flap
		for(int i = 0; i < pitchFlapLeftWingModel.length; i++)
		{
			if(plane.leftWingHealth > 0)
			{
				pitchFlapLeftWingModel[i].rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				pitchFlapLeftWingModel[i].render(f5);
			}
		}
		//Rotating the right wing pitch flap
		for(int i = 0; i < pitchFlapRightWingModel.length; i++)
		{
			if(plane.rightWingHealth > 0)
			{
				pitchFlapRightWingModel[i].rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				pitchFlapRightWingModel[i].render(f5);
			}
		}
		//Rendering the body
        for(int i = 0; i < bodyModel.length; i++)
        {
            bodyModel[i].render(f5);
        }
		//Rendering the right wing
        for(int i = 0; i < rightWingModel.length; i++)
        {
			if(plane.rightWingHealth > 0)
				rightWingModel[i].render(f5);
        }
		//Rendering the left wing
        for(int i = 0; i < leftWingModel.length; i++)
        {
			if(plane.leftWingHealth > 0)
				leftWingModel[i].render(f5);
        }	
		//Rendering the top wing
        for(int i = 0; i < topWingModel.length; i++)
        {
			if(plane.rightWingHealth > 0 && plane.leftWingHealth > 0)
				topWingModel[i].render(f5);
        }
		//Rendering the tail
        for(int i = 0; i < tailModel.length; i++)
        {
			if(plane.tailHealth > 0)
				tailModel[i].render(f5);
        }
    }
	
	public void flipAll()
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].doMirror(false, true, true);
			bodyModel[i].setRotationPoint(bodyModel[i].rotationPointX, - bodyModel[i].rotationPointY, - bodyModel[i].rotationPointZ);
		}
		for(int i = 0; i < leftWingModel.length; i++)
		{
			leftWingModel[i].doMirror(false, true, true);
			leftWingModel[i].setRotationPoint(leftWingModel[i].rotationPointX, - leftWingModel[i].rotationPointY, - leftWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < rightWingModel.length; i++)
		{
			rightWingModel[i].doMirror(false, true, true);
			rightWingModel[i].setRotationPoint(rightWingModel[i].rotationPointX, - rightWingModel[i].rotationPointY, - rightWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < topWingModel.length; i++)
		{
			topWingModel[i].doMirror(false, true, true);
			topWingModel[i].setRotationPoint(topWingModel[i].rotationPointX, - topWingModel[i].rotationPointY, - topWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < tailModel.length; i++)
		{
			tailModel[i].doMirror(false, true, true);
			tailModel[i].setRotationPoint(tailModel[i].rotationPointX, - tailModel[i].rotationPointY, - tailModel[i].rotationPointZ);
		}
		for(int i = 0; i < propellerModels.length; i++)
		{
			for(int j = 0; j < propellerModels[i].length; j++)
			{
				propellerModels[i][j].doMirror(false, true, true);
				propellerModels[i][j].setRotationPoint(propellerModels[i][j].rotationPointX, - propellerModels[i][j].rotationPointY, - propellerModels[i][j].rotationPointZ);
			}
		}
		for(int i = 0; i < yawFlapModel.length; i++)
		{
			yawFlapModel[i].doMirror(false, true, true);
			yawFlapModel[i].setRotationPoint(yawFlapModel[i].rotationPointX, - yawFlapModel[i].rotationPointY, - yawFlapModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapLeftModel.length; i++)
		{
			pitchFlapLeftModel[i].doMirror(false, true, true);
			pitchFlapLeftModel[i].setRotationPoint(pitchFlapLeftModel[i].rotationPointX, - pitchFlapLeftModel[i].rotationPointY, - pitchFlapLeftModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapRightModel.length; i++)
		{
			pitchFlapRightModel[i].doMirror(false, true, true);
			pitchFlapRightModel[i].setRotationPoint(pitchFlapRightModel[i].rotationPointX, - pitchFlapRightModel[i].rotationPointY, - pitchFlapRightModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapLeftWingModel.length; i++)
		{
			pitchFlapLeftWingModel[i].doMirror(false, true, true);
			pitchFlapLeftWingModel[i].setRotationPoint(pitchFlapLeftWingModel[i].rotationPointX, - pitchFlapLeftWingModel[i].rotationPointY, - pitchFlapLeftWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapRightWingModel.length; i++)
		{
			pitchFlapRightWingModel[i].doMirror(false, true, true);
			pitchFlapRightWingModel[i].setRotationPoint(pitchFlapRightWingModel[i].rotationPointX, - pitchFlapRightWingModel[i].rotationPointY, - pitchFlapRightWingModel[i].rotationPointZ);
		}
	}	

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bodyModel[];
    public ModelRendererTurbo leftWingModel[];	
    public ModelRendererTurbo rightWingModel[];
    public ModelRendererTurbo topWingModel[];	
	public ModelRendererTurbo tailModel[];	
	public ModelRendererTurbo propellerModels[][]; //Propeller array [numProps][prop blades]
	public ModelRendererTurbo yawFlapModel[];
	public ModelRendererTurbo pitchFlapLeftModel[];
	public ModelRendererTurbo pitchFlapRightModel[];
	public ModelRendererTurbo pitchFlapLeftWingModel[];
	public ModelRendererTurbo pitchFlapRightWingModel[];
}
