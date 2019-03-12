package com.flansmod.common.guns.raytracing;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.PlayerBulletHit;
import com.flansmod.common.vector.Vector3f;

/**
 * This class takes a snapshot of the player's position rotation and held items at a certain point in time.
 * It is used to handle bullet detection. The server will store a second or two of snapshots so that it
 * can work out where the player thought they were shooting accounting for packet lag
 */
public class PlayerSnapshot
{
	/**
	 * The player this snapshot is for
	 */
	public EntityPlayer player;
	/**
	 * The player's position at the point the snapshot was taken
	 */
	public Vector3f pos;
	/**
	 * The hitboxes for this player
	 */
	public ArrayList<PlayerHitbox> hitboxes;
	/**
	 * The time at which this snapshot was taken
	 */
	public long time;
	
	public PlayerSnapshot(EntityPlayer p)
	{
		player = p;
		pos = new Vector3f(p.posX, p.posY, p.posZ);
		//if(FlansMod.proxy.isThePlayer(p))
		//	pos = new Vector3f(p.posX, p.posY - 1.6F, p.posZ);
		hitboxes = new ArrayList<>();
		
		RotatedAxes bodyAxes = new RotatedAxes(p.renderYawOffset, 0F, 0F);
		RotatedAxes headAxes = new RotatedAxes(p.rotationYawHead - p.renderYawOffset, p.rotationPitch, 0F);
		
		hitboxes.add(new PlayerHitbox(player, bodyAxes, new Vector3f(0F, 0F, 0F), new Vector3f(-0.25F, 0F, -0.15F), new Vector3f(0.5F, 1.4F, 0.3F), EnumHitboxType.BODY));
		hitboxes.add(new PlayerHitbox(player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0F, 1.4F, 0F), new Vector3f(-0.25F, 0F, -0.25F), new Vector3f(0.5F, 0.5F, 0.5F), EnumHitboxType.HEAD));
		
		//Calculate rotation of arms using modified code from ModelBiped
		float yHead = (p.rotationYawHead - p.renderYawOffset) / (180F / (float)Math.PI);
		float xHead = p.rotationPitch / (180F / (float)Math.PI);
		
		float zRight = 0.0F;
		float zLeft = 0.0F;
		float yRight = -0.1F + yHead - ((float)Math.PI / 2F);
		float yLeft = 0.1F + yHead + 0.4F - ((float)Math.PI / 2F);
		float xRight = -((float)Math.PI / 2F) + xHead;
		float xLeft = -((float)Math.PI / 2F) + xHead;

		zRight += MathHelper.cos(p.ticksExisted * 0.09F) * 0.05F + 0.05F;
		zLeft -= MathHelper.cos(p.ticksExisted * 0.09F) * 0.05F + 0.05F;
		xRight += MathHelper.sin(p.ticksExisted * 0.067F) * 0.05F;
		xLeft -= MathHelper.sin(p.ticksExisted * 0.067F) * 0.05F;

		RotatedAxes leftArmAxes = (new RotatedAxes()).rotateGlobalPitchInRads(xLeft).rotateGlobalYawInRads((float)Math.PI + yLeft).rotateGlobalRollInRads(-zLeft);
		RotatedAxes rightArmAxes = (new RotatedAxes()).rotateGlobalPitchInRads(xRight).rotateGlobalYawInRads((float)Math.PI + yRight).rotateGlobalRollInRads(-zRight);
		
		float originZRight = MathHelper.sin(-p.renderYawOffset * 3.14159265F / 180F) * 5.0F / 16F;
		float originXRight = -MathHelper.cos(-p.renderYawOffset * 3.14159265F / 180F) * 5.0F / 16F;

		float originZLeft = -MathHelper.sin(-p.renderYawOffset * 3.14159265F / 180F) * 5.0F / 16F;
		float originXLeft = MathHelper.cos(-p.renderYawOffset * 3.14159265F / 180F) * 5.0F / 16F;
		
		hitboxes.add(new PlayerHitbox(player, bodyAxes.findLocalAxesGlobally(leftArmAxes), new Vector3f(originXLeft, 1.3F, originZLeft), new Vector3f(-2F / 16F, -0.6F, -2F / 16F), new Vector3f(0.25F, 0.7F, 0.25F), EnumHitboxType.LEFTARM));
		hitboxes.add(new PlayerHitbox(player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3F, originZRight), new Vector3f(-2F / 16F, -0.6F, -2F / 16F), new Vector3f(0.25F, 0.7F, 0.25F), EnumHitboxType.RIGHTARM));
		
		//Add box for right hand shield
		ItemStack playerRightHandStack = player.getHeldItemMainhand();
		if(playerRightHandStack != null && playerRightHandStack.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)playerRightHandStack.getItem()).GetType();
			if(gunType.shield)
			{
				hitboxes.add(new PlayerHitbox(player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3F, originZRight), new Vector3f(gunType.shieldOrigin.y, -1.05F + gunType.shieldOrigin.x, -1F / 16F + gunType.shieldOrigin.z), new Vector3f(gunType.shieldDimensions.y, gunType.shieldDimensions.x, gunType.shieldDimensions.z), EnumHitboxType.RIGHTITEM));
			}
		}
		ItemStack playerLeftHandStack = player.getHeldItemOffhand();
		if(playerLeftHandStack != null && playerLeftHandStack.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)playerLeftHandStack.getItem()).GetType();
			if(gunType.shield)
			{
				hitboxes.add(new PlayerHitbox(player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3F, originZRight), new Vector3f(gunType.shieldOrigin.y, -1.05F + gunType.shieldOrigin.x, -1F / 16F + gunType.shieldOrigin.z), new Vector3f(gunType.shieldDimensions.y, gunType.shieldDimensions.x, gunType.shieldDimensions.z), EnumHitboxType.RIGHTITEM));
			}
		}
	}
	
	public ArrayList<BulletHit> raytrace(Vector3f origin, Vector3f motion)
	{
		//Get the bullet raytrace vector into local coordinates
		Vector3f localOrigin = Vector3f.sub(origin, pos, null);
		//Prepare a list for the hits
		ArrayList<BulletHit> hits = new ArrayList<>();
		
		//Check each hitbox for a hit
		for(PlayerHitbox hitbox : hitboxes)
		{
			PlayerBulletHit hit = hitbox.raytrace(localOrigin, motion);
			if(hit != null && hit.intersectTime >= 0F && hit.intersectTime <= 1F)
			{
				hits.add(hit);
			}
		}
		
		return hits;
	}
	
	@SideOnly(Side.CLIENT)
	public void renderSnapshot()
	{
		for(PlayerHitbox hitbox : hitboxes)
		{
			hitbox.renderHitbox(player.world, pos);
		}
	}
	
	public PlayerHitbox GetHitbox(EnumHitboxType type)
	{
		for(PlayerHitbox hitbox : hitboxes)
		{
			if(hitbox.type == type)
			{
				return hitbox;
			}
		}
		return null;
	}
	
	public Vector3f GetMuzzleLocation(GunType gunType, AttachmentType barrelAttachment, EnumHand hand)
	{
		PlayerHitbox hitbox = GetHitbox(hand == EnumHand.OFF_HAND ? EnumHitboxType.LEFTARM : EnumHitboxType.RIGHTARM);
		Vector3f muzzlePos = new Vector3f(hitbox.o.x, hitbox.o.y + hitbox.d.y * 0.5f, hitbox.o.z + hitbox.d.z * 0.5f);
		
		if(gunType != null && gunType.model != null)
		{
			Vector3f barrelAttach = new Vector3f(
					gunType.model.barrelAttachPoint.z,
					-gunType.model.barrelAttachPoint.x,
					gunType.model.barrelAttachPoint.y);
			Vector3f.add(muzzlePos, barrelAttach, muzzlePos);
		}
		
		muzzlePos = hitbox.axes.findLocalVectorGlobally(muzzlePos);
		
		
		Vector3f.add(muzzlePos, hitbox.rP, muzzlePos);
		return muzzlePos;
	}
}
