package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGun extends ModelBase
{
	//Shapebox template. For quick copy pasting
	//, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

	//These first 7 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] backpackModel = new ModelRendererTurbo[0]; //For flamethrowers and such like. Rendered on the player's back
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGripModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGadgetModel = new ModelRendererTurbo[0];

	//Animated models follow.
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] fullammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolverBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolver2BarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] breakActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] altbreakActionModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altslideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] chargeModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altpumpModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] minigunBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leverActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] hammerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] althammerModel = new ModelRendererTurbo[0];
	/** The point about which the minigun barrel rotates. Rotation is along the line of the gun through this point */
	public Vector3f minigunBarrelOrigin = new Vector3f();

	//These designate the locations of 3D attachment models on the gun
	public Vector3f barrelAttachPoint = new Vector3f();
	public Vector3f scopeAttachPoint = new Vector3f();
	public Vector3f stockAttachPoint = new Vector3f();
	public Vector3f gripAttachPoint = new Vector3f();
	public Vector3f gadgetAttachPoint = new Vector3f();
	public Vector3f slideAttachPoint = new Vector3f();
	public Vector3f pumpAttachPoint = new Vector3f();
	public Vector3f accessoryAttachPoint = new Vector3f();

	//Muzzle flash models
	public Vector3f defaultBarrelFlashPoint = new Vector3f(0,0,0);
	public Vector3f muzzleFlashPoint = new Vector3f(0,0,0);
	public boolean hasFlash = false;

	//Arms rendering
	public boolean hasArms = false;
	public Vector3f leftArmPos = new Vector3f(0,0,0);
	public Vector3f leftArmRot = new Vector3f(0,0,0);
	public Vector3f leftArmScale = new Vector3f(1,1,1);

	public Vector3f rightArmPos = new Vector3f(0,0,0);
	public Vector3f rightArmRot = new Vector3f(0,0,0);
	public Vector3f rightArmScale = new Vector3f(1,1,1);

	public Vector3f rightArmReloadPos = new Vector3f(0,0,0);
	public Vector3f rightArmReloadRot = new Vector3f(0,0,0);
	public Vector3f leftArmReloadPos = new Vector3f(0,0,0);
	public Vector3f leftArmReloadRot = new Vector3f(0,0,0);
	
	public Vector3f rightArmChargePos = new Vector3f(0,0,0);
	public Vector3f rightArmChargeRot = new Vector3f(0,0,0);
	public Vector3f leftArmChargePos = new Vector3f(0,0,0);
	public Vector3f leftArmChargeRot = new Vector3f(0,0,0);
	
	public Vector3f stagedrightArmReloadPos = new Vector3f(0,0,0);
	public Vector3f stagedrightArmReloadRot = new Vector3f(0,0,0);
	public Vector3f stagedleftArmReloadPos = new Vector3f(0,0,0);
	public Vector3f stagedleftArmReloadRot = new Vector3f(0,0,0);

	public boolean rightHandAmmo = false;
	public boolean leftHandAmmo = false;

	/** Recoil and slide based parameters */
	public float gunSlideDistance = 1F / 4F;
	public float altgunSlideDistance = 1F / 4F;
	public float RecoilSlideDistance = 2F / 16F;
	public float RotateSlideDistance = -3F;
	public float ShakeDistance = 0F;
	/** Select an amount of recoil per shot, between 0 and 1 */
	public float recoilAmount = 0.33F;

	/** Casing and muzzle flash parameters */
    //  Total distance to translate
    public Vector3f casingAnimDistance = new Vector3f(0, 0, 16);
    //  Total range in variance for random motion
    public Vector3f casingAnimSpread = new Vector3f(2, 4, 4);
    //  Number of ticks (I guess?) to complete movement 
    public int casingAnimTime = 20;
    //  Rotation of the casing, 180 is the total rotation. If you do not understand rotation vectors, like me, just use the standard value here.
    public Vector3f casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	public Vector3f casingAttachPoint = new Vector3f();
	// Time before the casing is ejected from gun
	public int casingDelay = 0;
	// Scale the bullet casing separately from gun
	public float caseScale = 1F;
	public float flashScale = 1F;

    // Charge handle distance/delay/time
    public float chargeHandleDistance = 0F;
    public int chargeDelay = 0, chargeDelayAfterReload = 0, chargeTime = 1;

	/**
	 * Bullet Counter Models. Can be used to display bullet count in-game interface.
	 * Each part is represented by number of rounds remaining per magazine.
	 *
	 * - Simple counter will loop through each part. Allows flexibility for bullet counter UI design.
	 *
	 * - Adv counter used for counting mags of more than 10, to reduce texture parts. Divides count into digits.
	 *	 Less flexibility as it requires 10 textures parts at maximum (numbers 0-9).
	 */
	public ModelRendererTurbo[] bulletCounterModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[][] advBulletCounterModel = new ModelRendererTurbo[0][0];
	/** For Adv Bullet Counter. Reads in numbers from left hand side when false */
	public boolean countOnRightHandSide = false;
	/** Toggle the counters active. Saves render performance. */
	public boolean isBulletCounterActive, isAdvBulletCounterActive = false;

    
	public EnumAnimationType animationType = EnumAnimationType.NONE;
	public EnumMeleeAnimation meleeAnimation = EnumMeleeAnimation.DEFAULT;
	public float tiltGunTime = 0.15F, unloadClipTime = 0.35F, loadClipTime = 0.35F, untiltGunTime = 0.15F;
	/** If true, then the scope attachment will move with the top slide */
	public boolean scopeIsOnSlide = false;
	/** If true, then the scope attachment will move with the break action. Can be combined with the above */
	public boolean scopeIsOnBreakAction = false;
	/** For rifles and shotguns. Currently a generic reload animation regardless of how full the internal magazine already is */
	public float numBulletsInReloadAnimation = 1;
	/** For shotgun pump handles, rifle bolts and hammer pullbacks */
	public int pumpDelay = 0, pumpDelayAfterReload = 0, pumpTime = 1, hammerDelay = 0;
	/** For shotgun pump handle */
	public float pumpHandleDistance = 4F / 16F;
	/** For end loaded projectiles */
	public float endLoadedAmmoDistance = 1F;
	/** For break action projectiles */
	public float breakActionAmmoDistance = 1F;
	/** If true, then the grip attachment will move with the shotgun pump */
	public boolean gripIsOnPump = false;
	/** If true, then the gadget attachment will move with the shotgun pump */
	public boolean gadgetIsOnPump = false;
	/** The rotation point for the barrel break */
	public Vector3f barrelBreakPoint = new Vector3f();
	public Vector3f altbarrelBreakPoint = new Vector3f();
	/** The amount the revolver barrel flips out by */
	public float revolverFlipAngle = 15F;
	/** The amount the revolver2 barrel flips out by */
	public float revolver2FlipAngle = 15F;
	/** The rotation point for the revolver flip */
	public Vector3f revolverFlipPoint = new Vector3f();
	/** The rotation point for the revolver2 flip */
	public Vector3f revolver2FlipPoint = new Vector3f();
	/** The angle the gun is broken by for break actions */
	public float breakAngle = 45F;
	public float altbreakAngle = 45F;
	/** If true, then the gun will perform a spinning reload animation */
	public boolean spinningCocking = false;
	/** The point, in model co-ordinates, about which the gun is spun */
	public Vector3f spinPoint = new Vector3f();
	/** The point where the hammer will pivot and spin from */
	public Vector3f hammerSpinPoint = new Vector3f();
	public Vector3f althammerSpinPoint = new Vector3f();
	public float hammerAngle = 75F;
	public float althammerAngle = 75F;
	/** Single action cocking check */
	public boolean isSingleAction = false;
	/** If true, lock the slide when the last bullet is fired */
	public boolean slideLockOnEmpty = false;
	/** If true, move the hands with the pump action */
	public boolean lefthandPump = false;
	public boolean righthandPump = false;
	/** If true, move the hands with the charge action */
	public boolean rightHandCharge = false;
	public boolean leftHandCharge = false;
	/** If true, move the hands with the bolt action */
	public boolean rightHandBolt = false;
	public boolean leftHandBolt = false;
	public float pumpModifier = 4F;
	public Vector3f chargeModifier = new Vector3f(8F, 4F, 4F);
	/**If true, gun will translate when equipped with a sight attachment */
	public float gunOffset = 0F;
	public float crouchZoom = 0F;
	public boolean fancyStance = false;
	public Vector3f stanceTranslate = new Vector3f();
	public Vector3f stanceRotate = new Vector3f();


	/** Custom reload Parameters. If Enum.CUSTOM is set, these parameters can build an animation within the gun model classes */
	public float rotateGunVertical = 0F;
	public float rotateGunHorizontal = 0F;
	public float tiltGun = 0F;
	public Vector3f translateGun = new Vector3f(0F, 0F, 0F);
	/* Ammo Model reload parameters */
	public float rotateClipVertical = 0F;
	public float stagedrotateClipVertical = 0F;
	public float rotateClipHorizontal = 0F;
	public float stagedrotateClipHorizontal = 0F;
	public float tiltClip = 0F;
	public float stagedtiltClip = 0F;
	public Vector3f translateClip = new Vector3f(0F, 0F, 0F);
	public Vector3f stagedtranslateClip = new Vector3f(0F, 0F, 0F);
	public boolean stagedReload = false;
	

	/** This offsets the render position for third person */
	public Vector3f thirdPersonOffset = new Vector3f();

	/** This offsets the render position for item frames */
	public Vector3f itemFrameOffset = new Vector3f();

	//lighting stuff
	private static float lightmapLastX;
    private static float lightmapLastY;
	private static boolean optifineBreak = false;

	public static void glowOn()
	{
		glowOn(15);
	}

    public static void glowOn(int glow)
    {
        GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);

        GL11.glEnable(GL11.GL_BLEND);
		//GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

        try
		{
        	lightmapLastX = OpenGlHelper.lastBrightnessX;
        	lightmapLastY = OpenGlHelper.lastBrightnessY;
        }
		catch(NoSuchFieldError e)
		{
        	optifineBreak = true;
        }

        float glowRatioX = Math.min((glow/15F)*240F + lightmapLastX, 240);
        float glowRatioY = Math.min((glow/15F)*240F + lightmapLastY, 240);

        if(!optifineBreak)
        {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, glowRatioX, glowRatioY);
        }
    }

    public static void glowOff()
    {
        GL11.glEnable(GL11.GL_LIGHTING);
    	if(!optifineBreak)
    	{
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapLastX, lightmapLastY);
    	}

        GL11.glPopAttrib();
    }

	public void renderGun(float f)
	{
		render(gunModel, f);
	}

	public void renderSlide(float f)
	{
		render(slideModel, f);
	}
	
	public void renderaltSlide(float f)
	{
		render(altslideModel, f);
	}

	public void renderPump(float f)
	{
		render(pumpModel, f);
	}
	
	public void renderaltPump(float f)
	{
		render(altpumpModel, f);
	}
	
	public void renderCharge(float f)
	{
		render(chargeModel, f);
	}

	public void renderDefaultScope(float f)
	{
		render(defaultScopeModel, f);
	}

	public void renderDefaultBarrel(float f)
	{
		render(defaultBarrelModel, f);
	}

	public void renderDefaultStock(float f)
	{
		render(defaultStockModel, f);
	}

	public void renderDefaultGrip(float f)
	{
		render(defaultGripModel, f);
	}

	public void renderDefaultGadget(float f)
	{
		render(defaultGadgetModel, f);
	}

	public void renderAmmo(float f)
	{
		render(ammoModel, f);
	}

	public void renderfullAmmo(float f)
	{
		render(fullammoModel, f);
	}
	
	public void renderMinigunBarrel(float f)
	{
		render(minigunBarrelModel, f);
	}

	public void renderRevolverBarrel(float f)
	{
		render(revolverBarrelModel, f);
	}

	public void renderRevolver2Barrel(float f)
	{
		render(revolver2BarrelModel, f);
	}

	public void renderBreakAction(float f)
	{
		render(breakActionModel, f);
	}
	
	public void renderaltBreakAction(float f)
	{
		render(altbreakActionModel, f);
	}

	public void renderHammer(float f)
	{
		render(hammerModel, f);
	}

	public void renderaltHammer(float f)
	{
		render(althammerModel, f);
	}

	public void renderBulletCounter(float f, int k)
	{
		for(int i = 0; i < bulletCounterModel.length; i++)
		{
			if(i == k)
			{
				glowOn();
				bulletCounterModel[i].render(f);
				glowOff();
			}
		}
	}

	public void renderAdvBulletCounter(float f, int k, boolean rhs)
	{
		//Divide the ammo count into array of ints
		char[] count = String.valueOf(k).toCharArray();
		int[] digits = new int[count.length];

		for(int i = 0; i < count.length ; i++)
		{
			if(!rhs)
				digits[i] = count[i] - 48;						//read digits left hand side
			else
				digits[digits.length - 1 - i] = count[i] - 48;	//read digits right hand side
		}

		//Loop though the array, and manage ammo count render.
		for(int i = 0; i < digits.length ; i++)
		{
			for(int j = 0; j < advBulletCounterModel[i].length; j++)
			{
				if (digits[i] == j)
				{
					glowOn();
					advBulletCounterModel[i][j].render(f);
					glowOff();
				}
			}
		}
	}


	/** For renderering models simply */
	protected void render(ModelRendererTurbo[] models, float f)
	{
		for(ModelRendererTurbo model : models)
			if(model != null)
				model.render(f);
	}

	/** Flips the model. Generally only for backwards compatibility */
	public void flipAll()
	{
		flip(gunModel);
		flip(defaultBarrelModel);
		flip(defaultScopeModel);
		flip(defaultStockModel);
		flip(defaultGripModel);
		flip(defaultGadgetModel);
		flip(ammoModel);
		flip(fullammoModel);
		flip(slideModel);
		flip(altslideModel);
		flip(pumpModel);
		flip(altpumpModel);
		flip(chargeModel);
		flip(minigunBarrelModel);
		flip(revolverBarrelModel);
		flip(revolver2BarrelModel);
		flip(breakActionModel);
		flip(altbreakActionModel);
		flip(hammerModel);
		flip(althammerModel);
		flip(bulletCounterModel);
		for(ModelRendererTurbo[] mod : advBulletCounterModel)
			flip(mod);
	}

	protected void flip(ModelRendererTurbo[] model)
	{
		for(ModelRendererTurbo part : model)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
		}
	}

	/** Translates the model */
	public void translateAll(float x, float y, float z)
	{
    	{
    		translate(gunModel, x, y, z);
    		translate(defaultBarrelModel, x, y, z);
    		translate(defaultScopeModel, x, y, z);
    		translate(defaultStockModel, x, y, z);
    		translate(defaultGripModel, x, y, z);
    		translate(defaultGadgetModel, x, y, z);
    		translate(ammoModel, x, y, z);
    		translate(fullammoModel, x, y, z);
    		translate(slideModel, x, y, z);
    		translate(altslideModel, x, y, z);
    		translate(pumpModel, x, y, z);
    		translate(altpumpModel, x, y, z);
    		translate(chargeModel, x, y, z);
    		translate(minigunBarrelModel, x, y, z);
    		translate(revolverBarrelModel, x, y, z);
    		translate(revolver2BarrelModel, x, y, z);
    		translate(breakActionModel, x, y, z);
    		translate(altbreakActionModel, x, y, z);
    		translate(hammerModel, x, y, z);
    		translate(althammerModel, x, y, z);
			translate(bulletCounterModel, x, y, z);
			for(ModelRendererTurbo[] mod : advBulletCounterModel)
				translate(mod, x, y, z);
    	}
	}

	protected void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
}
