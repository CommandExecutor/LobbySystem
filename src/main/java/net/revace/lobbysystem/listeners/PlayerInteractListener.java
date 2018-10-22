package net.revace.lobbysystem.listeners;

import net.revace.lobbysystem.inventorys.TeleporterInventory;
import net.revace.lobbysystem.utils.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void handleInteract(PlayerInteractEvent e){
        final Player player = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){

            if(e.getItem().getItemMeta().getDisplayName().equals(Data.ItemData.getCompassPrefix())) {
                TeleporterInventory teleporterInventory = new TeleporterInventory(player);
                teleporterInventory.open();
            }

        }
    }
}
