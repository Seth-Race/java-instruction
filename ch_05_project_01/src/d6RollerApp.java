import java.util.Scanner;

public class d6RollerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Welcome to the Casino! Dice Rolling App!");
		System.out.println("");
		String rollDice = getNextString(sc,"Want to try your luck?    ");
		

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			
			
			if (rollDice.equalsIgnoreCase("y")) {
				rollDie();
			}
			
			
			choice = getNextString(sc, "Try your luck again?   ");
		}		
		sc.close();
		System.out.println("Thanks for playing!");
	}
	
	
	
	
//                    METHODS
	
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}

	
	private static void rollDie() {
	
	int d1 = (int) (Math.random()*6+1);
	int d2 = (int) (Math.random()*6+1);
	
	System.out.println("Die 1:   " +d1);
	System.out.println("Die 2:   " +d2);
	System.out.println("Total:   " +(d1+d2));
	if (d1 == d2) {
		if (d1 == 1) {
			System.out.println("*~~~~~~~~~~~~~*");
			System.out.println("| Snake eyes! |");
			System.out.println("*~~~~~~~~~~~~~*");
		}
		else if (d1 == 6) {
			System.out.println("*~~~~~~~~~~~~~~*");
			System.out.println("|   Boxcars!   |");
			System.out.println("*~~~~~~~~~~~~~~*");
		}
		else {
			System.out.println("*~~~~~~~~~~~~~~*");
			System.out.println("|   Doubles!   |");
			System.out.println("*~~~~~~~~~~~~~~*");
			}
		}
	}
	
}





