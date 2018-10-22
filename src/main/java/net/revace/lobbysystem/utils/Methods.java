package net.revace.lobbysystem.utils;

import net.revace.lobbysystem.LobbySystem;

public class Methods {

    public static void releaseConfig() {
        LobbySystem.getInstance().getConfigManager().saveConfig();
    }

}
