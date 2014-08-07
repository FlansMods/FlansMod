package com.flansmod.client.gui.config;

import net.minecraft.client.gui.GuiScreen;

import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import cpw.mods.fml.client.config.GuiConfig;

import com.flansmod.common.FlansMod;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen parent) {
        super(parent,
                new ConfigElement(FlansMod.configFile.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                FlansMod.MODID, false, false, GuiConfig.getAbridgedConfigPath(FlansMod.configFile.toString()));
    }
}
