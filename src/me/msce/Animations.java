package me.msce;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;



public class Animations extends BukkitRunnable {

    public static Double x = 0.0;
    public static Double y = 0.0;
    public static Double z = 0.0;
    public static DirectionFacing df = DirectionFacing.NORTH;

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


        Vector d = new Vector(center.getX() - s.getLocation().getX() + 1.3, center.getY() - s.getLocation().getY() - 1.2, center.getZ() - s.getLocation().getZ() + 0.5);


        s.setVelocity(d.multiply(0.06));

        EulerAngle e = new EulerAngle(x, y, z);

        EulerAngle n = null;

        switch (df) {
            case NORTH:
                 n = new EulerAngle(-1.8, 1.58, -0.04);
                break;
            case SOUTH:
                 n = new EulerAngle(-1.8, 1.58, -0.04);
                break;
            case EAST:
                 n = new EulerAngle(-1.76, 3.14, -0.06);
                break;
            case WEST:
                 n = new EulerAngle(-1.76, 3.14, -0.06);
                break;
        }

        s.setRightArmPose(n);

    }
}
