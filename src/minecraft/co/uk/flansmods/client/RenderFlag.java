package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.teams.EntityFlag;
import co.uk.flansmods.common.teams.ITeamBase;
import co.uk.flansmods.common.teams.Team;
import net.minecraft.src.Entity;
import net.minecraft.src.Render;

public class RenderFlag extends Render {
	
	public ModelFlagpole modelFlagpole;
	
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
        
        loadTexture("/teamsMod/Flagpole.png");
		
        GL11.glScalef(-1F, -1F, 1F);        
        modelFlagpole.renderFlag(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flag);
		GL11.glPopMatrix();
	}
}
