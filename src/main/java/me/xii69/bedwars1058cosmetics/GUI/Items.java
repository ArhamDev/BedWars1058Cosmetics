package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.inventory.ItemStack;

public class Items {

    public static ItemStack menuItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"),
            Utils.getColorizedConfig("on-join-items.name"),
            "on-join-items.lore"
    );

    public static ItemStack closeItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.close.item"),
            Utils.getColorizedConfig("CosmeticsMenu.items.close.name"),
            "CosmeticsMenu.items.close.lore"
    );

    public static ItemStack backItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.back.item"),
            Utils.getColorizedConfig("CosmeticsMenu.items.back.name"),
            "CosmeticsMenu.items.back.lore"
    );

    public static ItemStack deathCriesItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.deathCries.item"),
            Utils.getColorizedConfig("CosmeticsMenu.items.deathCries.name"),
            "CosmeticsMenu.items.deathCries.lore"
    );

    public static ItemStack bedBreakEffectsItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.bedBreakEffects.item"),
            Utils.getColorizedConfig("CosmeticsMenu.items.bedBreakEffects.name"),
            "CosmeticsMenu.items.bedBreakEffects.lore"
    );

}
