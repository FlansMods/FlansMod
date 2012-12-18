package co.uk.flansmods.client.model;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.EntityMG;

public class ModelMG extends ModelBase
{
	public ModelRendererTurbo bipodModel[];
	public ModelRendererTurbo gunModel[];
	public ModelRendererTurbo ammoModel[];

	public void renderBipod(float f, float f1, float f2, float f3, float f4, float f5, EntityMG mg)
	{
		for (ModelRendererTurbo bipodPart : bipodModel)
		{
			bipodPart.render(f5);
		}
	}

	public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, float f6, EntityMG mg)
	{
		for (ModelRendererTurbo gunPart : gunModel)
		{
			gunPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			gunPart.render(f5);
		}

		if (mg.reloadTimer > 0 || mg.ammo == null)
			return;

		for (ModelRendererTurbo ammoPart : ammoModel)
		{
			ammoPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			ammoPart.render(f5);
		}
	}
}
