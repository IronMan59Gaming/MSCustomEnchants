package me.msce;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ItemToEnchant {

    WOOD_PICKAXE, WOOD_AXE, WOOD_HOE, WOOD_SPADE, STONE_PICKAXE, STONE_AXE, STONE_HOE, STONE_SPADE,
    IRON_PICKAXE, IRON_AXE, IRON_HOE, IRON_SPADE, GOLD_PICKAXE, GOLD_AXE, GOLD_HOE, GOLD_SPADE,
    DIAMOND_PICKAXE, DIAMOND_AXE, DIAMOND_HOE, DIAMOND_SPADE, WOOD_SWORD, STONE_SWORD, IRON_SWORD, GOLD_SWORD, DIAMOND_SWORD,
    LEATHER_HELMET, LEATHER_CHESTPLATE, LEATHER_LEGGINS, LEATHER_BOOTS,
    CHAINMAIL_HELMET, CHAINMAIL_CHESTPLATE, CHAINMAIL_LEGGINS, CHAINMAIL_BOOTS,
    IRON_HELMET, IRON_CHESTPLATE, IRON_LEGGINS, IRON_BOOTS,
    GOLD_HELMET, GOLD_CHESTPLATE, GOLD_LEGGINS, GOLD_BOOTS,
    DIAMOND_HELMET, DIAMOND_CHESTPLATE, DIAMOND_LEGGINS, DIAMOND_BOOTS;

    static List<ItemToEnchant> tools = Arrays.asList(WOOD_PICKAXE, WOOD_AXE, WOOD_HOE, WOOD_SPADE,
            STONE_PICKAXE, STONE_AXE, STONE_HOE, STONE_SPADE,
            IRON_PICKAXE, IRON_AXE, IRON_HOE, IRON_SPADE,
            GOLD_PICKAXE, GOLD_AXE, GOLD_HOE, GOLD_SPADE,
            DIAMOND_PICKAXE, DIAMOND_AXE, DIAMOND_HOE, DIAMOND_SPADE,
            WOOD_SWORD, STONE_SWORD, IRON_SWORD, GOLD_SWORD, DIAMOND_SWORD);

    static List<ItemToEnchant> armor = Arrays.asList(LEATHER_HELMET, LEATHER_CHESTPLATE, LEATHER_LEGGINS, LEATHER_BOOTS,
            CHAINMAIL_HELMET, CHAINMAIL_CHESTPLATE, CHAINMAIL_LEGGINS, CHAINMAIL_BOOTS,
            IRON_HELMET, IRON_CHESTPLATE, IRON_LEGGINS, IRON_BOOTS,
            GOLD_HELMET, GOLD_CHESTPLATE, GOLD_LEGGINS, GOLD_BOOTS,
            DIAMOND_HELMET, DIAMOND_CHESTPLATE, DIAMOND_LEGGINS, DIAMOND_BOOTS);




    public static Material ItemToMaterial (ItemToEnchant i) {
        return Material.valueOf(i.name());
    }

    public static ItemToEnchant MaterialToItem (Material m) {
        return ItemToEnchant.valueOf(m.name());
    }

    public static Boolean isTool(ItemToEnchant i) {
        if(tools.contains(i)) {
            return true;
        } else if (!tools.contains(i)) {
            return false;
        }

        return false;
    }

    public static Boolean isArmor(ItemToEnchant i) {
        if(armor.contains(i)) {
            return true;
        } else if (!armor.contains(i)) {
            return false;
        }

        return false;
    }



}
