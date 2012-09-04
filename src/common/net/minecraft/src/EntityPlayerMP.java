package net.minecraft.src;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import flan.server.ServerHexAPI;
import flan.server.ServerPlayerBase;
import net.minecraft.server.MinecraftServer;

public class EntityPlayerMP extends EntityPlayer implements ICrafting
{
    private StringTranslate translator = new StringTranslate("en_US");

    /** set by the NetServerHandler or the ServerConfigurationManager */
    public NetServerHandler serverForThisPlayer;

    /** Reference to the MinecraftServer object. */
    public MinecraftServer mcServer;

    /** The ItemInWorldManager belonging to this player */
    public ItemInWorldManager theItemInWorldManager;

    /** player X position as seen by PlayerManager */
    public double managedPosX;

    /** player Z position as seen by PlayerManager */
    public double managedPosZ;
    public final List chunksToLoad = new LinkedList();

    /** entities added to this list will  be packet29'd to the player */
    public final List destroyedItemsNetCache = new LinkedList();

    /** set to getHealth */
    private int lastHealth = -99999999;

    /** set to foodStats.GetFoodLevel */
    private int lastFoodLevel = -99999999;

    /** set to foodStats.getSaturationLevel() == 0.0F each tick */
    private boolean wasHungry = true;

    /** Amount of experience the client was last set to */
    private int lastExperience = -99999999;

    /** de-increments onUpdate, attackEntityFrom is ignored if this >0 */
    private int initialInvulnerability = 60;

    /** must be between 3>x>15 (strictly between) */
    private int renderDistance = 0;
    private int chatVisibility = 0;
    private boolean chatColours = true;

    /**
     * 0 is the held item, 1-4 is armor ; used to detect changes in getCurrentItemOrArmor
     */
    private ItemStack[] lastActiveItems = new ItemStack[] {null, null, null, null, null};

    /**
     * The currently in use window ID. Incremented every time a window is opened.
     */
    public int currentWindowId = 0;

    /**
     * poor mans concurency flag, lets hope the jvm doesn't re-order the setting of this flag wrt the inventory change
     * on the next line
     */
    public boolean playerInventoryBeingManipulated;
    public int ping;

    /** set to true when the player is leaving the End after success. */
    public boolean playerHasConqueredTheEnd = false;
    public final ServerHexAPI SHPAPI = ServerHexAPI.create(this);
    
    public EntityPlayerMP(MinecraftServer par1MinecraftServer, World par2World, String par3Str, ItemInWorldManager par4ItemInWorldManager)
    {
        super(par2World);
        par4ItemInWorldManager.thisPlayerMP = this;
        this.theItemInWorldManager = par4ItemInWorldManager;
        this.renderDistance = par1MinecraftServer.getConfigurationManager().getViewDistance();
        ChunkCoordinates var5 = par2World.getSpawnPoint();
        int var6 = var5.posX;
        int var7 = var5.posZ;
        int var8 = var5.posY;

        if (!par2World.provider.hasNoSky && par2World.getWorldInfo().getGameType() != EnumGameType.ADVENTURE)
        {
            var6 += this.rand.nextInt(20) - 10;
            var8 = par2World.getTopSolidOrLiquidBlock(var6, var7);
            var7 += this.rand.nextInt(20) - 10;
        }

        this.setLocationAndAngles((double)var6 + 0.5D, (double)var8, (double)var7 + 0.5D, 0.0F, 0.0F);
        this.mcServer = par1MinecraftServer;
        this.stepHeight = 0.0F;
        this.username = par3Str;
        this.yOffset = 0.0F;
        ServerHexAPI.afterLocalConstructing(this, par1MinecraftServer, par2World, par3Str, par4ItemInWorldManager);
    }
    
    /**
     * HexAPI starts FROM HERE.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public final ServerPlayerBase getServerPlayerBase(String var1)
    {
        return this.SHPAPI != null ? this.SHPAPI.getServerPlayerBase(var1) : null;
    }

    public final Set getServerPlayerBaseIds(String var1)
    {
        return this.SHPAPI != null ? this.SHPAPI.getServerPlayerBaseIds() : Collections.emptySet();
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        boolean var3;

        if (this.SHPAPI != null && this.SHPAPI.isAttackEntityFromModded)
        {
            var3 = SHPAPI.attackEntityFrom(this, par1DamageSource, par2);
        }
        else
        {
            var3 = this.localAttackEntityFrom(par1DamageSource, par2);
        }

        return var3;
    }

    public final boolean superAttackEntityFrom(DamageSource var1, int var2)
    {
        return super.attackEntityFrom(var1, var2);
    }

    public final boolean localAttackEntityFrom(DamageSource var1, int var2)
    {
        if (this.initialInvulnerability > 0)
        {
            return false;
        }
        else
        {
            if (!this.mcServer.isPVPEnabled() && var1 instanceof EntityDamageSource)
            {
                Entity var3 = var1.getEntity();

                if (var3 instanceof EntityPlayer)
                {
                    return false;
                }

                if (var3 instanceof EntityArrow)
                {
                    EntityArrow var4 = (EntityArrow)var3;

                    if (var4.shootingEntity instanceof EntityPlayer)
                    {
                        return false;
                    }
                }
            }

            return super.attackEntityFrom(var1, var2);
        }
    }

    /**
     * Attacks for the player the targeted entity with the currently equipped item.  The equipped item has hitEntity
     * called on it. Args: targetEntity
     */
    public void attackTargetEntityWithCurrentItem(Entity var1)
    {
        if (this.SHPAPI != null && this.SHPAPI.isAttackTargetEntityWithCurrentItemModded)
        {
            SHPAPI.attackTargetEntityWithCurrentItem(this, var1);
        }
        else
        {
            super.attackTargetEntityWithCurrentItem(var1);
        }
    }

    public final void superAttackTargetEntityWithCurrentItem(Entity var1)
    {
        super.attackTargetEntityWithCurrentItem(var1);
    }

    public final void localAttackTargetEntityWithCurrentItem(Entity var1)
    {
        super.attackTargetEntityWithCurrentItem(var1);
    }

    /**
     * Checks if the player has the ability to harvest a block (checks current inventory item for a tool if necessary)
     */
    public boolean canHarvestBlock(Block var1)
    {
        boolean var2;

        if (this.SHPAPI != null && this.SHPAPI.isCanHarvestBlockModded)
        {
            var2 = SHPAPI.canHarvestBlock(this, var1);
        }
        else
        {
            var2 = super.canHarvestBlock(var1);
        }

        return var2;
    }

    public final boolean superCanHarvestBlock(Block var1)
    {
        return super.canHarvestBlock(var1);
    }

    public final boolean localCanHarvestBlock(Block var1)
    {
        return super.canHarvestBlock(var1);
    }

    public boolean canPlayerEdit(int var1, int var2, int var3)
    {
        boolean var4;

        if (this.SHPAPI != null && this.SHPAPI.isCanPlayerEditModded)
        {
            var4 = SHPAPI.canPlayerEdit(this, var1, var2, var3);
        }
        else
        {
            var4 = super.canPlayerEdit(var1, var2, var3);
        }

        return var4;
    }

    public final boolean superCanPlayerEdit(int var1, int var2, int var3)
    {
        return super.canPlayerEdit(var1, var2, var3);
    }

    public final boolean localCanPlayerEdit(int var1, int var2, int var3)
    {
        return super.canPlayerEdit(var1, var2, var3);
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        boolean var1;

        if (this.SHPAPI != null && this.SHPAPI.isCanTriggerWalkingModded)
        {
            var1 = SHPAPI.canTriggerWalking(this);
        }
        else
        {
            var1 = super.canTriggerWalking();
        }

        return var1;
    }

    public final boolean realCanTriggerWalking()
    {
        return this.canTriggerWalking();
    }

    public final boolean superCanTriggerWalking()
    {
        return super.canTriggerWalking();
    }

    public final boolean localCanTriggerWalking()
    {
        return super.canTriggerWalking();
    }

    /**
     * Deals damage to the entity. If its a EntityPlayer then will take damage from the armor first and then health
     * second with the reduced value. Args: damageAmount
     */
    protected void damageEntity(DamageSource var1, int var2)
    {
        if (this.SHPAPI != null && this.SHPAPI.isDamageEntityModded)
        {
            SHPAPI.damageEntity(this, var1, var2);
        }
        else
        {
            super.damageEntity(var1, var2);
        }
    }

    public final void realDamageEntity(DamageSource var1, int var2)
    {
        this.damageEntity(var1, var2);
    }

    public final void superDamageEntity(DamageSource var1, int var2)
    {
        super.damageEntity(var1, var2);
    }

    public final void localDamageEntity(DamageSource var1, int var2)
    {
        super.damageEntity(var1, var2);
    }

    /**
     * Displays the GUI for interacting with a chest inventory. Args: chestInventory
     */
    public void displayGUIChest(IInventory par1IInventory)
    {
        if (this.SHPAPI != null && this.SHPAPI.isDisplayGUIChestModded)
        {
            SHPAPI.displayGUIChest(this, par1IInventory);
        }
        else
        {
            this.localDisplayGUIChest(par1IInventory);
        }
    }

    public final void superDisplayGUIChest(IInventory var1)
    {
        super.displayGUIChest(var1);
    }

    public final void localDisplayGUIChest(IInventory var1)
    {
        if (this.craftingInventory != this.inventorySlots)
        {
            this.closeScreen();
        }

        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 0, var1.getInvName(), var1.getSizeInventory()));
        this.craftingInventory = new ContainerChest(this.inventory, var1);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the dipsenser GUI for the passed in dispenser entity. Args: TileEntityDispenser
     */
    public void displayGUIDispenser(TileEntityDispenser par1TileEntityDispenser)
    {
        if (this.SHPAPI != null && this.SHPAPI.isDisplayGUIDispenserModded)
        {
            SHPAPI.displayGUIDispenser(this, par1TileEntityDispenser);
        }
        else
        {
            this.localDisplayGUIDispenser(par1TileEntityDispenser);
        }
    }

    public final void superDisplayGUIDispenser(TileEntityDispenser var1)
    {
        super.displayGUIDispenser(var1);
    }

    public final void localDisplayGUIDispenser(TileEntityDispenser var1)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 3, var1.getInvName(), var1.getSizeInventory()));
        this.craftingInventory = new ContainerDispenser(this.inventory, var1);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the furnace GUI for the passed in furnace entity. Args: tileEntityFurnace
     */
    public void displayGUIFurnace(TileEntityFurnace par1TileEntityFurnace)
    {
        if (this.SHPAPI != null && this.SHPAPI.isDisplayGUIFurnaceModded)
        {
            SHPAPI.displayGUIFurnace(this, par1TileEntityFurnace);
        }
        else
        {
            this.localDisplayGUIFurnace(par1TileEntityFurnace);
        }
    }

    public final void superDisplayGUIFurnace(TileEntityFurnace var1)
    {
        super.displayGUIFurnace(var1);
    }

    public final void localDisplayGUIFurnace(TileEntityFurnace var1)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 2, var1.getInvName(), var1.getSizeInventory()));
        this.craftingInventory = new ContainerFurnace(this.inventory, var1);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the crafting GUI for a workbench.
     */
    public void displayGUIWorkbench(int par1, int par2, int par3)
    {
        if (this.SHPAPI != null && this.SHPAPI.isDisplayWorkbenchGUIModded)
        {
            SHPAPI.displayWorkbenchGUI(this, par1, par2, par3);
        }
        else
        {
            this.localDisplayWorkbenchGUI(par1, par2, par3);
        }
    }

    public final void superDisplayWorkbenchGUI(int var1, int var2, int var3)
    {
        super.displayGUIWorkbench(var1, var2, var3);
    }

    public final void localDisplayWorkbenchGUI(int var1, int var2, int var3)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 1, "Crafting", 9));
        this.craftingInventory = new ContainerWorkbench(this.inventory, this.worldObj, var1, var2, var3);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Called when player presses the drop item key
     */
    public EntityItem dropOneItem()
    {
        EntityItem var1;

        if (this.SHPAPI != null && this.SHPAPI.isDropOneItemModded)
        {
            var1 = SHPAPI.dropOneItem(this);
        }
        else
        {
            var1 = super.dropOneItem();
        }

        return var1;
    }

    public final EntityItem superDropOneItem()
    {
        return super.dropOneItem();
    }

    public final EntityItem localDropOneItem()
    {
        return super.dropOneItem();
    }

    /**
     * Args: itemstack - called when player drops an item stack that's not in his inventory (like items still placed in
     * a workbench while the workbench'es GUI gets closed)
     */
    public EntityItem dropPlayerItem(ItemStack var1)
    {
        EntityItem var2;

        if (this.SHPAPI != null && this.SHPAPI.isDropPlayerItemModded)
        {
            var2 = SHPAPI.dropPlayerItem(this, var1);
        }
        else
        {
            var2 = super.dropPlayerItem(var1);
        }

        return var2;
    }

    public final EntityItem superDropPlayerItem(ItemStack var1)
    {
        return super.dropPlayerItem(var1);
    }

    public final EntityItem localDropPlayerItem(ItemStack var1)
    {
        return super.dropPlayerItem(var1);
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1)
    {
        if (this.SHPAPI != null && this.SHPAPI.isFallModded)
        {
            SHPAPI.fall(this, var1);
        }
        else
        {
            super.fall(var1);
        }
    }

    public final void realFall(float var1)
    {
        this.fall(var1);
    }

    public final void superFall(float var1)
    {
        super.fall(var1);
    }

    public final void localFall(float var1)
    {
        super.fall(var1);
    }

    /**
     * Returns how strong the player is against the specified block at this moment
     */
    public float getCurrentPlayerStrVsBlock(Block var1)
    {
        float var2;

        if (this.SHPAPI != null && this.SHPAPI.isGetCurrentPlayerStrVsBlockModded)
        {
            var2 = SHPAPI.getCurrentPlayerStrVsBlock(this, var1);
        }
        else
        {
            var2 = super.getCurrentPlayerStrVsBlock(var1);
        }

        return var2;
    }

    public final float superGetCurrentPlayerStrVsBlock(Block var1)
    {
        return super.getCurrentPlayerStrVsBlock(var1);
    }

    public final float localGetCurrentPlayerStrVsBlock(Block var1)
    {
        return super.getCurrentPlayerStrVsBlock(var1);
    }

    /**
     * Gets the squared distance to the position. Args: x, y, z
     */
    public double getDistanceSq(double var1, double var3, double var5)
    {
        double var7;

        if (this.SHPAPI != null && this.SHPAPI.isGetDistanceSqModded)
        {
            var7 = SHPAPI.getDistanceSq(this, var1, var3, var5);
        }
        else
        {
            var7 = super.getDistanceSq(var1, var3, var5);
        }

        return var7;
    }

    public final double superGetDistanceSq(double var1, double var3, double var5)
    {
        return super.getDistanceSq(var1, var3, var5);
    }

    public final double localGetDistanceSq(double var1, double var3, double var5)
    {
        return super.getDistanceSq(var1, var3, var5);
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float var1)
    {
        float var2;

        if (this.SHPAPI != null && this.SHPAPI.isGetBrightnessModded)
        {
            var2 = SHPAPI.getBrightness(this, var1);
        }
        else
        {
            var2 = super.getBrightness(var1);
        }

        return var2;
    }

    public final float superGetBrightness(float var1)
    {
        return super.getBrightness(var1);
    }

    public final float localGetBrightness(float var1)
    {
        return super.getBrightness(var1);
    }

    public float getEyeHeight()
    {
        float var1;

        if (this.SHPAPI != null && this.SHPAPI.isGetEyeHeightModded)
        {
            var1 = SHPAPI.getEyeHeight(this);
        }
        else
        {
            var1 = this.localGetEyeHeight();
        }

        return var1;
    }

    public final float superGetEyeHeight()
    {
        return super.getEyeHeight();
    }

    public final float localGetEyeHeight()
    {
        return 1.62F;
    }

    /**
     * This method returns a value to be applied directly to entity speed, this factor is less than 1 when a slowdown
     * potion effect is applied, more than 1 when a haste potion effect is applied and 2 for fleeing entities.
     */
    protected float getSpeedModifier()
    {
        float var1;

        if (this.SHPAPI != null && this.SHPAPI.isGetSpeedModifierModded)
        {
            var1 = SHPAPI.getSpeedModifier(this);
        }
        else
        {
            var1 = super.getSpeedModifier();
        }

        return var1;
    }

    public final float realGetSpeedModifier()
    {
        return this.getSpeedModifier();
    }

    public final float superGetSpeedModifier()
    {
        return super.getSpeedModifier();
    }

    public final float localGetSpeedModifier()
    {
        return super.getSpeedModifier();
    }

    /**
     * Heal living entity (param: amount of half-hearts)
     */
    public void heal(int var1)
    {
        if (this.SHPAPI != null && this.SHPAPI.isHealModded)
        {
            SHPAPI.heal(this, var1);
        }
        else
        {
            super.heal(var1);
        }
    }

    public final void superHeal(int var1)
    {
        super.heal(var1);
    }

    public final void localHeal(int var1)
    {
        super.heal(var1);
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        boolean var2;

        if (this.SHPAPI != null && this.SHPAPI.isInteractModded)
        {
            var2 = SHPAPI.interact(this, var1);
        }
        else
        {
            var2 = super.interact(var1);
        }

        return var2;
    }

    public final boolean superInteract(EntityPlayer var1)
    {
        return super.interact(var1);
    }

    public final boolean localInteract(EntityPlayer var1)
    {
        return super.interact(var1);
    }

    /**
     * Checks if this entity is inside of an opaque block
     */
    public boolean isEntityInsideOpaqueBlock()
    {
        boolean var1;

        if (this.SHPAPI != null && this.SHPAPI.isIsEntityInsideOpaqueBlockModded)
        {
            var1 = SHPAPI.isEntityInsideOpaqueBlock(this);
        }
        else
        {
            var1 = super.isEntityInsideOpaqueBlock();
        }

        return var1;
    }

    public final boolean superIsEntityInsideOpaqueBlock()
    {
        return super.isEntityInsideOpaqueBlock();
    }

    public final boolean localIsEntityInsideOpaqueBlock()
    {
        return super.isEntityInsideOpaqueBlock();
    }

    /**
     * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
     * true)
     */
    public boolean isInWater()
    {
        boolean var1;

        if (this.SHPAPI != null && this.SHPAPI.isIsInWaterModded)
        {
            var1 = SHPAPI.isInWater(this);
        }
        else
        {
            var1 = super.isInWater();
        }

        return var1;
    }

    public final boolean superIsInWater()
    {
        return super.isInWater();
    }

    public final boolean localIsInWater()
    {
        return super.isInWater();
    }

    /**
     * Checks if the current block the entity is within of the specified material type
     */
    public boolean isInsideOfMaterial(Material var1)
    {
        boolean var2;

        if (this.SHPAPI != null && this.SHPAPI.isIsInsideOfMaterialModded)
        {
            var2 = SHPAPI.isInsideOfMaterial(this, var1);
        }
        else
        {
            var2 = super.isInsideOfMaterial(var1);
        }

        return var2;
    }

    public final boolean superIsInsideOfMaterial(Material var1)
    {
        return super.isInsideOfMaterial(var1);
    }

    public final boolean localIsInsideOfMaterial(Material var1)
    {
        return super.isInsideOfMaterial(var1);
    }

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    public boolean isOnLadder()
    {
        boolean var1;

        if (this.SHPAPI != null && this.SHPAPI.isIsOnLadderModded)
        {
            var1 = SHPAPI.isOnLadder(this);
        }
        else
        {
            var1 = super.isOnLadder();
        }

        return var1;
    }

    public final boolean superIsOnLadder()
    {
        return super.isOnLadder();
    }

    public final boolean localIsOnLadder()
    {
        return super.isOnLadder();
    }

    /**
     * Returns whether player is sleeping or not
     */
    public boolean isPlayerSleeping()
    {
        boolean var1;

        if (this.SHPAPI != null && this.SHPAPI.isIsPlayerSleepingModded)
        {
            var1 = SHPAPI.isPlayerSleeping(this);
        }
        else
        {
            var1 = super.isPlayerSleeping();
        }

        return var1;
    }

    public final boolean superIsPlayerSleeping()
    {
        return super.isPlayerSleeping();
    }

    public final boolean localIsPlayerSleeping()
    {
        return super.isPlayerSleeping();
    }

    /**
     * Causes this entity to do an upwards motion (jumping).
     */
    protected void jump()
    {
        if (this.SHPAPI != null && this.SHPAPI.isJumpModded)
        {
            SHPAPI.jump(this);
        }
        else
        {
            super.jump();
        }
    }

    public final void realJump()
    {
        this.jump();
    }

    public final void superJump()
    {
        super.jump();
    }

    public final void localJump()
    {
        super.jump();
    }

    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    public void moveEntity(double var1, double var3, double var5)
    {
        if (this.SHPAPI != null && this.SHPAPI.isMoveEntityModded)
        {
            SHPAPI.moveEntity(this, var1, var3, var5);
        }
        else
        {
            super.moveEntity(var1, var3, var5);
        }
    }

    public final void superMoveEntity(double var1, double var3, double var5)
    {
        super.moveEntity(var1, var3, var5);
    }

    public final void localMoveEntity(double var1, double var3, double var5)
    {
        super.moveEntity(var1, var3, var5);
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float var1, float var2)
    {
        if (this.SHPAPI != null && this.SHPAPI.isMoveEntityWithHeadingModded)
        {
            SHPAPI.moveEntityWithHeading(this, var1, var2);
        }
        else
        {
            super.moveEntityWithHeading(var1, var2);
        }
    }

    public final void superMoveEntityWithHeading(float var1, float var2)
    {
        super.moveEntityWithHeading(var1, var2);
    }

    public final void localMoveEntityWithHeading(float var1, float var2)
    {
        super.moveEntityWithHeading(var1, var2);
    }

    /**
     * Used in both water and by flying objects
     */
    public void moveFlying(float var1, float var2, float var3)
    {
        if (this.SHPAPI != null && this.SHPAPI.isMoveFlyingModded)
        {
            SHPAPI.moveFlying(this, var1, var2, var3);
        }
        else
        {
            super.moveFlying(var1, var2, var3);
        }
    }

    public final void superMoveFlying(float var1, float var2, float var3)
    {
        super.moveFlying(var1, var2, var3);
    }

    public final void localMoveFlying(float var1, float var2, float var3)
    {
        super.moveFlying(var1, var2, var3);
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
        if (this.SHPAPI != null && this.SHPAPI.isOnDeathModded)
        {
            SHPAPI.onDeath(this, par1DamageSource);
        }
        else
        {
            this.localOnDeath(par1DamageSource);
        }
    }

    public final void superOnDeath(DamageSource var1)
    {
        super.onDeath(var1);
    }

    public final void localOnDeath(DamageSource var1)
    {
        this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new Packet3Chat(var1.getDeathMessage(this)));
        this.inventory.dropAllItems();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.SHPAPI != null && this.SHPAPI.isOnLivingUpdateModded)
        {
            SHPAPI.onLivingUpdate(this);
        }
        else
        {
            super.onLivingUpdate();
        }
    }

    public final void superOnLivingUpdate()
    {
        super.onLivingUpdate();
    }

    public final void localOnLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * This method gets called when the entity kills another one.
     */
    public void onKillEntity(EntityLiving var1)
    {
        if (this.SHPAPI != null && this.SHPAPI.isOnKillEntityModded)
        {
            SHPAPI.onKillEntity(this, var1);
        }
        else
        {
            super.onKillEntity(var1);
        }
    }

    public final void superOnKillEntity(EntityLiving var1)
    {
        super.onKillEntity(var1);
    }

    public final void localOnKillEntity(EntityLiving var1)
    {
        super.onKillEntity(var1);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.SHPAPI != null && this.SHPAPI.isOnUpdateModded)
        {
            SHPAPI.onUpdate(this);
        }
        else
        {
            this.localOnUpdate();
        }
    }

    public final void superOnUpdate()
    {
        super.onUpdate();
    }

    public final void localOnUpdate()
    {
        this.theItemInWorldManager.updateBlockRemoving();
        --this.initialInvulnerability;
        this.craftingInventory.updateCraftingResults();
        int var1;

        for (var1 = 0; var1 < 5; ++var1)
        {
            ItemStack var2 = this.getCurrentItemOrArmor(var1);

            if (var2 != this.lastActiveItems[var1])
            {
                this.getServerForPlayer().getEntityTracker().sendPacketToAllPlayersTrackingEntity(this, new Packet5PlayerInventory(this.entityId, var1, var2));
                this.lastActiveItems[var1] = var2;
            }
        }

        if (!this.chunksToLoad.isEmpty())
        {
            ArrayList var6 = new ArrayList();
            Iterator var7 = this.chunksToLoad.iterator();
            ArrayList var3 = new ArrayList();

            while (var7.hasNext() && var6.size() < 5)
            {
                ChunkCoordIntPair var4 = (ChunkCoordIntPair)var7.next();
                var7.remove();

                if (var4 != null && this.worldObj.blockExists(var4.chunkXPos << 4, 0, var4.chunkZPos << 4))
                {
                    var6.add(this.worldObj.getChunkFromChunkCoords(var4.chunkXPos, var4.chunkZPos));
                    var3.addAll(((WorldServer)this.worldObj).getAllTileEntityInBox(var4.chunkXPos * 16, 0, var4.chunkZPos * 16, var4.chunkXPos * 16 + 16, 256, var4.chunkZPos * 16 + 16));
                }
            }

            if (!var6.isEmpty())
            {
                this.serverForThisPlayer.sendPacketToPlayer(new Packet56MapChunks(var6));
                Iterator var10 = var3.iterator();

                while (var10.hasNext())
                {
                    TileEntity var5 = (TileEntity)var10.next();
                    this.sendTileEntityToPlayer(var5);
                }
            }
        }

        if (!this.destroyedItemsNetCache.isEmpty())
        {
            var1 = Math.min(this.destroyedItemsNetCache.size(), 127);
            int[] var8 = new int[var1];
            Iterator var9 = this.destroyedItemsNetCache.iterator();
            int var11 = 0;

            while (var9.hasNext() && var11 < var1)
            {
                var8[var11++] = ((Integer)var9.next()).intValue();
                var9.remove();
            }

            this.serverForThisPlayer.sendPacketToPlayer(new Packet29DestroyEntity(var8));
        }
    }

    public void onUpdateEntity()
    {
        if (this.SHPAPI != null && this.SHPAPI.isOnUpdateEntityModded)
        {
            SHPAPI.onUpdateEntity(this);
        }
        else
        {
            this.localOnUpdateEntity();
        }
    }

    public final void localOnUpdateEntity()
    {
        super.onUpdate();

        for (int var1 = 0; var1 < this.inventory.getSizeInventory(); ++var1)
        {
            ItemStack var2 = this.inventory.getStackInSlot(var1);

            if (var2 != null && Item.itemsList[var2.itemID].isMap() && this.serverForThisPlayer.packetSize() <= 2)
            {
                Packet var3 = ((ItemMapBase)Item.itemsList[var2.itemID]).createMapDataPacket(var2, this.worldObj, this);

                if (var3 != null)
                {
                    this.serverForThisPlayer.sendPacketToPlayer(var3);
                }
            }
        }

        if (this.inPortal)
        {
            if (this.mcServer.getAllowNether())
            {
                if (this.craftingInventory != this.inventorySlots)
                {
                    this.closeScreen();
                }

                if (this.ridingEntity != null)
                {
                    this.mountEntity(this.ridingEntity);
                }
                else
                {
                    this.timeInPortal += 0.0125F;

                    if (this.timeInPortal >= 1.0F)
                    {
                        this.timeInPortal = 1.0F;
                        this.timeUntilPortal = 10;
                        boolean var4 = false;
                        byte var5;

                        if (this.dimension == -1)
                        {
                            var5 = 0;
                        }
                        else
                        {
                            var5 = -1;
                        }

                        this.mcServer.getConfigurationManager().transferPlayerToDimension(this, var5);
                        this.lastExperience = -1;
                        this.lastHealth = -1;
                        this.lastFoodLevel = -1;
                        this.triggerAchievement(AchievementList.portal);
                    }
                }

                this.inPortal = false;
            }
        }
        else
        {
            if (this.timeInPortal > 0.0F)
            {
                this.timeInPortal -= 0.05F;
            }

            if (this.timeInPortal < 0.0F)
            {
                this.timeInPortal = 0.0F;
            }
        }

        if (this.timeUntilPortal > 0)
        {
            --this.timeUntilPortal;
        }

        if (this.getHealth() == this.lastHealth && this.lastFoodLevel == this.foodStats.getFoodLevel())
        {
            if (this.foodStats.getSaturationLevel() == 0.0F == this.wasHungry)
            {
                ;
            }
        }
        else
        {
            this.serverForThisPlayer.sendPacketToPlayer(new Packet8UpdateHealth(this.getHealth(), this.foodStats.getFoodLevel(), this.foodStats.getSaturationLevel()));
            this.lastHealth = this.getHealth();
            this.lastFoodLevel = this.foodStats.getFoodLevel();
            this.wasHungry = this.foodStats.getSaturationLevel() == 0.0F;
        }

        if (this.experienceTotal != this.lastExperience)
        {
            this.lastExperience = this.experienceTotal;
            this.serverForThisPlayer.sendPacketToPlayer(new Packet43Experience(this.experience, this.experienceTotal, this.experienceLevel));
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (this.SHPAPI != null && this.SHPAPI.isReadEntityFromNBTModded)
        {
            SHPAPI.readEntityFromNBT(this, par1NBTTagCompound);
        }
        else
        {
            this.localReadEntityFromNBT(par1NBTTagCompound);
        }
    }

    public final void superReadEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
    }

    public final void localReadEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);

        if (var1.hasKey("playerGameType"))
        {
            this.theItemInWorldManager.setGameType(EnumGameType.getByID(var1.getInteger("playerGameType")));
        }
    }

    /**
     * Will get destroyed next tick.
     */
    public void setDead()
    {
        if (this.SHPAPI != null && this.SHPAPI.isSetDeadModded)
        {
            SHPAPI.setDead(this);
        }
        else
        {
            super.setDead();
        }
    }

    public final void superSetDead()
    {
        super.setDead();
    }

    public final void localSetDead()
    {
        super.setDead();
    }

    /**
     * Sets the x,y,z of the entity from the given parameters. Also seems to set up a bounding box.
     */
    public void setPosition(double var1, double var3, double var5)
    {
        if (this.SHPAPI != null && this.SHPAPI.isSetPositionModded)
        {
            SHPAPI.setPosition(this, var1, var3, var5);
        }
        else
        {
            super.setPosition(var1, var3, var5);
        }
    }

    public final void superSetPosition(double var1, double var3, double var5)
    {
        super.setPosition(var1, var3, var5);
    }

    public final void localSetPosition(double var1, double var3, double var5)
    {
        super.setPosition(var1, var3, var5);
    }

    protected void updateEntityActionState()
    {
        if (this.SHPAPI != null && this.SHPAPI.isUpdateEntityActionStateModded)
        {
            SHPAPI.updateEntityActionState(this);
        }
        else
        {
            super.updateEntityActionState();
        }
    }

    public final void realUpdateEntityActionState()
    {
        this.updateEntityActionState();
    }

    public final void superUpdateEntityActionState()
    {
        super.updateEntityActionState();
    }

    public final void localUpdateEntityActionState()
    {
        super.updateEntityActionState();
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (this.SHPAPI != null && this.SHPAPI.isWriteEntityToNBTModded)
        {
            SHPAPI.writeEntityToNBT(this, par1NBTTagCompound);
        }
        else
        {
            this.localWriteEntityToNBT(par1NBTTagCompound);
        }
    }

    public final void superWriteEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
    }

    public final void localWriteEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setInteger("playerGameType", this.theItemInWorldManager.getGameType().getID());
    }

    /**
     * Add a chat message to the player
     */
    public void addChatMessage(String par1Str)
    {
        StringTranslate var10000 = this.translator;
        StringTranslate var2 = StringTranslate.getInstance();
        String var3 = var2.translateKey(par1Str);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet3Chat(var3));
    }

    public final void superAddChatMessage(String var1)
    {
        super.addChatMessage(var1);
    }

    public final boolean superAddEntityID(NBTTagCompound var1)
    {
        return super.addEntityID(var1);
    }

    public final void superAddExhaustion(float var1)
    {
        super.addExhaustion(var1);
    }

    public final void superAddExperience(int var1)
    {
        super.addExperience(var1);
    }

    public final void superAddMovementStat(double var1, double var3, double var5)
    {
        super.addMovementStat(var1, var3, var5);
    }

    public final void superAddPotionEffect(PotionEffect var1)
    {
        super.addPotionEffect(var1);
    }

    public void addSelfToInternalCraftingInventory()
    {
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Adds a value to a statistic field.
     */
    public void addStat(StatBase par1StatBase, int par2)
    {
        if (par1StatBase != null)
        {
            if (!par1StatBase.isIndependent)
            {
                while (par2 > 100)
                {
                    this.serverForThisPlayer.sendPacketToPlayer(new Packet200Statistic(par1StatBase.statId, 100));
                    par2 -= 100;
                }

                this.serverForThisPlayer.sendPacketToPlayer(new Packet200Statistic(par1StatBase.statId, par2));
            }
        }
    }

    public final void superAddStat(StatBase var1, int var2)
    {
        super.addStat(var1, var2);
    }

    public final void superAddToPlayerScore(Entity var1, int var2)
    {
        super.addToPlayerScore(var1, var2);
    }

    public final void superAddVelocity(double var1, double var3, double var5)
    {
        super.addVelocity(var1, var3, var5);
    }

    public final void realAlertWolves(EntityLiving var1, boolean var2)
    {
        this.alertWolves(var1, var2);
    }

    public final void superAlertWolves(EntityLiving var1, boolean var2)
    {
        super.alertWolves(var1, var2);
    }

    public final int realApplyArmorCalculations(DamageSource var1, int var2)
    {
        return this.applyArmorCalculations(var1, var2);
    }

    public final int superApplyArmorCalculations(DamageSource var1, int var2)
    {
        return super.applyArmorCalculations(var1, var2);
    }

    public final void superApplyEntityCollision(Entity var1)
    {
        super.applyEntityCollision(var1);
    }

    public final int realApplyPotionDamageCalculations(DamageSource var1, int var2)
    {
        return this.applyPotionDamageCalculations(var1, var2);
    }

    public final int superApplyPotionDamageCalculations(DamageSource var1, int var2)
    {
        return super.applyPotionDamageCalculations(var1, var2);
    }

    public final boolean superAttackEntityAsMob(Entity var1)
    {
        return super.attackEntityAsMob(var1);
    }

    public final boolean superCanAttackWithItem()
    {
        return super.canAttackWithItem();
    }

    public final boolean superCanBeCollidedWith()
    {
        return super.canBeCollidedWith();
    }

    public final boolean superCanBePushed()
    {
        return super.canBePushed();
    }

    public final boolean superCanBreatheUnderwater()
    {
        return super.canBreatheUnderwater();
    }

    /**
     * Returns true if the command sender is allowed to use the given command.
     */
    public boolean canCommandSenderUseCommand(String par1Str)
    {
        return "seed".equals(par1Str) && !this.mcServer.isDedicatedServer() ? true : (!"tell".equals(par1Str) && !"help".equals(par1Str) && !"me".equals(par1Str) ? this.mcServer.getConfigurationManager().areCommandsAllowed(this.username) : true);
    }

    public final boolean realCanDespawn()
    {
        return this.canDespawn();
    }

    public final boolean superCanDespawn()
    {
        return super.canDespawn();
    }

    public final boolean superCanEat(boolean var1)
    {
        return super.canEat(var1);
    }

    public final boolean superCanEntityBeSeen(Entity var1)
    {
        return super.canEntityBeSeen(var1);
    }

    public final void superClearActivePotions()
    {
        super.clearActivePotions();
    }

    public final void superClearItemInUse()
    {
        super.clearItemInUse();
    }

    public final void superClonePlayer(EntityPlayer var1, boolean var2)
    {
        super.clonePlayer(var1, var2);
    }

    public void closeInventory()
    {
        this.craftingInventory.onCraftGuiClosed(this);
        this.craftingInventory = this.inventorySlots;
    }

    /**
     * sets current screen to null (used on escape buttons of GUIs)
     */
    public void closeScreen()
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet101CloseWindow(this.craftingInventory.windowId));
        this.closeInventory();
    }

    public final void superCloseScreen()
    {
        super.closeScreen();
    }

    public final void realDamageArmor(int var1)
    {
        this.damageArmor(var1);
    }

    public final void superDamageArmor(int var1)
    {
        super.damageArmor(var1);
    }

    public final void realDealFireDamage(int var1)
    {
        this.dealFireDamage(var1);
    }

    public final void superDealFireDamage(int var1)
    {
        super.dealFireDamage(var1);
    }

    public final int realDecreaseAirSupply(int var1)
    {
        return this.decreaseAirSupply(var1);
    }

    public final int superDecreaseAirSupply(int var1)
    {
        return super.decreaseAirSupply(var1);
    }

    public final void realDespawnEntity()
    {
        this.despawnEntity();
    }

    public final void superDespawnEntity()
    {
        super.despawnEntity();
    }

    public final void superDestroyCurrentEquippedItem()
    {
        super.destroyCurrentEquippedItem();
    }

    public final void superDetachHome()
    {
        super.detachHome();
    }

    public final void superDisplayGUIBook(ItemStack var1)
    {
        super.displayGUIBook(var1);
    }

    /**
     * Displays the GUI for interacting with a brewing stand.
     */
    public void displayGUIBrewingStand(TileEntityBrewingStand par1TileEntityBrewingStand)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 5, par1TileEntityBrewingStand.getInvName(), par1TileEntityBrewingStand.getSizeInventory()));
        this.craftingInventory = new ContainerBrewingStand(this.inventory, par1TileEntityBrewingStand);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    public final void superDisplayGUIBrewingStand(TileEntityBrewingStand var1)
    {
        super.displayGUIBrewingStand(var1);
    }

    public final void superDisplayGUIEditSign(TileEntitySign var1)
    {
        super.displayGUIEditSign(var1);
    }

    public void displayGUIEnchantment(int par1, int par2, int par3)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 4, "Enchanting", 9));
        this.craftingInventory = new ContainerEnchantment(this.inventory, this.worldObj, par1, par2, par3);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    public final void superDisplayGUIEnchantment(int var1, int var2, int var3)
    {
        super.displayGUIEnchantment(var1, var2, var3);
    }

    public void displayGUIMerchant(IMerchant par1IMerchant)
    {
        this.incrementWindowID();
        this.closeInventory();
        this.craftingInventory = new ContainerMerchant(this.inventory, par1IMerchant, this.worldObj);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
        InventoryMerchant var2 = ((ContainerMerchant)this.craftingInventory).getMerchantInventory();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 6, var2.getInvName(), var2.getSizeInventory()));
        MerchantRecipeList var3 = par1IMerchant.getRecipes(this);

        if (var3 != null)
        {
            try
            {
                ByteArrayOutputStream var4 = new ByteArrayOutputStream();
                DataOutputStream var5 = new DataOutputStream(var4);
                var5.writeInt(this.currentWindowId);
                var3.writeRecipiesToStream(var5);
                this.serverForThisPlayer.sendPacketToPlayer(new Packet250CustomPayload("MC|TrList", var4.toByteArray()));
            }
            catch (IOException var6)
            {
                var6.printStackTrace();
            }
        }
    }

    public final void superDisplayGUIMerchant(IMerchant var1)
    {
        super.displayGUIMerchant(var1);
    }

    public final void realDoBlockCollisions()
    {
        this.doBlockCollisions();
    }

    public final void superDoBlockCollisions()
    {
        super.doBlockCollisions();
    }

    public final void realDropFewItems(boolean var1, int var2)
    {
        this.dropFewItems(var1, var2);
    }

    public final void superDropFewItems(boolean var1, int var2)
    {
        super.dropFewItems(var1, var2);
    }

    public final EntityItem superDropItem(int var1, int var2)
    {
        return super.dropItem(var1, var2);
    }

    public final EntityItem superDropItemWithOffset(int var1, int var2, float var3)
    {
        return super.dropItemWithOffset(var1, var2, var3);
    }

    public final EntityItem superDropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
    {
        return super.dropPlayerItemWithRandomChoice(var1, var2);
    }

    public final void realDropRareDrop(int var1)
    {
        this.dropRareDrop(var1);
    }

    public final void superDropRareDrop(int var1)
    {
        super.dropRareDrop(var1);
    }

    public final void superEatGrassBonus()
    {
        super.eatGrassBonus();
    }

    public final EntityItem superEntityDropItem(ItemStack var1, float var2)
    {
        return super.entityDropItem(var1, var2);
    }

    public final void realEntityInit()
    {
        this.entityInit();
    }

    public final void superEntityInit()
    {
        super.entityInit();
    }

    public final boolean superEquals(Object var1)
    {
        return super.equals(var1);
    }

    public final void superExtinguish()
    {
        super.extinguish();
    }

    public final void superFaceEntity(Entity var1, float var2, float var3)
    {
        super.faceEntity(var1, var2, var3);
    }

    public final void superFunc_70062_b(int var1, ItemStack var2)
    {
        super.func_70062_b(var1, var2);
    }

    public final float superFunc_70079_am()
    {
        return super.func_70079_am();
    }

    public final boolean superFunc_71066_bF()
    {
        return super.func_71066_bF();
    }

    public String func_71114_r()
    {
        String var1 = this.serverForThisPlayer.theNetworkManager.getSocketAddress().toString();
        var1 = var1.substring(var1.indexOf("/") + 1);
        var1 = var1.substring(0, var1.indexOf(":"));
        return var1;
    }

    public final float superGetAIMoveSpeed()
    {
        return super.getAIMoveSpeed();
    }

    public final EntityLiving superGetAITarget()
    {
        return super.getAITarget();
    }

    public final PotionEffect superGetActivePotionEffect(Potion var1)
    {
        return super.getActivePotionEffect(var1);
    }

    public final Collection superGetActivePotionEffects()
    {
        return super.getActivePotionEffects();
    }

    public final int superGetAge()
    {
        return super.getAge();
    }

    public final int superGetAir()
    {
        return super.getAir();
    }

    public final EntityLiving superGetAttackTarget()
    {
        return super.getAttackTarget();
    }

    public final float superGetBedOrientationInDegrees()
    {
        return super.getBedOrientationInDegrees();
    }

    public final AxisAlignedBB superGetBoundingBox()
    {
        return super.getBoundingBox();
    }

    public final int superGetBrightnessForRender(float var1)
    {
        return super.getBrightnessForRender(var1);
    }

    public final boolean superGetCanSpawnHere()
    {
        return super.getCanSpawnHere();
    }

    public int getChatVisibility()
    {
        return this.chatVisibility;
    }

    public final float superGetCollisionBorderSize()
    {
        return super.getCollisionBorderSize();
    }

    public final AxisAlignedBB superGetCollisionBox(Entity var1)
    {
        return super.getCollisionBox(var1);
    }

    public final String superGetCommandSenderName()
    {
        return super.getCommandSenderName();
    }

    public final EnumCreatureAttribute superGetCreatureAttribute()
    {
        return super.getCreatureAttribute();
    }

    public final ItemStack superGetCurrentEquippedItem()
    {
        return super.getCurrentEquippedItem();
    }

    /**
     * 0 = item, 1-n is armor
     */
    public ItemStack getCurrentItemOrArmor(int par1)
    {
        return par1 == 0 ? this.inventory.getCurrentItem() : this.inventory.armorInventory[par1 - 1];
    }

    public final DataWatcher superGetDataWatcher()
    {
        return super.getDataWatcher();
    }

    public final String realGetDeathSound()
    {
        return this.getDeathSound();
    }

    public final String superGetDeathSound()
    {
        return super.getDeathSound();
    }

    public final double superGetDistance(double var1, double var3, double var5)
    {
        return super.getDistance(var1, var3, var5);
    }

    public final double superGetDistanceSqToEntity(Entity var1)
    {
        return super.getDistanceSqToEntity(var1);
    }

    public final float superGetDistanceToEntity(Entity var1)
    {
        return super.getDistanceToEntity(var1);
    }

    public final int realGetDropItemId()
    {
        return this.getDropItemId();
    }

    public final int superGetDropItemId()
    {
        return super.getDropItemId();
    }

    public final String superGetEntityName()
    {
        return super.getEntityName();
    }

    public final EntitySenses superGetEntitySenses()
    {
        return super.getEntitySenses();
    }

    public final int realGetExperiencePoints(EntityPlayer var1)
    {
        return this.getExperiencePoints(var1);
    }

    public final int superGetExperiencePoints(EntityPlayer var1)
    {
        return super.getExperiencePoints(var1);
    }

    public final boolean realGetFlag(int var1)
    {
        return this.getFlag(var1);
    }

    public final boolean superGetFlag(int var1)
    {
        return super.getFlag(var1);
    }

    public final FoodStats superGetFoodStats()
    {
        return super.getFoodStats();
    }

    public final int superGetHealth()
    {
        return super.getHealth();
    }

    public final ItemStack superGetHeldItem()
    {
        return super.getHeldItem();
    }

    public final ChunkCoordinates superGetHomePosition()
    {
        return super.getHomePosition();
    }

    public final String realGetHurtSound()
    {
        return this.getHurtSound();
    }

    public final String superGetHurtSound()
    {
        return super.getHurtSound();
    }

    public final InventoryEnderChest superGetInventoryEnderChest()
    {
        return super.getInventoryEnderChest();
    }

    public final int superGetItemIcon(ItemStack var1, int var2)
    {
        return super.getItemIcon(var1, var2);
    }

    public final ItemStack superGetItemInUse()
    {
        return super.getItemInUse();
    }

    public final int superGetItemInUseCount()
    {
        return super.getItemInUseCount();
    }

    public final int superGetItemInUseDuration()
    {
        return super.getItemInUseDuration();
    }

    public final EntityJumpHelper superGetJumpHelper()
    {
        return super.getJumpHelper();
    }

    public ItemStack[] getLastActiveItems()
    {
        return this.lastActiveItems;
    }

    public final ItemStack[] superGetLastActiveItems()
    {
        return super.getLastActiveItems();
    }

    public final EntityLiving superGetLastAttackingEntity()
    {
        return super.getLastAttackingEntity();
    }

    public final String realGetLivingSound()
    {
        return this.getLivingSound();
    }

    public final String superGetLivingSound()
    {
        return super.getLivingSound();
    }

    public final Vec3 superGetLook(float var1)
    {
        return super.getLook(var1);
    }

    public final EntityLookHelper superGetLookHelper()
    {
        return super.getLookHelper();
    }

    public final Vec3 superGetLookVec()
    {
        return super.getLookVec();
    }

    public final int superGetMaxHealth()
    {
        return super.getMaxHealth();
    }

    public final int superGetMaxSpawnedInChunk()
    {
        return super.getMaxSpawnedInChunk();
    }

    public final float superGetMaximumHomeDistance()
    {
        return super.getMaximumHomeDistance();
    }

    public final double superGetMountedYOffset()
    {
        return super.getMountedYOffset();
    }

    public final EntityMoveHelper superGetMoveHelper()
    {
        return super.getMoveHelper();
    }

    public final PathNavigate superGetNavigator()
    {
        return super.getNavigator();
    }

    public final Entity[] superGetParts()
    {
        return super.getParts();
    }

    public final Vec3 superGetPosition(float var1)
    {
        return super.getPosition(var1);
    }

    public final Random superGetRNG()
    {
        return super.getRNG();
    }

    public final float superGetRenderSizeModifier()
    {
        return super.getRenderSizeModifier();
    }

    public final int superGetScore()
    {
        return super.getScore();
    }

    public WorldServer getServerForPlayer()
    {
        return (WorldServer)this.worldObj;
    }

    public final float superGetShadowSize()
    {
        return super.getShadowSize();
    }

    public final int superGetSleepTimer()
    {
        return super.getSleepTimer();
    }

    public final float realGetSoundVolume()
    {
        return this.getSoundVolume();
    }

    public final float superGetSoundVolume()
    {
        return super.getSoundVolume();
    }

    public final ChunkCoordinates superGetSpawnChunk()
    {
        return super.getSpawnChunk();
    }

    public final float superGetSwingProgress(float var1)
    {
        return super.getSwingProgress(var1);
    }

    public final int superGetTalkInterval()
    {
        return super.getTalkInterval();
    }

    public final String superGetTexture()
    {
        return super.getTexture();
    }

    public final int superGetTotalArmorValue()
    {
        return super.getTotalArmorValue();
    }

    public StringTranslate getTranslator()
    {
        return this.translator;
    }

    public final StringTranslate superGetTranslator()
    {
        return super.getTranslator();
    }

    public final int superGetVerticalFaceSpeed()
    {
        return super.getVerticalFaceSpeed();
    }

    public final double superGetYOffset()
    {
        return super.getYOffset();
    }

    public final void superHandleHealthUpdate(byte var1)
    {
        super.handleHealthUpdate(var1);
    }

    public final boolean superHandleLavaMovement()
    {
        return super.handleLavaMovement();
    }

    public final boolean superHandleWaterMovement()
    {
        return super.handleWaterMovement();
    }

    public final boolean superHasHome()
    {
        return super.hasHome();
    }

    public final int superHashCode()
    {
        return super.hashCode();
    }

    public void incrementWindowID()
    {
        this.currentWindowId = this.currentWindowId % 100 + 1;
    }

    public final void realIncrementWindowID()
    {
        this.incrementWindowID();
    }

    public final boolean superInteractWith(Entity var1)
    {
        return super.interactWith(var1);
    }

    public final boolean realIsAIEnabled()
    {
        return this.isAIEnabled();
    }

    public final boolean superIsAIEnabled()
    {
        return super.isAIEnabled();
    }

    public final boolean superIsBlocking()
    {
        return super.isBlocking();
    }

    public final boolean superIsBurning()
    {
        return super.isBurning();
    }

    public final boolean superIsChild()
    {
        return super.isChild();
    }

    public final boolean realIsClientWorld()
    {
        return this.isClientWorld();
    }

    public final boolean superIsClientWorld()
    {
        return super.isClientWorld();
    }

    public final boolean superIsEating()
    {
        return super.isEating();
    }

    public final boolean superIsEntityAlive()
    {
        return super.isEntityAlive();
    }

    public final boolean superIsEntityEqual(Entity var1)
    {
        return super.isEntityEqual(var1);
    }

    public final boolean superIsEntityUndead()
    {
        return super.isEntityUndead();
    }

    public final boolean superIsExplosiveMob(Class var1)
    {
        return super.isExplosiveMob(var1);
    }

    public final boolean superIsInRangeToRenderDist(double var1)
    {
        return super.isInRangeToRenderDist(var1);
    }

    public final boolean superIsInRangeToRenderVec3D(Vec3 var1)
    {
        return super.isInRangeToRenderVec3D(var1);
    }

    public final boolean realIsMovementBlocked()
    {
        return this.isMovementBlocked();
    }

    public final boolean superIsMovementBlocked()
    {
        return super.isMovementBlocked();
    }

    public final boolean superIsOffsetPositionInLiquid(double var1, double var3, double var5)
    {
        return super.isOffsetPositionInLiquid(var1, var3, var5);
    }

    /**
     * returns if pvp is enabled or not
     */
    protected boolean isPVPEnabled()
    {
        return this.mcServer.isPVPEnabled();
    }

    public final boolean realIsPVPEnabled()
    {
        return this.isPVPEnabled();
    }

    public final boolean superIsPVPEnabled()
    {
        return super.isPVPEnabled();
    }

    public final boolean realIsPlayer()
    {
        return this.isPlayer();
    }

    public final boolean superIsPlayer()
    {
        return super.isPlayer();
    }

    public final boolean superIsPlayerFullyAsleep()
    {
        return super.isPlayerFullyAsleep();
    }

    public final boolean superIsPotionActive(Potion var1)
    {
        return super.isPotionActive(var1);
    }

    public final boolean superIsPotionApplicable(PotionEffect var1)
    {
        return super.isPotionApplicable(var1);
    }

    public final boolean superIsRiding()
    {
        return super.isRiding();
    }

    public final boolean superIsSneaking()
    {
        return super.isSneaking();
    }

    public final boolean superIsSprinting()
    {
        return super.isSprinting();
    }

    public final boolean superIsUsingItem()
    {
        return super.isUsingItem();
    }

    public final boolean superIsWet()
    {
        return super.isWet();
    }

    public final boolean superIsWithinHomeDistance(int var1, int var2, int var3)
    {
        return super.isWithinHomeDistance(var1, var2, var3);
    }

    public final boolean superIsWithinHomeDistanceCurrentPosition()
    {
        return super.isWithinHomeDistanceCurrentPosition();
    }

    public final void realJoinEntityItemWithWorld(EntityItem var1)
    {
        this.joinEntityItemWithWorld(var1);
    }

    public final void superJoinEntityItemWithWorld(EntityItem var1)
    {
        super.joinEntityItemWithWorld(var1);
    }

    public final void realKill()
    {
        this.kill();
    }

    public final void superKill()
    {
        super.kill();
    }

    public final void superKnockBack(Entity var1, int var2, double var3, double var5)
    {
        super.knockBack(var1, var2, var3, var5);
    }

    /**
     * Called when a player mounts an entity. e.g. mounts a pig, mounts a boat.
     */
    public void mountEntity(Entity par1Entity)
    {
        super.mountEntity(par1Entity);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet39AttachEntity(this, this.ridingEntity));
        this.serverForThisPlayer.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
    }

    public final void superMountEntity(Entity var1)
    {
        super.mountEntity(var1);
    }

    public void mountEntityAndWakeUp()
    {
        if (this.ridingEntity != null)
        {
            this.mountEntity(this.ridingEntity);
        }

        if (this.riddenByEntity != null)
        {
            this.riddenByEntity.onKillEntity(this);
        }

        if (this.sleeping)
        {
            this.wakeUpPlayer(true, false, false);
        }
    }

    public final NBTTagList realNewDoubleNBTList(double ... var1)
    {
        return this.newDoubleNBTList(var1);
    }

    public final NBTTagList superNewDoubleNBTList(double ... var1)
    {
        return super.newDoubleNBTList(var1);
    }

    public final NBTTagList realNewFloatNBTList(float ... var1)
    {
        return this.newFloatNBTList(var1);
    }

    public final NBTTagList superNewFloatNBTList(float ... var1)
    {
        return super.newFloatNBTList(var1);
    }

    protected void onChangedPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onChangedPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet41EntityEffect(this.entityId, par1PotionEffect));
    }

    public final void realOnChangedPotionEffect(PotionEffect var1)
    {
        this.onChangedPotionEffect(var1);
    }

    public final void superOnChangedPotionEffect(PotionEffect var1)
    {
        super.onChangedPotionEffect(var1);
    }

    public final void superOnCollideWithPlayer(EntityPlayer var1)
    {
        super.onCollideWithPlayer(var1);
    }

    /**
     * Called when the player performs a critical hit on the Entity. Args: entity that was hit critically
     */
    public void onCriticalHit(Entity par1Entity)
    {
        this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(par1Entity, 6));
    }

    public final void superOnCriticalHit(Entity var1)
    {
        super.onCriticalHit(var1);
    }

    public final void realOnDeathUpdate()
    {
        this.onDeathUpdate();
    }

    public final void superOnDeathUpdate()
    {
        super.onDeathUpdate();
    }

    public void onEnchantmentCritical(Entity par1Entity)
    {
        this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(par1Entity, 7));
    }

    public final void superOnEnchantmentCritical(Entity var1)
    {
        super.onEnchantmentCritical(var1);
    }

    public final void superOnEntityUpdate()
    {
        super.onEntityUpdate();
    }

    protected void onFinishedPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onFinishedPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet42RemoveEntityEffect(this.entityId, par1PotionEffect));
    }

    public final void realOnFinishedPotionEffect(PotionEffect var1)
    {
        this.onFinishedPotionEffect(var1);
    }

    public final void superOnFinishedPotionEffect(PotionEffect var1)
    {
        super.onFinishedPotionEffect(var1);
    }

    /**
     * Called whenever an item is picked up from walking over it. Args: pickedUpEntity, stackSize
     */
    public void onItemPickup(Entity par1Entity, int par2)
    {
        if (!par1Entity.isDead)
        {
            EntityTracker var3 = this.getServerForPlayer().getEntityTracker();

            if (par1Entity instanceof EntityItem)
            {
                var3.sendPacketToAllPlayersTrackingEntity(par1Entity, new Packet22Collect(par1Entity.entityId, this.entityId));
            }

            if (par1Entity instanceof EntityArrow)
            {
                var3.sendPacketToAllPlayersTrackingEntity(par1Entity, new Packet22Collect(par1Entity.entityId, this.entityId));
            }

            if (par1Entity instanceof EntityXPOrb)
            {
                var3.sendPacketToAllPlayersTrackingEntity(par1Entity, new Packet22Collect(par1Entity.entityId, this.entityId));
            }
        }

        super.onItemPickup(par1Entity, par2);
        this.craftingInventory.updateCraftingResults();
    }

    public final void superOnItemPickup(Entity var1, int var2)
    {
        super.onItemPickup(var1, var2);
    }

    /**
     * Used for when item use count runs out, ie: eating completed
     */
    protected void onItemUseFinish()
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet38EntityStatus(this.entityId, (byte)9));
        super.onItemUseFinish();
    }

    public final void realOnItemUseFinish()
    {
        this.onItemUseFinish();
    }

    public final void superOnItemUseFinish()
    {
        super.onItemUseFinish();
    }

    protected void onNewPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onNewPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet41EntityEffect(this.entityId, par1PotionEffect));
    }

    public final void realOnNewPotionEffect(PotionEffect var1)
    {
        this.onNewPotionEffect(var1);
    }

    public final void superOnNewPotionEffect(PotionEffect var1)
    {
        super.onNewPotionEffect(var1);
    }

    public final void superOnStruckByLightning(EntityLightningBolt var1)
    {
        super.onStruckByLightning(var1);
    }

    public final void superPerformHurtAnimation()
    {
        super.performHurtAnimation();
    }

    public final void superPlayLivingSound()
    {
        super.playLivingSound();
    }

    public final void realPlayStepSound(int var1, int var2, int var3, int var4)
    {
        this.playStepSound(var1, var2, var3, var4);
    }

    public final void superPlayStepSound(int var1, int var2, int var3, int var4)
    {
        super.playStepSound(var1, var2, var3, var4);
    }

    public final void superPreparePlayerToSpawn()
    {
        super.preparePlayerToSpawn();
    }

    public final boolean realPushOutOfBlocks(double var1, double var3, double var5)
    {
        return this.pushOutOfBlocks(var1, var3, var5);
    }

    public final boolean superPushOutOfBlocks(double var1, double var3, double var5)
    {
        return super.pushOutOfBlocks(var1, var3, var5);
    }

    public final MovingObjectPosition superRayTrace(double var1, float var3)
    {
        return super.rayTrace(var1, var3);
    }

    public final void superReadFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
    }

    /**
     * Decrease the player level, used to pay levels for enchantments on items at enchanted table.
     */
    public void removeExperience(int par1)
    {
        super.removeExperience(par1);
        this.lastExperience = -1;
    }

    public final void superRemoveExperience(int var1)
    {
        super.removeExperience(var1);
    }

    public final void superRemovePotionEffect(int var1)
    {
        super.removePotionEffect(var1);
    }

    public final void superRenderBrokenItemStack(ItemStack var1)
    {
        super.renderBrokenItemStack(var1);
    }

    /**
     * on recieving this message the client (if permission is given) will download the requested textures
     */
    public void requestTexturePackLoad(String par1Str, int par2)
    {
        String var3 = par1Str + "" + par2;
        this.serverForThisPlayer.sendPacketToPlayer(new Packet250CustomPayload("MC|TPack", var3.getBytes()));
    }

    /**
     * sets the players height back to normal after doing things like sleeping and dieing
     */
    protected void resetHeight()
    {
        this.yOffset = 0.0F;
    }

    public final void realResetHeight()
    {
        this.resetHeight();
    }

    public final void superResetHeight()
    {
        super.resetHeight();
    }

    public final void superRespawnPlayer()
    {
        super.respawnPlayer();
    }

    public void sendChatToPlayer(String par1Str)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet3Chat(par1Str));
    }

    public void sendContainerAndContentsToPlayer(Container par1Container, List par2List)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet104WindowItems(par1Container.windowId, par2List));
        this.serverForThisPlayer.sendPacketToPlayer(new Packet103SetSlot(-1, -1, this.inventory.getItemStack()));
    }

    public void sendContainerToPlayer(Container par1Container)
    {
        this.sendContainerAndContentsToPlayer(par1Container, par1Container.getInventory());
    }

    public void sendGameTypeToPlayer(EnumGameType par1EnumGameType)
    {
        this.theItemInWorldManager.setGameType(par1EnumGameType);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet70GameEvent(3, par1EnumGameType.getID()));
    }

    public final void superSendGameTypeToPlayer(EnumGameType var1)
    {
        super.sendGameTypeToPlayer(var1);
    }

    public void sendInventoryToPlayer()
    {
        if (!this.playerInventoryBeingManipulated)
        {
            this.serverForThisPlayer.sendPacketToPlayer(new Packet103SetSlot(-1, -1, this.inventory.getItemStack()));
        }
    }

    /**
     * Sends the player's abilities to the server (if there is one).
     */
    public void sendPlayerAbilities()
    {
        if (this.serverForThisPlayer != null)
        {
            this.serverForThisPlayer.sendPacketToPlayer(new Packet202PlayerAbilities(this.capabilities));
        }
    }

    public final void superSendPlayerAbilities()
    {
        super.sendPlayerAbilities();
    }

    /**
     * called from onUpdate for all tileEntity in specific chunks
     */
    private void sendTileEntityToPlayer(TileEntity par1TileEntity)
    {
        if (par1TileEntity != null)
        {
            Packet var2 = par1TileEntity.getAuxillaryInfoPacket();

            if (var2 != null)
            {
                this.serverForThisPlayer.sendPacketToPlayer(var2);
            }
        }
    }

    public final void realSendTileEntityToPlayer(TileEntity var1)
    {
        this.sendTileEntityToPlayer(var1);
    }

    public final void superSetAIMoveSpeed(float var1)
    {
        super.setAIMoveSpeed(var1);
    }

    public final void superSetAir(int var1)
    {
        super.setAir(var1);
    }

    public final void superSetAngles(float var1, float var2)
    {
        super.setAngles(var1, var2);
    }

    public final void superSetAttackTarget(EntityLiving var1)
    {
        super.setAttackTarget(var1);
    }

    public final void realSetBeenAttacked()
    {
        this.setBeenAttacked();
    }

    public final void superSetBeenAttacked()
    {
        super.setBeenAttacked();
    }

    public final void superSetEating(boolean var1)
    {
        super.setEating(var1);
    }

    public final void superSetEntityHealth(int var1)
    {
        super.setEntityHealth(var1);
    }

    public final void superSetFire(int var1)
    {
        super.setFire(var1);
    }

    public final void realSetFlag(int var1, boolean var2)
    {
        this.setFlag(var1, var2);
    }

    public final void superSetFlag(int var1, boolean var2)
    {
        super.setFlag(var1, var2);
    }

    public final void superSetHeadRotationYaw(float var1)
    {
        super.setHeadRotationYaw(var1);
    }

    public final void superSetHomeArea(int var1, int var2, int var3, int var4)
    {
        super.setHomeArea(var1, var2, var3, var4);
    }

    public final void superSetInPortal()
    {
        super.setInPortal();
    }

    public final void superSetInWeb()
    {
        super.setInWeb();
    }

    /**
     * sets the itemInUse when the use item button is clicked. Args: itemstack, int maxItemUseDuration
     */
    public void setItemInUse(ItemStack par1ItemStack, int par2)
    {
        super.setItemInUse(par1ItemStack, par2);

        if (par1ItemStack != null && par1ItemStack.getItem() != null && par1ItemStack.getItem().getItemUseAction(par1ItemStack) == EnumAction.eat)
        {
            this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(this, 5));
        }
    }

    public final void superSetItemInUse(ItemStack var1, int var2)
    {
        super.setItemInUse(var1, var2);
    }

    public final void superSetJumping(boolean var1)
    {
        super.setJumping(var1);
    }

    public final void superSetLastAttackingEntity(Entity var1)
    {
        super.setLastAttackingEntity(var1);
    }

    public final void superSetLocationAndAngles(double var1, double var3, double var5, float var7, float var8)
    {
        super.setLocationAndAngles(var1, var3, var5, var7, var8);
    }

    public final void superSetMoveForward(float var1)
    {
        super.setMoveForward(var1);
    }

    public final void realSetOnFireFromLava()
    {
        this.setOnFireFromLava();
    }

    public final void superSetOnFireFromLava()
    {
        super.setOnFireFromLava();
    }

    /**
     * this function is called when a players inventory is sent to him, lastHealth is updated on any dimension
     * transitions, then reset.
     */
    public void setPlayerHealthUpdated()
    {
        this.lastHealth = -99999999;
    }

    public final void superSetPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
    {
        super.setPositionAndRotation(var1, var3, var5, var7, var8);
    }

    public final void superSetPositionAndRotation2(double var1, double var3, double var5, float var7, float var8, int var9)
    {
        super.setPositionAndRotation2(var1, var3, var5, var7, var8, var9);
    }

    /**
     * Move the entity to the coordinates informed, but keep yaw/pitch values.
     */
    public void setPositionAndUpdate(double par1, double par3, double par5)
    {
        this.serverForThisPlayer.setPlayerLocation(par1, par3, par5, this.rotationYaw, this.rotationPitch);
    }

    public final void superSetPositionAndUpdate(double var1, double var3, double var5)
    {
        super.setPositionAndUpdate(var1, var3, var5);
    }

    public final void superSetRevengeTarget(EntityLiving var1)
    {
        super.setRevengeTarget(var1);
    }

    public final void realSetRotation(float var1, float var2)
    {
        this.setRotation(var1, var2);
    }

    public final void superSetRotation(float var1, float var2)
    {
        super.setRotation(var1, var2);
    }

    public final void realSetSize(float var1, float var2)
    {
        this.setSize(var1, var2);
    }

    public final void superSetSize(float var1, float var2)
    {
        super.setSize(var1, var2);
    }

    public final void superSetSneaking(boolean var1)
    {
        super.setSneaking(var1);
    }

    public final void superSetSpawnChunk(ChunkCoordinates var1)
    {
        super.setSpawnChunk(var1);
    }

    public final void superSetSprinting(boolean var1)
    {
        super.setSprinting(var1);
    }

    public final void superSetVelocity(double var1, double var3, double var5)
    {
        super.setVelocity(var1, var3, var5);
    }

    public final void superSetWorld(World var1)
    {
        super.setWorld(var1);
    }

    public final boolean superShouldHeal()
    {
        return super.shouldHeal();
    }

    /**
     * Attempts to have the player sleep in a bed at the specified location.
     */
    public EnumStatus sleepInBedAt(int par1, int par2, int par3)
    {
        EnumStatus var4 = super.sleepInBedAt(par1, par2, par3);

        if (var4 == EnumStatus.OK)
        {
            Packet17Sleep var5 = new Packet17Sleep(this, 0, par1, par2, par3);
            this.getServerForPlayer().getEntityTracker().sendPacketToAllPlayersTrackingEntity(this, var5);
            this.serverForThisPlayer.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.serverForThisPlayer.sendPacketToPlayer(var5);
        }

        return var4;
    }

    public final EnumStatus superSleepInBedAt(int var1, int var2, int var3)
    {
        return super.sleepInBedAt(var1, var2, var3);
    }

    public final void superSpawnExplosionParticle()
    {
        super.spawnExplosionParticle();
    }

    public final void superStopUsingItem()
    {
        super.stopUsingItem();
    }

    /**
     * Swings the item the player is holding.
     */
    public void swingItem()
    {
        if (!this.isSwinging)
        {
            this.swingProgressInt = -1;
            this.isSwinging = true;
            this.getServerForPlayer().getEntityTracker().sendPacketToAllPlayersTrackingEntity(this, new Packet18Animation(this, 1));
        }
    }

    public final void superSwingItem()
    {
        super.swingItem();
    }

    public final String superToString()
    {
        return super.toString();
    }

    public final String superTranslateString(String var1, Object ... var2)
    {
        return super.translateString(var1, var2);
    }

    public void travelToTheEnd(int par1)
    {
        if (this.dimension == 1 && par1 == 1)
        {
            this.triggerAchievement(AchievementList.theEnd2);
            this.worldObj.setEntityDead(this);
            this.playerHasConqueredTheEnd = true;
            this.serverForThisPlayer.sendPacketToPlayer(new Packet70GameEvent(4, 0));
        }
        else
        {
            this.triggerAchievement(AchievementList.theEnd);
            ChunkCoordinates var2 = this.mcServer.worldServerForDimension(par1).getEntrancePortalLocation();

            if (var2 != null)
            {
                this.serverForThisPlayer.setPlayerLocation((double)var2.posX, (double)var2.posY, (double)var2.posZ, 0.0F, 0.0F);
            }

            this.mcServer.getConfigurationManager().transferPlayerToDimension(this, 1);
            this.lastExperience = -1;
            this.lastHealth = -1;
            this.lastFoodLevel = -1;
        }
    }

    public final void superTravelToTheEnd(int var1)
    {
        super.travelToTheEnd(var1);
    }

    public final void superTriggerAchievement(StatBase var1)
    {
        super.triggerAchievement(var1);
    }

    public final void superUnmountEntity(Entity var1)
    {
        super.unmountEntity(var1);
    }

    public final void realUpdateAITasks()
    {
        this.updateAITasks();
    }

    public final void superUpdateAITasks()
    {
        super.updateAITasks();
    }

    public final void realUpdateAITick()
    {
        this.updateAITick();
    }

    public final void superUpdateAITick()
    {
        super.updateAITick();
    }

    public void updateClientInfo(Packet204ClientInfo par1Packet204ClientInfo)
    {
        if (this.translator.getLanguageList().containsKey(par1Packet204ClientInfo.getLanguage()))
        {
            this.translator.setLanguage(par1Packet204ClientInfo.getLanguage());
        }

        int var2 = 256 >> par1Packet204ClientInfo.getRenderDistance();

        if (var2 > 3 && var2 < 15)
        {
            this.renderDistance = var2;
        }

        this.chatVisibility = par1Packet204ClientInfo.getChatVisibility();
        this.chatColours = par1Packet204ClientInfo.getChatColours();

        if (this.mcServer.isSinglePlayer() && this.mcServer.getServerOwner().equals(this.username))
        {
            this.mcServer.setDifficultyForAllDimensions(par1Packet204ClientInfo.getDifficulty());
        }
    }

    public final void superUpdateCloak()
    {
        super.updateCloak();
    }

    /**
     * send information about the crafting inventory to the client(currently only for furnace times)
     */
    public void updateCraftingInventoryInfo(Container par1Container, int par2, int par3)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet105UpdateProgressbar(par1Container.windowId, par2, par3));
    }

    /**
     * inform the player of a change in a single slot
     */
    public void updateCraftingInventorySlot(Container par1Container, int par2, ItemStack par3ItemStack)
    {
        if (!(par1Container.getSlot(par2) instanceof SlotCrafting))
        {
            if (!this.playerInventoryBeingManipulated)
            {
                this.serverForThisPlayer.sendPacketToPlayer(new Packet103SetSlot(par1Container.windowId, par2, par3ItemStack));
            }
        }
    }

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double par1, boolean par3) {}

    public final void realUpdateFallState(double var1, boolean var3)
    {
        this.updateFallState(var1, var3);
    }

    public final void superUpdateFallState(double var1, boolean var3)
    {
        super.updateFallState(var1, var3);
    }

    /**
     * likeUpdateFallState, but called from updateFlyingState, rather than moveEntity
     */
    public void updateFlyingState(double par1, boolean par3)
    {
        super.updateFallState(par1, par3);
    }

    public final void realUpdateItemUse(ItemStack var1, int var2)
    {
        this.updateItemUse(var1, var2);
    }

    public final void superUpdateItemUse(ItemStack var1, int var2)
    {
        super.updateItemUse(var1, var2);
    }

    public final void realUpdatePotionEffects()
    {
        this.updatePotionEffects();
    }

    public final void superUpdatePotionEffects()
    {
        super.updatePotionEffects();
    }

    public final void superUpdateRidden()
    {
        super.updateRidden();
    }

    public final void superUpdateRiderPosition()
    {
        super.updateRiderPosition();
    }

    /**
     * Wake up the player if they're sleeping.
     */
    public void wakeUpPlayer(boolean par1, boolean par2, boolean par3)
    {
        if (this.isPlayerSleeping())
        {
            this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(this, 3));
        }

        super.wakeUpPlayer(par1, par2, par3);

        if (this.serverForThisPlayer != null)
        {
            this.serverForThisPlayer.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }

    public final void superWakeUpPlayer(boolean var1, boolean var2, boolean var3)
    {
        super.wakeUpPlayer(var1, var2, var3);
    }

    public final void superWriteToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
    }

    public final int superXpBarCap()
    {
        return super.xpBarCap();
    }

    public final HashMap getActivePotionsMapField()
    {
        return this.activePotionsMap;
    }

    public final void setActivePotionsMapField(HashMap var1)
    {
        this.activePotionsMap = var1;
    }

    public final EntityPlayer getAttackingPlayerField()
    {
        return this.attackingPlayer;
    }

    public final void setAttackingPlayerField(EntityPlayer var1)
    {
        this.attackingPlayer = var1;
    }

    public final int getCarryoverDamageField()
    {
        return this.carryoverDamage;
    }

    public final void setCarryoverDamageField(int var1)
    {
        this.carryoverDamage = var1;
    }

    public final boolean getChatColoursField()
    {
        return this.chatColours;
    }

    public final void setChatColoursField(boolean var1)
    {
        this.chatColours = var1;
    }

    public final int getChatVisibilityField()
    {
        return this.chatVisibility;
    }

    public final void setChatVisibilityField(int var1)
    {
        this.chatVisibility = var1;
    }

    public final int getCurrentWindowIdField()
    {
        return this.currentWindowId;
    }

    public final void setCurrentWindowIdField(int var1)
    {
        this.currentWindowId = var1;
    }

    public final DataWatcher getDataWatcherField()
    {
        return this.dataWatcher;
    }

    public final void setDataWatcherField(DataWatcher var1)
    {
        this.dataWatcher = var1;
    }

    public final boolean getDeadField()
    {
        return this.dead;
    }

    public final void setDeadField(boolean var1)
    {
        this.dead = var1;
    }

    public final float getDefaultPitchField()
    {
        return this.defaultPitch;
    }

    public final void setDefaultPitchField(float var1)
    {
        this.defaultPitch = var1;
    }

    public final int getEntityAgeField()
    {
        return this.entityAge;
    }

    public final void setEntityAgeField(int var1)
    {
        this.entityAge = var1;
    }

    public final String getEntityTypeField()
    {
        return this.entityType;
    }

    public final void setEntityTypeField(String var1)
    {
        this.entityType = var1;
    }

    public final int getExperienceValueField()
    {
        return this.experienceValue;
    }

    public final void setExperienceValueField(int var1)
    {
        this.experienceValue = var1;
    }

    public final float getField_70706_boField()
    {
        return this.field_70706_bo;
    }

    public final void setField_70706_boField(float var1)
    {
        this.field_70706_bo = var1;
    }

    public final boolean getField_70740_aAField()
    {
        return this.field_70740_aA;
    }

    public final void setField_70740_aAField(boolean var1)
    {
        this.field_70740_aA = var1;
    }

    public final float getField_70741_aBField()
    {
        return this.field_70741_aB;
    }

    public final void setField_70741_aBField(float var1)
    {
        this.field_70741_aB = var1;
    }

    public final float getField_70743_aDField()
    {
        return this.field_70743_aD;
    }

    public final void setField_70743_aDField(float var1)
    {
        this.field_70743_aD = var1;
    }

    public final float getField_70745_aFField()
    {
        return this.field_70745_aF;
    }

    public final void setField_70745_aFField(float var1)
    {
        this.field_70745_aF = var1;
    }

    public final boolean getField_70753_ayField()
    {
        return this.field_70753_ay;
    }

    public final void setField_70753_ayField(boolean var1)
    {
        this.field_70753_ay = var1;
    }

    public final float getField_70763_axField()
    {
        return this.field_70763_ax;
    }

    public final void setField_70763_axField(float var1)
    {
        this.field_70763_ax = var1;
    }

    public final float getField_70764_awField()
    {
        return this.field_70764_aw;
    }

    public final void setField_70764_awField(float var1)
    {
        this.field_70764_aw = var1;
    }

    public final float getField_70766_avField()
    {
        return this.field_70766_av;
    }

    public final void setField_70766_avField(float var1)
    {
        this.field_70766_av = var1;
    }

    public final float getField_70768_auField()
    {
        return this.field_70768_au;
    }

    public final void setField_70768_auField(float var1)
    {
        this.field_70768_au = var1;
    }

    public final int getFlyToggleTimerField()
    {
        return this.flyToggleTimer;
    }

    public final void setFlyToggleTimerField(int var1)
    {
        this.flyToggleTimer = var1;
    }

    public final FoodStats getFoodStatsField()
    {
        return this.foodStats;
    }

    public final void setFoodStatsField(FoodStats var1)
    {
        this.foodStats = var1;
    }

    public final int getHealthField()
    {
        return this.health;
    }

    public final void setHealthField(int var1)
    {
        this.health = var1;
    }

    public final boolean getInPortalField()
    {
        return this.inPortal;
    }

    public final void setInPortalField(boolean var1)
    {
        this.inPortal = var1;
    }

    public final boolean getInWaterField()
    {
        return this.inWater;
    }

    public final void setInWaterField(boolean var1)
    {
        this.inWater = var1;
    }

    public final int getInitialInvulnerabilityField()
    {
        return this.initialInvulnerability;
    }

    public final void setInitialInvulnerabilityField(int var1)
    {
        this.initialInvulnerability = var1;
    }

    public final boolean getIsImmuneToFireField()
    {
        return this.isImmuneToFire;
    }

    public final void setIsImmuneToFireField(boolean var1)
    {
        this.isImmuneToFire = var1;
    }

    public final boolean getIsInWebField()
    {
        return this.isInWeb;
    }

    public final void setIsInWebField(boolean var1)
    {
        this.isInWeb = var1;
    }

    public final boolean getIsJumpingField()
    {
        return this.isJumping;
    }

    public final void setIsJumpingField(boolean var1)
    {
        this.isJumping = var1;
    }

    public final ItemStack[] getLastActiveItemsField()
    {
        return this.lastActiveItems;
    }

    public final void setLastActiveItemsField(ItemStack[] var1)
    {
        this.lastActiveItems = var1;
    }

    public final int getLastDamageField()
    {
        return this.lastDamage;
    }

    public final void setLastDamageField(int var1)
    {
        this.lastDamage = var1;
    }

    public final int getLastExperienceField()
    {
        return this.lastExperience;
    }

    public final void setLastExperienceField(int var1)
    {
        this.lastExperience = var1;
    }

    public final int getLastFoodLevelField()
    {
        return this.lastFoodLevel;
    }

    public final void setLastFoodLevelField(int var1)
    {
        this.lastFoodLevel = var1;
    }

    public final int getLastHealthField()
    {
        return this.lastHealth;
    }

    public final void setLastHealthField(int var1)
    {
        this.lastHealth = var1;
    }

    public final float getMoveForwardField()
    {
        return this.moveForward;
    }

    public final void setMoveForwardField(float var1)
    {
        this.moveForward = var1;
    }

    public final float getMoveSpeedField()
    {
        return this.moveSpeed;
    }

    public final void setMoveSpeedField(float var1)
    {
        this.moveSpeed = var1;
    }

    public final float getMoveStrafingField()
    {
        return this.moveStrafing;
    }

    public final void setMoveStrafingField(float var1)
    {
        this.moveStrafing = var1;
    }

    public final int getNewPosRotationIncrementsField()
    {
        return this.newPosRotationIncrements;
    }

    public final void setNewPosRotationIncrementsField(int var1)
    {
        this.newPosRotationIncrements = var1;
    }

    public final double getNewPosXField()
    {
        return this.newPosX;
    }

    public final void setNewPosXField(double var1)
    {
        this.newPosX = var1;
    }

    public final double getNewPosYField()
    {
        return this.newPosY;
    }

    public final void setNewPosYField(double var1)
    {
        this.newPosY = var1;
    }

    public final double getNewPosZField()
    {
        return this.newPosZ;
    }

    public final void setNewPosZField(double var1)
    {
        this.newPosZ = var1;
    }

    public final double getNewRotationPitchField()
    {
        return this.newRotationPitch;
    }

    public final void setNewRotationPitchField(double var1)
    {
        this.newRotationPitch = var1;
    }

    public final double getNewRotationYawField()
    {
        return this.newRotationYaw;
    }

    public final void setNewRotationYawField(double var1)
    {
        this.newRotationYaw = var1;
    }

    public final int getNumTicksToChaseTargetField()
    {
        return this.numTicksToChaseTarget;
    }

    public final void setNumTicksToChaseTargetField(int var1)
    {
        this.numTicksToChaseTarget = var1;
    }

    public final Random getRandField()
    {
        return this.rand;
    }

    public final void setRandField(Random var1)
    {
        this.rand = var1;
    }

    public final float getRandomYawVelocityField()
    {
        return this.randomYawVelocity;
    }

    public final void setRandomYawVelocityField(float var1)
    {
        this.randomYawVelocity = var1;
    }

    public final int getRecentlyHitField()
    {
        return this.recentlyHit;
    }

    public final void setRecentlyHitField(int var1)
    {
        this.recentlyHit = var1;
    }

    public final int getRenderDistanceField()
    {
        return this.renderDistance;
    }

    public final void setRenderDistanceField(int var1)
    {
        this.renderDistance = var1;
    }

    public final int getScoreValueField()
    {
        return this.scoreValue;
    }

    public final void setScoreValueField(int var1)
    {
        this.scoreValue = var1;
    }

    public final boolean getSleepingField()
    {
        return this.sleeping;
    }

    public final void setSleepingField(boolean var1)
    {
        this.sleeping = var1;
    }

    public final float getSpeedInAirField()
    {
        return this.speedInAir;
    }

    public final void setSpeedInAirField(float var1)
    {
        this.speedInAir = var1;
    }

    public final float getSpeedOnGroundField()
    {
        return this.speedOnGround;
    }

    public final void setSpeedOnGroundField(float var1)
    {
        this.speedOnGround = var1;
    }

    public final EntityAITasks getTargetTasksField()
    {
        return this.targetTasks;
    }

    public final EntityAITasks getTasksField()
    {
        return this.tasks;
    }

    public final String getTextureField()
    {
        return this.texture;
    }

    public final void setTextureField(String var1)
    {
        this.texture = var1;
    }

    public final StringTranslate getTranslatorField()
    {
        return this.translator;
    }

    public final void setTranslatorField(StringTranslate var1)
    {
        this.translator = var1;
    }

    public final boolean getWasHungryField()
    {
        return this.wasHungry;
    }

    public final void setWasHungryField(boolean var1)
    {
        this.wasHungry = var1;
    }
}
