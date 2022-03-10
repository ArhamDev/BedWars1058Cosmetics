package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUI {

    static Inventory gui = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("CosmeticsMenu.title"));
    static ItemStack closeItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.close.item"),
            Utils.getColorizedConfig("CosmeticsMenu.items.close.name"),
            "CosmeticsMenu.items.close.lore"
    );

    public static void openGUI(Player player) {
        gui.setItem(40, closeItem);
        player.openInventory(gui);
    }

    public static ItemStack getCloseItem() {
        return closeItem;
    }

    public static Inventory getGUI() {
        return gui;
    }

}
