package co.uk.flansmods.client.model.ww2;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelWW2Parachute extends ModelBase 
{
	public ModelRendererTurbo backpackModel;
	public ModelRendererTurbo[] parachuteModel = new ModelRendererTurbo[6];

	public ModelWW2Parachute()
	{
		backpackModel = new ModelRendererTurbo(this, 0, 0, 128, 64);
		backpackModel.addBox(-4F, 26F, -6F, 8, 12, 2);
		
		//Outside
		parachuteModel[0] = new ModelRendererTurbo(this, 0, 16, 128, 64);
		parachuteModel[0].addTrapezoid(-12, 38, -12, 24, 24, 24, 0F, -8F, ModelRendererTurbo.MR_TOP);
		parachuteModel[1] = new ModelRendererTurbo(this, 72, 0, 128, 64);
		parachuteModel[1].addTrapezoid(-8, 62, -8, 16, 8, 16, 0F, 4F, ModelRendererTurbo.MR_TOP);
		parachuteModel[2] = new ModelRendererTurbo(this, 24, 0, 128, 64);
		parachuteModel[2].addTrapezoid(-4, 70, -4, 8, 4, 8, 0F, 4F, ModelRendererTurbo.MR_TOP);
		
		//Inside
		parachuteModel[3] = new ModelRendererTurbo(this, 0, 16, 128, 64);
		parachuteModel[3].flip = true;
		parachuteModel[3].addTrapezoid(-12, 38, -12, 24, 24, 24, 0F, -8F, ModelRendererTurbo.MR_TOP);
		parachuteModel[4] = new ModelRendererTurbo(this, 72, 0, 128, 64);
		parachuteModel[4].flip = true;
		parachuteModel[4].addTrapezoid(-8, 62, -8, 16, 8, 16, 0F, 4F, ModelRendererTurbo.MR_TOP);
		parachuteModel[5] = new ModelRendererTurbo(this, 24, 0, 128, 64);
		parachuteModel[5].flip = true;
		parachuteModel[5].addTrapezoid(-4, 70, -4, 8, 4, 8, 0F, 4F, ModelRendererTurbo.MR_TOP);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		backpackModel.render(f5);
		
		for(ModelRendererTurbo part : parachuteModel)
			part.render(f5);
	}
}
