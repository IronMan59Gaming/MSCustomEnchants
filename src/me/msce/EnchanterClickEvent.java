package me.msce;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftArmorStand;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnchanterClickEvent implements Listener {

    public Boolean isItemToEnchant(Material m) {
        List<Material> itemsToEnchant = Arrays.asList(Material.WOOD_PICKAXE, Material.WOOD_AXE, Material.WOOD_HOE, Material.WOOD_SPADE,
                Material.STONE_PICKAXE, Material.STONE_AXE, Material.STONE_HOE, Material.STONE_SPADE,
                Material.IRON_PICKAXE, Material.IRON_AXE, Material.IRON_HOE, Material.IRON_SPADE,
                Material.GOLD_PICKAXE, Material.GOLD_AXE, Material.GOLD_HOE, Material.GOLD_SPADE,
                Material.DIAMOND_PICKAXE, Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_SPADE,
                Material.WOOD_SWORD, Material.STONE_SWORD, Material.IRON_SWORD, Material.GOLD_SWORD, Material.DIAMOND_SWORD,
                Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS,
                Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.CHAINMAIL_BOOTS,
                Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS,
                Material.GOLD_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS,
                Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS);

        if(itemsToEnchant.contains(m)) {
            return true;
        } else {
            return false;
        }

    }

    @EventHandler
    public void enchanterClickEvent(PlayerInteractEvent e) {

        if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && isItemToEnchant(e.getMaterial())) {
            ArmorStand stand = e.getClickedBlock().getLocation().getWorld().spawn(e.getClickedBlock().getLocation(), ArmorStand.class);
            stand.setVisible(false);
            stand.setGravity(true);
            stand.setArms(true);
            stand.setItemInHand(e.getItem());

            int animate = Bukkit.getScheduler().scheduleAsyncRepeatingTask( Main.plugin, new Animations(stand), 0, 1);


            new BukkitRunnable() {

                @Override
                public void run() {
                    Bukkit.getScheduler().cancelTask(animate);
                    stand.remove();
                }
            }.runTaskLater(Main.plugin, 100);

        }

    }

}
