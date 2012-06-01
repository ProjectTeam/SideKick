package com.emericask8ur.SideKick;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class PlayerInfo {
	
	private static HashMap<String, PlayerInfo> info = new HashMap<String, PlayerInfo>();
	public static PlayerInfo get(String playername) {
		playername = playername.toLowerCase();
		PlayerInfo pi = info.get(playername);
		if (pi == null) {
			pi = new PlayerInfo();
			info.put(playername, pi);
		}
		return pi;
	}
	public static PlayerInfo get(Player player) {
		return get(player.getName());
	}
	public static PlayerInfo get(Entity e) {
		if (e instanceof Player) return get((Player) e);
		return null;
	}
	public static boolean isPlayer(Entity e) {
		return e instanceof Player;
	}
	public static boolean isGodmode(Entity e) {
		if (!isPlayer(e)) return false;
		return get(e).godmode;
	}
	
	private PlayerInfo() {}
	
	public boolean godmode = false;
	

}
