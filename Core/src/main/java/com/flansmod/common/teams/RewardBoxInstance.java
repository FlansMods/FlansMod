package com.flansmod.common.teams;

import net.minecraft.entity.player.EntityPlayer;

import com.flansmod.common.FlansMod;

/**
 * A player keeps this instance forever, even after they've opened it so as to keep a history
 */
public class RewardBoxInstance
{
	public static final int INVALID_HASH = 0;
	
	public enum EnumRewardOrigin
	{
		UNKNOWN,
		OP_CHEAT,
		LEVEL_UP,
		PURCHASE,
		
		CLIENT,
	}
	
	/**
	 * Boxes can be earned by levelling up or buying them. Keep track of that data here.
	 */
	public EnumRewardOrigin origin = EnumRewardOrigin.UNKNOWN;
	/**
	 * What did they get from their box?
	 */
	public int unlockHash = INVALID_HASH;
	/**
	 * What sort of box is this?
	 */
	public int boxHash = INVALID_HASH;
	/**
	 * This is the definitive "has been opened" bool, but it should be verified against the hashes
	 */
	public boolean opened = false;
	
	protected boolean Verify()
	{
		if(origin == EnumRewardOrigin.UNKNOWN
				|| (unlockHash != INVALID_HASH && !opened)
				|| (unlockHash == INVALID_HASH && opened)
				|| boxHash == INVALID_HASH)
		{
			FlansMod.Assert(false, "Reward box failed verification!");
			return false;
		}
		return true;
	}
	
	public int OpenBox(PlayerRankData data)
	{
		if(!Verify())
		{
			return INVALID_HASH;
		}
		if(opened)
		{
			FlansMod.Assert(false, "How is this even open?");
			return INVALID_HASH;
		}
		opened = true;
		unlockHash = RewardBox.GetRewardBox(boxHash).GetReward(data);
		
		return unlockHash;
	}
	
	private RewardBoxInstance(EnumRewardOrigin ori, int hash)
	{
		origin = ori;
		boxHash = hash;
	}
	
	private RewardBoxInstance(EnumRewardOrigin ori, RewardBox box)
	{
		origin = ori;
		boxHash = box.hashCode();
	}
	
	public static RewardBoxInstance CreateLevelUpReward(RewardBox box, EntityPlayer player)
	{
		FlansMod.log.info("Level up reward box created for " + player.getDisplayNameString());
		return new RewardBoxInstance(EnumRewardOrigin.LEVEL_UP, box);
	}
	
	// Ideally this would go through some automated system, but for now, this will be quicker
	public static RewardBoxInstance CreatePurchasedReward(RewardBox box, EntityPlayer player, EntityPlayer commandSender)
	{
		FlansMod.log.info("--------------------------------------------------------------------------------------------------------------------------------------------");
		FlansMod.log.info("PURCHASED REWARD BOX MANUALLY REDEEMED FOR USER: " + player.getDisplayNameString() + " BY PLAYER " + commandSender.getDisplayNameString());
		FlansMod.log.info("--------------------------------------------------------------------------------------------------------------------------------------------");
		return new RewardBoxInstance(EnumRewardOrigin.PURCHASE, box);
	}
	
	public static RewardBoxInstance CreateCheatReward(RewardBox box, String username)
	{
		FlansMod.log.info("---------------------------------------------------------------------------");
		FlansMod.log.info("REWARD BOX CREATED VIA OP CHEAT FOR USER: " + username);
		FlansMod.log.info("---------------------------------------------------------------------------");
		return new RewardBoxInstance(EnumRewardOrigin.OP_CHEAT, box);
	}
	
	public static RewardBoxInstance CreateRewardBoxInstanceFromNBT(int boxHash, int unlockHash, int type)
	{
		RewardBoxInstance instance = new RewardBoxInstance(EnumRewardOrigin.values()[type], boxHash);
		instance.unlockHash = unlockHash;
		instance.opened = unlockHash != INVALID_HASH;
		return instance;
	}
	
	public static RewardBoxInstance CreateClientRewardBoxInstance(int boxHash, int unlockHash)
	{
		RewardBoxInstance instance = new RewardBoxInstance(EnumRewardOrigin.CLIENT, boxHash);
		instance.unlockHash = unlockHash;
		instance.opened = unlockHash != INVALID_HASH;
		return instance;
	}
}
