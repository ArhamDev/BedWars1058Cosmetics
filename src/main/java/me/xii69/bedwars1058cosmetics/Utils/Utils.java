package me.xii69.bedwars1058cosmetics.Utils;

import me.xii69.bedwars1058cosmetics.Main;
import org.bukkit.ChatColor;

import java.util.List;

public class Utils {

    public static String colorize(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static Integer getInt(String path) {
        return Main.getInstance().getConfig().getInt(path);
    }

    public static String getConfig(String path) {
        return Main.getInstance().getConfig().getString(path);
    }

    public static Boolean getBoolean(String path) {
        return Main.getInstance().getConfig().getBoolean(path);
    }

    public static String getColorizedConfig(String path) {
        return colorize(getConfig(path));
    }

    public static List<String> getStringList(String path) {
        return Main.getInstance().getConfig().getStringList(path);
    }

    public static void log(String text) {
        Main.getInstance().getServer().getConsoleSender().sendMessage(colorize(text));
    }

}
