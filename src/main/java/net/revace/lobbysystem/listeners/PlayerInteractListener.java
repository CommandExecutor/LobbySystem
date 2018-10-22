package net.revace.lobbysystem.listeners;

import net.revace.lobbysystem.LobbySystem;
import net.revace.lobbysystem.utils.Data;
import net.revace.lobbysystem.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class PlayerInteractListener implements Listener {


    @EventHandler
    public void handleInteract(PlayerInteractEvent e){
        final Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK){
            if(p.getItemInHand() != null){
                if(p.getItemInHand().getItemMeta() != null){
                    if(p.getItemInHand().getItemMeta().getDisplayName() != null){
                        if(p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(Data.ItemData.getCompassPrefix())){
                            final Inventory inv = Bukkit.createInventory(null , 9*6, Data.InventoryData.getCompassTeleporterDisplay());
                            inv.setItem(0, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(1, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(2, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(6, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(7, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(8, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(12, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(13, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(14, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(36, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(37, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(38, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(42, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(43, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(44, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(38, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(49, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(50, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(29, new ItemBuilder(Material.WOOD_BUTTON, 1, (byte) 7).setDisplayname("").build());
                            inv.setItem(35, new ItemBuilder(Material.WOOD_BUTTON, 1, (byte) 7).setDisplayname("").build());

                            p.openInventory(inv);
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 5, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                public void run() {
                                    inv.setItem(4, new ItemBuilder(Material.SIGN, 1, (byte) 0).setDisplayname(Data.InventoryData.getSignDisplay()).build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(10, new ItemBuilder(Material.STICK, 1, (byte) 0).setDisplayname(Data.InventoryData.getKnockgameDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(16, new ItemBuilder(Material.BEACON, 1, (byte) 0).setDisplayname(Data.InventoryData.getSpeedcoredDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(20, new ItemBuilder(Material.SEA_LANTERN, 1, (byte) 0).setDisplayname(Data.InventoryData.getSmashchestDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(24, new ItemBuilder(Material.WOOD_SWORD, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(24, new ItemBuilder(Material.WOOD_SWORD, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);

                            Bukkit.getScheduler().runTaskLater(LobbySystem.getInstance(), new Runnable() {
                                @Override
                                public void run() {
                                    inv.setItem(32, new ItemBuilder(Material.RECORD_8, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).setLore("ONLINE SPIELER").build());
                                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 5, 5);
                                }
                            }, 5);


                        }
                    }
                }
            }
        }
    }
}
