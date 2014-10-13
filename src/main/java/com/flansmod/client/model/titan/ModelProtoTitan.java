package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelProtoTitan extends ModelMecha 
{
	public ModelProtoTitan()
	{
		int textureX = 256;
		int textureY = 256;
		
		hipsAttachmentPoint = new Vector3f(-12.1F / 16F, 36F / 16F, 0F);
		
		//Body
		bodyModel = new ModelRendererTurbo[8];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-12, 29, -12, 16, 19, 24);
		
		bodyModel[1] = new ModelRendererTurbo(this, 88, 0, textureX, textureY);
		bodyModel[1].addShape3D(0, 21, 12, new Shape2D(new Coord2D[] { new Coord2D(4, 8, 0, 0), new Coord2D(12, 8, 8, 0), new Coord2D(12, 18, 8, 10), new Coord2D(4, 27, 0, 19) }), 24, 8, 19, 49, 24, ModelRendererTurbo.MR_BACK, new float[] { 19, 12, 10, 8 });
		
		bodyModel[2] = new ModelRendererTurbo(this, 139, 0, textureX, textureY);
		bodyModel[2].addShape3D(0, 21, 12, new Shape2D(new Coord2D[] { new Coord2D(-12, 0, 0, 0), new Coord2D(8, 0, 20, 0), new Coord2D(12, 8, 24, 8), new Coord2D(-12, 8, 0, 8) }), 24, 24, 8, 61, 24, ModelRendererTurbo.MR_BACK, new float[] { 8, 24, 9, 20 });
		
		//Body inside
		bodyModel[3] = new ModelRendererTurbo(this, 118, 34, textureX, textureY);
		bodyModel[3].flip = true;
		bodyModel[3].addBox(-12, 29, -11.5F, 16, 19, 23);
		
		bodyModel[4] = new ModelRendererTurbo(this, 203, 0, textureX, textureY);
		bodyModel[4].addShape3D(0, 21, 11.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 8, 0, 0), new Coord2D(4, 27, 0, 19), new Coord2D(12, 18, 8, 10), new Coord2D(12, 8, 8, 0) }), 23, 8, 19, 49, 24, ModelRendererTurbo.MR_BACK, new float[] { 8, 10, 12, 19 });
		
		bodyModel[5] = new ModelRendererTurbo(this, 0, 52, textureX, textureY);
		bodyModel[5].addShape3D(0, 21, 11.5F, new Shape2D(new Coord2D[] { new Coord2D(-12, 2, 0, 0),  new Coord2D(-12, 8, 0, 6), new Coord2D(12, 8, 24, 6), new Coord2D(9, 2, 21, 0) }), 23, 24, 6, 61, 24, ModelRendererTurbo.MR_BACK, new float[] { 20, 9, 24, 8 });

		bodyModel[6] = new ModelRendererTurbo(this, 85, 82, textureX, textureY);
		bodyModel[6].addBox(6, 21, -5, 2, 8, 2);
		
		bodyModel[7] = new ModelRendererTurbo(this, 85, 82, textureX, textureY);
		bodyModel[7].addBox(6, 21, 3, 2, 8, 2);
		
		//Left Arm
		leftArmModel = new ModelRendererTurbo[6];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 63, 50, textureX, textureY);
		leftArmModel[0].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		leftArmModel[0].setPosition(0, 0, 0);
		
		leftArmModel[1] = new ModelRendererTurbo(this, 85, 50, textureX, textureY);
		leftArmModel[1].addBox(-3, -9, -3, 6, 9, 6);
		leftArmModel[1].setPosition(0.25F, 0, 0);
		leftArmModel[1].rotateAngleZ = -20F * (float)Math.PI / 180F;
		
		leftArmModel[2] = new ModelRendererTurbo(this, 63, 60, textureX, textureY);
		leftArmModel[2].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		leftArmModel[2].setPosition(-2.8F, -10F, 0);
		
		leftArmModel[3] = new ModelRendererTurbo(this, 85, 65, textureX, textureY);
		leftArmModel[3].addBox(-3, 0, -3, 6, 9, 6);
		leftArmModel[3].setPosition(0.25F, -19, 0);
		leftArmModel[3].rotateAngleZ = 20F * (float)Math.PI / 180F;
		
		leftArmModel[4] = new ModelRendererTurbo(this, 63, 70, textureX, textureY);
		leftArmModel[4].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		leftArmModel[4].setPosition(0, -20, 0);
		
		leftArmModel[5] = new ModelRendererTurbo(this, 63, 82, textureX, textureY);
		leftArmModel[5].addBox(-1.5F, -1.5F, 2F, 3, 3, 2);
		leftArmModel[5].setPosition(0, 0, 0);
		
		
		//Right Arm
		rightArmModel = leftArmModel.clone();
		
		rightArmModel[5] = new ModelRendererTurbo(this, 63, 82, textureX, textureY);
		rightArmModel[5].addBox(-1.5F, -1.5F, -4F, 3, 3, 2);
		rightArmModel[5].setPosition(0, 0, 0);
		
		//Hips
		hipsModel = new ModelRendererTurbo[1];
		
		hipsModel[0] = new ModelRendererTurbo(this, 0, 84, textureX, textureY);
		hipsModel[0].addBox(-10, 15, -10, 20, 6, 20);
		
		//Left Leg
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY);
		leftLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		leftLegModel[0].setPosition(0, 16, -5);
		
		//Right Leg
		rightLegModel = new ModelRendererTurbo[1];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 32, 112, textureX, textureY);
		rightLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		rightLegModel[0].setPosition(0, 16, 5);
	}
}