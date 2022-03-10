package me.xii69.bedwars1058cosmetics.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

    public static ItemStack createItem(String item, String name, String lorePath) {

        ItemStack itemStack = new ItemStack(Material.valueOf(item.toUpperCase()));
        ItemMeta itemMeta = itemStack.getItemMeta();
        List<String> lore = new ArrayList<>();
        List<String> list = new ArrayList<>(Utils.getStringList(lorePath));

        for (String string : list) {
            lore.add(Utils.colorize(string));
        }

        itemMeta.setDisplayName(Utils.colorize(name));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;

    }

}
