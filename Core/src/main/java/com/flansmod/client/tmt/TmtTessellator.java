package com.flansmod.client.tmt;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

import org.lwjgl.opengl.ARBBufferObject;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TmtTessellator extends Tessellator
{
	private static int nativeBufferSize = 0x200000;
	private static int trivertsInBuffer = (nativeBufferSize / 48) * 6;
	public static boolean renderingWorldRenderer = false;
	public boolean defaultTexture = false;
	private int rawBufferSize = 0;
	public int textureID = 0;
	/**
	 * Boolean used to check whether quads should be drawn as two triangles. Initialized to false and never changed.
	 */
	private static boolean convertQuadsToTriangles = false;
	
	/**
	 * Boolean used to check if we should use vertex buffers. Initialized to false and never changed.
	 */
	private static boolean tryVBO = false;
	
	/**
	 * The byte buffer used for GL allocation.
	 */
	private static ByteBuffer byteBuffer = GLAllocation.createDirectByteBuffer(nativeBufferSize * 4);
	
	/**
	 * The same memory as byteBuffer, but referenced as an integer buffer.
	 */
	private static IntBuffer intBuffer = byteBuffer.asIntBuffer();
	
	/**
	 * The same memory as byteBuffer, but referenced as an float buffer.
	 */
	private static FloatBuffer floatBuffer = byteBuffer.asFloatBuffer();
	
	/**
	 * Short buffer
	 */
	private static ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
	
	/**
	 * Raw integer array.
	 */
	private int[] rawBuffer;
	
	/**
	 * The number of vertices to be drawn in the next draw call. Reset to 0 between draw calls.
	 */
	private int vertexCount = 0;
	
	/**
	 * The first coordinate to be used for the texture.
	 */
	private double textureU;
	
	/**
	 * The second coordinate to be used for the texture.
	 */
	private double textureV;
	
	/**
	 * The fourth coordinate to be used for the texture.
	 */
	private double textureW;
	private int brightness;
	
	/**
	 * The color (RGBA) value to be used for the following draw call.
	 */
	private int color;
	
	/**
	 * Whether the current draw object for this tessellator has color values.
	 */
	private boolean hasColor = false;
	
	/**
	 * Whether the current draw object for this tessellator has texture coordinates.
	 */
	private boolean hasTexture = false;
	private boolean hasBrightness = false;
	
	/**
	 * Whether the current draw object for this tessellator has normal values.
	 */
	private boolean hasNormals = false;
	
	/**
	 * The index into the raw buffer to be used for the next data.
	 */
	private int rawBufferIndex = 0;
	
	/**
	 * The number of vertices manually added to the given draw call. This differs from vertexCount because it adds extra
	 * vertices when converting quads to triangles.
	 */
	private int addedVertices = 0;
	
	/**
	 * Disables all color information for the following draw call.
	 */
	private boolean isColorDisabled = false;
	
	/**
	 * The draw mode currently being used by the tessellator.
	 */
	public int drawMode;
	
	/**
	 * An offset to be applied along the x-axis for all vertices in this draw call.
	 */
	public double xOffset;
	
	/**
	 * An offset to be applied along the y-axis for all vertices in this draw call.
	 */
	public double yOffset;
	
	/**
	 * An offset to be applied along the z-axis for all vertices in this draw call.
	 */
	public double zOffset;
	
	/**
	 * The normal to be applied to the face being drawn.
	 */
	private int normal;
	
	/**
	 * The static instance of the Tessellator.
	 */
	public static TmtTessellator instance = new TmtTessellator(2097152);
	
	/**
	 * Whether this tessellator is currently in draw mode.
	 */
	public boolean isDrawing = false;
	
	/**
	 * Whether we are currently using VBO or not.
	 */
	private static boolean useVBO = false;
	
	/**
	 * An IntBuffer used to store the indices of vertex buffer objects.
	 */
	private static IntBuffer vertexBuffers;
	
	/**
	 * The index of the last VBO used. This is used in round-robin fashion, sequentially, through the vboCount vertex
	 * buffers.
	 */
	private int vboIndex = 0;
	
	/**
	 * Number of vertex buffer objects allocated for use.
	 */
	private static int vboCount = 10;
	
	/**
	 * The size of the buffers used (in integers).
	 */
	private int bufferSize;
	
	private TmtTessellator(int par1)
	{
		super(2097152);
	}
	
	public TmtTessellator()
	{
		super(2097152);
	}
	
	static
	{
		instance.defaultTexture = true;
		useVBO = tryVBO && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
		
		if(useVBO)
		{
			vertexBuffers = GLAllocation.createDirectIntBuffer(vboCount);
			ARBBufferObject.glGenBuffersARB(vertexBuffers);
		}
	}
	
	/**
	 * Draws the data set up in this tessellator and resets the state to prepare for new drawing.
	 */
	@Override
	public void draw()
	{
		if(!this.isDrawing)
		{
			throw new IllegalStateException("Not tesselating!");
		}
		else
		{
			this.isDrawing = false;
			
			int offs = 0;
			while(offs < vertexCount)
			{
				int vtc = 0;
				if(drawMode == 7 && convertQuadsToTriangles)
				{
					vtc = Math.min(vertexCount - offs, trivertsInBuffer);
				}
				else
				{
					vtc = Math.min(vertexCount - offs, nativeBufferSize >> 5);
				}
				TmtTessellator.intBuffer.clear();
				TmtTessellator.intBuffer.put(this.rawBuffer, offs * 10, vtc * 10);
				TmtTessellator.byteBuffer.position(0);
				TmtTessellator.byteBuffer.limit(vtc * 40);
				offs += vtc;
				
				if(TmtTessellator.useVBO)
				{
					this.vboIndex = (this.vboIndex + 1) % TmtTessellator.vboCount;
					ARBBufferObject.glBindBufferARB(ARBVertexBufferObject.GL_ARRAY_BUFFER_ARB, TmtTessellator.vertexBuffers.get(this.vboIndex));
					ARBBufferObject.glBufferDataARB(ARBVertexBufferObject.GL_ARRAY_BUFFER_ARB, TmtTessellator.byteBuffer, ARBBufferObject.GL_STREAM_DRAW_ARB);
				}
				
				if(this.hasTexture)
				{
					if(TmtTessellator.useVBO)
					{
						GL11.glTexCoordPointer(4, GL11.GL_FLOAT, 40, 12L);
					}
					else
					{
						TmtTessellator.floatBuffer.position(3);
						GL11.glTexCoordPointer(4, 40, TmtTessellator.floatBuffer);
					}
					
					GL11.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
				}
				
				if(this.hasBrightness)
				{
					OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
					
					if(TmtTessellator.useVBO)
					{
						GL11.glTexCoordPointer(2, GL11.GL_SHORT, 40, 36L);
					}
					else
					{
						TmtTessellator.shortBuffer.position(18);
						GL11.glTexCoordPointer(2, 40, TmtTessellator.shortBuffer);
					}
					
					GL11.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
					OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
				}
				
				if(this.hasColor)
				{
					if(TmtTessellator.useVBO)
					{
						GL11.glColorPointer(4, GL11.GL_UNSIGNED_BYTE, 40, 28L);
					}
					else
					{
						TmtTessellator.byteBuffer.position(28);
						GL11.glColorPointer(4, true, 40, TmtTessellator.byteBuffer);
					}
					
					GL11.glEnableClientState(GL11.GL_COLOR_ARRAY);
				}
				
				if(this.hasNormals)
				{
					if(TmtTessellator.useVBO)
					{
						GL11.glNormalPointer(GL11.GL_UNSIGNED_BYTE, 40, 32L);
					}
					else
					{
						TmtTessellator.byteBuffer.position(32);
						GL11.glNormalPointer(40, TmtTessellator.byteBuffer);
					}
					
					GL11.glEnableClientState(GL11.GL_NORMAL_ARRAY);
				}
				
				if(TmtTessellator.useVBO)
				{
					GL11.glVertexPointer(3, GL11.GL_FLOAT, 40, 0L);
				}
				else
				{
					TmtTessellator.floatBuffer.position(0);
					GL11.glVertexPointer(3, 40, TmtTessellator.floatBuffer);
				}
				
				GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
				
				if(this.drawMode == 7 && convertQuadsToTriangles)
				{
					GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, vtc);
				}
				else
				{
					GL11.glDrawArrays(this.drawMode, 0, vtc);
				}
				
				GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
				
				if(this.hasTexture)
				{
					GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
				}
				
				if(this.hasBrightness)
				{
					OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
					GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
					OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
				}
				
				if(this.hasColor)
				{
					GL11.glDisableClientState(GL11.GL_COLOR_ARRAY);
				}
				
				if(this.hasNormals)
				{
					GL11.glDisableClientState(GL11.GL_NORMAL_ARRAY);
				}
			}
			
			if(rawBufferSize > 0x20000 && rawBufferIndex < (rawBufferSize << 3))
			{
				rawBufferSize = 0;
				rawBuffer = null;
			}
			
			int var1 = this.rawBufferIndex * 4;
			this.reset();
			return;
		}
	}
	
	/**
	 * Clears the tessellator state in preparation for new drawing.
	 */
	private void reset()
	{
		this.vertexCount = 0;
		TmtTessellator.byteBuffer.clear();
		this.rawBufferIndex = 0;
		this.addedVertices = 0;
	}
	
	/**
	 * Sets draw mode in the tessellator to draw quads.
	 */
	public void startDrawingQuads()
	{
		this.startDrawing(7);
	}
	
	/**
	 * Resets tessellator state and prepares for drawing (with the specified draw mode).
	 */
	public void startDrawing(int par1)
	{
		if(this.isDrawing)
		{
			throw new IllegalStateException("Already tesselating!");
		}
		else
		{
			this.isDrawing = true;
			this.reset();
			this.drawMode = par1;
			this.hasNormals = false;
			this.hasColor = false;
			this.hasTexture = false;
			this.hasBrightness = false;
			this.isColorDisabled = false;
		}
	}
	
	/**
	 * Sets the texture coordinates.
	 */
	public void setTextureUV(double par1, double par3)
	{
		this.hasTexture = true;
		this.textureU = par1;
		this.textureV = par3;
		this.textureW = 1.0D;
	}
	
	/**
	 * Sets the texture coordinates.
	 */
	public void setTextureUVW(double par1, double par3, double par4)
	{
		this.hasTexture = true;
		this.textureU = par1;
		this.textureV = par3;
		this.textureW = par4;
	}
	
	public void setBrightness(int par1)
	{
		this.hasBrightness = true;
		this.brightness = par1;
	}
	
	/**
	 * Sets the RGB values as specified, converting from floats between 0 and 1 to integers from 0-255.
	 */
	
	public void setColorOpaque_F(float par1, float par2, float par3)
	{
		this.setColorOpaque((int)(par1 * 255.0F), (int)(par2 * 255.0F), (int)(par3 * 255.0F));
	}
	
	/**
	 * Sets the RGBA values for the color, converting from floats between 0 and 1 to integers from 0-255.
	 */
	public void setColorRGBA_F(float par1, float par2, float par3, float par4)
	{
		this.setColorRGBA((int)(par1 * 255.0F), (int)(par2 * 255.0F), (int)(par3 * 255.0F), (int)(par4 * 255.0F));
	}
	
	/**
	 * Sets the RGB values as specified, and sets alpha to opaque.
	 */
	public void setColorOpaque(int par1, int par2, int par3)
	{
		this.setColorRGBA(par1, par2, par3, 255);
	}
	
	/**
	 * Sets the RGBA values for the color. Also clamps them to 0-255.
	 */
	public void setColorRGBA(int par1, int par2, int par3, int par4)
	{
		if(!this.isColorDisabled)
		{
			if(par1 > 255)
			{
				par1 = 255;
			}
			
			if(par2 > 255)
			{
				par2 = 255;
			}
			
			if(par3 > 255)
			{
				par3 = 255;
			}
			
			if(par4 > 255)
			{
				par4 = 255;
			}
			
			if(par1 < 0)
			{
				par1 = 0;
			}
			
			if(par2 < 0)
			{
				par2 = 0;
			}
			
			if(par3 < 0)
			{
				par3 = 0;
			}
			
			if(par4 < 0)
			{
				par4 = 0;
			}
			
			this.hasColor = true;
			
			if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
			{
				this.color = par4 << 24 | par3 << 16 | par2 << 8 | par1;
			}
			else
			{
				this.color = par1 << 24 | par2 << 16 | par3 << 8 | par4;
			}
		}
	}
	
	/**
	 * Adds a vertex specifying both x,y,z and the texture u,v for it.
	 */
	public void addVertexWithUV(double par1, double par3, double par5, double par7, double par9)
	{
		this.setTextureUV(par7, par9);
		this.addVertex(par1, par3, par5);
	}
	
	public void addVertexWithUVW(double par1, double par3, double par5, double par7, double par9, double par10)
	{
		this.setTextureUVW(par7, par9, par10);
		this.addVertex(par1, par3, par5);
	}
	
	/**
	 * Adds a vertex with the specified x,y,z to the current draw call. It will trigger a draw() if the buffer gets
	 * full.
	 */
	public void addVertex(double par1, double par3, double par5)
	{
		if(rawBufferIndex >= rawBufferSize - 40)
		{
			if(rawBufferSize == 0)
			{
				rawBufferSize = 0x10000;
				rawBuffer = new int[rawBufferSize];
			}
			else
			{
				rawBufferSize *= 2;
				rawBuffer = Arrays.copyOf(rawBuffer, rawBufferSize);
			}
		}
		++this.addedVertices;
		
		if(this.drawMode == 7 && convertQuadsToTriangles && this.addedVertices % 4 == 0)
		{
			for(int var7 = 0; var7 < 2; ++var7)
			{
				int var8 = 10 * (3 - var7);
				
				if(this.hasTexture)
				{
					this.rawBuffer[this.rawBufferIndex + 3] = this.rawBuffer[this.rawBufferIndex - var8 + 3];
					this.rawBuffer[this.rawBufferIndex + 4] = this.rawBuffer[this.rawBufferIndex - var8 + 4];
					this.rawBuffer[this.rawBufferIndex + 5] = this.rawBuffer[this.rawBufferIndex - var8 + 5];
					this.rawBuffer[this.rawBufferIndex + 6] = this.rawBuffer[this.rawBufferIndex - var8 + 6];
				}
				
				if(this.hasBrightness)
				{
					this.rawBuffer[this.rawBufferIndex + 9] = this.rawBuffer[this.rawBufferIndex - var8 + 9];
				}
				
				if(this.hasColor)
				{
					this.rawBuffer[this.rawBufferIndex + 7] = this.rawBuffer[this.rawBufferIndex - var8 + 7];
				}
				
				this.rawBuffer[this.rawBufferIndex] = this.rawBuffer[(this.rawBufferIndex - var8)];
				this.rawBuffer[this.rawBufferIndex + 1] = this.rawBuffer[this.rawBufferIndex - var8 + 1];
				this.rawBuffer[this.rawBufferIndex + 2] = this.rawBuffer[this.rawBufferIndex - var8 + 2];
				++this.vertexCount;
				this.rawBufferIndex += 10;
			}
		}
		
		if(this.hasTexture)
		{
			this.rawBuffer[this.rawBufferIndex + 3] = Float.floatToRawIntBits((float)this.textureU);
			this.rawBuffer[this.rawBufferIndex + 4] = Float.floatToRawIntBits((float)this.textureV);
			this.rawBuffer[this.rawBufferIndex + 5] = Float.floatToRawIntBits(0.0F);
			this.rawBuffer[this.rawBufferIndex + 6] = Float.floatToRawIntBits((float)this.textureW);
		}
		
		if(this.hasBrightness)
		{
			this.rawBuffer[this.rawBufferIndex + 9] = this.brightness;
		}
		
		if(this.hasColor)
		{
			this.rawBuffer[this.rawBufferIndex + 7] = this.color;
		}
		
		if(this.hasNormals)
		{
			this.rawBuffer[this.rawBufferIndex + 8] = this.normal;
		}
		
		this.rawBuffer[this.rawBufferIndex] = Float.floatToRawIntBits((float)(par1 + this.xOffset));
		this.rawBuffer[this.rawBufferIndex + 1] = Float.floatToRawIntBits((float)(par3 + this.yOffset));
		this.rawBuffer[this.rawBufferIndex + 2] = Float.floatToRawIntBits((float)(par5 + this.zOffset));
		this.rawBufferIndex += 10;
		++this.vertexCount;
	}
	
	/**
	 * Sets the color to the given opaque value (stored as byte values packed in an integer).
	 */
	public void setColorOpaque_I(int par1)
	{
		int j = par1 >> 16 & 255;
		int k = par1 >> 8 & 255;
		int l = par1 & 255;
		this.setColorOpaque(j, k, l);
	}
	
	/**
	 * Sets the color to the given color (packed as bytes in integer) and alpha values.
	 */
	public void setColorRGBA_I(int par1, int par2)
	{
		int k = par1 >> 16 & 255;
		int l = par1 >> 8 & 255;
		int i1 = par1 & 255;
		this.setColorRGBA(k, l, i1, par2);
	}
	
	/**
	 * Disables colors for the current draw call.
	 */
	public void disableColor()
	{
		this.isColorDisabled = true;
	}
	
	/**
	 * Sets the normal for the current draw call.
	 */
	public void setNormal(float par1, float par2, float par3)
	{
		this.hasNormals = true;
		byte b0 = (byte)((int)(par1 * 127.0F));
		byte b1 = (byte)((int)(par2 * 127.0F));
		byte b2 = (byte)((int)(par3 * 127.0F));
		this.normal = b0 & 255 | (b1 & 255) << 8 | (b2 & 255) << 16;
	}
	
	/**
	 * Sets the translation for all vertices in the current draw call.
	 */
	public void setTranslation(double par1, double par3, double par5)
	{
		this.xOffset = par1;
		this.yOffset = par3;
		this.zOffset = par5;
	}
	
	/**
	 * Offsets the translation for all vertices in the current draw call.
	 */
	public void addTranslation(float par1, float par2, float par3)
	{
		this.xOffset += par1;
		this.yOffset += par2;
		this.zOffset += par3;
	}
}
