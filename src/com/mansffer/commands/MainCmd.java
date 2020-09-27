package com.mansffer.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.mansffer.inventory.Invs;

public class MainCmd implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage("§cComando apenas para jogadores!");
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("capsulas")) {
			if(args.length == 0) {
			p.sendMessage("§aAbrindo o inventario");
			p.openInventory(Invs.OnHome(p));
		}else if(args.length > 0) {
			if(args.length == 1 && args[0].equalsIgnoreCase("info")) {
				p.openInventory(Invs.OnBuy(p));
			}}
		}
		return false;
	}

}
