package me.sheepbell.bombstick;

import me.sheepbell.bombstick.command.BombStickCommand;
import me.sheepbell.bombstick.listener.PlayerInteractListener;
import org.bukkit.plugin.java.JavaPlugin;

public class BombStick extends JavaPlugin {
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
    this.getCommand("bombstick").setExecutor(new BombStickCommand());
  }
}
