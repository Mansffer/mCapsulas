package com.mansffer.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.mansffer.Functions;

public class Items {
	
	public static ItemStack Beacon(){
		ItemStack item2 = Functions.item(Material.BEACON, "§eCapsula de Multiplos Efeitos", new String[] {""});
		return item2;
	}
	public static ItemStack Speed(){
		ItemStack item2 = Functions.item(Material.STONE, "§eCapsula de Velocidade", new String[] {""});
		return item2;
	}
	public static ItemStack Force(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Força", new String[] {""});
		return item2;
	}
	public static ItemStack Fly(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Voo", new String[] {""});
		return item2;}
	public static ItemStack Jump(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Super Pulo", new String[] {""});
		return item2;
	}
	public static ItemStack Regen(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Regeneração", new String[] {""});
		return item2;
	}
	public static ItemStack Life(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Vida extra", new String[] {""});
		return item2;
	}
	public static ItemStack Night(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Visão Noturna", new String[] {""});
		return item2;
	}
	public static ItemStack Fire(){
		ItemStack item2 = Functions.item17(Material.STONE, "§eCapsula de Proteção contra Fogo", new String[] {""});
		return item2;
	}
	public static ItemStack Storage(){
		ItemStack item2 = Functions.item17(Material.CHEST, "§eArmazem de Capsulas", new String[] {""});
		return item2;
	}
	public static ItemStack Dev(){
		ItemStack item2 = Functions.skull("§c[Dev] §fMansffer", "Mansffer", new String[] {""});
		return item2;
	}
	public static ItemStack UserSkull(Player p){
		ItemStack skull2 = Functions.skull("Â§eArmazenamento do(a) " + p.getName(), p.getName(), new String[] {"VocÃª Possui " + " Capsulas", "Seu clan possui " + " Capsulas"});
		return skull2;
	}
	public static ItemStack Back() {
		ItemStack item2 = Functions.item17(Material.FEATHER, "§eVoltar", new String[] {""});
		return item2;
	}
	public static ItemStack Next() {
		ItemStack item2 = Functions.item17(Material.ARROW, "§eProximo", new String[] {"§fClique com o botão direito", "§fPara ir para a proxima página"});
		return item2;
	}
	public static ItemStack Previw() {
		ItemStack item2 = Functions.item17(Material.REDSTONE_BLOCK, "§eVisualizar Capsulas", new String[] {"§fClique com o botão direito", "§fPara voltar a página anterior"});
		return item2;
	}
	public static ItemStack Buy() {
		ItemStack item2 = Functions.item17(Material.EMERALD, "§eComprar Capsulas", new String[] {""});
		return item2;
	}
}