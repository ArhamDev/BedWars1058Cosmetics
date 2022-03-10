package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

    private final ItemStack itemStack = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"), Utils.getColorizedConfig("on-join-items.name"), "on-join-items.lore");

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        if (event.getCurrentItem().equals(itemStack)) {
            event.setCancelled(true);
        }

        if (event.getCurrentItem().equals(GUI.getCloseItem())) {
            event.getWhoClicked().closeInventory();
            event.setCancelled(true);
        }

    }

}
