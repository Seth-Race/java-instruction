package ch_05_class_demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Registration App!");
		Scanner sc = new Scanner(System.in);
		

		String fName = getNextString(sc,"Enter first name:");
		
		String lName = getNextString(sc, "Enter last name:");
		
		

		int age = getNextIntWithinRange(sc, "Enter age in years:", 1, 120);
		
		
		System.out.println("Welcome, " +fName+" "+lName+" ("+age+")");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("Goodbye!");
	}

	//new method to prompt input, use scanner to get next string
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	
	private static int getNextIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int nbr = 0;
		boolean isValid = false;
		while (!isValid) {
			nbr = getNextInt(sc, prompt);
			if (nbr < min) {
				System.out.println("Error. Input must be greater than " +min);
			}
			else if (nbr > max) {
				System.out.println("Error. Input must be less than " +max);
			}
			else {
				isValid = true;
			}
		}
				
				
				
		return nbr;
	}
	
	private static int getNextInt(Scanner sc, String prompt) {
		int nbr = 0;
		while (true){

				System.out.print(prompt);
				if (sc.hasNextInt()) {				
					nbr = sc.nextInt();
				break;
			}
				else {
					System.out.println("Invalid entry. Please enter a number.");
					//discard input
					sc.nextLine();
					sc.nextLine();
					continue;
				}
//			Try/Catch exception handling
//			try {
//				System.out.print(prompt);
//				nbr = sc.nextInt();
//				break;
//			}
//			catch (InputMismatchException ime)	{
//				System.out.println("Invalid entry. Please enter a number.");
//				//discard input
//				sc.nextLine();
//				continue;
//				}
		}
		return nbr;
	}
}
