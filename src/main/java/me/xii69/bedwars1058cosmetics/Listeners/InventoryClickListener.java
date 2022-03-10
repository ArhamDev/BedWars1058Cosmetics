package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.GUI.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        if (event.getClickedInventory().getName().equals(GUI.getCosmeticsMenu().getTitle())) {

            if (event.getCurrentItem().equals(Items.deathCriesItem)) {
                event.setCancelled(true);
                player.closeInventory();
                GUI.openDeathCriesMenu(player);
            }

            if (event.getCurrentItem().equals(Items.bedBreakEffectsItem)) {
                event.setCancelled(true);
                player.closeInventory();
                GUI.openBedBreakEffectsMenu(player);
            }

            if (event.getCurrentItem().equals(Items.closeItem)) {
                event.setCancelled(true);
                player.closeInventory();
            }

        }

        if (event.getClickedInventory().getName().equals(GUI.getDeathCriesMenu().getTitle())) {
            if (event.getCurrentItem().equals(Items.backItem)) {
                event.setCancelled(true);
                player.closeInventory();
                GUI.openMainMenu(player);
            }
        }

        if (event.getClickedInventory().getName().equals(GUI.getBedBreakEffectsMenu().getTitle())) {
            if (event.getCurrentItem().equals(Items.backItem)) {
                event.setCancelled(true);
                player.closeInventory();
                GUI.openMainMenu(player);
            }
        }

    }

}
