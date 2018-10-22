package net.revace.lobbysystem.commands.java;

import net.revace.lobbysystem.commands.SubCommand;
import net.revace.lobbysystem.utils.Data;
import org.apache.commons.lang.math.NumberUtils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand extends SubCommand {

    public GameModeCommand(String command, String syntax) {
        super(command, syntax);
    }

    @Override
    public void executeCommand(CommandSender commandSender, String[] args) {

        Player player = (Player) commandSender;

        if(args.length == 1) {
            player.sendMessage(Data.getPrefix() + "§cBitte nutze: §6/" + getCommand() + " §e" + getSyntax());
        } else if(args.length == 2) {

            try {
                int id = NumberUtils.toInt(args[1]);

                if(id < 0 || id > 3) {
                    player.sendMessage(Data.getNotValidNumber());
                    return;
                }

                GameMode gameMode = GameMode.getByValue(id);
                player.sendMessage(Data.getPrefix() + "Dein §6Spielmodus§7 wurde auf §e" + gameMode.name() + "§7 gesetzt.");

            } catch (NumberFormatException ex) {
                player.sendMessage(Data.getNotValidNumber());
            }
        } else {
            Player target = Bukkit.getPlayer(args[2]);
            if(target == null) {
                player.sendMessage(Data.getNotOnline());
                return;
            }
            try {
                int id = NumberUtils.toInt(args[1]);

                if(id < 0 || id > 3) {
                    player.sendMessage(Data.getNotValidNumber());
                    return;
                }

                GameMode gameMode = GameMode.getByValue(id);
                target.sendMessage(Data.getPrefix() + "Dein §6Spielmodus§7 wurde auf §e§o" + gameMode.name() + "§7 gesetzt.");
                player.sendMessage(Data.getPrefix() + "§eSpielmodus von §6" + player.getDisplayName() + "§7 auf §e§o" + gameMode.name() + "§7 gesetzt");

            } catch (NumberFormatException ex) {
                player.sendMessage(Data.getNotValidNumber());
            }
        }

    }
}
