package me.jakeplaysplugin.jakeplugin.commands;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {


    private ArrayList<Player> list_of_flying_players = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!(sender instanceof Player)) {
            sender.sendMessage("§4[§cPlugin§4] §fOnly Players can use this command.");
            return true;

        }  if (command.getName().equalsIgnoreCase("fly")) {
        if (args.length == 0) {
            flymethod(player);

        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            flymethod(target);

        }


        }

        return true;

    }

    private void flymethod(Player player) {
        if (list_of_flying_players.contains(player)) {
            player.setAllowFlight(false);
            player.sendMessage("§4[§cPlugin§4]§f Fly is now §4Disabled.");
            list_of_flying_players.remove(player);

        } else if (!list_of_flying_players.contains(player)) {
            list_of_flying_players.add(player);
            player.setAllowFlight(true);
            player.sendMessage("§4[§cPlugin§4]§f Fly is now §2Enabled.");
        }
    }
}