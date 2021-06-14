package ui;
import com.util.Console;

public class PigDiceV2App {

	// v2 - allow player to play multiple games
	public static void main(String[] args) {
		System.out.println("Welcome to Pig Dice!");
		
		int games = Console.getInt("How many games do you want to play?", 
				0, Integer.MAX_VALUE);
		int totalScore = 0;
		int maxScore = 0;
		for (int i=0; i< games; i++) {
			// game starts here!
			int score = 0;
			int roll = 0;
			int rollCount = 0;
			while (roll!=1) {
				roll = (int)(Math.random()*6)+1;
				//System.out.println("Roll = "+roll);
				score+=roll;
				rollCount++;
			}
//			System.out.println("-----------------------------------");
//			System.out.println("Game Over!  Score is: "+score);
//			System.out.println("Roll Count:           "+rollCount);
//			System.out.println("Avg Roll:             "+(score / rollCount));
			// game ends here!
			totalScore+=score;
			maxScore = Math.max(maxScore, score);
		}
		System.out.println("===================================");
		System.out.println("# of games played: "+games);
		System.out.println("Total score:       "+totalScore);
		System.out.println("Max score:         "+maxScore);
		System.out.println("Bye");

	}

}
