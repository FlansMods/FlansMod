package co.uk.flansmods.common.driveables.mechas;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.vector.Vector3f;

public class EntityMecha extends EntityDriveable {

	public EntityMecha(World world, DriveableType t, DriveableData d) {
		super(world, t, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeUpdateData(DataOutputStream out) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readUpdateData(DataInputStream in) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMouseMoved(int deltaX, int deltaY) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean pressKey(int key, EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasMouseControlMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBombInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

}
