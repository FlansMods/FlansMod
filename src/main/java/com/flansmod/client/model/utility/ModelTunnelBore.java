//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.utility;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelTunnelBore extends ModelVehicle
{
	int textureX = 256;
	int textureY = 512;

	public ModelTunnelBore()
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Part
		bodyModel[1] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 0, 232, textureX, textureY); // Box 38

		bodyModel[0].addBox(0F, 0F, 0F, 64, 8, 48, 0F); // Part
		bodyModel[0].setRotationPoint(-32F, -16F, -24F);

		bodyModel[1].addBox(0F, 0F, 0F, 62, 16, 32, 0F); // Box 13
		bodyModel[1].setRotationPoint(-30F, -8F, -16F);

		bodyModel[2].addBox(0F, 0F, 0F, 16, 48, 48, 0F); // Box 14
		bodyModel[2].setRotationPoint(32F, -40F, -24F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 8, 8, 0F); // Box 36
		bodyModel[3].setRotationPoint(0F, -24F, -24F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 8, 8, 0F); // Box 37
		bodyModel[4].setRotationPoint(0F, -24F, 16F);

		bodyModel[5].addBox(0F, 0F, 0F, 32, 8, 48, 0F); // Box 38
		bodyModel[5].setRotationPoint(-32F, -24F, -24F);


		drillHeadModel = new ModelRendererTurbo[9];
		drillHeadModel[0] = new ModelRendererTurbo(this, 0, 288, textureX, textureY); // Box 16
		drillHeadModel[1] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Box 18
		drillHeadModel[2] = new ModelRendererTurbo(this, 0, 424, textureX, textureY); // Box 19
		drillHeadModel[3] = new ModelRendererTurbo(this, 80, 288, textureX, textureY); // Box 20
		drillHeadModel[4] = new ModelRendererTurbo(this, 80, 336, textureX, textureY); // Box 21
		drillHeadModel[5] = new ModelRendererTurbo(this, 72, 376, textureX, textureY); // Box 22
		drillHeadModel[6] = new ModelRendererTurbo(this, 72, 408, textureX, textureY); // Box 23
		drillHeadModel[7] = new ModelRendererTurbo(this, 64, 432, textureX, textureY); // Box 24
		drillHeadModel[8] = new ModelRendererTurbo(this, 64, 448, textureX, textureY); // Box 25

		drillHeadModel[0].addBox(0F, -18F, -18F, 4, 36, 36, 0F); // Box 16
		drillHeadModel[0].setRotationPoint(48F, -16F, 0F);

		drillHeadModel[1].addBox(0F, -16F, -16F, 4, 32, 32, 0F); // Box 18
		drillHeadModel[1].setRotationPoint(52F, -16F, 0F);
		drillHeadModel[1].rotateAngleX = 0.41887902F;

		drillHeadModel[2].addBox(0F, -14F, -14F, 4, 28, 28, 0F); // Box 19
		drillHeadModel[2].setRotationPoint(56F, -16F, 0F);
		drillHeadModel[2].rotateAngleX = 0.83775804F;

		drillHeadModel[3].addBox(0F, -12F, -12F, 4, 24, 24, 0F); // Box 20
		drillHeadModel[3].setRotationPoint(60F, -16F, 0F);
		drillHeadModel[3].rotateAngleX = 1.25663706F;

		drillHeadModel[4].addBox(0F, -10F, -10F, 4, 20, 20, 0F); // Box 21
		drillHeadModel[4].setRotationPoint(64F, -16F, 0F);
		drillHeadModel[4].rotateAngleX = 1.67551608F;

		drillHeadModel[5].addBox(0F, -8F, -8F, 4, 16, 16, 0F); // Box 22
		drillHeadModel[5].setRotationPoint(68F, -16F, 0F);
		drillHeadModel[5].rotateAngleX = 2.0943951F;

		drillHeadModel[6].addBox(0F, -6F, -6F, 4, 12, 12, 0F); // Box 23
		drillHeadModel[6].setRotationPoint(72F, -16F, 0F);
		drillHeadModel[6].rotateAngleX = 2.51327412F;

		drillHeadModel[7].addBox(0F, -4F, -4F, 4, 8, 8, 0F); // Box 24
		drillHeadModel[7].setRotationPoint(76F, -16F, 0F);
		drillHeadModel[7].rotateAngleX = 2.93215314F;

		drillHeadModel[8].addBox(0F, -2F, -2F, 4, 4, 4, 0F); // Box 25
		drillHeadModel[8].setRotationPoint(80F, -16F, 0F);
		drillHeadModel[8].rotateAngleX = 3.35103216F;

		drillHeadOrigin = new Vector3f(48F / 16F, 16F / 16F, 0F);
		

		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 26
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 27
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 28
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 29
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 30
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 31
		leftTrackModel[6] = new ModelRendererTurbo(this, 32, 490, textureX, textureY); // Box 32
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 33
		leftTrackModel[8] = new ModelRendererTurbo(this, 32, 490, textureX, textureY); // Box 34
		leftTrackModel[9] = new ModelRendererTurbo(this, 54, 490, textureX, textureY); // Box 35

		leftTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 26
		leftTrackModel[0].setRotationPoint(2F, 0F, 17F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 27
		leftTrackModel[1].setRotationPoint(13F, 0F, 17F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 28
		leftTrackModel[2].setRotationPoint(-20F, 0F, 17F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 29
		leftTrackModel[3].setRotationPoint(-9F, 0F, 17F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 60, 1, 8, 0F); // Box 30
		leftTrackModel[4].setRotationPoint(-30F, 8F, 16F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 31
		leftTrackModel[5].setRotationPoint(-30F, -6F, 17F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 32
		leftTrackModel[6].setRotationPoint(-31F, -6F, 16F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 60, 1, 8, 0F); // Box 33
		leftTrackModel[7].setRotationPoint(-30F, -7F, 16F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 34
		leftTrackModel[8].setRotationPoint(30F, -6F, 16F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 35
		leftTrackModel[9].setRotationPoint(24F, -6F, 17F);


		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 26
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 27
		rightTrackModel[2] = new ModelRendererTurbo(this, 32, 490, textureX, textureY); // Box 28
		rightTrackModel[3] = new ModelRendererTurbo(this, 32, 490, textureX, textureY); // Box 29
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 30
		rightTrackModel[5] = new ModelRendererTurbo(this, 54, 490, textureX, textureY); // Box 31
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 32
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 33
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 34
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Box 35

		rightTrackModel[0].addBox(0F, 0F, 0F, 60, 1, 8, 0F); // Part
		rightTrackModel[0].setRotationPoint(-30F, 8F, -24F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 60, 1, 8, 0F); // Box 3
		rightTrackModel[1].setRotationPoint(-30F, -7F, -24F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 5
		rightTrackModel[2].setRotationPoint(-31F, -6F, -24F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 6
		rightTrackModel[3].setRotationPoint(30F, -6F, -24F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 7
		rightTrackModel[4].setRotationPoint(-30F, -6F, -23F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 8
		rightTrackModel[5].setRotationPoint(24F, -6F, -23F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 9
		rightTrackModel[6].setRotationPoint(13F, 0F, -23F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 10
		rightTrackModel[7].setRotationPoint(2F, 0F, -23F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 11
		rightTrackModel[8].setRotationPoint(-9F, 0F, -23F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 12
		rightTrackModel[9].setRotationPoint(-20F, 0F, -23F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
