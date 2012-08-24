package flansmod.client;

import flansmod.common.CollisionBox;
import net.minecraft.src.ModelRendererTurbo;

public class ModelPanzer extends ModelVehicle
{
    public ModelPanzer()
    {
		int textureX = 256;
		int textureY = 256;
	
        bodyModel = new ModelRendererTurbo[4];	
	    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);
	    bodyModel[2] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
	
		bodyModel[0].addBox(-40F, -20F, -24F, 80, 20, 48, 0.0F);		//Tank Body
        bodyModel[1].addTrapezoid(-40F, -32F, -24F, 72, 12, 48, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);		//Sloped body
		bodyModel[2].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Left Panel
		bodyModel[3].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Right Panel
		bodyModel[3].rotateAngleY = 3.1415926535F;
		
		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 0, 132, textureX, textureY);
		turretModel[1] = new ModelRendererTurbo(this, 128, 132, textureX, textureY);
		turretModel[0].addTrapezoid(-16F, -44F, -16F, 32, 12, 32, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);	
		turretModel[1].flip = true;
		turretModel[1].addTrapezoid(-15.5F, -44F, -15.5F, 31, 9, 31, 0.0F, -1.5F, ModelRendererTurbo.MR_TOP);	
		
		barrelModel = new ModelRendererTurbo[1];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 176, textureX, textureY);
		barrelModel[0].addBox(-2F, -2F, -2F, 60, 4, 4, 0.0F);
		barrelModel[0].setRotationPoint(15F, -38F, 0F);	
		
		//This should be defined even when not used.
		gunModel = new ModelRendererTurbo[0];
		ammoModel = new ModelRendererTurbo[0];
		leftFrontWheelModel = new ModelRendererTurbo[0];	
		leftBackWheelModel = new ModelRendererTurbo[0];	
		rightFrontWheelModel = new ModelRendererTurbo[0];	
		rightBackWheelModel = new ModelRendererTurbo[0];
		
		flipAll(); //For old models
		translateAll(-8);
    }
}
