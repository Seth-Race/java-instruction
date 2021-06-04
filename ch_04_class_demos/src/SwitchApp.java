import java.util.Scanner;

public class SwitchApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to the menu");
		System.out.println("You're at a crossroads...");
		System.out.println("You can go N, S, E, W");
		System.out.println("Which way will you go?");
		
		
		String direction = sc.next();
				
		switch (direction) {
			case "N":
			case "n":
				System.out.println("You chose North!");
				break;
			case "S":
			case "s":
				System.out.println("You chose South!");
				break;
			case "E":
			case "e":
				System.out.println("You chose East!");
				break;
			case "W":
			case "w":
				System.out.println("You chose West!");
				break;
			default:
				System.out.println("You chose Poorly!");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("Goodbye");

	}

}
