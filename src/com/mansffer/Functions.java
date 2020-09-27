package com.mansffer;

import java.util.Arrays;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Functions {
	
	public static ItemStack item(Material m, String nome, String[] lore){
    ItemStack item = new ItemStack(m);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(nome);
    meta.setLore(Arrays.asList(lore));
    item.setItemMeta(meta);
    return item;
	}
	public static ItemStack item17(Material m, String nome, String[] lore){
    ItemStack item = new ItemStack(m);
    ItemMeta meta = item.getItemMeta();
    meta.setLore(Arrays.asList(lore));
    meta.setDisplayName(nome);
    item.setItemMeta(meta);
    return item;
  }
	@SuppressWarnings("deprecation")
	public static ItemStack skull(String nome, String dono, String[] lore){
    ItemStack item = new ItemStack(Material.SKULL_ITEM, 1);
    item.setDurability((short)3);
    SkullMeta skull = (SkullMeta)item.getItemMeta();
    skull.setDisplayName(nome);
    skull.setOwner(dono);
    skull.setLore(Arrays.asList(lore));
    item.setItemMeta(skull);
    return item;
     }
}