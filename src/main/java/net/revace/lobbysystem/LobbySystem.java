package net.revace.lobbysystem;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import net.revace.lobbysystem.commands.LobbyCommand;
import net.revace.lobbysystem.commands.java.BuildEditCommand;
import net.revace.lobbysystem.managers.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("lobby").setExecutor(new LobbyCommand());
        CommandManager.addSubCommand(new BuildEditCommand("build", "(Spieler)", "Versetzt dich in den Baumodus"));

    }

    @Override
    public void onDisable() {

    }

    public static LobbySystem getInstance() {
        return getPlugin(LobbySystem.class);
    }
}
