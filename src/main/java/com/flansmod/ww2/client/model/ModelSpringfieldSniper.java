//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSpringfieldSniper extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	public ModelSpringfieldSniper() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[40];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		gunModel[12] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 33
		gunModel[21] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 54
		gunModel[22] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 1
		gunModel[23] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 2
		gunModel[24] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
		gunModel[27] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 40
		gunModel[28] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 41
		gunModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 42
		gunModel[30] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 43
		gunModel[31] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 44
		gunModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
		gunModel[33] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 5
		gunModel[34] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 6
		gunModel[35] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 7
		gunModel[36] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 57
		gunModel[37] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 58
		gunModel[38] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 59
		gunModel[39] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 1
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 2F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, -0.5F, 0.5F, 3F, -0.5F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 3F, -0.5F); // Box 2
		gunModel[0].setRotationPoint(-5.5F, -8F, -2.5F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(-0.5F, -8F, -2.5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(-24F, -2F, -2F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, -1F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(18.5F, -10F, -2.5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(33.5F, -10F, -2.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[5].setRotationPoint(18.5F, -9F, -2.5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		gunModel[6].setRotationPoint(33.5F, -7F, -2.5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[7].setRotationPoint(28.5F, -10F, -2.5F);
		
		gunModel[8].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 12
		gunModel[8].setRotationPoint(28.5F, -9F, -2.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[9].setRotationPoint(28.5F, -7F, -2.5F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[10].setRotationPoint(33.5F, -9F, -2.5F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F, 0F, -0.1F, -0.1F, 4F, -0.1F, -0.1F, 4F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 4F, -0.1F, -0.1F, 4F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 17
		gunModel[11].setRotationPoint(21.5F, -9.75F, -1F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[12].setRotationPoint(6.5F, -8F, -2.5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 19
		gunModel[13].setRotationPoint(6.5F, -5F, -2.5F);
		gunModel[13].rotateAngleZ = 0.09424778F;
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[14].setRotationPoint(0F, -9F, -2F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[15].setRotationPoint(0.5F, -4F, -0.5F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[16].setRotationPoint(5.5F, -4F, -0.5F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[17].setRotationPoint(1F, -2F, -0.5F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[18].setRotationPoint(3F, -4.5F, -0.5F);
		gunModel[18].rotateAngleZ = 0.2268928F;
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 25
		gunModel[19].setRotationPoint(55.25F, -10.5F, -1F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[20].setRotationPoint(14.5F, -11F, -2F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[21].setRotationPoint(-24F, -6F, -2F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[22].setRotationPoint(48.5F, -9.85F, -1.5F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[23].setRotationPoint(6.5F, -6F, -2.5F);
		gunModel[23].rotateAngleZ = 0.09424778F;
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[24].setRotationPoint(49.5F, -8.85F, -1.5F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[25].setRotationPoint(50.5F, -9.85F, -1.5F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.34F, -1F, 0F, -0.34F, -1F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 39
		gunModel[26].setRotationPoint(55.5F, -12F, -0.5F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 40
		gunModel[27].setRotationPoint(55.25F, -11F, -0.5F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[28].setRotationPoint(15F, -11.5F, -1.5F);
		
		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
		gunModel[29].setRotationPoint(15F, -12F, -1.25F);
		
		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 43
		gunModel[30].setRotationPoint(15F, -12F, 0.25F);
		
		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[31].setRotationPoint(12.5F, -10.5F, -1.5F);
		
		gunModel[32].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 45
		gunModel[32].setRotationPoint(1.5F, -10.25F, 1F);
		
		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[33].setRotationPoint(32F, -15.5F, -2F);
		
		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[34].setRotationPoint(13F, -12.5F, -1F);
		
		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[35].setRotationPoint(25F, -12.5F, -1F);
		
		gunModel[36].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 57
		gunModel[36].setRotationPoint(0F, -14.5F, -1F);
		
		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 58
		gunModel[37].setRotationPoint(27F, -15.5F, -2F);
		
		gunModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 59
		gunModel[38].setRotationPoint(6F, -15F, -1.5F);
		
		gunModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[39].setRotationPoint(1F, -15F, -1.5F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 0
		
		ammoModel[0].addBox(5F, -9.5F, 0F, 6, 5, 1, 0F); // Box 0
		ammoModel[0].setRotationPoint(0F, 0F, -0.5F);
		
		
		pumpModel = new ModelRendererTurbo[6];
		pumpModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 35
		pumpModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 37
		pumpModel[2] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 46
		pumpModel[3] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 47
		pumpModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 48
		pumpModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 49
		
		pumpModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 35
		pumpModel[0].setRotationPoint(1.5F, -10.5F, -1.5F);
		
		pumpModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		pumpModel[1].setRotationPoint(-0.5F, -9.75F, -1F);
		
		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		pumpModel[2].setRotationPoint(2F, -9.5F, -4F);
		pumpModel[2].rotateAngleX = 0.17453293F;
		
		pumpModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		pumpModel[3].setRotationPoint(1.5F, -10F, -4.5F);
		pumpModel[3].rotateAngleX = 0.17453293F;
		
		pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		pumpModel[4].setRotationPoint(-2.5F, -10F, -1.5F);
		
		pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		pumpModel[5].setRotationPoint(-1.5F, -9.5F, -0.5F);
		
		gunSlideDistance = 0.08F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;
		
		translateAll(0F, -9F, 0F);
		thirdPersonOffset = new Vector3f(-0.2F, -0.2F, 0.01F);
		
		flipAll();
	}
}
