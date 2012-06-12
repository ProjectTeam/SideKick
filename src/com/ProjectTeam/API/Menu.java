package com.ProjectTeam.API;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Menu {
		static ChatColor R = ChatColor.RED;
		static ChatColor B = ChatColor.BLUE;
		static ChatColor Y = ChatColor.YELLOW;
		static ChatColor Purp = ChatColor.LIGHT_PURPLE;
		static ChatColor G = ChatColor.GREEN;
		static ChatColor qq = ChatColor.AQUA;
	
		static ChatColor R = ChatColor.RED;
		static ChatColor B = ChatColor.BLUE;
		static ChatColor Y = ChatColor.YELLOW;
		static ChatColor Purp = ChatColor.LIGHT_PURPLE;
		static ChatColor G = ChatColor.GREEN;
		static ChatColor qq = ChatColor.AQUA;
		
		private static boolean x(CommandSender sender, String node){
			if(sender.hasPermission(node)){
				return true;
			} else {
				return false;
			}
		}
	
		//Snapshot
	public static void SIDEKICK_1(CommandSender sender){
		Player p = (Player)sender;
		sender.sendMessage(R + "-------SideKick Commands-------");
		sender.sendMessage(Purp + "Welcome " + R + p.getName());
		if(x(sender, "Sidekick.changename")){
		sender.sendMessage(B + "/ChangeName [Name]");
		}
		else if(x(sender, "Sidekick.changename.other")){
			sender.sendMessage(B + "/ChangeName [Player] [Name]");
		}
		else if(x(sender, "Sidekick.changename") && x(sender, "Sidekick.changename.other")){
			sender.sendMessage(B + "/ChangeName <Name> : [Player] [Name]");
		}
		if(x(sender, "Sidekick.item")){
		sender.sendMessage(B + "/i <ItemName>");
		sender.sendMessage(B + "/Give [Player] [Item] <Amount>| /Give [Item]");
		}
		if(x(sender, "Sidekick.edit")){
		sender.sendMessage(qq + "/Edit <Block> - Edits a block to any type, Type /edit? for info");
		}
		if(x(sender, "Sidekick.weather")){
		sender.sendMessage(B + "/Weather <Sun/Storm>");
		}
		if(x(sender, "Sidekick.time")){
		sender.sendMessage(B + "/Time <Day/Night>");
		}
		if(x(sender, "Sidekick.clearinventory")){
		sender.sendMessage(B + "/ClearInv - Clears out your inv");
		}
		if(x(sender, "Sidekick.teleport")){
		sender.sendMessage(B + "/Tp [Player] | /Tp [Player] [Player] - Teleport Players");
		}
		if(x(sender, "Sidekick.tome")){
		sender.sendMessage(B + "/ToMe <Username> | /Tp [Player] [Player] - To you or Others");
		}
		if(x(sender, "Sidekick.god")){
		sender.sendMessage(B + "/God - Take No Damage, God Mode");
		}
		else if(x(sender, "Sidekick.god.other")){
			sender.sendMessage(B + "/God [Player] - Take No Damage, God Mode");
		}
		else if (x(sender, "Sidekick.god") && x(sender, "Sidekick.god.other")){
			sender.sendMessage(B + "/God : [Player] - Take No Damage, God Mode");
		}
		if(x(sender, "Sidekick.info")){
		sender.sendMessage(Y + "/Info- Shows version and Info about it");
		}
		if(x(sender, "Sidekick.edit")){
		sender.sendMessage(B + "/Add Under <Block> <X> <Y> <Z> -Replaces Block Within Radius");
		}
		sender.sendMessage(R + "Type /Sidekick2 To turn to page 2");
	}
	
	//Snapshot
	public static void SIDEKICK_2(CommandSender sender){
		sender.sendMessage(R + "-------SideKick Page 2 Commands------");
		if(x(sender, "Sidekick.pvp")){
		sender.sendMessage(B + "/PVP <On/Off>");
		sender.sendMessage(B + "/PVP <WorldName> <On/Off>");
		}
		if(x(sender, "Sidekick.explodeme")){
		sender.sendMessage(B + "/ExplodeMe- MakeSssss You Explode!");
		}
		if(x(sender, "Sidekick.heal")){
		sender.sendMessage(B + "/Heal <Username> - Heals The Person");
		}
		if(x(sender, "Sidekick.weather")){
		sender.sendMessage(B + "/Thunder <Off/On>");
		}
		if(x(sender, "Sidekick.broadcast")){
		sender.sendMessage(B + "/Broadcast <Message>");
		}
		if(x(sender, "Sidekick.toollast")){
		sender.sendMessage(B + "/ToolLast - Makes Tools never Break");
		}
		if(x(sender, "Sidekick.prefix")){
		sender.sendMessage(G + "/Prefix <name>");
		}
		if(x(sender, "Sidekick.suffix")){
		sender.sendMessage(G + "/Suffix <name>");
		}
		if(x(sender, "Sidekick.chat")){
		sender.sendMessage(G + "/Chat Clear - Clears Suffix & Prefix");
		}
		if(x(sender, "Sidekick.kill")){
		sender.sendMessage(B + "/Kill <Username> - Kills User");
		}
		if(x(sender, "Sidekick.realmode")){
		sender.sendMessage(B + "/RealMode - Makes your Server Realistic, Type /RealMode? for info");
		}
		sender.sendMessage(R + "Type /SideKick3 To View the 3rd Page");
	}
	
	public static void SIDEKICK_3(CommandSender sender){
		sender.sendMessage(R + "-----SideKick Page 3 Commands------");
		if(x(sender, "Sidekick.super")){
		sender.sendMessage(B + "/Super - Super Jump Command");
		}
		if(x(sender, "Sidekick.location")){
		sender.sendMessage(B + "/Loction - Shows your location");
		}
		if(x(sender, "Sidekick.afkmessage")){
		sender.sendMessage(B + "/Afk- Makes your name Away From Key-Board");
		sender.sendMessage(B + "/AfkOff");
		}
		if(x(sender, "Sidekick.broadcastlocation")){
		sender.sendMessage(B + "/BroadcastLoc - Broadcasts your loction to the server");
		}
		if(x(sender, "Sidekick.tools")){
		sender.sendMessage(B + "/Tools - Gives you tools");
		}
		if(x(sender, "Sidekick.fly")){
		sender.sendMessage(B + "/Fly - Allows you to Fly");
		}
		if(x(sender, "Sidekick.creative")){
		sender.sendMessage(G + "/Creative - Creative Mode");
		}
		else if (x(sender, "Sidekick.creative.other")){
			sender.sendMessage(G + "/Creative [Player] - Sends player into creative mode");
		}
		else if (x(sender, "Sidekick.creative.other") && x(sender, "Sidekick.creative")){
			sender.sendMessage(G + "/Creative : [Player] - Normal Mode");
		}
		if(x(sender, "Sidekick.survival")){
			sender.sendMessage(G + "/Survival - Normal Mode");
		}
		else if (x(sender, "Sidekick.survival.other")){
			sender.sendMessage(G + "/Survival [Player] - Normal Mode");
		}
		else if (x(sender, "Sidekick.survival.other") && x(sender, "Sidekick.survival")){
		sender.sendMessage(G + "/Survival : [Player] - Normal Mode");
		}
		sender.sendMessage(ChatColor.AQUA +"------World Gen Commands------");
		if(x(sender, "Sidekick.world")){
		sender.sendMessage(Y + "/GoTo <WorldName>");
		}
		if(x(sender, "Sidekick.worldgen")){
		sender.sendMessage(Y + "/Worldgen <Nether/Normal/End> <worldname> - World");
		}
		if(x(sender, "Sidekick.listworlds")){
		sender.sendMessage(Y + "/List Worlds - Lists All Worlds");
		sender.sendMessage(Y + "/Worlds - Lists All Worlds");
		}
		sender.sendMessage(ChatColor.AQUA + "----------- End --------------");
		if(x(sender, "Sidekick.spawner")){
		sender.sendMessage(B + "/Spawner <Mob/Animal>");
		}
		sender.sendMessage(R + "Type /sidekick4 To View the 4rd Page");
	}
	
	public static void SIDEKICK_4(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 4 Commands-----");
		if(x(sender, "Sidekick.mysterybox")){
		sender.sendMessage(B + "/Mysterybox- Break IronBlock and receive Mystery!");
		}
		if(x(sender, "Sidekick.nomobs")){
		sender.sendMessage(B + "/NoMobs - Kills all Mobs");
		}
		if(x(sender, "Sidekick.loginkit")){
		sender.sendMessage(B + "/LoginKit - When a Player joins, will receive a Start kit");
		}
		if(x(sender, "Sidekick.save")){
		sender.sendMessage(B + "/Save - Removes Fire Ticks when on fire");
		}
		if(x(sender, "Sidekick.antibuild")){
		sender.sendMessage(B + "/AntiBuild - Anti Griefing Tool, Type /Anti? for More");
		}
		if(x(sender, "Sidekick.signname")){
		sender.sendMessage(B + "/SignName - Allows player to type [Name] Then Displays Colored Name");
		}
		if(x(sender, "Sidekick.rules")){
		sender.sendMessage(Y + "/Rules - Shows the Rules");
		}
		sender.sendMessage(R + "Type /sidekick5 To View the 5th Page");
	}
	
	public static void SIDEKICK_5(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 5 Commands------");
		sender.sendMessage(Y + "----" + ChatColor.DARK_PURPLE + "Money Commands" + Y + "----");
		if(x(sender, "Sidekick.sk.money")){
		sender.sendMessage(G + "/sk money - Shows your $");
		}
		if(x(sender, "Sidekick.sk.pay")){
		sender.sendMessage(G + "/sk pay <Username> <amount>");
		}
		if(x(sender, "Sidekick.sk.give")){
		sender.sendMessage(G + "/sk give <username> <amount> - Admin Control for Money");
		}
		if(x(sender, "Sidekick.sell")){
		sender.sendMessage(G + "/Sell - Sells the Item in your hand");
		}
		sender.sendMessage(Y + "-----------------------------------------------------");
		if(x(sender, "Sidekick.nofire")){
		sender.sendMessage(B + "/Nofire - Disables Block Burning Mode");
		}
		if(x(sender, "Sidekick.eat")){
		sender.sendMessage(B + "/Eat - Fills your Food Bar Up");
		}
		if(x(sender, "Sidekick.weapon")){
		sender.sendMessage(B + "/Weapon <1/2> - Pick a Weapon Kit");
		}
		if(x(sender, "Sidekick.restart")){
		sender.sendMessage(B + "/Restart - Restarts server");
		}
		if(x(sender, "Sidekick.effect")){
		sender.sendMessage(B + "/Effect <1/2/3>");
		}
		sender.sendMessage(R + "/Sidekick6 To View the 6th Page");
	}
	
	public static void SIDEKICK_6(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 6 Commands-----");
		if(x(sender, "Sidekick.shutdown")){
		sender.sendMessage(B + "/// - Shuts down the server");
		}
		if(x(sender, "Sidekick.ip")){
		sender.sendMessage(B + "/Ip <Username> - Shows the ip of that user");
		}
		if(x(sender, "Sidekick.show")){
		sender.sendMessage(B + "/Show XP <Username> - Shows the Xp Points");
		}
		if(x(sender, "Sidekick.g")){
		sender.sendMessage(B + "/G <UserName> <Item> - Gives the player a Item");
		}
		if(x(sender, "Sidekick.strike")){
		sender.sendMessage(B + "/Strike <UserName> - Strike the Player with Lightning");
		}
		if(x(sender, "Sidekick.message")){
		sender.sendMessage(G + "/Message <Username> <Message>");
		}
		if(x(sender, "Sidekick.set")){
		sender.sendMessage(G + "/Set <Username> <CustomName> - Changes the users name");
		}
		if(x(sender, "Sidekick.advertise")){
		sender.sendMessage(B + "/Advertise <Message> - Advertise");
		}
		if(x(sender, "Sidekick.setspawn")){
		sender.sendMessage(B + "/SetSpawn - Sets Spawn at your Location");
		}
		if(x(sender, "Sidekick.spawn")){
		sender.sendMessage(B + "/Spawn - Goes to Spawn");
		}
		sender.sendMessage(R + "/Sidekick7 To View the 7th Page");
	}
	
	public static void SIDEKICK_7(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 7 Commands-----");
		if(x(sender, "Sidekick.clearinventory")){
		sender.sendMessage(B + "/InvClear <Username> - Clears that Players Inv");
		}
		if(x(sender, "Sidekick.player")){
		sender.sendMessage(B + "/Player Spawn <Username> - Teleports user to Spawn");
		}
		if(x(sender, "Sidekick.move")){
		sender.sendMessage(B + "/Move To <WorldName> - Teleports everyone to you in that world");
		}
		if(x(sender, "Sidekick.log")){
		sender.sendMessage(B + "/Log Breaks - Logs in Cmd every Block Broken");
		}
		if(x(sender, "Sidekick.warn")){
		sender.sendMessage(B + "/Warn <Player> <Message>");
		}
		if(x(sender, "Sidekick.world")){
		sender.sendMessage(B + "/Disable Creeper - Enables and Disables creeper explosions");
		}
		if(x(sender, "Sidekick.file")){
		sender.sendMessage(B + "/Create <FileName> <Output>"); 
		}
		if(x(sender, "Sidekick.wear")){
		sender.sendMessage(G + "/Wear - Sets Block In " + R + "hand" + G+ " to a Hat");
		sender.sendMessage(G + "/Wear Remove - Removes hat");
		sender.sendMessage(G + "/Wear <Block> - Shortcut to wear Item");
		}
		sender.sendMessage(G + "/Players - Shows Players");
		sender.sendMessage(R + "/Sidekick8 To View the 8th Page");
	}
	
	public static void SIDEKICK_8(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 8 Commands-----");
		if(x(sender, "Sidekick.potion")){
		sender.sendMessage(B + "/PotionEffect ? - PotionEffect Help Menu");
		sender.sendMessage(B + "/PotionEffect <EffectType> - Uses Potion Effect");
		sender.sendMessage(B + "/PotionEffect <Player> <EffectType>");
		}
		if(x(sender, "Sidekick.calculator")){
		sender.sendMessage(B + "/C <Number> <+,-,/,*> <Number> - Calculator");
		}
		if(x(sender, "Sidekick.back")){
		sender.sendMessage(G + "/Back - Send you back to prev. location");
		}
	}


}
