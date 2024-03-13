package com.mustafa.gamblingsimulation;
import java.util.*;
public class GamblingSimulation {
	private final static int DAILY_STACK = 100;
	private final static int BET_PER_GAME = 1;
	private final static int WIN = 1;
	private final static int LOOSE = 0;
	static int win_stake;
	static int loose_stake;
	static int bet;
	
	
	public static void gameStatus() {
		System.out.println("Daily Stack: " + DAILY_STACK);
		System.out.println("Bet per Game: " + BET_PER_GAME);
	}
	public static void placeBet() {

		while(true) {
			if(win_stake == DAILY_STACK / 2  || loose_stake == DAILY_STACK / 2) {
				System.out.println("GAMBLER RESINGED......");
				break;
			}
			else {
				gameStatus();
				Random random = new Random();
				bet = random.nextInt(9)%2;
				if(bet == WIN) {		
					System.out.println("BET SUCCESS!!");
					win_stake = win_stake + 1;
				}
				else {
					System.out.println("BET FAILED!!");
					loose_stake++;
				}
				System.out.println("Winning Stake ="+win_stake);
				System.out.println("Loosing Stake ="+loose_stake);
				System.out.println("--------------------");	
			}
		}
	}
	public static void main(String args[]) {
		placeBet();
	}
}
