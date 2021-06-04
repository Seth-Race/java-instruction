import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Stoplight Answers!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What color is the light? (R,Y,G) ");
		String lightColor = sc.next();

		
		boolean obstacle = true;
		boolean rightTurn = true;
		int distance = 0;
		
		if (lightColor.equalsIgnoreCase("R")) {
			System.out.println("Are you turning right? (true/false)");
			rightTurn = sc.nextBoolean();
			System.out.println("Are there any obstacles? (true/false)");
			obstacle = sc.nextBoolean();
			
			if (rightTurn == true && obstacle == false) {
				System.out.println("Go for it. Hit the gas!");
			}
				else if (rightTurn == false || obstacle == true){
					System.out.println("Don't. Stop. Do not go.");
				}
			
		}
		else if (lightColor.equalsIgnoreCase("Y")){
			System.out.println("How far from the light are you?");
			distance = sc.nextInt();
			System.out.println("Are there any obstacles? (true/false)");
			obstacle = sc.nextBoolean();
			
			if (distance >= 30 || obstacle == true){
					System.out.println("Slow down and stop. Do not go.");
			}
			else if (distance <= 30 && obstacle == false) {
					System.out.println("Go for it. Hit the gas!");
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
		
	
	
	
	sc.close();
	System.out.println("Thanks for using the Stoplight Answers app!");
	
	}

}
