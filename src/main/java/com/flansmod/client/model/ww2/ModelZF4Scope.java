//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZF4Scope extends ModelAttachment 
{
	int textureX = 32;
	int textureY = 32;

	public ModelZF4Scope()	
	{
		attachmentModel = new ModelRendererTurbo[8];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		attachmentModel[0].addShapeBox(-2F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		attachmentModel[0].setRotationPoint(0F, 0F, 0F);

		attachmentModel[1].addShapeBox(1F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(0F, 0F, 0F);

		attachmentModel[2].addShapeBox(-3F, -3F, -0.5F, 6, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 2
		attachmentModel[2].setRotationPoint(0F, 0F, 0F);

		attachmentModel[3].addShapeBox(1F, -3F, -0.5F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 3
		attachmentModel[3].setRotationPoint(0F, 0F, 0F);

		attachmentModel[4].addShapeBox(-2F, -3F, -0.5F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 4
		attachmentModel[4].setRotationPoint(0F, 0F, 0F);

		attachmentModel[5].addShapeBox(-0.5F, -3F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(0F, 0F, 0F);

		attachmentModel[6].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(0F, 0F, 0F);

		attachmentModel[7].addShapeBox(1F, -2F, -1.5F, 1, 2, 1, 0F,3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 3F, -1.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 0
		attachmentModel[7].setRotationPoint(0F, 0F, 0F);


		renderOffset = 0F;


		flipAll();
	}
}