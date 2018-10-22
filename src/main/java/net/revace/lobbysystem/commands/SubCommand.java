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
        this.command = command;
        this.syntax = syntax;
        this.description = description;
    }

    public SubCommand(String command, String syntax) {
        this.command = command;
        this.syntax = syntax;
    }

    public SubCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public String getSyntax() {
        return syntax;
    }

    public String getDescription() {
        return description;
    }

    public abstract void executeCommand(CommandSender commandSender, String[] args);

}
