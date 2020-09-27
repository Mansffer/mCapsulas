package com.mansffer.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.mansffer.items.Items;

public class Invs {
	public static Inventory OnPreview(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "Capsulas - Preview");
		
		inv.setItem(11, Items.Beacon());
		inv.setItem(12, Items.Fire());
		inv.setItem(13, Items.Fly());
		inv.setItem(14, Items.Force());
		inv.setItem(15, Items.Jump());
		inv.setItem(20, Items.Life());
		inv.setItem(21, Items.Night());
		inv.setItem(22, Items.Regen());
		inv.setItem(23, Items.Speed());
		inv.setItem(28, Items.Dev());
		inv.setItem(4, Items.UserSkull(p));
		inv.setItem(45, Items.Back());
		
		
		p.openInventory(inv);
		return inv;
	}
	public static Inventory OnMulti(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "");
		
		p.openInventory(inv);
		return inv;
	}
	public static Inventory OnBuy(Player p){
		Inventory inv = Bukkit.createInventory(null, 6*9, "Capsulas - Comprar");
		
		inv.setItem(11, Items.Beacon());
		inv.setItem(12, Items.Fire());
		inv.setItem(13, Items.Fly());
		inv.setItem(14, Items.Force());
		inv.setItem(15, Items.Jump());
		inv.setItem(20, Items.Life());
		inv.setItem(21, Items.Night());
		inv.setItem(22, Items.Regen());
		inv.setItem(23, Items.Speed());
		inv.setItem(4, Items.UserSkull(p));
		inv.setItem(45, Items.Back());
		
		p.openInventory(inv);
		return inv;
	}
	public static Inventory OnHome(Player p){
		Inventory inv = Bukkit.createInventory(null, 3*9, "Capsulas");
		
		inv.setItem(4, Items.UserSkull(p));
		inv.setItem(3, Items.Storage());
		inv.setItem(5, Items.Previw());
		inv.setItem(6, Items.Buy());
		
		p.openInventory(inv);
		return inv;
	}
}