package net.revace.lobbysystem.commands.java;

import net.revace.lobbysystem.LobbySystem;
import net.revace.lobbysystem.commands.SubCommand;
import net.revace.lobbysystem.utils.Data;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand extends SubCommand {

    public SetSpawnCommand(String command, String syntax) {
        super(command, syntax);
    }

    @Override
    public void executeCommand(CommandSender commandSender, String[] args) {

        Player player = (Player) commandSender;

            LobbySystem.getInstance().getConfigManager().setConfigValue("locations.spawn", player.getLocation());
            LobbySystem.getInstance().getConfigManager().saveConfig();
            player.sendMessage(Data.getPrefix() + "Der §eSpawn§7 wurde gesetzt.");

    }
}
