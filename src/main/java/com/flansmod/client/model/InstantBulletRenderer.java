package com.flansmod.client.model;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.util.WorldRenderer;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.vector.Vector3f;

public class InstantBulletRenderer
{
	private static TextureManager textureManager;
	private static ArrayList<InstantShotTrail> trails = new ArrayList<>();
	
	public static void AddTrail(InstantShotTrail trail)
	{
		trails.add(trail);
	}
	
	public static void RenderAllTrails(float partialTicks)
	{
		for(InstantShotTrail trail : trails)
		{
			trail.Render(partialTicks);
		}
	}
	
	public static void UpdateAllTrails()
	{
		for(int i = trails.size() - 1; i >= 0; i--)
		{
			if(trails.get(i).Update())
			{
				trails.remove(i);
			}
		}
	}
	
	public static class InstantShotTrail
	{
		private Vector3f origin;
		private Vector3f hitPos;
		private float width;
		private float length;
		private float distanceToTarget;
		private float bulletSpeed;
		private int ticksExisted;
		
		private ResourceLocation texture;
		
		public InstantShotTrail(Vector3f origin, Vector3f hitPos, BulletType type)
		{
			this.ticksExisted = 0;
			this.bulletSpeed = 10.0f;
			this.origin = origin;
			this.hitPos = hitPos;
			this.width = 0.05f; // type.trailWidth
			this.length = 10.0f;
			this.texture = FlansModResourceHandler.getTrailTexture(type);
			
			Vector3f dPos = Vector3f.sub(hitPos, origin, null);
			this.distanceToTarget = dPos.length();
			
			if(Math.abs(distanceToTarget) > 300.0f)
			{
				distanceToTarget = 300.0f;
			}
		}
		
		// Return true if this needs deleting
		public boolean Update()
		{
			ticksExisted++;
			return (ticksExisted) * bulletSpeed >= distanceToTarget - length;
		}
		
		public void Render(float partialTicks)
		{
			//Make sure we actually have the renderEngine
			if(textureManager == null)
				textureManager = Minecraft.getMinecraft().renderEngine;
			
			textureManager.bindTexture(texture);
			
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			
			GlStateManager.pushMatrix();
			
			//Get the camera frustrum for clipping
			Entity camera = Minecraft.getMinecraft().getRenderViewEntity();
			double x = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * partialTicks;
			double y = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * partialTicks;
			double z = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * partialTicks;
			
			GL11.glTranslatef(-(float)x, -(float)y, -(float)z);
			
			float parametric = ((float)(ticksExisted) + partialTicks) * bulletSpeed;
			
			Vector3f dPos = Vector3f.sub(hitPos, origin, null);
			dPos.normalise();
			
			float startParametric = parametric - length * 0.5f;
			Vector3f startPos = new Vector3f(origin.x + dPos.x * startParametric, origin.y + dPos.y * startParametric, origin.z + dPos.z * startParametric);
			float endParametric = parametric + length * 0.5f;
			Vector3f endPos = new Vector3f(origin.x + dPos.x * endParametric, origin.y + dPos.y * endParametric, origin.z + dPos.z * endParametric);
			
			WorldRenderer worldrenderer = FlansModClient.getWorldRenderer();
			
			dPos.normalise();
			
			EntityPlayer player = Minecraft.getMinecraft().player;
			Vector3f vectorToPlayer = new Vector3f(player.posX - hitPos.x, player.posY - hitPos.y, player.posZ - hitPos.z);
			
			vectorToPlayer.normalise();
			
			Vector3f trailTangent = Vector3f.cross(dPos, vectorToPlayer, null);
			trailTangent.normalise();
			trailTangent.scale(-width * 0.5f);
			
			Vector3f normal = Vector3f.cross(trailTangent, dPos, null);
			normal.normalise();
			
			GlStateManager.enableRescaleNormal();
			GL11.glNormal3f(normal.x, normal.y, normal.z);
			
			worldrenderer.startDrawingQuads();
			worldrenderer.addVertexWithUV(startPos.x + trailTangent.x, startPos.y + trailTangent.y, startPos.z + trailTangent.z, 0.0f, 0.0f);
			worldrenderer.addVertexWithUV(startPos.x - trailTangent.x, startPos.y - trailTangent.y, startPos.z - trailTangent.z, 0.0f, 1.0f);
			worldrenderer.addVertexWithUV(endPos.x - trailTangent.x, endPos.y - trailTangent.y, endPos.z - trailTangent.z, 1.0f, 1.0f);
			worldrenderer.addVertexWithUV(endPos.x + trailTangent.x, endPos.y + trailTangent.y, endPos.z + trailTangent.z, 1.0f, 0.0f);
			worldrenderer.draw();
			
			GlStateManager.disableRescaleNormal();
			
			GlStateManager.popMatrix();
		}
	}
}
