//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM1Carbine extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	public ModelM1Carbine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 20
		gunModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 21
		gunModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 22
		gunModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		gunModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 24
		gunModel[15] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 25
		gunModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 26
		gunModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 27
		gunModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		gunModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 33
		gunModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 34
		gunModel[21] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 35
		gunModel[22] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 37
		gunModel[23] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 38
		gunModel[24] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 40
		gunModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		gunModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		gunModel[28] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 5
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(3F, -7.5F, -2F);
		gunModel[0].rotateAngleZ = -0.27925268F;
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(3F, -9F, -2.5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[2].setRotationPoint(21.5F, -12F, -2.5F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F, 0F, 0F, -0.0001F); // Box 7
		gunModel[3].setRotationPoint(20.5F, -10F, -2.5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[4].setRotationPoint(21.5F, -11F, -2.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[5].setRotationPoint(38.5F, -12F, -2.5F);
		
		gunModel[6].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 12
		gunModel[6].setRotationPoint(38.5F, -11F, -2.5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[7].setRotationPoint(38.5F, -9F, -2.5F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[8].setRotationPoint(12F, -9F, -2.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 19
		gunModel[9].setRotationPoint(12F, -7F, -2.5F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[10].setRotationPoint(5.5F, -10F, -2F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[11].setRotationPoint(5.5F, -5F, -1F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[12].setRotationPoint(11.5F, -7F, -1F);
		gunModel[12].rotateAngleZ = -0.38397244F;
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[13].setRotationPoint(5.5F, -3F, -1F);
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[14].setRotationPoint(7.5F, -5.2F, -0.5F);
		gunModel[14].rotateAngleZ = 0.34906585F;
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 25
		gunModel[15].setRotationPoint(55F, -12F, -1F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[16].setRotationPoint(55F, -12F, -0.75F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[17].setRotationPoint(55F, -12F, -0.25F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 29
		gunModel[18].setRotationPoint(55.5F, -13F, -0.5F);
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[19].setRotationPoint(20.5F, -12F, -2.5F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[20].setRotationPoint(7.5F, -11F, -2F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[21].setRotationPoint(7.5F, -11.5F, -1.5F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[22].setRotationPoint(11.5F, -11F, 1F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[23].setRotationPoint(8F, -12F, -0.5F);
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 40
		gunModel[24].setRotationPoint(8F, -13F, -1F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 0
		gunModel[25].setRotationPoint(8F, -13F, 0F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 1
		gunModel[26].setRotationPoint(8F, -13.5F, -0.5F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[27].setRotationPoint(21.5F, -12F, -0.5F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[28].setRotationPoint(20.5F, -12F, -0.5F);
		
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 17
		
		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		defaultBarrelModel[0].setRotationPoint(38.5F, -11.75F, -1F);
		
		
		defaultStockModel = new ModelRendererTurbo[11];
		defaultStockModel[0] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 0
		defaultStockModel[1] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 1
		defaultStockModel[2] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 3
		defaultStockModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 4
		defaultStockModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		defaultStockModel[5] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 7
		defaultStockModel[6] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 8
		defaultStockModel[7] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 2
		defaultStockModel[8] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 3
		defaultStockModel[9] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 7
		defaultStockModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 8
		
		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 0
		defaultStockModel[0].setRotationPoint(-3.9F, -9.4F, -1F);
		
		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		defaultStockModel[1].setRotationPoint(-4.1F, 0.2F, -1F);
		
		defaultStockModel[2].addShapeBox(0F, -2F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		defaultStockModel[2].setRotationPoint(-6F, -6.5F, -1F);
		defaultStockModel[2].rotateAngleZ = 0.34906585F;
		
		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultStockModel[3].setRotationPoint(-24F, -8.5F, -1F);
		
		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		defaultStockModel[4].setRotationPoint(-13.45F, -3.25F, -1F);
		
		defaultStockModel[5].addShapeBox(0F, -2F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		defaultStockModel[5].setRotationPoint(-16F, 1.5F, -1F);
		defaultStockModel[5].rotateAngleZ = 0.6981317F;
		
		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		defaultStockModel[6].setRotationPoint(-24F, -0.5F, -1F);
		
		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		defaultStockModel[7].setRotationPoint(-7.45F, -3.25F, -1F);
		defaultStockModel[7].rotateAngleZ = -0.6981317F;
		
		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 3
		defaultStockModel[8].setRotationPoint(-11.45F, -6.5F, -0.5F);
		
		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		defaultStockModel[9].setRotationPoint(-24F, -6.5F, -1F);
		
		defaultStockModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		defaultStockModel[10].setRotationPoint(-24F, -3.5F, -1F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 9
		
		ammoModel[0].addShapeBox(14F, -6F, -1.5F, 5, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 9
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
		slideModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 48
		slideModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 6
		
		slideModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		slideModel[0].setRotationPoint(17.5F, -11F, -2.55F);
		
		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		slideModel[1].setRotationPoint(17.5F, -11F, -3.5F);
		
		slideModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		slideModel[2].setRotationPoint(11.5F, -11F, -1F);
		
		
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(-8F, -5F, 0.2F);
		thirdPersonOffset = new Vector3f(-0.1F, -0.12, 0.015F);
		
		flipAll();
	}
}
