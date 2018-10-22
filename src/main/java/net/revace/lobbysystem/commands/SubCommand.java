package net.revace.lobbysystem.commands;

import org.bukkit.command.CommandSender;

public abstract class SubCommand {

    /**
     *
     * @param command
     * @param syntax
     * @param description
     *
     * ## Anleitung der übergabe ##
     * command > "sub" [*]
     * syntax > "<?>"
     * description > "Testcommand"
     */

    private String command;
    private String syntax;
    private String description;

    public SubCommand(String command, String syntax, String description) {

    }

    public SubCommand(String command, String syntax) {

    }

    public SubCommand(String command) {

    }

    public abstract void executeCommand(CommandSender commandSender, String[] args);

}
