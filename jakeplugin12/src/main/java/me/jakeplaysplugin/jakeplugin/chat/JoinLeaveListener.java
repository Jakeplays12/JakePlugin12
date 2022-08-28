package me.jakeplaysplugin.jakeplugin.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public Void onLeave(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage("§8[§2+§8]§f Welcome Back " + player.getDisplayName() + "!");

        }else{
                e.setJoinMessage("§8[§2+§8]§f " + player.getDisplayName() + " Joined for the first time!");
            }
        return null;
    }

    @EventHandler
    public Void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage("§8[§4-§8] §f" + player.getDisplayName() + " Has Left the server.");


        return null;
    }
}