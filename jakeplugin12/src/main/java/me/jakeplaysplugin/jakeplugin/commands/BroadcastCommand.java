package me.jakeplaysplugin.jakeplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Player p = (Player) sender;

        if (command.getName().equalsIgnoreCase("broadcast") || command.getName().equalsIgnoreCase("bc")) {
            if (args.length == 0) {
                player.sendMessage("§6[§4!§6] §fArgument Required, /broadcast <Message> ");

            } else if (args.length != 0) {
                String broadcastMsg = "";
                for (String a : args) {
                    broadcastMsg += a + " ";
                }
                Bukkit.broadcastMessage("§6[§4Broadcast§6] §a" + broadcastMsg);
            }
        }
        return true;
    }
}

