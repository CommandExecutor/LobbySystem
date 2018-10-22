package net.revace.lobbysystem;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import net.revace.lobbysystem.listeners.InventoryClickListener;
import net.revace.lobbysystem.listeners.PlayerChatListener;
import net.revace.lobbysystem.listeners.PlayerInteractListener;
import net.revace.lobbysystem.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

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
}
