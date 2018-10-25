//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelUSP extends ModelGun
{
	int textureX = 32;
	int textureY = 32;
	
	public ModelUSP()
	{
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 8, 11, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 10, 17, textureX, textureY); // Box 9
		
		gunModel[0].addShapeBox(0.15F, -2.75F, -1F, 2, 4, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.75F, -0.45F, -0.2F, -0.75F, -0.45F, -0.2F, -0.75F, -0.45F, -0.2F, 0.75F, -0.45F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(-1.1F, -3.75F, -1F, 6, 1, 2, 0F, -0.5F, -0.25F, -0.2F, 0.5F, -0.25F, -0.2F, 0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.25F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(0.9F, -4.75F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addShapeBox(4.9F, -4.75F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addShapeBox(5.4F, -3.75F, -1F, 1, 1, 2, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 6
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addShapeBox(1.8F, -3.25F, -1F, 2, 2, 2, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.125F, -0.35F, 0F, -0.125F, -0.35F, 0F, -0.125F, -0.35F, 0F, -0.125F, -0.35F); // Box 9
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		
		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 13
		defaultScopeModel[1] = new ModelRendererTurbo(this, 4, 6, textureX, textureY); // Box 14
		
		defaultScopeModel[0].addShapeBox(5.6F, -5.35F, -0.5F, 1, 1, 1, 0F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F); // Box 13
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);
		
		defaultScopeModel[1].addShapeBox(-0.4F, -5.35F, -0.5F, 1, 1, 1, 0F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F); // Box 14
		defaultScopeModel[1].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 14, 11, textureX, textureY); // Box 7
		ammoModel[1] = new ModelRendererTurbo(this, 14, 8, textureX, textureY); // Box 8
		
		ammoModel[0].addShapeBox(0.15F, -2.75F, -1F, 2, 4, 2, 0F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0.625F, -0.45F, -0.35F, -0.875F, -0.45F, -0.35F, -0.875F, -0.45F, -0.35F, 0.625F, -0.45F, -0.35F); // Box 7
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[1].addShapeBox(-0.6F, 0.55F, -1F, 2, 1, 2, 0F, 0.1F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F, 0.1F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F); // Box 8
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 4
		slideModel[1] = new ModelRendererTurbo(this, 11, 27, textureX, textureY); // Box 5
		
		slideModel[0].addShapeBox(-1.1F, -5.25F, -1F, 8, 2, 2, 0F, -0.85F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.85F, -0.6F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F); // Box 4
		slideModel[0].setRotationPoint(0F, 0F, 0F);
		
		slideModel[1].addShapeBox(-1.1F, -5.65F, -1F, 8, 1, 2, 0F, -1F, -0.6F, -0.45F, -0.5F, -0.6F, -0.45F, -0.5F, -0.6F, -0.45F, -1F, -0.6F, -0.45F, -0.85F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.85F, 0F, -0.2F); // Box 5
		slideModel[1].setRotationPoint(0F, 0F, 0F);
		
		
		barrelAttachPoint = new Vector3f(6.9F / 16F, 4.25F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(2F / 16F, 5F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 / 16F, 4F / 16F, 0F / 16F);
		
		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
