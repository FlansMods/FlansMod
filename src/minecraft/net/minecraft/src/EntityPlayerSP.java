package net.minecraft.src;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import flan.server.HexAPI;
import flan.server.PlayerBase;
import net.minecraft.client.Minecraft;

@SideOnly(Side.CLIENT)
public class EntityPlayerSP extends EntityPlayer
{
    public MovementInput movementInput;
    protected Minecraft mc;

    /**
     * Used to tell if the player pressed forward twice. If this is at 0 and it's pressed (And they are allowed to
     * sprint, aka enough food on the ground etc) it sets this to 7. If it's pressed and it's greater than 0 enable
     * sprinting.
     */
    protected int sprintToggleTimer = 0;

    /** Ticks left before sprinting is disabled. */
    public int sprintingTicksLeft = 0;
    public float renderArmYaw;
    public float renderArmPitch;
    public float prevRenderArmYaw;
    public float prevRenderArmPitch;
    private MouseFilter field_71162_ch = new MouseFilter();
    private MouseFilter field_71160_ci = new MouseFilter();
    private MouseFilter field_71161_cj = new MouseFilter();

    /** HexAPI */
    public final HexAPI HAPI = HexAPI.create(this);
    
    public EntityPlayerSP(Minecraft par1Minecraft, World par2World, Session par3Session, int par4)
    {
        super(par2World);
        this.mc = par1Minecraft;
        this.dimension = par4;

        if (par3Session != null && par3Session.username != null && par3Session.username.length() > 0)
        {
            this.skinUrl = "http://skins.minecraft.net/MinecraftSkins/" + StringUtils.stripControlCodes(par3Session.username) + ".png";
        }

        this.username = par3Session.username;
        HexAPI.afterLocalConstructing(this, par1Minecraft, par2World, par3Session, par4);
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
    
    public final PlayerBase getPlayerBase(String var1)
    {
        return this.HAPI != null ? this.HAPI.getPlayerBase(var1) : null;
    }

    public final Set getPlayerBaseIds(String var1)
    {
        return this.HAPI != null ? this.HAPI.getPlayerBaseIds() : Collections.emptySet();
    }

    /**
     * increases exhaustion level by supplied amount
     */
    public void addExhaustion(float var1)
    {
        if (this.HAPI != null && this.HAPI.isAddExhaustionModded)
        {
            HAPI.addExhaustion(this, var1);
        }
        else
        {
            super.addExhaustion(var1);
        }
    }

    public final void superAddExhaustion(float var1)
    {
        super.addExhaustion(var1);
    }

    public final void localAddExhaustion(float var1)
    {
        super.addExhaustion(var1);
    }

    /**
     * Adds a value to a movement statistic field - like run, walk, swin or climb.
     */
    public void addMovementStat(double var1, double var3, double var5)
    {
        if (this.HAPI != null && this.HAPI.isAddMovementStatModded)
        {
            HAPI.addMovementStat(this, var1, var3, var5);
        }
        else
        {
            super.addMovementStat(var1, var3, var5);
        }
    }

    public final void superAddMovementStat(double var1, double var3, double var5)
    {
        super.addMovementStat(var1, var3, var5);
    }

    public final void localAddMovementStat(double var1, double var3, double var5)
    {
        super.addMovementStat(var1, var3, var5);
    }

    /**
     * Adds a value to a statistic field.
     */
    public void addStat(StatBase par1StatBase, int par2)
    {
        if (this.HAPI != null && this.HAPI.isAddStatModded)
        {
            HAPI.addStat(this, par1StatBase, par2);
        }
        else
        {
            this.localAddStat(par1StatBase, par2);
        }
    }

    public final void superAddStat(StatBase var1, int var2)
    {
        super.addStat(var1, var2);
    }

    public final void localAddStat(StatBase var1, int var2)
    {
        if (var1 != null)
        {
            if (var1.isAchievement())
            {
                Achievement var3 = (Achievement)var1;

                if (var3.parentAchievement == null || this.mc.statFileWriter.hasAchievementUnlocked(var3.parentAchievement))
                {
                    if (!this.mc.statFileWriter.hasAchievementUnlocked(var3))
                    {
                        this.mc.guiAchievement.queueTakenAchievement(var3);
                    }

                    this.mc.statFileWriter.readStat(var1, var2);
                }
            }
            else
            {
                this.mc.statFileWriter.readStat(var1, var2);
            }
        }
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        boolean var3;

        if (this.HAPI != null && this.HAPI.isAttackEntityFromModded)
        {
            var3 = HAPI.attackEntityFrom(this, var1, var2);
        }
        else
        {
            var3 = super.attackEntityFrom(var1, var2);
        }

        return var3;
    }

    public final boolean superAttackEntityFrom(DamageSource var1, int var2)
    {
        return super.attackEntityFrom(var1, var2);
    }

    public final boolean localAttackEntityFrom(DamageSource var1, int var2)
    {
        return super.attackEntityFrom(var1, var2);
    }

    /**
     * Called when the player attack or gets attacked, it's alert all wolves in the area that are owned by the player to
     * join the attack or defend the player.
     */
    protected void alertWolves(EntityLiving var1, boolean var2)
    {
        if (this.HAPI != null && this.HAPI.isAlertWolvesModded)
        {
            HAPI.alertWolves(this, var1, var2);
        }
        else
        {
            super.alertWolves(var1, var2);
        }
    }

    public final void realAlertWolves(EntityLiving var1, boolean var2)
    {
        this.alertWolves(var1, var2);
    }

    public final void superAlertWolves(EntityLiving var1, boolean var2)
    {
        super.alertWolves(var1, var2);
    }

    public final void localAlertWolves(EntityLiving var1, boolean var2)
    {
        super.alertWolves(var1, var2);
    }

    /**
     * Attacks for the player the targeted entity with the currently equipped item.  The equipped item has hitEntity
     * called on it. Args: targetEntity
     */
    public void attackTargetEntityWithCurrentItem(Entity var1)
    {
        if (this.HAPI != null && this.HAPI.isAttackTargetEntityWithCurrentItemModded)
        {
            HAPI.attackTargetEntityWithCurrentItem(this, var1);
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

    public boolean canBreatheUnderwater()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isCanBreatheUnderwaterModded)
        {
            var1 = HAPI.canBreatheUnderwater(this);
        }
        else
        {
            var1 = super.canBreatheUnderwater();
        }

        return var1;
    }

    public final boolean superCanBreatheUnderwater()
    {
        return super.canBreatheUnderwater();
    }

    public final boolean localCanBreatheUnderwater()
    {
        return super.canBreatheUnderwater();
    }

    /**
     * Checks if the player has the ability to harvest a block (checks current inventory item for a tool if necessary)
     */
    public boolean canHarvestBlock(Block var1)
    {
        boolean var2;

        if (this.HAPI != null && this.HAPI.isCanHarvestBlockModded)
        {
            var2 = HAPI.canHarvestBlock(this, var1);
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

        if (this.HAPI != null && this.HAPI.isCanPlayerEditModded)
        {
            var4 = HAPI.canPlayerEdit(this, var1, var2, var3);
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

        if (this.HAPI != null && this.HAPI.isCanTriggerWalkingModded)
        {
            var1 = HAPI.canTriggerWalking(this);
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
     * sets current screen to null (used on escape buttons of GUIs)
     */
    public void closeScreen()
    {
        if (this.HAPI != null && this.HAPI.isCloseScreenModded)
        {
            HAPI.closeScreen(this);
        }
        else
        {
            this.localCloseScreen();
        }
    }

    public final void superCloseScreen()
    {
        super.closeScreen();
    }

    public final void localCloseScreen()
    {
        super.closeScreen();
        this.mc.displayGuiScreen((GuiScreen)null);
    }

    /**
     * Deals damage to the entity. If its a EntityPlayer then will take damage from the armor first and then health
     * second with the reduced value. Args: damageAmount
     */
    protected void damageEntity(DamageSource var1, int var2)
    {
        if (this.HAPI != null && this.HAPI.isDamageEntityModded)
        {
            HAPI.damageEntity(this, var1, var2);
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
     * Displays the GUI for interacting with a brewing stand.
     */
    public void displayGUIBrewingStand(TileEntityBrewingStand par1TileEntityBrewingStand)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIBrewingStandModded)
        {
            HAPI.displayGUIBrewingStand(this, par1TileEntityBrewingStand);
        }
        else
        {
            this.localDisplayGUIBrewingStand(par1TileEntityBrewingStand);
        }
    }

    public final void superDisplayGUIBrewingStand(TileEntityBrewingStand var1)
    {
        super.displayGUIBrewingStand(var1);
    }

    public final void localDisplayGUIBrewingStand(TileEntityBrewingStand var1)
    {
        this.mc.displayGuiScreen(new GuiBrewingStand(this.inventory, var1));
    }

    /**
     * Displays the GUI for interacting with a chest inventory. Args: chestInventory
     */
    public void displayGUIChest(IInventory par1IInventory)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIChestModded)
        {
            HAPI.displayGUIChest(this, par1IInventory);
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
        this.mc.displayGuiScreen(new GuiChest(this.inventory, var1));
    }

    /**
     * Displays the dipsenser GUI for the passed in dispenser entity. Args: TileEntityDispenser
     */
    public void displayGUIDispenser(TileEntityDispenser par1TileEntityDispenser)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIDispenserModded)
        {
            HAPI.displayGUIDispenser(this, par1TileEntityDispenser);
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
        this.mc.displayGuiScreen(new GuiDispenser(this.inventory, var1));
    }

    /**
     * Displays the GUI for editing a sign. Args: tileEntitySign
     */
    public void displayGUIEditSign(TileEntitySign par1TileEntitySign)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIEditSignModded)
        {
            HAPI.displayGUIEditSign(this, par1TileEntitySign);
        }
        else
        {
            this.localDisplayGUIEditSign(par1TileEntitySign);
        }
    }

    public final void superDisplayGUIEditSign(TileEntitySign var1)
    {
        super.displayGUIEditSign(var1);
    }

    public final void localDisplayGUIEditSign(TileEntitySign var1)
    {
        this.mc.displayGuiScreen(new GuiEditSign(var1));
    }

    public void displayGUIEnchantment(int par1, int par2, int par3)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIEnchantmentModded)
        {
            HAPI.displayGUIEnchantment(this, par1, par2, par3);
        }
        else
        {
            this.localDisplayGUIEnchantment(par1, par2, par3);
        }
    }

    public final void superDisplayGUIEnchantment(int var1, int var2, int var3)
    {
        super.displayGUIEnchantment(var1, var2, var3);
    }

    public final void localDisplayGUIEnchantment(int var1, int var2, int var3)
    {
        this.mc.displayGuiScreen(new GuiEnchantment(this.inventory, this.worldObj, var1, var2, var3));
    }

    /**
     * Displays the furnace GUI for the passed in furnace entity. Args: tileEntityFurnace
     */
    public void displayGUIFurnace(TileEntityFurnace par1TileEntityFurnace)
    {
        if (this.HAPI != null && this.HAPI.isDisplayGUIFurnaceModded)
        {
            HAPI.displayGUIFurnace(this, par1TileEntityFurnace);
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
        this.mc.displayGuiScreen(new GuiFurnace(this.inventory, var1));
    }

    /**
     * Displays the crafting GUI for a workbench.
     */
    public void displayGUIWorkbench(int par1, int par2, int par3)
    {
        if (this.HAPI != null && this.HAPI.isDisplayWorkbenchGUIModded)
        {
            HAPI.displayWorkbenchGUI(this, par1, par2, par3);
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
        this.mc.displayGuiScreen(new GuiCrafting(this.inventory, this.worldObj, var1, var2, var3));
    }

    /**
     * Called when player presses the drop item key
     */
    public EntityItem dropOneItem()
    {
        EntityItem var1;

        if (this.HAPI != null && this.HAPI.isDropOneItemModded)
        {
            var1 = HAPI.dropOneItem(this);
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

        if (this.HAPI != null && this.HAPI.isDropPlayerItemModded)
        {
            var2 = HAPI.dropPlayerItem(this, var1);
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
     * Args: itemstack, flag
     */
    public EntityItem dropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
    {
        EntityItem var3;

        if (this.HAPI != null && this.HAPI.isDropPlayerItemWithRandomChoiceModded)
        {
            var3 = HAPI.dropPlayerItemWithRandomChoice(this, var1, var2);
        }
        else
        {
            var3 = super.dropPlayerItemWithRandomChoice(var1, var2);
        }

        return var3;
    }

    public final EntityItem superDropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
    {
        return super.dropPlayerItemWithRandomChoice(var1, var2);
    }

    public final EntityItem localDropPlayerItemWithRandomChoice(ItemStack var1, boolean var2)
    {
        return super.dropPlayerItemWithRandomChoice(var1, var2);
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1)
    {
        if (this.HAPI != null && this.HAPI.isFallModded)
        {
            HAPI.fall(this, var1);
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
     * Gets how bright this entity is.
     */
    public float getBrightness(float var1)
    {
        float var2;

        if (this.HAPI != null && this.HAPI.isGetBrightnessModded)
        {
            var2 = HAPI.getBrightness(this, var1);
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

    public int getBrightnessForRender(float var1)
    {
        int var2;

        if (this.HAPI != null && this.HAPI.isGetBrightnessForRenderModded)
        {
            var2 = HAPI.getBrightnessForRender(this, var1);
        }
        else
        {
            var2 = super.getBrightnessForRender(var1);
        }

        return var2;
    }

    public final int superGetBrightnessForRender(float var1)
    {
        return super.getBrightnessForRender(var1);
    }

    public final int localGetBrightnessForRender(float var1)
    {
        return super.getBrightnessForRender(var1);
    }

    /**
     * Returns how strong the player is against the specified block at this moment
     */
    public float getCurrentPlayerStrVsBlock(Block var1)
    {
        float var2;

        if (this.HAPI != null && this.HAPI.isGetCurrentPlayerStrVsBlockModded)
        {
            var2 = HAPI.getCurrentPlayerStrVsBlock(this, var1);
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

        if (this.HAPI != null && this.HAPI.isGetDistanceSqModded)
        {
            var7 = HAPI.getDistanceSq(this, var1, var3, var5);
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
     * Returns the squared distance to the entity. Args: entity
     */
    public double getDistanceSqToEntity(Entity var1)
    {
        double var2;

        if (this.HAPI != null && this.HAPI.isGetDistanceSqToEntityModded)
        {
            var2 = HAPI.getDistanceSqToEntity(this, var1);
        }
        else
        {
            var2 = super.getDistanceSqToEntity(var1);
        }

        return var2;
    }

    public final double superGetDistanceSqToEntity(Entity var1)
    {
        return super.getDistanceSqToEntity(var1);
    }

    public final double localGetDistanceSqToEntity(Entity var1)
    {
        return super.getDistanceSqToEntity(var1);
    }

    /**
     * Gets the player's field of view multiplier. (ex. when flying)
     */
    public float getFOVMultiplier()
    {
        float var1;

        if (this.HAPI != null && this.HAPI.isGetFOVMultiplierModded)
        {
            var1 = HAPI.getFOVMultiplier(this);
        }
        else
        {
            var1 = this.localGetFOVMultiplier();
        }

        return var1;
    }

    public final float localGetFOVMultiplier()
    {
        float var1 = 1.0F;

        if (this.capabilities.isFlying)
        {
            var1 *= 1.1F;
        }

        var1 *= (this.landMovementFactor * this.getSpeedModifier() / this.speedOnGround + 1.0F) / 2.0F;

        if (this.isUsingItem() && this.getItemInUse().itemID == Item.bow.shiftedIndex)
        {
            int var2 = this.getItemInUseDuration();
            float var3 = (float)var2 / 20.0F;

            if (var3 > 1.0F)
            {
                var3 = 1.0F;
            }
            else
            {
                var3 *= var3;
            }

            var1 *= 1.0F - var3 * 0.15F;
        }

        return var1;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        String var1;

        if (this.HAPI != null && this.HAPI.isGetHurtSoundModded)
        {
            var1 = HAPI.getHurtSound(this);
        }
        else
        {
            var1 = super.getHurtSound();
        }

        return var1;
    }

    public final String realGetHurtSound()
    {
        return this.getHurtSound();
    }

    public final String superGetHurtSound()
    {
        return super.getHurtSound();
    }

    public final String localGetHurtSound()
    {
        return super.getHurtSound();
    }

    /**
     * Gets the Icon Index of the item currently held
     */
    public int getItemIcon(ItemStack var1, int var2)
    {
        int var3;

        if (this.HAPI != null && this.HAPI.isGetItemIconModded)
        {
            var3 = HAPI.getItemIcon(this, var1, var2);
        }
        else
        {
            var3 = super.getItemIcon(var1, var2);
        }

        return var3;
    }

    public final int superGetItemIcon(ItemStack var1, int var2)
    {
        return super.getItemIcon(var1, var2);
    }

    public final int localGetItemIcon(ItemStack var1, int var2)
    {
        return super.getItemIcon(var1, var2);
    }

    public int getSleepTimer()
    {
        int var1;

        if (this.HAPI != null && this.HAPI.isGetSleepTimerModded)
        {
            var1 = HAPI.getSleepTimer(this);
        }
        else
        {
            var1 = super.getSleepTimer();
        }

        return var1;
    }

    public final int superGetSleepTimer()
    {
        return super.getSleepTimer();
    }

    public final int localGetSleepTimer()
    {
        return super.getSleepTimer();
    }

    /**
     * This method returns a value to be applied directly to entity speed, this factor is less than 1 when a slowdown
     * potion effect is applied, more than 1 when a haste potion effect is applied and 2 for fleeing entities.
     */
    protected float getSpeedModifier()
    {
        float var1;

        if (this.HAPI != null && this.HAPI.isGetSpeedModifierModded)
        {
            var1 = HAPI.getSpeedModifier(this);
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
     * Whether or not the current entity is in lava
     */
    public boolean handleLavaMovement()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isHandleLavaMovementModded)
        {
            var1 = HAPI.handleLavaMovement(this);
        }
        else
        {
            var1 = super.handleLavaMovement();
        }

        return var1;
    }

    public final boolean superHandleLavaMovement()
    {
        return super.handleLavaMovement();
    }

    public final boolean localHandleLavaMovement()
    {
        return super.handleLavaMovement();
    }

    /**
     * Returns if this entity is in water and will end up adding the waters velocity to the entity
     */
    public boolean handleWaterMovement()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isHandleWaterMovementModded)
        {
            var1 = HAPI.handleWaterMovement(this);
        }
        else
        {
            var1 = super.handleWaterMovement();
        }

        return var1;
    }

    public final boolean superHandleWaterMovement()
    {
        return super.handleWaterMovement();
    }

    public final boolean localHandleWaterMovement()
    {
        return super.handleWaterMovement();
    }

    /**
     * Heal living entity (param: amount of half-hearts)
     */
    public void heal(int var1)
    {
        if (this.HAPI != null && this.HAPI.isHealModded)
        {
            HAPI.heal(this, var1);
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
     * Checks if this entity is inside of an opaque block
     */
    public boolean isEntityInsideOpaqueBlock()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isIsEntityInsideOpaqueBlockModded)
        {
            var1 = HAPI.isEntityInsideOpaqueBlock(this);
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

        if (this.HAPI != null && this.HAPI.isIsInWaterModded)
        {
            var1 = HAPI.isInWater(this);
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

        if (this.HAPI != null && this.HAPI.isIsInsideOfMaterialModded)
        {
            var2 = HAPI.isInsideOfMaterial(this, var1);
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

        if (this.HAPI != null && this.HAPI.isIsOnLadderModded)
        {
            var1 = HAPI.isOnLadder(this);
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
     * Returns if this entity is sneaking.
     */
    public boolean isSneaking()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isIsSneakingModded)
        {
            var1 = HAPI.isSneaking(this);
        }
        else
        {
            var1 = this.localIsSneaking();
        }

        return var1;
    }

    public final boolean superIsSneaking()
    {
        return super.isSneaking();
    }

    public final boolean localIsSneaking()
    {
        return this.movementInput.sneak && !this.sleeping;
    }

    /**
     * Get if the Entity is sprinting.
     */
    public boolean isSprinting()
    {
        boolean var1;

        if (this.HAPI != null && this.HAPI.isIsSprintingModded)
        {
            var1 = HAPI.isSprinting(this);
        }
        else
        {
            var1 = super.isSprinting();
        }

        return var1;
    }

    public final boolean superIsSprinting()
    {
        return super.isSprinting();
    }

    public final boolean localIsSprinting()
    {
        return super.isSprinting();
    }

    /**
     * Causes this entity to do an upwards motion (jumping).
     */
    protected void jump()
    {
        if (this.HAPI != null && this.HAPI.isJumpModded)
        {
            HAPI.jump(this);
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
     * knocks back this entity
     */
    public void knockBack(Entity var1, int var2, double var3, double var5)
    {
        if (this.HAPI != null && this.HAPI.isKnockBackModded)
        {
            HAPI.knockBack(this, var1, var2, var3, var5);
        }
        else
        {
            super.knockBack(var1, var2, var3, var5);
        }
    }

    public final void superKnockBack(Entity var1, int var2, double var3, double var5)
    {
        super.knockBack(var1, var2, var3, var5);
    }

    public final void localKnockBack(Entity var1, int var2, double var3, double var5)
    {
        super.knockBack(var1, var2, var3, var5);
    }

    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    public void moveEntity(double par1, double par3, double par5)
    {
        if (this.HAPI != null && this.HAPI.isMoveEntityModded)
        {
            HAPI.moveEntity(this, par1, par3, par5);
        }
        else
        {
            this.localMoveEntity(par1, par3, par5);
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
        if (this.HAPI != null && this.HAPI.isMoveEntityWithHeadingModded)
        {
            HAPI.moveEntityWithHeading(this, var1, var2);
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
        if (this.HAPI != null && this.HAPI.isMoveFlyingModded)
        {
            HAPI.moveFlying(this, var1, var2, var3);
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
    public void onDeath(DamageSource var1)
    {
        if (this.HAPI != null && this.HAPI.isOnDeathModded)
        {
            HAPI.onDeath(this, var1);
        }
        else
        {
            super.onDeath(var1);
        }
    }

    public final void superOnDeath(DamageSource var1)
    {
        super.onDeath(var1);
    }

    public final void localOnDeath(DamageSource var1)
    {
        super.onDeath(var1);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.HAPI != null && this.HAPI.isOnLivingUpdateModded)
        {
            HAPI.onLivingUpdate(this);
        }
        else
        {
            this.localOnLivingUpdate();
        }
    }

    public final void superOnLivingUpdate()
    {
        super.onLivingUpdate();
    }

    public final void localOnLivingUpdate()
    {
        if (this.sprintingTicksLeft > 0)
        {
            --this.sprintingTicksLeft;

            if (this.sprintingTicksLeft == 0)
            {
                this.setSprinting(false);
            }
        }

        if (this.sprintToggleTimer > 0)
        {
            --this.sprintToggleTimer;
        }

        if (this.mc.playerController.func_78747_a())
        {
            this.posX = this.posZ = 0.5D;
            this.posX = 0.0D;
            this.posZ = 0.0D;
            this.rotationYaw = (float)this.ticksExisted / 12.0F;
            this.rotationPitch = 10.0F;
            this.posY = 68.5D;
        }
        else
        {
            if (!this.mc.statFileWriter.hasAchievementUnlocked(AchievementList.openInventory))
            {
                this.mc.guiAchievement.queueAchievementInformation(AchievementList.openInventory);
            }

            this.prevTimeInPortal = this.timeInPortal;

            if (this.inPortal)
            {
                if (this.mc.currentScreen != null)
                {
                    this.mc.displayGuiScreen((GuiScreen)null);
                }

                if (this.timeInPortal == 0.0F)
                {
                    this.mc.sndManager.playSoundFX("portal.trigger", 1.0F, this.rand.nextFloat() * 0.4F + 0.8F);
                }

                this.timeInPortal += 0.0125F;

                if (this.timeInPortal >= 1.0F)
                {
                    this.timeInPortal = 1.0F;
                }

                this.inPortal = false;
            }
            else if (this.isPotionActive(Potion.confusion) && this.getActivePotionEffect(Potion.confusion).getDuration() > 60)
            {
                this.timeInPortal += 0.006666667F;

                if (this.timeInPortal > 1.0F)
                {
                    this.timeInPortal = 1.0F;
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

            boolean var1 = this.movementInput.jump;
            float var2 = 0.8F;
            boolean var3 = this.movementInput.moveForward >= var2;
            this.movementInput.updatePlayerMoveState();

            if (this.isUsingItem())
            {
                this.movementInput.moveStrafe *= 0.2F;
                this.movementInput.moveForward *= 0.2F;
                this.sprintToggleTimer = 0;
            }

            if (this.movementInput.sneak && this.ySize < 0.2F)
            {
                this.ySize = 0.2F;
            }

            this.pushOutOfBlocks(this.posX - (double)this.width * 0.35D, this.boundingBox.minY + 0.5D, this.posZ + (double)this.width * 0.35D);
            this.pushOutOfBlocks(this.posX - (double)this.width * 0.35D, this.boundingBox.minY + 0.5D, this.posZ - (double)this.width * 0.35D);
            this.pushOutOfBlocks(this.posX + (double)this.width * 0.35D, this.boundingBox.minY + 0.5D, this.posZ - (double)this.width * 0.35D);
            this.pushOutOfBlocks(this.posX + (double)this.width * 0.35D, this.boundingBox.minY + 0.5D, this.posZ + (double)this.width * 0.35D);
            boolean var4 = (float)this.getFoodStats().getFoodLevel() > 6.0F || this.capabilities.allowFlying;

            if (this.onGround && !var3 && this.movementInput.moveForward >= var2 && !this.isSprinting() && var4 && !this.isUsingItem() && !this.isPotionActive(Potion.blindness))
            {
                if (this.sprintToggleTimer == 0)
                {
                    this.sprintToggleTimer = 7;
                }
                else
                {
                    this.setSprinting(true);
                    this.sprintToggleTimer = 0;
                }
            }

            if (this.isSneaking())
            {
                this.sprintToggleTimer = 0;
            }

            if (this.isSprinting() && (this.movementInput.moveForward < var2 || this.isCollidedHorizontally || !var4))
            {
                this.setSprinting(false);
            }

            if (this.capabilities.allowFlying && !var1 && this.movementInput.jump)
            {
                if (this.flyToggleTimer == 0)
                {
                    this.flyToggleTimer = 7;
                }
                else
                {
                    this.capabilities.isFlying = !this.capabilities.isFlying;
                    this.sendPlayerAbilities();
                    this.flyToggleTimer = 0;
                }
            }

            if (this.capabilities.isFlying)
            {
                if (this.movementInput.sneak)
                {
                    this.motionY -= 0.15D;
                }

                if (this.movementInput.jump)
                {
                    this.motionY += 0.15D;
                }
            }

            super.onLivingUpdate();

            if (this.onGround && this.capabilities.isFlying)
            {
                this.capabilities.isFlying = false;
                this.sendPlayerAbilities();
            }
        }
    }

    /**
     * This method gets called when the entity kills another one.
     */
    public void onKillEntity(EntityLiving var1)
    {
        if (this.HAPI != null && this.HAPI.isOnKillEntityModded)
        {
            HAPI.onKillEntity(this, var1);
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
        if (this.HAPI != null && this.HAPI.isOnUpdateModded)
        {
            HAPI.onUpdate(this);
        }
        else
        {
            super.onUpdate();
        }
    }

    public final void superOnUpdate()
    {
        super.onUpdate();
    }

    public final void localOnUpdate()
    {
        super.onUpdate();
    }

    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int var1, int var2, int var3, int var4)
    {
        if (this.HAPI != null && this.HAPI.isPlayStepSoundModded)
        {
            HAPI.playStepSound(this, var1, var2, var3, var4);
        }
        else
        {
            super.playStepSound(var1, var2, var3, var4);
        }
    }

    public final void realPlayStepSound(int var1, int var2, int var3, int var4)
    {
        this.playStepSound(var1, var2, var3, var4);
    }

    public final void superPlayStepSound(int var1, int var2, int var3, int var4)
    {
        super.playStepSound(var1, var2, var3, var4);
    }

    public final void localPlayStepSound(int var1, int var2, int var3, int var4)
    {
        super.playStepSound(var1, var2, var3, var4);
    }

    /**
     * Adds velocity to push the entity out of blocks at the specified x, y, z position Args: x, y, z
     */
    protected boolean pushOutOfBlocks(double par1, double par3, double par5)
    {
        boolean var7;

        if (this.HAPI != null && this.HAPI.isPushOutOfBlocksModded)
        {
            var7 = HAPI.pushOutOfBlocks(this, par1, par3, par5);
        }
        else
        {
            var7 = this.localPushOutOfBlocks(par1, par3, par5);
        }

        return var7;
    }

    public final boolean realPushOutOfBlocks(double var1, double var3, double var5)
    {
        return this.pushOutOfBlocks(var1, var3, var5);
    }

    public final boolean superPushOutOfBlocks(double var1, double var3, double var5)
    {
        return super.pushOutOfBlocks(var1, var3, var5);
    }

    public final boolean localPushOutOfBlocks(double var1, double var3, double var5)
    {
        int var7 = MathHelper.floor_double(var1);
        int var8 = MathHelper.floor_double(var3);
        int var9 = MathHelper.floor_double(var5);
        double var10 = var1 - (double)var7;
        double var12 = var5 - (double)var9;

        if (this.isBlockTranslucent(var7, var8, var9) || this.isBlockTranslucent(var7, var8 + 1, var9))
        {
            boolean var14 = !this.isBlockTranslucent(var7 - 1, var8, var9) && !this.isBlockTranslucent(var7 - 1, var8 + 1, var9);
            boolean var15 = !this.isBlockTranslucent(var7 + 1, var8, var9) && !this.isBlockTranslucent(var7 + 1, var8 + 1, var9);
            boolean var16 = !this.isBlockTranslucent(var7, var8, var9 - 1) && !this.isBlockTranslucent(var7, var8 + 1, var9 - 1);
            boolean var17 = !this.isBlockTranslucent(var7, var8, var9 + 1) && !this.isBlockTranslucent(var7, var8 + 1, var9 + 1);
            byte var18 = -1;
            double var19 = 9999.0D;

            if (var14 && var10 < var19)
            {
                var19 = var10;
                var18 = 0;
            }

            if (var15 && 1.0D - var10 < var19)
            {
                var19 = 1.0D - var10;
                var18 = 1;
            }

            if (var16 && var12 < var19)
            {
                var19 = var12;
                var18 = 4;
            }

            if (var17 && 1.0D - var12 < var19)
            {
                var19 = 1.0D - var12;
                var18 = 5;
            }

            float var21 = 0.1F;

            if (var18 == 0)
            {
                this.motionX = (double)(-var21);
            }

            if (var18 == 1)
            {
                this.motionX = (double)var21;
            }

            if (var18 == 4)
            {
                this.motionZ = (double)(-var21);
            }

            if (var18 == 5)
            {
                this.motionZ = (double)var21;
            }
        }

        return false;
    }

    /**
     * Performs a ray trace for the distance specified and using the partial tick time. Args: distance, partialTickTime
     */
    public MovingObjectPosition rayTrace(double var1, float var3)
    {
        MovingObjectPosition var4;

        if (this.HAPI != null && this.HAPI.isRayTraceModded)
        {
            var4 = HAPI.rayTrace(this, var1, var3);
        }
        else
        {
            var4 = super.rayTrace(var1, var3);
        }

        return var4;
    }

    public final MovingObjectPosition superRayTrace(double var1, float var3)
    {
        return super.rayTrace(var1, var3);
    }

    public final MovingObjectPosition localRayTrace(double var1, float var3)
    {
        return super.rayTrace(var1, var3);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (this.HAPI != null && this.HAPI.isReadEntityFromNBTModded)
        {
            HAPI.readEntityFromNBT(this, par1NBTTagCompound);
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
        this.score = var1.getInteger("Score");
    }

    public void respawnPlayer()
    {
        if (this.HAPI != null && this.HAPI.isRespawnPlayerModded)
        {
            HAPI.respawnPlayer(this);
        }
        else
        {
            super.respawnPlayer();
        }
    }

    public final void superRespawnPlayer()
    {
        super.respawnPlayer();
    }

    public final void localRespawnPlayer()
    {
        super.respawnPlayer();
    }

    /**
     * Will get destroyed next tick.
     */
    public void setDead()
    {
        if (this.HAPI != null && this.HAPI.isSetDeadModded)
        {
            HAPI.setDead(this);
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
     * Sets the entity's position and rotation. Args: posX, posY, posZ, yaw, pitch
     */
    public void setPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
    {
        if (this.HAPI != null && this.HAPI.isSetPositionAndRotationModded)
        {
            HAPI.setPositionAndRotation(this, var1, var3, var5, var7, var8);
        }
        else
        {
            super.setPositionAndRotation(var1, var3, var5, var7, var8);
        }
    }

    public final void superSetPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
    {
        super.setPositionAndRotation(var1, var3, var5, var7, var8);
    }

    public final void localSetPositionAndRotation(double var1, double var3, double var5, float var7, float var8)
    {
        super.setPositionAndRotation(var1, var3, var5, var7, var8);
    }

    /**
     * Attempts to have the player sleep in a bed at the specified location.
     */
    public EnumStatus sleepInBedAt(int var1, int var2, int var3)
    {
        EnumStatus var4;

        if (this.HAPI != null && this.HAPI.isSleepInBedAtModded)
        {
            var4 = HAPI.sleepInBedAt(this, var1, var2, var3);
        }
        else
        {
            var4 = super.sleepInBedAt(var1, var2, var3);
        }

        return var4;
    }

    public final EnumStatus superSleepInBedAt(int var1, int var2, int var3)
    {
        return super.sleepInBedAt(var1, var2, var3);
    }

    public final EnumStatus localSleepInBedAt(int var1, int var2, int var3)
    {
        return super.sleepInBedAt(var1, var2, var3);
    }

    /**
     * Swings the item the player is holding.
     */
    public void swingItem()
    {
        if (this.HAPI != null && this.HAPI.isSwingItemModded)
        {
            HAPI.swingItem(this);
        }
        else
        {
            super.swingItem();
        }
    }

    public final void superSwingItem()
    {
        super.swingItem();
    }

    public final void localSwingItem()
    {
        super.swingItem();
    }

    public void updateEntityActionState()
    {
        if (this.HAPI != null && this.HAPI.isUpdateEntityActionStateModded)
        {
            HAPI.updateEntityActionState(this);
        }
        else
        {
            this.localUpdateEntityActionState();
        }
    }

    public final void superUpdateEntityActionState()
    {
        super.updateEntityActionState();
    }

    public final void localUpdateEntityActionState()
    {
        super.updateEntityActionState();
        this.moveStrafing = this.movementInput.moveStrafe;
        this.moveForward = this.movementInput.moveForward;
        this.isJumping = this.movementInput.jump;
        this.prevRenderArmYaw = this.renderArmYaw;
        this.prevRenderArmPitch = this.renderArmPitch;
        this.renderArmPitch = (float)((double)this.renderArmPitch + (double)(this.rotationPitch - this.renderArmPitch) * 0.5D);
        this.renderArmYaw = (float)((double)this.renderArmYaw + (double)(this.rotationYaw - this.renderArmYaw) * 0.5D);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (this.HAPI != null && this.HAPI.isWriteEntityToNBTModded)
        {
            HAPI.writeEntityToNBT(this, par1NBTTagCompound);
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
        var1.setInteger("Score", this.score);
    }

    /**
     * Add a chat message to the player
     */
    public void addChatMessage(String par1Str)
    {
        this.mc.ingameGUI.getChatGUI().func_73757_a(par1Str, new Object[0]);
    }

    public final void superAddChatMessage(String var1)
    {
        super.addChatMessage(var1);
    }

    public final boolean superAddEntityID(NBTTagCompound var1)
    {
        return super.addEntityID(var1);
    }

    public final void superAddExperience(int var1)
    {
        super.addExperience(var1);
    }

    public final void superAddPotionEffect(PotionEffect var1)
    {
        super.addPotionEffect(var1);
    }

    public final void superAddToPlayerScore(Entity var1, int var2)
    {
        super.addToPlayerScore(var1, var2);
    }

    public final void superAddVelocity(double var1, double var3, double var5)
    {
        super.addVelocity(var1, var3, var5);
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

    /**
     * Returns true if the command sender is allowed to use the given command.
     */
    public boolean canCommandSenderUseCommand(String par1Str)
    {
        return this.worldObj.getWorldInfo().areCommandsAllowed();
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

    /**
     * Displays the GUI for interacting with a book.
     */
    public void displayGUIBook(ItemStack par1ItemStack)
    {
        Item var2 = par1ItemStack.getItem();

        if (var2 == Item.writtenBook)
        {
            this.mc.displayGuiScreen(new GuiScreenBook(this, par1ItemStack, false));
        }
        else if (var2 == Item.writableBook)
        {
            this.mc.displayGuiScreen(new GuiScreenBook(this, par1ItemStack, true));
        }
    }

    public final void superDisplayGUIBook(ItemStack var1)
    {
        super.displayGUIBook(var1);
    }

    public void displayGUIMerchant(IMerchant par1IMerchant)
    {
        this.mc.displayGuiScreen(new GuiMerchant(this.inventory, par1IMerchant, this.worldObj));
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

    public final boolean superGetCanSpawnHere()
    {
        return super.getCanSpawnHere();
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

    public final float superGetEyeHeight()
    {
        return super.getEyeHeight();
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

    public final InventoryEnderChest superGetInventoryEnderChest()
    {
        return super.getInventoryEnderChest();
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

    public final float superGetShadowSize()
    {
        return super.getShadowSize();
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

    public final boolean superHasHome()
    {
        return super.hasHome();
    }

    public final int superHashCode()
    {
        return super.hashCode();
    }

    public final boolean superInteract(EntityPlayer var1)
    {
        return super.interact(var1);
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

    private boolean isBlockTranslucent(int par1, int par2, int par3)
    {
        return this.worldObj.isBlockNormalCube(par1, par2, par3);
    }

    public final boolean realIsBlockTranslucent(int var1, int var2, int var3)
    {
        return this.isBlockTranslucent(var1, var2, var3);
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

    /**
     * Returns whether the entity is in a local (client) world
     */
    protected boolean isClientWorld()
    {
        return true;
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

    public final boolean superIsPlayerSleeping()
    {
        return super.isPlayerSleeping();
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

    public final void superMountEntity(Entity var1)
    {
        super.mountEntity(var1);
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
        this.mc.effectRenderer.addEffect(new EntityCrit2FX(this.mc.theWorld, par1Entity));
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
        EntityCrit2FX var2 = new EntityCrit2FX(this.mc.theWorld, par1Entity, "magicCrit");
        this.mc.effectRenderer.addEffect(var2);
    }

    public final void superOnEnchantmentCritical(Entity var1)
    {
        super.onEnchantmentCritical(var1);
    }

    public final void superOnEntityUpdate()
    {
        super.onEntityUpdate();
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
        this.mc.effectRenderer.addEffect(new EntityPickupFX(this.mc.theWorld, par1Entity, this, -0.5F));
    }

    public final void superOnItemPickup(Entity var1, int var2)
    {
        super.onItemPickup(var1, var2);
    }

    public final void realOnItemUseFinish()
    {
        this.onItemUseFinish();
    }

    public final void superOnItemUseFinish()
    {
        super.onItemUseFinish();
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

    public final void superPreparePlayerToSpawn()
    {
        super.preparePlayerToSpawn();
    }

    public final void superReadFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
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

    public final void realResetHeight()
    {
        this.resetHeight();
    }

    public final void superResetHeight()
    {
        super.resetHeight();
    }

    public void sendChatToPlayer(String par1Str)
    {
        this.mc.ingameGUI.getChatGUI().printChatMessage(par1Str);
    }

    public final void superSendGameTypeToPlayer(EnumGameType var1)
    {
        super.sendGameTypeToPlayer(var1);
    }

    public final void superSendPlayerAbilities()
    {
        super.sendPlayerAbilities();
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

    /**
     * Updates health locally.
     */
    public void setHealth(int par1)
    {
        int var2 = this.getHealth() - par1;

        if (var2 <= 0)
        {
            this.setEntityHealth(par1);

            if (var2 < 0)
            {
                this.hurtResistantTime = this.maxHurtResistantTime / 2;
            }
        }
        else
        {
            this.lastDamage = var2;
            this.setEntityHealth(this.getHealth());
            this.hurtResistantTime = this.maxHurtResistantTime;
            this.damageEntity(DamageSource.generic, var2);
            this.hurtTime = this.maxHurtTime = 10;
        }
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

    public final void superSetPosition(double var1, double var3, double var5)
    {
        super.setPosition(var1, var3, var5);
    }

    public final void superSetPositionAndRotation2(double var1, double var3, double var5, float var7, float var8, int var9)
    {
        super.setPositionAndRotation2(var1, var3, var5, var7, var8, var9);
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

    /**
     * Set sprinting switch for Entity.
     */
    public void setSprinting(boolean par1)
    {
        super.setSprinting(par1);
        this.sprintingTicksLeft = par1 ? 600 : 0;
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

    /**
     * Sets the current XP, total XP, and level number.
     */
    public void setXPStats(float par1, int par2, int par3)
    {
        this.experience = par1;
        this.experienceTotal = par2;
        this.experienceLevel = par3;
    }

    public final boolean superShouldHeal()
    {
        return super.shouldHeal();
    }

    public final void superSpawnExplosionParticle()
    {
        super.spawnExplosionParticle();
    }

    public final void superStopUsingItem()
    {
        super.stopUsingItem();
    }

    public final String superToString()
    {
        return super.toString();
    }

    public final String superTranslateString(String var1, Object ... var2)
    {
        return super.translateString(var1, var2);
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

    public void updateCloak()
    {
        this.playerCloakUrl = "http://skins.minecraft.net/MinecraftCloaks/" + StringUtils.stripControlCodes(this.username) + ".png";
        this.cloakUrl = this.playerCloakUrl;
    }

    public final void superUpdateCloak()
    {
        super.updateCloak();
    }

    public final void realUpdateFallState(double var1, boolean var3)
    {
        this.updateFallState(var1, var3);
    }

    public final void superUpdateFallState(double var1, boolean var3)
    {
        super.updateFallState(var1, var3);
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

    public final MouseFilter getField_71160_ciField()
    {
        return this.field_71160_ci;
    }

    public final void setField_71160_ciField(MouseFilter var1)
    {
        this.field_71160_ci = var1;
    }

    public final MouseFilter getField_71161_cjField()
    {
        return this.field_71161_cj;
    }

    public final void setField_71161_cjField(MouseFilter var1)
    {
        this.field_71161_cj = var1;
    }

    public final MouseFilter getField_71162_chField()
    {
        return this.field_71162_ch;
    }

    public final void setField_71162_chField(MouseFilter var1)
    {
        this.field_71162_ch = var1;
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

    public final int getLastDamageField()
    {
        return this.lastDamage;
    }

    public final void setLastDamageField(int var1)
    {
        this.lastDamage = var1;
    }

    public final Minecraft getMcField()
    {
        return this.mc;
    }

    public final void setMcField(Minecraft var1)
    {
        this.mc = var1;
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

    public final int getSprintToggleTimerField()
    {
        return this.sprintToggleTimer;
    }

    public final void setSprintToggleTimerField(int var1)
    {
        this.sprintToggleTimer = var1;
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
}
