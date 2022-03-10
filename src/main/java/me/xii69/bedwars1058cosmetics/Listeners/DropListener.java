package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.Items;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropListener implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        if (event.getItemDrop().getItemStack().equals(Items.menuItem)) {
            event.setCancelled(true);
        }
    }

}
