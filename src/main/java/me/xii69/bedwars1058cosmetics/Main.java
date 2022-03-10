package me.xii69.bedwars1058cosmetics;

import me.xii69.bedwars1058cosmetics.Commands.CosmeticsCommand;
import me.xii69.bedwars1058cosmetics.Listeners.DropListener;
import me.xii69.bedwars1058cosmetics.Listeners.InteractListener;
import me.xii69.bedwars1058cosmetics.Listeners.InventoryClickListener;
import me.xii69.bedwars1058cosmetics.Listeners.JoinListener;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Plugin plugin;
    // public static BedWars bedwars;

    @Override
    public void onEnable() {
        plugin = this;
        // initializeBedWars1058();
        saveDefaultConfig();
        registerCommands();
        registerListeners();
        // bedwars = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public void registerCommands() {
        getCommand("bwc").setExecutor(new CosmeticsCommand());
        getCommand("cosmetics").setExecutor(new CosmeticsCommand());
        getCommand("bwcosmetics").setExecutor(new CosmeticsCommand());
        getCommand("bedwars1058cosmetics").setExecutor(new CosmeticsCommand());
    }

    public void registerListeners() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new DropListener(), this);
        getServer().getPluginManager().registerEvents(new InteractListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    public void initializeBedWars1058() {
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
            Utils.log("&c- - - - - - - - - - - - - - - - - - - - - -");
            Utils.log("&c-        BedWars1058 not found!           -");
            Utils.log("&c- Make sure you have installed the plugin -");
            Utils.log("&c-     Disabling &bBedWars1058Cosmetics      &c-");
            Utils.log("&c- - - - - - - - - - - - - - - - - - - - - -");
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    public static Plugin getInstance() {
        return plugin;
    }

}
