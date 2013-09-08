package universalelectricity.compatibility;

import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergyAcceptor;
import ic2.api.energy.tile.IEnergyEmitter;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.energy.tile.IEnergyTile;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;
import universalelectricity.core.block.IConnector;
import universalelectricity.core.electricity.ElectricityPack;
import universalelectricity.core.vector.Vector3;
import universalelectricity.core.vector.VectorHelper;
import universalelectricity.prefab.tile.TileEntityConductor;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;
import buildcraft.api.power.PowerHandler.Type;

/**
 * A universal conductor class.
 * 
 * Extend this class or use as a reference for your own implementation of compatible conductor
 * tiles.
 * 
 * @author Calclavia, micdoodle8
 * 
 */
public abstract class TileEntityUniversalConductor extends TileEntityConductor implements IEnergySink, IPowerReceptor
{
	protected boolean isAddedToEnergyNet;
	public PowerHandler powerHandler;
	public float buildcraftBuffer = Compatibility.BC3_RATIO * 50;

	public TileEntityUniversalConductor()
	{
		this.powerHandler = new PowerHandler(this, Type.PIPE);
		this.powerHandler.configure(0, this.buildcraftBuffer, this.buildcraftBuffer, this.buildcraftBuffer * 2);
		this.powerHandler.configurePowerPerdition(0, 0);
	}

	@Override
	public TileEntity[] getAdjacentConnections()
	{
		if (this.adjacentConnections == null)
		{
			this.adjacentConnections = new TileEntity[6];

			for (byte i = 0; i < 6; i++)
			{
				ForgeDirection side = ForgeDirection.getOrientation(i);
				TileEntity tileEntity = VectorHelper.getTileEntityFromSide(this.worldObj, new Vector3(this), side);

				if (tileEntity instanceof IConnector)
				{
					if (((IConnector) tileEntity).canConnect(side.getOpposite()))
					{
						this.adjacentConnections[i] = tileEntity;
					}
				}
				else if (Compatibility.isIndustrialCraft2Loaded() && tileEntity instanceof IEnergyTile)
				{
					if (tileEntity instanceof IEnergyAcceptor)
					{
						if (((IEnergyAcceptor) tileEntity).acceptsEnergyFrom(this, side.getOpposite()))
						{
							this.adjacentConnections[i] = tileEntity;
							continue;
						}
					}

					if (tileEntity instanceof IEnergyEmitter)
					{
						if (((IEnergyEmitter) tileEntity).emitsEnergyTo(tileEntity, side.getOpposite()))
						{
							this.adjacentConnections[i] = tileEntity;
							continue;
						}
					}

					this.adjacentConnections[i] = tileEntity;
				}
				else if (Compatibility.isBuildcraftLoaded() && tileEntity instanceof IPowerReceptor)
				{
					this.adjacentConnections[i] = tileEntity;
				}
			}
		}

		return this.adjacentConnections;
	}

	/*
	 * @Override public boolean canUpdate() { return !this.isAddedToEnergyNet; }
	 */

	@Override
	public void updateEntity()
	{
		if (!this.worldObj.isRemote)
		{
			if (!this.isAddedToEnergyNet)
			{
				this.initIC();
			}
		}
	}

	@Override
	public void invalidate()
	{
		this.unloadTileIC2();
		super.invalidate();
	}

	@Override
	public void onChunkUnload()
	{
		this.unloadTileIC2();
		super.onChunkUnload();
	}

	protected void initIC()
	{
		if (Compatibility.isIndustrialCraft2Loaded())
		{
			MinecraftForge.EVENT_BUS.post(new EnergyTileLoadEvent(this));
		}

		this.isAddedToEnergyNet = true;
	}

	private void unloadTileIC2()
	{
		if (this.isAddedToEnergyNet && this.worldObj != null)
		{
			if (Compatibility.isIndustrialCraft2Loaded())
			{
				MinecraftForge.EVENT_BUS.post(new EnergyTileUnloadEvent(this));
			}

			this.isAddedToEnergyNet = false;
		}
	}

	@Override
	public double demandedEnergyUnits()
	{
		if (this.getNetwork() == null)
		{
			return 0.0;
		}

		return this.getNetwork().getRequest(this).getWatts() * Compatibility.TO_IC2_RATIO;
	}

	@Override
	public double injectEnergyUnits(ForgeDirection directionFrom, double amount)
	{
		TileEntity tile = VectorHelper.getTileEntityFromSide(this.worldObj, new Vector3(this), directionFrom);
		ElectricityPack pack = ElectricityPack.getFromWatts((float) (amount * Compatibility.IC2_RATIO), 120);
		return this.getNetwork().produce(pack, this, tile) * Compatibility.TO_IC2_RATIO;
	}

	@Override
	public int getMaxSafeInput()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction)
	{
		return true;
	}

	/**
	 * BuildCraft functions
	 */
	@Override
	public PowerReceiver getPowerReceiver(ForgeDirection side)
	{
		return this.powerHandler.getPowerReceiver();
	}

	@Override
	public void doWork(PowerHandler workProvider)
	{
		Set<TileEntity> ignoreTiles = new HashSet<TileEntity>();
		ignoreTiles.add(this);

		for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
		{
			TileEntity tile = new Vector3(this).modifyPositionFromSide(direction).getTileEntity(this.worldObj);
			ignoreTiles.add(tile);
		}

		ElectricityPack pack = ElectricityPack.getFromWatts(workProvider.useEnergy(0, this.getNetwork().getRequest(this).getWatts() * Compatibility.TO_BC_RATIO, true) * Compatibility.BC3_RATIO, 120);
		this.getNetwork().produce(pack, ignoreTiles.toArray(new TileEntity[0]));
	}

	@Override
	public World getWorld()
	{
		return this.getWorldObj();
	}
}
