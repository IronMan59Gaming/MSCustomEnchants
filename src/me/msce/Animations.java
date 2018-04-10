package me.msce;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

public class Animations extends BukkitRunnable {

    ArmorStand s;

    Location loc1 = new Location(Bukkit.getWorld("testworld"), -41, 69, 10);
    Location loc2 = new Location(Bukkit.getWorld("testworld"), -33, 64, 18);
    Location center = new Location(Bukkit.getWorld("testworld"), (loc1.getX() + loc2.getX()) / 2, (loc1.getY() + loc2.getY()) / 2, (loc1.getZ() + loc2.getZ()) / 2);

    public Animations(ArmorStand stand) {
        s = stand;
    }

    @Override
    public void run() {



        Vector v =  s.getLocation().subtract(center).toVector();


        Vector d = new Vector(center.getX() - s.getLocation().getX(), center.getY() - s.getLocation().getY(), center.getZ() - s.getLocation().getZ());


        s.setVelocity(d.multiply(0.06));


    }
}
