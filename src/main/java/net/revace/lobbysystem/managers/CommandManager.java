package net.revace.lobbysystem.managers;

import net.revace.lobbysystem.commands.SubCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    private static List<SubCommand> subCommands = new ArrayList<SubCommand>();

    public static void addSubCommand(SubCommand subCommand) {
        subCommands.add(subCommand);
    }

    public static void removeSubCommand(SubCommand subCommand) {
        subCommands.remove(subCommand);
    }

    public static List<SubCommand> getSubCommands() {
        return subCommands;
    }
}
