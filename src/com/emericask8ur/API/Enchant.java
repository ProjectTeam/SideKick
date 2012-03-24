package com.emericask8ur.API;

import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class Enchant {
	
	/**
	 * Enchantment items
	 * @param player
	 * @param enchantment
	 * @param level
	 */
	static void enchantItem(Player player, Enchantment enchantment, int level){
		player.getItemInHand().addEnchantment(enchantment, level);
	}
	
	/**
	 * Returns players Enchantments
	 * @param player
	 * @return
	 */
	static Map<Enchantment, Integer> getEnchantments(Player player){
		return player.getInventory().getItemInHand().getEnchantments();
		
	}
	

}
