package me.jakeplaysplugin.jakeplugin.commands;


import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;


public class GamemodeCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Player player = (Player) sender;


        if (!(sender instanceof Player)) {
            sender.sendMessage("§4[§cPlugin§4] §fOnly Players can use this command.");
            return true;


        }
        if (command.getName().equalsIgnoreCase("gmc")) {
            sender.sendMessage("§7Your Gamemode Is Now Creative.");
            p.setGameMode(GameMode.CREATIVE);

        } else if (command.getName().equalsIgnoreCase("gms")) {
            sender.sendMessage("§7Your Gamemode Is Now Survival.");
            p.setGameMode(GameMode.SURVIVAL);

        } else if (command.getName().equalsIgnoreCase("gmsp")) {
            sender.sendMessage("§7Your Gamemode Is Now Spectator.");
            p.setGameMode(GameMode.SPECTATOR);

        }

        return true;

    }}