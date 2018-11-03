package com.flansmod.common.driveables.mechas;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

public class MechaType extends DriveableType
{
	/**
	 * Movement modifiers
	 */
	public float turnLeftModifier = 1F, turnRightModifier = 1F, moveSpeed = 1F;
	/**
	 * If true, this will crush any living entity under the wheels
	 */
	public boolean squashMobs = false;
	/**
	 * How many blocks can be stepped up when walking
	 */
	public int stepHeight = 0;
	/**
	 * Jump Height (set 0 for no jump)
	 */
	public float jumpHeight = 1F;
	public float jumpVelocity = 1F;
	/**
	 * Speed of Rotation
	 */
	public float rotateSpeed = 10F;
	/**
	 * Origin of the mecha arms
	 */
	public Vector3f leftArmOrigin, rightArmOrigin;
	/**
	 * Length of the mecha arms and legs
	 */
	public float armLength = 1F, legLength = 1F, RearlegLength = legLength, FrontlegLength = legLength, LegTrans = 0F, RearLegTrans = 0F, FrontLegTrans = 0F;
	/**
	 * The amount to scale the held items / tools by when rendering
	 */
	public float heldItemScale = 1F;
	/**
	 * Height and Width of the world collision box
	 */
	public float height = 3F, width = 2F;
	/**
	 * The height of chassis above the ground; for use when legs are gone
	 */
	public float chassisHeight = 1F;
	
	/**
	 * The default reach of tools. Tools can multiply this base reach as they wish
	 */
	public float reach = 10F;
	
	//Falling
	/**
	 * Whether the mecha damages blocks when falling. Can be overriden by upgrades
	 */
	public boolean damageBlocksFromFalling = true;
	/**
	 * The size of explosion to cause, per fall damage
	 */
	public float blockDamageFromFalling = 1F;
	
	/**
	 * Whether the mecha takes fall damage. Can be overriden by upgrades
	 */
	public boolean takeFallDamage = true;
	/**
	 * How much fall damage the mecha takes by default
	 */
	public float fallDamageMultiplier = 1F;
	
	/**
	 * Leg Swing Limit
	 */
	public float legSwingLimit = 2F;

	// Limiting head turning
	public boolean limitHeadTurn = false;
	public float limitHeadTurnValue = 90F;

	// Speed of Leg movement
	public float legSwingTime = 5;

	// Upper/Lower Arm Limit
	public float upperArmLimit = 90;
	public float lowerArmLimit = 90;

	// Modifier for Weapons in Hand
	public float leftHandModifierX = 0;
	public float leftHandModifierY = 0;
	public float leftHandModifierZ = 0;
	public float rightHandModifierX = 0;
	public float rightHandModifierY = 0;
	public float rightHandModifierZ = 0;

	public static ArrayList<MechaType> types = new ArrayList<>();

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
				jumpVelocity = (float)Math.sqrt(Math.abs(9.81F * (jumpHeight + 0.2F) / 200F));
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
			if(split[0].equals("LegTrans"))
				LegTrans = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("RearLegLength"))
				RearlegLength = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("FrontLegLength"))
				FrontlegLength = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("RearLegTrans"))
				RearLegTrans = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("FrontLegTrans"))
				FrontLegTrans = Float.parseFloat(split[1]) / 16F;
			if(split[0].equals("HeldItemScale"))
				heldItemScale = Float.parseFloat(split[1]);
			if(split[0].equals("Height"))
				height = (Float.parseFloat(split[1]) / 16F);
			if(split[0].equals("Width"))
				width = (Float.parseFloat(split[1]) / 16F);
			if(split[0].equals("ChassisHeight"))
				chassisHeight = (Integer.parseInt(split[1])) / 16F;
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
			if(split[0].equals("UpperArmLimit"))
				upperArmLimit = Float.parseFloat(split[1]);
			if(split[0].equals("LowerArmLimit"))
				lowerArmLimit = Float.parseFloat(split[1]);
			if(split[0].equals("LeftHandModifier"))
			{
				leftHandModifierX = Float.parseFloat(split[1]) / 16F;
				leftHandModifierY = Float.parseFloat(split[2]) / 16F;
				leftHandModifierZ = Float.parseFloat(split[3]) / 16F;
			}
			if(split[0].equals("RightHandModifier"))
			{
				rightHandModifierX = Float.parseFloat(split[1]) / 16F;
				rightHandModifierY = Float.parseFloat(split[2]) / 16F;
				rightHandModifierZ = Float.parseFloat(split[3]) / 16F;
			}
		}
		catch(Exception ignored)
		{
		}
	}

	/**
	 * Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up
	 */
	@Override
	public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
	{
		//Get the list of items required by the driveable
		ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
		//Add the propellers and engines
		if(EnumDriveablePart.core == part.type)
		{
			stacks.add(new ItemStack(engine.item));
		}
		return stacks;
	}
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
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
	
	@Override
	public EntityDriveable createDriveable(World world, double x, double y, double z, DriveableData data)
	{
		return new EntityMecha(world, x, y, z, this, data, new NBTTagCompound());
	}
}
