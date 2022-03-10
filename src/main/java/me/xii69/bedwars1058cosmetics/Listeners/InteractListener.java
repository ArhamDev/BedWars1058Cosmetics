package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class InteractListener implements Listener {

    private final ItemStack itemStack = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"), Utils.getColorizedConfig("on-join-items.name"), "on-join-items.lore");

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {

        if (event.getItem().equals(itemStack)) {
            GUI.openGUI(event.getPlayer());
        }

    }

}
