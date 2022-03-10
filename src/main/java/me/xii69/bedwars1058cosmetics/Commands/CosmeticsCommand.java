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

        Player player = (Player) sender;

        GUI.openMainMenu(player);

        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                if (player.hasPermission("bedwars1058cosmetics.reload")) {
                    Main.getInstance().reloadConfig();
                    player.sendMessage(Utils.getColorizedConfig("messages.reload"));
                } else {
                    player.sendMessage(Utils.getColorizedConfig("messages.no-permission"));
                }
            }
        }

        return false;

    }

}
