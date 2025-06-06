package com.naquackes.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class factions implements CommandExecutor,TabCompleter{
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args){
        Player player = (Player)commandSender;
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only Players Can use this command!");
            return true;
        }
        if(args.length==0){
             Location loc = new Location(Bukkit.getWorld("factions"),1906,71,1576);
            player.teleport(loc);
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lTeleporting to The Factions World! "));
            return true;
        }else if(args.length == 1 && args[0].equalsIgnoreCase("Astrolandia")){
            Location loc = new Location(Bukkit.getWorld("factions"),1906,71,1576);
            player.teleport(loc);
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lTeleporting to The Factions World! "));
            return true;
        }else if(args.length == 1 && args[0].equalsIgnoreCase("Duck_Kingdom")){
            Location loc = new Location(Bukkit.getWorld("factions"),1781,72,1433);
            player.teleport(loc);
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lTeleporting to The Factions World! "));
            return true;
        }else{
            return false;
        }
    }
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args){
        List<String> kingdoms = new ArrayList<>();
        kingdoms.add("Duck_kingdom");
        kingdoms.add("Astrolandia");
        return kingdoms;
    }
}
