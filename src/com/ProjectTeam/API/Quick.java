package com.ProjectTeam.API;

import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.Location;

public class Quick {
	
	private static HashSet<String> mode = new HashSet<String>();
	
	private static HashMap<String, Location> warp = new HashMap<String, Location>();
	
	public static Location getWarpLocation(String playername){
		return warp.get(playername);
	}
	
	public static void setWarpLocation(String playername, Location location){
		warp.put(playername, location);
	}
	
	public static boolean hasWarpLocation(String playername){
		if(warp.containsKey(playername)){
			return true;
		} else {
			return false;
		}
	}
	
	public static void enableMarkerMode(String playername){
		mode.add(playername);
	}
	
	public static void disableMarkerMode(String playername){
		mode.remove(playername);
	}
	
	public static boolean isInMarkerMode(String playername){
		if(mode.contains(playername)){
			return true;
		} else {
			return false;
		}
	}

}
