package co.uk.flansmods.common.driveables;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class EntityDamageSourceCollision extends EntityDamageSource 
{
	public EntityDriveable source;
	
	public EntityDamageSourceCollision(EntityDriveable driveable) 
	{
		super(driveable.getDriveableType().shortName, driveable);
		source = driveable;
	}

}
