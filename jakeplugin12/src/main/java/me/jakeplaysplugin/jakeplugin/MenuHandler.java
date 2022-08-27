package me.jakeplaysplugin.jakeplugin;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
            Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("Plugin Menu")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null){
                return;
            }
            if(e.getCurrentItem().getType().equals(Material.BARRIER)){
                p.sendMessage("You have been Healed.");
                p.closeInventory();
                double maxHealth = p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                p.setHealth(maxHealth);

            } if(e.getCurrentItem().getType().equals(Material.COOKED_BEEF)){
                p.sendMessage("You have been Fed.");
                p.closeInventory();
                p.setFoodLevel(20);

            } if(e.getCurrentItem().getType().equals(Material.WHITE_WOOL)){
                p.sendMessage("Cleared the sky's and made it day.");
                p.closeInventory();
                p.chat("/time set day");
                p.chat("/weather clear");
            }


        }

    }

}
