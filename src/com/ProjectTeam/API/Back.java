package com.ProjectTeam.API;

import java.util.HashMap;

import org.bukkit.Location;

public class Back {
	
	public static HashMap<String, Location> back = new HashMap<String, Location>();
	
	/**
	 * 
	 * @param Players name
	 * @return Location
	 */
	public static Location getBackLocation(String string){
		return back.get(string);
	}
	
	/**
	 * 
	 * @param Players name
	 * @param location
	 * @return Location 
	 */
	public static Location setBack(String string, Location location){
		return back.put(string, location);
	}

}
