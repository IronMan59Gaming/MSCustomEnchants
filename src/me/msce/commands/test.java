package me.msce.commands;

import me.msce.Animations;
import me.msce.ItemToEnchant;
import me.msce.Main;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftArmorStand;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class test implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player player = (Player) sender;

        Animations.x = Double.parseDouble(args[0]);
        Animations.y = Double.parseDouble(args[1]);
        Animations.z = Double.parseDouble(args[2]);

        Material m = Material.STONE_SPADE;
        ItemToEnchant.MaterialToItem(m).toString();
        player.sendMessage(ItemToEnchant.MaterialToItem(m).toString());


        return false;
    }
}
