package net.revace.lobbysystem.tasks;

import net.revace.lobbysystem.utils.Data;
import net.revace.lobbysystem.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;

public class TeleporterTask extends BukkitRunnable {

    private Player player;
    private Inventory inventory;
    private boolean running;

    private int countdownFrames = 7;

    public TeleporterTask(Player player, Inventory inventory) {
        this.player = player;
        this.inventory = inventory;
    }

    @Override
    public void run() {

        if(!player.getInventory().getTitle().equals(Data.InventoryData.getCompassTeleporterDisplay())) {
            cancel();
            running = false;
            player.playSound(player.getLocation(), Sound.CHEST_CLOSE, 5, 2f);
            return;
        }

        this.running = true;

        player.playSound(player.getLocation(), Sound.NOTE_STICKS, 5, 5);

        switch (countdownFrames) {
            case 7:
                inventory.setItem(4, new ItemBuilder(Material.SIGN, 1, (byte) 0).setDisplayname(Data.InventoryData.getSignDisplay()).build());
                break;
            case 6:
                inventory.setItem(10, new ItemBuilder(Material.STICK, 1, (byte) 0).setDisplayname(Data.InventoryData.getKnockGameDisplay()).build());
                break;
            case 5:
                inventory.setItem(16, new ItemBuilder(Material.BEACON, 1, (byte) 0).setDisplayname(Data.InventoryData.getSpeedCoreDisplay()).build());
                break;
            case 4:
                inventory.setItem(20, new ItemBuilder(Material.SEA_LANTERN, 1, (byte) 0).setDisplayname(Data.InventoryData.getSmashChestDisplay()).build());
                break;
            case 3:
                inventory.setItem(24, new ItemBuilder(Material.WOOD_SWORD, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).build());
                break;
            case 2:
                inventory.setItem(24, new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).build());
                break;
            case 1:
                inventory.setItem(24, new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).build());
                break;
            case 0:
                inventory.setItem(24, new ItemBuilder(Material.RECORD_8, 1, (byte) 0).setDisplayname(Data.InventoryData.getFfaDisplay()).build());
                break;
        }

        if(countdownFrames > 0)
            countdownFrames--;
        else {
            cancel();
            this.running = false;
        }

    }

    public Inventory getInventory() {
        return inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isRunning() {
        return running;
    }
}
