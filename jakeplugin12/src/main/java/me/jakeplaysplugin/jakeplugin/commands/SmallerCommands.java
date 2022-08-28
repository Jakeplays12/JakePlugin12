package me.jakeplaysplugin.jakeplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.security.Permission;

public class SmallerCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§4[§cPlugin§4] §fOnly Players can use this command.");
            return true;
        }
        Player player = (Player) sender;
        Player p = (Player) sender;

        // /Heal

        if (command.getName().equalsIgnoreCase("heal")) {

            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            sender.sendMessage("§4[§cPlugin§4] §fYou have been Healed and been fed!");
            player.setFoodLevel(20);
            return true;
        } else if (command.getName().equalsIgnoreCase("feed")) {

            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            sender.sendMessage("§4[§cPlugin§4] §fYou have been fed!");
            player.setFoodLevel(20);


        }

        return true;
    }
}
