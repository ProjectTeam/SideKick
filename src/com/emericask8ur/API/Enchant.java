package com.emericask8ur.API;

import java.util.Map;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Enchant {
	
	/**
	 * Enchantment items
	 * @param player
	 * @param enchantment
	 * @param level
	 */
	public static void enchantItem(Player player, Enchantment enchantment, int level, ItemStack itemstack){
		itemstack.addEnchantment(enchantment, level);
	}
	
	/**
	 * Returns players Enchantments
	 * @param player
	 * @return
	 */
	public static Map<Enchantment, Integer> getEnchantments(Player player){
		return player.getInventory().getItemInHand().getEnchantments();
		
	}
	
	/**
	 * Checks if ItemStack is or is not enchanted
	 * @param itemstack
	 * @return
	 */
	public static boolean isEnchanted(ItemStack itemstack){
		if(itemstack.getEnchantments() != null){
			return true;
		} else {
			return false;
		}
	}
	

}
