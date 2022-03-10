package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.Items;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    private static final int slot = Utils.getInt("on-join-items.slot") - 1;

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (Utils.getBoolean("on-join-items.enabled")) {
            event.getPlayer().getInventory().setItem(slot, Items.menuItem);
        }
    }

}
