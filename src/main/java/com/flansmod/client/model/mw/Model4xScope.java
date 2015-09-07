//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model4xScope extends ModelAttachment 
{
	int textureX = 32;
	int textureY = 32;

	public Model4xScope()	
	{


// Attachment
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // MainScope
		attachmentModel[1] = new ModelRendererTurbo(this,  0,  10, textureX, textureY); // Stand
		attachmentModel[2] = new ModelRendererTurbo(this,  0,  10, textureX, textureY); // Stand
		attachmentModel[3] = new ModelRendererTurbo(this,  0,  15, textureX, textureY); // LensRear
		attachmentModel[4] = new ModelRendererTurbo(this,  9,  15, textureX, textureY); // LensFront
		attachmentModel[5] = new ModelRendererTurbo(this,  0,  20, textureX, textureY); // Dial1
		attachmentModel[6] = new ModelRendererTurbo(this,  0,  20, textureX, textureY); // Dial2

		attachmentModel[0].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // MainScope
		attachmentModel[0].setRotationPoint(-4F, -2F, -0.5F);

		attachmentModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Stand
		attachmentModel[1].setRotationPoint(-2F, -1F, -0.5F);

		attachmentModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Stand
		attachmentModel[2].setRotationPoint(2F, -1F, -0.5F);

		attachmentModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // LensRear
		attachmentModel[3].setRotationPoint(-5F, -2.5F, -1F);

		attachmentModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // LensFront
		attachmentModel[4].setRotationPoint(4F, -2.5F, -1F);

		attachmentModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Dial1
		attachmentModel[5].setRotationPoint(-1F, -2.5F, -0.5F);

		attachmentModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Dial2
		attachmentModel[6].setRotationPoint(-1F, -2F, -1F);



		renderOffset = 0F;


		flipAll();
	}
}