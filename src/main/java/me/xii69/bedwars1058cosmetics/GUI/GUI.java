package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GUI {

    static Inventory cosmeticsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("CosmeticsMenu.title"));
    static Inventory deathCriesMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("DeathCriesMenu.title"));
    static Inventory bedBreakEffectsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("BedBreakEffectsMenu.title"));

    public static void openMainMenu(Player player) {
        cosmeticsMenu.setItem(21, Items.bedBreakEffectsItem);
        cosmeticsMenu.setItem(23, Items.deathCriesItem);
        cosmeticsMenu.setItem(40, Items.closeItem);
        player.openInventory(cosmeticsMenu);
    }

    public static void openDeathCriesMenu(Player player) {
        deathCriesMenu.setItem(40, Items.backItem);
        player.openInventory(deathCriesMenu);
    }

    public static void openBedBreakEffectsMenu(Player player) {
        bedBreakEffectsMenu.setItem(40, Items.backItem);
        player.openInventory(bedBreakEffectsMenu);
    }

    public static Inventory getCosmeticsMenu() {
        return cosmeticsMenu;
    }

    public static Inventory getDeathCriesMenu() {
        return deathCriesMenu;
    }

    public static Inventory getBedBreakEffectsMenu() {
        return bedBreakEffectsMenu;
    }

}
