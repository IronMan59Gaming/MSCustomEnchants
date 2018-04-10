package me.msce;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {



        plugin = this;

        Location loc1 = new Location(Bukkit.getWorld("testworld"), -41, 69, 10);
        Location loc2 = new Location(Bukkit.getWorld("testworld"), -33, 64, 18);
        Location center = new Location(Bukkit.getWorld("testworld"), (loc1.getX() + loc2.getX()) / 2, (loc1.getY() + loc2.getY()) / 2, (loc1.getZ() + loc2.getZ()) / 2);

        MainInitialisers.commandSetup(this);
        MainInitialisers.eventSetup(this, getServer());

        if(EnchanterLocator.enchanterIsSetup(loc1, loc2)){
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage( ChatColor.translateAlternateColorCodes('&', "&3&lEnchanter &8>> &7Enchanter setup correctly."));
            }
        } else {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage( ChatColor.translateAlternateColorCodes('&', "&3&lEnchanter &8>> &4Error: &7Enchanter not setup correctly."));
            }
        }

    }

    @Override
    public void onDisable() {

    }

}
