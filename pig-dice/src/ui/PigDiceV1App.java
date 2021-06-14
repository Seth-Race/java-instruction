package ui;

public class PigDiceV1App {

	public static void main(String[] args) {
		System.out.println("Welcome to Pig Dice!");
		
		// game starts here!
		int score = 0;
		int roll = 0;
		int rollCount = 0;
		while (roll!=1) {
			roll = (int)(Math.random()*6)+1;
			System.out.println("Roll = "+roll);
			score+=roll;
			rollCount++;
		}
		System.out.println("Game Over!  Score is: "+score);
		System.out.println("Roll Count:           "+rollCount);
		System.out.println("Avg Roll:             "+(score / rollCount));
		// game ends here!
		
		System.out.println("Bye");

	}

}
