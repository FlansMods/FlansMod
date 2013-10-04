package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.common.ContainerPlaneInventory;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.ContainerMechaInventory;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiMechaInventory extends GuiContainer
{
	public ContainerPlaneInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityMecha mecha;
	
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/mechaInventory.png");

    public GuiMechaInventory(InventoryPlayer inventoryplayer, World world1, EntityMecha entMecha)
    {
        super(new ContainerMechaInventory(inventoryplayer, world1, entMecha));
    }
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub

	}

}
