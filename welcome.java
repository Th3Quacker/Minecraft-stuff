package com.naquackes;

import java.util.logging.Logger;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
/*
 * welcome java plugin
 */
public class Plugin extends JavaPlugin implements Listener
{
  private static final Logger LOGGER=Logger.getLogger("welcome");
  @Override
  public void onEnable()
  {
    LOGGER.info("welcome enabled");
    getServer().getPluginManager().registerEvents(this, this);
  }
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event){
    Random rand = new Random();
    int random_welcome = rand.nextInt(3);
    Player player = event.getPlayer();
    if (random_welcome == 1){
      event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ "Please welcome "+ player.getName()));
    }else if (random_welcome == 2) {
      event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ "The "+ player.getName() + " is here!"));
    } else {
      event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ player.getName()+" is now here"));
    }
  }
  public void onPlayerLeave(PlayerQuitEvent event){
    Random rand = new Random();
    int random_Goodbye = rand.nextInt(3);
    Player player = event.getPlayer();
    if (random_Goodbye == 1){
      event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ "The "+ player.getName() + " has left!"));
    }else if (random_Goodbye == 2) {
      event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ "Sad to see you go, "+ player.getName()));
    } else {
      event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&5&l"+ "Say good by to The "+ player.getName() ));
    }
  }
  public void onDisable()
  {
    LOGGER.info("welcome disabled");
  }
}
