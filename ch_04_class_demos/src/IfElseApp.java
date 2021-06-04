import java.util.Scanner;

public class IfElseApp {

	public static void main(String[] args) {
		//Prompt user for purchase price
		//Calc total with shipping of $5
		//Free shipping if price > $50 OR Prime Member
		
	System.out.println("Welcome to the Shop app!");
	Scanner sc = new Scanner(System.in);
	
	final double SHIPPING = 5;
	
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		System.out.println("Purchase Price: ");
		double purchasePrice = sc.nextDouble();
		System.out.println("Prime Member? (true/false): ");
		boolean prime = sc.nextBoolean();
		
		
		
		if (purchasePrice < 50) {
			if (!prime) {
				purchasePrice += SHIPPING;
			}
		}
		
		System.out.println("Total: "+purchasePrice);
		
		
		
		
		
		
		
		
		
		
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		
		}
	

	sc.close();
	System.out.println("Thanks for using the Shop app. Goodbye!");
	}

}
