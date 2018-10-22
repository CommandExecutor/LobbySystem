package net.revace.lobbysystem.commands.java;

import net.revace.lobbysystem.commands.SubCommand;
import net.revace.lobbysystem.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuildEditCommand extends SubCommand {

    public BuildEditCommand(String command, String syntax, String description) {
        super(command, syntax, description);
    }

    public void executeCommand(CommandSender commandSender, String[] args) {

        Player player = (Player) commandSender;
        if(args.length == 1) { // 1 -> /lobby (build)
            if(!Data.PlayerData.getBuildPlayers().contains(player)) {
                player.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §aaktiviert");
                Data.PlayerData.getBuildPlayers().add(player);
            } else {
                player.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §cdeaktiviert");
                Data.PlayerData.getBuildPlayers().remove(player);
            }
        } else if(args.length >= 2) {
            Player target = Bukkit.getPlayer(args[1]);
            if(target == null) {
                player.sendMessage(Data.getNotOnline());
                return;
            }
            if(!Data.PlayerData.getBuildPlayers().contains(player)) {
                player.sendMessage(Data.getPrefix() + "Der Spieler §6" + target.getDisplayName() + "§7 ist jetzt im §eBaumodus");
                target.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §aaktiviert");
                Data.PlayerData.getBuildPlayers().add(target);
            } else {
                player.sendMessage(Data.getPrefix() + "Der Spieler §6" + target.getDisplayName() + "§7 ist jetzt nicht mehr §eBaumodus");
                target.sendMessage(Data.getPrefix() + "Dein §eBaumodus§7 wurde §cdeaktiviert");
                Data.PlayerData.getBuildPlayers().remove(target);
            }
        }

    }
}
