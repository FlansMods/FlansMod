//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGreaseGun extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelGreaseGun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 34
		gunModel[28] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 35
		gunModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 36
		gunModel[30] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 37
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.8F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		gunModel[0].setRotationPoint(0F, -3F, -0.5F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, -3.8F, -1F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(0F, -4.8F, -1F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 4
		gunModel[3].setRotationPoint(0F, -2.8F, -1F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 5
		gunModel[4].setRotationPoint(1F, -3F, -0.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 6
		gunModel[5].setRotationPoint(3F, -2F, -0.5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 8
		gunModel[6].setRotationPoint(7.2F, -3F, -0.5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		gunModel[7].setRotationPoint(9.5F, -3.8F, -1F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 10
		gunModel[8].setRotationPoint(9.5F, -3.2F, -1F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 11
		gunModel[9].setRotationPoint(9.5F, -4.4F, -1F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 12
		gunModel[10].setRotationPoint(10.5F, -3.8F, -0.5F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 13
		gunModel[11].setRotationPoint(7.8F, -4.6F, -0.5F);
		
		gunModel[12].addShapeBox(0F, -0.5F, -0.3F, 3, 1, 1, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 14
		gunModel[12].setRotationPoint(7F, -4.85F, -0.6F);
		gunModel[12].rotateAngleX = -1.29154365F;
		
		gunModel[13].addShapeBox(0F, -0.5F, -1.3F, 3, 1, 1, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 15
		gunModel[13].setRotationPoint(7F, -4.85F, -0.6F);
		gunModel[13].rotateAngleX = -1.29154365F;
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(1F, -5F, -1F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 17
		gunModel[15].setRotationPoint(1F, -5.2F, -0.8F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 18
		gunModel[16].setRotationPoint(1F, -5.2F, -0.2F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 19
		gunModel[17].setRotationPoint(1F, -5.5F, -0.5F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F); // Box 20
		gunModel[18].setRotationPoint(8.5F, -5F, -0.5F);
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 21
		gunModel[19].setRotationPoint(-0.5F, -4.4F, -1F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 22
		gunModel[20].setRotationPoint(-0.5F, -3.8F, -1F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 23
		gunModel[21].setRotationPoint(-0.5F, -3.2F, -1F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 24
		gunModel[22].setRotationPoint(1F, -1.5F, -0.5F);
		gunModel[22].rotateAngleZ = 0.05235988F;
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 26
		gunModel[23].setRotationPoint(1.8F, -2.35F, -0.5F);
		gunModel[23].rotateAngleZ = 0.08726646F;
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 27
		gunModel[24].setRotationPoint(-5.2F, -3F, 0F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 28
		gunModel[25].setRotationPoint(-5.2F, -3F, -1F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -1.6F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -1.6F, -0.4F, -0.4F, 0.6F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.6F, -0.4F); // Box 31
		gunModel[26].setRotationPoint(-5.8F, -3F, -1F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -1.6F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -1.6F, -0.4F, -0.4F, 0.6F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.6F, -0.4F); // Box 34
		gunModel[27].setRotationPoint(-5.8F, -3F, 0F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 35
		gunModel[28].setRotationPoint(-6F, -1.8F, 0F);
		
		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 36
		gunModel[29].setRotationPoint(-6F, -1.8F, -1F);
		
		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F); // Box 37
		gunModel[30].setRotationPoint(-6.05F, -0.6F, -1F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		
		ammoModel[0].addShapeBox(7.2F, -2F, -0.5F, 1, 6, 1, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F); // Box 7
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(-6F, -2.2F, 0.1F);
		thirdPersonOffset = new Vector3f(0F, -0.1F, 0.01F);
		
		flipAll();
	}
}
