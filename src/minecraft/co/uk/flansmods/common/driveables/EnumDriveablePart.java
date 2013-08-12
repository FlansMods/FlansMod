package co.uk.flansmods.common.driveables;

public enum EnumDriveablePart 
{
	tailWheel(new EnumDriveablePart[] { }, "tailWheel"),
	tail(new EnumDriveablePart[] { tailWheel }, "tail"),
	bay(new EnumDriveablePart[] { tail }, "bay"),
	topWing(new EnumDriveablePart[] {}, "topWing"),
	leftWingWheel(new EnumDriveablePart[] { }, "leftWingWheel"),
	leftWing(new EnumDriveablePart[] { topWing, leftWingWheel }, "leftWing"),
	rightWingWheel(new EnumDriveablePart[] { }, "rightWingWheel"),
	rightWing(new EnumDriveablePart[] { topWing, rightWingWheel }, "rightWing"),
	nose(new EnumDriveablePart[] { }, "nose"),
	turret(new EnumDriveablePart[] { }, "turret"),	//For vehicles
	coreWheel(new EnumDriveablePart[] { }, "coreWheel"),
	core(new EnumDriveablePart[] { bay, leftWing, rightWing, nose, turret, coreWheel }, "core");
	
	private String name;
	private EnumDriveablePart[] children;
	
	private EnumDriveablePart(EnumDriveablePart[] parts, String s)
	{
		children = parts;
		name = s;
	}
	
	/** Used to determine what falls off when this part is broken */
	public EnumDriveablePart[] getChildren()
	{
		return children;
	}
	
	public String getName()
	{
		return name;
	}
	
	/** For reading parts from driveable files */
	public static EnumDriveablePart getPart(String s)
	{
		for(EnumDriveablePart part : values())
			if(part.getName().equals(s))
				return part;
		return null;
	}
}
