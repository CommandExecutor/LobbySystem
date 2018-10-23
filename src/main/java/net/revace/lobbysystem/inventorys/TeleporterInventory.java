package net.revace.lobbysystem.inventorys;

import net.revace.lobbysystem.LobbySystem;
import net.revace.lobbysystem.tasks.TeleporterTask;
import net.revace.lobbysystem.utils.Data;
import net.revace.lobbysystem.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TeleporterInventory {

    private Player player;
    private Inventory inventory;

    public TeleporterInventory(Player player) {
        this.player = player;
        this.inventory = Bukkit.createInventory(player, 6*9, Data.InventoryData.InventoryData.getCompassTeleporterDisplay());
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Player getPlayer() {
        return player;
    }

    private void init() {
        inventory.setItem(0, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(1, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(2, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(6, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(7, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(8, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(12, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(13, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(14, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(36, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(37, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(38, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(42, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(43, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(44, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(38, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(49, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(50, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(29, new ItemBuilder(Material.WOOD_BUTTON, 1, (byte) 7).setDisplayname("").build());
        inventory.setItem(35, new ItemBuilder(Material.WOOD_BUTTON, 1, (byte) 7).setDisplayname("").build());

        TeleporterTask teleporterTask = new TeleporterTask(player, this.inventory);
        teleporterTask.runTaskTimerAsynchronously(LobbySystem.getInstance(), 5, 5);

        player.playSound(player.getLocation(), Sound.CHEST_OPEN, 5f, 2f);
    }

    public void open() {
        init();
        this.player.openInventory(this.inventory);
    }
}
