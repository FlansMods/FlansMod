package co.uk.flansmods.client;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import co.uk.flansmods.client.debug.EntityDebugAABB;
import co.uk.flansmods.client.debug.EntityDebugVector;
import co.uk.flansmods.client.debug.RenderDebugAABB;
import co.uk.flansmods.client.debug.RenderDebugVector;
import co.uk.flansmods.client.model.RenderAAGun;
import co.uk.flansmods.client.model.RenderBullet;
import co.uk.flansmods.client.model.RenderFlag;
import co.uk.flansmods.client.model.RenderFlagpole;
import co.uk.flansmods.client.model.RenderGrenade;
import co.uk.flansmods.client.model.RenderGun;
import co.uk.flansmods.client.model.RenderMG;
import co.uk.flansmods.client.model.RenderMecha;
import co.uk.flansmods.client.model.RenderNull;
import co.uk.flansmods.client.model.RenderParachute;
import co.uk.flansmods.client.model.RenderPlane;
import co.uk.flansmods.client.model.RenderVehicle;
import co.uk.flansmods.common.CommonProxy;
import co.uk.flansmods.common.EntityParachute;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import co.uk.flansmods.common.TileEntityGunBox;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.guns.EntityAAGun;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.EntityGrenade;
import co.uk.flansmods.common.guns.EntityMG;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.network.PacketDriveableCrafting;
import co.uk.flansmods.common.network.PacketRepairDriveable;
import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.EntityFlagpole;
import co.uk.flansmods.common.teams.TileEntitySpawner;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.discovery.ContainerType;
import cpw.mods.fml.common.discovery.ModCandidate;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	public static String modelDir = "co.uk.flansmods.client.model.";
	
	public static RenderGun gunRenderer;
	public List<File> contentPacks;

	@Override
	public void load()
	{
		new FlansModClient().load();
		gunRenderer = new RenderGun();
		for(GunType gunType : GunType.guns)
		{
			if(gunType.model != null)
				MinecraftForgeClient.registerItemRenderer(gunType.item.itemID, gunRenderer);
		}
	}

	@Override
	public List<File> getContentList(Method method, ClassLoader classloader)
	{
		contentPacks = new ArrayList<File>();
		for (File file : FlansMod.flanDir.listFiles())
		{
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				try
				{
					method.invoke(classloader, new Object[]
							{ file.toURI().toURL() });
					
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("modid", "FlansMod");
					map.put("name", "Flan's Mod : " + file.getName());
					map.put("version", "1");
					FMLModContainer container = new FMLModContainer("co.uk.flansmods.common.FlansMod", new ModCandidate(file, file, file.isDirectory() ? ContainerType.DIR : ContainerType.JAR), map);
					container.bindMetadata(MetadataCollection.from(null, ""));
					FMLClientHandler.instance().addModAsResource(container);
				
				} catch (Exception e)
				{
					FlansMod.log("Failed to load images for content pack : " + file.getName());
					e.printStackTrace();
				}
				// Add the directory to the content pack list
				FlansMod.log("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
			
		FlansMod.log("Loaded textures and models.");
		return contentPacks;
	}
	
	@Override
	public List<File> getContentList()
	{
		return contentPacks;
	}

	@Override
	public void loadDefaultGraphics()
	{		
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade());
		RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());
		RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlagpole.class, new RenderFlagpole());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlag.class, new RenderFlag());
		RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, new RenderNull());
		RenderingRegistry.registerEntityRenderingHandler(EntityMG.class, new RenderMG());
		RenderingRegistry.registerEntityRenderingHandler(EntityParachute.class, new RenderParachute());
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugVector.class, new RenderDebugVector());
		RenderingRegistry.registerEntityRenderingHandler(EntityDebugAABB.class, new RenderDebugAABB());
		RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new RenderMecha());
	}
	
	@Override
	public void registerTileEntityRenderers() 
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpawner.class, new TileEntitySpawnerRenderer());
	}
	
	@Override
	public void loadKeyBindings()
	{
		KeyBindingRegistry.registerKeyBinding(new KeyInputHandler());
	}
	
	@Override
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType)
	{
		if (!FlansModClient.doneTutorial)
		{
			FlansModClient.doneTutorial = true;
			
			if (entityType instanceof EntityPlane)
			{
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.keyCode) + " to open the menu");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.exitKey.keyCode) + " to get out");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.controlSwitchKey.keyCode) + " to switch controls");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasGear)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.gearKey.keyCode) + " to switch the gear");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasDoor)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.keyCode) + " to switch the doors");
				if(PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasWing)
					player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.wingKey.keyCode) + " to switch the wings");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.trimKey.keyCode) + " to reposition the plane");
			}
			else if (entityType instanceof EntityVehicle)
			{
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.keyCode) + " to open the menu");
				player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.exitKey.keyCode) + " to get out");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.keyCode) + " to switch the doors");
                player.addChatMessage("Press " + Keyboard.getKeyName(KeyInputHandler.trimKey.keyCode) + " to reposition the vehicle");
			}
		}
	}
	
	@Override
	public void changeControlMode(EntityPlayer player)
	{
		if(FlansModClient.flipControlMode())
			player.addChatMessage("Mouse Control mode is now set to " + FlansModClient.controlModeMouse);
	}
	
	@Override
	public boolean mouseControlEnabled()
	{
		return FlansModClient.controlModeMouse;
	}
	
	@Override
	public void playBlockBreakSound(int x, int y, int z, int blockID)
	{
		super.playBlockBreakSound(x, y, z, blockID);
	}
	
	@Override
	public void doTickStuff()
	{
		super.doTickStuff();
		TickRegistry.registerTickHandler(new TickHandlerClient(), Side.CLIENT);
	}

	@Override
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		//Null riding entity, don't open GUI in this case
		if(ID >= 6 && ID <= 10 && ((EntitySeat)player.ridingEntity) == null) return null;
		
		switch(ID) 
		{
			case 0: return new GuiDriveableCrafting(player.inventory, world, x, y, z);
			case 1: return new GuiDriveableRepair(player);
			case 2: return new GuiGunModTable(player.inventory, world);
			case 5: return new GuiGunBox(player.inventory, ((TileEntityGunBox)world.getBlockTileEntity(x, y, z)).getType());
			case 6: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
			case 7: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
			case 8: return new GuiDriveableFuel		(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable);
			case 9: return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
			case 10: return new GuiMechaInventory	(player.inventory, world, (EntityMecha)((EntitySeat)player.ridingEntity).driveable);
		}
		return null;
	}
	
	@Override
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable)
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiDriveableMenu(player.inventory, world, driveable));
	}
	
	private String getModelName(String in)
	{
		String[] split = in.split("\\.");
		if(split.length == 1)
			return "Model" + in;
		if(split.length > 1)
		{
			String out = "Model" + split[split.length - 1];
			for(int i = split.length - 2; i >= 0; i--)
			{
				out = split[i] + "." + out;
			}
			return out;
		}
		return in;
	}
	
	@Override
	public <T> T loadModel(String s, String shortName, Class<T> typeClass)
	{
		if(s == null || shortName == null)
			return null;
		try 
		{	
			return typeClass.cast(Class.forName(modelDir + getModelName(s)).getConstructor().newInstance());
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load model : " + shortName + " (" + s + ")");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void loadSound(String contentPack, String type, String sound)
	{
		FlansModResourceHandler.getSound(contentPack, type, sound);
		//FMLClientHandler.instance().getClient().installResource("sound3/" + type + "/" + sound + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + sound + ".ogg"));
	}
	
	@Override
	public boolean isThePlayer(EntityPlayer player)
	{
		return player == FMLClientHandler.instance().getClient().thePlayer;
	}
	
	@Override
	public void buyGun(GunBoxType type, int gun)
	{
		PacketDispatcher.sendPacketToServer(PacketBuyWeapon.buildBuyWeaponPacket(type, 0, gun));
		FlansModClient.shootTime = 10;
	}

	@Override
	public void buyAmmo(GunBoxType box, int ammo, int type)
	{
		PacketDispatcher.sendPacketToServer(PacketBuyWeapon.buildBuyWeaponPacket(box, type, ammo));
		FlansModClient.shootTime = 10;
	}
	
	@Override
	public void craftDriveable(EntityPlayer player, DriveableType type)
	{
		//Craft it this side (so the inventory updates immediately) and then send a packet to the server so that it is crafted that side too
		super.craftDriveable(player, type);
		if(player.worldObj.isRemote)
			PacketDispatcher.sendPacketToServer(PacketDriveableCrafting.buildCraftingPacket(type.shortName));
	}
	
	@Override
	public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part)
	{
		//Repair it this side (so the inventory updates immediately) and then send a packet to the server so that it is repaired that side too
		super.repairDriveable(driver, driving, part);
		if(driver.worldObj.isRemote)
			PacketDispatcher.sendPacketToServer(PacketRepairDriveable.buildRepairPacket(part.type));
	}
	
	@Override
	public boolean isScreenOpen()
	{
		return Minecraft.getMinecraft().currentScreen != null;
	}
	
	@Override
	public boolean isKeyDown(int key)
	{
		switch(key)
		{
		case 0 : //Press Forwards
			return keyDown(KeyInputHandler.accelerateKey.keyCode);
			
		case 1 : //Press Backwards
			return keyDown(KeyInputHandler.decelerateKey.keyCode);
			
		case 2 : //Press Left
			return keyDown(KeyInputHandler.leftKey.keyCode);
			
		case 3 : //Press Right
			return keyDown(KeyInputHandler.rightKey.keyCode);
		}
		return false;
	}
	
	@Override
	public boolean keyDown(int keycode)
	{
	   	boolean state = (keycode < 0 ? Mouse.isButtonDown(keycode + 100) : Keyboard.isKeyDown(keycode));
    	return state;
	}
}