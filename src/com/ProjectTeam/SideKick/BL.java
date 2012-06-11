package com.ProjectTeam.SideKick;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class BL implements Listener{
	
	public static boolean Mystery = false;
	public static boolean SignC = false;
	public static boolean grief = false;
	public static boolean SignCh = false;
	public static boolean CPT = false;
	public static boolean portal = false;
	public static boolean burn = false;
	public static boolean log = false;
	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockBreak(BlockBreakEvent event){
		int A[]= new int[64];
		A[0]=0;
		A[1]=1;
		Player p = event.getPlayer();
		Block b = event.getBlock();
		Location loc = p.getLocation();
		Material iron = Material.IRON_BLOCK;
		EntityType creeper = EntityType.CREEPER;
		ItemStack ii = new ItemStack(Material.GOLDEN_APPLE,1);
		if(b.getType()== iron){
			if(Mystery){
			if ((int) (Math.random() * 4) == 0) {
				 ItemStack i = new ItemStack(Material.IRON_SWORD, A[1]);
			b.getWorld().dropItem(loc, i);
				     }
				else if ((int) (Math.random() * 15) == 0) {
					 b.getWorld().spawnCreature(loc, EntityType.ZOMBIE);
					 }
				else if ((int) (Math.random() * 3) == 0) {
							 ItemStack i = new ItemStack(Material.STONE_SWORD, A[1]);
							b.getWorld().dropItemNaturally(loc,i);
						 }
				else if ((int) (Math.random() * 5) == 0) {
								 ItemStack i = new ItemStack(Material.DIAMOND_SWORD, A[1]);
								b.getWorld().dropItemNaturally(loc,i);

					}
				else if ((int) (Math.random() * 20) == 0) {
								ItemStack i = new ItemStack(Material.DIAMOND, A[1]);
								b.getWorld().dropItemNaturally(loc, i);
				}
				else if ((int) (Math.random() *70) ==0){
					b.getWorld().spawnCreature(loc,creeper);			
				}
				else if ((int) (Math.random() * 30) ==0){
					b.getWorld().spawnCreature(loc, EntityType.ENDERMAN);
				}
				else if ((int) (Math.random() *500) ==1){
					b.getWorld().spawnCreature(loc, EntityType.GHAST);
				}
				else if ((int)(Math.random() *200) ==0){
					ItemStack di = new ItemStack(Material.DIAMOND,1);
					b.getWorld().dropItem(b.getLocation(), di);
				}
			}
			if(b.getType()==Material.LEAVES){
				if((int) (Math.random() *600) == 0){
					b.getWorld().dropItemNaturally(b.getLocation(), ii);
				}
				if((int) (Math.random() * 100) == 0){
					ItemStack iii = new ItemStack(Material.LEAVES);
					b.getWorld().dropItem(b.getLocation(), iii);
				}
				if(grief){
					if(!p.isOp() || !p.hasPermission("Sidekick.override")){
					event.setCancelled(true);
				}
			}
		}
		}
		if(log){
			System.out.println(p.getName() + " has broken Block " + event.getBlock().getType());
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockPlace(BlockPlaceEvent event){
		if(grief){
			Player p = event.getPlayer();
			if(!p.isOp() || !p.hasPermission("Sidekick.override")){
		event.setCancelled(true);
		}
	}
		if(log){
			Player p = event.getPlayer();
			System.out.println(event.getBlockPlaced() + " Was placed by " + p.getName());
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockBurn(BlockBurnEvent event){
		if(burn){
			event.setCancelled(true);
		}
	}
}


		