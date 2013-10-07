package co.uk.flansmods.common.driveables.mechas;

import java.util.ArrayList;

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
	/** Length of the mecha arms */
	public float armLength = 1F;
	/** The amount to scale the held items / tools by when rendering */
	public float heldItemScale = 1F;
	/** Height and Width of the world collision box */
	public float height = 3F;
	public float width = 2F;
	/** The height of chassis above the ground; for use when legs are gone */
	public float chassisHeight = 1F;
	
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
				leftArmOrigin = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			if(split[0].equals("RightArmOrigin"))
				rightArmOrigin = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			if(split[0].equals("ArmLength"))
				armLength = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("HeldItemScale"))
				heldItemScale = Float.parseFloat(split[1]);
			if(split[0].equals("Height"))
				height = (Float.parseFloat(split[1])/16F);
			if(split[0].equals("Width"))
				width = (Float.parseFloat(split[1])/16F);
			if(split[0].equals("ChassisHeight"))
				chassisHeight = (Integer.parseInt(split[1]))/16F;
		}
		catch (Exception e)
		{
		}
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
