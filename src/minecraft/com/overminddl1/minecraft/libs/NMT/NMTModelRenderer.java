package com.overminddl1.minecraft.libs.NMT;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import net.minecraft.src.GLAllocation;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;
import net.minecraft.src.Tessellator;
import net.minecraft.src.TextureOffset;

import org.lwjgl.opengl.GL11;

public class NMTModelRenderer extends ModelRenderer
{
    private boolean compiled;
    private int displayList;
    private ModelBase baseModel;
    public int textureU;
    public int textureV;
    public ArrayList<NMTModelBase> modelList;
    public boolean disableTextureMapping;
    public boolean recompile;
    
    public NMTModelRenderer(ModelBase modelbase, String s)
    {
    	super(modelbase, s);
    	baseModel = modelbase;
    	compiled = false;
    	displayList = 0;
    	modelList = new ArrayList<NMTModelBase>();
    	disableTextureMapping = false;
    }
    
    public NMTModelRenderer(ModelBase modelbase)
    {
    	super(modelbase);
    	compiled = false;
    	baseModel = modelbase;
    	displayList = 0;
    	modelList = new ArrayList<NMTModelBase>();
    	disableTextureMapping = false;
    }
    
    public NMTModelRenderer(ModelBase modelbase, int textureX, int textureY)
    {
    	super(modelbase, textureX, textureY);
    	compiled = false;
    	baseModel = modelbase;
    	displayList = 0;
    	modelList = new ArrayList<NMTModelBase>();
    	setTextureOffset(textureX, textureY);
    	disableTextureMapping = false;
    }
    
    public NMTModelRenderer(ModelBase modelbase, int textureX, int textureY, int textureW, int textureH)
    {
    	this(modelbase, textureX, textureY);
    	setTextureSize(textureW, textureH);
    }
    
    public ModelRenderer setTextureOffset(int u, int v)
    {
    	super.setTextureOffset(u, v);
        textureU = u;
        textureV = v;
        return this;
    }

    public NMTModelRenderer addModel(String name, NMTModelBase model)
    {
    	name = boxName + "." + name;
        TextureOffset textureoffset = baseModel.getTextureOffset(name);
        setTextureOffset(textureoffset.textureOffsetX, textureoffset.textureOffsetY);
    	modelList.add(model.create().setName(name));
    	return this;
    }
    
    public NMTModelRenderer addModel(NMTModelBase model)
    {
    	modelList.add(model.create());
    	return this;
    }
    
    public NMTModelRenderer addBox(String name, float x, float y, float z, int width, int height, int depth)
    {
    	return addBox(name, x, y, z, width, height, depth, 0.0F);
    }
    
    public NMTModelRenderer addBox(String name, float x, float y, float z, int width, int height, int depth, float extrusion)
    {
    	return addBox(name, x, y, z, width, height, depth, extrusion, 1.0F);
    }
    
    public NMTModelRenderer addBox(String name, float x, float y, float z, int width, int height, int depth, float extrusion, float scale)
    {
    	return addBox(name, x, y, z, width, height, depth, extrusion, scale, false);
    }
    
    public NMTModelRenderer addBox(String name, float x, float y, float z, int width, int height, int depth, float extrusion, float scale, boolean smooth)
    {
    	return addModel(name, new NMTModelBox(this, x, y, z, width, height, depth, extrusion, scale, smooth));
    }

    public NMTModelRenderer addBox(float x, float y, float z, int width, int height, int depth)
    {
    	return addBox(x, y, z, width, height, depth, 0.0F, 1.0F, false);
    }
    
    public void addBox(float x, float y, float z, int width, int height, int depth, float extrusion)
    {
    	addBox(x, y, z, width, height, depth, extrusion, 1.0F);
    }
    
    public void addBox(float x, float y, float z, int width, int height, int depth, float extrusion, float scale)
    {
    	addBox(x, y, z, width, height, depth, extrusion, scale, false);
    }
    
    public NMTModelRenderer addBox(float x, float y, float z, int width, int height, int depth, float extrusion, float scale, boolean smooth)
    {
    	return addModel(new NMTModelBox(this, x, y, z, width, height, depth, extrusion, scale, smooth));
    }
    
    public NMTModelRenderer addTrapezoid(String name, float x, float y, float z, int w, int h, int d, float scale, float bottomScale, int dir)
    {
    	return addModel(name, new NMTModelTrapezoid(this, x, y, z, w, h, d, scale, bottomScale, dir));
    }
    
    public NMTModelRenderer addTrapezoid(float x, float y, float z, int w, int h, int d, float scale, float bottomScale, int dir)
    {
    	return addModel(new NMTModelTrapezoid(this, x, y, z, w, h, d, scale, bottomScale, dir));
    }
    
    public NMTModelRenderer addTrapezoid(float x, float y, float z, int w, int h, int d, float scale, float bottomScale, int dir, boolean smooth)
    {
    	return addModel(new NMTModelTrapezoid(this, x, y, z, w, h, d, scale, bottomScale, dir, smooth));
    }
    
    public NMTModelRenderer addVoxel(String name, float x, float y, float z)
    {
    	return addVoxel(name, x, y, z, 1.0F, 1.0F, 1.0F);
    }
    
    public NMTModelRenderer addVoxel(String name, float x, float y, float z, float width, float height, float depth)
    {
    	return addVoxel(name, x, y, z, width, height, depth, 0, 0);
    }
    
    public NMTModelRenderer addVoxel(String name, float x, float y, float z, float width, float height, float depth, int relativeU, int relativeV)
    {
    	return addModel(name, new NMTModelVoxel(this, x, y, z, width, height, depth, relativeU, relativeV));
    }

    public NMTModelRenderer addVoxel(float x, float y, float z, float width, float height, float depth)
    {
    	return addVoxel(x, y, z, width, height, depth, 0, 0);
    }

    public NMTModelRenderer addVoxel(float x, float y, float z, float width, float height, float depth, int relativeU, int relativeV)
    {
    	return addModel(new NMTModelVoxel(this, x, y, z, width, height, depth, relativeU, relativeV));
    }
    
    public NMTModelRenderer addSprite(String name, float x, float y, float z, float width, float height, float depth)
    {
    	return addModel(name, new NMTModelSprite(this, x, y, z, width, height, depth));
    }
    
    public NMTModelRenderer addSprite(String name, float x, float y, float z, float width, float height, float depth, int texW, int texH)
    {
    	return addModel(name, new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH));
    }
    
    public NMTModelRenderer addSprite(String name, float x, float y, float z, float width, float height, float depth, int texW, int texH, int layers)
    {
    	return addModel(name, new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH, layers));
    }
    
    public NMTModelRenderer addSprite(String name, float x, float y, float z, float width, float height, float depth, int texW, int texH, int layers, int layersPerRow)
    {
    	return addModel(name, new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH, layers, layersPerRow));
    }
    
    public NMTModelRenderer addSprite(float x, float y, float z, float width, float height, float depth)
    {
    	return addModel(new NMTModelSprite(this, x, y, z, width, height, depth));
    }
    
    public NMTModelRenderer addSprite(float x, float y, float z, float width, float height, float depth, int texW, int texH)
    {
    	return addModel(new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH));
    }
    
    public NMTModelRenderer addSprite(float x, float y, float z, float width, float height, float depth, int texW, int texH, int layers)
    {
    	return addModel(new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH, layers));
    }
    
    public NMTModelRenderer addSprite(float x, float y, float z, float width, float height, float depth, int texW, int texH, int layers, int layersPerRow)
    {
    	return addModel(new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH, layers, layersPerRow));
    }
    
    public NMTModelRenderer addSprite(float x, float y, float z, float width, float height, float depth, int texW, int texH, int layers, int layersPerRow, boolean rotX, boolean rotY, boolean rotZ)
    {
    	return addModel(new NMTModelSprite(this, x, y, z, width, height, depth, texW, texH, layers, layersPerRow, rotX, rotY, rotZ));
    }
    
    public NMTModelRenderer addSphere(float x, float y, float z, float r, int slices, int stacks, int tW, int tH, boolean cN, int mappingUsed)
    {
    	return addModel(new NMTModelSphere(this, x, y, z, r, slices, stacks, tW, tH, cN, mappingUsed));
    }
    
    public NMTModelRenderer addModelOBJ(String name, String file)
    {
    	try
    	{
			return addModel(name, new NMTModelFileOBJ(this, file));
		}
    	catch (IllegalStateException e)
		{
			e.printStackTrace();
		}
    	catch (IOException e)
		{
			e.printStackTrace();
		}
    	return null; // Crash hard if this failed
    }
    
    public NMTModelRenderer addModelOBJ(String file)
    {
    	try {
			return addModel(new NMTModelFileOBJ(this, file));
		}
    	catch (IllegalStateException e)
		{
			e.printStackTrace();
		}
    	catch (IOException e)
		{
			e.printStackTrace();
		}
    	return null; // Crash hard if this failed
    }
    
    public void copyRotations(ModelRenderer model)
    {
    	rotateAngleX = model.rotateAngleX;
    	rotateAngleY = model.rotateAngleY;
    	rotateAngleZ = model.rotateAngleZ;
    }

    public void render(float f)
    {
        if (isHidden)
        {
            return;
        }
        if (!showModel)
        {
            return;
        }
        if (!compiled || recompile)
        {
            compileDisplayList(f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(rotationPointX * f, rotationPointY * f, rotationPointZ * f);
        if (rotateAngleY != 0.0F)
        {
            GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
        }
        if (rotateAngleX != 0.0F)
        {
            GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
        }
        if (rotateAngleZ != 0.0F)
        {
            GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
        }
        GL11.glCallList(displayList);
        renderList(f);
        GL11.glPopMatrix();
    }

    private void compileDisplayList(float f)
    {
        displayList = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayList, 4864 /*GL_COMPILE*/);
        Tessellator tessellator = Tessellator.instance;
        for (int i = 0; i < modelList.size(); i++)
        {
        	NMTModelBase model = (NMTModelBase)modelList.get(i);
        	if(model.doCompile)
        	{
        		model.compile(tessellator, f);
        	}
        }

        GL11.glEndList();
        compiled = true;
    }
    
    private void renderList(float f)
    {
        Tessellator tessellator = Tessellator.instance;
        for (int i = 0; i < modelList.size(); i++)
        {
        	NMTModelBase model = (NMTModelBase)modelList.get(i);
        	if(model.doRender)
        	{
        		model.render(tessellator, f);
        	}
        }
    }
}
