package me.msce;

import org.bukkit.entity.Player;

public enum DirectionFacing {

    NORTH, SOUTH, EAST, WEST;

        public static DirectionFacing getDirection(Player p) {
            float yaw = p.getLocation().getYaw();
            if (yaw > 135 || yaw < -135) {
                return DirectionFacing.NORTH;
            } else if (yaw < -45) {
                return DirectionFacing.EAST;
            } else if (yaw > 45) {
                return DirectionFacing.WEST;
            } else {
                return DirectionFacing.SOUTH;
            }
        }

}

