package com.flansmod.client;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;

public class EntityAfterburn extends EntityFX
{
	public static ResourceLocation icon = new ResourceLocation("flansmod", "particle/ValkEx.png");
	public EntityAfterburn(World w, double px, double py, double pz, double mx, double my, double mz)
	{
		super(w, px, py, pz, mx, my, mz);
		this.particleMaxAge = 6;
		this.particleAge = 0;
		this.particleGravity = 1;
		this.motionX = mx;
		this.motionY = my;
		this.motionZ = mz;
		icon = new ResourceLocation("flansmod", "particle/ValkEx.png");
	}
	
	public int getFXLayer()
	{
			 return 3;
	}

	public float getEntityBrightness(float f)
	{
			return 1.0F;
	}
	
	public int getBrightnessForRender(float par1)
	{
		return 15728880;
	}

	
    public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        //func_98187_b() = bindTexture();
    	GL11.glPushMatrix();
    	 par1Tessellator.startDrawingQuads();
 		GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F);
 		GL11.glEnable(GL11.GL_BLEND);
 		int srcBlend = GL11.glGetInteger(GL11.GL_BLEND_SRC);
 		int dstBlend = GL11.glGetInteger(GL11.GL_BLEND_DST);
 		//GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
 		GL11.glDepthMask(false); 
    	FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/ValkEx.png"));
        float scale = 0.8F - ((this.particleAge)*0.13F);
        float xPos = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) par2 - interpPosX);
        float yPos = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) par2 - interpPosY);
        float zPos = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) par2 - interpPosZ);
        float colorIntensity = 1.0F;
        //par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);//, 1.0F);
        par1Tessellator.setColorRGBA_F(this.particleRed * (colorIntensity - this.particleAge*0.2F), this.particleGreen * (colorIntensity - this.particleAge*0.2F), this.particleBlue * colorIntensity, (1F - this.particleAge*0.1F));
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos - par5 * scale - par7 * scale), 0D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos - par5 * scale + par7 * scale), 1D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos + par5 * scale + par7 * scale), 1D, 0D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos + par5 * scale - par7 * scale), 0D, 0D);
        //System.out.println("renderParticle:" + this + " at [" +this.posX +", " + this.posY + ", " + this.posZ + "]");
        par1Tessellator.draw();
		//GL11.glBlendFunc(srcBlend, dstBlend);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true); 
		GL11.glPopMatrix();
    }

	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		this.renderDistanceWeight = 2000.0D;
		if(this.particleAge++ >= this.particleMaxAge)
		{
			this.setDead();
		}
		
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
		if(this.onGround)
		{
			setDead();
		}
	}
}
