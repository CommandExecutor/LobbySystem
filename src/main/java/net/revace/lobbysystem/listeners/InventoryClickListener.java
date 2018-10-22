package net.revace.lobbysystem.listeners;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener {


    @EventHandler
    public void handleInvClick(InventoryClickEvent e){
        try {
            e.setCancelled(true);
        }catch (Exception ex){

        }
    }

}
