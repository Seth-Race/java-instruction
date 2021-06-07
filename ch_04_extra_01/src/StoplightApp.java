import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while loop starts
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			
		
		System.out.println("Welcome to Stoplight Answers!");

		
		System.out.println();
		System.out.println("What color is the light? (R,Y,G) ");
		String lightColor = sc.next();

		
		boolean obstacle = true;
		boolean rightTurn = true;
		int distance = 0;
		
		if (lightColor.equalsIgnoreCase("R")) {
			System.out.println("Are you turning right? (true/false)");
			rightTurn = sc.nextBoolean();

			
			if (rightTurn == false) {
				System.out.println("Don't. Stop. Do not go.");
			}
		else if (rightTurn == true) {
			System.out.println("Are there any obstacles? (true/false)");
			obstacle = sc.nextBoolean();
			if (obstacle == true) {
				System.out.println("Don't. Stop. Do not go.");
			}
			else if (obstacle == false){
				System.out.println("Go for it. Hit the gas!");
				}
			}
		}
			
		
		else if (lightColor.equalsIgnoreCase("Y")){
			System.out.println("How far from the light are you?");
			distance = sc.nextInt();

			
			if (distance >= 30){
				System.out.println("Slow down and stop. Do not go.");
			}
			else if (distance <= 30) {
				System.out.println("Are there any obstacles? (true/false)");
				obstacle = sc.nextBoolean();
			
			if (obstacle == true) {
				System.out.println("Slow down and stop. Do not go.");
			}
			else if (obstacle == false) {
				System.out.println("Go for it. Hit the gas!");
					}			
			}	
		}


		else if (lightColor.equalsIgnoreCase("G")) {
			System.out.println("Are there any obstacles? (true/false)");
			obstacle = sc.nextBoolean();
			if (obstacle == false) {
				System.out.println("Go for it. Hit the gas!");
			}
				else {
					System.out.println("Slow down and stop. Do not go.");
				
				}
			}
		
	
		// TODO Check continue

		System.out.println();
		System.out.print("Continue? (y/n)");
		System.out.println();
		choice = sc.next();
	}
		
		sc.close();
	System.out.println("Thanks for using the Stoplight Answers app!");
	
	}

}
