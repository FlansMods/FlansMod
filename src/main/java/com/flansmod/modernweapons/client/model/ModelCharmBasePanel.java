//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CharmBasePanel
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCharmBasePanel extends ModelAttachment //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelCharmBasePanel() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[1];
		attachmentModel[0] = new ModelRendererTurbo(this, -1663, 329, textureX, textureY); // Import Box0

		attachmentModel[0].addBox(0F, -17F, 0F, 1500, 1500, 200, 0F); // Import Box0
		attachmentModel[0].setRotationPoint(-750F, -750F, 0F);



		flipAll();
	}
}