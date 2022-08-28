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

//          ARGS

        } else if (args.length == 1) {
            String PlayerName = args[0];
            Player target = Bukkit.getServer().getPlayerExact(PlayerName);
            if (target == null){
                sender.sendMessage("§8[§4!§8]§f §6Error, Player not found.");
            }else{
                    if (list_of_flying_players.contains(target)) {
    //                  OFF
                        if (target == player) {
                             list_of_flying_players.remove(target);
                             sender.sendMessage("§6Fly has been §4disabled §6For §r\" + target.getDisplayName()");
                            target.setAllowFlight(false);

                        }else if (!(target == player)){
                            sender.sendMessage("§6Fly has been §4disabled §6For §r" + target.getDisplayName());
                            target.setAllowFlight(false);
                            target.sendMessage("§6Fly has been §4disabled §6By §r" + player.getDisplayName());
                            list_of_flying_players.remove(target);

                        }
//                  ON
                    } else if (!list_of_flying_players.contains(target)) {

                        if (target == player) {
                            list_of_flying_players.add(target);
                            sender.sendMessage("§6Fly has been §2enabled §6For §r\" + target.getDisplayName()");
                            target.setAllowFlight(true);

                        }else if (!(target == player)){

                             sender.sendMessage("§6Fly has been §2enabled §6For §r" + target.getDisplayName());
                            target.setAllowFlight(true);
                            target.sendMessage("§6Fly has been §2enabled §6By §r" + player.getDisplayName());
                          list_of_flying_players.add(target);
                            }


                }


            }

            }

        }

        return true;

        }


    private void flymethod(Player player) {
        if (list_of_flying_players.contains(player)) {
            player.setAllowFlight(false);
            player.sendMessage("§6Fly has been §4disabled §6By §r " + player.getDisplayName());
            list_of_flying_players.remove(player);

        } else if (!list_of_flying_players.contains(player)) {
            list_of_flying_players.add(player);
            player.setAllowFlight(true);
            player.sendMessage("§6Fly has been §2enabled §6By §r" + player.getDisplayName());
        }
    }
}