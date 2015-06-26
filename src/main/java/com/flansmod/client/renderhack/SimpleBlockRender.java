package com.flansmod.client.renderhack;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * A simple class that add quads rendering (based on 1.7 RenderBlocks)
 */
public class SimpleBlockRender {

    public double renderMinX, renderMaxX, renderMinY, renderMaxY, renderMinZ, renderMaxZ;
    public int uvRotateEast, uvRotateWest, uvRotateSouth, uvRotateNorth, uvRotateTop, uvRotateBottom;

    public WorldRenderer worldRenderer;
    public boolean renderFromInside, flipTexture;

    /**
     * RGB colors by side
     */
    public float colorRedTopLeft, colorGreenTopLeft, colorBlueTopLeft,
            colorRedBottomLeft, colorGreenBottomLeft, colorBlueBottomLeft,
            colorRedTopRight, colorGreenTopRight, colorBlueTopRight,
            colorRedBottomRight, colorGreenBottomRight, colorBlueBottomRight;

    /**
     * Brightness by side
     */
    public int brightnessTopLeft, brightnessBottomLeft, brightnessBottomRight,
            brightnessTopRight;

    public boolean enableAO;
    public boolean renderAllFaces;
    private Minecraft minecraft;
    private World world;

    public SimpleBlockRender() {
        this.renderMaxX = 1.0;
        this.renderMaxY = 1.0;
        this.renderMaxZ = 1.0;
        this.minecraft = Minecraft.getMinecraft();
    }

    public SimpleBlockRender(WorldRenderer renderer) {
        this();
        this.worldRenderer = renderer;
    }

    public void setRenderFromInside(boolean value) {
        this.renderFromInside = value;
    }

    public void setRenderBounds(double minX, double minY, double minZ,
                                double maxX, double maxY, double maxZ) {
        this.renderMinX = minX;
        this.renderMaxX = maxX;
        this.renderMinY = minY;
        this.renderMaxY = maxY;
        this.renderMinZ = minZ;
        this.renderMaxZ = maxZ;
    }

    /**
     * Renders the given texture to the bottom face of the block. Args: block,
     * x, y, z, texture
     */
    public void renderFaceYNeg(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinX * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxX * 16.0D);
        double d5 = (double) texture.getInterpolatedV(this.renderMinZ * 16.0D);
        double d6 = (double) texture.getInterpolatedV(this.renderMaxZ * 16.0D);

        if (this.renderMinX < 0.0D || this.renderMaxX > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinZ < 0.0D || this.renderMaxZ > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        double d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateBottom == 2) {
            d3 = (double) texture.getInterpolatedU(this.renderMinZ * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxX * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxZ * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinX * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateBottom == 1) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxZ * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinZ * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMaxX * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateBottom == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxX * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinZ * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxZ * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMinX;
        double d12 = x + this.renderMaxX;
        double d13 = y + this.renderMinY;
        double d14 = z + this.renderMinZ;
        double d15 = z + this.renderMaxZ;

        if (this.renderFromInside) {
            d11 = x + this.renderMaxX;
            d12 = x + this.renderMinX;
        }
        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d12, d13, d14, d7, d9);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
        } else {
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
            worldRenderer.addVertexWithUV(d12, d13, d14, d7, d9);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
        }

    }

    /**
     * Renders the given texture to the top face of the block. Args: x, y, z,
     * texture
     */
    public void renderFaceYPos(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinX * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxX * 16.0D);
        double d5 = (double) texture.getInterpolatedV(this.renderMinZ * 16.0D);
        double d6 = (double) texture.getInterpolatedV(this.renderMaxZ * 16.0D);

        if (this.renderMinX < 0.0D || this.renderMaxX > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinZ < 0.0D || this.renderMaxZ > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        double d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateTop == 1) {
            d3 = (double) texture.getInterpolatedU(this.renderMinZ * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxX * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxZ * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinX * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateTop == 2) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxZ * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinZ * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMaxX * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateTop == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxX * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinZ * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxZ * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMinX;
        double d12 = x + this.renderMaxX;
        double d13 = y + this.renderMaxY;
        double d14 = z + this.renderMinZ;
        double d15 = z + this.renderMaxZ;

        if (this.renderFromInside) {
            d11 = x + this.renderMaxX;
            d12 = x + this.renderMinX;
        }

        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d12, d13, d14, d7, d9);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
        } else {
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.addVertexWithUV(d12, d13, d14, d7, d9);
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
        }

    }

    /**
     * Renders the given texture to the north (z-negative) face of the block.
     * Args: x, y, z, texture
     */
    public void renderFaceZNeg(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinX * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxX * 16.0D);

        double d5 = (double) texture
                .getInterpolatedV(16.0D - this.renderMaxY * 16.0D);
        double d6 = (double) texture
                .getInterpolatedV(16.0D - this.renderMinY * 16.0D);
        double d7;

        if (this.flipTexture) {
            d7 = d3;
            d3 = d4;
            d4 = d7;
        }

        if (this.renderMinX < 0.0D || this.renderMaxX > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinY < 0.0D || this.renderMaxY > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateEast == 2) {
            d3 = (double) texture.getInterpolatedU(this.renderMinY * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxY * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinX * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxX * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateEast == 1) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxY * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinY * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxX * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinX * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateEast == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxX * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinY * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMinX;
        double d12 = x + this.renderMaxX;
        double d13 = y + this.renderMinY;
        double d14 = y + this.renderMaxY;
        double d15 = z + this.renderMinZ;

        if (this.renderFromInside) {
            d11 = x + this.renderMaxX;
            d12 = x + this.renderMinX;
        }
        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d11, d14, d15, d7, d9);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d12, d14, d15, d3, d5);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d12, d13, d15, d8, d10);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d11, d13, d15, d4, d6);
        } else {
            worldRenderer.addVertexWithUV(d11, d14, d15, d7, d9);
            worldRenderer.addVertexWithUV(d12, d14, d15, d3, d5);
            worldRenderer.addVertexWithUV(d12, d13, d15, d8, d10);
            worldRenderer.addVertexWithUV(d11, d13, d15, d4, d6);
        }

    }

    /**
     * Renders the given texture to the south (z-positive) face of the block.
     * Args: x, y, z, texture
     */
    public void renderFaceZPos(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinX * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxX * 16.0D);
        double d5 = (double) texture
                .getInterpolatedV(16.0D - this.renderMaxY * 16.0D);
        double d6 = (double) texture
                .getInterpolatedV(16.0D - this.renderMinY * 16.0D);
        double d7;

        if (this.flipTexture) {
            d7 = d3;
            d3 = d4;
            d4 = d7;
        }

        if (this.renderMinX < 0.0D || this.renderMaxX > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinY < 0.0D || this.renderMaxY > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateWest == 1) {
            d3 = (double) texture.getInterpolatedU(this.renderMinY * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinX * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxY * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxX * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateWest == 2) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxY * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMaxX * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateWest == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinX * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxX * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinY * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMinX;
        double d12 = x + this.renderMaxX;
        double d13 = y + this.renderMinY;
        double d14 = y + this.renderMaxY;
        double d15 = z + this.renderMaxZ;

        if (this.renderFromInside) {
            d11 = x + this.renderMaxX;
            d12 = x + this.renderMinX;
        }
        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d11, d14, d15, d3, d5);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d12, d14, d15, d7, d9);
        } else {
            worldRenderer.addVertexWithUV(d11, d14, d15, d3, d5);
            worldRenderer.addVertexWithUV(d11, d13, d15, d8, d10);
            worldRenderer.addVertexWithUV(d12, d13, d15, d4, d6);
            worldRenderer.addVertexWithUV(d12, d14, d15, d7, d9);
        }

    }

    /**
     * Renders the given texture to the west (x-negative) face of the block.
     * Args: x, y, z, texture
     */
    public void renderFaceXNeg(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinZ * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxZ * 16.0D);
        double d5 = (double) texture
                .getInterpolatedV(16.0D - this.renderMaxY * 16.0D);
        double d6 = (double) texture
                .getInterpolatedV(16.0D - this.renderMinY * 16.0D);
        double d7;

        if (this.flipTexture) {
            d7 = d3;
            d3 = d4;
            d4 = d7;
        }

        if (this.renderMinZ < 0.0D || this.renderMaxZ > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinY < 0.0D || this.renderMaxY > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateNorth == 1) {
            d3 = (double) texture.getInterpolatedU(this.renderMinY * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxZ * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxY * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinZ * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateNorth == 2) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxY * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMinZ * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMaxZ * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateNorth == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinZ * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxZ * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinY * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMinX;
        double d12 = y + this.renderMinY;
        double d13 = y + this.renderMaxY;
        double d14 = z + this.renderMinZ;
        double d15 = z + this.renderMaxZ;

        if (this.renderFromInside) {
            d14 = z + this.renderMaxZ;
            d15 = z + this.renderMinZ;
        }

        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d11, d13, d15, d7, d9);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d11, d12, d14, d8, d10);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d11, d12, d15, d4, d6);
        } else {
            worldRenderer.addVertexWithUV(d11, d13, d15, d7, d9);
            worldRenderer.addVertexWithUV(d11, d13, d14, d3, d5);
            worldRenderer.addVertexWithUV(d11, d12, d14, d8, d10);
            worldRenderer.addVertexWithUV(d11, d12, d15, d4, d6);
        }
    }

    /**
     * Renders the given texture to the east (x-positive) face of the block.
     * Args: x, y, z, texture
     */
    public void renderFaceXPos(double x, double y, double z,
                               TextureAtlasSprite texture) {

        double d3 = (double) texture.getInterpolatedU(this.renderMinZ * 16.0D);
        double d4 = (double) texture.getInterpolatedU(this.renderMaxZ * 16.0D);
        double d5 = (double) texture
                .getInterpolatedV(16.0D - this.renderMaxY * 16.0D);
        double d6 = (double) texture
                .getInterpolatedV(16.0D - this.renderMinY * 16.0D);
        double d7;

        if (this.flipTexture) {
            d7 = d3;
            d3 = d4;
            d4 = d7;
        }

        if (this.renderMinZ < 0.0D || this.renderMaxZ > 1.0D) {
            d3 = (double) texture.getMinU();
            d4 = (double) texture.getMaxU();
        }

        if (this.renderMinY < 0.0D || this.renderMaxY > 1.0D) {
            d5 = (double) texture.getMinV();
            d6 = (double) texture.getMaxV();
        }

        d7 = d4;
        double d8 = d3;
        double d9 = d5;
        double d10 = d6;

        if (this.uvRotateSouth == 2) {
            d3 = (double) texture.getInterpolatedU(this.renderMinY * 16.0D);
            d5 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMinZ * 16.0D);
            d4 = (double) texture.getInterpolatedU(this.renderMaxY * 16.0D);
            d6 = (double) texture
                    .getInterpolatedV(16.0D - this.renderMaxZ * 16.0D);
            d9 = d5;
            d10 = d6;
            d7 = d3;
            d8 = d4;
            d5 = d6;
            d6 = d9;
        } else if (this.uvRotateSouth == 1) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxY * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxZ * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinZ * 16.0D);
            d7 = d4;
            d8 = d3;
            d3 = d4;
            d4 = d8;
            d9 = d6;
            d10 = d5;
        } else if (this.uvRotateSouth == 3) {
            d3 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMinZ * 16.0D);
            d4 = (double) texture
                    .getInterpolatedU(16.0D - this.renderMaxZ * 16.0D);
            d5 = (double) texture.getInterpolatedV(this.renderMaxY * 16.0D);
            d6 = (double) texture.getInterpolatedV(this.renderMinY * 16.0D);
            d7 = d4;
            d8 = d3;
            d9 = d5;
            d10 = d6;
        }

        double d11 = x + this.renderMaxX;
        double d12 = y + this.renderMinY;
        double d13 = y + this.renderMaxY;
        double d14 = z + this.renderMinZ;
        double d15 = z + this.renderMaxZ;

        if (this.renderFromInside) {
            d14 = z + this.renderMaxZ;
            d15 = z + this.renderMinZ;
        }

        if (this.enableAO) {
            worldRenderer.setColorOpaque_F(this.colorRedTopLeft,
                    this.colorGreenTopLeft, this.colorBlueTopLeft);
            worldRenderer.setBrightness(this.brightnessTopLeft);
            worldRenderer.addVertexWithUV(d11, d12, d15, d8, d10);
            worldRenderer.setColorOpaque_F(this.colorRedBottomLeft,
                    this.colorGreenBottomLeft, this.colorBlueBottomLeft);
            worldRenderer.setBrightness(this.brightnessBottomLeft);
            worldRenderer.addVertexWithUV(d11, d12, d14, d4, d6);
            worldRenderer.setColorOpaque_F(this.colorRedBottomRight,
                    this.colorGreenBottomRight, this.colorBlueBottomRight);
            worldRenderer.setBrightness(this.brightnessBottomRight);
            worldRenderer.addVertexWithUV(d11, d13, d14, d7, d9);
            worldRenderer.setColorOpaque_F(this.colorRedTopRight,
                    this.colorGreenTopRight, this.colorBlueTopRight);
            worldRenderer.setBrightness(this.brightnessTopRight);
            worldRenderer.addVertexWithUV(d11, d13, d15, d3, d5);
        } else {
            worldRenderer.addVertexWithUV(d11, d12, d15, d8, d10);
            worldRenderer.addVertexWithUV(d11, d12, d14, d4, d6);
            worldRenderer.addVertexWithUV(d11, d13, d14, d7, d9);
            worldRenderer.addVertexWithUV(d11, d13, d15, d3, d5);
        }
    }

    public boolean renderInventoryStandardBlock(
            ITextureHandler textureManager, Tessellator tessellator) {
        IBlockState state = Blocks.air.getDefaultState();
        if(textureManager instanceof Block)
            state = ((Block)textureManager).getDefaultState();
        
        return this.renderInventoryStandardBlock(textureManager, state, tessellator);
    }
    
    public boolean renderInventoryStandardBlock(
            ITextureHandler textureManager, IBlockState state, Tessellator tessellator) {
        this.renderFromInside = true;
        // Inside Render
        worldRenderer.startDrawingQuads();
        worldRenderer.setNormal(0.0F, -1F, 0.0F);
        this.renderFaceYNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.DOWN));
        worldRenderer.setNormal(0.0F, 1.0F, 0.0F);
        this.renderFaceYPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.UP));
        worldRenderer.setNormal(0.0F, 0.0F, -1F);
        this.renderFaceZNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.NORTH));
        worldRenderer.setNormal(0.0F, 0.0F, 1.0F);
        this.renderFaceZPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.SOUTH));
        worldRenderer.setNormal(-1F, 0.0F, 0.0F);
        this.renderFaceXNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.WEST));
        worldRenderer.setNormal(1.0F, 0.0F, 0.0F);
        this.renderFaceXPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.EAST));
        tessellator.draw();
        this.renderFromInside = false;
        // Normal Render
        worldRenderer.startDrawingQuads();
        worldRenderer.setNormal(0.0F, -1F, 0.0F);
        this.renderFaceYNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.DOWN));
        worldRenderer.setNormal(0.0F, 1.0F, 0.0F);
        this.renderFaceYPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.UP));
        worldRenderer.setNormal(0.0F, 0.0F, -1F);
        this.renderFaceZNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.NORTH));
        worldRenderer.setNormal(0.0F, 0.0F, 1.0F);
        this.renderFaceZPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.SOUTH));
        worldRenderer.setNormal(-1F, 0.0F, 0.0F);
        this.renderFaceXNeg(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.WEST));
        worldRenderer.setNormal(1.0F, 0.0F, 0.0F);
        this.renderFaceXPos(0.0D, 0.0D, 0.0D,
                textureManager.getSidedTexture(state, EnumFacing.EAST));
        tessellator.draw();
        return true;
    }
    
    
    

    /**
     * Renders a standard cube block at the given coordinates.
     * Args: textureManager, pos
     */
    public boolean renderStandardBlock(ITextureHandler textureManager,
                                       BlockPos pos) {
        if (world == null)
            world = minecraft.theWorld;
        Block block = this.world.getBlockState(pos).getBlock();
        int l = this.world.getBlockState(pos).getBlock()
                .colorMultiplier(this.world, pos);
        float f = (float) (l >> 16 & 255) / 255.0F;
        float f1 = (float) (l >> 8 & 255) / 255.0F;
        float f2 = (float) (l & 255) / 255.0F;

        if (EntityRenderer.anaglyphEnable) {
            float f3 = (f * 30.0F + f1 * 59.0F + f2 * 11.0F) / 100.0F;
            float f4 = (f * 30.0F + f1 * 70.0F) / 100.0F;
            float f5 = (f * 30.0F + f2 * 70.0F) / 100.0F;
            f = f3;
            f1 = f4;
            f2 = f5;
        }
        this.renderFromInside = true;
        boolean inside = this.renderStandardBlockWithColorMultiplier(block, textureManager, pos, f, f1,
                f2, 0F);
        this.renderFromInside = false;
        return inside && this.renderStandardBlockWithColorMultiplier(block, textureManager, pos,
                f, f1, f2, 0F);
    }

    /**
     * Renders a standard cube block at the given coordinates, with a given
     * color ratio. Args: block, textureManager, pos, r, g, b
     */
    public boolean renderStandardBlockWithColorMultiplier(Block block,
                                                          ITextureHandler textureManager, BlockPos pos, float r,
                                                          float g, float b, float a) {
        if (world == null)
            world = minecraft.theWorld;
        this.enableAO = false;
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1.0F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f4 * r;
        float f8 = f4 * g;
        float f9 = f4 * b;
        float f10 = f3;
        float f11 = f5;
        float f12 = f6;
        float f13 = f3;
        float f14 = f5;
        float f15 = f6;
        float f16 = f3;
        float f17 = f5;
        float f18 = f6;

        if (block != Blocks.grass) {
            f10 = f3 * r;
            f11 = f5 * r;
            f12 = f6 * r;
            f13 = f3 * g;
            f14 = f5 * g;
            f15 = f6 * g;
            f16 = f3 * b;
            f17 = f5 * b;
            f18 = f6 * b;
        }

        int l = block.getMixedBrightnessForBlock(world, pos);
        IBlockState state = world.getBlockState(pos);

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.down(),
                EnumFacing.DOWN)) {
            worldRenderer.setBrightness(this.renderMinY > 0.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.down()));
            worldRenderer.setColorRGBA_F(f10, f13, f16, a);
            this.renderFaceYNeg(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.DOWN));
            flag = true;
        }

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.up(), EnumFacing.UP)) {
            worldRenderer.setBrightness(this.renderMaxY < 1.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.up()));
            worldRenderer.setColorRGBA_F(f7, f8, f9, a);
            this.renderFaceYPos(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.UP));
            flag = true;
        }

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.north(),
                EnumFacing.NORTH)) {
            worldRenderer.setBrightness(this.renderMinZ > 0.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.north()));
            worldRenderer.setColorRGBA_F(f11, f14, f17, a);
            this.renderFaceZNeg(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.NORTH));

            flag = true;
        }

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.south(),
                EnumFacing.SOUTH)) {
            worldRenderer.setBrightness(this.renderMaxZ < 1.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.south()));
            worldRenderer.setColorRGBA_F(f11, f14, f17, a);
            this.renderFaceZPos(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.SOUTH));

            flag = true;
        }

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.west(),
                EnumFacing.WEST)) {
            worldRenderer.setBrightness(this.renderMinX > 0.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.west()));
            worldRenderer.setColorRGBA_F(f12, f15, f18, a);
            ;
            this.renderFaceXNeg(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.WEST));

            flag = true;
        }

        if (this.renderAllFaces
                || block.shouldSideBeRendered(world, pos.east(),
                EnumFacing.EAST)) {
            worldRenderer.setBrightness(this.renderMaxX < 1.0D ? l : block
                    .getMixedBrightnessForBlock(world, pos.east()));
            worldRenderer.setColorRGBA_F(f12, f15, f18, a);
            this.renderFaceXPos(pos.getX(), pos.getY(), pos.getZ(),
                    textureManager.getSidedTexture(state, EnumFacing.EAST));

            flag = true;
        }

        return flag;
    }

}