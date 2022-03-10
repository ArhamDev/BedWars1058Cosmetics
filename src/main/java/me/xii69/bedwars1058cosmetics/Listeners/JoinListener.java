package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    private final int slot = Utils.getInt("on-join-items.slot") - 1;
    private final ItemStack itemStack = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"), Utils.getColorizedConfig("on-join-items.name"), "on-join-items.lore");

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (Utils.getBoolean("on-join-items.enabled")) {
            player.getInventory().setItem(slot, itemStack);
        }

    }

}
