package com.mansffer.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Events implements Listener{
	@EventHandler
	public void OnClick(InventoryClickEvent e) {
		if(e.getWhoClicked() instanceof Player) {
			Player p = (Player)e.getWhoClicked();
			if(e.getInventory().getTitle().equals("Capsulas")) {
				e.setCancelled(true);
				if(e.getCurrentItem().getItemMeta().getDisplayName().contains("ßeVisualizar Capsulas")) {
					if(e.getClick() == ClickType.RIGHT) {
						p.closeInventory();
						p.openInventory(Invs.OnPreview(p));
					}else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("ßeComprar Capsulas")) {
						if(e.getClick() == ClickType.RIGHT) {
							p.closeInventory();
							p.sendMessage("Voc  clicou");
							p.openInventory(Invs.OnBuy(p));
						}
					
				}}}}
		}
	@EventHandler
	public void OnClick2(InventoryClickEvent e) {
	if(e.getWhoClicked() instanceof Player) {
		Player p = (Player)e.getWhoClicked();
		if(e.getInventory().getTitle().equals("Capsulas - Preview")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("ßeVoltar")) {
				if(e.getClick() == ClickType.RIGHT) {
					p.closeInventory();
					p.openInventory(Invs.OnHome(p));
			}else if(e.getClick() == ClickType.LEFT) {
				p.closeInventory();
				p.openInventory(Invs.OnHome(p));
			}
      }}}
  }
	@EventHandler
	public void OnClick3(InventoryClickEvent e) {
		if(e.getWhoClicked() instanceof Player) {
			Player p = (Player)e.getWhoClicked();
			if(e.getInventory().getTitle().equals("Capsulas - Comprar")) {
				e.setCancelled(true);
				if(e.getCurrentItem().getItemMeta().getDisplayName().contains("ßeVoltar")) {
					if(e.getClick() == ClickType.RIGHT) {
						p.closeInventory();
						p.openInventory(Invs.OnHome(p));
					}else if(e.getClick() == ClickType.LEFT) {
						p.closeInventory();
						p.openInventory(Invs.OnHome(p));
					}
				}}}
		}
}