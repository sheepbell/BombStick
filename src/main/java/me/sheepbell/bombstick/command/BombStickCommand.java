package me.sheepbell.bombstick.command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class BombStickCommand implements CommandExecutor {
  @Override
  public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
    if (sender instanceof Player player) {
      player.getInventory().addItem(getBombStickItemStack());
      player.sendMessage(Component.text("BOMB STICK"));
      return true;
    }
    return false;
  }

  private ItemStack getBombStickItemStack() {
    ItemStack itemStack = new ItemStack(Material.STICK);
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.displayName(Component.text("BOMB STICK", NamedTextColor.AQUA));
    itemStack.setItemMeta(itemMeta);
    return itemStack;
  }
}
