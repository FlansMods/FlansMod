package co.uk.flansmods.client.model;

import com.overminddl1.minecraft.libs.NMT.NMTGlobal;
import com.overminddl1.minecraft.libs.NMT.NMTModelRenderer;

public class ModelSherman extends ModelVehicle
{
    public ModelSherman()
    {
		int textureX = 256;
		int textureY = 256;
	
        bodyModel = new NMTModelRenderer[2];	
	    bodyModel[0] = new NMTModelRenderer(this, 0, 0, textureX, textureY);
        bodyModel[1] = new NMTModelRenderer(this, 0, 68, textureX, textureY);

		bodyModel[0].addBox(-40F, -16F, -24F, 80, 20, 48, 0.0F);		//Tank Body
        bodyModel[1].addTrapezoid(-40F, -32F, -24F, 80, 16, 48, 0.0F, -4.0F, NMTGlobal.NMT_DIR_TOP);		//Sloped body
		
		turretModel = new NMTModelRenderer[2];
		turretModel[0] = new NMTModelRenderer(this, 0, 132, textureX, textureY);
		turretModel[1] = new NMTModelRenderer(this, 128, 132, textureX, textureY);
		
		turretModel[0].addTrapezoid(-16F, -44F, -16F, 32, 12, 32, 0.0F, -2.0F, NMTGlobal.NMT_DIR_TOP);	
		turretModel[1].addTrapezoid(-15.5F, -44F, -15.5F, 31, 9, 31, 0.0F, -1.5F, NMTGlobal.NMT_DIR_TOP);	
		turretModel[1].flipFaces();
	
		barrelModel = new NMTModelRenderer[1];
		barrelModel[0] = new NMTModelRenderer(this, 0, 176, textureX, textureY);
		
		barrelModel[0].addBox(-2F, -2F, -2F, 60, 4, 4, 0.0F);
		barrelModel[0].setRotationPoint(15F, -38F, 0F);	
		
		//This should be defined even when not used.
		gunModel = new NMTModelRenderer[0];
		ammoModel = new NMTModelRenderer[0];
		leftFrontWheelModel = new NMTModelRenderer[0];	
		leftBackWheelModel = new NMTModelRenderer[0];	
		rightFrontWheelModel = new NMTModelRenderer[0];	
		rightBackWheelModel = new NMTModelRenderer[0];
		
		flipAll(); //For old models
		translateAll(-4);
    }
}
