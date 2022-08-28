package me.jakeplaysplugin.jakeplugin;

import me.jakeplaysplugin.jakeplugin.chat.JoinLeaveListener;
import me.jakeplaysplugin.jakeplugin.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jakeplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

       getCommand("gui").setExecutor(new GUICommand());
        getLogger().info("[Plugin] Plugin has been enabled!");
        Bukkit.broadcastMessage("");

        getCommand("gmc").setExecutor(new GamemodeCommands());
        getCommand("gms").setExecutor(new GamemodeCommands());
        getCommand("gmsp").setExecutor(new GamemodeCommands());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("heal").setExecutor(new SmallerCommands());
        getCommand("feed").setExecutor(new SmallerCommands());
        getCommand("checklist").setExecutor(new checklist());
//        getCommand("vanish").setExecutor(new Vanish(this));
        getCommand("colors").setExecutor(new colors());
        getCommand("broadcast").setExecutor(new BroadcastCommand());



        getServer().getPluginManager().registerEvents(new MenuHandler(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
