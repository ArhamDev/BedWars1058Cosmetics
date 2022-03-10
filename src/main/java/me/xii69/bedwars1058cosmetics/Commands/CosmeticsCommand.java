package me.xii69.bedwars1058cosmetics.Commands;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.Main;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CosmeticsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            sender.sendMessage(Utils.getColorizedConfig("messages.not-enough-arguments"));
            return false;
        }
        switch (args[0]) {
            case "reload":
                if (sender.hasPermission("bedwars1058cosmetics.reload")) {
                    Main.getInstance().reloadConfig();
                    sender.sendMessage(Utils.getColorizedConfig("messages.reload"));
                }
                break;
            case "menu":
                if (sender instanceof Player) {
                    GUI.openMainMenu((Player) sender);
                } else {
                    sender.sendMessage(Utils.getColorizedConfig("messages.invalid-executor"));
                    return false;
                }
                break;
            default:
                sender.sendMessage(Utils.getColorizedConfig("messages.unknown-argument"));
                break;
        }
        return true;
    }

}
