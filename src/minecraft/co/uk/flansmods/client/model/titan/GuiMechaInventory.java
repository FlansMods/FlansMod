package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.ContainerMechaInventory;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiMechaInventory extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/mechaInventory.png");

	public ContainerMechaInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityMecha mecha;
	
    public GuiMechaInventory(InventoryPlayer inventoryplayer, World world1, EntityMecha entMecha)
    {
        super(new ContainerMechaInventory(inventoryplayer, world1, entMecha));
		mecha = entMecha;
		inventory = inventoryplayer;
		world = world1;
		container = (ContainerMechaInventory)inventorySlots;
		ySize = 180;
		xSize = 350;
		maxScroll = container.maxScroll;
		numItems = container.numItems;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
    	
    }
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub

	}

}
