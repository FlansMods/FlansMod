//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPIAT extends ModelGun
{
	int textureX = 128;
	int textureY = 128;

	public ModelPIAT()	
	{


// Gun
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this,  0,  11, textureX, textureY); // Shape1
		gunModel[1] = new ModelRendererTurbo(this,  0,  18, textureX, textureY); // Shape2
		gunModel[2] = new ModelRendererTurbo(this,  0,  22, textureX, textureY); // Shape3
		gunModel[3] = new ModelRendererTurbo(this,  0,  28, textureX, textureY); // Shape4
		gunModel[4] = new ModelRendererTurbo(this,  0,  32, textureX, textureY); // Shape5
		gunModel[5] = new ModelRendererTurbo(this,  0,  37, textureX, textureY); // Shape6
		gunModel[6] = new ModelRendererTurbo(this,  0,  44, textureX, textureY); // Shape7
		gunModel[7] = new ModelRendererTurbo(this,  0,  56, textureX, textureY); // Shape8
		gunModel[8] = new ModelRendererTurbo(this,  0,  60, textureX, textureY); // Shape9
		gunModel[9] = new ModelRendererTurbo(this,  0,  64, textureX, textureY); // Shape10
		gunModel[10] = new ModelRendererTurbo(this,  0,  93, textureX, textureY); // Shape11
		gunModel[11] = new ModelRendererTurbo(this,  0,  93, textureX, textureY); // Shape12
		gunModel[12] = new ModelRendererTurbo(this,  0,  99, textureX, textureY); // Shape13
		gunModel[13] = new ModelRendererTurbo(this,  0,  3, textureX, textureY); // Shape14
		gunModel[14] = new ModelRendererTurbo(this,  0,  103, textureX, textureY); // Shape15
		gunModel[15] = new ModelRendererTurbo(this,  0,  113, textureX, textureY); // Shape16

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Shape1
		gunModel[0].setRotationPoint(0F, 0F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Shape2
		gunModel[1].setRotationPoint(0F, 4F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Shape3
		gunModel[2].setRotationPoint(5F, 0F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Shape4
		gunModel[3].setRotationPoint(3F, 0F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Shape5
		gunModel[4].setRotationPoint(0F, -2F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 22, 3, 3, 0F); // Shape6
		gunModel[5].setRotationPoint(-12F, -5F, -1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Shape7
		gunModel[6].setRotationPoint(-14F, -7F, -2F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Shape8
		gunModel[7].setRotationPoint(-8F, -7F, 0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Shape9
		gunModel[8].setRotationPoint(4F, -8F, 0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Shape10
		gunModel[9].setRotationPoint(10F, -6F, -2.5F);

		gunModel[10].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Shape11
		gunModel[10].setRotationPoint(11F, -5F, -2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Shape12
		gunModel[11].setRotationPoint(11F, -5F, 1.5F);

		gunModel[12].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Shape13
		gunModel[12].setRotationPoint(11F, -2F, -1.5F);

		gunModel[13].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Shape14
		gunModel[13].setRotationPoint(16F, -6F, -2.5F);

		gunModel[14].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Shape15
		gunModel[14].setRotationPoint(9F, -2F, -0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Shape16
		gunModel[15].setRotationPoint(8F, 6F, -2.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[10];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  75, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  0,  75, textureX, textureY); // Ammo2
		ammoModel[2] = new ModelRendererTurbo(this,  0,  75, textureX, textureY); // Ammo3
		ammoModel[3] = new ModelRendererTurbo(this,  0,  80, textureX, textureY); // Ammo4
		ammoModel[4] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // Ammo5
		ammoModel[5] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // Ammo6
		ammoModel[6] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // Ammo7
		ammoModel[7] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Ammo8
		ammoModel[8] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Ammo9
		ammoModel[9] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Ammo10

		ammoModel[0].addBox(0F, -0.5F, -1.5F, 1, 1, 3, 0F); // Ammo1
		ammoModel[0].setRotationPoint(11F, -3.5F, 0F);

		ammoModel[1].addShapeBox(0F, -1.5F, -1.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		ammoModel[1].setRotationPoint(11F, -3.5F, 0F);

		ammoModel[2].addShapeBox(0F, 0.5F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		ammoModel[2].setRotationPoint(11F, -3.5F, 0F);

		ammoModel[3].addBox(1F, -0.5F, -0.5F, 9, 1, 1, 0F); // Ammo4
		ammoModel[3].setRotationPoint(11F, -3.5F, 0F);

		ammoModel[4].addShapeBox(0F, -1.5F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		ammoModel[4].setRotationPoint(14F, -3.5F, 0F);

		ammoModel[5].addBox(0F, -0.5F, -1.5F, 3, 1, 3, 0F); // Ammo6
		ammoModel[5].setRotationPoint(14F, -3.5F, 0F);

		ammoModel[6].addShapeBox(0F, 0.5F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		ammoModel[6].setRotationPoint(14F, -3.5F, 0F);

		ammoModel[7].addShapeBox(0F, -1.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		ammoModel[7].setRotationPoint(17F, -3.5F, 0F);

		ammoModel[8].addShapeBox(0F, -0.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		ammoModel[8].setRotationPoint(17F, -3.5F, 0F);

		ammoModel[9].addShapeBox(0F, 0.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); //Test
		ammoModel[9].setRotationPoint(17F, -3.5F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.END_LOADED;

		flipAll();
		translateAll(0F, 1F, 0F);
	}
}