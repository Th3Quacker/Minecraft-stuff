package com.naquackes.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class build implements CommandExecutor{
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){
        Player player = (Player)commandSender;
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only Players Can use this command!");
            return true;
        }
        Location loc = new Location(Bukkit.getWorld("duck_kingdom"),0,-60,0);
        player.teleport(loc);
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lTeleporting to Regular World "));
        return true;
    }
}
