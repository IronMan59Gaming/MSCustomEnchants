package me.msce;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;


public class EnchanterLocator  {

    List<Location> locations = new ArrayList<>();

    public static Boolean enchanterIsSetup(Location loc1, Location loc2) {

        Integer xMin, xMax, yMin, yMax, zMin, zMax = 0;
        Block b = null;

        if (loc1.getX() >= loc2.getX()) {
            xMax = (int) loc1.getX();
            xMin = (int) loc2.getX();
        } else {
            xMax = (int) loc2.getX();
            xMin = (int) loc1.getX();
        }

        if (loc1.getY() >= loc2.getY()) {
            yMax = (int) loc1.getY();
            yMin = (int) loc2.getY();
        } else {
            yMax = (int) loc2.getY();
            yMin = (int) loc1.getY();
        }

        if (loc1.getZ() >= loc2.getZ()) {
            zMax = (int) loc1.getZ();
            zMin = (int) loc2.getZ();
        } else {
            zMax = (int) loc2.getZ();
            zMin = (int) loc1.getZ();
        }

        for (int x = xMin; x <= xMax; x++) {
            for (int y = yMin; y <= yMax; y++) {
                for (int z = zMin; z <= zMax; z++) {
                    b = loc1.getWorld().getBlockAt( x, y, z );

                    if (b.getType() != Material.BARRIER) {
                        return false;
                    }
                }
            }
        }
        return true;
    }



}
