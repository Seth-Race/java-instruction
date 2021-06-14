package ui;
import com.util.Console;

import business.Die;
import business.Game;

public class PigDiceV3App {

	// v3 - add classes
	public static void main(String[] args) {
		System.out.println("Welcome to Pig Dice!");
		
		int games = Console.getInt("How many games do you want to play?", 
				0, Integer.MAX_VALUE);
		int totalScore = 0;
		int maxScore = 0;
		for (int i=0; i< games; i++) {
			// game starts here!
			Game game = new Game();
			int roll = 0;
			while (roll!=1) {
				Die die = new Die();
				roll = game.dieRoll(die);
			}
			// game ends here!
			totalScore+=game.getScore();
			maxScore = Math.max(maxScore, game.getScore());
		}
		System.out.println("===================================");
		System.out.println("# of games played: "+games);
		System.out.println("Total score:       "+totalScore);
		System.out.println("Max score:         "+maxScore);
		System.out.println("Bye");

	}

}
