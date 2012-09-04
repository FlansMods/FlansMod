package flan.client;

import flan.server.EntityAAGun;
import net.minecraft.src.ModelBase;
import net.minecraft.src.NMTModelBase;
import net.minecraft.src.NMTModelRenderer;
import net.minecraft.src.Tessellator;

public class ModelAAGun extends ModelBase
{
	public ModelAAGun()
	{
	}

	public void renderBase(float f, float f1, float f2, float f3, float f4, float f5, EntityAAGun aa)
	{
		for (int i = 0; i < baseModel.length; i++)
		{
			baseModel[i].render(f5);
		}
	}

	public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, EntityAAGun aa)
	{
		for (int i = 0; i < seatModel.length; i++)
		{
			seatModel[i].render(f5);
		}

		for (int i = 0; i < gunModel.length; i++)
		{
			// gunModel[i].setPosition(barrelX, barrelY, barrelZ);
			gunModel[i].rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
			gunModel[i].render(f5);
		}

		for (int i = 0; i < barrelModel.length; i++)
		{
			for (int j = 0; j < barrelModel[i].length; j++)
			{
				// barrelModel[i][j].setPosition(-aa.barrelRecoil[i] *
				// (float)(Math.cos(-aa.gunPitch * 3.14159265358979F / 180F)) +
				// barrelX, - aa.barrelRecoil[i] * (float)(Math.sin(-aa.gunPitch
				// * 3.14159265358979F / 180F)) + barrelY, barrelZ);
				barrelModel[i][j].rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
				barrelModel[i][j].render(f5);
			}
		}

		for (int i = 0; i < ammoModel.length; i++)
		{
			if (aa.ammo[i] != null)
			{
				for (int j = 0; j < ammoModel[i].length; j++)
				{
					// ammoModel[i][j].setPosition(barrelX, barrelY, barrelZ);
					ammoModel[i][j].rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
					ammoModel[i][j].render(f5);
				}
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public void flipAll()
	{
		for (int i = 0; i < baseModel.length; i++)
		{
			baseModel[i].doMirror(false, true, true);
			baseModel[i].setRotationPoint(baseModel[i].rotationPointX, -baseModel[i].rotationPointY, -baseModel[i].rotationPointZ);
		}
		for (int i = 0; i < seatModel.length; i++)
		{
			seatModel[i].doMirror(false, true, true);
			seatModel[i].setRotationPoint(seatModel[i].rotationPointX, -seatModel[i].rotationPointY, -seatModel[i].rotationPointZ);
		}
		for (int i = 0; i < gunModel.length; i++)
		{
			gunModel[i].doMirror(false, true, true);
			gunModel[i].setRotationPoint(gunModel[i].rotationPointX, -gunModel[i].rotationPointY, -gunModel[i].rotationPointZ);
		}
		for (int i = 0; i < barrelModel.length; i++)
		{
			for (int j = 0; j < barrelModel[i].length; j++)
			{
				barrelModel[i][j].doMirror(false, true, true);
				barrelModel[i][j].setRotationPoint(barrelModel[i][j].rotationPointX, -barrelModel[i][j].rotationPointY, -barrelModel[i][j].rotationPointZ);
			}
		}
		for (int i = 0; i < ammoModel.length; i++)
		{
			for (int j = 0; j < ammoModel[i].length; j++)
			{
				ammoModel[i][j].doMirror(false, true, true);
				ammoModel[i][j].setRotationPoint(ammoModel[i][j].rotationPointX, -ammoModel[i][j].rotationPointY, -ammoModel[i][j].rotationPointZ);
			}
		}
	}

	public NMTModelRenderer baseModel[]; // The base which stays put
	public NMTModelRenderer seatModel[]; // The bit which swivels around the yaw
											// axis, but which does not pitch
	public NMTModelRenderer gunModel[]; // The bit of the gun that points where
										// you look, but doesn't move
	public NMTModelRenderer barrelModel[][]; // The end of the barrel that
												// recoils
	public NMTModelRenderer ammoModel[][]; // The magazines for each barrel.
	public int barrelX, barrelY, barrelZ;
}
