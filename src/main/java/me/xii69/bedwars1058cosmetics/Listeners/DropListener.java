package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class DropListener implements Listener {

    private final ItemStack itemStack = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"), Utils.getColorizedConfig("on-join-items.name"), "on-join-items.lore");

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        if (event.getItemDrop().getItemStack().equals(itemStack)) {
            event.setCancelled(true);
        }
    }

}
