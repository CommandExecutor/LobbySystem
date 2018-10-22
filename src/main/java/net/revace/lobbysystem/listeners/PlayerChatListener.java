package net.revace.lobbysystem.listeners;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.api.player.PermissionProvider;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener {


    @EventHandler
    public void handleChat(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();

        String prefix = PermissionProvider.getPrefix(CloudAPI.getInstance().getOfflinePlayer(player.getUniqueId()));
        char rankColor = PermissionProvider.getPrefix(player.getUniqueId()).charAt(2);

        e.setFormat("§8│ " + prefix + "§8● §" + rankColor + " §8➟ §f" + e.getMessage().replace("%", "%%"));

                // Format: §8│ §7Spieler §8● §7Name §8➟ §fMSG
    }

}
