package me.jakeplaysplugin.jakeplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            Inventory gui = Bukkit.createInventory(p, 9, "Plugin Menu");

            ItemStack heal = new ItemStack(Material.BARRIER);
            ItemMeta heal_meta = heal.getItemMeta();
            heal_meta.setDisplayName("Heal");
            heal.setItemMeta(heal_meta);


            ItemStack feed = new ItemStack(Material.COOKED_BEEF);
            ItemMeta feed_meta = heal.getItemMeta();
            feed_meta.setDisplayName("Feed");
            feed.setItemMeta(feed_meta);

            ItemStack clearw = new ItemStack(Material.WHITE_WOOL);
            ItemMeta clearw_meta = clearw.getItemMeta();
            clearw_meta.setDisplayName("clear weather and time day");
            clearw.setItemMeta(clearw_meta);

            gui.addItem(heal, feed, clearw);
            p.openInventory(gui);

        }


        return false;
    }
}
