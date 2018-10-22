package net.revace.lobbysystem.managers;

import net.revace.lobbysystem.LobbySystem;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConfigManager {

    private File root = LobbySystem.getInstance().getDataFolder();
    private File configFile = new File(root.toPath() + "/" + "config.yml");
    private Map<String, Object> configCache = new HashMap<>();
    private Runnable onCreating;

    private FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);

    public File getConfigFile() {
        return configFile;
    }

    public FileConfiguration getConfig() {
        return config;
    }

    public Object getConfigValue(String key) {
        checkConfig();
        if(configCache.containsKey(key))
            return configCache.get(key);
        if(config.get(key) != null) {
            configCache.put(key, config.get(key));
            return ChatColor.translateAlternateColorCodes('&', configCache.get(key).toString());
        }
        return null;
    }

    public void setConfigValue(String key, Object value) {
        configCache.put(key, value);
        config.set(key, value);
    }

    public Set<String> getConfigurationSectionValues(String key) {
        return config.getConfigurationSection(key).getKeys(false);
    }

    private void checkConfig() {
        if(!root.exists())
            root.mkdirs();
        if(!configFile.exists()) {
            try {
                Files.write(configFile.toPath(), config.saveToString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                this.onCreating.run();
                saveConfig();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setOnCreating(Runnable runnable) {
        this.onCreating = runnable;
    }

    public void saveConfig(){
        try {
            config.save(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
