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
import com.flansmod.common.vector.Vector3f;

public class ModelLeeenfieldS extends ModelGun
{
	int textureX = 128;
	int textureY = 128;

	public ModelLeeenfieldS()	
	{


// Gun
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // Shape1
		gunModel[1] = new ModelRendererTurbo(this,  0,  17, textureX, textureY); // Shape2
		gunModel[2] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Shape3
		gunModel[3] = new ModelRendererTurbo(this,  0,  34, textureX, textureY); // Shape4
		gunModel[4] = new ModelRendererTurbo(this,  0,  39, textureX, textureY); // Shape5
		gunModel[5] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // Shape6
		gunModel[6] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Shape7
		gunModel[7] = new ModelRendererTurbo(this,  0,  67, textureX, textureY); // Shape8
		gunModel[8] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Shape8
		gunModel[9] = new ModelRendererTurbo(this,  0,  98, textureX, textureY); // Shape9
		gunModel[10] = new ModelRendererTurbo(this,  0,  108, textureX, textureY); // Shape10

		gunModel[0].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Shape1
		gunModel[0].setRotationPoint(0F, 1F, -1.5F);

		gunModel[1].addShapeBox(0F, -1F, 0F, 20, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(7F, 0F, -1.5F);

		gunModel[2].addBox(0F, -1F, 0F, 2, 3, 2, 0F); // Shape3
		gunModel[2].setRotationPoint(27F, 0F, -1F);

		gunModel[3].addBox(0F, -1F, 0F, 3, 1, 1, 0F); // Shape4
		gunModel[3].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[4].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Shape5
		gunModel[4].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Shape6
		gunModel[5].setRotationPoint(0F, 0F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Shape7
		gunModel[6].setRotationPoint(-1F, 0F, -1.5F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Shape8
		gunModel[7].setRotationPoint(0F, -1F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); //Test
		gunModel[8].setRotationPoint(-6F, 0F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); //Test
		gunModel[9].setRotationPoint(-14F, 0F, -1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Shape10
		gunModel[10].setRotationPoint(0F, 3F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  43, textureX, textureY); // Ammo1

		ammoModel[0].addShapeBox(0F, -1F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); //Test
		ammoModel[0].setRotationPoint(2F, 2F, -1F);



// Pump
		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // Pump1
		pumpModel[1] = new ModelRendererTurbo(this,  0,  78, textureX, textureY); // Pump2
		pumpModel[2] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // Pump3

		pumpModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Pump1
		pumpModel[0].setRotationPoint(2F, -0.8F, -0.5F);

		pumpModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Pump2
		pumpModel[1].setRotationPoint(6F, -0.8F, -1.5F);

		pumpModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Pump3
		pumpModel[2].setRotationPoint(6F, -0.8F, -2.5F);

//Le Snyphurr bit

		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  40,  29, textureX, textureY); // Snyphurr1
		defaultScopeModel[1] = new ModelRendererTurbo(this,  40,  29, textureX, textureY); // Snyphurr2
		defaultScopeModel[2] = new ModelRendererTurbo(this,  40,  34, textureX, textureY); // Snyphurr3
		defaultScopeModel[3] = new ModelRendererTurbo(this,  40,  41, textureX, textureY); // Snyphurr4
		defaultScopeModel[4] = new ModelRendererTurbo(this,  40,  50, textureX, textureY); // Snyphurr5
		defaultScopeModel[5] = new ModelRendererTurbo(this,  40,  59, textureX, textureY); // Snyphurr6

		defaultScopeModel[0].addBox(0F, -1F, 0F, 2, 1, 1, 0F); // Snyphurr1
		defaultScopeModel[0].setRotationPoint(0F, -1F, -0.5F);

		defaultScopeModel[1].addBox(0F, -1F, 0F, 2, 1, 1, 0F); // Snyphurr2
		defaultScopeModel[1].setRotationPoint(7F, -1F, -0.5F);

		defaultScopeModel[2].addBox(0F, -1F, 0F, 9, 2, 2, 0F); // Snyphurr3
		defaultScopeModel[2].setRotationPoint(0F, -3F, -1F);

		defaultScopeModel[3].addBox(0F, -1F, 0F, 2, 3, 3, 0F); // Snyphurr4
		defaultScopeModel[3].setRotationPoint(-2F, -3.5F, -1.5F);

		defaultScopeModel[4].addBox(0F, -1F, 0F, 2, 3, 3, 0F); // Snyphurr5
		defaultScopeModel[4].setRotationPoint(9F, -3.5F, -1.5F);

		defaultScopeModel[5].addBox(0F, -1F, 0F, 2, 3, 3, 0F); // Snyphurr6
		defaultScopeModel[5].setRotationPoint(11F, -3.5F, -1.5F);
		
		barrelAttachPoint = new Vector3f(29F / 16F, 6F / 16F, 0F / 16F);


		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 6;
		pumpTime = 9;

		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, 6F, 0F);
	}
}