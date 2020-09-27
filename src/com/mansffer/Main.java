package com.mansffer;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.mansffer.commands.MainCmd;
import com.mansffer.inventory.Events;


public class Main extends JavaPlugin {
	
	public void onEnable(){
		checkUpdate();
		getCommand("capsulas").setExecutor(new MainCmd());
		Bukkit.getPluginManager().registerEvents(new Events(), this);
		Bukkit.getConsoleSender().sendMessage("§a------------------------");
		Bukkit.getConsoleSender().sendMessage("§fPlugin Ativado!");
		Bukkit.getConsoleSender().sendMessage("§fObrigado por comprar!");
		Bukkit.getConsoleSender().sendMessage("§a------------------------");
	}
	public void onLoad(){
		Bukkit.getConsoleSender().sendMessage("§6Carregando recursos");
	}
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§c------------------------");
		Bukkit.getConsoleSender().sendMessage("§fDesativando Plugin");
		Bukkit.getConsoleSender().sendMessage("§fThanks for Using");
		Bukkit.getConsoleSender().sendMessage("§c------------------------");
	   }
	
	public void checkUpdate(){
        String version = this.getDescription().getVersion();

        try {
            /*Abrindo conexão*/
            URL url = new URL("https://api.github.com/repos/Mansffer/mCapsulas/releases/latest");
            URLConnection connection = url.openConnection();

            //Convertendo dados
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.lines().collect(Collectors.joining("\n"));

            //Lendo dados
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(response);
            String latestVersion = (String) jsonObject.get("tag_name");

            if (version != latestVersion){
                System.out.println("§aUma nova versão esta disponível");
 
            }

        } catch (Exception e) {
            System.out.println("§cNão foi possível verificar atualizações");
        }
    }
}