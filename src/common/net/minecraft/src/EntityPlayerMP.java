package net.minecraft.src;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);

        if (par1NBTTagCompound.hasKey("playerGameType"))
        {
            this.theItemInWorldManager.setGameType(EnumGameType.getByID(par1NBTTagCompound.getInteger("playerGameType")));
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("playerGameType", this.theItemInWorldManager.getGameType().getID());
    }

    /**
     * Decrease the player level, used to pay levels for enchantments on items at enchanted table.
     */
    public void removeExperience(int par1)
    {
        super.removeExperience(par1);
        this.lastExperience = -1;
    }

    public void addSelfToInternalCraftingInventory()
    {
        this.craftingInventory.addCraftingToCrafters(this);
    }

    public ItemStack[] getLastActiveItems()
    {
        return this.lastActiveItems;
    }

    /**
     * sets the players height back to normal after doing things like sleeping and dieing
     */
    protected void resetHeight()
    {
        this.yOffset = 0.0F;
    }

    public float getEyeHeight()
    {
        return 1.62F;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
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

        if (this.getHealth() != this.lastHealth || this.lastFoodLevel != this.foodStats.getFoodLevel() || this.foodStats.getSaturationLevel() == 0.0F != this.wasHungry)
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
     * 0 = item, 1-n is armor
     */
    public ItemStack getCurrentItemOrArmor(int par1)
    {
        return par1 == 0 ? this.inventory.getCurrentItem() : this.inventory.armorInventory[par1 - 1];
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
        this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new Packet3Chat(par1DamageSource.getDeathMessage(this)));
        this.inventory.dropAllItems();
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        if (this.initialInvulnerability > 0)
        {
            return false;
        }
        else
        {
            if (!this.mcServer.isPVPEnabled() && par1DamageSource instanceof EntityDamageSource)
            {
                Entity var3 = par1DamageSource.getEntity();

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

            return super.attackEntityFrom(par1DamageSource, par2);
        }
    }

    /**
     * returns if pvp is enabled or not
     */
    protected boolean isPVPEnabled()
    {
        return this.mcServer.isPVPEnabled();
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

    /**
     * Called when a player mounts an entity. e.g. mounts a pig, mounts a boat.
     */
    public void mountEntity(Entity par1Entity)
    {
        super.mountEntity(par1Entity);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet39AttachEntity(this, this.ridingEntity));
        this.serverForThisPlayer.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
    }

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * likeUpdateFallState, but called from updateFlyingState, rather than moveEntity
     */
    public void updateFlyingState(double par1, boolean par3)
    {
        super.updateFallState(par1, par3);
    }

    public void incrementWindowID()
    {
        this.currentWindowId = this.currentWindowId % 100 + 1;
    }

    /**
     * Displays the crafting GUI for a workbench.
     */
    public void displayGUIWorkbench(int par1, int par2, int par3)
    {
        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 1, "Crafting", 9));
        this.craftingInventory = new ContainerWorkbench(this.inventory, this.worldObj, par1, par2, par3);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    public void displayGUIEnchantment(int par1, int par2, int par3)
    {
        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 4, "Enchanting", 9));
        this.craftingInventory = new ContainerEnchantment(this.inventory, this.worldObj, par1, par2, par3);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the GUI for interacting with a chest inventory. Args: chestInventory
     */
    public void displayGUIChest(IInventory par1IInventory)
    {
        if (this.craftingInventory != this.inventorySlots)
        {
            this.closeScreen();
        }

        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 0, par1IInventory.getInvName(), par1IInventory.getSizeInventory()));
        this.craftingInventory = new ContainerChest(this.inventory, par1IInventory);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the furnace GUI for the passed in furnace entity. Args: tileEntityFurnace
     */
    public void displayGUIFurnace(TileEntityFurnace par1TileEntityFurnace)
    {
        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 2, par1TileEntityFurnace.getInvName(), par1TileEntityFurnace.getSizeInventory()));
        this.craftingInventory = new ContainerFurnace(this.inventory, par1TileEntityFurnace);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the dipsenser GUI for the passed in dispenser entity. Args: TileEntityDispenser
     */
    public void displayGUIDispenser(TileEntityDispenser par1TileEntityDispenser)
    {
        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 3, par1TileEntityDispenser.getInvName(), par1TileEntityDispenser.getSizeInventory()));
        this.craftingInventory = new ContainerDispenser(this.inventory, par1TileEntityDispenser);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    /**
     * Displays the GUI for interacting with a brewing stand.
     */
    public void displayGUIBrewingStand(TileEntityBrewingStand par1TileEntityBrewingStand)
    {
        this.incrementWindowID();
        this.serverForThisPlayer.sendPacketToPlayer(new Packet100OpenWindow(this.currentWindowId, 5, par1TileEntityBrewingStand.getInvName(), par1TileEntityBrewingStand.getSizeInventory()));
        this.craftingInventory = new ContainerBrewingStand(this.inventory, par1TileEntityBrewingStand);
        this.craftingInventory.windowId = this.currentWindowId;
        this.craftingInventory.addCraftingToCrafters(this);
    }

    public void displayGUIMerchant(IMerchant par1IMerchant)
    {
        this.incrementWindowID();
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

    public void sendContainerToPlayer(Container par1Container)
    {
        this.sendContainerAndContentsToPlayer(par1Container, par1Container.getInventory());
    }

    public void sendContainerAndContentsToPlayer(Container par1Container, List par2List)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet104WindowItems(par1Container.windowId, par2List));
        this.serverForThisPlayer.sendPacketToPlayer(new Packet103SetSlot(-1, -1, this.inventory.getItemStack()));
    }

    /**
     * send information about the crafting inventory to the client(currently only for furnace times)
     */
    public void updateCraftingInventoryInfo(Container par1Container, int par2, int par3)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet105UpdateProgressbar(par1Container.windowId, par2, par3));
    }

    /**
     * sets current screen to null (used on escape buttons of GUIs)
     */
    public void closeScreen()
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet101CloseWindow(this.craftingInventory.windowId));
        this.closeInventory();
    }

    public void sendInventoryToPlayer()
    {
        if (!this.playerInventoryBeingManipulated)
        {
            this.serverForThisPlayer.sendPacketToPlayer(new Packet103SetSlot(-1, -1, this.inventory.getItemStack()));
        }
    }

    public void closeInventory()
    {
        this.craftingInventory.onCraftGuiClosed(this);
        this.craftingInventory = this.inventorySlots;
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

    public void mountEntityAndWakeUp()
    {
        if (this.ridingEntity != null)
        {
            this.mountEntity(this.ridingEntity);
        }

        if (this.riddenByEntity != null)
        {
            this.riddenByEntity.mountEntity(this);
        }

        if (this.sleeping)
        {
            this.wakeUpPlayer(true, false, false);
        }
    }

    /**
     * this function is called when a players inventory is sent to him, lastHealth is updated on any dimension
     * transitions, then reset.
     */
    public void setPlayerHealthUpdated()
    {
        this.lastHealth = -99999999;
    }

    /**
     * Add a chat message to the player
     */
    public void addChatMessage(String par1Str)
    {
        StringTranslate var2 = StringTranslate.getInstance();
        String var3 = var2.translateKey(par1Str);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet3Chat(var3));
    }

    /**
     * Used for when item use count runs out, ie: eating completed
     */
    protected void onItemUseFinish()
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet38EntityStatus(this.entityId, (byte)9));
        super.onItemUseFinish();
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

    protected void onNewPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onNewPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet41EntityEffect(this.entityId, par1PotionEffect));
    }

    protected void onChangedPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onChangedPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet41EntityEffect(this.entityId, par1PotionEffect));
    }

    protected void onFinishedPotionEffect(PotionEffect par1PotionEffect)
    {
        super.onFinishedPotionEffect(par1PotionEffect);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet42RemoveEntityEffect(this.entityId, par1PotionEffect));
    }

    /**
     * Move the entity to the coordinates informed, but keep yaw/pitch values.
     */
    public void setPositionAndUpdate(double par1, double par3, double par5)
    {
        this.serverForThisPlayer.setPlayerLocation(par1, par3, par5, this.rotationYaw, this.rotationPitch);
    }

    /**
     * Called when the player performs a critical hit on the Entity. Args: entity that was hit critically
     */
    public void onCriticalHit(Entity par1Entity)
    {
        this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(par1Entity, 6));
    }

    public void onEnchantmentCritical(Entity par1Entity)
    {
        this.getServerForPlayer().getEntityTracker().sendPacketToAllAssociatedPlayers(this, new Packet18Animation(par1Entity, 7));
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

    public WorldServer getServerForPlayer()
    {
        return (WorldServer)this.worldObj;
    }

    public void sendGameTypeToPlayer(EnumGameType par1EnumGameType)
    {
        this.theItemInWorldManager.setGameType(par1EnumGameType);
        this.serverForThisPlayer.sendPacketToPlayer(new Packet70GameEvent(3, par1EnumGameType.getID()));
    }

    public void sendChatToPlayer(String par1Str)
    {
        this.serverForThisPlayer.sendPacketToPlayer(new Packet3Chat(par1Str));
    }

    /**
     * Returns true if the command sender is allowed to use the given command.
     */
    public boolean canCommandSenderUseCommand(String par1Str)
    {
        return "seed".equals(par1Str) && !this.mcServer.isDedicatedServer() ? true : (!"tell".equals(par1Str) && !"help".equals(par1Str) && !"me".equals(par1Str) ? this.mcServer.getConfigurationManager().areCommandsAllowed(this.username) : true);
    }

    public String func_71114_r()
    {
        String var1 = this.serverForThisPlayer.theNetworkManager.getSocketAddress().toString();
        var1 = var1.substring(var1.indexOf("/") + 1);
        var1 = var1.substring(0, var1.indexOf(":"));
        return var1;
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

    public StringTranslate getTranslator()
    {
        return this.translator;
    }

    public int getChatVisibility()
    {
        return this.chatVisibility;
    }

    /**
     * on recieving this message the client (if permission is given) will download the requested textures
     */
    public void requestTexturePackLoad(String par1Str, int par2)
    {
        String var3 = par1Str + "\u0000" + par2;
        this.serverForThisPlayer.sendPacketToPlayer(new Packet250CustomPayload("MC|TPack", var3.getBytes()));
    }
}
