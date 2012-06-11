package com.ProjectTeam.SideKick;

import java.util.HashMap;

import org.bukkit.potion.PotionEffectType;


public class PotionEffects {
	public static HashMap<String, PotionEffectType> potion = new HashMap<String, PotionEffectType>();
	public static void setPotions() {
		potion.put("blind", PotionEffectType.BLINDNESS);
		potion.put("blindness", PotionEffectType.BLINDNESS);
		potion.put("confusion", PotionEffectType.CONFUSION);
		potion.put("confused", PotionEffectType.CONFUSION);
		potion.put("digging", PotionEffectType.FAST_DIGGING);
		potion.put("damage", PotionEffectType.DAMAGE_RESISTANCE);
		potion.put("fire", PotionEffectType.FIRE_RESISTANCE);
		potion.put("harm", PotionEffectType.HARM);
		potion.put("heal", PotionEffectType.HEAL);
		potion.put("hunger", PotionEffectType.HUNGER);
		potion.put("increase", PotionEffectType.INCREASE_DAMAGE);
		potion.put("jump", PotionEffectType.JUMP);
		potion.put("poison", PotionEffectType.POISON);
		potion.put("regeneration", PotionEffectType.REGENERATION);
		potion.put("slow", PotionEffectType.SLOW);
		potion.put("speed", PotionEffectType.SPEED);
		potion.put("water", PotionEffectType.WATER_BREATHING);
		potion.put("weakness", PotionEffectType.WEAKNESS);
	}
}
