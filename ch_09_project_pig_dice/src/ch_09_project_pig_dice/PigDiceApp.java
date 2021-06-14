//Weird version.
//Will remake soon.

package ch_09_project_pig_dice;

import com.util.Console;

public class PigDiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice app!");
		System.out.println();
		String choice = Console.getString("Shall we play?     ", "y", "n");
		System.out.println();
		
		while (choice.equalsIgnoreCase("y")) {


			int rolls = 0;
			int score = 0;
			int highRoll = 0;
			int maxAttempt = Console.getInt("How many attempts?     ");
			int attempt = 0;
			int avgRoll = 1;
			int die = 0;
			
			while (attempt < maxAttempt) {
				die = rollDie();
				//System.out.println("We rolled a " +die);
				rolls ++;
				attempt ++;
				score += die;
				avgRoll = (score/rolls);
			if (highRoll < die) {
				highRoll = die;
			}
			if (die == 1) {
//				System.out.println("*--------------------*");
//				System.out.println("|    Aww, shucks!    |");
//				System.out.println("|    What a loser!   |");
//				System.out.println("*--------------------*");
				break;
			}
			if (attempt == maxAttempt) {
//				System.out.println("*-------------------------------*");
//				System.out.println("|    You made it all the way!   |");
//				System.out.println("|  Good job not being a loser!  |");
//				System.out.println("*-------------------------------*");

					break;
				}
				
			
			}
			if (rolls > 9 || score > 9) {
				System.out.println();
				System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
				System.out.println("|       **SCORECARD**        |");
				System.out.println("|   We rolled " + rolls + " times!       |");
				System.out.println("|     Our score is " + score + "!       |");
				System.out.println("|  Highest roll was " +highRoll+ "!       |");
				System.out.println("|   Average roll was " +avgRoll+ "!      |");
				System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
				
				
			}
			else {
			System.out.println();
			System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
			System.out.println("|       **SCORECARD**       |");
			System.out.println("|   We rolled " + rolls + " times!      |");
			System.out.println("|     Our score is " + score + "!       |");
			System.out.println("|  Highest roll was " +highRoll+ "!      |");
			System.out.println("|   Average roll was " +avgRoll+ "!     |");
			System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
			
			}
			System.out.println();
			choice = Console.getString("Play another round?     ", "y", "n");

		}
		System.out.println();
		System.out.println("Thanks for playing Pig Dice, goodbye!");
	}

	private static int rollDie() {

		return (int) (Math.random() * 6 + 1);
	}

}
