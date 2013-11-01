package co.uk.flansmods.common.driveables.mechas;

import java.util.ArrayList;

import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.vector.Vector3f;

public class MechaType extends DriveableType 
{
	/** Movement modifiers */
	public float turnLeftModifier = 1F, turnRightModifier = 1F, moveSpeed = 1F;
	/** If true, this will crush any living entity under the wheels */
	public boolean squashMobs = false;
	/** How many blocks can be stepped up when walking */
	public int stepHeight = 0;
	/** Jump Height (set 0 for no jump) */
	public float jumpHeight = 1F;
	public float jumpVelocity = 1F;
	/** Speed of Rotation */
	public float rotateSpeed = 10F;
	/** Origin of the mecha arms */
	public Vector3f leftArmOrigin, rightArmOrigin;
	/** Length of the mecha arms and legs */
	public float armLength = 1F, legLength = 1F;
	/** The amount to scale the held items / tools by when rendering */
	public float heldItemScale = 1F;
	/** Height and Width of the world collision box */
	public float height = 3F, width = 2F;
	/** The height of chassis above the ground; for use when legs are gone */
	public float chassisHeight = 1F;
	
	/** The default reach of tools. Tools can multiply this base reach as they wish */
	public float reach = 10F;
	
	//Falling
	/** Whether the mecha damages blocks when falling. Can be overriden by upgrades */
	public boolean damageBlocksFromFalling = true;
	/** The size of explosion to cause, per fall damage */
	public float blockDamageFromFalling = 1F;
	
	/** Whether the mecha takes fall damage. Can be overriden by upgrades */
	public boolean takeFallDamage = true;
	/** How much fall damage the mecha takes by default */
	public float fallDamageMultiplier = 1F;
	
	/** Leg Swing Limit */
	public float legSwingLimit = 2F;	

	// Limiting head turning
	public boolean limitHeadTurn = false;
	public float limitHeadTurnValue = 90F;

	// Speed of Leg movement
	public float legSwingTime = 5;

	public static ArrayList<MechaType> types = new ArrayList<MechaType>();

	public MechaType(TypeFile file)
	{
		super(file);
		types.add(this);
	}
	
    @Override
	protected void read(String[] split, TypeFile file)
    {
		super.read(split, file);
		try
		{
			//Movement modifiers
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("MoveSpeed"))
				moveSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("SquashMobs"))
				squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("StepHeight"))
				stepHeight = Integer.parseInt(split[1]);
			if(split[0].equals("JumpHeight"))
			{
				jumpHeight = Float.parseFloat(split[1]);
				jumpVelocity = (float) Math.sqrt(Math.abs(9.81F * (jumpHeight + 0.2F) / 200F));
			}
			if(split[0].equals("RotateSpeed"))
				rotateSpeed = Float.parseFloat(split[1]);
			
			if(split[0].equals("LeftArmOrigin"))
				leftArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			if(split[0].equals("RightArmOrigin"))
				rightArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			if(split[0].equals("ArmLength"))
				armLength = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("LegLength"))
				legLength = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("HeldItemScale"))
				heldItemScale = Float.parseFloat(split[1]);
			if(split[0].equals("Height"))
				height = (Float.parseFloat(split[1])/16F);
			if(split[0].equals("Width"))
				width = (Float.parseFloat(split[1])/16F);
			if(split[0].equals("ChassisHeight"))
				chassisHeight = (Integer.parseInt(split[1]))/16F;
			if(split[0].equals("FallDamageMultiplier"))
				fallDamageMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("BlockDamageFromFalling"))
				blockDamageFromFalling = Float.parseFloat(split[1]);
			if(split[0].equals("Reach"))
				reach = Float.parseFloat(split[1]);
			if(split[0].equals("TakeFallDamage"))
				takeFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("DamageBlocksFromFalling"))
				damageBlocksFromFalling = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("LegSwingLimit"))
				legSwingLimit = Float.parseFloat(split[1]);
			if(split[0].equals("LimitHeadTurn"))
			{
				limitHeadTurn = Boolean.parseBoolean(split[1].toLowerCase());
				limitHeadTurnValue = Float.parseFloat(split[2]);
			}
			if(split[0].equals("LegSwingTime"))
				legSwingTime = Float.parseFloat(split[1]);
		}
		catch (Exception e)
		{
		}
    }
    
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelMecha.class);
	}
    
	public static MechaType getMecha(String find)
	{
		for(MechaType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
}
