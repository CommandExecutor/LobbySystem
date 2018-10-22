package net.revace.lobbysystem.utils;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

public class Data {

    private static String prefix = "§8│ §a§lRevace §8×§7 ";
    private static String noPerm = prefix + "Sorry§c,§7aber du darfst das nicht!";

    public static String getPrefix() {
        return prefix;
    }

    public static String getNoPerm() { return noPerm; }

    public static class ItemData extends Data {

        private static String compassPrefix = "§aTeleporter §8× §7Rechtsklick";
        private static String profilePrefix = "§bProfil §8× §7Rechtsklick";
        private static String enterhakenPrefix = "§8● §7Enterhacken §a§8●";
        private static String hidePlayerPrefix = "§9Spieler Verstecken §8× §7Rechtsklick";
        private static String friendPrefix = "§eFreunde §8× §7Rechtsklick";


        public static String getCompassPrefix() { return compassPrefix; }
        public static String getProfilePrefix() { return profilePrefix; }
        public static String getEnterhakenPrefix() { return enterhakenPrefix; }
        public static String getHidePlayerPrefix() { return hidePlayerPrefix; }
        public static String getFriendPrefix() { return friendPrefix; }
    }

    public static class InventoryData extends Data {
        private static String compassTeleporterDisplay = "§8» §aTeleporter";
        private static String signDisplay = "§8» §aRevace.de §8«";
        private static String knockgameDisplay = "§8× §e§lKnockGame";
        private static String speedcoredDisplay = "§8× §3§lSpeedCores";
        private static String smashchestDisplay = "§8× §2§lSmashChest";
        private static String ffaDisplay = "§8× §9§lFFA";

        public static String getCompassTeleporterDisplay() { return compassTeleporterDisplay; }
        public static String getSignDisplay() { return signDisplay; }
        public static String getKnockgameDisplay() { return knockgameDisplay; }
        public static String getSpeedcoredDisplay() { return speedcoredDisplay; }
        public static String getSmashchestDisplay() { return smashchestDisplay; }
        public static String getFfaDisplay() { return ffaDisplay; }



    }

}
