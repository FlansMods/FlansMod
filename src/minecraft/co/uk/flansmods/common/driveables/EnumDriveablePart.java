package co.uk.flansmods.common.driveables;

public enum EnumDriveablePart 
{
	tailWheel(new EnumDriveablePart[] { }, "tailWheel", "Wheel (Tail)"),
	tail(new EnumDriveablePart[] { tailWheel }, "tail", "Tail"),
	bay(new EnumDriveablePart[] { tail }, "bay", "Bay"),
	topWing(new EnumDriveablePart[] {}, "topWing", "Top Wing"),
	leftWingWheel(new EnumDriveablePart[] { }, "leftWingWheel", "Wheel (Left Wing)"),
	leftWing(new EnumDriveablePart[] { topWing, leftWingWheel }, "leftWing", "Left Wing"),
	rightWingWheel(new EnumDriveablePart[] { }, "rightWingWheel", "Wheel (Right Wing)"),
	rightWing(new EnumDriveablePart[] { topWing, rightWingWheel }, "rightWing", "Right Wing"),
	nose(new EnumDriveablePart[] { }, "nose", "Nose"),
	turret(new EnumDriveablePart[] { }, "turret", "Turret"),	//For vehicles
	coreWheel(new EnumDriveablePart[] { }, "coreWheel", "Wheel (Core)"),
	core(new EnumDriveablePart[] { bay, leftWing, rightWing, nose, turret, coreWheel }, "core", "Core");
	
	private String shortName;
	private String name;
	private EnumDriveablePart[] children;
	
	private EnumDriveablePart(EnumDriveablePart[] parts, String s, String s2)
	{
		children = parts;
		shortName = s;
		name = s2;
	}
	
	/** Used to determine what falls off when this part is broken */
	public EnumDriveablePart[] getChildren()
	{
		return children;
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getName()
	{
		return name;
	}
	
	/** For reading parts from driveable files */
	public static EnumDriveablePart getPart(String s)
	{
		for(EnumDriveablePart part : values())
			if(part.getShortName().equals(s))
				return part;
		return null;
	}
	
	public static boolean isWheel(EnumDriveablePart part)
	{
		return part == coreWheel || part == tailWheel || part == leftWingWheel || part == rightWingWheel;
	}
}
