package net.revace.lobbysystem;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import org.bukkit.plugin.java.JavaPlugin;

public class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static LobbySystem getInstance() {
        return getPlugin(LobbySystem.class);
    }
}
