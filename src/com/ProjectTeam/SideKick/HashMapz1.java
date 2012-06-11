package com.ProjectTeam.SideKick;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;

public class HashMapz1 implements Listener{
	public static boolean usePorkDrops = false;
	public static boolean cap = false;
	public static boolean creeper = true;
	@EventHandler(priority = EventPriority.NORMAL)
	public void onEntityDeath(EntityDeathEvent event){
		Entity e = event.getEntity();	   
		World w = e.getWorld();	   
		Location loc6 = e.getLocation();
		ItemStack stack = new ItemStack(Material.PORK,1);
		//Player
		if(e instanceof org.bukkit.entity.Player){
			//Drop the item
			if(usePorkDrops){
				w.dropItemNaturally(loc6, stack);
			}
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onEntityDamage(EntityDamageEvent event) {
		Entity e = event.getEntity();
		if (e instanceof org.bukkit.entity.Player){
			Player p = (Player) e;
			if (PlayerInfo.get(p).godmode) {
				p.setHealth(20);
				event.setCancelled(true);
			}
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onEntityExplode(EntityExplodeEvent event){
		if (!creeper) {
			event.setCancelled(true);
		}
	}
}