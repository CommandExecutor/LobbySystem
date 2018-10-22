package net.revace.lobbysystem.utils;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static String prefix = "§8│ §a§lRevace §8×§7 ";
    private static String noPerm = prefix + "§cDu hast keine Rechte.";
    private static String notOnline = prefix + "§cDer Spieler ist nicht Online.";
    private static String commandNotFound = prefix + "§cBefehl wurde nicht gefunden.";
    private static String notValidNumber = prefix + "§cBitte nutze gültige Zahlen.";

    public static String getPrefix() { return prefix; }

    public static String getNoPerm() { return noPerm; }

    public static String getCommandNotFound() { return commandNotFound; }

    public static String getNotOnline() { return notOnline; }

    public static String getNotValidNumber() { return notValidNumber; }

    public static class ItemData extends Data {
        private static String compassPrefix = "§aTeleporter §8× §7Rechtsklick";
        private static String profilePrefix = "§bProfil §8× §7Rechtsklick";
        private static String enterhakenPrefix = "§8● §7Enterhacken *a§8●";
        private static String hidePlayerPrefix = "§9Spieler Verstecken §8× §7Rechtsklick";
        private static String friendPrefix = "§eFreunde §8× §7Rechtsklick";

        public static String getCompassPrefix() { return compassPrefix; }
        public static String getProfilePrefix() { return profilePrefix; }
        public static String getEnterhakenPrefix() { return enterhakenPrefix; }
        public static String getHidePlayerPrefix() { return hidePlayerPrefix; }
        public static String getFriendPrefix() { return friendPrefix; }
    }

    public static class InventoryData extends Data {
        private static String compassTeleporterDisplay = "";

        public static String getCompassTeleporterDisplay() {
            return compassTeleporterDisplay;
        }
    }

    public static class PlayerData extends Data {
        private static List<Player> buildPlayers = new ArrayList<>();

        public static List<Player> getBuildPlayers() {
            return buildPlayers;
        }
    }

    public enum ValidGames {
        KNOCKGAME("§e§lKnockGame", "KnockGame", 10), SPEEDCORES("§3§lSpeedCores", "SpeedCores", 16), SMASHCHEST("§2§lSmashChest", "SmashChest", 20), FFA("§9§lFFA", "FFA", 24);

        private String prefix, name;
        private int slot;

        ValidGames(String prefix, String name, int slot) {
            this.prefix = prefix;
            this.slot = slot;
            this.name = name;
        }

        public String getPrefix() {
            return prefix;
        }

        public String getName() {
            return name;
        }

        public int getSlot() {
            return slot;
        }

        public static int getSlotByPrefix(String name) {
            for(ValidGames i : values()) {
                if(i.prefix.equals(name))
                    return i.slot;
            }
            return -1;
        }

        public static int getSlotByName(String name) {
            for(ValidGames i : values()) {
                if(i.name.toLowerCase().equals(name))
                    return i.slot;
            }
            return -1;
        }


        public static boolean gameExists(String gameName) {
            for(ValidGames i : values()) {
                if(i.name.toLowerCase().equals(gameName))
                    return true;
            }
            return false;
        }
    }

}
