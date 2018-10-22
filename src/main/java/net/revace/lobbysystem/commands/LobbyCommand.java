package net.revace.lobbysystem.commands;

import net.revace.lobbysystem.managers.CommandManager;
import net.revace.lobbysystem.utils.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbyCommand implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

        if(!player.hasPermission("revace.commands.lobby")) {
            player.sendMessage(Data.getNoPerm());
            return true;
        }
        player.sendMessage("");
        player.sendMessage(Data.getPrefix() + "§7Die Befehle zum LobbySystem:");
        player.sendMessage("");
        if(CommandManager.getSubCommands().isEmpty()) {
            player.sendMessage("§cEs gibt momentan keine Befehle");
        } else {
            CommandManager.getSubCommands().forEach(subCommand -> player.sendMessage("§7- §6/" + subCommand.getCommand()
                    + (subCommand.getSyntax() != null ? " §e" + subCommand.getSyntax() : "") + " §8×§3 " + subCommand.getDescription()));
        }
        player.sendMessage("");

        return true;
    }
}
