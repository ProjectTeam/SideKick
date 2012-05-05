package com.emericask8ur.SideKick;

import java.util.HashMap;

public class Economy {
	public static HashMap<String, Double> economy = new HashMap<String, Double>();

	/**
	 * 
	 * @param Players name
	 * @return Money amount
	 */
	public static Double getMoney(String string) {
		if (Economy.economy.containsKey(string)) {
			return Economy.economy.get(string);
		} else {
			return (double) 0;
		}
	}
	
	/**
	 * 
	 * @param Players name
	 * @param Money amount
	 */
	public static void setMoney(String string, double amount) {
		Economy.economy.put(string, amount);

	}
	
	/**
	 * 
	 * @param Players name
	 * @param Money amount
	 */
	public static void addMoney(String string, double amount) {
		double a = Economy.getMoney(string);
		double x = a + amount;
		Economy.economy.put(string, x);
	}
	
	/**
	 * Subtracts from the users wallet.
	 * If the player does not have money left, users money cannot be subtracted.
	 * @param Players name
	 * @param Money amount
	 */
	public static void subtractMoney(String string, double amount){
		double x = Economy.getMoney(string);
		double y = x - amount;
		if(!(Economy.getMoney(string) <= 0)){
		Economy.economy.put(string, y);
		} else {
			System.out.println("[SideKick] Economy cannot subtract amount from " + string + " because the user doesnt have enough!");
		}
	}

}
