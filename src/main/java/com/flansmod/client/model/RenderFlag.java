package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.Team;

public class RenderFlag extends Render<EntityFlag>
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "teamsMod/Flagpole.png");
	
	public ModelFlagpole modelFlagpole;
	public static float angle;
	
	public RenderFlag(RenderManager renderManager)
	{
		super(renderManager);
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(EntityFlag flag, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(flag);
		int teamID = flag.getTeamID();
		Team team = FlansModClient.getTeam(teamID);
		if(team == null)
		{
			//Give each team a default colour
			switch(teamID)
			{
				case 0: GL11.glColor3f(0x80 / 255F, 0x80 / 255F, 0x80 / 255F);
					break; //No team
				case 1: GL11.glColor3f(0x40 / 255F, 0x40 / 255F, 0x40 / 255F);
					break; //Spectators
				case 2: GL11.glColor3f(0xa1 / 255F, 0x7f / 255F, 0xff / 255F);
					break; //Team 1
				case 3: GL11.glColor3f(0xff / 255F, 0x7f / 255F, 0xb6 / 255F);
					break; //Team 2
			}
		}
		else
		{
			int colour = team.teamColour;
			GL11.glColor3f(((colour >> 16) & 0xff) / 255F, ((colour >> 8) & 0xff) / 255F, (colour & 0xff) / 255F);
		}
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
		
		if(!(flag.getRidingEntity() instanceof EntityFlagpole))
		{
			GL11.glRotatef(angle, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(0.5F, 0F, 0F);
		}
		else
		{
			GL11.glTranslatef(0F, 0.5F, 0F);
		}
		
		GL11.glScalef(-1F, -1F, 1F);
		modelFlagpole.renderFlag(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flag);
		GL11.glPopMatrix();
		GL11.glColor3f(1F, 1F, 1F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFlag entity)
	{
		return texture;
	}
	
	public static class Factory implements IRenderFactory<EntityFlag>
	{
		@Override
		public Render<EntityFlag> createRenderFor(RenderManager manager)
		{
			return new RenderFlag(manager);
		}
	}
}
