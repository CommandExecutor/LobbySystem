package net.revace.lobbysystem;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import net.revace.lobbysystem.commands.LobbyCommand;
import net.revace.lobbysystem.commands.BuildEditCommand;
import net.revace.lobbysystem.commands.java.SetGameCommand;
import net.revace.lobbysystem.commands.java.SetSpawnCommand;
import net.revace.lobbysystem.listeners.InventoryClickListener;
import net.revace.lobbysystem.listeners.PlayerChatListener;
import net.revace.lobbysystem.listeners.PlayerInteractListener;
import net.revace.lobbysystem.listeners.PlayerJoinListener;
import net.revace.lobbysystem.managers.CommandManager;
import net.revace.lobbysystem.managers.ConfigManager;
import net.revace.lobbysystem.utils.Methods;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbySystem extends JavaPlugin {

    private ConfigManager configManager;

    @Override
    public void onEnable() {

        this.configManager = new ConfigManager();

        this.getCommand("lobby").setExecutor(new LobbyCommand());
        this.getCommand("build").setExecutor(new BuildEditCommand());
        CommandManager.addSubCommand(new SetGameCommand("setgame", "<Game>"));
        CommandManager.addSubCommand(new SetSpawnCommand("setspawn"));

    }

    @Override
    public void onDisable() {
        Methods.releaseConfig();
    }

    private void loadListener(){
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new PlayerInteractListener(), this);
        pm.registerEvents(new PlayerChatListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);




    }

    public static LobbySystem getInstance() {
        return getPlugin(LobbySystem.class);
    }

    public ConfigManager getConfigManager() { return configManager; }
}
