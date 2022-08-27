package me.jakeplaysplugin.jakeplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class colors implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!(sender instanceof Player) || command.getName().equalsIgnoreCase("format")) {
            sender.sendMessage("§4[§cPlugin§4] §fOnly Players can use this command.");
            return true;

        }if (command.getName().equalsIgnoreCase("colors")) {

            sender.sendMessage("============================");
            sender.sendMessage("§0&0 = Black");
            sender.sendMessage("§1&1 = Dark Blue");
            sender.sendMessage("§2&2 = Dark Green");
            sender.sendMessage("§3&3 = Dark Aqua");
            sender.sendMessage("§4&4 = Dark Red");
            sender.sendMessage("§5&5 = Dark Purple");
            sender.sendMessage("§6&6 = Gold");
            sender.sendMessage("§7&7 = Gray");
            sender.sendMessage("§8&8 = Dark Gray");
            sender.sendMessage("§9&9 = Blue");
            sender.sendMessage("§a&a = Green");
            sender.sendMessage("§b&b = Aqua");
            sender.sendMessage("§c&c = Red");
            sender.sendMessage("§d&d = Light Purple");
            sender.sendMessage("§e&e = Yellow");
            sender.sendMessage("§f&F = White");
            sender.sendMessage("============================");
            sender.sendMessage("&k§r = §kObfuscated");
            sender.sendMessage("§l&l§r = §lBold");
            sender.sendMessage("§m&m§r = §mStrikethrough");
            sender.sendMessage("§n&n§r = §nUnderline");
            sender.sendMessage("§o&o§r = §oItalic");
            sender.sendMessage("§r&r = Reset");
            sender.sendMessage("============================");










        }
        return true;
    }

}

