package co.uk.flansmods.client;

import java.util.List;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.EntityFlagpole;
import co.uk.flansmods.common.teams.Team;

public class RenderFlag extends Render 
{
	private static final ResourceLocation texture = new ResourceLocation("Flan", "teamsMod/Flagpole.png");
	
	public ModelFlagpole modelFlagpole;
	public static float angle;
	
	public RenderFlag()
	{
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) 
	{
		EntityFlag flag = (EntityFlag)entity;
		Team team = flag.getTeam();
		if(team == null)
			GL11.glColor3f(1F, 1F, 1F);
		else 
		{
			int colour = team.teamColour;
			GL11.glColor3f(((colour >> 16) & 0xff) / 255F, ((colour >> 8) & 0xff) / 255F, (colour & 0xff) / 255F);
		}

		GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        
		List ents = flag.worldObj.getEntitiesWithinAABB(EntityFlagpole.class, flag.boundingBox.expand(1F, 2F, 1F));
		if(ents.size() == 0)
		{
			 GL11.glRotatef(angle, 0.0F, 1.0F, 0.0F);
			 GL11.glTranslatef(0.5F, 0F, 0F);
		}
		
        GL11.glScalef(-1F, -1F, 1F);        
        modelFlagpole.renderFlag(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flag);
		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return texture;
	}
}
