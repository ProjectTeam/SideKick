package com.emericask8ur.API;

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
	
	public static void SIDEKICK_1(CommandSender sender){
		Player p = (Player)sender;
		sender.sendMessage(R + "-------SideKick Commands-------");
		sender.sendMessage(Purp + "Welcome " + R + p.getName());
		sender.sendMessage(B + "/ChangeName <Name> : [Player] [Name]");
		sender.sendMessage(B + "/i <ItemName>");
		sender.sendMessage(qq + "/Edit <Block> - Edits a block to any type, Type /edit? for info");
		sender.sendMessage(B + "/Weather <Sun/Storm>");
		sender.sendMessage(B + "/Time <Day/Night>");
		sender.sendMessage(B + "/ClearInv - Clears out your inv");
		sender.sendMessage(B + "/Tp [Player] | /Tp [Player] [Player] - Teleport Players");
		sender.sendMessage(B + "/ToMe <Username> | /Tp [Player] [Player] - To you or Others");
		sender.sendMessage(B + "/God - Take No Damage, God Mode");
		sender.sendMessage(Y + "/Info- Shows version and Info about it");
		sender.sendMessage(B + "/Add Under <Block> <X> <Y> <Z> -Replaces Block Within Radius");
		sender.sendMessage(R + "Type /Sidekick2 To turn to page 2");
	}
	
	public static void SIDEKICK_2(CommandSender sender){
		sender.sendMessage(R + "-------SideKick Page 2 Commands------");
		sender.sendMessage(B + "/PVP <On/Off>");
		sender.sendMessage(B + "/PVP <WorldName> <On/Off>");
		sender.sendMessage(B + "/ExplodeMe- MakeSssss You Explode!");
		sender.sendMessage(B + "/Heal <Username> - Heals The Person");
		sender.sendMessage(B + "/Thunder <Off/On>");
		sender.sendMessage(B + "/Broadcast <Message>");
		sender.sendMessage(B + "/ToolLast - Makes Tools never Break");
		sender.sendMessage(G + "/Prefix <name>");
		sender.sendMessage(G + "/Suffix <name>");
		sender.sendMessage(G + "/Chat Clear - Clears Suffix & Prefix");
		sender.sendMessage(B + "/Kill <Username> - Kills User");
		sender.sendMessage(B + "/RealMode - Makes your Server Realistic, Type /RealMode? for info");
		sender.sendMessage(R + "Type /SideKick3 To View the 3rd Page");
	}
	
	public static void SIDEKICK_3(CommandSender sender){
		sender.sendMessage(R + "-----SideKick Page 3 Commands------");
		sender.sendMessage(B + "/Super - Super Jump Command");
		sender.sendMessage(B + "/Loction - Shows your location");
		sender.sendMessage(B + "/Afk- Makes your name Away From Key-Board");
		sender.sendMessage(B + "/AfkOff");
		sender.sendMessage(B + "/BroadcastLoc - Broadcasts your loction to the server");
		sender.sendMessage(B + "/Tools - Gives you tools");
		sender.sendMessage(B + "/Fly - Allows you to Fly");
		sender.sendMessage(G + "/Creative : [Player] - Creative Mode");
		sender.sendMessage(G + "/Survival : [Player] - Normal Mode");
		sender.sendMessage(B + "/XP <Fill/PlayerName> <Amount> - Fills you or Players XP to Amount");
		sender.sendMessage(ChatColor.AQUA +"------World Gen Commands------");
		sender.sendMessage(Y + "/GoTo <WorldName>");
		sender.sendMessage(Y + "/Worldgen <Nether/Normal/End> <worldname> - World");
		sender.sendMessage(Y + "/List Worlds - Lists All Worlds");
		sender.sendMessage(Y + "/Worlds - Lists All Worlds");
		sender.sendMessage(ChatColor.AQUA + "----------- End --------------");
		sender.sendMessage(B + "/Spawner <Mob/Animal>");
		sender.sendMessage(R + "Type /sidekick4 To View the 4rd Page");
	}
	
	public static void SIDEKICK_4(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 4 Commands-----");
		sender.sendMessage(B + "/Mysterybox- Break IronBlock and receive Mystery!");
		sender.sendMessage(B + "/NoMobs - Kills all Mobs");
		sender.sendMessage(B + "/Quit - Alerts you when someone Leaves");
		sender.sendMessage(B + "/Join - Alerts you when someone Joins");
		sender.sendMessage(B + "/Beware - Lets you create a Colored [Beware] Sign");
		sender.sendMessage(B + "/LoginKit - When a Player joins, will receive a Start kit");
		sender.sendMessage(B + "/Save - Removes Fire Ticks when on fire");
		sender.sendMessage(B + "/AntiBuild - Anti Griefing Tool, Type /Anti? for More");
		sender.sendMessage(B + "/SignName - Allows player to type [Name] Then Displays Colored Name");
		sender.sendMessage(Y + "/Rules - Shows the Rules");
		sender.sendMessage(R + "Type /sidekick5 To View the 5th Page");
	}
	
	public static void SIDEKICK_5(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 5 Commands------");
		sender.sendMessage(Y + "----" + ChatColor.DARK_PURPLE + "Money Commands" + Y + "----");
		sender.sendMessage(G + "/sk money - Shows your $");
		sender.sendMessage(G + "/sk pay <Username> <amount>");
		sender.sendMessage(G + "/sk give <username> <amount> - Admin Control for Money");
		sender.sendMessage(G + "/Sell - Sells the Item in your hand");
		sender.sendMessage(Y + "-----------------------------------------------------");
		sender.sendMessage(B + "/Nofire - Disables Block Burning Mode");
		sender.sendMessage(B + "/Dehydrator - Puts your dehydrator level to 0");
		sender.sendMessage(B + "/Eat - Fills your Food Bar Up");
		sender.sendMessage(B + "/Weapon <1/2> - Pick a Weapon Kit");
		sender.sendMessage(B + "/Restart - Restarts server");
		sender.sendMessage(B + "/Shotgun <amount> - 1-4 Shoots Arrows In your sign");
		sender.sendMessage(B + "/Effect <1/2/3>");
		sender.sendMessage(R + "/Sidekick6 To View the 6th Page");
	}
	
	public static void SIDEKICK_6(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 6 Commands-----");
		sender.sendMessage(B + "/// - Shuts down the server");
		sender.sendMessage(B + "/Ip <Username> - Shows the ip of that user");
		sender.sendMessage(B + "/Show XP <Username> - Shows the Xp Points");
		sender.sendMessage(B + "/G <UserName> <Item> - Gives the player a Item");
		sender.sendMessage(B + "/Strike <UserName> - Strike the Player with Lightning");
		sender.sendMessage(G + "/Message <Username> <Message>");
		sender.sendMessage(G + "/Set <Username> <CustomName> - Changes the users name");
		sender.sendMessage(B + "/Advertise <Message> - Advertise");
		sender.sendMessage(B + "/Send To <UserName> <Item> - Sends the item to the Player");
		sender.sendMessage(B + "/SetSpawn - Sets Spawn at your Location");
		sender.sendMessage(B + "/Spawn - Goes to Spawn");
		sender.sendMessage(R + "/Sidekick7 To View the 7th Page");
	}
	
	public static void SIDEKICK_7(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 7 Commands-----");
		sender.sendMessage(B + "/InvClear <Username> - Clears that Players Inv");
		sender.sendMessage(B + "/Read Rules To <Username> - Reads rules to player");
		sender.sendMessage(B + "/Player Spawn <Username> - Teleports user to Spawn");
		sender.sendMessage(B + "/Move To <WorldName> - Teleports everyone to you in that world");
		sender.sendMessage(B + "/Mode Change <Username> <Mode> ");
		sender.sendMessage(B + "/Log Breaks - Logs in Cmd every Block Broken");
		sender.sendMessage(B + "/Warn <Player> <Message>");
		sender.sendMessage(B + "/Disable Creeper - Enables and Disables creeper explosions");
		sender.sendMessage(B + "/Create <FileName> <Output>"); 
		sender.sendMessage(G + "/Wear - Sets Block In " + R + "hand" + G+ " to a Hat");
		sender.sendMessage(G + "/Wear Remove - Removes hat");
		sender.sendMessage(G + "/Wear <Block> - Shortcut to wear Item");
		sender.sendMessage(G + "/Players - Shows Players");
		sender.sendMessage(R + "/Sidekick8 To View the 8th Page");
	}
	
	public static void SIDEKICK_8(CommandSender sender){
		sender.sendMessage(R + "------SideKick Page 8 Commands-----");
		sender.sendMessage(B + "/PotionEffect ? - PotionEffect Help Menu");
		sender.sendMessage(B + "/PotionEffect <EffectType> - Uses Potion Effect");
		sender.sendMessage(B + "/PotionEffect <Player> <EffectType>");
		sender.sendMessage(B + "/C <Number> <+,-,/,*> <Number> - Calculator");
		sender.sendMessage(G + "/Back - Send you back to prev. location");
	}

}
