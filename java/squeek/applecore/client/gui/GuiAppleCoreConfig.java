package squeek.applecore.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import squeek.applecore.ModConfig;
import squeek.applecore.ModInfo;

import java.util.ArrayList;
import java.util.Arrays;

public class GuiAppleCoreConfig extends GuiConfig {
    public GuiAppleCoreConfig(GuiScreen parentScreen) {
        super(parentScreen, Arrays.asList(new IConfigElement[] {new ConfigElement(ModConfig.config.getCategory(ModConfig.CATEGORY_CLIENT)), new ConfigElement(ModConfig.config.getCategory(ModConfig.CATEGORY_SERVER))}), ModInfo.MODID, false, false, GuiConfig.getAbridgedConfigPath(ModConfig.config.toString()));
    }
}