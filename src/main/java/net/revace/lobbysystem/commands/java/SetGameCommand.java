package net.revace.lobbysystem.commands.java;

import net.revace.lobbysystem.commands.SubCommand;
import net.revace.lobbysystem.utils.Data;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class SetGameCommand extends SubCommand {

    public SetGameCommand(String command, String syntax) {
        super(command, syntax);
    }

    @Override
    public void executeCommand(CommandSender commandSender, String[] args) {

        Player player = (Player)commandSender;

        if(args.length == 1)
            player.sendMessage(Data.getPrefix() + "§cBitte nutze: §6/" + getCommand() + " §e" + getSyntax());
        else {

            String game = args[1].toLowerCase();
            if(Data.ValidGames.gameExists(game)) {
                // Wird gesetzt
            } else {
                player.sendMessage(Data.getPrefix() + "§cDas Spiel kann nicht gesetzt werden.");
                player.sendMessage(Data.getPrefix() + "§eAlle verfügbare Spiele:");
                Arrays.asList(Data.ValidGames.values()).forEach(gameCont -> player.sendMessage("§7- §e" + gameCont.getName()));
            }

        }

    }
}
