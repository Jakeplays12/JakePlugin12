package me.jakeplaysplugin.jakeplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class checklist implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!(sender instanceof Player)) {
            sender.sendMessage("§4[§cPlugin§4] §fOnly Players can use this command.");
            return true;

            }if (command.getName().equalsIgnoreCase("checklist")) {
                sender.sendMessage("     §2-§a=§f+§3=§1- §f§lCheck List §2-§a=§f+§3=§1-");
                sender.sendMessage("§2✔ §f/Heal.");
                sender.sendMessage("§2✔ §f/Feed.");
                sender.sendMessage("§6✔ §f/GUI + Fix The Message.");
                sender.sendMessage("§4❌ §f/Vanish. (Not working)");
                sender.sendMessage("§2✔ §f/Broadcast.");
                sender.sendMessage("§2✔ §f/Fly.");
                sender.sendMessage("§2✔ §f/gmc, /gms, /gmsp.");
                sender.sendMessage("§4❌ §f/Hug.");
                sender.sendMessage("§4❌ §fCustom Scoreboard.");
                sender.sendMessage("§4❌ §fRanks That show in chat + Scoreboard.");
                sender.sendMessage("§6✔ §fColor Code CMD (/colors), tells the player color codes.");
                sender.sendMessage("§4❌ §fRandom TP.");
                sender.sendMessage("§4❌ §fPermissions");








        }
        return true;
        }

    }

