package net.revace.lobbysystem.utils;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

public class Data {

    private static String prefix = "§8│ §a§lRevace §8×§7 ";
    private static String noPerm = prefix + "§cDu hast keine Rechte.";

    public static String getPrefix() {
        return prefix;
    }

    public static String getNoPerm() { return noPerm; }

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

}
