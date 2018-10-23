package net.revace.lobbysystem.commands;

import net.revace.lobbysystem.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuildEditCommand implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        Player player = (Player) commandSender;
        if (args.length == 0) {
            if (!Data.PlayerData.getBuildPlayers().contains(player)) {
                player.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §aaktiviert");
                Data.PlayerData.getBuildPlayers().add(player);
            } else {
                player.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §cdeaktiviert");
                Data.PlayerData.getBuildPlayers().remove(player);
            }
        } else if (args.length >= 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                player.sendMessage(Data.getNotOnline());
                return true;
            }
            if (!Data.PlayerData.getBuildPlayers().contains(player)) {
                player.sendMessage(Data.getPrefix() + "Der Spieler §6" + target.getDisplayName() + "§7 ist jetzt im §eBaumodus");
                target.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §aaktiviert");
                Data.PlayerData.getBuildPlayers().add(target);
            } else {
                player.sendMessage(Data.getPrefix() + "Der Spieler §6" + target.getDisplayName() + "§7 ist jetzt nicht mehr §eBaumodus");
                target.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §cdeaktiviert");
                Data.PlayerData.getBuildPlayers().remove(target);
            }
        }
        return true;
    }
}
