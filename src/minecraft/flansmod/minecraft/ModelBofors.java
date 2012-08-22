package flansmod.minecraft;

import net.minecraft.src.ModelRendererTurbo;

public class ModelBofors extends ModelAAGun
{
    public ModelBofors()
    {
        baseModel = new ModelRendererTurbo[5];
        baseModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        baseModel[1] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        baseModel[2] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        baseModel[3] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        baseModel[4] = new ModelRendererTurbo(this, 0, 0, 128, 64);

        baseModel[0].addBox(-16F, -4F , -8F, 32, 2, 16, 0.0F);	//Base piece
		baseModel[1].addBox(-18F, -6F , -10F, 6, 6, 2, 0.0F);	//Wheel
		baseModel[2].addBox(-18F, -6F , 8F, 6, 6, 2, 0.0F);	//Wheel
		baseModel[3].addBox(12F, -6F , -10F, 6, 6, 2, 0.0F);	//Wheel
		baseModel[4].addBox(12F, -6F , 8F, 6, 6, 2, 0.0F);	//Wheel
		
		seatModel = new ModelRendererTurbo[2];
        seatModel[0] = new ModelRendererTurbo(this, 0, 18, 128, 64);
		seatModel[1] = new ModelRendererTurbo(this, 0, 36, 128, 64);

        seatModel[0].addBox(-6F, -18F , -2F, 12, 14, 4, 0.0F);	//swivelling turret piece
		seatModel[1].addBox(-6F, -8F , 2F, 12, 2, 12, 0.0F);	//seat
		
		gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 50, 128, 64);
        gunModel[0].addBox(0F, 0F , 0F, 30, 4, 4, 0.0F);
		
		barrelModel = new ModelRendererTurbo[1][1];
		barrelModel[0][0] = new ModelRendererTurbo(this, 0, 58, 128, 64);	
		barrelModel[0][0].addBox(30F, 1F , 1F, 20, 2, 2, 0.0F);
		
		//Even though I can't be bothered to add ammo models, this definition is still needed
		ammoModel = new ModelRendererTurbo[0][0];

		barrelX = -6;
		barrelY = 12;
		barrelZ = 6;
		
		flipAll(); //Used to fix old models
    }
}
