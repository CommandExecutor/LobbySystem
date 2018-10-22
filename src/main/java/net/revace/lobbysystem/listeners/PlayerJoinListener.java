package net.revace.lobbysystem.listeners;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import net.revace.lobbysystem.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void handleJoin(final PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.getInventory().setItem(0, new ItemBuilder(Material.COMPASS, 1, (byte)0).setDisplayname("§aTeleporter §8× §7Rechtsklick").build());

        player.getInventory().setItem(1, new ItemBuilder(Material.REDSTONE_COMPARATOR, 1, (byte)0).setDisplayname("§bProfil §8× §7Rechtsklick").build());

        player.getInventory().setItem(4, new ItemBuilder(Material.FISHING_ROD, 1, (byte)0).setDisplayname("§8● §7Enterhacken *a§8●").build());

        player.getInventory().setItem(7, new ItemBuilder(Material.PISTON_BASE, 1, (byte)0).setDisplayname("§9Spieler Verstecken §8× §7Rechtsklick").build());

        player.getInventory().setItem(8, new ItemBuilder(Material.SKULL_ITEM, 1, (byte)0).setDisplayname("§eFreunde §8× §7Rechtsklick").setOwner(player.getName()).build());


    }

}
