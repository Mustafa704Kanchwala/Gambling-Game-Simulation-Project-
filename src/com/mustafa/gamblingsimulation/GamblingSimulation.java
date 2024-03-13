package com.mustafa.gamblingsimulation;

public class GamblingSimulation {
	final static int DAILY_STACK = 100;
	final static int BET_PER_GAME = 1;
	
	public static void gameStatus() {
		System.out.println("Daily Stack: " + DAILY_STACK);
		System.out.println("Bet per Game: " + BET_PER_GAME);
	}
	public static void main(String args[]) {
		gameStatus();
		
	}
}
