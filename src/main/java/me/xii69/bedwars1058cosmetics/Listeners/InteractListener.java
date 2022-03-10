package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.GUI.Items;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {

        if (event.getItem().equals(Items.menuItem)) {
            GUI.openMainMenu(event.getPlayer());
        }

    }

}
