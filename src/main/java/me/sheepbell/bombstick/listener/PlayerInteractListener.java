package me.sheepbell.bombstick.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractListener implements Listener {
  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent event) {
    Player player = event.getPlayer();
    ItemStack activeItem = player.getInventory().getItemInMainHand();
    if (activeItem.getType() == Material.STICK) {
        player.getLocation().createExplosion(10);
    }
  }
}
